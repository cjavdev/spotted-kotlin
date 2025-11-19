// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.chapters

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChapterRetrieveParamsTest {

    @Test
    fun create() {
        ChapterRetrieveParams.builder().id("0D5wENdkdwbqlrHoaJ9g29").market("ES").build()
    }

    @Test
    fun pathParams() {
        val params = ChapterRetrieveParams.builder().id("0D5wENdkdwbqlrHoaJ9g29").build()

        assertThat(params._pathParam(0)).isEqualTo("0D5wENdkdwbqlrHoaJ9g29")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ChapterRetrieveParams.builder().id("0D5wENdkdwbqlrHoaJ9g29").market("ES").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("market", "ES").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChapterRetrieveParams.builder().id("0D5wENdkdwbqlrHoaJ9g29").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
