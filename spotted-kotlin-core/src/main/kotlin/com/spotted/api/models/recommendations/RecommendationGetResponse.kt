// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.recommendations

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
import com.spotted.api.models.TrackObject
import java.util.Collections
import java.util.Objects

class RecommendationGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val seeds: JsonField<List<Seed>>,
    private val tracks: JsonField<List<TrackObject>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("seeds") @ExcludeMissing seeds: JsonField<List<Seed>> = JsonMissing.of(),
        @JsonProperty("tracks")
        @ExcludeMissing
        tracks: JsonField<List<TrackObject>> = JsonMissing.of(),
    ) : this(seeds, tracks, mutableMapOf())

    /**
     * An array of recommendation seed objects.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun seeds(): List<Seed> = seeds.getRequired("seeds")

    /**
     * An array of track objects ordered according to the parameters supplied.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tracks(): List<TrackObject> = tracks.getRequired("tracks")

    /**
     * Returns the raw JSON value of [seeds].
     *
     * Unlike [seeds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seeds") @ExcludeMissing fun _seeds(): JsonField<List<Seed>> = seeds

    /**
     * Returns the raw JSON value of [tracks].
     *
     * Unlike [tracks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracks") @ExcludeMissing fun _tracks(): JsonField<List<TrackObject>> = tracks

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
         * Returns a mutable builder for constructing an instance of [RecommendationGetResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .seeds()
         * .tracks()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RecommendationGetResponse]. */
    class Builder internal constructor() {

        private var seeds: JsonField<MutableList<Seed>>? = null
        private var tracks: JsonField<MutableList<TrackObject>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(recommendationGetResponse: RecommendationGetResponse) = apply {
            seeds = recommendationGetResponse.seeds.map { it.toMutableList() }
            tracks = recommendationGetResponse.tracks.map { it.toMutableList() }
            additionalProperties = recommendationGetResponse.additionalProperties.toMutableMap()
        }

        /** An array of recommendation seed objects. */
        fun seeds(seeds: List<Seed>) = seeds(JsonField.of(seeds))

        /**
         * Sets [Builder.seeds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seeds] with a well-typed `List<Seed>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun seeds(seeds: JsonField<List<Seed>>) = apply {
            this.seeds = seeds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Seed] to [seeds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeed(seed: Seed) = apply {
            seeds =
                (seeds ?: JsonField.of(mutableListOf())).also { checkKnown("seeds", it).add(seed) }
        }

        /** An array of track objects ordered according to the parameters supplied. */
        fun tracks(tracks: List<TrackObject>) = tracks(JsonField.of(tracks))

        /**
         * Sets [Builder.tracks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracks] with a well-typed `List<TrackObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tracks(tracks: JsonField<List<TrackObject>>) = apply {
            this.tracks = tracks.map { it.toMutableList() }
        }

        /**
         * Adds a single [TrackObject] to [tracks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrack(track: TrackObject) = apply {
            tracks =
                (tracks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tracks", it).add(track)
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
         * Returns an immutable instance of [RecommendationGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .seeds()
         * .tracks()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecommendationGetResponse =
            RecommendationGetResponse(
                checkRequired("seeds", seeds).map { it.toImmutable() },
                checkRequired("tracks", tracks).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RecommendationGetResponse = apply {
        if (validated) {
            return@apply
        }

        seeds().forEach { it.validate() }
        tracks().forEach { it.validate() }
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
        (seeds.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (tracks.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Seed
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val afterFilteringSize: JsonField<Long>,
        private val afterRelinkingSize: JsonField<Long>,
        private val href: JsonField<String>,
        private val initialPoolSize: JsonField<Long>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("afterFilteringSize")
            @ExcludeMissing
            afterFilteringSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("afterRelinkingSize")
            @ExcludeMissing
            afterRelinkingSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("initialPoolSize")
            @ExcludeMissing
            initialPoolSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            afterFilteringSize,
            afterRelinkingSize,
            href,
            initialPoolSize,
            type,
            mutableMapOf(),
        )

        /**
         * The id used to select this seed. This will be the same as the string used in the
         * `seed_artists`, `seed_tracks` or `seed_genres` parameter.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): String? = id.getNullable("id")

        /**
         * The number of tracks available after min\_\* and max\_\* filters have been applied.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun afterFilteringSize(): Long? = afterFilteringSize.getNullable("afterFilteringSize")

        /**
         * The number of tracks available after relinking for regional availability.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun afterRelinkingSize(): Long? = afterRelinkingSize.getNullable("afterRelinkingSize")

        /**
         * A link to the full track or artist data for this seed. For tracks this will be a link to
         * a Track Object. For artists a link to an Artist Object. For genre seeds, this value will
         * be `null`.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun href(): String? = href.getNullable("href")

        /**
         * The number of recommended tracks available for this seed.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun initialPoolSize(): Long? = initialPoolSize.getNullable("initialPoolSize")

        /**
         * The entity type of this seed. One of `artist`, `track` or `genre`.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): String? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [afterFilteringSize].
         *
         * Unlike [afterFilteringSize], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("afterFilteringSize")
        @ExcludeMissing
        fun _afterFilteringSize(): JsonField<Long> = afterFilteringSize

        /**
         * Returns the raw JSON value of [afterRelinkingSize].
         *
         * Unlike [afterRelinkingSize], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("afterRelinkingSize")
        @ExcludeMissing
        fun _afterRelinkingSize(): JsonField<Long> = afterRelinkingSize

        /**
         * Returns the raw JSON value of [href].
         *
         * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

        /**
         * Returns the raw JSON value of [initialPoolSize].
         *
         * Unlike [initialPoolSize], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("initialPoolSize")
        @ExcludeMissing
        fun _initialPoolSize(): JsonField<Long> = initialPoolSize

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

            /** Returns a mutable builder for constructing an instance of [Seed]. */
            fun builder() = Builder()
        }

        /** A builder for [Seed]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var afterFilteringSize: JsonField<Long> = JsonMissing.of()
            private var afterRelinkingSize: JsonField<Long> = JsonMissing.of()
            private var href: JsonField<String> = JsonMissing.of()
            private var initialPoolSize: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(seed: Seed) = apply {
                id = seed.id
                afterFilteringSize = seed.afterFilteringSize
                afterRelinkingSize = seed.afterRelinkingSize
                href = seed.href
                initialPoolSize = seed.initialPoolSize
                type = seed.type
                additionalProperties = seed.additionalProperties.toMutableMap()
            }

            /**
             * The id used to select this seed. This will be the same as the string used in the
             * `seed_artists`, `seed_tracks` or `seed_genres` parameter.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The number of tracks available after min\_\* and max\_\* filters have been applied.
             */
            fun afterFilteringSize(afterFilteringSize: Long) =
                afterFilteringSize(JsonField.of(afterFilteringSize))

            /**
             * Sets [Builder.afterFilteringSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.afterFilteringSize] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun afterFilteringSize(afterFilteringSize: JsonField<Long>) = apply {
                this.afterFilteringSize = afterFilteringSize
            }

            /** The number of tracks available after relinking for regional availability. */
            fun afterRelinkingSize(afterRelinkingSize: Long) =
                afterRelinkingSize(JsonField.of(afterRelinkingSize))

            /**
             * Sets [Builder.afterRelinkingSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.afterRelinkingSize] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun afterRelinkingSize(afterRelinkingSize: JsonField<Long>) = apply {
                this.afterRelinkingSize = afterRelinkingSize
            }

            /**
             * A link to the full track or artist data for this seed. For tracks this will be a link
             * to a Track Object. For artists a link to an Artist Object. For genre seeds, this
             * value will be `null`.
             */
            fun href(href: String) = href(JsonField.of(href))

            /**
             * Sets [Builder.href] to an arbitrary JSON value.
             *
             * You should usually call [Builder.href] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun href(href: JsonField<String>) = apply { this.href = href }

            /** The number of recommended tracks available for this seed. */
            fun initialPoolSize(initialPoolSize: Long) =
                initialPoolSize(JsonField.of(initialPoolSize))

            /**
             * Sets [Builder.initialPoolSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialPoolSize] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initialPoolSize(initialPoolSize: JsonField<Long>) = apply {
                this.initialPoolSize = initialPoolSize
            }

            /** The entity type of this seed. One of `artist`, `track` or `genre`. */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Seed].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Seed =
                Seed(
                    id,
                    afterFilteringSize,
                    afterRelinkingSize,
                    href,
                    initialPoolSize,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Seed = apply {
            if (validated) {
                return@apply
            }

            id()
            afterFilteringSize()
            afterRelinkingSize()
            href()
            initialPoolSize()
            type()
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
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (if (afterFilteringSize.asKnown() == null) 0 else 1) +
                (if (afterRelinkingSize.asKnown() == null) 0 else 1) +
                (if (href.asKnown() == null) 0 else 1) +
                (if (initialPoolSize.asKnown() == null) 0 else 1) +
                (if (type.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Seed &&
                id == other.id &&
                afterFilteringSize == other.afterFilteringSize &&
                afterRelinkingSize == other.afterRelinkingSize &&
                href == other.href &&
                initialPoolSize == other.initialPoolSize &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                afterFilteringSize,
                afterRelinkingSize,
                href,
                initialPoolSize,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Seed{id=$id, afterFilteringSize=$afterFilteringSize, afterRelinkingSize=$afterRelinkingSize, href=$href, initialPoolSize=$initialPoolSize, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecommendationGetResponse &&
            seeds == other.seeds &&
            tracks == other.tracks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(seeds, tracks, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecommendationGetResponse{seeds=$seeds, tracks=$tracks, additionalProperties=$additionalProperties}"
}
