// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.episodes.EpisodeBulkRetrieveParams
import com.spotted.api.models.episodes.EpisodeRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EpisodeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val episodeService = client.episodes()

        val episodeObject =
            episodeService.retrieve(
                EpisodeRetrieveParams.builder().id("512ojhOuo1ktJprKbVcKyQ").market("ES").build()
            )

        episodeObject.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val episodeService = client.episodes()

        val response =
            episodeService.bulkRetrieve(
                EpisodeBulkRetrieveParams.builder()
                    .ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                    .market("ES")
                    .build()
            )

        response.validate()
    }
}
