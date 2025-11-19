// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.player.PlayerGetCurrentlyPlayingParams
import dev.cjav.spotted.models.me.player.PlayerGetCurrentlyPlayingResponse
import dev.cjav.spotted.models.me.player.PlayerGetDevicesParams
import dev.cjav.spotted.models.me.player.PlayerGetDevicesResponse
import dev.cjav.spotted.models.me.player.PlayerGetStateParams
import dev.cjav.spotted.models.me.player.PlayerGetStateResponse
import dev.cjav.spotted.models.me.player.PlayerListRecentlyPlayedPageAsync
import dev.cjav.spotted.models.me.player.PlayerListRecentlyPlayedParams
import dev.cjav.spotted.models.me.player.PlayerPausePlaybackParams
import dev.cjav.spotted.models.me.player.PlayerSeekToPositionParams
import dev.cjav.spotted.models.me.player.PlayerSetRepeatModeParams
import dev.cjav.spotted.models.me.player.PlayerSetVolumeParams
import dev.cjav.spotted.models.me.player.PlayerSkipNextParams
import dev.cjav.spotted.models.me.player.PlayerSkipPreviousParams
import dev.cjav.spotted.models.me.player.PlayerStartPlaybackParams
import dev.cjav.spotted.models.me.player.PlayerToggleShuffleParams
import dev.cjav.spotted.models.me.player.PlayerTransferParams
import dev.cjav.spotted.services.async.me.player.QueueServiceAsync

interface PlayerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlayerServiceAsync

    fun queue(): QueueServiceAsync

    /** Get the object currently being played on the user's Spotify account. */
    suspend fun getCurrentlyPlaying(
        params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlayerGetCurrentlyPlayingResponse

    /** @see getCurrentlyPlaying */
    suspend fun getCurrentlyPlaying(
        requestOptions: RequestOptions
    ): PlayerGetCurrentlyPlayingResponse =
        getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none(), requestOptions)

    /**
     * Get information about a user’s available Spotify Connect devices. Some device models are not
     * supported and will not be listed in the API response.
     */
    suspend fun getDevices(
        params: PlayerGetDevicesParams = PlayerGetDevicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlayerGetDevicesResponse

    /** @see getDevices */
    suspend fun getDevices(requestOptions: RequestOptions): PlayerGetDevicesResponse =
        getDevices(PlayerGetDevicesParams.none(), requestOptions)

    /**
     * Get information about the user’s current playback state, including track or episode,
     * progress, and active device.
     */
    suspend fun getState(
        params: PlayerGetStateParams = PlayerGetStateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlayerGetStateResponse

    /** @see getState */
    suspend fun getState(requestOptions: RequestOptions): PlayerGetStateResponse =
        getState(PlayerGetStateParams.none(), requestOptions)

    /**
     * Get tracks from the current user's recently played tracks. _**Note**: Currently doesn't
     * support podcast episodes._
     */
    suspend fun listRecentlyPlayed(
        params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlayerListRecentlyPlayedPageAsync

    /** @see listRecentlyPlayed */
    suspend fun listRecentlyPlayed(
        requestOptions: RequestOptions
    ): PlayerListRecentlyPlayedPageAsync =
        listRecentlyPlayed(PlayerListRecentlyPlayedParams.none(), requestOptions)

    /**
     * Pause playback on the user's account. This API only works for users who have Spotify Premium.
     * The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    suspend fun pausePlayback(
        params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see pausePlayback */
    suspend fun pausePlayback(requestOptions: RequestOptions) =
        pausePlayback(PlayerPausePlaybackParams.none(), requestOptions)

    /**
     * Seeks to the given position in the user’s currently playing track. This API only works for
     * users who have Spotify Premium. The order of execution is not guaranteed when you use this
     * API with other Player API endpoints.
     */
    suspend fun seekToPosition(
        params: PlayerSeekToPositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Set the repeat mode for the user's playback. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    suspend fun setRepeatMode(
        params: PlayerSetRepeatModeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Set the volume for the user’s current playback device. This API only works for users who have
     * Spotify Premium. The order of execution is not guaranteed when you use this API with other
     * Player API endpoints.
     */
    suspend fun setVolume(
        params: PlayerSetVolumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Skips to next track in the user’s queue. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    suspend fun skipNext(
        params: PlayerSkipNextParams = PlayerSkipNextParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see skipNext */
    suspend fun skipNext(requestOptions: RequestOptions) =
        skipNext(PlayerSkipNextParams.none(), requestOptions)

    /**
     * Skips to previous track in the user’s queue. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    suspend fun skipPrevious(
        params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see skipPrevious */
    suspend fun skipPrevious(requestOptions: RequestOptions) =
        skipPrevious(PlayerSkipPreviousParams.none(), requestOptions)

    /**
     * Start a new context or resume current playback on the user's active device. This API only
     * works for users who have Spotify Premium. The order of execution is not guaranteed when you
     * use this API with other Player API endpoints.
     */
    suspend fun startPlayback(
        params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see startPlayback */
    suspend fun startPlayback(requestOptions: RequestOptions) =
        startPlayback(PlayerStartPlaybackParams.none(), requestOptions)

    /**
     * Toggle shuffle on or off for user’s playback. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    suspend fun toggleShuffle(
        params: PlayerToggleShuffleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Transfer playback to a new device and optionally begin playback. This API only works for
     * users who have Spotify Premium. The order of execution is not guaranteed when you use this
     * API with other Player API endpoints.
     */
    suspend fun transfer(
        params: PlayerTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [PlayerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlayerServiceAsync.WithRawResponse

        fun queue(): QueueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/player/currently-playing`, but is otherwise the
         * same as [PlayerServiceAsync.getCurrentlyPlaying].
         */
        @MustBeClosed
        suspend fun getCurrentlyPlaying(
            params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlayerGetCurrentlyPlayingResponse>

        /** @see getCurrentlyPlaying */
        @MustBeClosed
        suspend fun getCurrentlyPlaying(
            requestOptions: RequestOptions
        ): HttpResponseFor<PlayerGetCurrentlyPlayingResponse> =
            getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/player/devices`, but is otherwise the same as
         * [PlayerServiceAsync.getDevices].
         */
        @MustBeClosed
        suspend fun getDevices(
            params: PlayerGetDevicesParams = PlayerGetDevicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlayerGetDevicesResponse>

        /** @see getDevices */
        @MustBeClosed
        suspend fun getDevices(
            requestOptions: RequestOptions
        ): HttpResponseFor<PlayerGetDevicesResponse> =
            getDevices(PlayerGetDevicesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/player`, but is otherwise the same as
         * [PlayerServiceAsync.getState].
         */
        @MustBeClosed
        suspend fun getState(
            params: PlayerGetStateParams = PlayerGetStateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlayerGetStateResponse>

        /** @see getState */
        @MustBeClosed
        suspend fun getState(
            requestOptions: RequestOptions
        ): HttpResponseFor<PlayerGetStateResponse> =
            getState(PlayerGetStateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/player/recently-played`, but is otherwise the
         * same as [PlayerServiceAsync.listRecentlyPlayed].
         */
        @MustBeClosed
        suspend fun listRecentlyPlayed(
            params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlayerListRecentlyPlayedPageAsync>

        /** @see listRecentlyPlayed */
        @MustBeClosed
        suspend fun listRecentlyPlayed(
            requestOptions: RequestOptions
        ): HttpResponseFor<PlayerListRecentlyPlayedPageAsync> =
            listRecentlyPlayed(PlayerListRecentlyPlayedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/pause`, but is otherwise the same as
         * [PlayerServiceAsync.pausePlayback].
         */
        @MustBeClosed
        suspend fun pausePlayback(
            params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pausePlayback */
        @MustBeClosed
        suspend fun pausePlayback(requestOptions: RequestOptions): HttpResponse =
            pausePlayback(PlayerPausePlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/seek`, but is otherwise the same as
         * [PlayerServiceAsync.seekToPosition].
         */
        @MustBeClosed
        suspend fun seekToPosition(
            params: PlayerSeekToPositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /me/player/repeat`, but is otherwise the same as
         * [PlayerServiceAsync.setRepeatMode].
         */
        @MustBeClosed
        suspend fun setRepeatMode(
            params: PlayerSetRepeatModeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /me/player/volume`, but is otherwise the same as
         * [PlayerServiceAsync.setVolume].
         */
        @MustBeClosed
        suspend fun setVolume(
            params: PlayerSetVolumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /me/player/next`, but is otherwise the same as
         * [PlayerServiceAsync.skipNext].
         */
        @MustBeClosed
        suspend fun skipNext(
            params: PlayerSkipNextParams = PlayerSkipNextParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see skipNext */
        @MustBeClosed
        suspend fun skipNext(requestOptions: RequestOptions): HttpResponse =
            skipNext(PlayerSkipNextParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /me/player/previous`, but is otherwise the same as
         * [PlayerServiceAsync.skipPrevious].
         */
        @MustBeClosed
        suspend fun skipPrevious(
            params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see skipPrevious */
        @MustBeClosed
        suspend fun skipPrevious(requestOptions: RequestOptions): HttpResponse =
            skipPrevious(PlayerSkipPreviousParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/play`, but is otherwise the same as
         * [PlayerServiceAsync.startPlayback].
         */
        @MustBeClosed
        suspend fun startPlayback(
            params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see startPlayback */
        @MustBeClosed
        suspend fun startPlayback(requestOptions: RequestOptions): HttpResponse =
            startPlayback(PlayerStartPlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/shuffle`, but is otherwise the same as
         * [PlayerServiceAsync.toggleShuffle].
         */
        @MustBeClosed
        suspend fun toggleShuffle(
            params: PlayerToggleShuffleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /me/player`, but is otherwise the same as
         * [PlayerServiceAsync.transfer].
         */
        @MustBeClosed
        suspend fun transfer(
            params: PlayerTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
