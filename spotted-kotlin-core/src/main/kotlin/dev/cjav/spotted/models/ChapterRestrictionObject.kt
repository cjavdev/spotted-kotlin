// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

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

class ChapterRestrictionObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val reason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of()
    ) : this(reason, mutableMapOf())

    /**
     * The reason for the restriction. Supported values:
     * - `market` - The content item is not available in the given market.
     * - `product` - The content item is not available for the user's subscription type.
     * - `explicit` - The content item is explicit and the user's account is set to not play
     *   explicit content.
     * - `payment_required` - Payment is required to play the content item.
     *
     * Additional reasons may be added in the future. **Note**: If you use this field, make sure
     * that your application safely handles unknown values.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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

        /** Returns a mutable builder for constructing an instance of [ChapterRestrictionObject]. */
        fun builder() = Builder()
    }

    /** A builder for [ChapterRestrictionObject]. */
    class Builder internal constructor() {

        private var reason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chapterRestrictionObject: ChapterRestrictionObject) = apply {
            reason = chapterRestrictionObject.reason
            additionalProperties = chapterRestrictionObject.additionalProperties.toMutableMap()
        }

        /**
         * The reason for the restriction. Supported values:
         * - `market` - The content item is not available in the given market.
         * - `product` - The content item is not available for the user's subscription type.
         * - `explicit` - The content item is explicit and the user's account is set to not play
         *   explicit content.
         * - `payment_required` - Payment is required to play the content item.
         *
         * Additional reasons may be added in the future. **Note**: If you use this field, make sure
         * that your application safely handles unknown values.
         */
        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
         * Returns an immutable instance of [ChapterRestrictionObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChapterRestrictionObject =
            ChapterRestrictionObject(reason, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ChapterRestrictionObject = apply {
        if (validated) {
            return@apply
        }

        reason()
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
    internal fun validity(): Int = (if (reason.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChapterRestrictionObject &&
            reason == other.reason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChapterRestrictionObject{reason=$reason, additionalProperties=$additionalProperties}"
}
