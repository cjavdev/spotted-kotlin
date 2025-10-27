// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.audioanalysis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimeIntervalObjectTest {

    @Test
    fun create() {
        val timeIntervalObject =
            TimeIntervalObject.builder().confidence(0.925).duration(2.18749).start(0.49567).build()

        assertThat(timeIntervalObject.confidence()).isEqualTo(0.925)
        assertThat(timeIntervalObject.duration()).isEqualTo(2.18749)
        assertThat(timeIntervalObject.start()).isEqualTo(0.49567)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timeIntervalObject =
            TimeIntervalObject.builder().confidence(0.925).duration(2.18749).start(0.49567).build()

        val roundtrippedTimeIntervalObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timeIntervalObject),
                jacksonTypeRef<TimeIntervalObject>(),
            )

        assertThat(roundtrippedTimeIntervalObject).isEqualTo(timeIntervalObject)
    }
}
