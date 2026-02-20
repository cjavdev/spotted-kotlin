// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AudiobookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val audiobookService = client.audiobooks()

        val audiobook =
            audiobookService.retrieve(
                AudiobookRetrieveParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").market("ES").build()
            )

        audiobook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val audiobookService = client.audiobooks()

        val response =
            audiobookService.bulkRetrieve(
                AudiobookBulkRetrieveParams.builder()
                    .ids("18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe")
                    .market("ES")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listChapters() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val audiobookService = client.audiobooks()

        val page = audiobookService.listChapters("7iHfbu1YPACw6oZPAFJtqe")

        page.response().validate()
    }
}
