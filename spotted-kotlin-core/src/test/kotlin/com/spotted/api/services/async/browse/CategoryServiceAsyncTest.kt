// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.browse

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.browse.categories.CategoryGetPlaylistsParams
import com.spotted.api.models.browse.categories.CategoryListParams
import com.spotted.api.models.browse.categories.CategoryRetrieveParams
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
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
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
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val categoryServiceAsync = client.browse().categories()

        val categories =
            categoryServiceAsync.list(
                CategoryListParams.builder().limit(10L).locale("sv_SE").offset(5L).build()
            )

        categories.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getPlaylists() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
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
