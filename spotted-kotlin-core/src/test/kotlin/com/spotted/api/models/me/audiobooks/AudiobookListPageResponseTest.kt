// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.audiobooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.AuthorObject
import com.spotted.api.models.ChapterRestrictionObject
import com.spotted.api.models.CopyrightObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.ImageObject
import com.spotted.api.models.NarratorObject
import com.spotted.api.models.ResumePointObject
import com.spotted.api.models.audiobooks.SimplifiedChapterObject
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudiobookListPageResponseTest {

    @Test
    fun create() {
        val audiobookListPageResponse =
            AudiobookListPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .addItem(
                    AudiobookListResponse.builder()
                        .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .audiobook(
                            AudiobookListResponse.Audiobook.builder()
                                .id("id")
                                .addAuthor(AuthorObject.builder().name("name").build())
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
                                .addLanguage("string")
                                .mediaType("media_type")
                                .name("name")
                                .addNarrator(NarratorObject.builder().name("name").build())
                                .publisher("publisher")
                                .totalChapters(0L)
                                .uri("uri")
                                .edition("Unabridged")
                                .chapters(
                                    AudiobookListResponse.Audiobook.Chapters.builder()
                                        .href(
                                            "https://api.spotify.com/v1/me/shows?offset=0&limit=20\n"
                                        )
                                        .limit(20L)
                                        .next(
                                            "https://api.spotify.com/v1/me/shows?offset=1&limit=1"
                                        )
                                        .offset(0L)
                                        .previous(
                                            "https://api.spotify.com/v1/me/shows?offset=1&limit=1"
                                        )
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
                                                    ExternalUrlObject.builder()
                                                        .spotify("spotify")
                                                        .build()
                                                )
                                                .href(
                                                    "https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ"
                                                )
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
                                                    ChapterRestrictionObject.builder()
                                                        .reason("reason")
                                                        .build()
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
                        )
                        .build()
                )
                .build()

        assertThat(audiobookListPageResponse.href())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
        assertThat(audiobookListPageResponse.limit()).isEqualTo(20L)
        assertThat(audiobookListPageResponse.next())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(audiobookListPageResponse.offset()).isEqualTo(0L)
        assertThat(audiobookListPageResponse.previous())
            .isEqualTo("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
        assertThat(audiobookListPageResponse.total()).isEqualTo(4L)
        assertThat(audiobookListPageResponse.items())
            .containsExactly(
                AudiobookListResponse.builder()
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .audiobook(
                        AudiobookListResponse.Audiobook.builder()
                            .id("id")
                            .addAuthor(AuthorObject.builder().name("name").build())
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
                            .addLanguage("string")
                            .mediaType("media_type")
                            .name("name")
                            .addNarrator(NarratorObject.builder().name("name").build())
                            .publisher("publisher")
                            .totalChapters(0L)
                            .uri("uri")
                            .edition("Unabridged")
                            .chapters(
                                AudiobookListResponse.Audiobook.Chapters.builder()
                                    .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                                    .limit(20L)
                                    .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                                    .offset(0L)
                                    .previous(
                                        "https://api.spotify.com/v1/me/shows?offset=1&limit=1"
                                    )
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
                                                ExternalUrlObject.builder()
                                                    .spotify("spotify")
                                                    .build()
                                            )
                                            .href(
                                                "https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ"
                                            )
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
                                                ChapterRestrictionObject.builder()
                                                    .reason("reason")
                                                    .build()
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
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audiobookListPageResponse =
            AudiobookListPageResponse.builder()
                .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                .limit(20L)
                .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .offset(0L)
                .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                .total(4L)
                .addItem(
                    AudiobookListResponse.builder()
                        .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .audiobook(
                            AudiobookListResponse.Audiobook.builder()
                                .id("id")
                                .addAuthor(AuthorObject.builder().name("name").build())
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
                                .addLanguage("string")
                                .mediaType("media_type")
                                .name("name")
                                .addNarrator(NarratorObject.builder().name("name").build())
                                .publisher("publisher")
                                .totalChapters(0L)
                                .uri("uri")
                                .edition("Unabridged")
                                .chapters(
                                    AudiobookListResponse.Audiobook.Chapters.builder()
                                        .href(
                                            "https://api.spotify.com/v1/me/shows?offset=0&limit=20\n"
                                        )
                                        .limit(20L)
                                        .next(
                                            "https://api.spotify.com/v1/me/shows?offset=1&limit=1"
                                        )
                                        .offset(0L)
                                        .previous(
                                            "https://api.spotify.com/v1/me/shows?offset=1&limit=1"
                                        )
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
                                                    ExternalUrlObject.builder()
                                                        .spotify("spotify")
                                                        .build()
                                                )
                                                .href(
                                                    "https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ"
                                                )
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
                                                    ChapterRestrictionObject.builder()
                                                        .reason("reason")
                                                        .build()
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
                        )
                        .build()
                )
                .build()

        val roundtrippedAudiobookListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audiobookListPageResponse),
                jacksonTypeRef<AudiobookListPageResponse>(),
            )

        assertThat(roundtrippedAudiobookListPageResponse).isEqualTo(audiobookListPageResponse)
    }
}
