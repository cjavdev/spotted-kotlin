// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.shows.ShowBulkRetrieveParams
import com.spotted.api.models.shows.ShowRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShowServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val showServiceAsync = client.shows()

        val show =
            showServiceAsync.retrieve(
                ShowRetrieveParams.builder().id("38bS44xjbVVZ3No3ByF1dJ").market("ES").build()
            )

        show.validate()
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
        val showServiceAsync = client.shows()

        val response =
            showServiceAsync.bulkRetrieve(
                ShowBulkRetrieveParams.builder()
                    .ids("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                    .market("ES")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listEpisodes() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val showServiceAsync = client.shows()

        val page = showServiceAsync.listEpisodes("38bS44xjbVVZ3No3ByF1dJ")

        page.response().validate()
    }
}
