// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.users.UserRetrieveProfileParams
import com.spotted.api.models.users.UserRetrieveProfileResponse
import com.spotted.api.services.async.users.PlaylistServiceAsync

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync

    fun playlists(): PlaylistServiceAsync

    /** Get public profile information about a Spotify user. */
    suspend fun retrieveProfile(
        userId: String,
        params: UserRetrieveProfileParams = UserRetrieveProfileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveProfileResponse =
        retrieveProfile(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieveProfile */
    suspend fun retrieveProfile(
        params: UserRetrieveProfileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveProfileResponse

    /** @see retrieveProfile */
    suspend fun retrieveProfile(
        userId: String,
        requestOptions: RequestOptions,
    ): UserRetrieveProfileResponse =
        retrieveProfile(userId, UserRetrieveProfileParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync.WithRawResponse

        fun playlists(): PlaylistServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}`, but is otherwise the same as
         * [UserServiceAsync.retrieveProfile].
         */
        @MustBeClosed
        suspend fun retrieveProfile(
            userId: String,
            params: UserRetrieveProfileParams = UserRetrieveProfileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveProfileResponse> =
            retrieveProfile(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieveProfile */
        @MustBeClosed
        suspend fun retrieveProfile(
            params: UserRetrieveProfileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveProfileResponse>

        /** @see retrieveProfile */
        @MustBeClosed
        suspend fun retrieveProfile(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveProfileResponse> =
            retrieveProfile(userId, UserRetrieveProfileParams.none(), requestOptions)
    }
}
