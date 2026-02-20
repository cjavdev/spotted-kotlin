// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveProfile() {
        val client = SpottedOkHttpClient.builder().accessToken("My Access Token").build()
        val userService = client.users()

        val response = userService.retrieveProfile("smedjan")

        response.validate()
    }
}
