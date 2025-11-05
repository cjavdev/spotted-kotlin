// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.me.albums.AlbumCheckParams
import com.spotted.api.models.me.albums.AlbumRemoveParams
import com.spotted.api.models.me.albums.AlbumSaveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AlbumServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val albumServiceAsync = client.me().albums()

        val page = albumServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun check() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val albumServiceAsync = client.me().albums()

        albumServiceAsync.check(
            AlbumCheckParams.builder()
                .ids("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun remove() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val albumServiceAsync = client.me().albums()

        albumServiceAsync.remove(AlbumRemoveParams.builder().addId("string").build())
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun save() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val albumServiceAsync = client.me().albums()

        albumServiceAsync.save(AlbumSaveParams.builder().addId("string").build())
    }
}
