// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.chapters.ChapterBulkRetrieveParams
import dev.cjav.spotted.models.chapters.ChapterRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChapterServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val chapterService = client.chapters()

        val chapter =
            chapterService.retrieve(
                ChapterRetrieveParams.builder().id("0D5wENdkdwbqlrHoaJ9g29").market("ES").build()
            )

        chapter.validate()
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
        val chapterService = client.chapters()

        val response =
            chapterService.bulkRetrieve(
                ChapterBulkRetrieveParams.builder()
                    .ids("0IsXVP0JmcB2adSE338GkK,3ZXb8FKZGU0EHALYX6uCzU,0D5wENdkdwbqlrHoaJ9g29")
                    .market("ES")
                    .build()
            )

        response.validate()
    }
}
