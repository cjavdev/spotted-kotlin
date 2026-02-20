// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.audiofeatures.AudioFeatureBulkRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AudioFeatureServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val audioFeatureServiceAsync = client.audioFeatures()

        val audioFeature = audioFeatureServiceAsync.retrieve("11dFghVXANMlKmJXsNCbNl")

        audioFeature.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun bulkRetrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val audioFeatureServiceAsync = client.audioFeatures()

        val response =
            audioFeatureServiceAsync.bulkRetrieve(
                AudioFeatureBulkRetrieveParams.builder()
                    .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
                    .build()
            )

        response.validate()
    }
}
