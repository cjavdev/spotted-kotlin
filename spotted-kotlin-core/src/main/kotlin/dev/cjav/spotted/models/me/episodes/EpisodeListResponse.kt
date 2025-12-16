// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.episodes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.errors.SpottedInvalidDataException
import dev.cjav.spotted.models.EpisodeObject
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class EpisodeListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addedAt: JsonField<OffsetDateTime>,
    private val episode: JsonField<EpisodeObject>,
    private val published: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("added_at")
        @ExcludeMissing
        addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("episode")
        @ExcludeMissing
        episode: JsonField<EpisodeObject> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
    ) : this(addedAt, episode, published, mutableMapOf())

    /**
     * The date and time the episode was saved. Timestamps are returned in ISO 8601 format as
     * Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addedAt(): OffsetDateTime? = addedAt.getNullable("added_at")

    /**
     * Information about the episode.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun episode(): EpisodeObject? = episode.getNullable("episode")

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
     * Returns the raw JSON value of [addedAt].
     *
     * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<OffsetDateTime> = addedAt

    /**
     * Returns the raw JSON value of [episode].
     *
     * Unlike [episode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("episode") @ExcludeMissing fun _episode(): JsonField<EpisodeObject> = episode

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

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

        /** Returns a mutable builder for constructing an instance of [EpisodeListResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [EpisodeListResponse]. */
    class Builder internal constructor() {

        private var addedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var episode: JsonField<EpisodeObject> = JsonMissing.of()
        private var published: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(episodeListResponse: EpisodeListResponse) = apply {
            addedAt = episodeListResponse.addedAt
            episode = episodeListResponse.episode
            published = episodeListResponse.published
            additionalProperties = episodeListResponse.additionalProperties.toMutableMap()
        }

        /**
         * The date and time the episode was saved. Timestamps are returned in ISO 8601 format as
         * Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ.
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

        /** Information about the episode. */
        fun episode(episode: EpisodeObject) = episode(JsonField.of(episode))

        /**
         * Sets [Builder.episode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.episode] with a well-typed [EpisodeObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun episode(episode: JsonField<EpisodeObject>) = apply { this.episode = episode }

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
         */
        fun build(): EpisodeListResponse =
            EpisodeListResponse(addedAt, episode, published, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): EpisodeListResponse = apply {
        if (validated) {
            return@apply
        }

        addedAt()
        episode()?.validate()
        published()
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
        (if (addedAt.asKnown() == null) 0 else 1) +
            (episode.asKnown()?.validity() ?: 0) +
            (if (published.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EpisodeListResponse &&
            addedAt == other.addedAt &&
            episode == other.episode &&
            published == other.published &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(addedAt, episode, published, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EpisodeListResponse{addedAt=$addedAt, episode=$episode, published=$published, additionalProperties=$additionalProperties}"
}
