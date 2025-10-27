// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaylistUserObjectTest {

    @Test
    fun create() {
        val playlistUserObject =
            PlaylistUserObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .type(PlaylistUserObject.Type.USER)
                .uri("uri")
                .build()

        assertThat(playlistUserObject.id()).isEqualTo("id")
        assertThat(playlistUserObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(playlistUserObject.href()).isEqualTo("href")
        assertThat(playlistUserObject.type()).isEqualTo(PlaylistUserObject.Type.USER)
        assertThat(playlistUserObject.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playlistUserObject =
            PlaylistUserObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .type(PlaylistUserObject.Type.USER)
                .uri("uri")
                .build()

        val roundtrippedPlaylistUserObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playlistUserObject),
                jacksonTypeRef<PlaylistUserObject>(),
            )

        assertThat(roundtrippedPlaylistUserObject).isEqualTo(playlistUserObject)
    }
}
