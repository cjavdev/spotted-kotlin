// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.episodes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeSaveParamsTest {

    @Test
    fun create() {
        EpisodeSaveParams.builder().addId("string").build()
    }

    @Test
    fun body() {
        val params = EpisodeSaveParams.builder().addId("string").build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("string")
    }
}
