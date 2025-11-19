// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.shows

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShowListEpisodesParamsTest {

    @Test
    fun create() {
        ShowListEpisodesParams.builder()
            .id("38bS44xjbVVZ3No3ByF1dJ")
            .limit(10L)
            .market("ES")
            .offset(5L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ShowListEpisodesParams.builder().id("38bS44xjbVVZ3No3ByF1dJ").build()

        assertThat(params._pathParam(0)).isEqualTo("38bS44xjbVVZ3No3ByF1dJ")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ShowListEpisodesParams.builder()
                .id("38bS44xjbVVZ3No3ByF1dJ")
                .limit(10L)
                .market("ES")
                .offset(5L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "10")
                    .put("market", "ES")
                    .put("offset", "5")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ShowListEpisodesParams.builder().id("38bS44xjbVVZ3No3ByF1dJ").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
