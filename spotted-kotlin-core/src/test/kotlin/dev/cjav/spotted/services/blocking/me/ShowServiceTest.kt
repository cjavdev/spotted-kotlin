// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.me.shows.ShowCheckParams
import dev.cjav.spotted.models.me.shows.ShowRemoveParams
import dev.cjav.spotted.models.me.shows.ShowSaveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShowServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val showService = client.me().shows()

        val page = showService.list()

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
        val showService = client.me().shows()

        showService.check(
            ShowCheckParams.builder().ids("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ").build()
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
        val showService = client.me().shows()

        showService.remove(ShowRemoveParams.builder().addId("string").build())
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
        val showService = client.me().shows()

        showService.save(ShowSaveParams.builder().addId("string").build())
    }
}
