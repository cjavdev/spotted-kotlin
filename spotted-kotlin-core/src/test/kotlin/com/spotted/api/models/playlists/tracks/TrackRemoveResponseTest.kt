// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.playlists.tracks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackRemoveResponseTest {

    @Test
    fun create() {
        val trackRemoveResponse = TrackRemoveResponse.builder().snapshotId("abc").build()

        assertThat(trackRemoveResponse.snapshotId()).isEqualTo("abc")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trackRemoveResponse = TrackRemoveResponse.builder().snapshotId("abc").build()

        val roundtrippedTrackRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trackRemoveResponse),
                jacksonTypeRef<TrackRemoveResponse>(),
            )

        assertThat(roundtrippedTrackRemoveResponse).isEqualTo(trackRemoveResponse)
    }
}
