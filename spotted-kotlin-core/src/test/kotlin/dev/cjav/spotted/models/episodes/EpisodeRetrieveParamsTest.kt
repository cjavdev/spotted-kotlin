// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.episodes

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeRetrieveParamsTest {

    @Test
    fun create() {
        EpisodeRetrieveParams.builder().id("512ojhOuo1ktJprKbVcKyQ").market("ES").build()
    }

    @Test
    fun pathParams() {
        val params = EpisodeRetrieveParams.builder().id("512ojhOuo1ktJprKbVcKyQ").build()

        assertThat(params._pathParam(0)).isEqualTo("512ojhOuo1ktJprKbVcKyQ")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EpisodeRetrieveParams.builder().id("512ojhOuo1ktJprKbVcKyQ").market("ES").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("market", "ES").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EpisodeRetrieveParams.builder().id("512ojhOuo1ktJprKbVcKyQ").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
