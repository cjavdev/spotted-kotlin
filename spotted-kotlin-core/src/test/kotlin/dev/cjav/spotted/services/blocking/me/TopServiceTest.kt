// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TopServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listTopArtists() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val topService = client.me().top()

        val page = topService.listTopArtists()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listTopTracks() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val topService = client.me().top()

        val page = topService.listTopTracks()

        page.response().validate()
    }
}
