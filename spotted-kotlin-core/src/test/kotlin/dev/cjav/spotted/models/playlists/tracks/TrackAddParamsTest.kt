// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.tracks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackAddParamsTest {

    @Test
    fun create() {
        TrackAddParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .position(0L)
            .published(true)
            .addUris("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = TrackAddParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TrackAddParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .position(0L)
                .published(true)
                .addUris("string")
                .build()

        val body = params._body()

        assertThat(body.position()).isEqualTo(0L)
        assertThat(body.published()).isEqualTo(true)
        assertThat(body.uris()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TrackAddParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val body = params._body()
    }
}
