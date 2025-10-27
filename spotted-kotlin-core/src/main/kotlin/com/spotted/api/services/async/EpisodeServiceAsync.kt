// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.EpisodeObject
import com.spotted.api.models.episodes.EpisodeListParams
import com.spotted.api.models.episodes.EpisodeListResponse
import com.spotted.api.models.episodes.EpisodeRetrieveParams

interface EpisodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeServiceAsync

    /** Get Spotify catalog information for a single episode identified by its unique Spotify ID. */
    suspend fun retrieve(
        id: String,
        params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeObject = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: EpisodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeObject

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): EpisodeObject =
        retrieve(id, EpisodeRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for several episodes based on their Spotify IDs. */
    suspend fun list(
        params: EpisodeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeListResponse

    /**
     * A view of [EpisodeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EpisodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /episodes/{id}`, but is otherwise the same as
         * [EpisodeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeObject> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: EpisodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeObject>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EpisodeObject> =
            retrieve(id, EpisodeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EpisodeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeListResponse>
    }
}
