// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.shows

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
import com.spotted.api.models.ShowBase
import java.util.Collections
import java.util.Objects

class ShowListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val shows: JsonField<List<ShowBase>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("shows") @ExcludeMissing shows: JsonField<List<ShowBase>> = JsonMissing.of()
    ) : this(shows, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shows(): List<ShowBase> = shows.getRequired("shows")

    /**
     * Returns the raw JSON value of [shows].
     *
     * Unlike [shows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shows") @ExcludeMissing fun _shows(): JsonField<List<ShowBase>> = shows

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
         * Returns a mutable builder for constructing an instance of [ShowListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .shows()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ShowListResponse]. */
    class Builder internal constructor() {

        private var shows: JsonField<MutableList<ShowBase>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(showListResponse: ShowListResponse) = apply {
            shows = showListResponse.shows.map { it.toMutableList() }
            additionalProperties = showListResponse.additionalProperties.toMutableMap()
        }

        fun shows(shows: List<ShowBase>) = shows(JsonField.of(shows))

        /**
         * Sets [Builder.shows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shows] with a well-typed `List<ShowBase>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shows(shows: JsonField<List<ShowBase>>) = apply {
            this.shows = shows.map { it.toMutableList() }
        }

        /**
         * Adds a single [ShowBase] to [shows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addShow(show: ShowBase) = apply {
            shows =
                (shows ?: JsonField.of(mutableListOf())).also { checkKnown("shows", it).add(show) }
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
         * Returns an immutable instance of [ShowListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .shows()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ShowListResponse =
            ShowListResponse(
                checkRequired("shows", shows).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ShowListResponse = apply {
        if (validated) {
            return@apply
        }

        shows().forEach { it.validate() }
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
    internal fun validity(): Int = (shows.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShowListResponse &&
            shows == other.shows &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(shows, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShowListResponse{shows=$shows, additionalProperties=$additionalProperties}"
}
