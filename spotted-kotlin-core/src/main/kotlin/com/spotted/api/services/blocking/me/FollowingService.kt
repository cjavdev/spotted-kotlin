// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.me

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

interface FollowingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FollowingService

    /** Get the current user's followed artists. */
    fun list(
        params: FollowingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FollowingListResponse

    /** Check to see if the current user is following one or more artists or other Spotify users. */
    fun check(
        params: FollowingCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /** Add the current user as a follower of one or more artists or other Spotify users. */
    fun follow(
        params: FollowingFollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Remove the current user as a follower of one or more artists or other Spotify users. */
    fun unfollow(
        params: FollowingUnfollowParams = FollowingUnfollowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unfollow */
    fun unfollow(requestOptions: RequestOptions) =
        unfollow(FollowingUnfollowParams.none(), requestOptions)

    /** A view of [FollowingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FollowingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/following`, but is otherwise the same as
         * [FollowingService.list].
         */
        @MustBeClosed
        fun list(
            params: FollowingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FollowingListResponse>

        /**
         * Returns a raw HTTP response for `get /me/following/contains`, but is otherwise the same
         * as [FollowingService.check].
         */
        @MustBeClosed
        fun check(
            params: FollowingCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `put /me/following`, but is otherwise the same as
         * [FollowingService.follow].
         */
        @MustBeClosed
        fun follow(
            params: FollowingFollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /me/following`, but is otherwise the same as
         * [FollowingService.unfollow].
         */
        @MustBeClosed
        fun unfollow(
            params: FollowingUnfollowParams = FollowingUnfollowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unfollow */
        @MustBeClosed
        fun unfollow(requestOptions: RequestOptions): HttpResponse =
            unfollow(FollowingUnfollowParams.none(), requestOptions)
    }
}
