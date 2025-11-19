// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveResponse
import dev.cjav.spotted.models.audiobooks.AudiobookListChaptersPageAsync
import dev.cjav.spotted.models.audiobooks.AudiobookListChaptersParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveResponse

interface AudiobookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudiobookServiceAsync

    /**
     * Get Spotify catalog information for a single audiobook. Audiobooks are only available within
     * the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    suspend fun retrieve(
        id: String,
        params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AudiobookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): AudiobookRetrieveResponse =
        retrieve(id, AudiobookRetrieveParams.none(), requestOptions)

    /**
     * Get Spotify catalog information for several audiobooks identified by their Spotify IDs.
     * Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia
     * markets.
     */
    suspend fun bulkRetrieve(
        params: AudiobookBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookBulkRetrieveResponse

    /**
     * Get Spotify catalog information about an audiobook's chapters. Audiobooks are only available
     * within the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    suspend fun listChapters(
        id: String,
        params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookListChaptersPageAsync =
        listChapters(params.toBuilder().id(id).build(), requestOptions)

    /** @see listChapters */
    suspend fun listChapters(
        params: AudiobookListChaptersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookListChaptersPageAsync

    /** @see listChapters */
    suspend fun listChapters(
        id: String,
        requestOptions: RequestOptions,
    ): AudiobookListChaptersPageAsync =
        listChapters(id, AudiobookListChaptersParams.none(), requestOptions)

    /**
     * A view of [AudiobookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudiobookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audiobooks/{id}`, but is otherwise the same as
         * [AudiobookServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AudiobookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookRetrieveResponse> =
            retrieve(id, AudiobookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.bulkRetrieve].
         */
        @MustBeClosed
        suspend fun bulkRetrieve(
            params: AudiobookBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookBulkRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /audiobooks/{id}/chapters`, but is otherwise the
         * same as [AudiobookServiceAsync.listChapters].
         */
        @MustBeClosed
        suspend fun listChapters(
            id: String,
            params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookListChaptersPageAsync> =
            listChapters(params.toBuilder().id(id).build(), requestOptions)

        /** @see listChapters */
        @MustBeClosed
        suspend fun listChapters(
            params: AudiobookListChaptersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookListChaptersPageAsync>

        /** @see listChapters */
        @MustBeClosed
        suspend fun listChapters(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookListChaptersPageAsync> =
            listChapters(id, AudiobookListChaptersParams.none(), requestOptions)
    }
}
