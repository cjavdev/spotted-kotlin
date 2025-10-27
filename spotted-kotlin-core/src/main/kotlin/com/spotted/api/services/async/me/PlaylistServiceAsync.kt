// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.playlists.PlaylistListPageAsync
import com.spotted.api.models.me.playlists.PlaylistListParams

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

    /** Get a list of the playlists owned or followed by the current Spotify user. */
    suspend fun list(
        params: PlaylistListParams = PlaylistListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PlaylistListPageAsync =
        list(PlaylistListParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get /me/playlists`, but is otherwise the same as
         * [PlaylistServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PlaylistListParams = PlaylistListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PlaylistListPageAsync> =
            list(PlaylistListParams.none(), requestOptions)
    }
}
