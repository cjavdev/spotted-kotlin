// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.playlists.PlaylistRetrieveParams
import dev.cjav.spotted.models.playlists.PlaylistRetrieveResponse
import dev.cjav.spotted.models.playlists.PlaylistUpdateParams
import dev.cjav.spotted.services.async.playlists.FollowerServiceAsync
import dev.cjav.spotted.services.async.playlists.ImageServiceAsync
import dev.cjav.spotted.services.async.playlists.TrackServiceAsync

interface PlaylistServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaylistServiceAsync

    fun tracks(): TrackServiceAsync

    fun followers(): FollowerServiceAsync

    fun images(): ImageServiceAsync

    /** Get a playlist owned by a Spotify user. */
    suspend fun retrieve(
        playlistId: String,
        params: PlaylistRetrieveParams = PlaylistRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistRetrieveResponse =
        retrieve(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PlaylistRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        playlistId: String,
        requestOptions: RequestOptions,
    ): PlaylistRetrieveResponse =
        retrieve(playlistId, PlaylistRetrieveParams.none(), requestOptions)

    /**
     * Change a playlist's name and public/private state. (The user must, of course, own the
     * playlist.)
     */
    suspend fun update(
        playlistId: String,
        params: PlaylistUpdateParams = PlaylistUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: PlaylistUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    suspend fun update(playlistId: String, requestOptions: RequestOptions) =
        update(playlistId, PlaylistUpdateParams.none(), requestOptions)

    /**
     * A view of [PlaylistServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlaylistServiceAsync.WithRawResponse

        fun tracks(): TrackServiceAsync.WithRawResponse

        fun followers(): FollowerServiceAsync.WithRawResponse

        fun images(): ImageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}`, but is otherwise the same
         * as [PlaylistServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            playlistId: String,
            params: PlaylistRetrieveParams = PlaylistRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistRetrieveResponse> =
            retrieve(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PlaylistRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaylistRetrieveResponse> =
            retrieve(playlistId, PlaylistRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}`, but is otherwise the same
         * as [PlaylistServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            playlistId: String,
            params: PlaylistUpdateParams = PlaylistUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: PlaylistUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        suspend fun update(playlistId: String, requestOptions: RequestOptions): HttpResponse =
            update(playlistId, PlaylistUpdateParams.none(), requestOptions)
    }
}
