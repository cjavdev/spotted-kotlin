// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

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
import com.spotted.api.core.getOrThrow
import com.spotted.api.errors.SpottedInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PlaylistTrackObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addedAt: JsonField<OffsetDateTime>,
    private val addedBy: JsonField<PlaylistUserObject>,
    private val isLocal: JsonField<Boolean>,
    private val track: JsonField<Track>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("added_at")
        @ExcludeMissing
        addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("added_by")
        @ExcludeMissing
        addedBy: JsonField<PlaylistUserObject> = JsonMissing.of(),
        @JsonProperty("is_local") @ExcludeMissing isLocal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("track") @ExcludeMissing track: JsonField<Track> = JsonMissing.of(),
    ) : this(addedAt, addedBy, isLocal, track, mutableMapOf())

    /**
     * The date and time the track or episode was added. _**Note**: some very old playlists may
     * return `null` in this field._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addedAt(): OffsetDateTime? = addedAt.getNullable("added_at")

    /**
     * The Spotify user who added the track or episode. _**Note**: some very old playlists may
     * return `null` in this field._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addedBy(): PlaylistUserObject? = addedBy.getNullable("added_by")

    /**
     * Whether this track or episode is a
     * [local file](/documentation/web-api/concepts/playlists/#local-files) or not.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isLocal(): Boolean? = isLocal.getNullable("is_local")

    /**
     * Information about the track or episode.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun track(): Track? = track.getNullable("track")

    /**
     * Returns the raw JSON value of [addedAt].
     *
     * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<OffsetDateTime> = addedAt

    /**
     * Returns the raw JSON value of [addedBy].
     *
     * Unlike [addedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_by")
    @ExcludeMissing
    fun _addedBy(): JsonField<PlaylistUserObject> = addedBy

    /**
     * Returns the raw JSON value of [isLocal].
     *
     * Unlike [isLocal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_local") @ExcludeMissing fun _isLocal(): JsonField<Boolean> = isLocal

    /**
     * Returns the raw JSON value of [track].
     *
     * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("track") @ExcludeMissing fun _track(): JsonField<Track> = track

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

        /** Returns a mutable builder for constructing an instance of [PlaylistTrackObject]. */
        fun builder() = Builder()
    }

    /** A builder for [PlaylistTrackObject]. */
    class Builder internal constructor() {

        private var addedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var addedBy: JsonField<PlaylistUserObject> = JsonMissing.of()
        private var isLocal: JsonField<Boolean> = JsonMissing.of()
        private var track: JsonField<Track> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(playlistTrackObject: PlaylistTrackObject) = apply {
            addedAt = playlistTrackObject.addedAt
            addedBy = playlistTrackObject.addedBy
            isLocal = playlistTrackObject.isLocal
            track = playlistTrackObject.track
            additionalProperties = playlistTrackObject.additionalProperties.toMutableMap()
        }

        /**
         * The date and time the track or episode was added. _**Note**: some very old playlists may
         * return `null` in this field._
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

        /**
         * The Spotify user who added the track or episode. _**Note**: some very old playlists may
         * return `null` in this field._
         */
        fun addedBy(addedBy: PlaylistUserObject) = addedBy(JsonField.of(addedBy))

        /**
         * Sets [Builder.addedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addedBy] with a well-typed [PlaylistUserObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addedBy(addedBy: JsonField<PlaylistUserObject>) = apply { this.addedBy = addedBy }

        /**
         * Whether this track or episode is a
         * [local file](/documentation/web-api/concepts/playlists/#local-files) or not.
         */
        fun isLocal(isLocal: Boolean) = isLocal(JsonField.of(isLocal))

        /**
         * Sets [Builder.isLocal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isLocal] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isLocal(isLocal: JsonField<Boolean>) = apply { this.isLocal = isLocal }

        /** Information about the track or episode. */
        fun track(track: Track) = track(JsonField.of(track))

        /**
         * Sets [Builder.track] to an arbitrary JSON value.
         *
         * You should usually call [Builder.track] with a well-typed [Track] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun track(track: JsonField<Track>) = apply { this.track = track }

        /** Alias for calling [Builder.track] with `Track.ofTrack(track)`. */
        fun track(track: TrackObject) = track(Track.ofTrack(track))

        /** Alias for calling [track] with `Track.ofEpisode(episode)`. */
        fun track(episode: EpisodeObject) = track(Track.ofEpisode(episode))

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
         * Returns an immutable instance of [PlaylistTrackObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlaylistTrackObject =
            PlaylistTrackObject(
                addedAt,
                addedBy,
                isLocal,
                track,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlaylistTrackObject = apply {
        if (validated) {
            return@apply
        }

        addedAt()
        addedBy()?.validate()
        isLocal()
        track()?.validate()
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
            (addedBy.asKnown()?.validity() ?: 0) +
            (if (isLocal.asKnown() == null) 0 else 1) +
            (track.asKnown()?.validity() ?: 0)

    /** Information about the track or episode. */
    @JsonDeserialize(using = Track.Deserializer::class)
    @JsonSerialize(using = Track.Serializer::class)
    class Track
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

        fun validate(): Track = apply {
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

            return other is Track && track == other.track && episode == other.episode
        }

        override fun hashCode(): Int = Objects.hash(track, episode)

        override fun toString(): String =
            when {
                track != null -> "Track{track=$track}"
                episode != null -> "Track{episode=$episode}"
                _json != null -> "Track{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Track")
            }

        companion object {

            fun ofTrack(track: TrackObject) = Track(track = track)

            fun ofEpisode(episode: EpisodeObject) = Track(episode = episode)
        }

        /** An interface that defines how to map each variant of [Track] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitTrack(track: TrackObject): T

            fun visitEpisode(episode: EpisodeObject): T

            /**
             * Maps an unknown variant of [Track] to a value of type [T].
             *
             * An instance of [Track] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws SpottedInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw SpottedInvalidDataException("Unknown Track: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Track>(Track::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Track {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "track" -> {
                        return tryDeserialize(node, jacksonTypeRef<TrackObject>())?.let {
                            Track(track = it, _json = json)
                        } ?: Track(_json = json)
                    }
                    "episode" -> {
                        return tryDeserialize(node, jacksonTypeRef<EpisodeObject>())?.let {
                            Track(episode = it, _json = json)
                        } ?: Track(_json = json)
                    }
                }

                return Track(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Track>(Track::class) {

            override fun serialize(
                value: Track,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.track != null -> generator.writeObject(value.track)
                    value.episode != null -> generator.writeObject(value.episode)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Track")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlaylistTrackObject &&
            addedAt == other.addedAt &&
            addedBy == other.addedBy &&
            isLocal == other.isLocal &&
            track == other.track &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(addedAt, addedBy, isLocal, track, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlaylistTrackObject{addedAt=$addedAt, addedBy=$addedBy, isLocal=$isLocal, track=$track, additionalProperties=$additionalProperties}"
}
