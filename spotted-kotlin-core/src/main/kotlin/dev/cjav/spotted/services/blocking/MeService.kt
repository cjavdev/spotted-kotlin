// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.MeRetrieveParams
import dev.cjav.spotted.models.me.MeRetrieveResponse
import dev.cjav.spotted.services.blocking.me.AlbumService
import dev.cjav.spotted.services.blocking.me.AudiobookService
import dev.cjav.spotted.services.blocking.me.EpisodeService
import dev.cjav.spotted.services.blocking.me.FollowingService
import dev.cjav.spotted.services.blocking.me.PlayerService
import dev.cjav.spotted.services.blocking.me.PlaylistService
import dev.cjav.spotted.services.blocking.me.ShowService
import dev.cjav.spotted.services.blocking.me.TopService
import dev.cjav.spotted.services.blocking.me.TrackService

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
