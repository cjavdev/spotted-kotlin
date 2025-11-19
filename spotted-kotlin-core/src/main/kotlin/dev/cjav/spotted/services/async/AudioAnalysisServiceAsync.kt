// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.audioanalysis.AudioAnalysisRetrieveParams
import dev.cjav.spotted.models.audioanalysis.AudioAnalysisRetrieveResponse

interface AudioAnalysisServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudioAnalysisServiceAsync

    /**
     * Get a low-level audio analysis for a track in the Spotify catalog. The audio analysis
     * describes the track’s structure and musical content, including rhythm, pitch, and timbre.
     */
    @Deprecated("deprecated")
    suspend fun retrieve(
        id: String,
        params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioAnalysisRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    suspend fun retrieve(
        params: AudioAnalysisRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioAnalysisRetrieveResponse

    /** @see retrieve */
    @Deprecated("deprecated")
    suspend fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): AudioAnalysisRetrieveResponse =
        retrieve(id, AudioAnalysisRetrieveParams.none(), requestOptions)

    /**
     * A view of [AudioAnalysisServiceAsync] that provides access to raw HTTP responses for each
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
        ): AudioAnalysisServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audio-analysis/{id}`, but is otherwise the same as
         * [AudioAnalysisServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioAnalysisRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            params: AudioAnalysisRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioAnalysisRetrieveResponse>

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudioAnalysisRetrieveResponse> =
            retrieve(id, AudioAnalysisRetrieveParams.none(), requestOptions)
    }
}
