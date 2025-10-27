// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

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
import com.spotted.api.models.me.MeRetrieveParams
import com.spotted.api.models.me.MeRetrieveResponse
import com.spotted.api.services.blocking.me.AlbumService
import com.spotted.api.services.blocking.me.AlbumServiceImpl
import com.spotted.api.services.blocking.me.AudiobookService
import com.spotted.api.services.blocking.me.AudiobookServiceImpl
import com.spotted.api.services.blocking.me.EpisodeService
import com.spotted.api.services.blocking.me.EpisodeServiceImpl
import com.spotted.api.services.blocking.me.FollowingService
import com.spotted.api.services.blocking.me.FollowingServiceImpl
import com.spotted.api.services.blocking.me.PlayerService
import com.spotted.api.services.blocking.me.PlayerServiceImpl
import com.spotted.api.services.blocking.me.PlaylistService
import com.spotted.api.services.blocking.me.PlaylistServiceImpl
import com.spotted.api.services.blocking.me.ShowService
import com.spotted.api.services.blocking.me.ShowServiceImpl
import com.spotted.api.services.blocking.me.TopService
import com.spotted.api.services.blocking.me.TopServiceImpl
import com.spotted.api.services.blocking.me.TrackService
import com.spotted.api.services.blocking.me.TrackServiceImpl

class MeServiceImpl internal constructor(private val clientOptions: ClientOptions) : MeService {

    private val withRawResponse: MeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val audiobooks: AudiobookService by lazy { AudiobookServiceImpl(clientOptions) }

    private val playlists: PlaylistService by lazy { PlaylistServiceImpl(clientOptions) }

    private val top: TopService by lazy { TopServiceImpl(clientOptions) }

    private val albums: AlbumService by lazy { AlbumServiceImpl(clientOptions) }

    private val tracks: TrackService by lazy { TrackServiceImpl(clientOptions) }

    private val episodes: EpisodeService by lazy { EpisodeServiceImpl(clientOptions) }

    private val shows: ShowService by lazy { ShowServiceImpl(clientOptions) }

    private val following: FollowingService by lazy { FollowingServiceImpl(clientOptions) }

    private val player: PlayerService by lazy { PlayerServiceImpl(clientOptions) }

    override fun withRawResponse(): MeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeService =
        MeServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun audiobooks(): AudiobookService = audiobooks

    override fun playlists(): PlaylistService = playlists

    override fun top(): TopService = top

    override fun albums(): AlbumService = albums

    override fun tracks(): TrackService = tracks

    override fun episodes(): EpisodeService = episodes

    override fun shows(): ShowService = shows

    override fun following(): FollowingService = following

    override fun player(): PlayerService = player

    override fun retrieve(
        params: MeRetrieveParams,
        requestOptions: RequestOptions,
    ): MeRetrieveResponse =
        // get /me
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val audiobooks: AudiobookService.WithRawResponse by lazy {
            AudiobookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val playlists: PlaylistService.WithRawResponse by lazy {
            PlaylistServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val top: TopService.WithRawResponse by lazy {
            TopServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val albums: AlbumService.WithRawResponse by lazy {
            AlbumServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tracks: TrackService.WithRawResponse by lazy {
            TrackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val episodes: EpisodeService.WithRawResponse by lazy {
            EpisodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val shows: ShowService.WithRawResponse by lazy {
            ShowServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val following: FollowingService.WithRawResponse by lazy {
            FollowingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val player: PlayerService.WithRawResponse by lazy {
            PlayerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MeService.WithRawResponse =
            MeServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun audiobooks(): AudiobookService.WithRawResponse = audiobooks

        override fun playlists(): PlaylistService.WithRawResponse = playlists

        override fun top(): TopService.WithRawResponse = top

        override fun albums(): AlbumService.WithRawResponse = albums

        override fun tracks(): TrackService.WithRawResponse = tracks

        override fun episodes(): EpisodeService.WithRawResponse = episodes

        override fun shows(): ShowService.WithRawResponse = shows

        override fun following(): FollowingService.WithRawResponse = following

        override fun player(): PlayerService.WithRawResponse = player

        private val retrieveHandler: Handler<MeRetrieveResponse> =
            jsonHandler<MeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me")
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
    }
}
