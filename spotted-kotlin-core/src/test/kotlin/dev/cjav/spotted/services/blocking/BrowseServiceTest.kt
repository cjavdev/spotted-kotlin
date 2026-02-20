// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.browse.BrowseGetFeaturedPlaylistsParams
import dev.cjav.spotted.models.browse.BrowseGetNewReleasesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrowseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFeaturedPlaylists() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val browseService = client.browse()

        val response =
            browseService.getFeaturedPlaylists(
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
    fun getNewReleases() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val browseService = client.browse()

        val response =
            browseService.getNewReleases(
                BrowseGetNewReleasesParams.builder().limit(10L).offset(5L).build()
            )

        response.validate()
    }
}
