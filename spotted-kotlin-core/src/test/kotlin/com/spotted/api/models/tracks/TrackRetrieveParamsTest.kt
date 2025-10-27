// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.tracks

import com.spotted.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackRetrieveParamsTest {

    @Test
    fun create() {
        TrackRetrieveParams.builder().id("11dFghVXANMlKmJXsNCbNl").market("ES").build()
    }

    @Test
    fun pathParams() {
        val params = TrackRetrieveParams.builder().id("11dFghVXANMlKmJXsNCbNl").build()

        assertThat(params._pathParam(0)).isEqualTo("11dFghVXANMlKmJXsNCbNl")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = TrackRetrieveParams.builder().id("11dFghVXANMlKmJXsNCbNl").market("ES").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("market", "ES").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TrackRetrieveParams.builder().id("11dFghVXANMlKmJXsNCbNl").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
