// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.me

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.me.episodes.EpisodeCheckParams
import com.spotted.api.models.me.episodes.EpisodeRemoveParams
import com.spotted.api.models.me.episodes.EpisodeSaveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EpisodeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val episodeService = client.me().episodes()

        val page = episodeService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun check() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val episodeService = client.me().episodes()

        episodeService.check(
            EpisodeCheckParams.builder()
                .ids("77o6BIVlYM3msb4MMIL1jH,0Q86acNRm6V9GYx55SXKwf")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val episodeService = client.me().episodes()

        episodeService.remove(EpisodeRemoveParams.builder().addId("string").build())
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun save() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val episodeService = client.me().episodes()

        episodeService.save(EpisodeSaveParams.builder().addId("string").build())
    }
}
