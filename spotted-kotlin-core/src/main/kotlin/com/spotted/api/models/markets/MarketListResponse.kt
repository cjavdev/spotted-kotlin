// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.markets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.core.checkKnown
import com.spotted.api.core.toImmutable
import com.spotted.api.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class MarketListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val markets: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("markets") @ExcludeMissing markets: JsonField<List<String>> = JsonMissing.of()
    ) : this(markets, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun markets(): List<String>? = markets.getNullable("markets")

    /**
     * Returns the raw JSON value of [markets].
     *
     * Unlike [markets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markets") @ExcludeMissing fun _markets(): JsonField<List<String>> = markets

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

        /** Returns a mutable builder for constructing an instance of [MarketListResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [MarketListResponse]. */
    class Builder internal constructor() {

        private var markets: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(marketListResponse: MarketListResponse) = apply {
            markets = marketListResponse.markets.map { it.toMutableList() }
            additionalProperties = marketListResponse.additionalProperties.toMutableMap()
        }

        fun markets(markets: List<String>) = markets(JsonField.of(markets))

        /**
         * Sets [Builder.markets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markets] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun markets(markets: JsonField<List<String>>) = apply {
            this.markets = markets.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [markets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMarket(market: String) = apply {
            markets =
                (markets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("markets", it).add(market)
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
         * Returns an immutable instance of [MarketListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MarketListResponse =
            MarketListResponse(
                (markets ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketListResponse = apply {
        if (validated) {
            return@apply
        }

        markets()
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
    internal fun validity(): Int = (markets.asKnown()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketListResponse &&
            markets == other.markets &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(markets, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketListResponse{markets=$markets, additionalProperties=$additionalProperties}"
}
