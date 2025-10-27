// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChapterRestrictionObjectTest {

    @Test
    fun create() {
        val chapterRestrictionObject = ChapterRestrictionObject.builder().reason("reason").build()

        assertThat(chapterRestrictionObject.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chapterRestrictionObject = ChapterRestrictionObject.builder().reason("reason").build()

        val roundtrippedChapterRestrictionObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chapterRestrictionObject),
                jacksonTypeRef<ChapterRestrictionObject>(),
            )

        assertThat(roundtrippedChapterRestrictionObject).isEqualTo(chapterRestrictionObject)
    }
}
