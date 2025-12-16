// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.playlists.PlaylistRetrieveParams
import dev.cjav.spotted.models.playlists.PlaylistUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaylistServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val playlistService = client.playlists()

        val playlist =
            playlistService.retrieve(
                PlaylistRetrieveParams.builder()
                    .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                    .additionalTypes("additional_types")
                    .fields("items(added_by.id,track(name,href,album(name,href)))")
                    .market("ES")
                    .build()
            )

        playlist.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val playlistService = client.playlists()

        playlistService.update(
            PlaylistUpdateParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .collaborative(true)
                .description("Updated playlist description")
                .name("Updated Playlist Name")
                .public_(false)
                .published(true)
                .build()
        )
    }
}
