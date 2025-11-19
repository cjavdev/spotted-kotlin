// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.recommendations

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
import java.util.Collections
import java.util.Objects

class RecommendationListAvailableGenreSeedsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val genres: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("genres") @ExcludeMissing genres: JsonField<List<String>> = JsonMissing.of()
    ) : this(genres, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun genres(): List<String> = genres.getRequired("genres")

    /**
     * Returns the raw JSON value of [genres].
     *
     * Unlike [genres], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("genres") @ExcludeMissing fun _genres(): JsonField<List<String>> = genres

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
         * Returns a mutable builder for constructing an instance of
         * [RecommendationListAvailableGenreSeedsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .genres()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RecommendationListAvailableGenreSeedsResponse]. */
    class Builder internal constructor() {

        private var genres: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            recommendationListAvailableGenreSeedsResponse:
                RecommendationListAvailableGenreSeedsResponse
        ) = apply {
            genres = recommendationListAvailableGenreSeedsResponse.genres.map { it.toMutableList() }
            additionalProperties =
                recommendationListAvailableGenreSeedsResponse.additionalProperties.toMutableMap()
        }

        fun genres(genres: List<String>) = genres(JsonField.of(genres))

        /**
         * Sets [Builder.genres] to an arbitrary JSON value.
         *
         * You should usually call [Builder.genres] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun genres(genres: JsonField<List<String>>) = apply {
            this.genres = genres.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [genres].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGenre(genre: String) = apply {
            genres =
                (genres ?: JsonField.of(mutableListOf())).also {
                    checkKnown("genres", it).add(genre)
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
         * Returns an immutable instance of [RecommendationListAvailableGenreSeedsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .genres()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecommendationListAvailableGenreSeedsResponse =
            RecommendationListAvailableGenreSeedsResponse(
                checkRequired("genres", genres).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RecommendationListAvailableGenreSeedsResponse = apply {
        if (validated) {
            return@apply
        }

        genres()
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
    internal fun validity(): Int = (genres.asKnown()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecommendationListAvailableGenreSeedsResponse &&
            genres == other.genres &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(genres, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecommendationListAvailableGenreSeedsResponse{genres=$genres, additionalProperties=$additionalProperties}"
}
