// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.artists

import dev.cjav.spotted.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtistTopTracksParamsTest {

    @Test
    fun create() {
        ArtistTopTracksParams.builder().id("0TnOYISbd1XYRBk9myaseg").market("ES").build()
    }

    @Test
    fun pathParams() {
        val params = ArtistTopTracksParams.builder().id("0TnOYISbd1XYRBk9myaseg").build()

        assertThat(params._pathParam(0)).isEqualTo("0TnOYISbd1XYRBk9myaseg")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ArtistTopTracksParams.builder().id("0TnOYISbd1XYRBk9myaseg").market("ES").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("market", "ES").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ArtistTopTracksParams.builder().id("0TnOYISbd1XYRBk9myaseg").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
