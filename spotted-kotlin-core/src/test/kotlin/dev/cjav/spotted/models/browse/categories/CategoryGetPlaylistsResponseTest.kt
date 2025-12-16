// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.browse.categories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.PagingPlaylistObject
import dev.cjav.spotted.models.PlaylistTracksRefObject
import dev.cjav.spotted.models.PlaylistUserObject
import dev.cjav.spotted.models.SimplifiedPlaylistObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryGetPlaylistsResponseTest {

    @Test
    fun create() {
        val categoryGetPlaylistsResponse =
            CategoryGetPlaylistsResponse.builder()
                .message("Popular Playlists")
                .playlists(
                    PagingPlaylistObject.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
                        .addItem(
                            SimplifiedPlaylistObject.builder()
                                .id("id")
                                .collaborative(true)
                                .description("description")
                                .externalUrls(
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
                                )
                                .href("href")
                                .addImage(
                                    ImageObject.builder()
                                        .height(300L)
                                        .url(
                                            "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                        )
                                        .width(300L)
                                        .published(true)
                                        .build()
                                )
                                .name("name")
                                .owner(
                                    SimplifiedPlaylistObject.Owner.builder()
                                        .id("id")
                                        .externalUrls(
                                            ExternalUrlObject.builder()
                                                .published(true)
                                                .spotify("spotify")
                                                .build()
                                        )
                                        .href("href")
                                        .published(true)
                                        .type(PlaylistUserObject.Type.USER)
                                        .uri("uri")
                                        .displayName("display_name")
                                        .build()
                                )
                                .published(true)
                                .snapshotId("snapshot_id")
                                .tracks(
                                    PlaylistTracksRefObject.builder()
                                        .href("href")
                                        .published(true)
                                        .total(0L)
                                        .build()
                                )
                                .type("type")
                                .uri("uri")
                                .build()
                        )
                        .published(true)
                        .build()
                )
                .published(true)
                .build()

        assertThat(categoryGetPlaylistsResponse.message()).isEqualTo("Popular Playlists")
        assertThat(categoryGetPlaylistsResponse.playlists())
            .isEqualTo(
                PagingPlaylistObject.builder()
                    .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                    .limit(20L)
                    .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .offset(0L)
                    .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .total(4L)
                    .addItem(
                        SimplifiedPlaylistObject.builder()
                            .id("id")
                            .collaborative(true)
                            .description("description")
                            .externalUrls(
                                ExternalUrlObject.builder()
                                    .published(true)
                                    .spotify("spotify")
                                    .build()
                            )
                            .href("href")
                            .addImage(
                                ImageObject.builder()
                                    .height(300L)
                                    .url(
                                        "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                    )
                                    .width(300L)
                                    .published(true)
                                    .build()
                            )
                            .name("name")
                            .owner(
                                SimplifiedPlaylistObject.Owner.builder()
                                    .id("id")
                                    .externalUrls(
                                        ExternalUrlObject.builder()
                                            .published(true)
                                            .spotify("spotify")
                                            .build()
                                    )
                                    .href("href")
                                    .published(true)
                                    .type(PlaylistUserObject.Type.USER)
                                    .uri("uri")
                                    .displayName("display_name")
                                    .build()
                            )
                            .published(true)
                            .snapshotId("snapshot_id")
                            .tracks(
                                PlaylistTracksRefObject.builder()
                                    .href("href")
                                    .published(true)
                                    .total(0L)
                                    .build()
                            )
                            .type("type")
                            .uri("uri")
                            .build()
                    )
                    .published(true)
                    .build()
            )
        assertThat(categoryGetPlaylistsResponse.published()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val categoryGetPlaylistsResponse =
            CategoryGetPlaylistsResponse.builder()
                .message("Popular Playlists")
                .playlists(
                    PagingPlaylistObject.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
                        .addItem(
                            SimplifiedPlaylistObject.builder()
                                .id("id")
                                .collaborative(true)
                                .description("description")
                                .externalUrls(
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
                                )
                                .href("href")
                                .addImage(
                                    ImageObject.builder()
                                        .height(300L)
                                        .url(
                                            "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                        )
                                        .width(300L)
                                        .published(true)
                                        .build()
                                )
                                .name("name")
                                .owner(
                                    SimplifiedPlaylistObject.Owner.builder()
                                        .id("id")
                                        .externalUrls(
                                            ExternalUrlObject.builder()
                                                .published(true)
                                                .spotify("spotify")
                                                .build()
                                        )
                                        .href("href")
                                        .published(true)
                                        .type(PlaylistUserObject.Type.USER)
                                        .uri("uri")
                                        .displayName("display_name")
                                        .build()
                                )
                                .published(true)
                                .snapshotId("snapshot_id")
                                .tracks(
                                    PlaylistTracksRefObject.builder()
                                        .href("href")
                                        .published(true)
                                        .total(0L)
                                        .build()
                                )
                                .type("type")
                                .uri("uri")
                                .build()
                        )
                        .published(true)
                        .build()
                )
                .published(true)
                .build()

        val roundtrippedCategoryGetPlaylistsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(categoryGetPlaylistsResponse),
                jacksonTypeRef<CategoryGetPlaylistsResponse>(),
            )

        assertThat(roundtrippedCategoryGetPlaylistsResponse).isEqualTo(categoryGetPlaylistsResponse)
    }
}
