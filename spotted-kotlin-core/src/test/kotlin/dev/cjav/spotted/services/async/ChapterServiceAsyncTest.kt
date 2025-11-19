// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.chapters.ChapterBulkRetrieveParams
import dev.cjav.spotted.models.chapters.ChapterRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChapterServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val chapterServiceAsync = client.chapters()

        val chapter =
            chapterServiceAsync.retrieve(
                ChapterRetrieveParams.builder().id("0D5wENdkdwbqlrHoaJ9g29").market("ES").build()
            )

        chapter.validate()
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
        val chapterServiceAsync = client.chapters()

        val response =
            chapterServiceAsync.bulkRetrieve(
                ChapterBulkRetrieveParams.builder()
                    .ids("0IsXVP0JmcB2adSE338GkK,3ZXb8FKZGU0EHALYX6uCzU,0D5wENdkdwbqlrHoaJ9g29")
                    .market("ES")
                    .build()
            )

        response.validate()
    }
}
