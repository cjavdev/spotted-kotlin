// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.albums

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlbumRetrieveParamsTest {

    @Test
    fun create() {
        AlbumRetrieveParams.builder().id("4aawyAB9vmqN3uQ7FjRGTy").market("ES").build()
    }

    @Test
    fun pathParams() {
        val params = AlbumRetrieveParams.builder().id("4aawyAB9vmqN3uQ7FjRGTy").build()

        assertThat(params._pathParam(0)).isEqualTo("4aawyAB9vmqN3uQ7FjRGTy")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = AlbumRetrieveParams.builder().id("4aawyAB9vmqN3uQ7FjRGTy").market("ES").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("market", "ES").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AlbumRetrieveParams.builder().id("4aawyAB9vmqN3uQ7FjRGTy").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
