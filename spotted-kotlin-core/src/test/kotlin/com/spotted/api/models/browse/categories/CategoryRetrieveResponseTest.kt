// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.browse.categories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.ImageObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryRetrieveResponseTest {

    @Test
    fun create() {
        val categoryRetrieveResponse =
            CategoryRetrieveResponse.builder()
                .id("equal")
                .href("href")
                .addIcon(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .name("EQUAL")
                .build()

        assertThat(categoryRetrieveResponse.id()).isEqualTo("equal")
        assertThat(categoryRetrieveResponse.href()).isEqualTo("href")
        assertThat(categoryRetrieveResponse.icons())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(categoryRetrieveResponse.name()).isEqualTo("EQUAL")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val categoryRetrieveResponse =
            CategoryRetrieveResponse.builder()
                .id("equal")
                .href("href")
                .addIcon(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .name("EQUAL")
                .build()

        val roundtrippedCategoryRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(categoryRetrieveResponse),
                jacksonTypeRef<CategoryRetrieveResponse>(),
            )

        assertThat(roundtrippedCategoryRetrieveResponse).isEqualTo(categoryRetrieveResponse)
    }
}
