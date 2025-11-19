// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.audiobooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.AuthorObject
import dev.cjav.spotted.models.ChapterRestrictionObject
import dev.cjav.spotted.models.CopyrightObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.NarratorObject
import dev.cjav.spotted.models.ResumePointObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudiobookRetrieveResponseTest {

    @Test
    fun create() {
        val audiobookRetrieveResponse =
            AudiobookRetrieveResponse.builder()
                .id("id")
                .addAuthor(AuthorObject.builder().name("name").build())
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
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .addLanguage("string")
                .mediaType("media_type")
                .name("name")
                .addNarrator(NarratorObject.builder().name("name").build())
                .publisher("publisher")
                .totalChapters(0L)
                .uri("uri")
                .edition("Unabridged")
                .chapters(
                    AudiobookRetrieveResponse.Chapters.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
                        .addItem(
                            SimplifiedChapterObject.builder()
                                .id("5Xt5DXGzch68nYYamXrNxZ")
                                .audioPreviewUrl(
                                    "https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17"
                                )
                                .chapterNumber(1L)
                                .description(
                                    "We kept on ascending, with occasional periods of quick descent, but in the main always ascending. Suddenly, I became conscious of the fact that the driver was in the act of pulling up the horses in the courtyard of a vast ruined castle, from whose tall black windows came no ray of light, and whose broken battlements showed a jagged line against the moonlit sky.\n"
                                )
                                .durationMs(1686230L)
                                .explicit(true)
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
                                .href("https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ")
                                .htmlDescription(
                                    "<p>We kept on ascending, with occasional periods of quick descent, but in the main always ascending. Suddenly, I became conscious of the fact that the driver was in the act of pulling up the horses in the courtyard of a vast ruined castle, from whose tall black windows came no ray of light, and whose broken battlements showed a jagged line against the moonlit sky.</p>\n"
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
                                .isPlayable(true)
                                .addLanguage("fr")
                                .addLanguage("en")
                                .name(
                                    "Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n"
                                )
                                .releaseDate("1981-12-15")
                                .releaseDatePrecision(
                                    SimplifiedChapterObject.ReleaseDatePrecision.DAY
                                )
                                .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                                .addAvailableMarket("string")
                                .restrictions(
                                    ChapterRestrictionObject.builder().reason("reason").build()
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
                .build()

        assertThat(audiobookRetrieveResponse.id()).isEqualTo("id")
        assertThat(audiobookRetrieveResponse.authors())
            .containsExactly(AuthorObject.builder().name("name").build())
        assertThat(audiobookRetrieveResponse.availableMarkets()).containsExactly("string")
        assertThat(audiobookRetrieveResponse.copyrights())
            .containsExactly(CopyrightObject.builder().text("text").type("type").build())
        assertThat(audiobookRetrieveResponse.description()).isEqualTo("description")
        assertThat(audiobookRetrieveResponse.explicit()).isEqualTo(true)
        assertThat(audiobookRetrieveResponse.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(audiobookRetrieveResponse.href()).isEqualTo("href")
        assertThat(audiobookRetrieveResponse.htmlDescription()).isEqualTo("html_description")
        assertThat(audiobookRetrieveResponse.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(audiobookRetrieveResponse.languages()).containsExactly("string")
        assertThat(audiobookRetrieveResponse.mediaType()).isEqualTo("media_type")
        assertThat(audiobookRetrieveResponse.name()).isEqualTo("name")
        assertThat(audiobookRetrieveResponse.narrators())
            .containsExactly(NarratorObject.builder().name("name").build())
        assertThat(audiobookRetrieveResponse.publisher()).isEqualTo("publisher")
        assertThat(audiobookRetrieveResponse.totalChapters()).isEqualTo(0L)
        assertThat(audiobookRetrieveResponse.uri()).isEqualTo("uri")
        assertThat(audiobookRetrieveResponse.edition()).isEqualTo("Unabridged")
        assertThat(audiobookRetrieveResponse.chapters())
            .isEqualTo(
                AudiobookRetrieveResponse.Chapters.builder()
                    .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                    .limit(20L)
                    .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .offset(0L)
                    .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .total(4L)
                    .addItem(
                        SimplifiedChapterObject.builder()
                            .id("5Xt5DXGzch68nYYamXrNxZ")
                            .audioPreviewUrl(
                                "https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17"
                            )
                            .chapterNumber(1L)
                            .description(
                                "We kept on ascending, with occasional periods of quick descent, but in the main always ascending. Suddenly, I became conscious of the fact that the driver was in the act of pulling up the horses in the courtyard of a vast ruined castle, from whose tall black windows came no ray of light, and whose broken battlements showed a jagged line against the moonlit sky.\n"
                            )
                            .durationMs(1686230L)
                            .explicit(true)
                            .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                            .href("https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ")
                            .htmlDescription(
                                "<p>We kept on ascending, with occasional periods of quick descent, but in the main always ascending. Suddenly, I became conscious of the fact that the driver was in the act of pulling up the horses in the courtyard of a vast ruined castle, from whose tall black windows came no ray of light, and whose broken battlements showed a jagged line against the moonlit sky.</p>\n"
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
                            .isPlayable(true)
                            .addLanguage("fr")
                            .addLanguage("en")
                            .name(
                                "Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n"
                            )
                            .releaseDate("1981-12-15")
                            .releaseDatePrecision(SimplifiedChapterObject.ReleaseDatePrecision.DAY)
                            .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                            .addAvailableMarket("string")
                            .restrictions(
                                ChapterRestrictionObject.builder().reason("reason").build()
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audiobookRetrieveResponse =
            AudiobookRetrieveResponse.builder()
                .id("id")
                .addAuthor(AuthorObject.builder().name("name").build())
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
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .addLanguage("string")
                .mediaType("media_type")
                .name("name")
                .addNarrator(NarratorObject.builder().name("name").build())
                .publisher("publisher")
                .totalChapters(0L)
                .uri("uri")
                .edition("Unabridged")
                .chapters(
                    AudiobookRetrieveResponse.Chapters.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
                        .addItem(
                            SimplifiedChapterObject.builder()
                                .id("5Xt5DXGzch68nYYamXrNxZ")
                                .audioPreviewUrl(
                                    "https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17"
                                )
                                .chapterNumber(1L)
                                .description(
                                    "We kept on ascending, with occasional periods of quick descent, but in the main always ascending. Suddenly, I became conscious of the fact that the driver was in the act of pulling up the horses in the courtyard of a vast ruined castle, from whose tall black windows came no ray of light, and whose broken battlements showed a jagged line against the moonlit sky.\n"
                                )
                                .durationMs(1686230L)
                                .explicit(true)
                                .externalUrls(
                                    ExternalUrlObject.builder().spotify("spotify").build()
                                )
                                .href("https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ")
                                .htmlDescription(
                                    "<p>We kept on ascending, with occasional periods of quick descent, but in the main always ascending. Suddenly, I became conscious of the fact that the driver was in the act of pulling up the horses in the courtyard of a vast ruined castle, from whose tall black windows came no ray of light, and whose broken battlements showed a jagged line against the moonlit sky.</p>\n"
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
                                .isPlayable(true)
                                .addLanguage("fr")
                                .addLanguage("en")
                                .name(
                                    "Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n"
                                )
                                .releaseDate("1981-12-15")
                                .releaseDatePrecision(
                                    SimplifiedChapterObject.ReleaseDatePrecision.DAY
                                )
                                .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                                .addAvailableMarket("string")
                                .restrictions(
                                    ChapterRestrictionObject.builder().reason("reason").build()
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
                .build()

        val roundtrippedAudiobookRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audiobookRetrieveResponse),
                jacksonTypeRef<AudiobookRetrieveResponse>(),
            )

        assertThat(roundtrippedAudiobookRetrieveResponse).isEqualTo(audiobookRetrieveResponse)
    }
}
