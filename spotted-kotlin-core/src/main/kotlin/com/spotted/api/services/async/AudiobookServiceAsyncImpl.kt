// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

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
import com.spotted.api.core.prepareAsync
import com.spotted.api.models.audiobooks.AudiobookBulkRetrieveParams
import com.spotted.api.models.audiobooks.AudiobookBulkRetrieveResponse
import com.spotted.api.models.audiobooks.AudiobookListChaptersPageAsync
import com.spotted.api.models.audiobooks.AudiobookListChaptersPageResponse
import com.spotted.api.models.audiobooks.AudiobookListChaptersParams
import com.spotted.api.models.audiobooks.AudiobookRetrieveParams
import com.spotted.api.models.audiobooks.AudiobookRetrieveResponse

class AudiobookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AudiobookServiceAsync {

    private val withRawResponse: AudiobookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudiobookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudiobookServiceAsync =
        AudiobookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: AudiobookRetrieveParams,
        requestOptions: RequestOptions,
    ): AudiobookRetrieveResponse =
        // get /audiobooks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun bulkRetrieve(
        params: AudiobookBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): AudiobookBulkRetrieveResponse =
        // get /audiobooks
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

    override suspend fun listChapters(
        params: AudiobookListChaptersParams,
        requestOptions: RequestOptions,
    ): AudiobookListChaptersPageAsync =
        // get /audiobooks/{id}/chapters
        withRawResponse().listChapters(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudiobookServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudiobookServiceAsync.WithRawResponse =
            AudiobookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<AudiobookRetrieveResponse> =
            jsonHandler<AudiobookRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AudiobookRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiobooks", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val bulkRetrieveHandler: Handler<AudiobookBulkRetrieveResponse> =
            jsonHandler<AudiobookBulkRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun bulkRetrieve(
            params: AudiobookBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookBulkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiobooks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listChaptersHandler: Handler<AudiobookListChaptersPageResponse> =
            jsonHandler<AudiobookListChaptersPageResponse>(clientOptions.jsonMapper)

        override suspend fun listChapters(
            params: AudiobookListChaptersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookListChaptersPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiobooks", params._pathParam(0), "chapters")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listChaptersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AudiobookListChaptersPageAsync.builder()
                            .service(AudiobookServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
