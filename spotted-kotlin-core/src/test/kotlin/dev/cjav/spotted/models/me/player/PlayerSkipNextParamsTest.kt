// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerSkipNextParamsTest {

    @Test
    fun create() {
        PlayerSkipNextParams.builder().deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8").build()
    }

    @Test
    fun queryParams() {
        val params =
            PlayerSkipNextParams.builder()
                .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("device_id", "0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlayerSkipNextParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
