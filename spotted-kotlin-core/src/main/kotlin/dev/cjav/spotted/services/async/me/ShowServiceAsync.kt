// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.shows.ShowCheckParams
import dev.cjav.spotted.models.me.shows.ShowListPageAsync
import dev.cjav.spotted.models.me.shows.ShowListParams
import dev.cjav.spotted.models.me.shows.ShowRemoveParams
import dev.cjav.spotted.models.me.shows.ShowSaveParams

interface ShowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShowServiceAsync

    /**
     * Get a list of shows saved in the current Spotify user's library. Optional parameters can be
     * used to limit the number of shows returned.
     */
    suspend fun list(
        params: ShowListParams = ShowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ShowListPageAsync =
        list(ShowListParams.none(), requestOptions)

    /** Check if one or more shows is already saved in the current Spotify user's library. */
    suspend fun check(
        params: ShowCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /** Delete one or more shows from current Spotify user's library. */
    suspend fun remove(
        params: ShowRemoveParams = ShowRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see remove */
    suspend fun remove(requestOptions: RequestOptions) =
        remove(ShowRemoveParams.none(), requestOptions)

    /** Save one or more shows to current Spotify user's library. */
    suspend fun save(
        params: ShowSaveParams = ShowSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see save */
    suspend fun save(requestOptions: RequestOptions) = save(ShowSaveParams.none(), requestOptions)

    /** A view of [ShowServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/shows`, but is otherwise the same as
         * [ShowServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ShowListParams = ShowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ShowListPageAsync> =
            list(ShowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/shows/contains`, but is otherwise the same as
         * [ShowServiceAsync.check].
         */
        @MustBeClosed
        suspend fun check(
            params: ShowCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/shows`, but is otherwise the same as
         * [ShowServiceAsync.remove].
         */
        @MustBeClosed
        suspend fun remove(
            params: ShowRemoveParams = ShowRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see remove */
        @MustBeClosed
        suspend fun remove(requestOptions: RequestOptions): HttpResponse =
            remove(ShowRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/shows`, but is otherwise the same as
         * [ShowServiceAsync.save].
         */
        @MustBeClosed
        suspend fun save(
            params: ShowSaveParams = ShowSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see save */
        @MustBeClosed
        suspend fun save(requestOptions: RequestOptions): HttpResponse =
            save(ShowSaveParams.none(), requestOptions)
    }
}
