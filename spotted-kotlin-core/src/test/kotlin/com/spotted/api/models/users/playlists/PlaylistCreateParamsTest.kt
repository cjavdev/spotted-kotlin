// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.users.playlists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaylistCreateParamsTest {

    @Test
    fun create() {
        PlaylistCreateParams.builder()
            .userId("smedjan")
            .name("New Playlist")
            .collaborative(true)
            .description("New playlist description")
            .public_(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params = PlaylistCreateParams.builder().userId("smedjan").name("New Playlist").build()

        assertThat(params._pathParam(0)).isEqualTo("smedjan")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlaylistCreateParams.builder()
                .userId("smedjan")
                .name("New Playlist")
                .collaborative(true)
                .description("New playlist description")
                .public_(false)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("New Playlist")
        assertThat(body.collaborative()).isEqualTo(true)
        assertThat(body.description()).isEqualTo("New playlist description")
        assertThat(body.public_()).isEqualTo(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlaylistCreateParams.builder().userId("smedjan").name("New Playlist").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("New Playlist")
    }
}
