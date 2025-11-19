// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.client

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.services.async.AlbumServiceAsync
import dev.cjav.spotted.services.async.ArtistServiceAsync
import dev.cjav.spotted.services.async.AudioAnalysisServiceAsync
import dev.cjav.spotted.services.async.AudioFeatureServiceAsync
import dev.cjav.spotted.services.async.AudiobookServiceAsync
import dev.cjav.spotted.services.async.BrowseServiceAsync
import dev.cjav.spotted.services.async.ChapterServiceAsync
import dev.cjav.spotted.services.async.EpisodeServiceAsync
import dev.cjav.spotted.services.async.MarketServiceAsync
import dev.cjav.spotted.services.async.MeServiceAsync
import dev.cjav.spotted.services.async.PlaylistServiceAsync
import dev.cjav.spotted.services.async.RecommendationServiceAsync
import dev.cjav.spotted.services.async.SearchServiceAsync
import dev.cjav.spotted.services.async.ShowServiceAsync
import dev.cjav.spotted.services.async.TrackServiceAsync
import dev.cjav.spotted.services.async.UserServiceAsync

/**
 * A client for interacting with the Spotted REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface SpottedClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): SpottedClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SpottedClientAsync

    fun albums(): AlbumServiceAsync

    fun artists(): ArtistServiceAsync

    fun shows(): ShowServiceAsync

    fun episodes(): EpisodeServiceAsync

    fun audiobooks(): AudiobookServiceAsync

    fun me(): MeServiceAsync

    fun chapters(): ChapterServiceAsync

    fun tracks(): TrackServiceAsync

    fun search(): SearchServiceAsync

    fun playlists(): PlaylistServiceAsync

    fun users(): UserServiceAsync

    fun browse(): BrowseServiceAsync

    fun audioFeatures(): AudioFeatureServiceAsync

    fun audioAnalysis(): AudioAnalysisServiceAsync

    fun recommendations(): RecommendationServiceAsync

    fun markets(): MarketServiceAsync

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

    /**
     * A view of [SpottedClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SpottedClientAsync.WithRawResponse

        fun albums(): AlbumServiceAsync.WithRawResponse

        fun artists(): ArtistServiceAsync.WithRawResponse

        fun shows(): ShowServiceAsync.WithRawResponse

        fun episodes(): EpisodeServiceAsync.WithRawResponse

        fun audiobooks(): AudiobookServiceAsync.WithRawResponse

        fun me(): MeServiceAsync.WithRawResponse

        fun chapters(): ChapterServiceAsync.WithRawResponse

        fun tracks(): TrackServiceAsync.WithRawResponse

        fun search(): SearchServiceAsync.WithRawResponse

        fun playlists(): PlaylistServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun browse(): BrowseServiceAsync.WithRawResponse

        fun audioFeatures(): AudioFeatureServiceAsync.WithRawResponse

        fun audioAnalysis(): AudioAnalysisServiceAsync.WithRawResponse

        fun recommendations(): RecommendationServiceAsync.WithRawResponse

        fun markets(): MarketServiceAsync.WithRawResponse
    }
}
