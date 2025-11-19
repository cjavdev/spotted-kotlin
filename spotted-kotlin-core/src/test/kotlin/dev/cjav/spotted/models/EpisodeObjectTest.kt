// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeObjectTest {

    @Test
    fun create() {
        val episodeObject =
            EpisodeObject.builder()
                .id("5Xt5DXGzch68nYYamXrNxZ")
                .audioPreviewUrl(
                    "https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17"
                )
                .description(
                    "A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.\n"
                )
                .durationMs(1686230L)
                .explicit(true)
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ")
                .htmlDescription(
                    "<p>A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.</p>\n"
                )
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .isExternallyHosted(true)
                .isPlayable(true)
                .addLanguage("fr")
                .addLanguage("en")
                .name("Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n")
                .releaseDate("1981-12-15")
                .releaseDatePrecision(EpisodeObject.ReleaseDatePrecision.DAY)
                .show(
                    ShowBase.builder()
                        .id("id")
                        .addAvailableMarket("string")
                        .addCopyright(CopyrightObject.builder().text("text").type("type").build())
                        .description("description")
                        .explicit(true)
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .htmlDescription("html_description")
                        .addImage(
                            ImageObject.builder()
                                .height(300L)
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .isExternallyHosted(true)
                        .addLanguage("string")
                        .mediaType("media_type")
                        .name("name")
                        .publisher("publisher")
                        .totalEpisodes(0L)
                        .uri("uri")
                        .build()
                )
                .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                .language("en")
                .restrictions(EpisodeRestrictionObject.builder().reason("reason").build())
                .resumePoint(
                    ResumePointObject.builder().fullyPlayed(true).resumePositionMs(0L).build()
                )
                .build()

        assertThat(episodeObject.id()).isEqualTo("5Xt5DXGzch68nYYamXrNxZ")
        assertThat(episodeObject.audioPreviewUrl())
            .isEqualTo("https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17")
        assertThat(episodeObject.description())
            .isEqualTo(
                "A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.\n"
            )
        assertThat(episodeObject.durationMs()).isEqualTo(1686230L)
        assertThat(episodeObject.explicit()).isEqualTo(true)
        assertThat(episodeObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(episodeObject.href())
            .isEqualTo("https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ")
        assertThat(episodeObject.htmlDescription())
            .isEqualTo(
                "<p>A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.</p>\n"
            )
        assertThat(episodeObject.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(episodeObject.isExternallyHosted()).isEqualTo(true)
        assertThat(episodeObject.isPlayable()).isEqualTo(true)
        assertThat(episodeObject.languages()).containsExactly("fr", "en")
        assertThat(episodeObject.name())
            .isEqualTo("Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n")
        assertThat(episodeObject.releaseDate()).isEqualTo("1981-12-15")
        assertThat(episodeObject.releaseDatePrecision())
            .isEqualTo(EpisodeObject.ReleaseDatePrecision.DAY)
        assertThat(episodeObject.show())
            .isEqualTo(
                ShowBase.builder()
                    .id("id")
                    .addAvailableMarket("string")
                    .addCopyright(CopyrightObject.builder().text("text").type("type").build())
                    .description("description")
                    .explicit(true)
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .href("href")
                    .htmlDescription("html_description")
                    .addImage(
                        ImageObject.builder()
                            .height(300L)
                            .url(
                                "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                            )
                            .width(300L)
                            .build()
                    )
                    .isExternallyHosted(true)
                    .addLanguage("string")
                    .mediaType("media_type")
                    .name("name")
                    .publisher("publisher")
                    .totalEpisodes(0L)
                    .uri("uri")
                    .build()
            )
        assertThat(episodeObject.uri()).isEqualTo("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
        assertThat(episodeObject.language()).isEqualTo("en")
        assertThat(episodeObject.restrictions())
            .isEqualTo(EpisodeRestrictionObject.builder().reason("reason").build())
        assertThat(episodeObject.resumePoint())
            .isEqualTo(ResumePointObject.builder().fullyPlayed(true).resumePositionMs(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val episodeObject =
            EpisodeObject.builder()
                .id("5Xt5DXGzch68nYYamXrNxZ")
                .audioPreviewUrl(
                    "https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17"
                )
                .description(
                    "A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.\n"
                )
                .durationMs(1686230L)
                .explicit(true)
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ")
                .htmlDescription(
                    "<p>A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.</p>\n"
                )
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .isExternallyHosted(true)
                .isPlayable(true)
                .addLanguage("fr")
                .addLanguage("en")
                .name("Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n")
                .releaseDate("1981-12-15")
                .releaseDatePrecision(EpisodeObject.ReleaseDatePrecision.DAY)
                .show(
                    ShowBase.builder()
                        .id("id")
                        .addAvailableMarket("string")
                        .addCopyright(CopyrightObject.builder().text("text").type("type").build())
                        .description("description")
                        .explicit(true)
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .htmlDescription("html_description")
                        .addImage(
                            ImageObject.builder()
                                .height(300L)
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .isExternallyHosted(true)
                        .addLanguage("string")
                        .mediaType("media_type")
                        .name("name")
                        .publisher("publisher")
                        .totalEpisodes(0L)
                        .uri("uri")
                        .build()
                )
                .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                .language("en")
                .restrictions(EpisodeRestrictionObject.builder().reason("reason").build())
                .resumePoint(
                    ResumePointObject.builder().fullyPlayed(true).resumePositionMs(0L).build()
                )
                .build()

        val roundtrippedEpisodeObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(episodeObject),
                jacksonTypeRef<EpisodeObject>(),
            )

        assertThat(roundtrippedEpisodeObject).isEqualTo(episodeObject)
    }
}
