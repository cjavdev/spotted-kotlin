// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.users

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.users.playlists.PlaylistCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaylistServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val playlistServiceAsync = client.users().playlists()

        val playlist =
            playlistServiceAsync.create(
                PlaylistCreateParams.builder()
                    .userId("smedjan")
                    .name("New Playlist")
                    .componentsSchemasPropertiesPublished(true)
                    .collaborative(true)
                    .description("New playlist description")
                    .build()
            )

        playlist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val playlistServiceAsync = client.users().playlists()

        val page = playlistServiceAsync.list("smedjan")

        page.response().validate()
    }
}
