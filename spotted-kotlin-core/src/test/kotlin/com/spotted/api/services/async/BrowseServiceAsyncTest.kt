// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.browse.BrowseGetFeaturedPlaylistsParams
import com.spotted.api.models.browse.BrowseGetNewReleasesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrowseServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getFeaturedPlaylists() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val browseServiceAsync = client.browse()

        val response =
            browseServiceAsync.getFeaturedPlaylists(
                BrowseGetFeaturedPlaylistsParams.builder()
                    .limit(10L)
                    .locale("sv_SE")
                    .offset(5L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun getNewReleases() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val browseServiceAsync = client.browse()

        val response =
            browseServiceAsync.getNewReleases(
                BrowseGetNewReleasesParams.builder().limit(10L).offset(5L).build()
            )

        response.validate()
    }
}
