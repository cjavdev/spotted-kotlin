// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.playlists

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.playlists.followers.FollowerCheckParams
import dev.cjav.spotted.models.playlists.followers.FollowerFollowParams
import dev.cjav.spotted.models.playlists.followers.FollowerUnfollowParams

interface FollowerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FollowerServiceAsync

    /** Check to see if the current user is following a specified playlist. */
    suspend fun check(
        playlistId: String,
        params: FollowerCheckParams = FollowerCheckParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean> = check(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see check */
    suspend fun check(
        params: FollowerCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /** @see check */
    suspend fun check(playlistId: String, requestOptions: RequestOptions): List<Boolean> =
        check(playlistId, FollowerCheckParams.none(), requestOptions)

    /** Add the current user as a follower of a playlist. */
    suspend fun follow(
        playlistId: String,
        params: FollowerFollowParams = FollowerFollowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = follow(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see follow */
    suspend fun follow(
        params: FollowerFollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see follow */
    suspend fun follow(playlistId: String, requestOptions: RequestOptions) =
        follow(playlistId, FollowerFollowParams.none(), requestOptions)

    /** Remove the current user as a follower of a playlist. */
    suspend fun unfollow(
        playlistId: String,
        params: FollowerUnfollowParams = FollowerUnfollowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unfollow(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see unfollow */
    suspend fun unfollow(
        params: FollowerUnfollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unfollow */
    suspend fun unfollow(playlistId: String, requestOptions: RequestOptions) =
        unfollow(playlistId, FollowerUnfollowParams.none(), requestOptions)

    /**
     * A view of [FollowerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FollowerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}/followers/contains`, but is
         * otherwise the same as [FollowerServiceAsync.check].
         */
        @MustBeClosed
        suspend fun check(
            playlistId: String,
            params: FollowerCheckParams = FollowerCheckParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>> =
            check(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see check */
        @MustBeClosed
        suspend fun check(
            params: FollowerCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /** @see check */
        @MustBeClosed
        suspend fun check(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Boolean>> =
            check(playlistId, FollowerCheckParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}/followers`, but is
         * otherwise the same as [FollowerServiceAsync.follow].
         */
        @MustBeClosed
        suspend fun follow(
            playlistId: String,
            params: FollowerFollowParams = FollowerFollowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = follow(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see follow */
        @MustBeClosed
        suspend fun follow(
            params: FollowerFollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see follow */
        @MustBeClosed
        suspend fun follow(playlistId: String, requestOptions: RequestOptions): HttpResponse =
            follow(playlistId, FollowerFollowParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /playlists/{playlist_id}/followers`, but is
         * otherwise the same as [FollowerServiceAsync.unfollow].
         */
        @MustBeClosed
        suspend fun unfollow(
            playlistId: String,
            params: FollowerUnfollowParams = FollowerUnfollowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unfollow(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see unfollow */
        @MustBeClosed
        suspend fun unfollow(
            params: FollowerUnfollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unfollow */
        @MustBeClosed
        suspend fun unfollow(playlistId: String, requestOptions: RequestOptions): HttpResponse =
            unfollow(playlistId, FollowerUnfollowParams.none(), requestOptions)
    }
}
