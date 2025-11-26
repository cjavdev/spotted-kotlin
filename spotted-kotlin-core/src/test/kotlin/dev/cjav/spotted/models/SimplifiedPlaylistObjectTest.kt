// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplifiedPlaylistObjectTest {

    @Test
    fun create() {
        val simplifiedPlaylistObject =
            SimplifiedPlaylistObject.builder()
                .id("id")
                .collaborative(true)
                .description("description")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .name("name")
                .owner(
                    SimplifiedPlaylistObject.Owner.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .type(PlaylistUserObject.Type.USER)
                        .uri("uri")
                        .displayName("display_name")
                        .build()
                )
                .published(true)
                .snapshotId("snapshot_id")
                .tracks(PlaylistTracksRefObject.builder().href("href").total(0L).build())
                .type("type")
                .uri("uri")
                .build()

        assertThat(simplifiedPlaylistObject.id()).isEqualTo("id")
        assertThat(simplifiedPlaylistObject.collaborative()).isEqualTo(true)
        assertThat(simplifiedPlaylistObject.description()).isEqualTo("description")
        assertThat(simplifiedPlaylistObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(simplifiedPlaylistObject.href()).isEqualTo("href")
        assertThat(simplifiedPlaylistObject.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(simplifiedPlaylistObject.name()).isEqualTo("name")
        assertThat(simplifiedPlaylistObject.owner())
            .isEqualTo(
                SimplifiedPlaylistObject.Owner.builder()
                    .id("id")
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .href("href")
                    .type(PlaylistUserObject.Type.USER)
                    .uri("uri")
                    .displayName("display_name")
                    .build()
            )
        assertThat(simplifiedPlaylistObject.published()).isEqualTo(true)
        assertThat(simplifiedPlaylistObject.snapshotId()).isEqualTo("snapshot_id")
        assertThat(simplifiedPlaylistObject.tracks())
            .isEqualTo(PlaylistTracksRefObject.builder().href("href").total(0L).build())
        assertThat(simplifiedPlaylistObject.type()).isEqualTo("type")
        assertThat(simplifiedPlaylistObject.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplifiedPlaylistObject =
            SimplifiedPlaylistObject.builder()
                .id("id")
                .collaborative(true)
                .description("description")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .name("name")
                .owner(
                    SimplifiedPlaylistObject.Owner.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .type(PlaylistUserObject.Type.USER)
                        .uri("uri")
                        .displayName("display_name")
                        .build()
                )
                .published(true)
                .snapshotId("snapshot_id")
                .tracks(PlaylistTracksRefObject.builder().href("href").total(0L).build())
                .type("type")
                .uri("uri")
                .build()

        val roundtrippedSimplifiedPlaylistObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplifiedPlaylistObject),
                jacksonTypeRef<SimplifiedPlaylistObject>(),
            )

        assertThat(roundtrippedSimplifiedPlaylistObject).isEqualTo(simplifiedPlaylistObject)
    }
}
