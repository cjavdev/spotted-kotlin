// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.player

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerSetVolumeParamsTest {

    @Test
    fun create() {
        PlayerSetVolumeParams.builder()
            .volumePercent(50L)
            .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PlayerSetVolumeParams.builder()
                .volumePercent(50L)
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("volume_percent", "50")
                    .put("device_id", "0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlayerSetVolumeParams.builder().volumePercent(50L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("volume_percent", "50").build())
    }
}
