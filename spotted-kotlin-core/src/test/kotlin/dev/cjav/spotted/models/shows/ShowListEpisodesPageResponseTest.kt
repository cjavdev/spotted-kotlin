// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.shows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.EpisodeRestrictionObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.ResumePointObject
import dev.cjav.spotted.models.SimplifiedEpisodeObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowListEpisodesPageResponseTest {

    @Test
    fun create() {
        val showListEpisodesPageResponse =
            ShowListEpisodesPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .addItem(
                    SimplifiedEpisodeObject.builder()
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
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
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
                                .published(true)
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
                        .releaseDatePrecision(SimplifiedEpisodeObject.ReleaseDatePrecision.DAY)
                        .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                        .language("en")
                        .published(true)
                        .restrictions(
                            EpisodeRestrictionObject.builder()
                                .published(true)
                                .reason("reason")
                                .build()
                        )
                        .resumePoint(
                            ResumePointObject.builder()
                                .fullyPlayed(true)
                                .published(true)
                                .resumePositionMs(0L)
                                .build()
                        )
                        .build()
                )
                .published(true)
                .build()

        assertThat(showListEpisodesPageResponse.href())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
        assertThat(showListEpisodesPageResponse.limit()).isEqualTo(20L)
        assertThat(showListEpisodesPageResponse.next())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(showListEpisodesPageResponse.offset()).isEqualTo(0L)
        assertThat(showListEpisodesPageResponse.previous())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(showListEpisodesPageResponse.total()).isEqualTo(4L)
        assertThat(showListEpisodesPageResponse.items())
            .containsExactly(
                SimplifiedEpisodeObject.builder()
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
                        ExternalUrlObject.builder().published(true).spotify("spotify").build()
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
                            .published(true)
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
                    .releaseDatePrecision(SimplifiedEpisodeObject.ReleaseDatePrecision.DAY)
                    .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                    .language("en")
                    .published(true)
                    .restrictions(
                        EpisodeRestrictionObject.builder().published(true).reason("reason").build()
                    )
                    .resumePoint(
                        ResumePointObject.builder()
                            .fullyPlayed(true)
                            .published(true)
                            .resumePositionMs(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(showListEpisodesPageResponse.published()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val showListEpisodesPageResponse =
            ShowListEpisodesPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .addItem(
                    SimplifiedEpisodeObject.builder()
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
                            ExternalUrlObject.builder().published(true).spotify("spotify").build()
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
                                .published(true)
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
                        .releaseDatePrecision(SimplifiedEpisodeObject.ReleaseDatePrecision.DAY)
                        .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                        .language("en")
                        .published(true)
                        .restrictions(
                            EpisodeRestrictionObject.builder()
                                .published(true)
                                .reason("reason")
                                .build()
                        )
                        .resumePoint(
                            ResumePointObject.builder()
                                .fullyPlayed(true)
                                .published(true)
                                .resumePositionMs(0L)
                                .build()
                        )
                        .build()
                )
                .published(true)
                .build()

        val roundtrippedShowListEpisodesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(showListEpisodesPageResponse),
                jacksonTypeRef<ShowListEpisodesPageResponse>(),
            )

        assertThat(roundtrippedShowListEpisodesPageResponse).isEqualTo(showListEpisodesPageResponse)
    }
}
