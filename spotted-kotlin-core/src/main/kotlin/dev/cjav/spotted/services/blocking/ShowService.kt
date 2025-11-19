// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.shows.ShowBulkRetrieveParams
import dev.cjav.spotted.models.shows.ShowBulkRetrieveResponse
import dev.cjav.spotted.models.shows.ShowListEpisodesPage
import dev.cjav.spotted.models.shows.ShowListEpisodesParams
import dev.cjav.spotted.models.shows.ShowRetrieveParams
import dev.cjav.spotted.models.shows.ShowRetrieveResponse

interface ShowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShowService

    /** Get Spotify catalog information for a single show identified by its unique Spotify ID. */
    fun retrieve(
        id: String,
        params: ShowRetrieveParams = ShowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ShowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowRetrieveResponse

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ShowRetrieveResponse =
        retrieve(id, ShowRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for several shows based on their Spotify IDs. */
    fun bulkRetrieve(
        params: ShowBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowBulkRetrieveResponse

    /**
     * Get Spotify catalog information about an show’s episodes. Optional parameters can be used to
     * limit the number of episodes returned.
     */
    fun listEpisodes(
        id: String,
        params: ShowListEpisodesParams = ShowListEpisodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowListEpisodesPage = listEpisodes(params.toBuilder().id(id).build(), requestOptions)

    /** @see listEpisodes */
    fun listEpisodes(
        params: ShowListEpisodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShowListEpisodesPage

    /** @see listEpisodes */
    fun listEpisodes(id: String, requestOptions: RequestOptions): ShowListEpisodesPage =
        listEpisodes(id, ShowListEpisodesParams.none(), requestOptions)

    /** A view of [ShowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /shows/{id}`, but is otherwise the same as
         * [ShowService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ShowRetrieveParams = ShowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ShowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShowRetrieveResponse> =
            retrieve(id, ShowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /shows`, but is otherwise the same as
         * [ShowService.bulkRetrieve].
         */
        @MustBeClosed
        fun bulkRetrieve(
            params: ShowBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowBulkRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /shows/{id}/episodes`, but is otherwise the same as
         * [ShowService.listEpisodes].
         */
        @MustBeClosed
        fun listEpisodes(
            id: String,
            params: ShowListEpisodesParams = ShowListEpisodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowListEpisodesPage> =
            listEpisodes(params.toBuilder().id(id).build(), requestOptions)

        /** @see listEpisodes */
        @MustBeClosed
        fun listEpisodes(
            params: ShowListEpisodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShowListEpisodesPage>

        /** @see listEpisodes */
        @MustBeClosed
        fun listEpisodes(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShowListEpisodesPage> =
            listEpisodes(id, ShowListEpisodesParams.none(), requestOptions)
    }
}
