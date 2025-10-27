// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.episodes

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeSaveParamsTest {

    @Test
    fun create() {
        EpisodeSaveParams.builder()
            .queryIds("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
            .addBodyId("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EpisodeSaveParams.builder()
                .queryIds("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                .addBodyId("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", "77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            EpisodeSaveParams.builder()
                .queryIds("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                .addBodyId("string")
                .build()

        val body = params._body()

        assertThat(body.bodyIds()).containsExactly("string")
    }
}
