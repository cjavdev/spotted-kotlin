// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AudioAnalysisServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val audioAnalysisServiceAsync = client.audioAnalysis()

        val audioAnalysis = audioAnalysisServiceAsync.retrieve("11dFghVXANMlKmJXsNCbNl")

        audioAnalysis.validate()
    }
}
