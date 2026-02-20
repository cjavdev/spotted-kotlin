// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.users

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.users.playlists.PlaylistCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlaylistServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val playlistServiceAsync = client.users().playlists()

        val playlist =
            playlistServiceAsync.create(
                PlaylistCreateParams.builder()
                    .userId("smedjan")
                    .name("New Playlist")
                    .collaborative(true)
                    .description("New playlist description")
                    .published(true)
                    .build()
            )

        playlist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val playlistServiceAsync = client.users().playlists()

        val page = playlistServiceAsync.list("smedjan")

        page.response().validate()
    }
}
