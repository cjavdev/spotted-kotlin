// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.me

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.handlers.emptyHandler
import com.spotted.api.core.handlers.errorBodyHandler
import com.spotted.api.core.handlers.errorHandler
import com.spotted.api.core.handlers.jsonHandler
import com.spotted.api.core.http.HttpMethod
import com.spotted.api.core.http.HttpRequest
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponse.Handler
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.core.http.json
import com.spotted.api.core.http.parseable
import com.spotted.api.core.prepare
import com.spotted.api.models.me.player.PlayerGetCurrentlyPlayingParams
import com.spotted.api.models.me.player.PlayerGetCurrentlyPlayingResponse
import com.spotted.api.models.me.player.PlayerGetDevicesParams
import com.spotted.api.models.me.player.PlayerGetDevicesResponse
import com.spotted.api.models.me.player.PlayerGetStateParams
import com.spotted.api.models.me.player.PlayerGetStateResponse
import com.spotted.api.models.me.player.PlayerListRecentlyPlayedPage
import com.spotted.api.models.me.player.PlayerListRecentlyPlayedPageResponse
import com.spotted.api.models.me.player.PlayerListRecentlyPlayedParams
import com.spotted.api.models.me.player.PlayerPausePlaybackParams
import com.spotted.api.models.me.player.PlayerSeekToPositionParams
import com.spotted.api.models.me.player.PlayerSetRepeatModeParams
import com.spotted.api.models.me.player.PlayerSetVolumeParams
import com.spotted.api.models.me.player.PlayerSkipNextParams
import com.spotted.api.models.me.player.PlayerSkipPreviousParams
import com.spotted.api.models.me.player.PlayerStartPlaybackParams
import com.spotted.api.models.me.player.PlayerToggleShuffleParams
import com.spotted.api.models.me.player.PlayerTransferParams
import com.spotted.api.services.blocking.me.player.QueueService
import com.spotted.api.services.blocking.me.player.QueueServiceImpl

class PlayerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlayerService {

    private val withRawResponse: PlayerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val queue: QueueService by lazy { QueueServiceImpl(clientOptions) }

    override fun withRawResponse(): PlayerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlayerService =
        PlayerServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun queue(): QueueService = queue

    override fun getCurrentlyPlaying(
        params: PlayerGetCurrentlyPlayingParams,
        requestOptions: RequestOptions,
    ): PlayerGetCurrentlyPlayingResponse =
        // get /me/player/currently-playing
        withRawResponse().getCurrentlyPlaying(params, requestOptions).parse()

    override fun getDevices(
        params: PlayerGetDevicesParams,
        requestOptions: RequestOptions,
    ): PlayerGetDevicesResponse =
        // get /me/player/devices
        withRawResponse().getDevices(params, requestOptions).parse()

    override fun getState(
        params: PlayerGetStateParams,
        requestOptions: RequestOptions,
    ): PlayerGetStateResponse =
        // get /me/player
        withRawResponse().getState(params, requestOptions).parse()

    override fun listRecentlyPlayed(
        params: PlayerListRecentlyPlayedParams,
        requestOptions: RequestOptions,
    ): PlayerListRecentlyPlayedPage =
        // get /me/player/recently-played
        withRawResponse().listRecentlyPlayed(params, requestOptions).parse()

    override fun pausePlayback(params: PlayerPausePlaybackParams, requestOptions: RequestOptions) {
        // put /me/player/pause
        withRawResponse().pausePlayback(params, requestOptions)
    }

    override fun seekToPosition(
        params: PlayerSeekToPositionParams,
        requestOptions: RequestOptions,
    ) {
        // put /me/player/seek
        withRawResponse().seekToPosition(params, requestOptions)
    }

    override fun setRepeatMode(params: PlayerSetRepeatModeParams, requestOptions: RequestOptions) {
        // put /me/player/repeat
        withRawResponse().setRepeatMode(params, requestOptions)
    }

    override fun setVolume(params: PlayerSetVolumeParams, requestOptions: RequestOptions) {
        // put /me/player/volume
        withRawResponse().setVolume(params, requestOptions)
    }

    override fun skipNext(params: PlayerSkipNextParams, requestOptions: RequestOptions) {
        // post /me/player/next
        withRawResponse().skipNext(params, requestOptions)
    }

    override fun skipPrevious(params: PlayerSkipPreviousParams, requestOptions: RequestOptions) {
        // post /me/player/previous
        withRawResponse().skipPrevious(params, requestOptions)
    }

    override fun startPlayback(params: PlayerStartPlaybackParams, requestOptions: RequestOptions) {
        // put /me/player/play
        withRawResponse().startPlayback(params, requestOptions)
    }

    override fun toggleShuffle(params: PlayerToggleShuffleParams, requestOptions: RequestOptions) {
        // put /me/player/shuffle
        withRawResponse().toggleShuffle(params, requestOptions)
    }

    override fun transfer(params: PlayerTransferParams, requestOptions: RequestOptions) {
        // put /me/player
        withRawResponse().transfer(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlayerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val queue: QueueService.WithRawResponse by lazy {
            QueueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlayerService.WithRawResponse =
            PlayerServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun queue(): QueueService.WithRawResponse = queue

        private val getCurrentlyPlayingHandler: Handler<PlayerGetCurrentlyPlayingResponse> =
            jsonHandler<PlayerGetCurrentlyPlayingResponse>(clientOptions.jsonMapper)

        override fun getCurrentlyPlaying(
            params: PlayerGetCurrentlyPlayingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlayerGetCurrentlyPlayingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "currently-playing")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCurrentlyPlayingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDevicesHandler: Handler<PlayerGetDevicesResponse> =
            jsonHandler<PlayerGetDevicesResponse>(clientOptions.jsonMapper)

        override fun getDevices(
            params: PlayerGetDevicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlayerGetDevicesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "devices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDevicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getStateHandler: Handler<PlayerGetStateResponse> =
            jsonHandler<PlayerGetStateResponse>(clientOptions.jsonMapper)

        override fun getState(
            params: PlayerGetStateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlayerGetStateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRecentlyPlayedHandler: Handler<PlayerListRecentlyPlayedPageResponse> =
            jsonHandler<PlayerListRecentlyPlayedPageResponse>(clientOptions.jsonMapper)

        override fun listRecentlyPlayed(
            params: PlayerListRecentlyPlayedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlayerListRecentlyPlayedPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "recently-played")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRecentlyPlayedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PlayerListRecentlyPlayedPage.builder()
                            .service(PlayerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val pausePlaybackHandler: Handler<Void?> = emptyHandler()

        override fun pausePlayback(
            params: PlayerPausePlaybackParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "pause")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { pausePlaybackHandler.handle(it) }
            }
        }

        private val seekToPositionHandler: Handler<Void?> = emptyHandler()

        override fun seekToPosition(
            params: PlayerSeekToPositionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "seek")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { seekToPositionHandler.handle(it) }
            }
        }

        private val setRepeatModeHandler: Handler<Void?> = emptyHandler()

        override fun setRepeatMode(
            params: PlayerSetRepeatModeParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "repeat")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { setRepeatModeHandler.handle(it) }
            }
        }

        private val setVolumeHandler: Handler<Void?> = emptyHandler()

        override fun setVolume(
            params: PlayerSetVolumeParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "volume")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { setVolumeHandler.handle(it) }
            }
        }

        private val skipNextHandler: Handler<Void?> = emptyHandler()

        override fun skipNext(
            params: PlayerSkipNextParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "next")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { skipNextHandler.handle(it) }
            }
        }

        private val skipPreviousHandler: Handler<Void?> = emptyHandler()

        override fun skipPrevious(
            params: PlayerSkipPreviousParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "previous")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { skipPreviousHandler.handle(it) }
            }
        }

        private val startPlaybackHandler: Handler<Void?> = emptyHandler()

        override fun startPlayback(
            params: PlayerStartPlaybackParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "play")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { startPlaybackHandler.handle(it) }
            }
        }

        private val toggleShuffleHandler: Handler<Void?> = emptyHandler()

        override fun toggleShuffle(
            params: PlayerToggleShuffleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "shuffle")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { toggleShuffleHandler.handle(it) }
            }
        }

        private val transferHandler: Handler<Void?> = emptyHandler()

        override fun transfer(
            params: PlayerTransferParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { transferHandler.handle(it) }
            }
        }
    }
}
