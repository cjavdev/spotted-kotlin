// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.artists.ArtistBulkRetrieveParams
import com.spotted.api.models.artists.ArtistTopTracksParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ArtistServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val artistService = client.artists()

        val artistObject = artistService.retrieve("0TnOYISbd1XYRBk9myaseg")

        artistObject.validate()
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
        val artistService = client.artists()

        val response =
            artistService.bulkRetrieve(
                ArtistBulkRetrieveParams.builder()
                    .ids("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listAlbums() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val artistService = client.artists()

        val page = artistService.listAlbums("0TnOYISbd1XYRBk9myaseg")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRelatedArtists() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val artistService = client.artists()

        val response = artistService.listRelatedArtists("0TnOYISbd1XYRBk9myaseg")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun topTracks() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val artistService = client.artists()

        val response =
            artistService.topTracks(
                ArtistTopTracksParams.builder().id("0TnOYISbd1XYRBk9myaseg").market("ES").build()
            )

        response.validate()
    }
}
