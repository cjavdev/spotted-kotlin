// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.browse.BrowseGetFeaturedPlaylistsParams
import dev.cjav.spotted.models.browse.BrowseGetFeaturedPlaylistsResponse
import dev.cjav.spotted.models.browse.BrowseGetNewReleasesParams
import dev.cjav.spotted.models.browse.BrowseGetNewReleasesResponse
import dev.cjav.spotted.services.blocking.browse.CategoryService

interface BrowseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BrowseService

    fun categories(): CategoryService

    /**
     * Get a list of Spotify featured playlists (shown, for example, on a Spotify player's 'Browse'
     * tab).
     */
    @Deprecated("deprecated")
    fun getFeaturedPlaylists(
        params: BrowseGetFeaturedPlaylistsParams = BrowseGetFeaturedPlaylistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowseGetFeaturedPlaylistsResponse

    /** @see getFeaturedPlaylists */
    @Deprecated("deprecated")
    fun getFeaturedPlaylists(requestOptions: RequestOptions): BrowseGetFeaturedPlaylistsResponse =
        getFeaturedPlaylists(BrowseGetFeaturedPlaylistsParams.none(), requestOptions)

    /**
     * Get a list of new album releases featured in Spotify (shown, for example, on a Spotify
     * player’s “Browse” tab).
     */
    fun getNewReleases(
        params: BrowseGetNewReleasesParams = BrowseGetNewReleasesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowseGetNewReleasesResponse

    /** @see getNewReleases */
    fun getNewReleases(requestOptions: RequestOptions): BrowseGetNewReleasesResponse =
        getNewReleases(BrowseGetNewReleasesParams.none(), requestOptions)

    /** A view of [BrowseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BrowseService.WithRawResponse

        fun categories(): CategoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /browse/featured-playlists`, but is otherwise the
         * same as [BrowseService.getFeaturedPlaylists].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getFeaturedPlaylists(
            params: BrowseGetFeaturedPlaylistsParams = BrowseGetFeaturedPlaylistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowseGetFeaturedPlaylistsResponse>

        /** @see getFeaturedPlaylists */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getFeaturedPlaylists(
            requestOptions: RequestOptions
        ): HttpResponseFor<BrowseGetFeaturedPlaylistsResponse> =
            getFeaturedPlaylists(BrowseGetFeaturedPlaylistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browse/new-releases`, but is otherwise the same as
         * [BrowseService.getNewReleases].
         */
        @MustBeClosed
        fun getNewReleases(
            params: BrowseGetNewReleasesParams = BrowseGetNewReleasesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowseGetNewReleasesResponse>

        /** @see getNewReleases */
        @MustBeClosed
        fun getNewReleases(
            requestOptions: RequestOptions
        ): HttpResponseFor<BrowseGetNewReleasesResponse> =
            getNewReleases(BrowseGetNewReleasesParams.none(), requestOptions)
    }
}
