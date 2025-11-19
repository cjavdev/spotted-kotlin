// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.tracks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackRemoveParamsTest {

    @Test
    fun create() {
        TrackRemoveParams.builder().addId("string").build()
    }

    @Test
    fun body() {
        val params = TrackRemoveParams.builder().addId("string").build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TrackRemoveParams.builder().build()

        val body = params._body()
    }
}
