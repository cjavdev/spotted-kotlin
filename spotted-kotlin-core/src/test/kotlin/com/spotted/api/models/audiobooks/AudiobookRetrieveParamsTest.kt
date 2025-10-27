// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.audiobooks

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudiobookRetrieveParamsTest {

    @Test
    fun create() {
        AudiobookRetrieveParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").market("ES").build()
    }

    @Test
    fun pathParams() {
        val params = AudiobookRetrieveParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").build()

        assertThat(params._pathParam(0)).isEqualTo("7iHfbu1YPACw6oZPAFJtqe")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AudiobookRetrieveParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").market("ES").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("market", "ES").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AudiobookRetrieveParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
