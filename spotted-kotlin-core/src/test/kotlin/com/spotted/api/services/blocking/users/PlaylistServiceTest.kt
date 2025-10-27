// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.users

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.users.playlists.PlaylistCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaylistServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val playlistService = client.users().playlists()

        val playlist =
            playlistService.create(
                PlaylistCreateParams.builder()
                    .userId("smedjan")
                    .name("New Playlist")
                    .collaborative(true)
                    .description("New playlist description")
                    .public_(false)
                    .build()
            )

        playlist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val playlistService = client.users().playlists()

        val page = playlistService.list("smedjan")

        page.response().validate()
    }
}
