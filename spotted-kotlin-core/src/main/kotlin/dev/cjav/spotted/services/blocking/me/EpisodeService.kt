// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.episodes.EpisodeCheckParams
import dev.cjav.spotted.models.me.episodes.EpisodeListPage
import dev.cjav.spotted.models.me.episodes.EpisodeListParams
import dev.cjav.spotted.models.me.episodes.EpisodeRemoveParams
import dev.cjav.spotted.models.me.episodes.EpisodeSaveParams

interface EpisodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeService

    /** Get a list of the episodes saved in the current Spotify user's library. */
    fun list(
        params: EpisodeListParams = EpisodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): EpisodeListPage =
        list(EpisodeListParams.none(), requestOptions)

    /**
     * Check if one or more episodes is already saved in the current Spotify user's 'Your Episodes'
     * library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Check User's Saved Items](/documentation/web-api/reference/check-library-contains) instead.
     */
    @Deprecated("deprecated")
    fun check(
        params: EpisodeCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /**
     * Remove one or more episodes from the current user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Remove Items from Library](/documentation/web-api/reference/remove-library-items) instead.
     */
    @Deprecated("deprecated")
    fun remove(
        params: EpisodeRemoveParams = EpisodeRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(requestOptions: RequestOptions) = remove(EpisodeRemoveParams.none(), requestOptions)

    /**
     * Save one or more episodes to the current user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Save Items to Library](/documentation/web-api/reference/save-library-items) instead.
     */
    @Deprecated("deprecated")
    fun save(params: EpisodeSaveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [EpisodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/episodes`, but is otherwise the same as
         * [EpisodeService.list].
         */
        @MustBeClosed
        fun list(
            params: EpisodeListParams = EpisodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EpisodeListPage> =
            list(EpisodeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/episodes/contains`, but is otherwise the same as
         * [EpisodeService.check].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun check(
            params: EpisodeCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/episodes`, but is otherwise the same as
         * [EpisodeService.remove].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(
            params: EpisodeRemoveParams = EpisodeRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see remove */
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(requestOptions: RequestOptions): HttpResponse =
            remove(EpisodeRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/episodes`, but is otherwise the same as
         * [EpisodeService.save].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun save(
            params: EpisodeSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
