// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.audiofeatures.AudioFeatureBulkRetrieveParams
import dev.cjav.spotted.models.audiofeatures.AudioFeatureBulkRetrieveResponse
import dev.cjav.spotted.models.audiofeatures.AudioFeatureRetrieveParams
import dev.cjav.spotted.models.audiofeatures.AudioFeatureRetrieveResponse

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
    fun bulkRetrieve(
        params: AudioFeatureBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioFeatureBulkRetrieveResponse

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
         * [AudioFeatureService.bulkRetrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun bulkRetrieve(
            params: AudioFeatureBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioFeatureBulkRetrieveResponse>
    }
}
