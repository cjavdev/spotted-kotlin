// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageObjectTest {

    @Test
    fun create() {
        val imageObject =
            ImageObject.builder()
                .height(300L)
                .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                .width(300L)
                .build()

        assertThat(imageObject.height()).isEqualTo(300L)
        assertThat(imageObject.url())
            .isEqualTo("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
        assertThat(imageObject.width()).isEqualTo(300L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val imageObject =
            ImageObject.builder()
                .height(300L)
                .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                .width(300L)
                .build()

        val roundtrippedImageObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(imageObject),
                jacksonTypeRef<ImageObject>(),
            )

        assertThat(roundtrippedImageObject).isEqualTo(imageObject)
    }
}
