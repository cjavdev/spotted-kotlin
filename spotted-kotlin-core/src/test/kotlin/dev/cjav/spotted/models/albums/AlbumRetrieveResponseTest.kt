// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.albums

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.AlbumRestrictionObject
import dev.cjav.spotted.models.CopyrightObject
import dev.cjav.spotted.models.ExternalIdObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.LinkedTrackObject
import dev.cjav.spotted.models.SimplifiedArtistObject
import dev.cjav.spotted.models.SimplifiedTrackObject
import dev.cjav.spotted.models.TrackRestrictionObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlbumRetrieveResponseTest {

    @Test
    fun create() {
        val albumRetrieveResponse =
            AlbumRetrieveResponse.builder()
                .id("2up3OPMp9Tb4dAKM2erWXQ")
                .albumType(AlbumRetrieveResponse.AlbumType.COMPILATION)
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
                .releaseDatePrecision(AlbumRetrieveResponse.ReleaseDatePrecision.YEAR)
                .totalTracks(9L)
                .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
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
                .addCopyright(CopyrightObject.builder().text("text").type("type").build())
                .externalIds(ExternalIdObject.builder().ean("ean").isrc("isrc").upc("upc").build())
                .addGenre("string")
                .label("label")
                .popularity(0L)
                .restrictions(
                    AlbumRestrictionObject.builder()
                        .reason(AlbumRestrictionObject.Reason.MARKET)
                        .build()
                )
                .tracks(
                    AlbumRetrieveResponse.Tracks.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
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
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                                .restrictions(
                                    TrackRestrictionObject.builder().reason("reason").build()
                                )
                                .trackNumber(0L)
                                .type("type")
                                .uri("uri")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(albumRetrieveResponse.id()).isEqualTo("2up3OPMp9Tb4dAKM2erWXQ")
        assertThat(albumRetrieveResponse.albumType())
            .isEqualTo(AlbumRetrieveResponse.AlbumType.COMPILATION)
        assertThat(albumRetrieveResponse.availableMarkets()).containsExactly("CA", "BR", "IT")
        assertThat(albumRetrieveResponse.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(albumRetrieveResponse.href()).isEqualTo("href")
        assertThat(albumRetrieveResponse.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(albumRetrieveResponse.name()).isEqualTo("name")
        assertThat(albumRetrieveResponse.releaseDate()).isEqualTo("1981-12")
        assertThat(albumRetrieveResponse.releaseDatePrecision())
            .isEqualTo(AlbumRetrieveResponse.ReleaseDatePrecision.YEAR)
        assertThat(albumRetrieveResponse.totalTracks()).isEqualTo(9L)
        assertThat(albumRetrieveResponse.uri()).isEqualTo("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
        assertThat(albumRetrieveResponse.artists())
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
        assertThat(albumRetrieveResponse.copyrights())
            .containsExactly(CopyrightObject.builder().text("text").type("type").build())
        assertThat(albumRetrieveResponse.externalIds())
            .isEqualTo(ExternalIdObject.builder().ean("ean").isrc("isrc").upc("upc").build())
        assertThat(albumRetrieveResponse.genres()).containsExactly("string")
        assertThat(albumRetrieveResponse.label()).isEqualTo("label")
        assertThat(albumRetrieveResponse.popularity()).isEqualTo(0L)
        assertThat(albumRetrieveResponse.restrictions())
            .isEqualTo(
                AlbumRestrictionObject.builder()
                    .reason(AlbumRestrictionObject.Reason.MARKET)
                    .build()
            )
        assertThat(albumRetrieveResponse.tracks())
            .isEqualTo(
                AlbumRetrieveResponse.Tracks.builder()
                    .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                    .limit(20L)
                    .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .offset(0L)
                    .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .total(4L)
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
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val albumRetrieveResponse =
            AlbumRetrieveResponse.builder()
                .id("2up3OPMp9Tb4dAKM2erWXQ")
                .albumType(AlbumRetrieveResponse.AlbumType.COMPILATION)
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
                .releaseDatePrecision(AlbumRetrieveResponse.ReleaseDatePrecision.YEAR)
                .totalTracks(9L)
                .uri("spotify:album:2up3OPMp9Tb4dAKM2erWXQ")
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
                .addCopyright(CopyrightObject.builder().text("text").type("type").build())
                .externalIds(ExternalIdObject.builder().ean("ean").isrc("isrc").upc("upc").build())
                .addGenre("string")
                .label("label")
                .popularity(0L)
                .restrictions(
                    AlbumRestrictionObject.builder()
                        .reason(AlbumRestrictionObject.Reason.MARKET)
                        .build()
                )
                .tracks(
                    AlbumRetrieveResponse.Tracks.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
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
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                                .restrictions(
                                    TrackRestrictionObject.builder().reason("reason").build()
                                )
                                .trackNumber(0L)
                                .type("type")
                                .uri("uri")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedAlbumRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(albumRetrieveResponse),
                jacksonTypeRef<AlbumRetrieveResponse>(),
            )

        assertThat(roundtrippedAlbumRetrieveResponse).isEqualTo(albumRetrieveResponse)
    }
}
