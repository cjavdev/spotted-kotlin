// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.chapters.ChapterBulkRetrieveParams
import com.spotted.api.models.chapters.ChapterRetrieveParams
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
