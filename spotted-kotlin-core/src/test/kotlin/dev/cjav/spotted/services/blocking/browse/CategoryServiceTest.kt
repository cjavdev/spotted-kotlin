// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.browse

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.browse.categories.CategoryGetPlaylistsParams
import dev.cjav.spotted.models.browse.categories.CategoryRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CategoryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val categoryService = client.browse().categories()

        val category =
            categoryService.retrieve(
                CategoryRetrieveParams.builder().categoryId("dinner").locale("sv_SE").build()
            )

        category.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val categoryService = client.browse().categories()

        val page = categoryService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPlaylists() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
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
