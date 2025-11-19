// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.me.audiobooks.AudiobookCheckParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookRemoveParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookSaveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AudiobookServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.me().audiobooks()

        val page = audiobookServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun check() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.me().audiobooks()

        audiobookServiceAsync.check(
            AudiobookCheckParams.builder()
                .ids("18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun remove() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.me().audiobooks()

        audiobookServiceAsync.remove(
            AudiobookRemoveParams.builder()
                .ids("18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun save() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.me().audiobooks()

        audiobookServiceAsync.save(
            AudiobookSaveParams.builder()
                .ids("18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe")
                .build()
        )
    }
}
