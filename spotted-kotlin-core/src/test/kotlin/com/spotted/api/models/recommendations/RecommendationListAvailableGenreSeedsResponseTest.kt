// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.recommendations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecommendationListAvailableGenreSeedsResponseTest {

    @Test
    fun create() {
        val recommendationListAvailableGenreSeedsResponse =
            RecommendationListAvailableGenreSeedsResponse.builder()
                .addGenre("alternative")
                .addGenre("samba")
                .build()

        assertThat(recommendationListAvailableGenreSeedsResponse.genres())
            .containsExactly("alternative", "samba")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recommendationListAvailableGenreSeedsResponse =
            RecommendationListAvailableGenreSeedsResponse.builder()
                .addGenre("alternative")
                .addGenre("samba")
                .build()

        val roundtrippedRecommendationListAvailableGenreSeedsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recommendationListAvailableGenreSeedsResponse),
                jacksonTypeRef<RecommendationListAvailableGenreSeedsResponse>(),
            )

        assertThat(roundtrippedRecommendationListAvailableGenreSeedsResponse)
            .isEqualTo(recommendationListAvailableGenreSeedsResponse)
    }
}
