// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.following

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowingFollowParamsTest {

    @Test
    fun create() {
        FollowingFollowParams.builder().addId("string").build()
    }

    @Test
    fun body() {
        val params = FollowingFollowParams.builder().addId("string").build()

        val body = params._body()

        assertThat(body.ids()).containsExactly("string")
    }
}
