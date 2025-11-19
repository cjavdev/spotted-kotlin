// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.artists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtistListRelatedArtistsParamsTest {

    @Test
    fun create() {
        ArtistListRelatedArtistsParams.builder().id("0TnOYISbd1XYRBk9myaseg").build()
    }

    @Test
    fun pathParams() {
        val params = ArtistListRelatedArtistsParams.builder().id("0TnOYISbd1XYRBk9myaseg").build()

        assertThat(params._pathParam(0)).isEqualTo("0TnOYISbd1XYRBk9myaseg")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
