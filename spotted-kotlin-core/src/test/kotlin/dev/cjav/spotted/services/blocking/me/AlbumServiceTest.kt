// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.me.albums.AlbumCheckParams
import dev.cjav.spotted.models.me.albums.AlbumRemoveParams
import dev.cjav.spotted.models.me.albums.AlbumSaveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AlbumServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val albumService = client.me().albums()

        val page = albumService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun check() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val albumService = client.me().albums()

        albumService.check(
            AlbumCheckParams.builder()
                .ids("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val albumService = client.me().albums()

        albumService.remove(AlbumRemoveParams.builder().addId("string").published(true).build())
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun save() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val albumService = client.me().albums()

        albumService.save(AlbumSaveParams.builder().addId("string").published(true).build())
    }
}
