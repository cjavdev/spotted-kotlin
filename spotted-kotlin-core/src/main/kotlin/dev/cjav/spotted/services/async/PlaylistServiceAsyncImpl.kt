// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.checkRequired
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
import dev.cjav.spotted.models.playlists.PlaylistRetrieveParams
import dev.cjav.spotted.models.playlists.PlaylistRetrieveResponse
import dev.cjav.spotted.models.playlists.PlaylistUpdateParams
import dev.cjav.spotted.services.async.playlists.FollowerServiceAsync
import dev.cjav.spotted.services.async.playlists.FollowerServiceAsyncImpl
import dev.cjav.spotted.services.async.playlists.ImageServiceAsync
import dev.cjav.spotted.services.async.playlists.ImageServiceAsyncImpl
import dev.cjav.spotted.services.async.playlists.TrackServiceAsync
import dev.cjav.spotted.services.async.playlists.TrackServiceAsyncImpl

class PlaylistServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlaylistServiceAsync {

    private val withRawResponse: PlaylistServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tracks: TrackServiceAsync by lazy { TrackServiceAsyncImpl(clientOptions) }

    private val followers: FollowerServiceAsync by lazy { FollowerServiceAsyncImpl(clientOptions) }

    private val images: ImageServiceAsync by lazy { ImageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PlaylistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaylistServiceAsync =
        PlaylistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun tracks(): TrackServiceAsync = tracks

    override fun followers(): FollowerServiceAsync = followers

    override fun images(): ImageServiceAsync = images

    override suspend fun retrieve(
        params: PlaylistRetrieveParams,
        requestOptions: RequestOptions,
    ): PlaylistRetrieveResponse =
        // get /playlists/{playlist_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: PlaylistUpdateParams, requestOptions: RequestOptions) {
        // put /playlists/{playlist_id}
        withRawResponse().update(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaylistServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tracks: TrackServiceAsync.WithRawResponse by lazy {
            TrackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val followers: FollowerServiceAsync.WithRawResponse by lazy {
            FollowerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val images: ImageServiceAsync.WithRawResponse by lazy {
            ImageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlaylistServiceAsync.WithRawResponse =
            PlaylistServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun tracks(): TrackServiceAsync.WithRawResponse = tracks

        override fun followers(): FollowerServiceAsync.WithRawResponse = followers

        override fun images(): ImageServiceAsync.WithRawResponse = images

        private val retrieveHandler: Handler<PlaylistRetrieveResponse> =
            jsonHandler<PlaylistRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun update(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }
    }
}
