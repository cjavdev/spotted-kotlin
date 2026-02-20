// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MarketServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketServiceAsync = client.markets()

        val markets = marketServiceAsync.list()

        markets.validate()
    }
}
