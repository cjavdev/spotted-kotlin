// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaylistUpdateParamsTest {

    @Test
    fun create() {
        PlaylistUpdateParams.builder()
            .playlistId("3cEYpjA9oz9GiPac4AsH4n")
            .collaborative(true)
            .description("Updated playlist description")
            .name("Updated Playlist Name")
            .public_(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params = PlaylistUpdateParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        assertThat(params._pathParam(0)).isEqualTo("3cEYpjA9oz9GiPac4AsH4n")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlaylistUpdateParams.builder()
                .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                .collaborative(true)
                .description("Updated playlist description")
                .name("Updated Playlist Name")
                .public_(false)
                .build()

        val body = params._body()

        assertThat(body.collaborative()).isEqualTo(true)
        assertThat(body.description()).isEqualTo("Updated playlist description")
        assertThat(body.name()).isEqualTo("Updated Playlist Name")
        assertThat(body.public_()).isEqualTo(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlaylistUpdateParams.builder().playlistId("3cEYpjA9oz9GiPac4AsH4n").build()

        val body = params._body()
    }
}
