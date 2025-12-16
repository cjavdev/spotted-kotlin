// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.artists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.AlbumRestrictionObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.SimplifiedArtistObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtistListAlbumsPageResponseTest {

    @Test
    fun create() {
        val artistListAlbumsPageResponse =
            ArtistListAlbumsPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .addItem(
                    ArtistListAlbumsResponse.builder()
                        .id("2up3OPMp9Tb4dAKM2erWXQ")
                        .albumGroup(ArtistListAlbumsResponse.AlbumGroup.COMPILATION)
                        .albumType(ArtistListAlbumsResponse.AlbumType.COMPILATION)
                        .addArtist(
                            SimplifiedArtistObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
                                )
                                .href("href")
                                .name("name")
                                .published(true)
                                .type(SimplifiedArtistObject.Type.ARTIST)
                                .uri("uri")
                                .build()
                        )
                        .availableMarkets(listOf("CA", "BR", "IT"))
                        .externalUrls(
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
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
                        .releaseDate("1981-12")
                        .releaseDatePrecision(ArtistListAlbumsResponse.ReleaseDatePrecision.YEAR)
                        .totalTracks(9L)
                        .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                        .published(true)
                        .restrictions(
                            AlbumRestrictionObject.builder()
                                .published(true)
                                .reason(AlbumRestrictionObject.Reason.MARKET)
                                .build()
                        )
                        .build()
                )
                .published(true)
                .build()

        assertThat(artistListAlbumsPageResponse.href())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
        assertThat(artistListAlbumsPageResponse.limit()).isEqualTo(20L)
        assertThat(artistListAlbumsPageResponse.next())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(artistListAlbumsPageResponse.offset()).isEqualTo(0L)
        assertThat(artistListAlbumsPageResponse.previous())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(artistListAlbumsPageResponse.total()).isEqualTo(4L)
        assertThat(artistListAlbumsPageResponse.items())
            .containsExactly(
                ArtistListAlbumsResponse.builder()
                    .id("2up3OPMp9Tb4dAKM2erWXQ")
                    .albumGroup(ArtistListAlbumsResponse.AlbumGroup.COMPILATION)
                    .albumType(ArtistListAlbumsResponse.AlbumType.COMPILATION)
                    .addArtist(
                        SimplifiedArtistObject.builder()
                            .id("id")
                            .externalUrls(
                                ExternalUrlObject.builder()
                                    .published(true)
                                    .spotify("spotify")
                                    .build()
                            )
                            .href("href")
                            .name("name")
                            .published(true)
                            .type(SimplifiedArtistObject.Type.ARTIST)
                            .uri("uri")
                            .build()
                    )
                    .availableMarkets(listOf("CA", "BR", "IT"))
                    .externalUrls(
                        ExternalUrlObject.builder().published(true).spotify("spotify").build()
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
                    .releaseDate("1981-12")
                    .releaseDatePrecision(ArtistListAlbumsResponse.ReleaseDatePrecision.YEAR)
                    .totalTracks(9L)
                    .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                    .published(true)
                    .restrictions(
                        AlbumRestrictionObject.builder()
                            .published(true)
                            .reason(AlbumRestrictionObject.Reason.MARKET)
                            .build()
                    )
                    .build()
            )
        assertThat(artistListAlbumsPageResponse.published()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artistListAlbumsPageResponse =
            ArtistListAlbumsPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .addItem(
                    ArtistListAlbumsResponse.builder()
                        .id("2up3OPMp9Tb4dAKM2erWXQ")
                        .albumGroup(ArtistListAlbumsResponse.AlbumGroup.COMPILATION)
                        .albumType(ArtistListAlbumsResponse.AlbumType.COMPILATION)
                        .addArtist(
                            SimplifiedArtistObject.builder()
                                .id("id")
                                .externalUrls(
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
                                )
                                .href("href")
                                .name("name")
                                .published(true)
                                .type(SimplifiedArtistObject.Type.ARTIST)
                                .uri("uri")
                                .build()
                        )
                        .availableMarkets(listOf("CA", "BR", "IT"))
                        .externalUrls(
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
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
                        .releaseDate("1981-12")
                        .releaseDatePrecision(ArtistListAlbumsResponse.ReleaseDatePrecision.YEAR)
                        .totalTracks(9L)
                        .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
                        .published(true)
                        .restrictions(
                            AlbumRestrictionObject.builder()
                                .published(true)
                                .reason(AlbumRestrictionObject.Reason.MARKET)
                                .build()
                        )
                        .build()
                )
                .published(true)
                .build()

        val roundtrippedArtistListAlbumsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artistListAlbumsPageResponse),
                jacksonTypeRef<ArtistListAlbumsPageResponse>(),
            )

        assertThat(roundtrippedArtistListAlbumsPageResponse).isEqualTo(artistListAlbumsPageResponse)
    }
}
