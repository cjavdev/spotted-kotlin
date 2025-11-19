// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.audiobooks

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudiobookListParamsTest {

    @Test
    fun create() {
        AudiobookListParams.builder().limit(10L).offset(5L).build()
    }

    @Test
    fun queryParams() {
        val params = AudiobookListParams.builder().limit(10L).offset(5L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "10").put("offset", "5").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AudiobookListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
