// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.audiobooks.AudiobookListParams
import com.spotted.api.models.audiobooks.AudiobookRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AudiobookServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookService = client.audiobooks()

        val audiobook =
            audiobookService.retrieve(
                AudiobookRetrieveParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").market("ES").build()
            )

        audiobook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookService = client.audiobooks()

        val audiobooks =
            audiobookService.list(
                AudiobookListParams.builder()
                    .ids("18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe")
                    .market("ES")
                    .build()
            )

        audiobooks.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listChapters() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookService = client.audiobooks()

        val page = audiobookService.listChapters("7iHfbu1YPACw6oZPAFJtqe")

        page.response().validate()
    }
}
