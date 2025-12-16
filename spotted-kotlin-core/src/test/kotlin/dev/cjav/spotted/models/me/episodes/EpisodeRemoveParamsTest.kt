// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.episodes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeRemoveParamsTest {

    @Test
    fun create() {
        EpisodeRemoveParams.builder().addId("string").published(true).build()
    }

    @Test
    fun body() {
        val params = EpisodeRemoveParams.builder().addId("string").published(true).build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("string")
        assertThat(body.published()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EpisodeRemoveParams.builder().build()

        val body = params._body()
    }
}
