// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaylistTracksRefObjectTest {

    @Test
    fun create() {
        val playlistTracksRefObject =
            PlaylistTracksRefObject.builder().href("href").published(true).total(0L).build()

        assertThat(playlistTracksRefObject.href()).isEqualTo("href")
        assertThat(playlistTracksRefObject.published()).isEqualTo(true)
        assertThat(playlistTracksRefObject.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playlistTracksRefObject =
            PlaylistTracksRefObject.builder().href("href").published(true).total(0L).build()

        val roundtrippedPlaylistTracksRefObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playlistTracksRefObject),
                jacksonTypeRef<PlaylistTracksRefObject>(),
            )

        assertThat(roundtrippedPlaylistTracksRefObject).isEqualTo(playlistTracksRefObject)
    }
}
