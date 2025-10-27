// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.shows

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.errors.SpottedInvalidDataException
import com.spotted.api.models.ShowBase
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ShowListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addedAt: JsonField<OffsetDateTime>,
    private val show: JsonField<ShowBase>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("added_at")
        @ExcludeMissing
        addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("show") @ExcludeMissing show: JsonField<ShowBase> = JsonMissing.of(),
    ) : this(addedAt, show, mutableMapOf())

    /**
     * The date and time the show was saved. Timestamps are returned in ISO 8601 format as
     * Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is
     * imprecise (for example, the date/time of an album release), an additional field indicates the
     * precision; see for example, release_date in an album object.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addedAt(): OffsetDateTime? = addedAt.getNullable("added_at")

    /**
     * Information about the show.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun show(): ShowBase? = show.getNullable("show")

    /**
     * Returns the raw JSON value of [addedAt].
     *
     * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<OffsetDateTime> = addedAt

    /**
     * Returns the raw JSON value of [show].
     *
     * Unlike [show], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("show") @ExcludeMissing fun _show(): JsonField<ShowBase> = show

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

        /** Returns a mutable builder for constructing an instance of [ShowListResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [ShowListResponse]. */
    class Builder internal constructor() {

        private var addedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var show: JsonField<ShowBase> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(showListResponse: ShowListResponse) = apply {
            addedAt = showListResponse.addedAt
            show = showListResponse.show
            additionalProperties = showListResponse.additionalProperties.toMutableMap()
        }

        /**
         * The date and time the show was saved. Timestamps are returned in ISO 8601 format as
         * Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is
         * imprecise (for example, the date/time of an album release), an additional field indicates
         * the precision; see for example, release_date in an album object.
         */
        fun addedAt(addedAt: OffsetDateTime) = addedAt(JsonField.of(addedAt))

        /**
         * Sets [Builder.addedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

        /** Information about the show. */
        fun show(show: ShowBase) = show(JsonField.of(show))

        /**
         * Sets [Builder.show] to an arbitrary JSON value.
         *
         * You should usually call [Builder.show] with a well-typed [ShowBase] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun show(show: JsonField<ShowBase>) = apply { this.show = show }

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
         * Returns an immutable instance of [ShowListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ShowListResponse =
            ShowListResponse(addedAt, show, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ShowListResponse = apply {
        if (validated) {
            return@apply
        }

        addedAt()
        show()?.validate()
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
        (if (addedAt.asKnown() == null) 0 else 1) + (show.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShowListResponse &&
            addedAt == other.addedAt &&
            show == other.show &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(addedAt, show, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShowListResponse{addedAt=$addedAt, show=$show, additionalProperties=$additionalProperties}"
}
