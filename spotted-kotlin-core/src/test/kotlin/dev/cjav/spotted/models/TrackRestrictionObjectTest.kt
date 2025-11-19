// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackRestrictionObjectTest {

    @Test
    fun create() {
        val trackRestrictionObject = TrackRestrictionObject.builder().reason("reason").build()

        assertThat(trackRestrictionObject.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trackRestrictionObject = TrackRestrictionObject.builder().reason("reason").build()

        val roundtrippedTrackRestrictionObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trackRestrictionObject),
                jacksonTypeRef<TrackRestrictionObject>(),
            )

        assertThat(roundtrippedTrackRestrictionObject).isEqualTo(trackRestrictionObject)
    }
}
