// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.playlists.PlaylistListPage
import dev.cjav.spotted.models.me.playlists.PlaylistListParams

interface PlaylistService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaylistService

    /** Get a list of the playlists owned or followed by the current Spotify user. */
    fun list(
        params: PlaylistListParams = PlaylistListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaylistListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): PlaylistListPage =
        list(PlaylistListParams.none(), requestOptions)

    /** A view of [PlaylistService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaylistService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/playlists`, but is otherwise the same as
         * [PlaylistService.list].
         */
        @MustBeClosed
        fun list(
            params: PlaylistListParams = PlaylistListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaylistListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PlaylistListPage> =
            list(PlaylistListParams.none(), requestOptions)
    }
}
