// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.handlers.emptyHandler
import dev.cjav.spotted.core.handlers.errorBodyHandler
import dev.cjav.spotted.core.handlers.errorHandler
import dev.cjav.spotted.core.handlers.jsonHandler
import dev.cjav.spotted.core.http.HttpMethod
import dev.cjav.spotted.core.http.HttpRequest
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponse.Handler
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.core.http.json
import dev.cjav.spotted.core.http.parseable
import dev.cjav.spotted.core.prepare
import dev.cjav.spotted.models.me.audiobooks.AudiobookCheckParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookListPage
import dev.cjav.spotted.models.me.audiobooks.AudiobookListPageResponse
import dev.cjav.spotted.models.me.audiobooks.AudiobookListParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookRemoveParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookSaveParams

class AudiobookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AudiobookService {

    private val withRawResponse: AudiobookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudiobookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudiobookService =
        AudiobookServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(
        params: AudiobookListParams,
        requestOptions: RequestOptions,
    ): AudiobookListPage =
        // get /me/audiobooks
        withRawResponse().list(params, requestOptions).parse()

    override fun check(
        params: AudiobookCheckParams,
        requestOptions: RequestOptions,
    ): List<Boolean> =
        // get /me/audiobooks/contains
        withRawResponse().check(params, requestOptions).parse()

    override fun remove(params: AudiobookRemoveParams, requestOptions: RequestOptions) {
        // delete /me/audiobooks
        withRawResponse().remove(params, requestOptions)
    }

    override fun save(params: AudiobookSaveParams, requestOptions: RequestOptions) {
        // put /me/audiobooks
        withRawResponse().save(params, requestOptions)
    }

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

        private val listHandler: Handler<AudiobookListPageResponse> =
            jsonHandler<AudiobookListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AudiobookListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "audiobooks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AudiobookListPage.builder()
                            .service(AudiobookServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val checkHandler: Handler<List<Boolean>> =
            jsonHandler<List<Boolean>>(clientOptions.jsonMapper)

        override fun check(
            params: AudiobookCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Boolean>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "audiobooks", "contains")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { checkHandler.handle(it) }
            }
        }

        private val removeHandler: Handler<Void?> = emptyHandler()

        override fun remove(
            params: AudiobookRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "audiobooks")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { removeHandler.handle(it) }
            }
        }

        private val saveHandler: Handler<Void?> = emptyHandler()

        override fun save(
            params: AudiobookSaveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "audiobooks")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { saveHandler.handle(it) }
            }
        }
    }
}
