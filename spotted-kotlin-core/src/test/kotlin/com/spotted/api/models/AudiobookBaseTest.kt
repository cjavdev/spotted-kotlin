// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudiobookBaseTest {

    @Test
    fun create() {
        val audiobookBase =
            AudiobookBase.builder()
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
                .build()

        assertThat(audiobookBase.id()).isEqualTo("id")
        assertThat(audiobookBase.authors())
            .containsExactly(AuthorObject.builder().name("name").build())
        assertThat(audiobookBase.availableMarkets()).containsExactly("string")
        assertThat(audiobookBase.copyrights())
            .containsExactly(CopyrightObject.builder().text("text").type("type").build())
        assertThat(audiobookBase.description()).isEqualTo("description")
        assertThat(audiobookBase.explicit()).isEqualTo(true)
        assertThat(audiobookBase.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(audiobookBase.href()).isEqualTo("href")
        assertThat(audiobookBase.htmlDescription()).isEqualTo("html_description")
        assertThat(audiobookBase.images())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(audiobookBase.languages()).containsExactly("string")
        assertThat(audiobookBase.mediaType()).isEqualTo("media_type")
        assertThat(audiobookBase.name()).isEqualTo("name")
        assertThat(audiobookBase.narrators())
            .containsExactly(NarratorObject.builder().name("name").build())
        assertThat(audiobookBase.publisher()).isEqualTo("publisher")
        assertThat(audiobookBase.totalChapters()).isEqualTo(0L)
        assertThat(audiobookBase.uri()).isEqualTo("uri")
        assertThat(audiobookBase.edition()).isEqualTo("Unabridged")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audiobookBase =
            AudiobookBase.builder()
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
                .build()

        val roundtrippedAudiobookBase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audiobookBase),
                jacksonTypeRef<AudiobookBase>(),
            )

        assertThat(roundtrippedAudiobookBase).isEqualTo(audiobookBase)
    }
}
