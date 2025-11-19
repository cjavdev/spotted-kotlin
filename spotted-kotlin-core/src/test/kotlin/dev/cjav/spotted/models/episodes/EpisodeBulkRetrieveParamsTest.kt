// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.episodes

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeBulkRetrieveParamsTest {

    @Test
    fun create() {
        EpisodeBulkRetrieveParams.builder()
            .ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
            .market("ES")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EpisodeBulkRetrieveParams.builder()
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
            EpisodeBulkRetrieveParams.builder()
                .ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", "77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                    .build()
            )
    }
}
