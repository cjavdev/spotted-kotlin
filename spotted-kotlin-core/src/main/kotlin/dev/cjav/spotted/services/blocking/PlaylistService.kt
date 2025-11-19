// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.playlists.PlaylistRetrieveParams
import dev.cjav.spotted.models.playlists.PlaylistRetrieveResponse
import dev.cjav.spotted.models.playlists.PlaylistUpdateParams
import dev.cjav.spotted.services.blocking.playlists.FollowerService
import dev.cjav.spotted.services.blocking.playlists.ImageService
import dev.cjav.spotted.services.blocking.playlists.TrackService

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
