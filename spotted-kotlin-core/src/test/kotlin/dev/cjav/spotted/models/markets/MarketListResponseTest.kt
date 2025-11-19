// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.markets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketListResponseTest {

    @Test
    fun create() {
        val marketListResponse =
            MarketListResponse.builder().markets(listOf("CA", "BR", "IT")).build()

        assertThat(marketListResponse.markets()).containsExactly("CA", "BR", "IT")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketListResponse =
            MarketListResponse.builder().markets(listOf("CA", "BR", "IT")).build()

        val roundtrippedMarketListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketListResponse),
                jacksonTypeRef<MarketListResponse>(),
            )

        assertThat(roundtrippedMarketListResponse).isEqualTo(marketListResponse)
    }
}
