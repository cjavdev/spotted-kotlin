// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.playlists

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.ImageObject
import com.spotted.api.models.playlists.images.ImageListParams
import com.spotted.api.models.playlists.images.ImageUpdateParams

interface ImageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageServiceAsync

    /** Replace the image used to represent a specific playlist. */
    @MustBeClosed
    suspend fun update(
        playlistId: String,
        params: ImageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see update */
    @MustBeClosed
    suspend fun update(
        params: ImageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** Get the current image associated with a specific playlist. */
    suspend fun list(
        playlistId: String,
        params: ImageListParams = ImageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ImageObject> = list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: ImageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ImageObject>

    /** @see list */
    suspend fun list(playlistId: String, requestOptions: RequestOptions): List<ImageObject> =
        list(playlistId, ImageListParams.none(), requestOptions)

    /** A view of [ImageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ImageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}/images`, but is otherwise
         * the same as [ImageServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            playlistId: String,
            params: ImageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ImageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}/images`, but is otherwise
         * the same as [ImageServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            playlistId: String,
            params: ImageListParams = ImageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ImageObject>> =
            list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: ImageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ImageObject>>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ImageObject>> =
            list(playlistId, ImageListParams.none(), requestOptions)
    }
}
