// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.player

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerGetCurrentlyPlayingParamsTest {

    @Test
    fun create() {
        PlayerGetCurrentlyPlayingParams.builder()
            .additionalTypes("additional_types")
            .market("ES")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PlayerGetCurrentlyPlayingParams.builder()
                .additionalTypes("additional_types")
                .market("ES")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("additional_types", "additional_types")
                    .put("market", "ES")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlayerGetCurrentlyPlayingParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
