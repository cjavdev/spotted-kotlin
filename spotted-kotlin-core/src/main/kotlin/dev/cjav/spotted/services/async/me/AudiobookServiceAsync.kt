// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.audiobooks.AudiobookCheckParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookListPageAsync
import dev.cjav.spotted.models.me.audiobooks.AudiobookListParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookRemoveParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookSaveParams

interface AudiobookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudiobookServiceAsync

    /** Get a list of the audiobooks saved in the current Spotify user's 'Your Music' library. */
    suspend fun list(
        params: AudiobookListParams = AudiobookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AudiobookListPageAsync =
        list(AudiobookListParams.none(), requestOptions)

    /** Check if one or more audiobooks are already saved in the current Spotify user's library. */
    suspend fun check(
        params: AudiobookCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /** Remove one or more audiobooks from the Spotify user's library. */
    suspend fun remove(
        params: AudiobookRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Save one or more audiobooks to the current Spotify user's library. */
    suspend fun save(
        params: AudiobookSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AudiobookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AudiobookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AudiobookListParams = AudiobookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AudiobookListPageAsync> =
            list(AudiobookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/audiobooks/contains`, but is otherwise the same
         * as [AudiobookServiceAsync.check].
         */
        @MustBeClosed
        suspend fun check(
            params: AudiobookCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.remove].
         */
        @MustBeClosed
        suspend fun remove(
            params: AudiobookRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /me/audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.save].
         */
        @MustBeClosed
        suspend fun save(
            params: AudiobookSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
