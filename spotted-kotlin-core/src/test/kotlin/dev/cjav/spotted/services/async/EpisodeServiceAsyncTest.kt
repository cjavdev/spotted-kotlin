// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.episodes.EpisodeBulkRetrieveParams
import dev.cjav.spotted.models.episodes.EpisodeRetrieveParams
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
                .accessToken("My Access Token")
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
                .accessToken("My Access Token")
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
