// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.me

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
import com.spotted.api.core.prepare
import com.spotted.api.models.me.top.TopListTopArtistsPage
import com.spotted.api.models.me.top.TopListTopArtistsPageResponse
import com.spotted.api.models.me.top.TopListTopArtistsParams
import com.spotted.api.models.me.top.TopListTopTracksPage
import com.spotted.api.models.me.top.TopListTopTracksPageResponse
import com.spotted.api.models.me.top.TopListTopTracksParams

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
