// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.ArtistObject
import com.spotted.api.models.artists.ArtistBulkRetrieveParams
import com.spotted.api.models.artists.ArtistBulkRetrieveResponse
import com.spotted.api.models.artists.ArtistListAlbumsPageAsync
import com.spotted.api.models.artists.ArtistListAlbumsParams
import com.spotted.api.models.artists.ArtistListRelatedArtistsParams
import com.spotted.api.models.artists.ArtistListRelatedArtistsResponse
import com.spotted.api.models.artists.ArtistListTopTracksParams
import com.spotted.api.models.artists.ArtistListTopTracksResponse
import com.spotted.api.models.artists.ArtistRetrieveParams

interface ArtistServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ArtistServiceAsync

    /**
     * Get Spotify catalog information for a single artist identified by their unique Spotify ID.
     */
    suspend fun retrieve(
        id: String,
        params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistObject = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ArtistRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistObject

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): ArtistObject =
        retrieve(id, ArtistRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for several artists based on their Spotify IDs. */
    suspend fun bulkRetrieve(
        params: ArtistBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistBulkRetrieveResponse

    /** Get Spotify catalog information about an artist's albums. */
    suspend fun listAlbums(
        id: String,
        params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListAlbumsPageAsync = listAlbums(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAlbums */
    suspend fun listAlbums(
        params: ArtistListAlbumsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListAlbumsPageAsync

    /** @see listAlbums */
    suspend fun listAlbums(id: String, requestOptions: RequestOptions): ArtistListAlbumsPageAsync =
        listAlbums(id, ArtistListAlbumsParams.none(), requestOptions)

    /**
     * Get Spotify catalog information about artists similar to a given artist. Similarity is based
     * on analysis of the Spotify community's listening history.
     */
    @Deprecated("deprecated")
    suspend fun listRelatedArtists(
        id: String,
        params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListRelatedArtistsResponse =
        listRelatedArtists(params.toBuilder().id(id).build(), requestOptions)

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    suspend fun listRelatedArtists(
        params: ArtistListRelatedArtistsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListRelatedArtistsResponse

    /** @see listRelatedArtists */
    @Deprecated("deprecated")
    suspend fun listRelatedArtists(
        id: String,
        requestOptions: RequestOptions,
    ): ArtistListRelatedArtistsResponse =
        listRelatedArtists(id, ArtistListRelatedArtistsParams.none(), requestOptions)

    /** Get Spotify catalog information about an artist's top tracks by country. */
    suspend fun listTopTracks(
        id: String,
        params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListTopTracksResponse =
        listTopTracks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTopTracks */
    suspend fun listTopTracks(
        params: ArtistListTopTracksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ArtistListTopTracksResponse

    /** @see listTopTracks */
    suspend fun listTopTracks(
        id: String,
        requestOptions: RequestOptions,
    ): ArtistListTopTracksResponse =
        listTopTracks(id, ArtistListTopTracksParams.none(), requestOptions)

    /**
     * A view of [ArtistServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ArtistServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /artists/{id}`, but is otherwise the same as
         * [ArtistServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: ArtistRetrieveParams = ArtistRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistObject> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ArtistRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistObject>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistObject> = retrieve(id, ArtistRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /artists`, but is otherwise the same as
         * [ArtistServiceAsync.bulkRetrieve].
         */
        @MustBeClosed
        suspend fun bulkRetrieve(
            params: ArtistBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistBulkRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /artists/{id}/albums`, but is otherwise the same as
         * [ArtistServiceAsync.listAlbums].
         */
        @MustBeClosed
        suspend fun listAlbums(
            id: String,
            params: ArtistListAlbumsParams = ArtistListAlbumsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListAlbumsPageAsync> =
            listAlbums(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAlbums */
        @MustBeClosed
        suspend fun listAlbums(
            params: ArtistListAlbumsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListAlbumsPageAsync>

        /** @see listAlbums */
        @MustBeClosed
        suspend fun listAlbums(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListAlbumsPageAsync> =
            listAlbums(id, ArtistListAlbumsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /artists/{id}/related-artists`, but is otherwise the
         * same as [ArtistServiceAsync.listRelatedArtists].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun listRelatedArtists(
            id: String,
            params: ArtistListRelatedArtistsParams = ArtistListRelatedArtistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListRelatedArtistsResponse> =
            listRelatedArtists(params.toBuilder().id(id).build(), requestOptions)

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun listRelatedArtists(
            params: ArtistListRelatedArtistsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListRelatedArtistsResponse>

        /** @see listRelatedArtists */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun listRelatedArtists(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListRelatedArtistsResponse> =
            listRelatedArtists(id, ArtistListRelatedArtistsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /artists/{id}/top-tracks`, but is otherwise the same
         * as [ArtistServiceAsync.listTopTracks].
         */
        @MustBeClosed
        suspend fun listTopTracks(
            id: String,
            params: ArtistListTopTracksParams = ArtistListTopTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListTopTracksResponse> =
            listTopTracks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTopTracks */
        @MustBeClosed
        suspend fun listTopTracks(
            params: ArtistListTopTracksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ArtistListTopTracksResponse>

        /** @see listTopTracks */
        @MustBeClosed
        suspend fun listTopTracks(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ArtistListTopTracksResponse> =
            listTopTracks(id, ArtistListTopTracksParams.none(), requestOptions)
    }
}
