// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.browse

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

internal class BrowseGetFeaturedPlaylistsResponseTest {

    @Test
    fun create() {
        val browseGetFeaturedPlaylistsResponse =
            BrowseGetFeaturedPlaylistsResponse.builder()
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
                                .componentsSchemasPropertiesPublished(true)
                                .collaborative(true)
                                .description("description")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                                .snapshotId("snapshot_id")
                                .tracks(
                                    PlaylistTracksRefObject.builder().href("href").total(0L).build()
                                )
                                .type("type")
                                .uri("uri")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(browseGetFeaturedPlaylistsResponse.message()).isEqualTo("Popular Playlists")
        assertThat(browseGetFeaturedPlaylistsResponse.playlists())
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
                            .componentsSchemasPropertiesPublished(true)
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
                            .snapshotId("snapshot_id")
                            .tracks(
                                PlaylistTracksRefObject.builder().href("href").total(0L).build()
                            )
                            .type("type")
                            .uri("uri")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val browseGetFeaturedPlaylistsResponse =
            BrowseGetFeaturedPlaylistsResponse.builder()
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
                                .componentsSchemasPropertiesPublished(true)
                                .collaborative(true)
                                .description("description")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                                .snapshotId("snapshot_id")
                                .tracks(
                                    PlaylistTracksRefObject.builder().href("href").total(0L).build()
                                )
                                .type("type")
                                .uri("uri")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedBrowseGetFeaturedPlaylistsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(browseGetFeaturedPlaylistsResponse),
                jacksonTypeRef<BrowseGetFeaturedPlaylistsResponse>(),
            )

        assertThat(roundtrippedBrowseGetFeaturedPlaylistsResponse)
            .isEqualTo(browseGetFeaturedPlaylistsResponse)
    }
}
