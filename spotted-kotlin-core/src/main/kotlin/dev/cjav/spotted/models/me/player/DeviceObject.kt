// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class DeviceObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val isPrivateSession: JsonField<Boolean>,
    private val isRestricted: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val published: JsonField<Boolean>,
    private val supportsVolume: JsonField<Boolean>,
    private val type: JsonField<String>,
    private val volumePercent: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_private_session")
        @ExcludeMissing
        isPrivateSession: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_restricted")
        @ExcludeMissing
        isRestricted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("supports_volume")
        @ExcludeMissing
        supportsVolume: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("volume_percent")
        @ExcludeMissing
        volumePercent: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        isActive,
        isPrivateSession,
        isRestricted,
        name,
        published,
        supportsVolume,
        type,
        volumePercent,
        mutableMapOf(),
    )

    /**
     * The device ID. This ID is unique and persistent to some extent. However, this is not
     * guaranteed and any cached `device_id` should periodically be cleared out and refetched as
     * necessary.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * If this device is the currently active device.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Boolean? = isActive.getNullable("is_active")

    /**
     * If this device is currently in a private session.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPrivateSession(): Boolean? = isPrivateSession.getNullable("is_private_session")

    /**
     * Whether controlling this device is restricted. At present if this is "true" then no Web API
     * commands will be accepted by this device.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRestricted(): Boolean? = isRestricted.getNullable("is_restricted")

    /**
     * A human-readable name for the device. Some devices have a name that the user can configure
     * (e.g. \"Loudest speaker\") and some devices have a generic name associated with the
     * manufacturer or device model.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * The playlist's public/private status (if it should be added to the user's profile or not):
     * `true` the playlist will be public, `false` the playlist will be private, `null` the playlist
     * status is not relevant. For more about public/private status, see
     * [Working with Playlists](/documentation/web-api/concepts/playlists)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun published(): Boolean? = published.getNullable("published")

    /**
     * If this device can be used to set the volume.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsVolume(): Boolean? = supportsVolume.getNullable("supports_volume")

    /**
     * Device type, such as "computer", "smartphone" or "speaker".
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): String? = type.getNullable("type")

    /**
     * The current volume in percent.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun volumePercent(): Long? = volumePercent.getNullable("volume_percent")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [isPrivateSession].
     *
     * Unlike [isPrivateSession], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_private_session")
    @ExcludeMissing
    fun _isPrivateSession(): JsonField<Boolean> = isPrivateSession

    /**
     * Returns the raw JSON value of [isRestricted].
     *
     * Unlike [isRestricted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_restricted")
    @ExcludeMissing
    fun _isRestricted(): JsonField<Boolean> = isRestricted

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

    /**
     * Returns the raw JSON value of [supportsVolume].
     *
     * Unlike [supportsVolume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("supports_volume")
    @ExcludeMissing
    fun _supportsVolume(): JsonField<Boolean> = supportsVolume

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [volumePercent].
     *
     * Unlike [volumePercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("volume_percent")
    @ExcludeMissing
    fun _volumePercent(): JsonField<Long> = volumePercent

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

        /** Returns a mutable builder for constructing an instance of [DeviceObject]. */
        fun builder() = Builder()
    }

    /** A builder for [DeviceObject]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var isPrivateSession: JsonField<Boolean> = JsonMissing.of()
        private var isRestricted: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var published: JsonField<Boolean> = JsonMissing.of()
        private var supportsVolume: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var volumePercent: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(deviceObject: DeviceObject) = apply {
            id = deviceObject.id
            isActive = deviceObject.isActive
            isPrivateSession = deviceObject.isPrivateSession
            isRestricted = deviceObject.isRestricted
            name = deviceObject.name
            published = deviceObject.published
            supportsVolume = deviceObject.supportsVolume
            type = deviceObject.type
            volumePercent = deviceObject.volumePercent
            additionalProperties = deviceObject.additionalProperties.toMutableMap()
        }

        /**
         * The device ID. This ID is unique and persistent to some extent. However, this is not
         * guaranteed and any cached `device_id` should periodically be cleared out and refetched as
         * necessary.
         */
        fun id(id: String?) = id(JsonField.ofNullable(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** If this device is the currently active device. */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** If this device is currently in a private session. */
        fun isPrivateSession(isPrivateSession: Boolean) =
            isPrivateSession(JsonField.of(isPrivateSession))

        /**
         * Sets [Builder.isPrivateSession] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPrivateSession] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isPrivateSession(isPrivateSession: JsonField<Boolean>) = apply {
            this.isPrivateSession = isPrivateSession
        }

        /**
         * Whether controlling this device is restricted. At present if this is "true" then no Web
         * API commands will be accepted by this device.
         */
        fun isRestricted(isRestricted: Boolean) = isRestricted(JsonField.of(isRestricted))

        /**
         * Sets [Builder.isRestricted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRestricted] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRestricted(isRestricted: JsonField<Boolean>) = apply {
            this.isRestricted = isRestricted
        }

        /**
         * A human-readable name for the device. Some devices have a name that the user can
         * configure (e.g. \"Loudest speaker\") and some devices have a generic name associated with
         * the manufacturer or device model.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The playlist's public/private status (if it should be added to the user's profile or
         * not): `true` the playlist will be public, `false` the playlist will be private, `null`
         * the playlist status is not relevant. For more about public/private status, see
         * [Working with Playlists](/documentation/web-api/concepts/playlists)
         */
        fun published(published: Boolean) = published(JsonField.of(published))

        /**
         * Sets [Builder.published] to an arbitrary JSON value.
         *
         * You should usually call [Builder.published] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun published(published: JsonField<Boolean>) = apply { this.published = published }

        /** If this device can be used to set the volume. */
        fun supportsVolume(supportsVolume: Boolean) = supportsVolume(JsonField.of(supportsVolume))

        /**
         * Sets [Builder.supportsVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsVolume] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun supportsVolume(supportsVolume: JsonField<Boolean>) = apply {
            this.supportsVolume = supportsVolume
        }

        /** Device type, such as "computer", "smartphone" or "speaker". */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** The current volume in percent. */
        fun volumePercent(volumePercent: Long?) = volumePercent(JsonField.ofNullable(volumePercent))

        /**
         * Alias for [Builder.volumePercent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun volumePercent(volumePercent: Long) = volumePercent(volumePercent as Long?)

        /**
         * Sets [Builder.volumePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.volumePercent] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun volumePercent(volumePercent: JsonField<Long>) = apply {
            this.volumePercent = volumePercent
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
         * Returns an immutable instance of [DeviceObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DeviceObject =
            DeviceObject(
                id,
                isActive,
                isPrivateSession,
                isRestricted,
                name,
                published,
                supportsVolume,
                type,
                volumePercent,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DeviceObject = apply {
        if (validated) {
            return@apply
        }

        id()
        isActive()
        isPrivateSession()
        isRestricted()
        name()
        published()
        supportsVolume()
        type()
        volumePercent()
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
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (isActive.asKnown() == null) 0 else 1) +
            (if (isPrivateSession.asKnown() == null) 0 else 1) +
            (if (isRestricted.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (published.asKnown() == null) 0 else 1) +
            (if (supportsVolume.asKnown() == null) 0 else 1) +
            (if (type.asKnown() == null) 0 else 1) +
            (if (volumePercent.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeviceObject &&
            id == other.id &&
            isActive == other.isActive &&
            isPrivateSession == other.isPrivateSession &&
            isRestricted == other.isRestricted &&
            name == other.name &&
            published == other.published &&
            supportsVolume == other.supportsVolume &&
            type == other.type &&
            volumePercent == other.volumePercent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            isActive,
            isPrivateSession,
            isRestricted,
            name,
            published,
            supportsVolume,
            type,
            volumePercent,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DeviceObject{id=$id, isActive=$isActive, isPrivateSession=$isPrivateSession, isRestricted=$isRestricted, name=$name, published=$published, supportsVolume=$supportsVolume, type=$type, volumePercent=$volumePercent, additionalProperties=$additionalProperties}"
}
