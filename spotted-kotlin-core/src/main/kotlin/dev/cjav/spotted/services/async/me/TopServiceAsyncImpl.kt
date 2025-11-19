// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

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
import dev.cjav.spotted.core.prepareAsync
import dev.cjav.spotted.models.me.top.TopListTopArtistsPageAsync
import dev.cjav.spotted.models.me.top.TopListTopArtistsPageResponse
import dev.cjav.spotted.models.me.top.TopListTopArtistsParams
import dev.cjav.spotted.models.me.top.TopListTopTracksPageAsync
import dev.cjav.spotted.models.me.top.TopListTopTracksPageResponse
import dev.cjav.spotted.models.me.top.TopListTopTracksParams

class TopServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TopServiceAsync {

    private val withRawResponse: TopServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TopServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopServiceAsync =
        TopServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun listTopArtists(
        params: TopListTopArtistsParams,
        requestOptions: RequestOptions,
    ): TopListTopArtistsPageAsync =
        // get /me/top/artists
        withRawResponse().listTopArtists(params, requestOptions).parse()

    override suspend fun listTopTracks(
        params: TopListTopTracksParams,
        requestOptions: RequestOptions,
    ): TopListTopTracksPageAsync =
        // get /me/top/tracks
        withRawResponse().listTopTracks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TopServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TopServiceAsync.WithRawResponse =
            TopServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listTopArtistsHandler: Handler<TopListTopArtistsPageResponse> =
            jsonHandler<TopListTopArtistsPageResponse>(clientOptions.jsonMapper)

        override suspend fun listTopArtists(
            params: TopListTopArtistsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TopListTopArtistsPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "top", "artists")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTopArtistsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TopListTopArtistsPageAsync.builder()
                            .service(TopServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listTopTracksHandler: Handler<TopListTopTracksPageResponse> =
            jsonHandler<TopListTopTracksPageResponse>(clientOptions.jsonMapper)

        override suspend fun listTopTracks(
            params: TopListTopTracksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TopListTopTracksPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "top", "tracks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTopTracksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TopListTopTracksPageAsync.builder()
                            .service(TopServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
