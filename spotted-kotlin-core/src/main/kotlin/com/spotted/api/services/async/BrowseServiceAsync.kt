// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.browse.BrowseGetFeaturedPlaylistsParams
import com.spotted.api.models.browse.BrowseGetFeaturedPlaylistsResponse
import com.spotted.api.models.browse.BrowseGetNewReleasesParams
import com.spotted.api.models.browse.BrowseGetNewReleasesResponse
import com.spotted.api.services.async.browse.CategoryServiceAsync

interface BrowseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BrowseServiceAsync

    fun categories(): CategoryServiceAsync

    /**
     * Get a list of Spotify featured playlists (shown, for example, on a Spotify player's 'Browse'
     * tab).
     */
    @Deprecated("deprecated")
    suspend fun getFeaturedPlaylists(
        params: BrowseGetFeaturedPlaylistsParams = BrowseGetFeaturedPlaylistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowseGetFeaturedPlaylistsResponse

    /** @see getFeaturedPlaylists */
    @Deprecated("deprecated")
    suspend fun getFeaturedPlaylists(
        requestOptions: RequestOptions
    ): BrowseGetFeaturedPlaylistsResponse =
        getFeaturedPlaylists(BrowseGetFeaturedPlaylistsParams.none(), requestOptions)

    /**
     * Get a list of new album releases featured in Spotify (shown, for example, on a Spotify
     * player’s “Browse” tab).
     */
    suspend fun getNewReleases(
        params: BrowseGetNewReleasesParams = BrowseGetNewReleasesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowseGetNewReleasesResponse

    /** @see getNewReleases */
    suspend fun getNewReleases(requestOptions: RequestOptions): BrowseGetNewReleasesResponse =
        getNewReleases(BrowseGetNewReleasesParams.none(), requestOptions)

    /**
     * A view of [BrowseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BrowseServiceAsync.WithRawResponse

        fun categories(): CategoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /browse/featured-playlists`, but is otherwise the
         * same as [BrowseServiceAsync.getFeaturedPlaylists].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun getFeaturedPlaylists(
            params: BrowseGetFeaturedPlaylistsParams = BrowseGetFeaturedPlaylistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowseGetFeaturedPlaylistsResponse>

        /** @see getFeaturedPlaylists */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun getFeaturedPlaylists(
            requestOptions: RequestOptions
        ): HttpResponseFor<BrowseGetFeaturedPlaylistsResponse> =
            getFeaturedPlaylists(BrowseGetFeaturedPlaylistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browse/new-releases`, but is otherwise the same as
         * [BrowseServiceAsync.getNewReleases].
         */
        @MustBeClosed
        suspend fun getNewReleases(
            params: BrowseGetNewReleasesParams = BrowseGetNewReleasesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowseGetNewReleasesResponse>

        /** @see getNewReleases */
        @MustBeClosed
        suspend fun getNewReleases(
            requestOptions: RequestOptions
        ): HttpResponseFor<BrowseGetNewReleasesResponse> =
            getNewReleases(BrowseGetNewReleasesParams.none(), requestOptions)
    }
}
