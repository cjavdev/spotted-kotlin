// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.episodes.EpisodeBulkRetrieveParams
import com.spotted.api.models.episodes.EpisodeRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EpisodeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val episodeServiceAsync = client.episodes()

        val episodeObject =
            episodeServiceAsync.retrieve(
                EpisodeRetrieveParams.builder().id("512ojhOuo1ktJprKbVcKyQ").market("ES").build()
            )

        episodeObject.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun bulkRetrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val episodeServiceAsync = client.episodes()

        val response =
            episodeServiceAsync.bulkRetrieve(
                EpisodeBulkRetrieveParams.builder()
                    .ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                    .market("ES")
                    .build()
            )

        response.validate()
    }
}
