// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.top.TopListTopArtistsPageAsync
import dev.cjav.spotted.models.me.top.TopListTopArtistsParams
import dev.cjav.spotted.models.me.top.TopListTopTracksPageAsync
import dev.cjav.spotted.models.me.top.TopListTopTracksParams

interface TopServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopServiceAsync

    /** Get the current user's top artists based on calculated affinity. */
    suspend fun listTopArtists(
        params: TopListTopArtistsParams = TopListTopArtistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopListTopArtistsPageAsync

    /** @see listTopArtists */
    suspend fun listTopArtists(requestOptions: RequestOptions): TopListTopArtistsPageAsync =
        listTopArtists(TopListTopArtistsParams.none(), requestOptions)

    /** Get the current user's top tracks based on calculated affinity. */
    suspend fun listTopTracks(
        params: TopListTopTracksParams = TopListTopTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopListTopTracksPageAsync

    /** @see listTopTracks */
    suspend fun listTopTracks(requestOptions: RequestOptions): TopListTopTracksPageAsync =
        listTopTracks(TopListTopTracksParams.none(), requestOptions)

    /** A view of [TopServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/top/artists`, but is otherwise the same as
         * [TopServiceAsync.listTopArtists].
         */
        @MustBeClosed
        suspend fun listTopArtists(
            params: TopListTopArtistsParams = TopListTopArtistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TopListTopArtistsPageAsync>

        /** @see listTopArtists */
        @MustBeClosed
        suspend fun listTopArtists(
            requestOptions: RequestOptions
        ): HttpResponseFor<TopListTopArtistsPageAsync> =
            listTopArtists(TopListTopArtistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/top/tracks`, but is otherwise the same as
         * [TopServiceAsync.listTopTracks].
         */
        @MustBeClosed
        suspend fun listTopTracks(
            params: TopListTopTracksParams = TopListTopTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TopListTopTracksPageAsync>

        /** @see listTopTracks */
        @MustBeClosed
        suspend fun listTopTracks(
            requestOptions: RequestOptions
        ): HttpResponseFor<TopListTopTracksPageAsync> =
            listTopTracks(TopListTopTracksParams.none(), requestOptions)
    }
}
