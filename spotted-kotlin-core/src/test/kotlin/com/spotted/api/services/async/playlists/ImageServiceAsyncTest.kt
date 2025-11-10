// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.playlists

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ImageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val imageServiceAsync = client.playlists().images()

        imageServiceAsync.update("3cEYpjA9oz9GiPac4AsH4n", "some content")
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
        val imageServiceAsync = client.playlists().images()

        val imageObjects = imageServiceAsync.list("3cEYpjA9oz9GiPac4AsH4n")

        imageObjects.forEach { it.validate() }
    }
}
