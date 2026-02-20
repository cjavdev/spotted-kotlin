// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlaylistServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val playlistService = client.me().playlists()

        val page = playlistService.list()

        page.response().validate()
    }
}
