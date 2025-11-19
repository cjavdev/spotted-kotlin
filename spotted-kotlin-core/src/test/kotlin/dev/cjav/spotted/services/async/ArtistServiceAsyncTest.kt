// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.artists.ArtistBulkRetrieveParams
import dev.cjav.spotted.models.artists.ArtistTopTracksParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ArtistServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val artistServiceAsync = client.artists()

        val artistObject = artistServiceAsync.retrieve("0TnOYISbd1XYRBk9myaseg")

        artistObject.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun bulkRetrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val artistServiceAsync = client.artists()

        val response =
            artistServiceAsync.bulkRetrieve(
                ArtistBulkRetrieveParams.builder()
                    .ids("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listAlbums() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val artistServiceAsync = client.artists()

        val page = artistServiceAsync.listAlbums("0TnOYISbd1XYRBk9myaseg")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listRelatedArtists() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val artistServiceAsync = client.artists()

        val response = artistServiceAsync.listRelatedArtists("0TnOYISbd1XYRBk9myaseg")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun topTracks() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val artistServiceAsync = client.artists()

        val response =
            artistServiceAsync.topTracks(
                ArtistTopTracksParams.builder().id("0TnOYISbd1XYRBk9myaseg").market("ES").build()
            )

        response.validate()
    }
}
