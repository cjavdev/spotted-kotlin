// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

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
import dev.cjav.spotted.models.me.MeRetrieveParams
import dev.cjav.spotted.models.me.MeRetrieveResponse
import dev.cjav.spotted.services.blocking.me.AlbumService
import dev.cjav.spotted.services.blocking.me.AlbumServiceImpl
import dev.cjav.spotted.services.blocking.me.AudiobookService
import dev.cjav.spotted.services.blocking.me.AudiobookServiceImpl
import dev.cjav.spotted.services.blocking.me.EpisodeService
import dev.cjav.spotted.services.blocking.me.EpisodeServiceImpl
import dev.cjav.spotted.services.blocking.me.FollowingService
import dev.cjav.spotted.services.blocking.me.FollowingServiceImpl
import dev.cjav.spotted.services.blocking.me.PlayerService
import dev.cjav.spotted.services.blocking.me.PlayerServiceImpl
import dev.cjav.spotted.services.blocking.me.PlaylistService
import dev.cjav.spotted.services.blocking.me.PlaylistServiceImpl
import dev.cjav.spotted.services.blocking.me.ShowService
import dev.cjav.spotted.services.blocking.me.ShowServiceImpl
import dev.cjav.spotted.services.blocking.me.TopService
import dev.cjav.spotted.services.blocking.me.TopServiceImpl
import dev.cjav.spotted.services.blocking.me.TrackService
import dev.cjav.spotted.services.blocking.me.TrackServiceImpl

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
