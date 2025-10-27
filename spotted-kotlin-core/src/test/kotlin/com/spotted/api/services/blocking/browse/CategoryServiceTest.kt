// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.browse

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClient
import com.spotted.api.models.browse.categories.CategoryGetPlaylistsParams
import com.spotted.api.models.browse.categories.CategoryListParams
import com.spotted.api.models.browse.categories.CategoryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CategoryServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val categoryService = client.browse().categories()

        val category =
            categoryService.retrieve(
                CategoryRetrieveParams.builder().categoryId("dinner").locale("sv_SE").build()
            )

        category.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val categoryService = client.browse().categories()

        val categories =
            categoryService.list(
                CategoryListParams.builder().limit(10L).locale("sv_SE").offset(5L).build()
            )

        categories.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getPlaylists() {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val categoryService = client.browse().categories()

        val response =
            categoryService.getPlaylists(
                CategoryGetPlaylistsParams.builder()
                    .categoryId("dinner")
                    .limit(10L)
                    .offset(5L)
                    .build()
            )

        response.validate()
    }
}
