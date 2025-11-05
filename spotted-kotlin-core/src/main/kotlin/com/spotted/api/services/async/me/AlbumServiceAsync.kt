// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.albums.AlbumCheckParams
import com.spotted.api.models.me.albums.AlbumListPageAsync
import com.spotted.api.models.me.albums.AlbumListParams
import com.spotted.api.models.me.albums.AlbumRemoveParams
import com.spotted.api.models.me.albums.AlbumSaveParams

interface AlbumServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlbumServiceAsync

    /** Get a list of the albums saved in the current Spotify user's 'Your Music' library. */
    suspend fun list(
        params: AlbumListParams = AlbumListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AlbumListPageAsync =
        list(AlbumListParams.none(), requestOptions)

    /**
     * Check if one or more albums is already saved in the current Spotify user's 'Your Music'
     * library.
     */
    suspend fun check(
        params: AlbumCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /** Remove one or more albums from the current user's 'Your Music' library. */
    suspend fun remove(
        params: AlbumRemoveParams = AlbumRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see remove */
    suspend fun remove(requestOptions: RequestOptions) =
        remove(AlbumRemoveParams.none(), requestOptions)

    /** Save one or more albums to the current user's 'Your Music' library. */
    suspend fun save(
        params: AlbumSaveParams = AlbumSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see save */
    suspend fun save(requestOptions: RequestOptions) = save(AlbumSaveParams.none(), requestOptions)

    /** A view of [AlbumServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AlbumServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/albums`, but is otherwise the same as
         * [AlbumServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AlbumListParams = AlbumListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AlbumListPageAsync> =
            list(AlbumListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/albums/contains`, but is otherwise the same as
         * [AlbumServiceAsync.check].
         */
        @MustBeClosed
        suspend fun check(
            params: AlbumCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/albums`, but is otherwise the same as
         * [AlbumServiceAsync.remove].
         */
        @MustBeClosed
        suspend fun remove(
            params: AlbumRemoveParams = AlbumRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see remove */
        @MustBeClosed
        suspend fun remove(requestOptions: RequestOptions): HttpResponse =
            remove(AlbumRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/albums`, but is otherwise the same as
         * [AlbumServiceAsync.save].
         */
        @MustBeClosed
        suspend fun save(
            params: AlbumSaveParams = AlbumSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see save */
        @MustBeClosed
        suspend fun save(requestOptions: RequestOptions): HttpResponse =
            save(AlbumSaveParams.none(), requestOptions)
    }
}
