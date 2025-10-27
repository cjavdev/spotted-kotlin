// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.player

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.core.checkKnown
import com.spotted.api.core.checkRequired
import com.spotted.api.core.toImmutable
import com.spotted.api.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class PlayerGetDevicesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val devices: JsonField<List<DeviceObject>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("devices")
        @ExcludeMissing
        devices: JsonField<List<DeviceObject>> = JsonMissing.of()
    ) : this(devices, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun devices(): List<DeviceObject> = devices.getRequired("devices")

    /**
     * Returns the raw JSON value of [devices].
     *
     * Unlike [devices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("devices") @ExcludeMissing fun _devices(): JsonField<List<DeviceObject>> = devices

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlayerGetDevicesResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .devices()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlayerGetDevicesResponse]. */
    class Builder internal constructor() {

        private var devices: JsonField<MutableList<DeviceObject>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(playerGetDevicesResponse: PlayerGetDevicesResponse) = apply {
            devices = playerGetDevicesResponse.devices.map { it.toMutableList() }
            additionalProperties = playerGetDevicesResponse.additionalProperties.toMutableMap()
        }

        fun devices(devices: List<DeviceObject>) = devices(JsonField.of(devices))

        /**
         * Sets [Builder.devices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.devices] with a well-typed `List<DeviceObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun devices(devices: JsonField<List<DeviceObject>>) = apply {
            this.devices = devices.map { it.toMutableList() }
        }

        /**
         * Adds a single [DeviceObject] to [devices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDevice(device: DeviceObject) = apply {
            devices =
                (devices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("devices", it).add(device)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PlayerGetDevicesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .devices()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlayerGetDevicesResponse =
            PlayerGetDevicesResponse(
                checkRequired("devices", devices).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlayerGetDevicesResponse = apply {
        if (validated) {
            return@apply
        }

        devices().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: SpottedInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = (devices.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlayerGetDevicesResponse &&
            devices == other.devices &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(devices, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlayerGetDevicesResponse{devices=$devices, additionalProperties=$additionalProperties}"
}
