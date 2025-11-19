// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.tracks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackUpdateParamsTest {

    @Test
    fun create() {
        TrackUpdateParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .insertBefore(3L)
            .rangeLength(2L)
            .rangeStart(1L)
            .snapshotId("snapshot_id")
            .addUris("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = TrackUpdateParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TrackUpdateParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .insertBefore(3L)
                .rangeLength(2L)
                .rangeStart(1L)
                .snapshotId("snapshot_id")
                .addUris("string")
                .build()

        val body = params._body()

        assertThat(body.insertBefore()).isEqualTo(3L)
        assertThat(body.rangeLength()).isEqualTo(2L)
        assertThat(body.rangeStart()).isEqualTo(1L)
        assertThat(body.snapshotId()).isEqualTo("snapshot_id")
        assertThat(body.uris()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TrackUpdateParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val body = params._body()
    }
}
