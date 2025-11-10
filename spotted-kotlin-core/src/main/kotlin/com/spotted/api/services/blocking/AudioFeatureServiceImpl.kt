// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.checkRequired
import com.spotted.api.core.handlers.errorBodyHandler
import com.spotted.api.core.handlers.errorHandler
import com.spotted.api.core.handlers.jsonHandler
import com.spotted.api.core.http.HttpMethod
import com.spotted.api.core.http.HttpRequest
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponse.Handler
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.core.http.parseable
import com.spotted.api.core.prepare
import com.spotted.api.models.audiofeatures.AudioFeatureBulkRetrieveParams
import com.spotted.api.models.audiofeatures.AudioFeatureBulkRetrieveResponse
import com.spotted.api.models.audiofeatures.AudioFeatureRetrieveParams
import com.spotted.api.models.audiofeatures.AudioFeatureRetrieveResponse

class AudioFeatureServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AudioFeatureService {

    private val withRawResponse: AudioFeatureService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudioFeatureService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioFeatureService =
        AudioFeatureServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    @Deprecated("deprecated")
    override fun retrieve(
        params: AudioFeatureRetrieveParams,
        requestOptions: RequestOptions,
    ): AudioFeatureRetrieveResponse =
        // get /audio-features/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun bulkRetrieve(
        params: AudioFeatureBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): AudioFeatureBulkRetrieveResponse =
        // get /audio-features
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudioFeatureService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudioFeatureService.WithRawResponse =
            AudioFeatureServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<AudioFeatureRetrieveResponse> =
            jsonHandler<AudioFeatureRetrieveResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun retrieve(
            params: AudioFeatureRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudioFeatureRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audio-features", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val bulkRetrieveHandler: Handler<AudioFeatureBulkRetrieveResponse> =
            jsonHandler<AudioFeatureBulkRetrieveResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun bulkRetrieve(
            params: AudioFeatureBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudioFeatureBulkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audio-features")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bulkRetrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
