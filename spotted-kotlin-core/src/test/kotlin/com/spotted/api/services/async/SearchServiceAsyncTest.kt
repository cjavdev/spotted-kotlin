// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.search.SearchRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SearchServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val searchServiceAsync = client.search()

        val search =
            searchServiceAsync.retrieve(
                SearchRetrieveParams.builder()
                    .q("remaster%20track:Doxy%20artist:Miles%20Davis")
                    .addType(SearchRetrieveParams.Type.ALBUM)
                    .includeExternal(SearchRetrieveParams.IncludeExternal.AUDIO)
                    .limit(10L)
                    .market("ES")
                    .offset(5L)
                    .build()
            )

        search.validate()
    }
}
