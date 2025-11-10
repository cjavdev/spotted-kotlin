// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.tracks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.AlbumRestrictionObject
import com.spotted.api.models.ExternalIdObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.ImageObject
import com.spotted.api.models.LinkedTrackObject
import com.spotted.api.models.SimplifiedArtistObject
import com.spotted.api.models.TrackObject
import com.spotted.api.models.TrackRestrictionObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackBulkRetrieveResponseTest {

    @Test
    fun create() {
        val trackBulkRetrieveResponse =
            TrackBulkRetrieveResponse.builder()
                .addTrack(
                    TrackObject.builder()
                        .id("id")
                        .album(
                            TrackObject.Album.builder()
                                .id("2up3OPMp9Tb4dAKM2erWXQ")
                                .albumType(TrackObject.Album.AlbumType.COMPILATION)
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
                                .availableMarkets(listOf("CA", "BR", "IT"))
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
                                .releaseDate("1981-12")
                                .releaseDatePrecision(TrackObject.Album.ReleaseDatePrecision.YEAR)
                                .totalTracks(9L)
                                .type(TrackObject.Album.Type.ALBUM)
                                .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                                .restrictions(
                                    AlbumRestrictionObject.builder()
                                        .reason(AlbumRestrictionObject.Reason.MARKET)
                                        .build()
                                )
                                .build()
                        )
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
                        .externalIds(
                            ExternalIdObject.builder().ean("ean").isrc("isrc").upc("upc").build()
                        )
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
                        .popularity(0L)
                        .previewUrl("preview_url")
                        .restrictions(TrackRestrictionObject.builder().reason("reason").build())
                        .trackNumber(0L)
                        .type(TrackObject.Type.TRACK)
                        .uri("uri")
                        .build()
                )
                .build()

        assertThat(trackBulkRetrieveResponse.tracks())
            .containsExactly(
                TrackObject.builder()
                    .id("id")
                    .album(
                        TrackObject.Album.builder()
                            .id("2up3OPMp9Tb4dAKM2erWXQ")
                            .albumType(TrackObject.Album.AlbumType.COMPILATION)
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
                            .availableMarkets(listOf("CA", "BR", "IT"))
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
                            .releaseDate("1981-12")
                            .releaseDatePrecision(TrackObject.Album.ReleaseDatePrecision.YEAR)
                            .totalTracks(9L)
                            .type(TrackObject.Album.Type.ALBUM)
                            .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                            .restrictions(
                                AlbumRestrictionObject.builder()
                                    .reason(AlbumRestrictionObject.Reason.MARKET)
                                    .build()
                            )
                            .build()
                    )
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
                    .externalIds(
                        ExternalIdObject.builder().ean("ean").isrc("isrc").upc("upc").build()
                    )
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
                    .popularity(0L)
                    .previewUrl("preview_url")
                    .restrictions(TrackRestrictionObject.builder().reason("reason").build())
                    .trackNumber(0L)
                    .type(TrackObject.Type.TRACK)
                    .uri("uri")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trackBulkRetrieveResponse =
            TrackBulkRetrieveResponse.builder()
                .addTrack(
                    TrackObject.builder()
                        .id("id")
                        .album(
                            TrackObject.Album.builder()
                                .id("2up3OPMp9Tb4dAKM2erWXQ")
                                .albumType(TrackObject.Album.AlbumType.COMPILATION)
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
                                .availableMarkets(listOf("CA", "BR", "IT"))
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
                                .releaseDate("1981-12")
                                .releaseDatePrecision(TrackObject.Album.ReleaseDatePrecision.YEAR)
                                .totalTracks(9L)
                                .type(TrackObject.Album.Type.ALBUM)
                                .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                                .restrictions(
                                    AlbumRestrictionObject.builder()
                                        .reason(AlbumRestrictionObject.Reason.MARKET)
                                        .build()
                                )
                                .build()
                        )
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
                        .externalIds(
                            ExternalIdObject.builder().ean("ean").isrc("isrc").upc("upc").build()
                        )
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
                        .popularity(0L)
                        .previewUrl("preview_url")
                        .restrictions(TrackRestrictionObject.builder().reason("reason").build())
                        .trackNumber(0L)
                        .type(TrackObject.Type.TRACK)
                        .uri("uri")
                        .build()
                )
                .build()

        val roundtrippedTrackBulkRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trackBulkRetrieveResponse),
                jacksonTypeRef<TrackBulkRetrieveResponse>(),
            )

        assertThat(roundtrippedTrackBulkRetrieveResponse).isEqualTo(trackBulkRetrieveResponse)
    }
}
