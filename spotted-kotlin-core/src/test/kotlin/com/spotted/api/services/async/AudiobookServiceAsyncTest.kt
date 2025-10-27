// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.audiobooks.AudiobookListParams
import com.spotted.api.models.audiobooks.AudiobookRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AudiobookServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.audiobooks()

        val audiobook =
            audiobookServiceAsync.retrieve(
                AudiobookRetrieveParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").market("ES").build()
            )

        audiobook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.audiobooks()

        val audiobooks =
            audiobookServiceAsync.list(
                AudiobookListParams.builder()
                    .ids("18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe")
                    .market("ES")
                    .build()
            )

        audiobooks.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listChapters() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.audiobooks()

        val page = audiobookServiceAsync.listChapters("7iHfbu1YPACw6oZPAFJtqe")

        page.response().validate()
    }
}
