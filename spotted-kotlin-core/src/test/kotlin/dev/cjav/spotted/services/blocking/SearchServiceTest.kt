// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.search.SearchQueryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SearchServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun query() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val searchService = client.search()

        val response =
            searchService.query(
                SearchQueryParams.builder()
                    .q("remaster%20track:Doxy%20artist:Miles%20Davis")
                    .addType(SearchQueryParams.Type.ALBUM)
                    .includeExternal(SearchQueryParams.IncludeExternal.AUDIO)
                    .limit(10L)
                    .market("ES")
                    .offset(5L)
                    .build()
            )

        response.validate()
    }
}
