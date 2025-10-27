// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.playlists.PlaylistRetrieveParams
import com.spotted.api.models.playlists.PlaylistUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaylistServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val playlistServiceAsync = client.playlists()

        val playlist =
            playlistServiceAsync.retrieve(
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
    suspend fun update() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val playlistServiceAsync = client.playlists()

        playlistServiceAsync.update(
            PlaylistUpdateParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .collaborative(true)
                .description("Updated playlist description")
                .name("Updated Playlist Name")
                .public_(false)
                .build()
        )
    }
}
