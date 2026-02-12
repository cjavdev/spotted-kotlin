// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.episodes.EpisodeCheckParams
import dev.cjav.spotted.models.me.episodes.EpisodeListPageAsync
import dev.cjav.spotted.models.me.episodes.EpisodeListParams
import dev.cjav.spotted.models.me.episodes.EpisodeRemoveParams
import dev.cjav.spotted.models.me.episodes.EpisodeSaveParams

interface EpisodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeServiceAsync

    /** Get a list of the episodes saved in the current Spotify user's library. */
    suspend fun list(
        params: EpisodeListParams = EpisodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): EpisodeListPageAsync =
        list(EpisodeListParams.none(), requestOptions)

    /**
     * Check if one or more episodes is already saved in the current Spotify user's 'Your Episodes'
     * library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Check User's Saved Items](/documentation/web-api/reference/check-library-contains) instead.
     */
    @Deprecated("deprecated")
    suspend fun check(
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
    suspend fun remove(
        params: EpisodeRemoveParams = EpisodeRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see remove */
    @Deprecated("deprecated")
    suspend fun remove(requestOptions: RequestOptions) =
        remove(EpisodeRemoveParams.none(), requestOptions)

    /**
     * Save one or more episodes to the current user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Save Items to Library](/documentation/web-api/reference/save-library-items) instead.
     */
    @Deprecated("deprecated")
    suspend fun save(
        params: EpisodeSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [EpisodeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EpisodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EpisodeListParams = EpisodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<EpisodeListPageAsync> =
            list(EpisodeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/episodes/contains`, but is otherwise the same as
         * [EpisodeServiceAsync.check].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun check(
            params: EpisodeCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.remove].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun remove(
            params: EpisodeRemoveParams = EpisodeRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see remove */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun remove(requestOptions: RequestOptions): HttpResponse =
            remove(EpisodeRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.save].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun save(
            params: EpisodeSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
