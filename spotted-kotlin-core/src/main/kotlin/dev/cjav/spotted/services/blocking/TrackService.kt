// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.TrackObject
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveParams
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveResponse
import dev.cjav.spotted.models.tracks.TrackRetrieveParams

interface TrackService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackService

    /** Get Spotify catalog information for a single track identified by its unique Spotify ID. */
    fun retrieve(
        id: String,
        params: TrackRetrieveParams = TrackRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackObject = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: TrackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackObject

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TrackObject =
        retrieve(id, TrackRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for multiple tracks based on their Spotify IDs. */
    fun bulkRetrieve(
        params: TrackBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrackBulkRetrieveResponse

    /** A view of [TrackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TrackService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /tracks/{id}`, but is otherwise the same as
         * [TrackService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TrackRetrieveParams = TrackRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackObject> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TrackRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackObject>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<TrackObject> =
            retrieve(id, TrackRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tracks`, but is otherwise the same as
         * [TrackService.bulkRetrieve].
         */
        @MustBeClosed
        fun bulkRetrieve(
            params: TrackBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrackBulkRetrieveResponse>
    }
}
