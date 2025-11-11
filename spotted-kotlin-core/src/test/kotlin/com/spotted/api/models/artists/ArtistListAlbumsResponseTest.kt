// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.artists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.AlbumRestrictionObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.ImageObject
import com.spotted.api.models.SimplifiedArtistObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtistListAlbumsResponseTest {

    @Test
    fun create() {
        val artistListAlbumsResponse =
            ArtistListAlbumsResponse.builder()
                .id("2up3OPMp9Tb4dAKM2erWXQ")
                .albumGroup(ArtistListAlbumsResponse.AlbumGroup.COMPILATION)
                .albumType(ArtistListAlbumsResponse.AlbumType.COMPILATION)
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
                .availableMarkets(listOf("CA", "BR", "IT"))
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
                .releaseDate("1981-12")
                .releaseDatePrecision(ArtistListAlbumsResponse.ReleaseDatePrecision.YEAR)
                .totalTracks(9L)
                .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                .restrictions(
                    AlbumRestrictionObject.builder()
                        .reason(AlbumRestrictionObject.Reason.MARKET)
                        .build()
                )
                .build()

        assertThat(artistListAlbumsResponse.id()).isEqualTo("2up3OPMp9Tb4dAKM2erWXQ")
        assertThat(artistListAlbumsResponse.albumGroup())
            .isEqualTo(ArtistListAlbumsResponse.AlbumGroup.COMPILATION)
        assertThat(artistListAlbumsResponse.albumType())
            .isEqualTo(ArtistListAlbumsResponse.AlbumType.COMPILATION)
        assertThat(artistListAlbumsResponse.artists())
            .containsExactly(
                SimplifiedArtistObject.builder()
                    .id("id")
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .href("href")
                    .name("name")
                    .type(SimplifiedArtistObject.Type.ARTIST)
                    .uri("uri")
                    .build()
            )
        assertThat(artistListAlbumsResponse.availableMarkets()).containsExactly("CA", "BR", "IT")
        assertThat(artistListAlbumsResponse.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(artistListAlbumsResponse.href()).isEqualTo("href")
        assertThat(artistListAlbumsResponse.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(artistListAlbumsResponse.name()).isEqualTo("name")
        assertThat(artistListAlbumsResponse.releaseDate()).isEqualTo("1981-12")
        assertThat(artistListAlbumsResponse.releaseDatePrecision())
            .isEqualTo(ArtistListAlbumsResponse.ReleaseDatePrecision.YEAR)
        assertThat(artistListAlbumsResponse.totalTracks()).isEqualTo(9L)
        assertThat(artistListAlbumsResponse.uri()).isEqualTo("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
        assertThat(artistListAlbumsResponse.restrictions())
            .isEqualTo(
                AlbumRestrictionObject.builder()
                    .reason(AlbumRestrictionObject.Reason.MARKET)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artistListAlbumsResponse =
            ArtistListAlbumsResponse.builder()
                .id("2up3OPMp9Tb4dAKM2erWXQ")
                .albumGroup(ArtistListAlbumsResponse.AlbumGroup.COMPILATION)
                .albumType(ArtistListAlbumsResponse.AlbumType.COMPILATION)
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
                .availableMarkets(listOf("CA", "BR", "IT"))
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
                .releaseDate("1981-12")
                .releaseDatePrecision(ArtistListAlbumsResponse.ReleaseDatePrecision.YEAR)
                .totalTracks(9L)
                .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                .restrictions(
                    AlbumRestrictionObject.builder()
                        .reason(AlbumRestrictionObject.Reason.MARKET)
                        .build()
                )
                .build()

        val roundtrippedArtistListAlbumsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artistListAlbumsResponse),
                jacksonTypeRef<ArtistListAlbumsResponse>(),
            )

        assertThat(roundtrippedArtistListAlbumsResponse).isEqualTo(artistListAlbumsResponse)
    }
}
