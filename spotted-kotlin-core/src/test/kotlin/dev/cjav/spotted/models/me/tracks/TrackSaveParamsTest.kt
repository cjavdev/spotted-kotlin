// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.tracks

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackSaveParamsTest {

    @Test
    fun create() {
        TrackSaveParams.builder()
            .addId("string")
            .addTimestampedId(
                TrackSaveParams.TimestampedId.builder()
                    .id("id")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TrackSaveParams.builder()
                .addId("string")
                .addTimestampedId(
                    TrackSaveParams.TimestampedId.builder()
                        .id("id")
                        .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("string")
        assertThat(body.timestampedIds())
            .containsExactly(
                TrackSaveParams.TimestampedId.builder()
                    .id("id")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TrackSaveParams.builder().addId("string").build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("string")
    }
}
