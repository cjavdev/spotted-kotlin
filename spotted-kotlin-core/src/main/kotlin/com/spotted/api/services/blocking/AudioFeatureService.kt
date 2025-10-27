// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.audiofeatures.AudioFeatureListParams
import com.spotted.api.models.audiofeatures.AudioFeatureListResponse
import com.spotted.api.models.audiofeatures.AudioFeatureRetrieveParams
import com.spotted.api.models.audiofeatures.AudioFeatureRetrieveResponse

interface AudioFeatureService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioFeatureService

    /** Get audio feature information for a single track identified by its unique Spotify ID. */
    @Deprecated("deprecated")
    fun retrieve(
        id: String,
        params: AudioFeatureRetrieveParams = AudioFeatureRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioFeatureRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: AudioFeatureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioFeatureRetrieveResponse

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(id: String, requestOptions: RequestOptions): AudioFeatureRetrieveResponse =
        retrieve(id, AudioFeatureRetrieveParams.none(), requestOptions)

    /** Get audio features for multiple tracks based on their Spotify IDs. */
    @Deprecated("deprecated")
    fun list(
        params: AudioFeatureListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioFeatureListResponse

    /**
     * A view of [AudioFeatureService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudioFeatureService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audio-features/{id}`, but is otherwise the same as
         * [AudioFeatureService.retrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AudioFeatureRetrieveParams = AudioFeatureRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioFeatureRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            params: AudioFeatureRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioFeatureRetrieveResponse>

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudioFeatureRetrieveResponse> =
            retrieve(id, AudioFeatureRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audio-features`, but is otherwise the same as
         * [AudioFeatureService.list].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: AudioFeatureListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioFeatureListResponse>
    }
}
