// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.client

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.getPackageVersion
import dev.cjav.spotted.services.blocking.AlbumService
import dev.cjav.spotted.services.blocking.AlbumServiceImpl
import dev.cjav.spotted.services.blocking.ArtistService
import dev.cjav.spotted.services.blocking.ArtistServiceImpl
import dev.cjav.spotted.services.blocking.AudioAnalysisService
import dev.cjav.spotted.services.blocking.AudioAnalysisServiceImpl
import dev.cjav.spotted.services.blocking.AudioFeatureService
import dev.cjav.spotted.services.blocking.AudioFeatureServiceImpl
import dev.cjav.spotted.services.blocking.AudiobookService
import dev.cjav.spotted.services.blocking.AudiobookServiceImpl
import dev.cjav.spotted.services.blocking.BrowseService
import dev.cjav.spotted.services.blocking.BrowseServiceImpl
import dev.cjav.spotted.services.blocking.ChapterService
import dev.cjav.spotted.services.blocking.ChapterServiceImpl
import dev.cjav.spotted.services.blocking.EpisodeService
import dev.cjav.spotted.services.blocking.EpisodeServiceImpl
import dev.cjav.spotted.services.blocking.MarketService
import dev.cjav.spotted.services.blocking.MarketServiceImpl
import dev.cjav.spotted.services.blocking.MeService
import dev.cjav.spotted.services.blocking.MeServiceImpl
import dev.cjav.spotted.services.blocking.PlaylistService
import dev.cjav.spotted.services.blocking.PlaylistServiceImpl
import dev.cjav.spotted.services.blocking.RecommendationService
import dev.cjav.spotted.services.blocking.RecommendationServiceImpl
import dev.cjav.spotted.services.blocking.SearchService
import dev.cjav.spotted.services.blocking.SearchServiceImpl
import dev.cjav.spotted.services.blocking.ShowService
import dev.cjav.spotted.services.blocking.ShowServiceImpl
import dev.cjav.spotted.services.blocking.TrackService
import dev.cjav.spotted.services.blocking.TrackServiceImpl
import dev.cjav.spotted.services.blocking.UserService
import dev.cjav.spotted.services.blocking.UserServiceImpl

class SpottedClientImpl(private val clientOptions: ClientOptions) : SpottedClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: SpottedClientAsync by lazy { SpottedClientAsyncImpl(clientOptions) }

    private val withRawResponse: SpottedClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val albums: AlbumService by lazy { AlbumServiceImpl(clientOptionsWithUserAgent) }

    private val artists: ArtistService by lazy { ArtistServiceImpl(clientOptionsWithUserAgent) }

    private val shows: ShowService by lazy { ShowServiceImpl(clientOptionsWithUserAgent) }

    private val episodes: EpisodeService by lazy { EpisodeServiceImpl(clientOptionsWithUserAgent) }

    private val audiobooks: AudiobookService by lazy {
        AudiobookServiceImpl(clientOptionsWithUserAgent)
    }

    private val me: MeService by lazy { MeServiceImpl(clientOptionsWithUserAgent) }

    private val chapters: ChapterService by lazy { ChapterServiceImpl(clientOptionsWithUserAgent) }

    private val tracks: TrackService by lazy { TrackServiceImpl(clientOptionsWithUserAgent) }

    private val search: SearchService by lazy { SearchServiceImpl(clientOptionsWithUserAgent) }

    private val playlists: PlaylistService by lazy {
        PlaylistServiceImpl(clientOptionsWithUserAgent)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val browse: BrowseService by lazy { BrowseServiceImpl(clientOptionsWithUserAgent) }

    private val audioFeatures: AudioFeatureService by lazy {
        AudioFeatureServiceImpl(clientOptionsWithUserAgent)
    }

    private val audioAnalysis: AudioAnalysisService by lazy {
        AudioAnalysisServiceImpl(clientOptionsWithUserAgent)
    }

    private val recommendations: RecommendationService by lazy {
        RecommendationServiceImpl(clientOptionsWithUserAgent)
    }

    private val markets: MarketService by lazy { MarketServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): SpottedClientAsync = async

    override fun withRawResponse(): SpottedClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SpottedClient =
        SpottedClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun albums(): AlbumService = albums

    override fun artists(): ArtistService = artists

    override fun shows(): ShowService = shows

    override fun episodes(): EpisodeService = episodes

    override fun audiobooks(): AudiobookService = audiobooks

    override fun me(): MeService = me

    override fun chapters(): ChapterService = chapters

    override fun tracks(): TrackService = tracks

    override fun search(): SearchService = search

    override fun playlists(): PlaylistService = playlists

    override fun users(): UserService = users

    override fun browse(): BrowseService = browse

    override fun audioFeatures(): AudioFeatureService = audioFeatures

    override fun audioAnalysis(): AudioAnalysisService = audioAnalysis

    override fun recommendations(): RecommendationService = recommendations

    override fun markets(): MarketService = markets

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpottedClient.WithRawResponse {

        private val albums: AlbumService.WithRawResponse by lazy {
            AlbumServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val artists: ArtistService.WithRawResponse by lazy {
            ArtistServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val shows: ShowService.WithRawResponse by lazy {
            ShowServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val episodes: EpisodeService.WithRawResponse by lazy {
            EpisodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val audiobooks: AudiobookService.WithRawResponse by lazy {
            AudiobookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val me: MeService.WithRawResponse by lazy {
            MeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chapters: ChapterService.WithRawResponse by lazy {
            ChapterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tracks: TrackService.WithRawResponse by lazy {
            TrackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchService.WithRawResponse by lazy {
            SearchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val playlists: PlaylistService.WithRawResponse by lazy {
            PlaylistServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val browse: BrowseService.WithRawResponse by lazy {
            BrowseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val audioFeatures: AudioFeatureService.WithRawResponse by lazy {
            AudioFeatureServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val audioAnalysis: AudioAnalysisService.WithRawResponse by lazy {
            AudioAnalysisServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val recommendations: RecommendationService.WithRawResponse by lazy {
            RecommendationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val markets: MarketService.WithRawResponse by lazy {
            MarketServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SpottedClient.WithRawResponse =
            SpottedClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun albums(): AlbumService.WithRawResponse = albums

        override fun artists(): ArtistService.WithRawResponse = artists

        override fun shows(): ShowService.WithRawResponse = shows

        override fun episodes(): EpisodeService.WithRawResponse = episodes

        override fun audiobooks(): AudiobookService.WithRawResponse = audiobooks

        override fun me(): MeService.WithRawResponse = me

        override fun chapters(): ChapterService.WithRawResponse = chapters

        override fun tracks(): TrackService.WithRawResponse = tracks

        override fun search(): SearchService.WithRawResponse = search

        override fun playlists(): PlaylistService.WithRawResponse = playlists

        override fun users(): UserService.WithRawResponse = users

        override fun browse(): BrowseService.WithRawResponse = browse

        override fun audioFeatures(): AudioFeatureService.WithRawResponse = audioFeatures

        override fun audioAnalysis(): AudioAnalysisService.WithRawResponse = audioAnalysis

        override fun recommendations(): RecommendationService.WithRawResponse = recommendations

        override fun markets(): MarketService.WithRawResponse = markets
    }
}
