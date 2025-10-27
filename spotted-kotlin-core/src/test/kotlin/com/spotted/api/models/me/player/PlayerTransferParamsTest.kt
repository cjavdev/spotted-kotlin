// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.player

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerTransferParamsTest {

    @Test
    fun create() {
        PlayerTransferParams.builder().addDeviceId("74ASZWbe4lXaubB36ztrGX").play(true).build()
    }

    @Test
    fun body() {
        val params =
            PlayerTransferParams.builder().addDeviceId("74ASZWbe4lXaubB36ztrGX").play(true).build()

        val body = params._body()

        assertThat(body.deviceIds()).containsExactly("74ASZWbe4lXaubB36ztrGX")
        assertThat(body.play()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlayerTransferParams.builder().addDeviceId("74ASZWbe4lXaubB36ztrGX").build()

        val body = params._body()

        assertThat(body.deviceIds()).containsExactly("74ASZWbe4lXaubB36ztrGX")
    }
}
