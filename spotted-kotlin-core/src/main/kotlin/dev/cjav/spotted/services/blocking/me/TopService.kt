// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.top.TopListTopArtistsPage
import dev.cjav.spotted.models.me.top.TopListTopArtistsParams
import dev.cjav.spotted.models.me.top.TopListTopTracksPage
import dev.cjav.spotted.models.me.top.TopListTopTracksParams

interface TopService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopService

    /** Get the current user's top artists based on calculated affinity. */
    fun listTopArtists(
        params: TopListTopArtistsParams = TopListTopArtistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopListTopArtistsPage

    /** @see listTopArtists */
    fun listTopArtists(requestOptions: RequestOptions): TopListTopArtistsPage =
        listTopArtists(TopListTopArtistsParams.none(), requestOptions)

    /** Get the current user's top tracks based on calculated affinity. */
    fun listTopTracks(
        params: TopListTopTracksParams = TopListTopTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopListTopTracksPage

    /** @see listTopTracks */
    fun listTopTracks(requestOptions: RequestOptions): TopListTopTracksPage =
        listTopTracks(TopListTopTracksParams.none(), requestOptions)

    /** A view of [TopService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/top/artists`, but is otherwise the same as
         * [TopService.listTopArtists].
         */
        @MustBeClosed
        fun listTopArtists(
            params: TopListTopArtistsParams = TopListTopArtistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TopListTopArtistsPage>

        /** @see listTopArtists */
        @MustBeClosed
        fun listTopArtists(requestOptions: RequestOptions): HttpResponseFor<TopListTopArtistsPage> =
            listTopArtists(TopListTopArtistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/top/tracks`, but is otherwise the same as
         * [TopService.listTopTracks].
         */
        @MustBeClosed
        fun listTopTracks(
            params: TopListTopTracksParams = TopListTopTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TopListTopTracksPage>

        /** @see listTopTracks */
        @MustBeClosed
        fun listTopTracks(requestOptions: RequestOptions): HttpResponseFor<TopListTopTracksPage> =
            listTopTracks(TopListTopTracksParams.none(), requestOptions)
    }
}
