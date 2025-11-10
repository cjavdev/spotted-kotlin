// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.search.SearchSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SearchServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val searchService = client.search()

        val response =
            searchService.search(
                SearchSearchParams.builder()
                    .q("remaster%20track:Doxy%20artist:Miles%20Davis")
                    .addType(SearchSearchParams.Type.ALBUM)
                    .includeExternal(SearchSearchParams.IncludeExternal.AUDIO)
                    .limit(10L)
                    .market("ES")
                    .offset(5L)
                    .build()
            )

        response.validate()
    }
}
