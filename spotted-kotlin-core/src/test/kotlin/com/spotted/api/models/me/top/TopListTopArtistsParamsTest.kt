// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.top

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopListTopArtistsParamsTest {

    @Test
    fun create() {
        TopListTopArtistsParams.builder().limit(10L).offset(5L).timeRange("medium_term").build()
    }

    @Test
    fun queryParams() {
        val params =
            TopListTopArtistsParams.builder().limit(10L).offset(5L).timeRange("medium_term").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "10")
                    .put("offset", "5")
                    .put("time_range", "medium_term")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TopListTopArtistsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
