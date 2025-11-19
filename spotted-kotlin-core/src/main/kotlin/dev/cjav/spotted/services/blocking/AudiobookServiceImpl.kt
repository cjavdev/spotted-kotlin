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
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveResponse
import dev.cjav.spotted.models.audiobooks.AudiobookListChaptersPage
import dev.cjav.spotted.models.audiobooks.AudiobookListChaptersPageResponse
import dev.cjav.spotted.models.audiobooks.AudiobookListChaptersParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveResponse

class AudiobookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AudiobookService {

    private val withRawResponse: AudiobookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudiobookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudiobookService =
        AudiobookServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: AudiobookRetrieveParams,
        requestOptions: RequestOptions,
    ): AudiobookRetrieveResponse =
        // get /audiobooks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun bulkRetrieve(
        params: AudiobookBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): AudiobookBulkRetrieveResponse =
        // get /audiobooks
        withRawResponse().bulkRetrieve(params, requestOptions).parse()

    override fun listChapters(
        params: AudiobookListChaptersParams,
        requestOptions: RequestOptions,
    ): AudiobookListChaptersPage =
        // get /audiobooks/{id}/chapters
        withRawResponse().listChapters(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudiobookService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudiobookService.WithRawResponse =
            AudiobookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<AudiobookRetrieveResponse> =
            jsonHandler<AudiobookRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val bulkRetrieveHandler: Handler<AudiobookBulkRetrieveResponse> =
            jsonHandler<AudiobookBulkRetrieveResponse>(clientOptions.jsonMapper)

        override fun bulkRetrieve(
            params: AudiobookBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookBulkRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiobooks")
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

        private val listChaptersHandler: Handler<AudiobookListChaptersPageResponse> =
            jsonHandler<AudiobookListChaptersPageResponse>(clientOptions.jsonMapper)

        override fun listChapters(
            params: AudiobookListChaptersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookListChaptersPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiobooks", params._pathParam(0), "chapters")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listChaptersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AudiobookListChaptersPage.builder()
                            .service(AudiobookServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
