// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.tracks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackUpdateResponseTest {

    @Test
    fun create() {
        val trackUpdateResponse = TrackUpdateResponse.builder().snapshotId("abc").build()

        assertThat(trackUpdateResponse.snapshotId()).isEqualTo("abc")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trackUpdateResponse = TrackUpdateResponse.builder().snapshotId("abc").build()

        val roundtrippedTrackUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trackUpdateResponse),
                jacksonTypeRef<TrackUpdateResponse>(),
            )

        assertThat(roundtrippedTrackUpdateResponse).isEqualTo(trackUpdateResponse)
    }
}
