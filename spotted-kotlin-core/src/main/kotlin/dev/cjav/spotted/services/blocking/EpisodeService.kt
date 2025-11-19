// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.EpisodeObject
import dev.cjav.spotted.models.episodes.EpisodeBulkRetrieveParams
import dev.cjav.spotted.models.episodes.EpisodeBulkRetrieveResponse
import dev.cjav.spotted.models.episodes.EpisodeRetrieveParams

interface EpisodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeService

    /** Get Spotify catalog information for a single episode identified by its unique Spotify ID. */
    fun retrieve(
        id: String,
        params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeObject = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: EpisodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeObject

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EpisodeObject =
        retrieve(id, EpisodeRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for several episodes based on their Spotify IDs. */
    fun bulkRetrieve(
        params: EpisodeBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeBulkRetrieveResponse

    /** A view of [EpisodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /episodes/{id}`, but is otherwise the same as
         * [EpisodeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeObject> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EpisodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeObject>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EpisodeObject> =
            retrieve(id, EpisodeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /episodes`, but is otherwise the same as
         * [EpisodeService.bulkRetrieve].
         */
        @MustBeClosed
        fun bulkRetrieve(
            params: EpisodeBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeBulkRetrieveResponse>
    }
}
