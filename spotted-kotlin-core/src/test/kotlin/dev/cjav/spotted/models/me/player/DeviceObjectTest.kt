// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceObjectTest {

    @Test
    fun create() {
        val deviceObject =
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

        assertThat(deviceObject.id()).isEqualTo("id")
        assertThat(deviceObject.isActive()).isEqualTo(true)
        assertThat(deviceObject.isPrivateSession()).isEqualTo(true)
        assertThat(deviceObject.isRestricted()).isEqualTo(true)
        assertThat(deviceObject.name()).isEqualTo("Kitchen speaker")
        assertThat(deviceObject.supportsVolume()).isEqualTo(true)
        assertThat(deviceObject.type()).isEqualTo("computer")
        assertThat(deviceObject.volumePercent()).isEqualTo(59L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deviceObject =
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

        val roundtrippedDeviceObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deviceObject),
                jacksonTypeRef<DeviceObject>(),
            )

        assertThat(roundtrippedDeviceObject).isEqualTo(deviceObject)
    }
}
