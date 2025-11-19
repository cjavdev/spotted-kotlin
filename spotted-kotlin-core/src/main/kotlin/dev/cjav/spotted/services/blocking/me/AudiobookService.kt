// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.audiobooks.AudiobookCheckParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookListPage
import dev.cjav.spotted.models.me.audiobooks.AudiobookListParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookRemoveParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookSaveParams

interface AudiobookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudiobookService

    /** Get a list of the audiobooks saved in the current Spotify user's 'Your Music' library. */
    fun list(
        params: AudiobookListParams = AudiobookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): AudiobookListPage =
        list(AudiobookListParams.none(), requestOptions)

    /** Check if one or more audiobooks are already saved in the current Spotify user's library. */
    fun check(
        params: AudiobookCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /** Remove one or more audiobooks from the Spotify user's library. */
    fun remove(
        params: AudiobookRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Save one or more audiobooks to the current Spotify user's library. */
    fun save(params: AudiobookSaveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [AudiobookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AudiobookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/audiobooks`, but is otherwise the same as
         * [AudiobookService.list].
         */
        @MustBeClosed
        fun list(
            params: AudiobookListParams = AudiobookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AudiobookListPage> =
            list(AudiobookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/audiobooks/contains`, but is otherwise the same
         * as [AudiobookService.check].
         */
        @MustBeClosed
        fun check(
            params: AudiobookCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/audiobooks`, but is otherwise the same as
         * [AudiobookService.remove].
         */
        @MustBeClosed
        fun remove(
            params: AudiobookRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /me/audiobooks`, but is otherwise the same as
         * [AudiobookService.save].
         */
        @MustBeClosed
        fun save(
            params: AudiobookSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
