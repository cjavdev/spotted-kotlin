// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.audiobooks.AudiobookBulkRetrieveParams
import com.spotted.api.models.audiobooks.AudiobookBulkRetrieveResponse
import com.spotted.api.models.audiobooks.AudiobookListChaptersPage
import com.spotted.api.models.audiobooks.AudiobookListChaptersParams
import com.spotted.api.models.audiobooks.AudiobookRetrieveParams
import com.spotted.api.models.audiobooks.AudiobookRetrieveResponse

interface AudiobookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudiobookService

    /**
     * Get Spotify catalog information for a single audiobook. Audiobooks are only available within
     * the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    fun retrieve(
        id: String,
        params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AudiobookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookRetrieveResponse

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AudiobookRetrieveResponse =
        retrieve(id, AudiobookRetrieveParams.none(), requestOptions)

    /**
     * Get Spotify catalog information for several audiobooks identified by their Spotify IDs.
     * Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia
     * markets.
     */
    fun bulkRetrieve(
        params: AudiobookBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookBulkRetrieveResponse

    /**
     * Get Spotify catalog information about an audiobook's chapters. Audiobooks are only available
     * within the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    fun listChapters(
        id: String,
        params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookListChaptersPage = listChapters(params.toBuilder().id(id).build(), requestOptions)

    /** @see listChapters */
    fun listChapters(
        params: AudiobookListChaptersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookListChaptersPage

    /** @see listChapters */
    fun listChapters(id: String, requestOptions: RequestOptions): AudiobookListChaptersPage =
        listChapters(id, AudiobookListChaptersParams.none(), requestOptions)

    /** A view of [AudiobookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudiobookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audiobooks/{id}`, but is otherwise the same as
         * [AudiobookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AudiobookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookRetrieveResponse> =
            retrieve(id, AudiobookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audiobooks`, but is otherwise the same as
         * [AudiobookService.bulkRetrieve].
         */
        @MustBeClosed
        fun bulkRetrieve(
            params: AudiobookBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookBulkRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /audiobooks/{id}/chapters`, but is otherwise the
         * same as [AudiobookService.listChapters].
         */
        @MustBeClosed
        fun listChapters(
            id: String,
            params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookListChaptersPage> =
            listChapters(params.toBuilder().id(id).build(), requestOptions)

        /** @see listChapters */
        @MustBeClosed
        fun listChapters(
            params: AudiobookListChaptersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookListChaptersPage>

        /** @see listChapters */
        @MustBeClosed
        fun listChapters(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookListChaptersPage> =
            listChapters(id, AudiobookListChaptersParams.none(), requestOptions)
    }
}
