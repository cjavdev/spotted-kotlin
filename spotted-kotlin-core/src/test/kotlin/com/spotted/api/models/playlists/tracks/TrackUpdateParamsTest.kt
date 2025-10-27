// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.tracks

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackUpdateParamsTest {

    @Test
    fun create() {
        TrackUpdateParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .queryUris("uris")
            .insertBefore(3L)
            .rangeLength(2L)
            .rangeStart(1L)
            .snapshotId("snapshot_id")
            .addBodyUris("string")
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
    fun queryParams() {
        val params =
            TrackUpdateParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .queryUris("uris")
                .insertBefore(3L)
                .rangeLength(2L)
                .rangeStart(1L)
                .snapshotId("snapshot_id")
                .addBodyUris("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("uris", "uris").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TrackUpdateParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            TrackUpdateParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .queryUris("uris")
                .insertBefore(3L)
                .rangeLength(2L)
                .rangeStart(1L)
                .snapshotId("snapshot_id")
                .addBodyUris("string")
                .build()

        val body = params._body()

        assertThat(body.insertBefore()).isEqualTo(3L)
        assertThat(body.rangeLength()).isEqualTo(2L)
        assertThat(body.rangeStart()).isEqualTo(1L)
        assertThat(body.snapshotId()).isEqualTo("snapshot_id")
        assertThat(body.bodyUris()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TrackUpdateParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val body = params._body()
    }
}
