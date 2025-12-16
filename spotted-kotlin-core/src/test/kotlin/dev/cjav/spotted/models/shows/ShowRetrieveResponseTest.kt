// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.shows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.CopyrightObject
import dev.cjav.spotted.models.EpisodeRestrictionObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.ResumePointObject
import dev.cjav.spotted.models.SimplifiedEpisodeObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowRetrieveResponseTest {

    @Test
    fun create() {
        val showRetrieveResponse =
            ShowRetrieveResponse.builder()
                .id("id")
                .addAvailableMarket("string")
                .addCopyright(
                    CopyrightObject.builder().published(true).text("text").type("type").build()
                )
                .description("description")
                .explicit(true)
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .href("href")
                .htmlDescription("html_description")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .published(true)
                        .build()
                )
                .isExternallyHosted(true)
                .addLanguage("string")
                .mediaType("media_type")
                .name("name")
                .publisher("publisher")
                .totalEpisodes(0L)
                .uri("uri")
                .published(true)
                .episodes(
                    ShowRetrieveResponse.Episodes.builder()
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
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
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
                                .releaseDatePrecision(
                                    SimplifiedEpisodeObject.ReleaseDatePrecision.DAY
                                )
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
                )
                .build()

        assertThat(showRetrieveResponse.id()).isEqualTo("id")
        assertThat(showRetrieveResponse.availableMarkets()).containsExactly("string")
        assertThat(showRetrieveResponse.copyrights())
            .containsExactly(
                CopyrightObject.builder().published(true).text("text").type("type").build()
            )
        assertThat(showRetrieveResponse.description()).isEqualTo("description")
        assertThat(showRetrieveResponse.explicit()).isEqualTo(true)
        assertThat(showRetrieveResponse.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().published(true).spotify("spotify").build())
        assertThat(showRetrieveResponse.href()).isEqualTo("href")
        assertThat(showRetrieveResponse.htmlDescription()).isEqualTo("html_description")
        assertThat(showRetrieveResponse.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .published(true)
                    .build()
            )
        assertThat(showRetrieveResponse.isExternallyHosted()).isEqualTo(true)
        assertThat(showRetrieveResponse.languages()).containsExactly("string")
        assertThat(showRetrieveResponse.mediaType()).isEqualTo("media_type")
        assertThat(showRetrieveResponse.name()).isEqualTo("name")
        assertThat(showRetrieveResponse.publisher()).isEqualTo("publisher")
        assertThat(showRetrieveResponse.totalEpisodes()).isEqualTo(0L)
        assertThat(showRetrieveResponse.uri()).isEqualTo("uri")
        assertThat(showRetrieveResponse.published()).isEqualTo(true)
        assertThat(showRetrieveResponse.episodes())
            .isEqualTo(
                ShowRetrieveResponse.Episodes.builder()
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
                                ExternalUrlObject.builder()
                                    .published(true)
                                    .spotify("spotify")
                                    .build()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val showRetrieveResponse =
            ShowRetrieveResponse.builder()
                .id("id")
                .addAvailableMarket("string")
                .addCopyright(
                    CopyrightObject.builder().published(true).text("text").type("type").build()
                )
                .description("description")
                .explicit(true)
                .externalUrls(
                    ExternalUrlObject.builder().published(true).spotify("spotify").build()
                )
                .href("href")
                .htmlDescription("html_description")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .published(true)
                        .build()
                )
                .isExternallyHosted(true)
                .addLanguage("string")
                .mediaType("media_type")
                .name("name")
                .publisher("publisher")
                .totalEpisodes(0L)
                .uri("uri")
                .published(true)
                .episodes(
                    ShowRetrieveResponse.Episodes.builder()
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
                                    ExternalUrlObject.builder()
                                        .published(true)
                                        .spotify("spotify")
                                        .build()
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
                                .releaseDatePrecision(
                                    SimplifiedEpisodeObject.ReleaseDatePrecision.DAY
                                )
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
                )
                .build()

        val roundtrippedShowRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(showRetrieveResponse),
                jacksonTypeRef<ShowRetrieveResponse>(),
            )

        assertThat(roundtrippedShowRetrieveResponse).isEqualTo(showRetrieveResponse)
    }
}
