// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TopServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listTopArtists() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val topServiceAsync = client.me().top()

        val page = topServiceAsync.listTopArtists()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listTopTracks() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val topServiceAsync = client.me().top()

        val page = topServiceAsync.listTopTracks()

        page.response().validate()
    }
}
