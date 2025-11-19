// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.TrackObject
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveParams
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveResponse
import dev.cjav.spotted.models.tracks.TrackRetrieveParams

interface TrackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackServiceAsync

    /** Get Spotify catalog information for a single track identified by its unique Spotify ID. */
    suspend fun retrieve(
        id: String,
        params: TrackRetrieveParams = TrackRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackObject = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TrackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackObject

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): TrackObject =
        retrieve(id, TrackRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for multiple tracks based on their Spotify IDs. */
    suspend fun bulkRetrieve(
        params: TrackBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackBulkRetrieveResponse

    /** A view of [TrackServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TrackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /tracks/{id}`, but is otherwise the same as
         * [TrackServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: TrackRetrieveParams = TrackRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackObject> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TrackRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackObject>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrackObject> = retrieve(id, TrackRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tracks`, but is otherwise the same as
         * [TrackServiceAsync.bulkRetrieve].
         */
        @MustBeClosed
        suspend fun bulkRetrieve(
            params: TrackBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackBulkRetrieveResponse>
    }
}
