// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagingPlaylistObjectTest {

    @Test
    fun create() {
        val pagingPlaylistObject =
            PagingPlaylistObject.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .addItem(
                    SimplifiedPlaylistObject.builder()
                        .id("id")
                        .collaborative(true)
                        .description("description")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .addImage(
                            ImageObject.builder()
                                .height(300L)
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .name("name")
                        .owner(
                            SimplifiedPlaylistObject.Owner.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
                                .href("href")
                                .type(PlaylistUserObject.Type.USER)
                                .uri("uri")
                                .displayName("display_name")
                                .build()
                        )
                        .public_(true)
                        .snapshotId("snapshot_id")
                        .tracks(PlaylistTracksRefObject.builder().href("href").total(0L).build())
                        .type("type")
                        .uri("uri")
                        .build()
                )
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .build()

        assertThat(pagingPlaylistObject.href())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
        assertThat(pagingPlaylistObject.items())
            .containsExactly(
                SimplifiedPlaylistObject.builder()
                    .id("id")
                    .collaborative(true)
                    .description("description")
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .href("href")
                    .addImage(
                        ImageObject.builder()
                            .height(300L)
                            .url(
                                "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                            )
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
                    .public_(true)
                    .snapshotId("snapshot_id")
                    .tracks(PlaylistTracksRefObject.builder().href("href").total(0L).build())
                    .type("type")
                    .uri("uri")
                    .build()
            )
        assertThat(pagingPlaylistObject.limit()).isEqualTo(20L)
        assertThat(pagingPlaylistObject.next())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(pagingPlaylistObject.offset()).isEqualTo(0L)
        assertThat(pagingPlaylistObject.previous())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(pagingPlaylistObject.total()).isEqualTo(4L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pagingPlaylistObject =
            PagingPlaylistObject.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .addItem(
                    SimplifiedPlaylistObject.builder()
                        .id("id")
                        .collaborative(true)
                        .description("description")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .addImage(
                            ImageObject.builder()
                                .height(300L)
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .name("name")
                        .owner(
                            SimplifiedPlaylistObject.Owner.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
                                .href("href")
                                .type(PlaylistUserObject.Type.USER)
                                .uri("uri")
                                .displayName("display_name")
                                .build()
                        )
                        .public_(true)
                        .snapshotId("snapshot_id")
                        .tracks(PlaylistTracksRefObject.builder().href("href").total(0L).build())
                        .type("type")
                        .uri("uri")
                        .build()
                )
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .build()

        val roundtrippedPagingPlaylistObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pagingPlaylistObject),
                jacksonTypeRef<PagingPlaylistObject>(),
            )

        assertThat(roundtrippedPagingPlaylistObject).isEqualTo(pagingPlaylistObject)
    }
}
