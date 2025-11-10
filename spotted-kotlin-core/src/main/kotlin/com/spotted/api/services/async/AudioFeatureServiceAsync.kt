// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.audiofeatures.AudioFeatureBulkRetrieveParams
import com.spotted.api.models.audiofeatures.AudioFeatureBulkRetrieveResponse
import com.spotted.api.models.audiofeatures.AudioFeatureRetrieveParams
import com.spotted.api.models.audiofeatures.AudioFeatureRetrieveResponse

interface AudioFeatureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioFeatureServiceAsync

    /** Get audio feature information for a single track identified by its unique Spotify ID. */
    @Deprecated("deprecated")
    suspend fun retrieve(
        id: String,
        params: AudioFeatureRetrieveParams = AudioFeatureRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioFeatureRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    suspend fun retrieve(
        params: AudioFeatureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioFeatureRetrieveResponse

    /** @see retrieve */
    @Deprecated("deprecated")
    suspend fun retrieve(id: String, requestOptions: RequestOptions): AudioFeatureRetrieveResponse =
        retrieve(id, AudioFeatureRetrieveParams.none(), requestOptions)

    /** Get audio features for multiple tracks based on their Spotify IDs. */
    @Deprecated("deprecated")
    suspend fun bulkRetrieve(
        params: AudioFeatureBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioFeatureBulkRetrieveResponse

    /**
     * A view of [AudioFeatureServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudioFeatureServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audio-features/{id}`, but is otherwise the same as
         * [AudioFeatureServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: AudioFeatureRetrieveParams = AudioFeatureRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioFeatureRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            params: AudioFeatureRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioFeatureRetrieveResponse>

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudioFeatureRetrieveResponse> =
            retrieve(id, AudioFeatureRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audio-features`, but is otherwise the same as
         * [AudioFeatureServiceAsync.bulkRetrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun bulkRetrieve(
            params: AudioFeatureBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioFeatureBulkRetrieveResponse>
    }
}
