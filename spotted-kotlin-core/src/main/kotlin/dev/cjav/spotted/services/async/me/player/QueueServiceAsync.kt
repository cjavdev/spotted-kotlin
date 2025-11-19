// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me.player

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.player.queue.QueueAddParams
import dev.cjav.spotted.models.me.player.queue.QueueGetParams
import dev.cjav.spotted.models.me.player.queue.QueueGetResponse

interface QueueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QueueServiceAsync

    /**
     * Add an item to be played next in the user's current playback queue. This API only works for
     * users who have Spotify Premium. The order of execution is not guaranteed when you use this
     * API with other Player API endpoints.
     */
    suspend fun add(params: QueueAddParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get the list of objects that make up the user's queue. */
    suspend fun get(
        params: QueueGetParams = QueueGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueGetResponse

    /** @see get */
    suspend fun get(requestOptions: RequestOptions): QueueGetResponse =
        get(QueueGetParams.none(), requestOptions)

    /** A view of [QueueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QueueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /me/player/queue`, but is otherwise the same as
         * [QueueServiceAsync.add].
         */
        @MustBeClosed
        suspend fun add(
            params: QueueAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /me/player/queue`, but is otherwise the same as
         * [QueueServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(
            params: QueueGetParams = QueueGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueGetResponse>

        /** @see get */
        @MustBeClosed
        suspend fun get(requestOptions: RequestOptions): HttpResponseFor<QueueGetResponse> =
            get(QueueGetParams.none(), requestOptions)
    }
}
