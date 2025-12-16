// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplifiedTrackObjectTest {

    @Test
    fun create() {
        val simplifiedTrackObject =
            SimplifiedTrackObject.builder()
                .id("id")
                .addArtist(
                    SimplifiedArtistObject.builder()
                        .id("id")
                        .externalUrls(
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
                        )
                        .href("href")
                        .name("name")
                        .published(true)
                        .type(SimplifiedArtistObject.Type.ARTIST)
                        .uri("uri")
                        .build()
                )
                .addAvailableMarket("string")
                .discNumber(0L)
                .durationMs(0L)
                .explicit(true)
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .href("href")
                .isLocal(true)
                .isPlayable(true)
                .linkedFrom(
                    LinkedTrackObject.builder()
                        .id("id")
                        .externalUrls(
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
                        )
                        .href("href")
                        .published(true)
                        .type("type")
                        .uri("uri")
                        .build()
                )
                .name("name")
                .previewUrl("preview_url")
                .published(true)
                .restrictions(
                    TrackRestrictionObject.builder().published(true).reason("reason").build()
                )
                .trackNumber(0L)
                .type("type")
                .uri("uri")
                .build()

        assertThat(simplifiedTrackObject.id()).isEqualTo("id")
        assertThat(simplifiedTrackObject.artists())
            .containsExactly(
                SimplifiedArtistObject.builder()
                    .id("id")
                    .externalUrls(
                        ExternalUrlObject.builder().published(true).spotify("spotify").build()
                    )
                    .href("href")
                    .name("name")
                    .published(true)
                    .type(SimplifiedArtistObject.Type.ARTIST)
                    .uri("uri")
                    .build()
            )
        assertThat(simplifiedTrackObject.availableMarkets()).containsExactly("string")
        assertThat(simplifiedTrackObject.discNumber()).isEqualTo(0L)
        assertThat(simplifiedTrackObject.durationMs()).isEqualTo(0L)
        assertThat(simplifiedTrackObject.explicit()).isEqualTo(true)
        assertThat(simplifiedTrackObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().published(true).spotify("spotify").build())
        assertThat(simplifiedTrackObject.href()).isEqualTo("href")
        assertThat(simplifiedTrackObject.isLocal()).isEqualTo(true)
        assertThat(simplifiedTrackObject.isPlayable()).isEqualTo(true)
        assertThat(simplifiedTrackObject.linkedFrom())
            .isEqualTo(
                LinkedTrackObject.builder()
                    .id("id")
                    .externalUrls(
                        ExternalUrlObject.builder().published(true).spotify("spotify").build()
                    )
                    .href("href")
                    .published(true)
                    .type("type")
                    .uri("uri")
                    .build()
            )
        assertThat(simplifiedTrackObject.name()).isEqualTo("name")
        assertThat(simplifiedTrackObject.previewUrl()).isEqualTo("preview_url")
        assertThat(simplifiedTrackObject.published()).isEqualTo(true)
        assertThat(simplifiedTrackObject.restrictions())
            .isEqualTo(TrackRestrictionObject.builder().published(true).reason("reason").build())
        assertThat(simplifiedTrackObject.trackNumber()).isEqualTo(0L)
        assertThat(simplifiedTrackObject.type()).isEqualTo("type")
        assertThat(simplifiedTrackObject.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplifiedTrackObject =
            SimplifiedTrackObject.builder()
                .id("id")
                .addArtist(
                    SimplifiedArtistObject.builder()
                        .id("id")
                        .externalUrls(
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
                        )
                        .href("href")
                        .name("name")
                        .published(true)
                        .type(SimplifiedArtistObject.Type.ARTIST)
                        .uri("uri")
                        .build()
                )
                .addAvailableMarket("string")
                .discNumber(0L)
                .durationMs(0L)
                .explicit(true)
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .href("href")
                .isLocal(true)
                .isPlayable(true)
                .linkedFrom(
                    LinkedTrackObject.builder()
                        .id("id")
                        .externalUrls(
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
                        )
                        .href("href")
                        .published(true)
                        .type("type")
                        .uri("uri")
                        .build()
                )
                .name("name")
                .previewUrl("preview_url")
                .published(true)
                .restrictions(
                    TrackRestrictionObject.builder().published(true).reason("reason").build()
                )
                .trackNumber(0L)
                .type("type")
                .uri("uri")
                .build()

        val roundtrippedSimplifiedTrackObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplifiedTrackObject),
                jacksonTypeRef<SimplifiedTrackObject>(),
            )

        assertThat(roundtrippedSimplifiedTrackObject).isEqualTo(simplifiedTrackObject)
    }
}
