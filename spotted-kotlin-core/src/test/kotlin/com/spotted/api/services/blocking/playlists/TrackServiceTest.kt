// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.playlists

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.playlists.tracks.TrackAddParams
import com.spotted.api.models.playlists.tracks.TrackRemoveParams
import com.spotted.api.models.playlists.tracks.TrackUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TrackServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val trackService = client.playlists().tracks()

        val track =
            trackService.update(
                TrackUpdateParams.builder()
                    .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                    .queryUris("uris")
                    .insertBefore(3L)
                    .rangeLength(2L)
                    .rangeStart(1L)
                    .snapshotId("snapshot_id")
                    .addBodyUris("string")
                    .build()
            )

        track.validate()
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
        val trackService = client.playlists().tracks()

        val page = trackService.list("3cEYpjA9oz9GiPac4AsH4n")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val trackService = client.playlists().tracks()

        val response =
            trackService.add(
                TrackAddParams.builder()
                    .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                    .queryPosition(0L)
                    .queryUris(
                        "spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M"
                    )
                    .bodyPosition(0L)
                    .addBodyUris("string")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val trackService = client.playlists().tracks()

        val track =
            trackService.remove(
                TrackRemoveParams.builder()
                    .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                    .addTrack(TrackRemoveParams.Track.builder().uri("uri").build())
                    .snapshotId("snapshot_id")
                    .build()
            )

        track.validate()
    }
}
