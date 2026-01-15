// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me.player

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.me.player.queue.QueueAddParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class QueueServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun add() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val queueServiceAsync = client.me().player().queue()

        queueServiceAsync.add(
            QueueAddParams.builder()
                .uri("spotify:track:4iV5W9uYEdYUVa79Axb7Rh")
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun get() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val queueServiceAsync = client.me().player().queue()

        val queue = queueServiceAsync.get()

        queue.validate()
    }
}
