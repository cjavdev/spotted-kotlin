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
import dev.cjav.spotted.models.me.episodes.EpisodeCheckParams
import dev.cjav.spotted.models.me.episodes.EpisodeListPage
import dev.cjav.spotted.models.me.episodes.EpisodeListPageResponse
import dev.cjav.spotted.models.me.episodes.EpisodeListParams
import dev.cjav.spotted.models.me.episodes.EpisodeRemoveParams
import dev.cjav.spotted.models.me.episodes.EpisodeSaveParams

class EpisodeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EpisodeService {

    private val withRawResponse: EpisodeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EpisodeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeService =
        EpisodeServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(params: EpisodeListParams, requestOptions: RequestOptions): EpisodeListPage =
        // get /me/episodes
        withRawResponse().list(params, requestOptions).parse()

    override fun check(params: EpisodeCheckParams, requestOptions: RequestOptions): List<Boolean> =
        // get /me/episodes/contains
        withRawResponse().check(params, requestOptions).parse()

    override fun remove(params: EpisodeRemoveParams, requestOptions: RequestOptions) {
        // delete /me/episodes
        withRawResponse().remove(params, requestOptions)
    }

    override fun save(params: EpisodeSaveParams, requestOptions: RequestOptions) {
        // put /me/episodes
        withRawResponse().save(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EpisodeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EpisodeService.WithRawResponse =
            EpisodeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<EpisodeListPageResponse> =
            jsonHandler<EpisodeListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EpisodeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EpisodeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "episodes")
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
                        EpisodeListPage.builder()
                            .service(EpisodeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val checkHandler: Handler<List<Boolean>> =
            jsonHandler<List<Boolean>>(clientOptions.jsonMapper)

        override fun check(
            params: EpisodeCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Boolean>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "episodes", "contains")
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { removeHandler.handle(it) }
            }
        }

        private val saveHandler: Handler<Void?> = emptyHandler()

        override fun save(params: EpisodeSaveParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "episodes")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
