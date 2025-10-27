// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.MeRetrieveParams
import com.spotted.api.models.me.MeRetrieveResponse
import com.spotted.api.services.blocking.me.AlbumService
import com.spotted.api.services.blocking.me.AudiobookService
import com.spotted.api.services.blocking.me.EpisodeService
import com.spotted.api.services.blocking.me.FollowingService
import com.spotted.api.services.blocking.me.PlayerService
import com.spotted.api.services.blocking.me.PlaylistService
import com.spotted.api.services.blocking.me.ShowService
import com.spotted.api.services.blocking.me.TopService
import com.spotted.api.services.blocking.me.TrackService

interface MeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeService

    fun audiobooks(): AudiobookService

    fun playlists(): PlaylistService

    fun top(): TopService

    fun albums(): AlbumService

    fun tracks(): TrackService

    fun episodes(): EpisodeService

    fun shows(): ShowService

    fun following(): FollowingService

    fun player(): PlayerService

    /**
     * Get detailed profile information about the current user (including the current user's
     * username).
     */
    fun retrieve(
        params: MeRetrieveParams = MeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeRetrieveResponse

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): MeRetrieveResponse =
        retrieve(MeRetrieveParams.none(), requestOptions)

    /** A view of [MeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeService.WithRawResponse

        fun audiobooks(): AudiobookService.WithRawResponse

        fun playlists(): PlaylistService.WithRawResponse

        fun top(): TopService.WithRawResponse

        fun albums(): AlbumService.WithRawResponse

        fun tracks(): TrackService.WithRawResponse

        fun episodes(): EpisodeService.WithRawResponse

        fun shows(): ShowService.WithRawResponse

        fun following(): FollowingService.WithRawResponse

        fun player(): PlayerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me`, but is otherwise the same as
         * [MeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<MeRetrieveResponse> =
            retrieve(MeRetrieveParams.none(), requestOptions)
    }
}
