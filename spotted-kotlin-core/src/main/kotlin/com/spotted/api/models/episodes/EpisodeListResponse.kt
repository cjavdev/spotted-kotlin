// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.episodes

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
import com.spotted.api.models.EpisodeObject
import java.util.Collections
import java.util.Objects

class EpisodeListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val episodes: JsonField<List<EpisodeObject>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("episodes")
        @ExcludeMissing
        episodes: JsonField<List<EpisodeObject>> = JsonMissing.of()
    ) : this(episodes, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun episodes(): List<EpisodeObject> = episodes.getRequired("episodes")

    /**
     * Returns the raw JSON value of [episodes].
     *
     * Unlike [episodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("episodes")
    @ExcludeMissing
    fun _episodes(): JsonField<List<EpisodeObject>> = episodes

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
         * Returns a mutable builder for constructing an instance of [EpisodeListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .episodes()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EpisodeListResponse]. */
    class Builder internal constructor() {

        private var episodes: JsonField<MutableList<EpisodeObject>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(episodeListResponse: EpisodeListResponse) = apply {
            episodes = episodeListResponse.episodes.map { it.toMutableList() }
            additionalProperties = episodeListResponse.additionalProperties.toMutableMap()
        }

        fun episodes(episodes: List<EpisodeObject>) = episodes(JsonField.of(episodes))

        /**
         * Sets [Builder.episodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.episodes] with a well-typed `List<EpisodeObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun episodes(episodes: JsonField<List<EpisodeObject>>) = apply {
            this.episodes = episodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [EpisodeObject] to [episodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEpisode(episode: EpisodeObject) = apply {
            episodes =
                (episodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("episodes", it).add(episode)
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
         * Returns an immutable instance of [EpisodeListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .episodes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EpisodeListResponse =
            EpisodeListResponse(
                checkRequired("episodes", episodes).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EpisodeListResponse = apply {
        if (validated) {
            return@apply
        }

        episodes().forEach { it.validate() }
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
    internal fun validity(): Int = (episodes.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EpisodeListResponse &&
            episodes == other.episodes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(episodes, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EpisodeListResponse{episodes=$episodes, additionalProperties=$additionalProperties}"
}
