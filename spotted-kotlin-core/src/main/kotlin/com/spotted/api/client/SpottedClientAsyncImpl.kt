// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.client

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.getPackageVersion
import com.spotted.api.services.async.AlbumServiceAsync
import com.spotted.api.services.async.AlbumServiceAsyncImpl
import com.spotted.api.services.async.ArtistServiceAsync
import com.spotted.api.services.async.ArtistServiceAsyncImpl
import com.spotted.api.services.async.AudioAnalysisServiceAsync
import com.spotted.api.services.async.AudioAnalysisServiceAsyncImpl
import com.spotted.api.services.async.AudioFeatureServiceAsync
import com.spotted.api.services.async.AudioFeatureServiceAsyncImpl
import com.spotted.api.services.async.AudiobookServiceAsync
import com.spotted.api.services.async.AudiobookServiceAsyncImpl
import com.spotted.api.services.async.BrowseServiceAsync
import com.spotted.api.services.async.BrowseServiceAsyncImpl
import com.spotted.api.services.async.ChapterServiceAsync
import com.spotted.api.services.async.ChapterServiceAsyncImpl
import com.spotted.api.services.async.EpisodeServiceAsync
import com.spotted.api.services.async.EpisodeServiceAsyncImpl
import com.spotted.api.services.async.MarketServiceAsync
import com.spotted.api.services.async.MarketServiceAsyncImpl
import com.spotted.api.services.async.MeServiceAsync
import com.spotted.api.services.async.MeServiceAsyncImpl
import com.spotted.api.services.async.PlaylistServiceAsync
import com.spotted.api.services.async.PlaylistServiceAsyncImpl
import com.spotted.api.services.async.RecommendationServiceAsync
import com.spotted.api.services.async.RecommendationServiceAsyncImpl
import com.spotted.api.services.async.SearchServiceAsync
import com.spotted.api.services.async.SearchServiceAsyncImpl
import com.spotted.api.services.async.ShowServiceAsync
import com.spotted.api.services.async.ShowServiceAsyncImpl
import com.spotted.api.services.async.TrackServiceAsync
import com.spotted.api.services.async.TrackServiceAsyncImpl
import com.spotted.api.services.async.UserServiceAsync
import com.spotted.api.services.async.UserServiceAsyncImpl
import com.spotted.api.services.async.WebhookServiceAsync
import com.spotted.api.services.async.WebhookServiceAsyncImpl

class SpottedClientAsyncImpl(private val clientOptions: ClientOptions) : SpottedClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: SpottedClient by lazy { SpottedClientImpl(clientOptions) }

    private val withRawResponse: SpottedClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val albums: AlbumServiceAsync by lazy {
        AlbumServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val artists: ArtistServiceAsync by lazy {
        ArtistServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val shows: ShowServiceAsync by lazy { ShowServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val episodes: EpisodeServiceAsync by lazy {
        EpisodeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val audiobooks: AudiobookServiceAsync by lazy {
        AudiobookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val me: MeServiceAsync by lazy { MeServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val chapters: ChapterServiceAsync by lazy {
        ChapterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tracks: TrackServiceAsync by lazy {
        TrackServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val search: SearchServiceAsync by lazy {
        SearchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val playlists: PlaylistServiceAsync by lazy {
        PlaylistServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val browse: BrowseServiceAsync by lazy {
        BrowseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val audioFeatures: AudioFeatureServiceAsync by lazy {
        AudioFeatureServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val audioAnalysis: AudioAnalysisServiceAsync by lazy {
        AudioAnalysisServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val recommendations: RecommendationServiceAsync by lazy {
        RecommendationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val markets: MarketServiceAsync by lazy {
        MarketServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): SpottedClient = sync

    override fun withRawResponse(): SpottedClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SpottedClientAsync =
        SpottedClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun albums(): AlbumServiceAsync = albums

    override fun artists(): ArtistServiceAsync = artists

    override fun shows(): ShowServiceAsync = shows

    override fun episodes(): EpisodeServiceAsync = episodes

    override fun audiobooks(): AudiobookServiceAsync = audiobooks

    override fun me(): MeServiceAsync = me

    override fun chapters(): ChapterServiceAsync = chapters

    override fun tracks(): TrackServiceAsync = tracks

    override fun search(): SearchServiceAsync = search

    override fun playlists(): PlaylistServiceAsync = playlists

    override fun users(): UserServiceAsync = users

    override fun browse(): BrowseServiceAsync = browse

    override fun audioFeatures(): AudioFeatureServiceAsync = audioFeatures

    override fun audioAnalysis(): AudioAnalysisServiceAsync = audioAnalysis

    override fun recommendations(): RecommendationServiceAsync = recommendations

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun markets(): MarketServiceAsync = markets

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpottedClientAsync.WithRawResponse {

        private val albums: AlbumServiceAsync.WithRawResponse by lazy {
            AlbumServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val artists: ArtistServiceAsync.WithRawResponse by lazy {
            ArtistServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val shows: ShowServiceAsync.WithRawResponse by lazy {
            ShowServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val episodes: EpisodeServiceAsync.WithRawResponse by lazy {
            EpisodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val audiobooks: AudiobookServiceAsync.WithRawResponse by lazy {
            AudiobookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val me: MeServiceAsync.WithRawResponse by lazy {
            MeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chapters: ChapterServiceAsync.WithRawResponse by lazy {
            ChapterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tracks: TrackServiceAsync.WithRawResponse by lazy {
            TrackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchServiceAsync.WithRawResponse by lazy {
            SearchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val playlists: PlaylistServiceAsync.WithRawResponse by lazy {
            PlaylistServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val browse: BrowseServiceAsync.WithRawResponse by lazy {
            BrowseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val audioFeatures: AudioFeatureServiceAsync.WithRawResponse by lazy {
            AudioFeatureServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val audioAnalysis: AudioAnalysisServiceAsync.WithRawResponse by lazy {
            AudioAnalysisServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val recommendations: RecommendationServiceAsync.WithRawResponse by lazy {
            RecommendationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val markets: MarketServiceAsync.WithRawResponse by lazy {
            MarketServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SpottedClientAsync.WithRawResponse =
            SpottedClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun albums(): AlbumServiceAsync.WithRawResponse = albums

        override fun artists(): ArtistServiceAsync.WithRawResponse = artists

        override fun shows(): ShowServiceAsync.WithRawResponse = shows

        override fun episodes(): EpisodeServiceAsync.WithRawResponse = episodes

        override fun audiobooks(): AudiobookServiceAsync.WithRawResponse = audiobooks

        override fun me(): MeServiceAsync.WithRawResponse = me

        override fun chapters(): ChapterServiceAsync.WithRawResponse = chapters

        override fun tracks(): TrackServiceAsync.WithRawResponse = tracks

        override fun search(): SearchServiceAsync.WithRawResponse = search

        override fun playlists(): PlaylistServiceAsync.WithRawResponse = playlists

        override fun users(): UserServiceAsync.WithRawResponse = users

        override fun browse(): BrowseServiceAsync.WithRawResponse = browse

        override fun audioFeatures(): AudioFeatureServiceAsync.WithRawResponse = audioFeatures

        override fun audioAnalysis(): AudioAnalysisServiceAsync.WithRawResponse = audioAnalysis

        override fun recommendations(): RecommendationServiceAsync.WithRawResponse = recommendations

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        override fun markets(): MarketServiceAsync.WithRawResponse = markets
    }
}
