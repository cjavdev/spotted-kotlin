// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
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
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
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
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val topServiceAsync = client.me().top()

        val page = topServiceAsync.listTopTracks()

        page.response().validate()
    }
}
