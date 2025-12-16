// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplifiedArtistObjectTest {

    @Test
    fun create() {
        val simplifiedArtistObject =
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

        assertThat(simplifiedArtistObject.id()).isEqualTo("id")
        assertThat(simplifiedArtistObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().published(true).spotify("spotify").build())
        assertThat(simplifiedArtistObject.href()).isEqualTo("href")
        assertThat(simplifiedArtistObject.name()).isEqualTo("name")
        assertThat(simplifiedArtistObject.published()).isEqualTo(true)
        assertThat(simplifiedArtistObject.type()).isEqualTo(SimplifiedArtistObject.Type.ARTIST)
        assertThat(simplifiedArtistObject.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplifiedArtistObject =
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

        val roundtrippedSimplifiedArtistObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplifiedArtistObject),
                jacksonTypeRef<SimplifiedArtistObject>(),
            )

        assertThat(roundtrippedSimplifiedArtistObject).isEqualTo(simplifiedArtistObject)
    }
}
