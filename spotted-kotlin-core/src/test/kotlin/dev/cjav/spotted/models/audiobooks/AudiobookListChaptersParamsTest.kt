// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.audiobooks

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudiobookListChaptersParamsTest {

    @Test
    fun create() {
        AudiobookListChaptersParams.builder()
            .id("7iHfbu1YPACw6oZPAFJtqe")
            .limit(10L)
            .market("ES")
            .offset(5L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AudiobookListChaptersParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").build()

        assertThat(params._pathParam(0)).isEqualTo("7iHfbu1YPACw6oZPAFJtqe")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AudiobookListChaptersParams.builder()
                .id("7iHfbu1YPACw6oZPAFJtqe")
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
        val params = AudiobookListChaptersParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
