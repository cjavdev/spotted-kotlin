// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.shows

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.core.checkKnown
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.core.toImmutable
import dev.cjav.spotted.errors.SpottedInvalidDataException
import dev.cjav.spotted.models.ShowBase
import java.util.Collections
import java.util.Objects

class ShowBulkRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [ShowBulkRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .shows()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ShowBulkRetrieveResponse]. */
    class Builder internal constructor() {

        private var shows: JsonField<MutableList<ShowBase>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(showBulkRetrieveResponse: ShowBulkRetrieveResponse) = apply {
            shows = showBulkRetrieveResponse.shows.map { it.toMutableList() }
            additionalProperties = showBulkRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ShowBulkRetrieveResponse].
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
        fun build(): ShowBulkRetrieveResponse =
            ShowBulkRetrieveResponse(
                checkRequired("shows", shows).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ShowBulkRetrieveResponse = apply {
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

        return other is ShowBulkRetrieveResponse &&
            shows == other.shows &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(shows, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShowBulkRetrieveResponse{shows=$shows, additionalProperties=$additionalProperties}"
}
