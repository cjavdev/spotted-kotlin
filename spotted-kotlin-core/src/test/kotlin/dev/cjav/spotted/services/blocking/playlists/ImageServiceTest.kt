// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.playlists

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ImageServiceTest {

    @Test
    fun update(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            SpottedOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val imageService = client.playlists().images()
        stubFor(put(anyUrl()).willReturn(ok().withBody("abc")))

        val image = imageService.update("3cEYpjA9oz9GiPac4AsH4n", "some content")

        assertThat(image.body()).hasContent("abc")
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
        val imageService = client.playlists().images()

        val imageObjects = imageService.list("3cEYpjA9oz9GiPac4AsH4n")

        imageObjects.forEach { it.validate() }
    }
}
