// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val meServiceAsync = client.me()

        val me = meServiceAsync.retrieve()

        me.validate()
    }
}
