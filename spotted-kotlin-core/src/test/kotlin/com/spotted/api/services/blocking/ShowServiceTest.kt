// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.shows.ShowBulkRetrieveParams
import com.spotted.api.models.shows.ShowRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShowServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val showService = client.shows()

        val show =
            showService.retrieve(
                ShowRetrieveParams.builder().id("38bS44xjbVVZ3No3ByF1dJ").market("ES").build()
            )

        show.validate()
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
        val showService = client.shows()

        val response =
            showService.bulkRetrieve(
                ShowBulkRetrieveParams.builder()
                    .ids("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                    .market("ES")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listEpisodes() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val showService = client.shows()

        val page = showService.listEpisodes("38bS44xjbVVZ3No3ByF1dJ")

        page.response().validate()
    }
}
