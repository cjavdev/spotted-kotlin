// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

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
import dev.cjav.spotted.core.prepareAsync
import dev.cjav.spotted.models.me.episodes.EpisodeCheckParams
import dev.cjav.spotted.models.me.episodes.EpisodeListPageAsync
import dev.cjav.spotted.models.me.episodes.EpisodeListPageResponse
import dev.cjav.spotted.models.me.episodes.EpisodeListParams
import dev.cjav.spotted.models.me.episodes.EpisodeRemoveParams
import dev.cjav.spotted.models.me.episodes.EpisodeSaveParams

class EpisodeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EpisodeServiceAsync {

    private val withRawResponse: EpisodeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EpisodeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeServiceAsync =
        EpisodeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: EpisodeListParams,
        requestOptions: RequestOptions,
    ): EpisodeListPageAsync =
        // get /me/episodes
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun check(
        params: EpisodeCheckParams,
        requestOptions: RequestOptions,
    ): List<Boolean> =
        // get /me/episodes/contains
        withRawResponse().check(params, requestOptions).parse()

    override suspend fun remove(params: EpisodeRemoveParams, requestOptions: RequestOptions) {
        // delete /me/episodes
        withRawResponse().remove(params, requestOptions)
    }

    override suspend fun save(params: EpisodeSaveParams, requestOptions: RequestOptions) {
        // put /me/episodes
        withRawResponse().save(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EpisodeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EpisodeServiceAsync.WithRawResponse =
            EpisodeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<EpisodeListPageResponse> =
            jsonHandler<EpisodeListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: EpisodeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EpisodeListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "episodes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EpisodeListPageAsync.builder()
                            .service(EpisodeServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val checkHandler: Handler<List<Boolean>> =
            jsonHandler<List<Boolean>>(clientOptions.jsonMapper)

        override suspend fun check(
            params: EpisodeCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Boolean>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "episodes", "contains")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { checkHandler.handle(it) }
            }
        }

        private val removeHandler: Handler<Void?> = emptyHandler()

        override suspend fun remove(
            params: EpisodeRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "episodes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { removeHandler.handle(it) }
            }
        }

        private val saveHandler: Handler<Void?> = emptyHandler()

        override suspend fun save(
            params: EpisodeSaveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "episodes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { saveHandler.handle(it) }
            }
        }
    }
}
