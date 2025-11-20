// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.playlists

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.playlists.images.ImageListParams

interface ImageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageService

    /** Get the current image associated with a specific playlist. */
    fun list(
        playlistId: String,
        params: ImageListParams = ImageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ImageObject> = list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see list */
    fun list(
        params: ImageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ImageObject>

    /** @see list */
    fun list(playlistId: String, requestOptions: RequestOptions): List<ImageObject> =
        list(playlistId, ImageListParams.none(), requestOptions)

    /** A view of [ImageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}/images`, but is otherwise
         * the same as [ImageService.list].
         */
        @MustBeClosed
        fun list(
            playlistId: String,
            params: ImageListParams = ImageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ImageObject>> =
            list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: ImageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ImageObject>>

        /** @see list */
        @MustBeClosed
        fun list(
            playlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ImageObject>> =
            list(playlistId, ImageListParams.none(), requestOptions)
    }
}
