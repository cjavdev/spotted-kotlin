// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.albums

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.LinkedTrackObject
import com.spotted.api.models.SimplifiedArtistObject
import com.spotted.api.models.SimplifiedTrackObject
import com.spotted.api.models.TrackRestrictionObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlbumListTracksPageResponseTest {

    @Test
    fun create() {
        val albumListTracksPageResponse =
            AlbumListTracksPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .addItem(
                    SimplifiedTrackObject.builder()
                        .id("id")
                        .addArtist(
                            SimplifiedArtistObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
                                .href("href")
                                .name("name")
                                .type(SimplifiedArtistObject.Type.ARTIST)
                                .uri("uri")
                                .build()
                        )
                        .addAvailableMarket("string")
                        .discNumber(0L)
                        .durationMs(0L)
                        .explicit(true)
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .isLocal(true)
                        .isPlayable(true)
                        .linkedFrom(
                            LinkedTrackObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
                                .href("href")
                                .type("type")
                                .uri("uri")
                                .build()
                        )
                        .name("name")
                        .previewUrl("preview_url")
                        .restrictions(TrackRestrictionObject.builder().reason("reason").build())
                        .trackNumber(0L)
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

        assertThat(albumListTracksPageResponse.href())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
        assertThat(albumListTracksPageResponse.items())
            .containsExactly(
                SimplifiedTrackObject.builder()
                    .id("id")
                    .addArtist(
                        SimplifiedArtistObject.builder()
                            .id("id")
                            .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                            .href("href")
                            .name("name")
                            .type(SimplifiedArtistObject.Type.ARTIST)
                            .uri("uri")
                            .build()
                    )
                    .addAvailableMarket("string")
                    .discNumber(0L)
                    .durationMs(0L)
                    .explicit(true)
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .href("href")
                    .isLocal(true)
                    .isPlayable(true)
                    .linkedFrom(
                        LinkedTrackObject.builder()
                            .id("id")
                            .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                            .href("href")
                            .type("type")
                            .uri("uri")
                            .build()
                    )
                    .name("name")
                    .previewUrl("preview_url")
                    .restrictions(TrackRestrictionObject.builder().reason("reason").build())
                    .trackNumber(0L)
                    .type("type")
                    .uri("uri")
                    .build()
            )
        assertThat(albumListTracksPageResponse.limit()).isEqualTo(20L)
        assertThat(albumListTracksPageResponse.next())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(albumListTracksPageResponse.offset()).isEqualTo(0L)
        assertThat(albumListTracksPageResponse.previous())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(albumListTracksPageResponse.total()).isEqualTo(4L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val albumListTracksPageResponse =
            AlbumListTracksPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .addItem(
                    SimplifiedTrackObject.builder()
                        .id("id")
                        .addArtist(
                            SimplifiedArtistObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
                                .href("href")
                                .name("name")
                                .type(SimplifiedArtistObject.Type.ARTIST)
                                .uri("uri")
                                .build()
                        )
                        .addAvailableMarket("string")
                        .discNumber(0L)
                        .durationMs(0L)
                        .explicit(true)
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .isLocal(true)
                        .isPlayable(true)
                        .linkedFrom(
                            LinkedTrackObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
                                .href("href")
                                .type("type")
                                .uri("uri")
                                .build()
                        )
                        .name("name")
                        .previewUrl("preview_url")
                        .restrictions(TrackRestrictionObject.builder().reason("reason").build())
                        .trackNumber(0L)
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

        val roundtrippedAlbumListTracksPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(albumListTracksPageResponse),
                jacksonTypeRef<AlbumListTracksPageResponse>(),
            )

        assertThat(roundtrippedAlbumListTracksPageResponse).isEqualTo(albumListTracksPageResponse)
    }
}
