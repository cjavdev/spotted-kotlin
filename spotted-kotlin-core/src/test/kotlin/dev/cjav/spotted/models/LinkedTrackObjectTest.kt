// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkedTrackObjectTest {

    @Test
    fun create() {
        val linkedTrackObject =
            LinkedTrackObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .type("type")
                .uri("uri")
                .build()

        assertThat(linkedTrackObject.id()).isEqualTo("id")
        assertThat(linkedTrackObject.externalUrls())
            .isEqualTo(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(linkedTrackObject.href()).isEqualTo("href")
        assertThat(linkedTrackObject.type()).isEqualTo("type")
        assertThat(linkedTrackObject.uri()).isEqualTo("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkedTrackObject =
            LinkedTrackObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .type("type")
                .uri("uri")
                .build()

        val roundtrippedLinkedTrackObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkedTrackObject),
                jacksonTypeRef<LinkedTrackObject>(),
            )

        assertThat(roundtrippedLinkedTrackObject).isEqualTo(linkedTrackObject)
    }
}
