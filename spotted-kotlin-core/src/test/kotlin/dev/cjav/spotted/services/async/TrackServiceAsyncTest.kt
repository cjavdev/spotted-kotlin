// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveParams
import dev.cjav.spotted.models.tracks.TrackRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TrackServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val trackServiceAsync = client.tracks()

        val trackObject =
            trackServiceAsync.retrieve(
                TrackRetrieveParams.builder().id("11dFghVXANMlKmJXsNCbNl").market("ES").build()
            )

        trackObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun bulkRetrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val trackServiceAsync = client.tracks()

        val response =
            trackServiceAsync.bulkRetrieve(
                TrackBulkRetrieveParams.builder()
                    .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
                    .market("ES")
                    .build()
            )

        response.validate()
    }
}
