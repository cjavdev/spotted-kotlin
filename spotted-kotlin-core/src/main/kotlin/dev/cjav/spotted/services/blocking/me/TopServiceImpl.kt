// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
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
import dev.cjav.spotted.models.me.top.TopListTopArtistsPage
import dev.cjav.spotted.models.me.top.TopListTopArtistsPageResponse
import dev.cjav.spotted.models.me.top.TopListTopArtistsParams
import dev.cjav.spotted.models.me.top.TopListTopTracksPage
import dev.cjav.spotted.models.me.top.TopListTopTracksPageResponse
import dev.cjav.spotted.models.me.top.TopListTopTracksParams

class TopServiceImpl internal constructor(private val clientOptions: ClientOptions) : TopService {

    private val withRawResponse: TopService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TopService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopService =
        TopServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun listTopArtists(
        params: TopListTopArtistsParams,
        requestOptions: RequestOptions,
    ): TopListTopArtistsPage =
        // get /me/top/artists
        withRawResponse().listTopArtists(params, requestOptions).parse()

    override fun listTopTracks(
        params: TopListTopTracksParams,
        requestOptions: RequestOptions,
    ): TopListTopTracksPage =
        // get /me/top/tracks
        withRawResponse().listTopTracks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TopService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TopService.WithRawResponse =
            TopServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val listTopArtistsHandler: Handler<TopListTopArtistsPageResponse> =
            jsonHandler<TopListTopArtistsPageResponse>(clientOptions.jsonMapper)

        override fun listTopArtists(
            params: TopListTopArtistsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TopListTopArtistsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "top", "artists")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTopArtistsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TopListTopArtistsPage.builder()
                            .service(TopServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listTopTracksHandler: Handler<TopListTopTracksPageResponse> =
            jsonHandler<TopListTopTracksPageResponse>(clientOptions.jsonMapper)

        override fun listTopTracks(
            params: TopListTopTracksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TopListTopTracksPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "top", "tracks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTopTracksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TopListTopTracksPage.builder()
                            .service(TopServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
