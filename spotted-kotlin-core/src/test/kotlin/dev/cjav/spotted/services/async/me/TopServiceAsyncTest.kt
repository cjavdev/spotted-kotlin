// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TopServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listTopArtists() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val topServiceAsync = client.me().top()

        val page = topServiceAsync.listTopArtists()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listTopTracks() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val topServiceAsync = client.me().top()

        val page = topServiceAsync.listTopTracks()

        page.response().validate()
    }
}
