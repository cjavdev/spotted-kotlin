// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.shows.ShowBulkRetrieveParams
import com.spotted.api.models.shows.ShowBulkRetrieveResponse
import com.spotted.api.models.shows.ShowListEpisodesPageAsync
import com.spotted.api.models.shows.ShowListEpisodesParams
import com.spotted.api.models.shows.ShowRetrieveParams
import com.spotted.api.models.shows.ShowRetrieveResponse

interface ShowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShowServiceAsync

    /** Get Spotify catalog information for a single show identified by its unique Spotify ID. */
    suspend fun retrieve(
        id: String,
        params: ShowRetrieveParams = ShowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ShowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): ShowRetrieveResponse =
        retrieve(id, ShowRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for several shows based on their Spotify IDs. */
    suspend fun bulkRetrieve(
        params: ShowBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowBulkRetrieveResponse

    /**
     * Get Spotify catalog information about an show’s episodes. Optional parameters can be used to
     * limit the number of episodes returned.
     */
    suspend fun listEpisodes(
        id: String,
        params: ShowListEpisodesParams = ShowListEpisodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowListEpisodesPageAsync = listEpisodes(params.toBuilder().id(id).build(), requestOptions)

    /** @see listEpisodes */
    suspend fun listEpisodes(
        params: ShowListEpisodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowListEpisodesPageAsync

    /** @see listEpisodes */
    suspend fun listEpisodes(
        id: String,
        requestOptions: RequestOptions,
    ): ShowListEpisodesPageAsync = listEpisodes(id, ShowListEpisodesParams.none(), requestOptions)

    /** A view of [ShowServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /shows/{id}`, but is otherwise the same as
         * [ShowServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: ShowRetrieveParams = ShowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ShowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShowRetrieveResponse> =
            retrieve(id, ShowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /shows`, but is otherwise the same as
         * [ShowServiceAsync.bulkRetrieve].
         */
        @MustBeClosed
        suspend fun bulkRetrieve(
            params: ShowBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowBulkRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /shows/{id}/episodes`, but is otherwise the same as
         * [ShowServiceAsync.listEpisodes].
         */
        @MustBeClosed
        suspend fun listEpisodes(
            id: String,
            params: ShowListEpisodesParams = ShowListEpisodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowListEpisodesPageAsync> =
            listEpisodes(params.toBuilder().id(id).build(), requestOptions)

        /** @see listEpisodes */
        @MustBeClosed
        suspend fun listEpisodes(
            params: ShowListEpisodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowListEpisodesPageAsync>

        /** @see listEpisodes */
        @MustBeClosed
        suspend fun listEpisodes(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShowListEpisodesPageAsync> =
            listEpisodes(id, ShowListEpisodesParams.none(), requestOptions)
    }
}
