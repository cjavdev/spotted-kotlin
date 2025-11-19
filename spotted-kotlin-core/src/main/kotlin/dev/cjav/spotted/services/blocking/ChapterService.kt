// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.chapters.ChapterBulkRetrieveParams
import dev.cjav.spotted.models.chapters.ChapterBulkRetrieveResponse
import dev.cjav.spotted.models.chapters.ChapterRetrieveParams
import dev.cjav.spotted.models.chapters.ChapterRetrieveResponse

interface ChapterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChapterService

    /**
     * Get Spotify catalog information for a single audiobook chapter. Chapters are only available
     * within the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    fun retrieve(
        id: String,
        params: ChapterRetrieveParams = ChapterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChapterRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ChapterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChapterRetrieveResponse

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ChapterRetrieveResponse =
        retrieve(id, ChapterRetrieveParams.none(), requestOptions)

    /**
     * Get Spotify catalog information for several audiobook chapters identified by their Spotify
     * IDs. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and
     * Australia markets.
     */
    fun bulkRetrieve(
        params: ChapterBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChapterBulkRetrieveResponse

    /** A view of [ChapterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChapterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chapters/{id}`, but is otherwise the same as
         * [ChapterService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ChapterRetrieveParams = ChapterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChapterRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ChapterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChapterRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChapterRetrieveResponse> =
            retrieve(id, ChapterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /chapters`, but is otherwise the same as
         * [ChapterService.bulkRetrieve].
         */
        @MustBeClosed
        fun bulkRetrieve(
            params: ChapterBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChapterBulkRetrieveResponse>
    }
}
