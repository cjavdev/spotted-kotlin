// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.playlists.tracks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackAddResponseTest {

    @Test
    fun create() {
        val trackAddResponse = TrackAddResponse.builder().snapshotId("abc").build()

        assertThat(trackAddResponse.snapshotId()).isEqualTo("abc")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trackAddResponse = TrackAddResponse.builder().snapshotId("abc").build()

        val roundtrippedTrackAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trackAddResponse),
                jacksonTypeRef<TrackAddResponse>(),
            )

        assertThat(roundtrippedTrackAddResponse).isEqualTo(trackAddResponse)
    }
}
