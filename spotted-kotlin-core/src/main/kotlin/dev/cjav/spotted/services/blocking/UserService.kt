// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.users.UserRetrieveProfileParams
import dev.cjav.spotted.models.users.UserRetrieveProfileResponse
import dev.cjav.spotted.services.blocking.users.PlaylistService

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService

    fun playlists(): PlaylistService

    /** Get public profile information about a Spotify user. */
    fun retrieveProfile(
        userId: String,
        params: UserRetrieveProfileParams = UserRetrieveProfileParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveProfileResponse =
        retrieveProfile(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieveProfile */
    fun retrieveProfile(
        params: UserRetrieveProfileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveProfileResponse

    /** @see retrieveProfile */
    fun retrieveProfile(
        userId: String,
        requestOptions: RequestOptions,
    ): UserRetrieveProfileResponse =
        retrieveProfile(userId, UserRetrieveProfileParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        fun playlists(): PlaylistService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}`, but is otherwise the same as
         * [UserService.retrieveProfile].
         */
        @MustBeClosed
        fun retrieveProfile(
            userId: String,
            params: UserRetrieveProfileParams = UserRetrieveProfileParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveProfileResponse> =
            retrieveProfile(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieveProfile */
        @MustBeClosed
        fun retrieveProfile(
            params: UserRetrieveProfileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveProfileResponse>

        /** @see retrieveProfile */
        @MustBeClosed
        fun retrieveProfile(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveProfileResponse> =
            retrieveProfile(userId, UserRetrieveProfileParams.none(), requestOptions)
    }
}
