// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChapterRestrictionObjectTest {

    @Test
    fun create() {
        val chapterRestrictionObject =
            ChapterRestrictionObject.builder().published(true).reason("reason").build()

        assertThat(chapterRestrictionObject.published()).isEqualTo(true)
        assertThat(chapterRestrictionObject.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chapterRestrictionObject =
            ChapterRestrictionObject.builder().published(true).reason("reason").build()

        val roundtrippedChapterRestrictionObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chapterRestrictionObject),
                jacksonTypeRef<ChapterRestrictionObject>(),
            )

        assertThat(roundtrippedChapterRestrictionObject).isEqualTo(chapterRestrictionObject)
    }
}
