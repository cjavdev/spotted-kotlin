// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val meService = client.me()

        val me = meService.retrieve()

        me.validate()
    }
}
