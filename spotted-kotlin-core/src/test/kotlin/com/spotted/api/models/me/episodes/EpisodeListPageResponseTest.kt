// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.episodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.CopyrightObject
import com.spotted.api.models.EpisodeObject
import com.spotted.api.models.EpisodeRestrictionObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.ImageObject
import com.spotted.api.models.ResumePointObject
import com.spotted.api.models.ShowBase
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeListPageResponseTest {

    @Test
    fun create() {
        val episodeListPageResponse =
            EpisodeListPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .addItem(
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
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                                            CopyrightObject.builder()
                                                .text("text")
                                                .type("type")
                                                .build()
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
                                        .type(ShowBase.Type.SHOW)
                                        .uri("uri")
                                        .build()
                                )
                                .type(EpisodeObject.Type.EPISODE)
                                .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                                .language("en")
                                .restrictions(
                                    EpisodeRestrictionObject.builder().reason("reason").build()
                                )
                                .resumePoint(
                                    ResumePointObject.builder()
                                        .fullyPlayed(true)
                                        .resumePositionMs(0L)
                                        .build()
                                )
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

        assertThat(episodeListPageResponse.href())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
        assertThat(episodeListPageResponse.items())
            .containsExactly(
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
                                    .type(ShowBase.Type.SHOW)
                                    .uri("uri")
                                    .build()
                            )
                            .type(EpisodeObject.Type.EPISODE)
                            .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                            .language("en")
                            .restrictions(
                                EpisodeRestrictionObject.builder().reason("reason").build()
                            )
                            .resumePoint(
                                ResumePointObject.builder()
                                    .fullyPlayed(true)
                                    .resumePositionMs(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(episodeListPageResponse.limit()).isEqualTo(20L)
        assertThat(episodeListPageResponse.next())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(episodeListPageResponse.offset()).isEqualTo(0L)
        assertThat(episodeListPageResponse.previous())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(episodeListPageResponse.total()).isEqualTo(4L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val episodeListPageResponse =
            EpisodeListPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .addItem(
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
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
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
                                            CopyrightObject.builder()
                                                .text("text")
                                                .type("type")
                                                .build()
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
                                        .type(ShowBase.Type.SHOW)
                                        .uri("uri")
                                        .build()
                                )
                                .type(EpisodeObject.Type.EPISODE)
                                .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                                .language("en")
                                .restrictions(
                                    EpisodeRestrictionObject.builder().reason("reason").build()
                                )
                                .resumePoint(
                                    ResumePointObject.builder()
                                        .fullyPlayed(true)
                                        .resumePositionMs(0L)
                                        .build()
                                )
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

        val roundtrippedEpisodeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(episodeListPageResponse),
                jacksonTypeRef<EpisodeListPageResponse>(),
            )

        assertThat(roundtrippedEpisodeListPageResponse).isEqualTo(episodeListPageResponse)
    }
}
