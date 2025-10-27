// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.playlists

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.playlists.tracks.TrackAddParams
import com.spotted.api.models.playlists.tracks.TrackAddResponse
import com.spotted.api.models.playlists.tracks.TrackListPage
import com.spotted.api.models.playlists.tracks.TrackListParams
import com.spotted.api.models.playlists.tracks.TrackRemoveParams
import com.spotted.api.models.playlists.tracks.TrackRemoveResponse
import com.spotted.api.models.playlists.tracks.TrackUpdateParams
import com.spotted.api.models.playlists.tracks.TrackUpdateResponse

interface TrackService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackService

    /**
     * Either reorder or replace items in a playlist depending on the request's parameters. To
     * reorder items, include `range_start`, `insert_before`, `range_length` and `snapshot_id` in
     * the request's body. To replace items, include `uris` as either a query parameter or in the
     * request's body. Replacing items in a playlist will overwrite its existing items. This
     * operation can be used for replacing or clearing items in a playlist. <br/> **Note**: Replace
     * and reorder are mutually exclusive operations which share the same endpoint, but have
     * different parameters. These operations can't be applied together in a single request.
     */
    fun update(
        playlistId: String,
        params: TrackUpdateParams = TrackUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackUpdateResponse =
        update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see update */
    fun update(
        params: TrackUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackUpdateResponse

    /** @see update */
    fun update(playlistId: String, requestOptions: RequestOptions): TrackUpdateResponse =
        update(playlistId, TrackUpdateParams.none(), requestOptions)

    /** Get full details of the items of a playlist owned by a Spotify user. */
    fun list(
        playlistId: String,
        params: TrackListParams = TrackListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackListPage = list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see list */
    fun list(
        params: TrackListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackListPage

    /** @see list */
    fun list(playlistId: String, requestOptions: RequestOptions): TrackListPage =
        list(playlistId, TrackListParams.none(), requestOptions)

    /** Add one or more items to a user's playlist. */
    fun add(
        playlistId: String,
        params: TrackAddParams = TrackAddParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackAddResponse = add(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see add */
    fun add(
        params: TrackAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackAddResponse

    /** @see add */
    fun add(playlistId: String, requestOptions: RequestOptions): TrackAddResponse =
        add(playlistId, TrackAddParams.none(), requestOptions)

    /** Remove one or more items from a user's playlist. */
    fun remove(
        playlistId: String,
        params: TrackRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackRemoveResponse =
        remove(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see remove */
    fun remove(
        params: TrackRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackRemoveResponse

    /** A view of [TrackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackService.update].
         */
        @MustBeClosed
        fun update(
            playlistId: String,
            params: TrackUpdateParams = TrackUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackUpdateResponse> =
            update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: TrackUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackUpdateResponse> =
            update(playlistId, TrackUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackService.list].
         */
        @MustBeClosed
        fun list(
            playlistId: String,
            params: TrackListParams = TrackListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackListPage> =
            list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: TrackListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackListPage> = list(playlistId, TrackListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackService.add].
         */
        @MustBeClosed
        fun add(
            playlistId: String,
            params: TrackAddParams = TrackAddParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackAddResponse> =
            add(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(
            params: TrackAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackAddResponse>

        /** @see add */
        @MustBeClosed
        fun add(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackAddResponse> =
            add(playlistId, TrackAddParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /playlists/{playlist_id}/tracks`, but is
         * otherwise the same as [TrackService.remove].
         */
        @MustBeClosed
        fun remove(
            playlistId: String,
            params: TrackRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRemoveResponse> =
            remove(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: TrackRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRemoveResponse>
    }
}
