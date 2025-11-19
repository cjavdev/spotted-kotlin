// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlayerGetDevicesResponseTest {

    @Test
    fun create() {
        val playerGetDevicesResponse =
            PlayerGetDevicesResponse.builder()
                .addDevice(
                    DeviceObject.builder()
                        .id("id")
                        .isActive(true)
                        .isPrivateSession(true)
                        .isRestricted(true)
                        .name("Kitchen speaker")
                        .supportsVolume(true)
                        .type("computer")
                        .volumePercent(59L)
                        .build()
                )
                .build()

        assertThat(playerGetDevicesResponse.devices())
            .containsExactly(
                DeviceObject.builder()
                    .id("id")
                    .isActive(true)
                    .isPrivateSession(true)
                    .isRestricted(true)
                    .name("Kitchen speaker")
                    .supportsVolume(true)
                    .type("computer")
                    .volumePercent(59L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val playerGetDevicesResponse =
            PlayerGetDevicesResponse.builder()
                .addDevice(
                    DeviceObject.builder()
                        .id("id")
                        .isActive(true)
                        .isPrivateSession(true)
                        .isRestricted(true)
                        .name("Kitchen speaker")
                        .supportsVolume(true)
                        .type("computer")
                        .volumePercent(59L)
                        .build()
                )
                .build()

        val roundtrippedPlayerGetDevicesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(playerGetDevicesResponse),
                jacksonTypeRef<PlayerGetDevicesResponse>(),
            )

        assertThat(roundtrippedPlayerGetDevicesResponse).isEqualTo(playerGetDevicesResponse)
    }
}
