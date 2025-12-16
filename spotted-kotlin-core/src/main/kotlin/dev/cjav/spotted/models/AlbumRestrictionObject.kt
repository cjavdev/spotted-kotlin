// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.Enum
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class AlbumRestrictionObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val published: JsonField<Boolean>,
    private val reason: JsonField<Reason>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
    ) : this(published, reason, mutableMapOf())

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
     * The reason for the restriction. Albums may be restricted if the content is not available in a
     * given market, to the user's subscription type, or when the user's account is set to not play
     * explicit content. Additional reasons may be added in the future.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Reason? = reason.getNullable("reason")

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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

        /** Returns a mutable builder for constructing an instance of [AlbumRestrictionObject]. */
        fun builder() = Builder()
    }

    /** A builder for [AlbumRestrictionObject]. */
    class Builder internal constructor() {

        private var published: JsonField<Boolean> = JsonMissing.of()
        private var reason: JsonField<Reason> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(albumRestrictionObject: AlbumRestrictionObject) = apply {
            published = albumRestrictionObject.published
            reason = albumRestrictionObject.reason
            additionalProperties = albumRestrictionObject.additionalProperties.toMutableMap()
        }

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

        /**
         * The reason for the restriction. Albums may be restricted if the content is not available
         * in a given market, to the user's subscription type, or when the user's account is set to
         * not play explicit content. Additional reasons may be added in the future.
         */
        fun reason(reason: Reason) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [Reason] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
         * Returns an immutable instance of [AlbumRestrictionObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AlbumRestrictionObject =
            AlbumRestrictionObject(published, reason, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): AlbumRestrictionObject = apply {
        if (validated) {
            return@apply
        }

        published()
        reason()?.validate()
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
        (if (published.asKnown() == null) 0 else 1) + (reason.asKnown()?.validity() ?: 0)

    /**
     * The reason for the restriction. Albums may be restricted if the content is not available in a
     * given market, to the user's subscription type, or when the user's account is set to not play
     * explicit content. Additional reasons may be added in the future.
     */
    class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val MARKET = of("market")

            val PRODUCT = of("product")

            val EXPLICIT = of("explicit")

            fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
        enum class Known {
            MARKET,
            PRODUCT,
            EXPLICIT,
        }

        /**
         * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Reason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MARKET,
            PRODUCT,
            EXPLICIT,
            /** An enum member indicating that [Reason] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                MARKET -> Value.MARKET
                PRODUCT -> Value.PRODUCT
                EXPLICIT -> Value.EXPLICIT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws SpottedInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                MARKET -> Known.MARKET
                PRODUCT -> Known.PRODUCT
                EXPLICIT -> Known.EXPLICIT
                else -> throw SpottedInvalidDataException("Unknown Reason: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws SpottedInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw SpottedInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Reason = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlbumRestrictionObject &&
            published == other.published &&
            reason == other.reason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(published, reason, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AlbumRestrictionObject{published=$published, reason=$reason, additionalProperties=$additionalProperties}"
}
