// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.browse.BrowseGetFeaturedPlaylistsParams
import dev.cjav.spotted.models.browse.BrowseGetNewReleasesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrowseServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun getFeaturedPlaylists() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun getNewReleases() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val browseServiceAsync = client.browse()

        val response =
            browseServiceAsync.getNewReleases(
                BrowseGetNewReleasesParams.builder().limit(10L).offset(5L).build()
            )

        response.validate()
    }
}
