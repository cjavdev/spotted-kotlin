// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.player

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerSetRepeatModeParamsTest {

    @Test
    fun create() {
        PlayerSetRepeatModeParams.builder()
            .state("context")
            .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PlayerSetRepeatModeParams.builder()
                .state("context")
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("state", "context")
                    .put("device_id", "0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlayerSetRepeatModeParams.builder().state("context").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("state", "context").build())
    }
}
