// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.browse

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.browse.categories.CategoryGetPlaylistsParams
import dev.cjav.spotted.models.browse.categories.CategoryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CategoryServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val categoryServiceAsync = client.browse().categories()

        val category =
            categoryServiceAsync.retrieve(
                CategoryRetrieveParams.builder().categoryId("dinner").locale("sv_SE").build()
            )

        category.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val categoryServiceAsync = client.browse().categories()

        val page = categoryServiceAsync.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getPlaylists() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val categoryServiceAsync = client.browse().categories()

        val response =
            categoryServiceAsync.getPlaylists(
                CategoryGetPlaylistsParams.builder()
                    .categoryId("dinner")
                    .limit(10L)
                    .offset(5L)
                    .build()
            )

        response.validate()
    }
}
