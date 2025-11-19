// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

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
import dev.cjav.spotted.models.me.MeRetrieveParams
import dev.cjav.spotted.models.me.MeRetrieveResponse
import dev.cjav.spotted.services.async.me.AlbumServiceAsync
import dev.cjav.spotted.services.async.me.AlbumServiceAsyncImpl
import dev.cjav.spotted.services.async.me.AudiobookServiceAsync
import dev.cjav.spotted.services.async.me.AudiobookServiceAsyncImpl
import dev.cjav.spotted.services.async.me.EpisodeServiceAsync
import dev.cjav.spotted.services.async.me.EpisodeServiceAsyncImpl
import dev.cjav.spotted.services.async.me.FollowingServiceAsync
import dev.cjav.spotted.services.async.me.FollowingServiceAsyncImpl
import dev.cjav.spotted.services.async.me.PlayerServiceAsync
import dev.cjav.spotted.services.async.me.PlayerServiceAsyncImpl
import dev.cjav.spotted.services.async.me.PlaylistServiceAsync
import dev.cjav.spotted.services.async.me.PlaylistServiceAsyncImpl
import dev.cjav.spotted.services.async.me.ShowServiceAsync
import dev.cjav.spotted.services.async.me.ShowServiceAsyncImpl
import dev.cjav.spotted.services.async.me.TopServiceAsync
import dev.cjav.spotted.services.async.me.TopServiceAsyncImpl
import dev.cjav.spotted.services.async.me.TrackServiceAsync
import dev.cjav.spotted.services.async.me.TrackServiceAsyncImpl

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
