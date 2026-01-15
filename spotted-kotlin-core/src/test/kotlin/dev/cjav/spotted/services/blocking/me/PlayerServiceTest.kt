// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
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
internal class PlayerServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getCurrentlyPlaying() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        val response =
            playerService.getCurrentlyPlaying(
                PlayerGetCurrentlyPlayingParams.builder()
                    .additionalTypes("additional_types")
                    .market("ES")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getDevices() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        val response = playerService.getDevices()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getState() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        val response =
            playerService.getState(
                PlayerGetStateParams.builder()
                    .additionalTypes("additional_types")
                    .market("ES")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRecentlyPlayed() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        val page = playerService.listRecentlyPlayed()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun pausePlayback() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        playerService.pausePlayback(
            PlayerPausePlaybackParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun seekToPosition() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        playerService.seekToPosition(
            PlayerSeekToPositionParams.builder()
                .positionMs(25000L)
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setRepeatMode() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        playerService.setRepeatMode(
            PlayerSetRepeatModeParams.builder()
                .state("context")
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setVolume() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        playerService.setVolume(
            PlayerSetVolumeParams.builder()
                .volumePercent(50L)
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun skipNext() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        playerService.skipNext(
            PlayerSkipNextParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun skipPrevious() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        playerService.skipPrevious(
            PlayerSkipPreviousParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startPlayback() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        playerService.startPlayback(
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
    fun toggleShuffle() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        playerService.toggleShuffle(
            PlayerToggleShuffleParams.builder()
                .state(true)
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun transfer() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerService = client.me().player()

        playerService.transfer(
            PlayerTransferParams.builder()
                .addDeviceId("74ASZWbe4lXaubB36ztrGX")
                .play(true)
                .published(true)
                .build()
        )
    }
}
