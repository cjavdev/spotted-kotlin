// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.playlists

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.playlists.tracks.TrackAddParams
import dev.cjav.spotted.models.playlists.tracks.TrackAddResponse
import dev.cjav.spotted.models.playlists.tracks.TrackListPage
import dev.cjav.spotted.models.playlists.tracks.TrackListParams
import dev.cjav.spotted.models.playlists.tracks.TrackRemoveParams
import dev.cjav.spotted.models.playlists.tracks.TrackRemoveResponse
import dev.cjav.spotted.models.playlists.tracks.TrackUpdateParams
import dev.cjav.spotted.models.playlists.tracks.TrackUpdateResponse

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
     * **Deprecated:** Use
     * [Update Playlist Items](/documentation/web-api/reference/reorder-or-replace-playlists-items)
     * instead.
     *
     * Either reorder or replace items in a playlist depending on the request's parameters. To
     * reorder items, include `range_start`, `insert_before`, `range_length` and `snapshot_id` in
     * the request's body. To replace items, include `uris` as either a query parameter or in the
     * request's body. Replacing items in a playlist will overwrite its existing items. This
     * operation can be used for replacing or clearing items in a playlist. <br/> **Note**: Replace
     * and reorder are mutually exclusive operations which share the same endpoint, but have
     * different parameters. These operations can't be applied together in a single request.
     */
    @Deprecated("deprecated")
    fun update(
        playlistId: String,
        params: TrackUpdateParams = TrackUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackUpdateResponse =
        update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        params: TrackUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackUpdateResponse

    /** @see update */
    @Deprecated("deprecated")
    fun update(playlistId: String, requestOptions: RequestOptions): TrackUpdateResponse =
        update(playlistId, TrackUpdateParams.none(), requestOptions)

    /**
     * **Deprecated:** Use
     * [Get Playlist Items](/documentation/web-api/reference/get-playlists-items) instead.
     *
     * Get full details of the items of a playlist owned by a Spotify user.
     */
    @Deprecated("deprecated")
    fun list(
        playlistId: String,
        params: TrackListParams = TrackListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackListPage = list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: TrackListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackListPage

    /** @see list */
    @Deprecated("deprecated")
    fun list(playlistId: String, requestOptions: RequestOptions): TrackListPage =
        list(playlistId, TrackListParams.none(), requestOptions)

    /**
     * **Deprecated:** Use
     * [Add Items to Playlist](/documentation/web-api/reference/add-items-to-playlist) instead.
     *
     * Add one or more items to a user's playlist.
     */
    @Deprecated("deprecated")
    fun add(
        playlistId: String,
        params: TrackAddParams = TrackAddParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackAddResponse = add(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see add */
    @Deprecated("deprecated")
    fun add(
        params: TrackAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackAddResponse

    /** @see add */
    @Deprecated("deprecated")
    fun add(playlistId: String, requestOptions: RequestOptions): TrackAddResponse =
        add(playlistId, TrackAddParams.none(), requestOptions)

    /**
     * **Deprecated:** Use
     * [Remove Playlist Items](/documentation/web-api/reference/remove-items-playlist) instead.
     *
     * Remove one or more items from a user's playlist.
     */
    @Deprecated("deprecated")
    fun remove(
        playlistId: String,
        params: TrackRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackRemoveResponse =
        remove(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see remove */
    @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            playlistId: String,
            params: TrackUpdateParams = TrackUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackUpdateResponse> =
            update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            params: TrackUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackUpdateResponse>

        /** @see update */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            playlistId: String,
            params: TrackListParams = TrackListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackListPage> =
            list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: TrackListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackListPage>

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackListPage> = list(playlistId, TrackListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackService.add].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun add(
            playlistId: String,
            params: TrackAddParams = TrackAddParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackAddResponse> =
            add(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see add */
        @Deprecated("deprecated")
        @MustBeClosed
        fun add(
            params: TrackAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackAddResponse>

        /** @see add */
        @Deprecated("deprecated")
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
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(
            playlistId: String,
            params: TrackRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRemoveResponse> =
            remove(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see remove */
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(
            params: TrackRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackRemoveResponse>
    }
}
