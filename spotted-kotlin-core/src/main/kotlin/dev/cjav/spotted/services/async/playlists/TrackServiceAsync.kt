// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.playlists

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.playlists.tracks.TrackAddParams
import dev.cjav.spotted.models.playlists.tracks.TrackAddResponse
import dev.cjav.spotted.models.playlists.tracks.TrackListPageAsync
import dev.cjav.spotted.models.playlists.tracks.TrackListParams
import dev.cjav.spotted.models.playlists.tracks.TrackRemoveParams
import dev.cjav.spotted.models.playlists.tracks.TrackRemoveResponse
import dev.cjav.spotted.models.playlists.tracks.TrackUpdateParams
import dev.cjav.spotted.models.playlists.tracks.TrackUpdateResponse

interface TrackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackServiceAsync

    /**
     * Either reorder or replace items in a playlist depending on the request's parameters. To
     * reorder items, include `range_start`, `insert_before`, `range_length` and `snapshot_id` in
     * the request's body. To replace items, include `uris` as either a query parameter or in the
     * request's body. Replacing items in a playlist will overwrite its existing items. This
     * operation can be used for replacing or clearing items in a playlist. <br/> **Note**: Replace
     * and reorder are mutually exclusive operations which share the same endpoint, but have
     * different parameters. These operations can't be applied together in a single request.
     */
    suspend fun update(
        playlistId: String,
        params: TrackUpdateParams = TrackUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackUpdateResponse =
        update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: TrackUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackUpdateResponse

    /** @see update */
    suspend fun update(playlistId: String, requestOptions: RequestOptions): TrackUpdateResponse =
        update(playlistId, TrackUpdateParams.none(), requestOptions)

    /** Get full details of the items of a playlist owned by a Spotify user. */
    suspend fun list(
        playlistId: String,
        params: TrackListParams = TrackListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackListPageAsync = list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: TrackListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackListPageAsync

    /** @see list */
    suspend fun list(playlistId: String, requestOptions: RequestOptions): TrackListPageAsync =
        list(playlistId, TrackListParams.none(), requestOptions)

    /** Add one or more items to a user's playlist. */
    suspend fun add(
        playlistId: String,
        params: TrackAddParams = TrackAddParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackAddResponse = add(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see add */
    suspend fun add(
        params: TrackAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackAddResponse

    /** @see add */
    suspend fun add(playlistId: String, requestOptions: RequestOptions): TrackAddResponse =
        add(playlistId, TrackAddParams.none(), requestOptions)

    /** Remove one or more items from a user's playlist. */
    suspend fun remove(
        playlistId: String,
        params: TrackRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackRemoveResponse =
        remove(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see remove */
    suspend fun remove(
        params: TrackRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackRemoveResponse

    /** A view of [TrackServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TrackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            playlistId: String,
            params: TrackUpdateParams = TrackUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackUpdateResponse> =
            update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: TrackUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackUpdateResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackUpdateResponse> =
            update(playlistId, TrackUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            playlistId: String,
            params: TrackListParams = TrackListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackListPageAsync> =
            list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: TrackListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackListPageAsync> =
            list(playlistId, TrackListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackServiceAsync.add].
         */
        @MustBeClosed
        suspend fun add(
            playlistId: String,
            params: TrackAddParams = TrackAddParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackAddResponse> =
            add(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        suspend fun add(
            params: TrackAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackAddResponse>

        /** @see add */
        @MustBeClosed
        suspend fun add(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackAddResponse> =
            add(playlistId, TrackAddParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /playlists/{playlist_id}/tracks`, but is
         * otherwise the same as [TrackServiceAsync.remove].
         */
        @MustBeClosed
        suspend fun remove(
            playlistId: String,
            params: TrackRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRemoveResponse> =
            remove(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        suspend fun remove(
            params: TrackRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRemoveResponse>
    }
}
