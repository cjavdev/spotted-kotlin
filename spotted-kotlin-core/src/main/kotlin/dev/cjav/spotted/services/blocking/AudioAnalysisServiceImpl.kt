// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.core.handlers.errorBodyHandler
import dev.cjav.spotted.core.handlers.errorHandler
import dev.cjav.spotted.core.handlers.jsonHandler
import dev.cjav.spotted.core.http.HttpMethod
import dev.cjav.spotted.core.http.HttpRequest
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponse.Handler
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.core.http.parseable
import dev.cjav.spotted.core.prepare
import dev.cjav.spotted.models.audioanalysis.AudioAnalysisRetrieveParams
import dev.cjav.spotted.models.audioanalysis.AudioAnalysisRetrieveResponse

class AudioAnalysisServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AudioAnalysisService {

    private val withRawResponse: AudioAnalysisService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudioAnalysisService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioAnalysisService =
        AudioAnalysisServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    @Deprecated("deprecated")
    override fun retrieve(
        params: AudioAnalysisRetrieveParams,
        requestOptions: RequestOptions,
    ): AudioAnalysisRetrieveResponse =
        // get /audio-analysis/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudioAnalysisService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudioAnalysisService.WithRawResponse =
            AudioAnalysisServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<AudioAnalysisRetrieveResponse> =
            jsonHandler<AudioAnalysisRetrieveResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun retrieve(
            params: AudioAnalysisRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudioAnalysisRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audio-analysis", params._pathParam(0))
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
    }
}
