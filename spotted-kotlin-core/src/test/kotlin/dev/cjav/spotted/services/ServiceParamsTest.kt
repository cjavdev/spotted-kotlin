// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.albums.AlbumRetrieveParams
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: SpottedClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            SpottedOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val albumService = client.albums()
        stubFor(get(anyUrl()).willReturn(ok("{}")))

        albumService.retrieve(
            AlbumRetrieveParams.builder()
                .id("4aawyAB9vmqN3uQ7FjRGTy")
                .market("ES")
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
