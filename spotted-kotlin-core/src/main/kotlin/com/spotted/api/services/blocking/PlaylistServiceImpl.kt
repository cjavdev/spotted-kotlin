// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.checkRequired
import com.spotted.api.core.handlers.emptyHandler
import com.spotted.api.core.handlers.errorBodyHandler
import com.spotted.api.core.handlers.errorHandler
import com.spotted.api.core.handlers.jsonHandler
import com.spotted.api.core.http.HttpMethod
import com.spotted.api.core.http.HttpRequest
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponse.Handler
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.core.http.json
import com.spotted.api.core.http.parseable
import com.spotted.api.core.prepare
import com.spotted.api.models.playlists.PlaylistRetrieveParams
import com.spotted.api.models.playlists.PlaylistRetrieveResponse
import com.spotted.api.models.playlists.PlaylistUpdateParams
import com.spotted.api.services.blocking.playlists.FollowerService
import com.spotted.api.services.blocking.playlists.FollowerServiceImpl
import com.spotted.api.services.blocking.playlists.ImageService
import com.spotted.api.services.blocking.playlists.ImageServiceImpl
import com.spotted.api.services.blocking.playlists.TrackService
import com.spotted.api.services.blocking.playlists.TrackServiceImpl

class PlaylistServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlaylistService {

    private val withRawResponse: PlaylistService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tracks: TrackService by lazy { TrackServiceImpl(clientOptions) }

    private val followers: FollowerService by lazy { FollowerServiceImpl(clientOptions) }

    private val images: ImageService by lazy { ImageServiceImpl(clientOptions) }

    override fun withRawResponse(): PlaylistService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaylistService =
        PlaylistServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun tracks(): TrackService = tracks

    override fun followers(): FollowerService = followers

    override fun images(): ImageService = images

    override fun retrieve(
        params: PlaylistRetrieveParams,
        requestOptions: RequestOptions,
    ): PlaylistRetrieveResponse =
        // get /playlists/{playlist_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: PlaylistUpdateParams, requestOptions: RequestOptions) {
        // put /playlists/{playlist_id}
        withRawResponse().update(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaylistService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tracks: TrackService.WithRawResponse by lazy {
            TrackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val followers: FollowerService.WithRawResponse by lazy {
            FollowerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val images: ImageService.WithRawResponse by lazy {
            ImageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlaylistService.WithRawResponse =
            PlaylistServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun tracks(): TrackService.WithRawResponse = tracks

        override fun followers(): FollowerService.WithRawResponse = followers

        override fun images(): ImageService.WithRawResponse = images

        private val retrieveHandler: Handler<PlaylistRetrieveResponse> =
            jsonHandler<PlaylistRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PlaylistRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaylistRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: PlaylistUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playlistId", params.playlistId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("playlists", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }
    }
}
