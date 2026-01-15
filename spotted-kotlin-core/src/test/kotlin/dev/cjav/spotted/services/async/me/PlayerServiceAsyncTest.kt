// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.models.me.player.PlayerGetCurrentlyPlayingParams
import dev.cjav.spotted.models.me.player.PlayerGetStateParams
import dev.cjav.spotted.models.me.player.PlayerPausePlaybackParams
import dev.cjav.spotted.models.me.player.PlayerSeekToPositionParams
import dev.cjav.spotted.models.me.player.PlayerSetRepeatModeParams
import dev.cjav.spotted.models.me.player.PlayerSetVolumeParams
import dev.cjav.spotted.models.me.player.PlayerSkipNextParams
import dev.cjav.spotted.models.me.player.PlayerSkipPreviousParams
import dev.cjav.spotted.models.me.player.PlayerStartPlaybackParams
import dev.cjav.spotted.models.me.player.PlayerToggleShuffleParams
import dev.cjav.spotted.models.me.player.PlayerTransferParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlayerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getCurrentlyPlaying() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val response =
            playerServiceAsync.getCurrentlyPlaying(
                PlayerGetCurrentlyPlayingParams.builder()
                    .additionalTypes("additional_types")
                    .market("ES")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getDevices() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val response = playerServiceAsync.getDevices()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getState() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val response =
            playerServiceAsync.getState(
                PlayerGetStateParams.builder()
                    .additionalTypes("additional_types")
                    .market("ES")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listRecentlyPlayed() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val page = playerServiceAsync.listRecentlyPlayed()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun pausePlayback() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        playerServiceAsync.pausePlayback(
            PlayerPausePlaybackParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun seekToPosition() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        playerServiceAsync.seekToPosition(
            PlayerSeekToPositionParams.builder()
                .positionMs(25000L)
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun setRepeatMode() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        playerServiceAsync.setRepeatMode(
            PlayerSetRepeatModeParams.builder()
                .state("context")
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun setVolume() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        playerServiceAsync.setVolume(
            PlayerSetVolumeParams.builder()
                .volumePercent(50L)
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun skipNext() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        playerServiceAsync.skipNext(
            PlayerSkipNextParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun skipPrevious() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        playerServiceAsync.skipPrevious(
            PlayerSkipPreviousParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun startPlayback() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        playerServiceAsync.startPlayback(
            PlayerStartPlaybackParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .contextUri("spotify:album:5ht7ItJgpBH7W6vJ5BqpPr")
                .offset(
                    PlayerStartPlaybackParams.Offset.builder()
                        .putAdditionalProperty("position", JsonValue.from("bar"))
                        .build()
                )
                .positionMs(0L)
                .published(true)
                .addUris("string")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun toggleShuffle() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        playerServiceAsync.toggleShuffle(
            PlayerToggleShuffleParams.builder()
                .state(true)
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun transfer() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        playerServiceAsync.transfer(
            PlayerTransferParams.builder()
                .addDeviceId("74ASZWbe4lXaubB36ztrGX")
                .play(true)
                .published(true)
                .build()
        )
    }
}
