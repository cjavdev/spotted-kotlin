// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.episodes.EpisodeCheckParams
import com.spotted.api.models.me.episodes.EpisodeListPage
import com.spotted.api.models.me.episodes.EpisodeListParams
import com.spotted.api.models.me.episodes.EpisodeRemoveParams
import com.spotted.api.models.me.episodes.EpisodeSaveParams

interface EpisodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeService

    /**
     * Get a list of the episodes saved in the current Spotify user's library.<br/> This API
     * endpoint is in __beta__ and could change without warning. Please share any feedback that you
     * have, or issues that you discover, in our
     * [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer).
     */
    fun list(
        params: EpisodeListParams = EpisodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EpisodeListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): EpisodeListPage =
        list(EpisodeListParams.none(), requestOptions)

    /**
     * Check if one or more episodes is already saved in the current Spotify user's 'Your Episodes'
     * library.<br/> This API endpoint is in __beta__ and could change without warning. Please share
     * any feedback that you have, or issues that you discover, in our
     * [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer)..
     */
    fun check(
        params: EpisodeCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /**
     * Remove one or more episodes from the current user's library.<br/> This API endpoint is in
     * __beta__ and could change without warning. Please share any feedback that you have, or issues
     * that you discover, in our
     * [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer).
     */
    fun remove(
        params: EpisodeRemoveParams = EpisodeRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see remove */
    fun remove(requestOptions: RequestOptions) = remove(EpisodeRemoveParams.none(), requestOptions)

    /**
     * Save one or more episodes to the current user's library.<br/> This API endpoint is in
     * __beta__ and could change without warning. Please share any feedback that you have, or issues
     * that you discover, in our
     * [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer).
     */
    fun save(params: EpisodeSaveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [EpisodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EpisodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/episodes`, but is otherwise the same as
         * [EpisodeService.list].
         */
        @MustBeClosed
        fun list(
            params: EpisodeListParams = EpisodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EpisodeListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EpisodeListPage> =
            list(EpisodeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/episodes/contains`, but is otherwise the same as
         * [EpisodeService.check].
         */
        @MustBeClosed
        fun check(
            params: EpisodeCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/episodes`, but is otherwise the same as
         * [EpisodeService.remove].
         */
        @MustBeClosed
        fun remove(
            params: EpisodeRemoveParams = EpisodeRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see remove */
        @MustBeClosed
        fun remove(requestOptions: RequestOptions): HttpResponse =
            remove(EpisodeRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/episodes`, but is otherwise the same as
         * [EpisodeService.save].
         */
        @MustBeClosed
        fun save(
            params: EpisodeSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
