// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.episodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.CopyrightObject
import dev.cjav.spotted.models.EpisodeObject
import dev.cjav.spotted.models.EpisodeRestrictionObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.ResumePointObject
import dev.cjav.spotted.models.ShowBase
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeListResponseTest {

    @Test
    fun create() {
        val episodeListResponse =
            EpisodeListResponse.builder()
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .episode(
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
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .isExternallyHosted(true)
                        .isPlayable(true)
                        .addLanguage("fr")
                        .addLanguage("en")
                        .name(
                            "Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n"
                        )
                        .releaseDate("1981-12-15")
                        .releaseDatePrecision(EpisodeObject.ReleaseDatePrecision.DAY)
                        .show(
                            ShowBase.builder()
                                .id("id")
                                .addAvailableMarket("string")
                                .addCopyright(
                                    CopyrightObject.builder().text("text").type("type").build()
                                )
                                .description("description")
                                .explicit(true)
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                            ResumePointObject.builder()
                                .fullyPlayed(true)
                                .resumePositionMs(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(episodeListResponse.addedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(episodeListResponse.episode())
            .isEqualTo(
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
                            .url(
                                "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                            )
                            .width(300L)
                            .build()
                    )
                    .isExternallyHosted(true)
                    .isPlayable(true)
                    .addLanguage("fr")
                    .addLanguage("en")
                    .name(
                        "Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n"
                    )
                    .releaseDate("1981-12-15")
                    .releaseDatePrecision(EpisodeObject.ReleaseDatePrecision.DAY)
                    .show(
                        ShowBase.builder()
                            .id("id")
                            .addAvailableMarket("string")
                            .addCopyright(
                                CopyrightObject.builder().text("text").type("type").build()
                            )
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val episodeListResponse =
            EpisodeListResponse.builder()
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .episode(
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
                                .url(
                                    "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                )
                                .width(300L)
                                .build()
                        )
                        .isExternallyHosted(true)
                        .isPlayable(true)
                        .addLanguage("fr")
                        .addLanguage("en")
                        .name(
                            "Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n"
                        )
                        .releaseDate("1981-12-15")
                        .releaseDatePrecision(EpisodeObject.ReleaseDatePrecision.DAY)
                        .show(
                            ShowBase.builder()
                                .id("id")
                                .addAvailableMarket("string")
                                .addCopyright(
                                    CopyrightObject.builder().text("text").type("type").build()
                                )
                                .description("description")
                                .explicit(true)
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                            ResumePointObject.builder()
                                .fullyPlayed(true)
                                .resumePositionMs(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEpisodeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(episodeListResponse),
                jacksonTypeRef<EpisodeListResponse>(),
            )

        assertThat(roundtrippedEpisodeListResponse).isEqualTo(episodeListResponse)
    }
}
