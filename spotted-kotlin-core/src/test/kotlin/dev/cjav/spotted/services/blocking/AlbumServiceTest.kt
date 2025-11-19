// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.albums.AlbumBulkRetrieveParams
import dev.cjav.spotted.models.albums.AlbumRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AlbumServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val albumService = client.albums()

        val album =
            albumService.retrieve(
                AlbumRetrieveParams.builder().id("4aawyAB9vmqN3uQ7FjRGTy").market("ES").build()
            )

        album.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val albumService = client.albums()

        val response =
            albumService.bulkRetrieve(
                AlbumBulkRetrieveParams.builder()
                    .ids("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                    .market("ES")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listTracks() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val albumService = client.albums()

        val page = albumService.listTracks("4aawyAB9vmqN3uQ7FjRGTy")

        page.response().validate()
    }
}
