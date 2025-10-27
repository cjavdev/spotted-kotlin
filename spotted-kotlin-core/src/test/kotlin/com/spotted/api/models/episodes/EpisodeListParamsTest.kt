// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.episodes

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeListParamsTest {

    @Test
    fun create() {
        EpisodeListParams.builder()
            .ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
            .market("ES")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EpisodeListParams.builder()
                .ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                .market("ES")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", "77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                    .put("market", "ES")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            EpisodeListParams.builder().ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", "77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                    .build()
            )
    }
}
