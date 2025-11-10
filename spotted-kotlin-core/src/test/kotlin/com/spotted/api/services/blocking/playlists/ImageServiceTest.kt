// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.playlists

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ImageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val imageService = client.playlists().images()

        imageService.update("3cEYpjA9oz9GiPac4AsH4n", "some content")
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
        val imageService = client.playlists().images()

        val imageObjects = imageService.list("3cEYpjA9oz9GiPac4AsH4n")

        imageObjects.forEach { it.validate() }
    }
}
