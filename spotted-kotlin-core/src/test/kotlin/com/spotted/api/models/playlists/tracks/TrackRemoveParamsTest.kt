// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.tracks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackRemoveParamsTest {

    @Test
    fun create() {
        TrackRemoveParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .addTrack(TrackRemoveParams.Track.builder().uri("uri").build())
            .snapshotId("snapshot_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TrackRemoveParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .addTrack(TrackRemoveParams.Track.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TrackRemoveParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .addTrack(TrackRemoveParams.Track.builder().uri("uri").build())
                .snapshotId("snapshot_id")
                .build()

        val body = params._body()

        assertThat(body.tracks())
            .containsExactly(TrackRemoveParams.Track.builder().uri("uri").build())
        assertThat(body.snapshotId()).isEqualTo("snapshot_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TrackRemoveParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .addTrack(TrackRemoveParams.Track.builder().build())
                .build()

        val body = params._body()

        assertThat(body.tracks()).containsExactly(TrackRemoveParams.Track.builder().build())
    }
}
