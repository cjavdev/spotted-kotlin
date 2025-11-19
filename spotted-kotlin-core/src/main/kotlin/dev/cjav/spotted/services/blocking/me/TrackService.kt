// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.tracks.TrackCheckParams
import dev.cjav.spotted.models.me.tracks.TrackListPage
import dev.cjav.spotted.models.me.tracks.TrackListParams
import dev.cjav.spotted.models.me.tracks.TrackRemoveParams
import dev.cjav.spotted.models.me.tracks.TrackSaveParams

interface TrackService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackService

    /** Get a list of the songs saved in the current Spotify user's 'Your Music' library. */
    fun list(
        params: TrackListParams = TrackListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): TrackListPage =
        list(TrackListParams.none(), requestOptions)

    /**
     * Check if one or more tracks is already saved in the current Spotify user's 'Your Music'
     * library.
     */
    fun check(
        params: TrackCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /** Remove one or more tracks from the current user's 'Your Music' library. */
    fun remove(
        params: TrackRemoveParams = TrackRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see remove */
    fun remove(requestOptions: RequestOptions) = remove(TrackRemoveParams.none(), requestOptions)

    /** Save one or more tracks to the current user's 'Your Music' library. */
    fun save(params: TrackSaveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [TrackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/tracks`, but is otherwise the same as
         * [TrackService.list].
         */
        @MustBeClosed
        fun list(
            params: TrackListParams = TrackListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TrackListPage> =
            list(TrackListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/tracks/contains`, but is otherwise the same as
         * [TrackService.check].
         */
        @MustBeClosed
        fun check(
            params: TrackCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/tracks`, but is otherwise the same as
         * [TrackService.remove].
         */
        @MustBeClosed
        fun remove(
            params: TrackRemoveParams = TrackRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see remove */
        @MustBeClosed
        fun remove(requestOptions: RequestOptions): HttpResponse =
            remove(TrackRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/tracks`, but is otherwise the same as
         * [TrackService.save].
         */
        @MustBeClosed
        fun save(
            params: TrackSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
