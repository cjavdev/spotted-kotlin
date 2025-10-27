// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.following.FollowingCheckParams
import com.spotted.api.models.me.following.FollowingFollowParams
import com.spotted.api.models.me.following.FollowingListParams
import com.spotted.api.models.me.following.FollowingListResponse
import com.spotted.api.models.me.following.FollowingUnfollowParams

interface FollowingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FollowingServiceAsync

    /** Get the current user's followed artists. */
    suspend fun list(
        params: FollowingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FollowingListResponse

    /** Check to see if the current user is following one or more artists or other Spotify users. */
    suspend fun check(
        params: FollowingCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /** Add the current user as a follower of one or more artists or other Spotify users. */
    suspend fun follow(
        params: FollowingFollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Remove the current user as a follower of one or more artists or other Spotify users. */
    suspend fun unfollow(
        params: FollowingUnfollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [FollowingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FollowingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/following`, but is otherwise the same as
         * [FollowingServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: FollowingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FollowingListResponse>

        /**
         * Returns a raw HTTP response for `get /me/following/contains`, but is otherwise the same
         * as [FollowingServiceAsync.check].
         */
        @MustBeClosed
        suspend fun check(
            params: FollowingCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `put /me/following`, but is otherwise the same as
         * [FollowingServiceAsync.follow].
         */
        @MustBeClosed
        suspend fun follow(
            params: FollowingFollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /me/following`, but is otherwise the same as
         * [FollowingServiceAsync.unfollow].
         */
        @MustBeClosed
        suspend fun unfollow(
            params: FollowingUnfollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
