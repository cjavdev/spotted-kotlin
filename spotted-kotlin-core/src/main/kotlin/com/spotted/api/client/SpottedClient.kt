// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.client

import com.spotted.api.core.ClientOptions
import com.spotted.api.services.blocking.AlbumService
import com.spotted.api.services.blocking.ArtistService
import com.spotted.api.services.blocking.AudioAnalysisService
import com.spotted.api.services.blocking.AudioFeatureService
import com.spotted.api.services.blocking.AudiobookService
import com.spotted.api.services.blocking.BrowseService
import com.spotted.api.services.blocking.ChapterService
import com.spotted.api.services.blocking.EpisodeService
import com.spotted.api.services.blocking.MarketService
import com.spotted.api.services.blocking.MeService
import com.spotted.api.services.blocking.PlaylistService
import com.spotted.api.services.blocking.RecommendationService
import com.spotted.api.services.blocking.SearchService
import com.spotted.api.services.blocking.ShowService
import com.spotted.api.services.blocking.TrackService
import com.spotted.api.services.blocking.UserService
import com.spotted.api.services.blocking.WebhookService

/**
 * A client for interacting with the Spotted REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface SpottedClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): SpottedClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SpottedClient

    fun albums(): AlbumService

    fun artists(): ArtistService

    fun shows(): ShowService

    fun episodes(): EpisodeService

    fun audiobooks(): AudiobookService

    fun me(): MeService

    fun chapters(): ChapterService

    fun tracks(): TrackService

    fun search(): SearchService

    fun playlists(): PlaylistService

    fun users(): UserService

    fun browse(): BrowseService

    fun audioFeatures(): AudioFeatureService

    fun audioAnalysis(): AudioAnalysisService

    fun recommendations(): RecommendationService

    fun webhooks(): WebhookService

    fun markets(): MarketService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [SpottedClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SpottedClient.WithRawResponse

        fun albums(): AlbumService.WithRawResponse

        fun artists(): ArtistService.WithRawResponse

        fun shows(): ShowService.WithRawResponse

        fun episodes(): EpisodeService.WithRawResponse

        fun audiobooks(): AudiobookService.WithRawResponse

        fun me(): MeService.WithRawResponse

        fun chapters(): ChapterService.WithRawResponse

        fun tracks(): TrackService.WithRawResponse

        fun search(): SearchService.WithRawResponse

        fun playlists(): PlaylistService.WithRawResponse

        fun users(): UserService.WithRawResponse

        fun browse(): BrowseService.WithRawResponse

        fun audioFeatures(): AudioFeatureService.WithRawResponse

        fun audioAnalysis(): AudioAnalysisService.WithRawResponse

        fun recommendations(): RecommendationService.WithRawResponse

        fun webhooks(): WebhookService.WithRawResponse

        fun markets(): MarketService.WithRawResponse
    }
}
