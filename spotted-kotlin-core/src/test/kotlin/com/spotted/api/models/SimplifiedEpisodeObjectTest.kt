// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplifiedEpisodeObjectTest {

    @Test
    fun create() {
        val simplifiedEpisodeObject =
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
                .releaseDatePrecision(SimplifiedEpisodeObject.ReleaseDatePrecision.DAY)
                .type(SimplifiedEpisodeObject.Type.EPISODE)
                .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                .language("en")
                .restrictions(EpisodeRestrictionObject.builder().reason("reason").build())
                .resumePoint(
                    ResumePointObject.builder().fullyPlayed(true).resumePositionMs(0L).build()
                )
                .build()

        assertThat(simplifiedEpisodeObject.id()).isEqualTo("5Xt5DXGzch68nYYamXrNxZ")
        assertThat(simplifiedEpisodeObject.audioPreviewUrl())
            .isEqualTo("https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17")
        assertThat(simplifiedEpisodeObject.description())
            .isEqualTo(
                "A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.\n"
            )
        assertThat(simplifiedEpisodeObject.durationMs()).isEqualTo(1686230L)
        assertThat(simplifiedEpisodeObject.explicit()).isEqualTo(true)
        assertThat(simplifiedEpisodeObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(simplifiedEpisodeObject.href())
            .isEqualTo("https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ")
        assertThat(simplifiedEpisodeObject.htmlDescription())
            .isEqualTo(
                "<p>A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.</p>\n"
            )
        assertThat(simplifiedEpisodeObject.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(simplifiedEpisodeObject.isExternallyHosted()).isEqualTo(true)
        assertThat(simplifiedEpisodeObject.isPlayable()).isEqualTo(true)
        assertThat(simplifiedEpisodeObject.languages()).containsExactly("fr", "en")
        assertThat(simplifiedEpisodeObject.name())
            .isEqualTo("Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators\n")
        assertThat(simplifiedEpisodeObject.releaseDate()).isEqualTo("1981-12-15")
        assertThat(simplifiedEpisodeObject.releaseDatePrecision())
            .isEqualTo(SimplifiedEpisodeObject.ReleaseDatePrecision.DAY)
        assertThat(simplifiedEpisodeObject.type()).isEqualTo(SimplifiedEpisodeObject.Type.EPISODE)
        assertThat(simplifiedEpisodeObject.uri())
            .isEqualTo("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
        assertThat(simplifiedEpisodeObject.language()).isEqualTo("en")
        assertThat(simplifiedEpisodeObject.restrictions())
            .isEqualTo(EpisodeRestrictionObject.builder().reason("reason").build())
        assertThat(simplifiedEpisodeObject.resumePoint())
            .isEqualTo(ResumePointObject.builder().fullyPlayed(true).resumePositionMs(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplifiedEpisodeObject =
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
                .releaseDatePrecision(SimplifiedEpisodeObject.ReleaseDatePrecision.DAY)
                .type(SimplifiedEpisodeObject.Type.EPISODE)
                .uri("spotify:episode:0zLhl3WsOCQHbe1BPTiHgr")
                .language("en")
                .restrictions(EpisodeRestrictionObject.builder().reason("reason").build())
                .resumePoint(
                    ResumePointObject.builder().fullyPlayed(true).resumePositionMs(0L).build()
                )
                .build()

        val roundtrippedSimplifiedEpisodeObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplifiedEpisodeObject),
                jacksonTypeRef<SimplifiedEpisodeObject>(),
            )

        assertThat(roundtrippedSimplifiedEpisodeObject).isEqualTo(simplifiedEpisodeObject)
    }
}
