// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.albums.AlbumBulkRetrieveParams
import com.spotted.api.models.albums.AlbumBulkRetrieveResponse
import com.spotted.api.models.albums.AlbumListTracksPageAsync
import com.spotted.api.models.albums.AlbumListTracksParams
import com.spotted.api.models.albums.AlbumRetrieveParams
import com.spotted.api.models.albums.AlbumRetrieveResponse

interface AlbumServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlbumServiceAsync

    /** Get Spotify catalog information for a single album. */
    suspend fun retrieve(
        id: String,
        params: AlbumRetrieveParams = AlbumRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AlbumRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): AlbumRetrieveResponse =
        retrieve(id, AlbumRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for multiple albums identified by their Spotify IDs. */
    suspend fun bulkRetrieve(
        params: AlbumBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumBulkRetrieveResponse

    /**
     * Get Spotify catalog information about an album’s tracks. Optional parameters can be used to
     * limit the number of tracks returned.
     */
    suspend fun listTracks(
        id: String,
        params: AlbumListTracksParams = AlbumListTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumListTracksPageAsync = listTracks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTracks */
    suspend fun listTracks(
        params: AlbumListTracksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumListTracksPageAsync

    /** @see listTracks */
    suspend fun listTracks(id: String, requestOptions: RequestOptions): AlbumListTracksPageAsync =
        listTracks(id, AlbumListTracksParams.none(), requestOptions)

    /** A view of [AlbumServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AlbumServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /albums/{id}`, but is otherwise the same as
         * [AlbumServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: AlbumRetrieveParams = AlbumRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AlbumRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumRetrieveResponse> =
            retrieve(id, AlbumRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /albums`, but is otherwise the same as
         * [AlbumServiceAsync.bulkRetrieve].
         */
        @MustBeClosed
        suspend fun bulkRetrieve(
            params: AlbumBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumBulkRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /albums/{id}/tracks`, but is otherwise the same as
         * [AlbumServiceAsync.listTracks].
         */
        @MustBeClosed
        suspend fun listTracks(
            id: String,
            params: AlbumListTracksParams = AlbumListTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumListTracksPageAsync> =
            listTracks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTracks */
        @MustBeClosed
        suspend fun listTracks(
            params: AlbumListTracksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumListTracksPageAsync>

        /** @see listTracks */
        @MustBeClosed
        suspend fun listTracks(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlbumListTracksPageAsync> =
            listTracks(id, AlbumListTracksParams.none(), requestOptions)
    }
}
