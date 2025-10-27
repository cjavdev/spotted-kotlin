// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.audiobooks.AudiobookListChaptersPageAsync
import com.spotted.api.models.audiobooks.AudiobookListChaptersParams
import com.spotted.api.models.audiobooks.AudiobookListParams
import com.spotted.api.models.audiobooks.AudiobookListResponse
import com.spotted.api.models.audiobooks.AudiobookRetrieveParams
import com.spotted.api.models.audiobooks.AudiobookRetrieveResponse

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
    suspend fun list(
        params: AudiobookListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookListResponse

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
         * [AudiobookServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AudiobookListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookListResponse>

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
