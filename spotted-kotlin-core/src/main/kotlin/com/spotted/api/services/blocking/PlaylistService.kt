// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.playlists.PlaylistRetrieveParams
import com.spotted.api.models.playlists.PlaylistRetrieveResponse
import com.spotted.api.models.playlists.PlaylistUpdateParams
import com.spotted.api.services.blocking.playlists.FollowerService
import com.spotted.api.services.blocking.playlists.ImageService
import com.spotted.api.services.blocking.playlists.TrackService

interface PlaylistService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaylistService

    fun tracks(): TrackService

    fun followers(): FollowerService

    fun images(): ImageService

    /** Get a playlist owned by a Spotify user. */
    fun retrieve(
        playlistId: String,
        params: PlaylistRetrieveParams = PlaylistRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistRetrieveResponse =
        retrieve(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PlaylistRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistRetrieveResponse

    /** @see retrieve */
    fun retrieve(playlistId: String, requestOptions: RequestOptions): PlaylistRetrieveResponse =
        retrieve(playlistId, PlaylistRetrieveParams.none(), requestOptions)

    /**
     * Change a playlist's name and public/private state. (The user must, of course, own the
     * playlist.)
     */
    fun update(
        playlistId: String,
        params: PlaylistUpdateParams = PlaylistUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see update */
    fun update(params: PlaylistUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(playlistId: String, requestOptions: RequestOptions) =
        update(playlistId, PlaylistUpdateParams.none(), requestOptions)

    /** A view of [PlaylistService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaylistService.WithRawResponse

        fun tracks(): TrackService.WithRawResponse

        fun followers(): FollowerService.WithRawResponse

        fun images(): ImageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}`, but is otherwise the same
         * as [PlaylistService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            playlistId: String,
            params: PlaylistRetrieveParams = PlaylistRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistRetrieveResponse> =
            retrieve(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PlaylistRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaylistRetrieveResponse> =
            retrieve(playlistId, PlaylistRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}`, but is otherwise the same
         * as [PlaylistService.update].
         */
        @MustBeClosed
        fun update(
            playlistId: String,
            params: PlaylistUpdateParams = PlaylistUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: PlaylistUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(playlistId: String, requestOptions: RequestOptions): HttpResponse =
            update(playlistId, PlaylistUpdateParams.none(), requestOptions)
    }
}
