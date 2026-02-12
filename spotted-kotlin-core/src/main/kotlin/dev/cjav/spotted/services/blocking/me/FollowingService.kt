// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.following.FollowingBulkRetrieveParams
import dev.cjav.spotted.models.me.following.FollowingBulkRetrieveResponse
import dev.cjav.spotted.models.me.following.FollowingCheckParams
import dev.cjav.spotted.models.me.following.FollowingFollowParams
import dev.cjav.spotted.models.me.following.FollowingUnfollowParams

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
    fun bulkRetrieve(
        params: FollowingBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FollowingBulkRetrieveResponse

    /**
     * Check to see if the current user is following one or more artists or other Spotify users.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Check User's Saved Items](/documentation/web-api/reference/check-library-contains) instead.
     */
    @Deprecated("deprecated")
    fun check(
        params: FollowingCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /**
     * Add the current user as a follower of one or more artists or other Spotify users.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Save Items to Library](/documentation/web-api/reference/save-library-items) instead.
     */
    @Deprecated("deprecated")
    fun follow(
        params: FollowingFollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Remove the current user as a follower of one or more artists or other Spotify users.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Remove Items from Library](/documentation/web-api/reference/remove-library-items) instead.
     */
    @Deprecated("deprecated")
    fun unfollow(
        params: FollowingUnfollowParams = FollowingUnfollowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unfollow */
    @Deprecated("deprecated")
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
         * [FollowingService.bulkRetrieve].
         */
        @MustBeClosed
        fun bulkRetrieve(
            params: FollowingBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FollowingBulkRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /me/following/contains`, but is otherwise the same
         * as [FollowingService.check].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun check(
            params: FollowingCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `put /me/following`, but is otherwise the same as
         * [FollowingService.follow].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun follow(
            params: FollowingFollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /me/following`, but is otherwise the same as
         * [FollowingService.unfollow].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun unfollow(
            params: FollowingUnfollowParams = FollowingUnfollowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unfollow */
        @Deprecated("deprecated")
        @MustBeClosed
        fun unfollow(requestOptions: RequestOptions): HttpResponse =
            unfollow(FollowingUnfollowParams.none(), requestOptions)
    }
}
