// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

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
import com.spotted.api.models.me.MeRetrieveParams
import com.spotted.api.models.me.MeRetrieveResponse
import com.spotted.api.services.async.me.AlbumServiceAsync
import com.spotted.api.services.async.me.AlbumServiceAsyncImpl
import com.spotted.api.services.async.me.AudiobookServiceAsync
import com.spotted.api.services.async.me.AudiobookServiceAsyncImpl
import com.spotted.api.services.async.me.EpisodeServiceAsync
import com.spotted.api.services.async.me.EpisodeServiceAsyncImpl
import com.spotted.api.services.async.me.FollowingServiceAsync
import com.spotted.api.services.async.me.FollowingServiceAsyncImpl
import com.spotted.api.services.async.me.PlayerServiceAsync
import com.spotted.api.services.async.me.PlayerServiceAsyncImpl
import com.spotted.api.services.async.me.PlaylistServiceAsync
import com.spotted.api.services.async.me.PlaylistServiceAsyncImpl
import com.spotted.api.services.async.me.ShowServiceAsync
import com.spotted.api.services.async.me.ShowServiceAsyncImpl
import com.spotted.api.services.async.me.TopServiceAsync
import com.spotted.api.services.async.me.TopServiceAsyncImpl
import com.spotted.api.services.async.me.TrackServiceAsync
import com.spotted.api.services.async.me.TrackServiceAsyncImpl

class MeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeServiceAsync {

    private val withRawResponse: MeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val audiobooks: AudiobookServiceAsync by lazy {
        AudiobookServiceAsyncImpl(clientOptions)
    }

    private val playlists: PlaylistServiceAsync by lazy { PlaylistServiceAsyncImpl(clientOptions) }

    private val top: TopServiceAsync by lazy { TopServiceAsyncImpl(clientOptions) }

    private val albums: AlbumServiceAsync by lazy { AlbumServiceAsyncImpl(clientOptions) }

    private val tracks: TrackServiceAsync by lazy { TrackServiceAsyncImpl(clientOptions) }

    private val episodes: EpisodeServiceAsync by lazy { EpisodeServiceAsyncImpl(clientOptions) }

    private val shows: ShowServiceAsync by lazy { ShowServiceAsyncImpl(clientOptions) }

    private val following: FollowingServiceAsync by lazy {
        FollowingServiceAsyncImpl(clientOptions)
    }

    private val player: PlayerServiceAsync by lazy { PlayerServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeServiceAsync =
        MeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun audiobooks(): AudiobookServiceAsync = audiobooks

    override fun playlists(): PlaylistServiceAsync = playlists

    override fun top(): TopServiceAsync = top

    override fun albums(): AlbumServiceAsync = albums

    override fun tracks(): TrackServiceAsync = tracks

    override fun episodes(): EpisodeServiceAsync = episodes

    override fun shows(): ShowServiceAsync = shows

    override fun following(): FollowingServiceAsync = following

    override fun player(): PlayerServiceAsync = player

    override suspend fun retrieve(
        params: MeRetrieveParams,
        requestOptions: RequestOptions,
    ): MeRetrieveResponse =
        // get /me
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val audiobooks: AudiobookServiceAsync.WithRawResponse by lazy {
            AudiobookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val playlists: PlaylistServiceAsync.WithRawResponse by lazy {
            PlaylistServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val top: TopServiceAsync.WithRawResponse by lazy {
            TopServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val albums: AlbumServiceAsync.WithRawResponse by lazy {
            AlbumServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tracks: TrackServiceAsync.WithRawResponse by lazy {
            TrackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val episodes: EpisodeServiceAsync.WithRawResponse by lazy {
            EpisodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val shows: ShowServiceAsync.WithRawResponse by lazy {
            ShowServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val following: FollowingServiceAsync.WithRawResponse by lazy {
            FollowingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val player: PlayerServiceAsync.WithRawResponse by lazy {
            PlayerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MeServiceAsync.WithRawResponse =
            MeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun audiobooks(): AudiobookServiceAsync.WithRawResponse = audiobooks

        override fun playlists(): PlaylistServiceAsync.WithRawResponse = playlists

        override fun top(): TopServiceAsync.WithRawResponse = top

        override fun albums(): AlbumServiceAsync.WithRawResponse = albums

        override fun tracks(): TrackServiceAsync.WithRawResponse = tracks

        override fun episodes(): EpisodeServiceAsync.WithRawResponse = episodes

        override fun shows(): ShowServiceAsync.WithRawResponse = shows

        override fun following(): FollowingServiceAsync.WithRawResponse = following

        override fun player(): PlayerServiceAsync.WithRawResponse = player

        private val retrieveHandler: Handler<MeRetrieveResponse> =
            jsonHandler<MeRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: MeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me")
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
    }
}
