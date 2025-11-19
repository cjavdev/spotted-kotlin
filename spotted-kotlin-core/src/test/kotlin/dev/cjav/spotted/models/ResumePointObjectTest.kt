// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResumePointObjectTest {

    @Test
    fun create() {
        val resumePointObject =
            ResumePointObject.builder().fullyPlayed(true).resumePositionMs(0L).build()

        assertThat(resumePointObject.fullyPlayed()).isEqualTo(true)
        assertThat(resumePointObject.resumePositionMs()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resumePointObject =
            ResumePointObject.builder().fullyPlayed(true).resumePositionMs(0L).build()

        val roundtrippedResumePointObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resumePointObject),
                jacksonTypeRef<ResumePointObject>(),
            )

        assertThat(roundtrippedResumePointObject).isEqualTo(resumePointObject)
    }
}
