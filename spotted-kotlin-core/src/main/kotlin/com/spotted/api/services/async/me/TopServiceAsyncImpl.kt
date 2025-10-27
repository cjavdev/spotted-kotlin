// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
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
import com.spotted.api.models.me.top.TopListTopArtistsPageAsync
import com.spotted.api.models.me.top.TopListTopArtistsPageResponse
import com.spotted.api.models.me.top.TopListTopArtistsParams
import com.spotted.api.models.me.top.TopListTopTracksPageAsync
import com.spotted.api.models.me.top.TopListTopTracksPageResponse
import com.spotted.api.models.me.top.TopListTopTracksParams

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
