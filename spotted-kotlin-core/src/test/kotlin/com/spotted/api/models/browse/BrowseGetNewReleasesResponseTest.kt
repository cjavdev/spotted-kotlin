// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.browse

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.AlbumRestrictionObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.ImageObject
import com.spotted.api.models.SimplifiedArtistObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrowseGetNewReleasesResponseTest {

    @Test
    fun create() {
        val browseGetNewReleasesResponse =
            BrowseGetNewReleasesResponse.builder()
                .albums(
                    BrowseGetNewReleasesResponse.Albums.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .addItem(
                            BrowseGetNewReleasesResponse.Albums.Item.builder()
                                .id("2up3OPMp9Tb4dAKM2erWXQ")
                                .albumType(
                                    BrowseGetNewReleasesResponse.Albums.Item.AlbumType.COMPILATION
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
                                .releaseDatePrecision(
                                    BrowseGetNewReleasesResponse.Albums.Item.ReleaseDatePrecision
                                        .YEAR
                                )
                                .totalTracks(9L)
                                .type(BrowseGetNewReleasesResponse.Albums.Item.Type.ALBUM)
                                .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                                .restrictions(
                                    AlbumRestrictionObject.builder()
                                        .reason(AlbumRestrictionObject.Reason.MARKET)
                                        .build()
                                )
                                .build()
                        )
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
                        .build()
                )
                .build()

        assertThat(browseGetNewReleasesResponse.albums())
            .isEqualTo(
                BrowseGetNewReleasesResponse.Albums.builder()
                    .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                    .addItem(
                        BrowseGetNewReleasesResponse.Albums.Item.builder()
                            .id("2up3OPMp9Tb4dAKM2erWXQ")
                            .albumType(
                                BrowseGetNewReleasesResponse.Albums.Item.AlbumType.COMPILATION
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
                            .releaseDatePrecision(
                                BrowseGetNewReleasesResponse.Albums.Item.ReleaseDatePrecision.YEAR
                            )
                            .totalTracks(9L)
                            .type(BrowseGetNewReleasesResponse.Albums.Item.Type.ALBUM)
                            .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                            .restrictions(
                                AlbumRestrictionObject.builder()
                                    .reason(AlbumRestrictionObject.Reason.MARKET)
                                    .build()
                            )
                            .build()
                    )
                    .limit(20L)
                    .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .offset(0L)
                    .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .total(4L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val browseGetNewReleasesResponse =
            BrowseGetNewReleasesResponse.builder()
                .albums(
                    BrowseGetNewReleasesResponse.Albums.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .addItem(
                            BrowseGetNewReleasesResponse.Albums.Item.builder()
                                .id("2up3OPMp9Tb4dAKM2erWXQ")
                                .albumType(
                                    BrowseGetNewReleasesResponse.Albums.Item.AlbumType.COMPILATION
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
                                .releaseDatePrecision(
                                    BrowseGetNewReleasesResponse.Albums.Item.ReleaseDatePrecision
                                        .YEAR
                                )
                                .totalTracks(9L)
                                .type(BrowseGetNewReleasesResponse.Albums.Item.Type.ALBUM)
                                .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                                .restrictions(
                                    AlbumRestrictionObject.builder()
                                        .reason(AlbumRestrictionObject.Reason.MARKET)
                                        .build()
                                )
                                .build()
                        )
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
                        .build()
                )
                .build()

        val roundtrippedBrowseGetNewReleasesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(browseGetNewReleasesResponse),
                jacksonTypeRef<BrowseGetNewReleasesResponse>(),
            )

        assertThat(roundtrippedBrowseGetNewReleasesResponse).isEqualTo(browseGetNewReleasesResponse)
    }
}
