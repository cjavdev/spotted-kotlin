// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.player.queue

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.BaseDeserializer
import com.spotted.api.core.BaseSerializer
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.core.checkKnown
import com.spotted.api.core.getOrThrow
import com.spotted.api.core.toImmutable
import com.spotted.api.errors.SpottedInvalidDataException
import com.spotted.api.models.EpisodeObject
import com.spotted.api.models.TrackObject
import java.util.Collections
import java.util.Objects

class QueueGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currentlyPlaying: JsonField<CurrentlyPlaying>,
    private val queue: JsonField<List<Queue>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currently_playing")
        @ExcludeMissing
        currentlyPlaying: JsonField<CurrentlyPlaying> = JsonMissing.of(),
        @JsonProperty("queue") @ExcludeMissing queue: JsonField<List<Queue>> = JsonMissing.of(),
    ) : this(currentlyPlaying, queue, mutableMapOf())

    /**
     * The currently playing track or episode. Can be `null`.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentlyPlaying(): CurrentlyPlaying? = currentlyPlaying.getNullable("currently_playing")

    /**
     * The tracks or episodes in the queue. Can be empty.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun queue(): List<Queue>? = queue.getNullable("queue")

    /**
     * Returns the raw JSON value of [currentlyPlaying].
     *
     * Unlike [currentlyPlaying], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("currently_playing")
    @ExcludeMissing
    fun _currentlyPlaying(): JsonField<CurrentlyPlaying> = currentlyPlaying

    /**
     * Returns the raw JSON value of [queue].
     *
     * Unlike [queue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queue") @ExcludeMissing fun _queue(): JsonField<List<Queue>> = queue

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

        /** Returns a mutable builder for constructing an instance of [QueueGetResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [QueueGetResponse]. */
    class Builder internal constructor() {

        private var currentlyPlaying: JsonField<CurrentlyPlaying> = JsonMissing.of()
        private var queue: JsonField<MutableList<Queue>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queueGetResponse: QueueGetResponse) = apply {
            currentlyPlaying = queueGetResponse.currentlyPlaying
            queue = queueGetResponse.queue.map { it.toMutableList() }
            additionalProperties = queueGetResponse.additionalProperties.toMutableMap()
        }

        /** The currently playing track or episode. Can be `null`. */
        fun currentlyPlaying(currentlyPlaying: CurrentlyPlaying) =
            currentlyPlaying(JsonField.of(currentlyPlaying))

        /**
         * Sets [Builder.currentlyPlaying] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentlyPlaying] with a well-typed [CurrentlyPlaying]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun currentlyPlaying(currentlyPlaying: JsonField<CurrentlyPlaying>) = apply {
            this.currentlyPlaying = currentlyPlaying
        }

        /** Alias for calling [currentlyPlaying] with `CurrentlyPlaying.ofTrack(track)`. */
        fun currentlyPlaying(track: TrackObject) = currentlyPlaying(CurrentlyPlaying.ofTrack(track))

        /** Alias for calling [currentlyPlaying] with `CurrentlyPlaying.ofEpisode(episode)`. */
        fun currentlyPlaying(episode: EpisodeObject) =
            currentlyPlaying(CurrentlyPlaying.ofEpisode(episode))

        /** The tracks or episodes in the queue. Can be empty. */
        fun queue(queue: List<Queue>) = queue(JsonField.of(queue))

        /**
         * Sets [Builder.queue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queue] with a well-typed `List<Queue>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun queue(queue: JsonField<List<Queue>>) = apply {
            this.queue = queue.map { it.toMutableList() }
        }

        /**
         * Adds a single [Queue] to [Builder.queue].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addQueue(queue: Queue) = apply {
            this.queue =
                (this.queue ?: JsonField.of(mutableListOf())).also {
                    checkKnown("queue", it).add(queue)
                }
        }

        /** Alias for calling [addQueue] with `Queue.ofTrack(track)`. */
        fun addQueue(track: TrackObject) = addQueue(Queue.ofTrack(track))

        /** Alias for calling [addQueue] with `Queue.ofEpisode(episode)`. */
        fun addQueue(episode: EpisodeObject) = addQueue(Queue.ofEpisode(episode))

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
         * Returns an immutable instance of [QueueGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): QueueGetResponse =
            QueueGetResponse(
                currentlyPlaying,
                (queue ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QueueGetResponse = apply {
        if (validated) {
            return@apply
        }

        currentlyPlaying()?.validate()
        queue()?.forEach { it.validate() }
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
        (currentlyPlaying.asKnown()?.validity() ?: 0) +
            (queue.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /** The currently playing track or episode. Can be `null`. */
    @JsonDeserialize(using = CurrentlyPlaying.Deserializer::class)
    @JsonSerialize(using = CurrentlyPlaying.Serializer::class)
    class CurrentlyPlaying
    private constructor(
        private val track: TrackObject? = null,
        private val episode: EpisodeObject? = null,
        private val _json: JsonValue? = null,
    ) {

        fun track(): TrackObject? = track

        fun episode(): EpisodeObject? = episode

        fun isTrack(): Boolean = track != null

        fun isEpisode(): Boolean = episode != null

        fun asTrack(): TrackObject = track.getOrThrow("track")

        fun asEpisode(): EpisodeObject = episode.getOrThrow("episode")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                track != null -> visitor.visitTrack(track)
                episode != null -> visitor.visitEpisode(episode)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): CurrentlyPlaying = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitTrack(track: TrackObject) {
                        track.validate()
                    }

                    override fun visitEpisode(episode: EpisodeObject) {
                        episode.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitTrack(track: TrackObject) = track.validity()

                    override fun visitEpisode(episode: EpisodeObject) = episode.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CurrentlyPlaying && track == other.track && episode == other.episode
        }

        override fun hashCode(): Int = Objects.hash(track, episode)

        override fun toString(): String =
            when {
                track != null -> "CurrentlyPlaying{track=$track}"
                episode != null -> "CurrentlyPlaying{episode=$episode}"
                _json != null -> "CurrentlyPlaying{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CurrentlyPlaying")
            }

        companion object {

            fun ofTrack(track: TrackObject) = CurrentlyPlaying(track = track)

            fun ofEpisode(episode: EpisodeObject) = CurrentlyPlaying(episode = episode)
        }

        /**
         * An interface that defines how to map each variant of [CurrentlyPlaying] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitTrack(track: TrackObject): T

            fun visitEpisode(episode: EpisodeObject): T

            /**
             * Maps an unknown variant of [CurrentlyPlaying] to a value of type [T].
             *
             * An instance of [CurrentlyPlaying] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws SpottedInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw SpottedInvalidDataException("Unknown CurrentlyPlaying: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<CurrentlyPlaying>(CurrentlyPlaying::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CurrentlyPlaying {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "track" -> {
                        return tryDeserialize(node, jacksonTypeRef<TrackObject>())?.let {
                            CurrentlyPlaying(track = it, _json = json)
                        } ?: CurrentlyPlaying(_json = json)
                    }
                    "episode" -> {
                        return tryDeserialize(node, jacksonTypeRef<EpisodeObject>())?.let {
                            CurrentlyPlaying(episode = it, _json = json)
                        } ?: CurrentlyPlaying(_json = json)
                    }
                }

                return CurrentlyPlaying(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<CurrentlyPlaying>(CurrentlyPlaying::class) {

            override fun serialize(
                value: CurrentlyPlaying,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.track != null -> generator.writeObject(value.track)
                    value.episode != null -> generator.writeObject(value.episode)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CurrentlyPlaying")
                }
            }
        }
    }

    @JsonDeserialize(using = Queue.Deserializer::class)
    @JsonSerialize(using = Queue.Serializer::class)
    class Queue
    private constructor(
        private val track: TrackObject? = null,
        private val episode: EpisodeObject? = null,
        private val _json: JsonValue? = null,
    ) {

        fun track(): TrackObject? = track

        fun episode(): EpisodeObject? = episode

        fun isTrack(): Boolean = track != null

        fun isEpisode(): Boolean = episode != null

        fun asTrack(): TrackObject = track.getOrThrow("track")

        fun asEpisode(): EpisodeObject = episode.getOrThrow("episode")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                track != null -> visitor.visitTrack(track)
                episode != null -> visitor.visitEpisode(episode)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Queue = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitTrack(track: TrackObject) {
                        track.validate()
                    }

                    override fun visitEpisode(episode: EpisodeObject) {
                        episode.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitTrack(track: TrackObject) = track.validity()

                    override fun visitEpisode(episode: EpisodeObject) = episode.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Queue && track == other.track && episode == other.episode
        }

        override fun hashCode(): Int = Objects.hash(track, episode)

        override fun toString(): String =
            when {
                track != null -> "Queue{track=$track}"
                episode != null -> "Queue{episode=$episode}"
                _json != null -> "Queue{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Queue")
            }

        companion object {

            fun ofTrack(track: TrackObject) = Queue(track = track)

            fun ofEpisode(episode: EpisodeObject) = Queue(episode = episode)
        }

        /** An interface that defines how to map each variant of [Queue] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitTrack(track: TrackObject): T

            fun visitEpisode(episode: EpisodeObject): T

            /**
             * Maps an unknown variant of [Queue] to a value of type [T].
             *
             * An instance of [Queue] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws SpottedInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw SpottedInvalidDataException("Unknown Queue: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Queue>(Queue::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Queue {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "track" -> {
                        return tryDeserialize(node, jacksonTypeRef<TrackObject>())?.let {
                            Queue(track = it, _json = json)
                        } ?: Queue(_json = json)
                    }
                    "episode" -> {
                        return tryDeserialize(node, jacksonTypeRef<EpisodeObject>())?.let {
                            Queue(episode = it, _json = json)
                        } ?: Queue(_json = json)
                    }
                }

                return Queue(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Queue>(Queue::class) {

            override fun serialize(
                value: Queue,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.track != null -> generator.writeObject(value.track)
                    value.episode != null -> generator.writeObject(value.episode)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Queue")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QueueGetResponse &&
            currentlyPlaying == other.currentlyPlaying &&
            queue == other.queue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(currentlyPlaying, queue, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueueGetResponse{currentlyPlaying=$currentlyPlaying, queue=$queue, additionalProperties=$additionalProperties}"
}
