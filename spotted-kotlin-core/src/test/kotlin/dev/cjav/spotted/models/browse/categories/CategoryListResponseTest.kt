// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.browse.categories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import dev.cjav.spotted.models.ImageObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoryListResponseTest {

    @Test
    fun create() {
        val categoryListResponse =
            CategoryListResponse.builder()
                .categories(
                    CategoryListResponse.Categories.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
                        .addItem(
                            CategoryListResponse.Categories.Item.builder()
                                .id("equal")
                                .href("href")
                                .addIcon(
                                    ImageObject.builder()
                                        .height(300L)
                                        .url(
                                            "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                        )
                                        .width(300L)
                                        .published(true)
                                        .build()
                                )
                                .name("EQUAL")
                                .published(true)
                                .build()
                        )
                        .published(true)
                        .build()
                )
                .build()

        assertThat(categoryListResponse.categories())
            .isEqualTo(
                CategoryListResponse.Categories.builder()
                    .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                    .limit(20L)
                    .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .offset(0L)
                    .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                    .total(4L)
                    .addItem(
                        CategoryListResponse.Categories.Item.builder()
                            .id("equal")
                            .href("href")
                            .addIcon(
                                ImageObject.builder()
                                    .height(300L)
                                    .url(
                                        "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                    )
                                    .width(300L)
                                    .published(true)
                                    .build()
                            )
                            .name("EQUAL")
                            .published(true)
                            .build()
                    )
                    .published(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val categoryListResponse =
            CategoryListResponse.builder()
                .categories(
                    CategoryListResponse.Categories.builder()
                        .href("https://api.spotify.com/v1/me/shows?offset=0&limit=20\n")
                        .limit(20L)
                        .next("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .offset(0L)
                        .previous("https://api.spotify.com/v1/me/shows?offset=1&limit=1")
                        .total(4L)
                        .addItem(
                            CategoryListResponse.Categories.Item.builder()
                                .id("equal")
                                .href("href")
                                .addIcon(
                                    ImageObject.builder()
                                        .height(300L)
                                        .url(
                                            "https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n"
                                        )
                                        .width(300L)
                                        .published(true)
                                        .build()
                                )
                                .name("EQUAL")
                                .published(true)
                                .build()
                        )
                        .published(true)
                        .build()
                )
                .build()

        val roundtrippedCategoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(categoryListResponse),
                jacksonTypeRef<CategoryListResponse>(),
            )

        assertThat(roundtrippedCategoryListResponse).isEqualTo(categoryListResponse)
    }
}
