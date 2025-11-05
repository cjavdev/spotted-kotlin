// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.albums.AlbumBulkRetrieveParams
import com.spotted.api.models.albums.AlbumBulkRetrieveResponse
import com.spotted.api.models.albums.AlbumListTracksPage
import com.spotted.api.models.albums.AlbumListTracksParams
import com.spotted.api.models.albums.AlbumRetrieveParams
import com.spotted.api.models.albums.AlbumRetrieveResponse

interface AlbumService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlbumService

    /** Get Spotify catalog information for a single album. */
    fun retrieve(
        id: String,
        params: AlbumRetrieveParams = AlbumRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AlbumRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumRetrieveResponse

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AlbumRetrieveResponse =
        retrieve(id, AlbumRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for multiple albums identified by their Spotify IDs. */
    fun bulkRetrieve(
        params: AlbumBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumBulkRetrieveResponse

    /**
     * Get Spotify catalog information about an album’s tracks. Optional parameters can be used to
     * limit the number of tracks returned.
     */
    fun listTracks(
        id: String,
        params: AlbumListTracksParams = AlbumListTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumListTracksPage = listTracks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTracks */
    fun listTracks(
        params: AlbumListTracksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumListTracksPage

    /** @see listTracks */
    fun listTracks(id: String, requestOptions: RequestOptions): AlbumListTracksPage =
        listTracks(id, AlbumListTracksParams.none(), requestOptions)

    /** A view of [AlbumService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlbumService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /albums/{id}`, but is otherwise the same as
         * [AlbumService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AlbumRetrieveParams = AlbumRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AlbumRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumRetrieveResponse> =
            retrieve(id, AlbumRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /albums`, but is otherwise the same as
         * [AlbumService.bulkRetrieve].
         */
        @MustBeClosed
        fun bulkRetrieve(
            params: AlbumBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumBulkRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /albums/{id}/tracks`, but is otherwise the same as
         * [AlbumService.listTracks].
         */
        @MustBeClosed
        fun listTracks(
            id: String,
            params: AlbumListTracksParams = AlbumListTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumListTracksPage> =
            listTracks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTracks */
        @MustBeClosed
        fun listTracks(
            params: AlbumListTracksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumListTracksPage>

        /** @see listTracks */
        @MustBeClosed
        fun listTracks(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumListTracksPage> =
            listTracks(id, AlbumListTracksParams.none(), requestOptions)
    }
}
