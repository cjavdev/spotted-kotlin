// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.users

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.users.playlists.PlaylistCreateParams
import com.spotted.api.models.users.playlists.PlaylistCreateResponse
import com.spotted.api.models.users.playlists.PlaylistListPageAsync
import com.spotted.api.models.users.playlists.PlaylistListParams

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

    /**
     * Create a playlist for a Spotify user. (The playlist will be empty until you
     * [add tracks](/documentation/web-api/reference/add-tracks-to-playlist).) Each user is
     * generally limited to a maximum of 11000 playlists.
     */
    suspend fun create(
        userId: String,
        params: PlaylistCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistCreateResponse = create(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: PlaylistCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistCreateResponse

    /** Get a list of the playlists owned or followed by a Spotify user. */
    suspend fun list(
        userId: String,
        params: PlaylistListParams = PlaylistListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistListPageAsync = list(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: PlaylistListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistListPageAsync

    /** @see list */
    suspend fun list(userId: String, requestOptions: RequestOptions): PlaylistListPageAsync =
        list(userId, PlaylistListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /users/{user_id}/playlists`, but is otherwise the
         * same as [PlaylistServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            userId: String,
            params: PlaylistCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistCreateResponse> =
            create(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: PlaylistCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistCreateResponse>

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/playlists`, but is otherwise the
         * same as [PlaylistServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            userId: String,
            params: PlaylistListParams = PlaylistListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistListPageAsync> =
            list(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: PlaylistListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaylistListPageAsync> =
            list(userId, PlaylistListParams.none(), requestOptions)
    }
}
