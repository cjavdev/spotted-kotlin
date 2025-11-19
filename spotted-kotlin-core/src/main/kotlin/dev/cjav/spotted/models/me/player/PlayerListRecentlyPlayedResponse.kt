// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.errors.SpottedInvalidDataException
import dev.cjav.spotted.models.TrackObject
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PlayerListRecentlyPlayedResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val context: JsonField<ContextObject>,
    private val playedAt: JsonField<OffsetDateTime>,
    private val track: JsonField<TrackObject>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("context")
        @ExcludeMissing
        context: JsonField<ContextObject> = JsonMissing.of(),
        @JsonProperty("played_at")
        @ExcludeMissing
        playedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("track") @ExcludeMissing track: JsonField<TrackObject> = JsonMissing.of(),
    ) : this(context, playedAt, track, mutableMapOf())

    /**
     * The context the track was played from.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): ContextObject? = context.getNullable("context")

    /**
     * The date and time the track was played.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playedAt(): OffsetDateTime? = playedAt.getNullable("played_at")

    /**
     * The track the user listened to.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun track(): TrackObject? = track.getNullable("track")

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<ContextObject> = context

    /**
     * Returns the raw JSON value of [playedAt].
     *
     * Unlike [playedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("played_at") @ExcludeMissing fun _playedAt(): JsonField<OffsetDateTime> = playedAt

    /**
     * Returns the raw JSON value of [track].
     *
     * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("track") @ExcludeMissing fun _track(): JsonField<TrackObject> = track

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
         * [PlayerListRecentlyPlayedResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [PlayerListRecentlyPlayedResponse]. */
    class Builder internal constructor() {

        private var context: JsonField<ContextObject> = JsonMissing.of()
        private var playedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var track: JsonField<TrackObject> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(playerListRecentlyPlayedResponse: PlayerListRecentlyPlayedResponse) =
            apply {
                context = playerListRecentlyPlayedResponse.context
                playedAt = playerListRecentlyPlayedResponse.playedAt
                track = playerListRecentlyPlayedResponse.track
                additionalProperties =
                    playerListRecentlyPlayedResponse.additionalProperties.toMutableMap()
            }

        /** The context the track was played from. */
        fun context(context: ContextObject) = context(JsonField.of(context))

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [ContextObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun context(context: JsonField<ContextObject>) = apply { this.context = context }

        /** The date and time the track was played. */
        fun playedAt(playedAt: OffsetDateTime) = playedAt(JsonField.of(playedAt))

        /**
         * Sets [Builder.playedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun playedAt(playedAt: JsonField<OffsetDateTime>) = apply { this.playedAt = playedAt }

        /** The track the user listened to. */
        fun track(track: TrackObject) = track(JsonField.of(track))

        /**
         * Sets [Builder.track] to an arbitrary JSON value.
         *
         * You should usually call [Builder.track] with a well-typed [TrackObject] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun track(track: JsonField<TrackObject>) = apply { this.track = track }

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
         * Returns an immutable instance of [PlayerListRecentlyPlayedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlayerListRecentlyPlayedResponse =
            PlayerListRecentlyPlayedResponse(
                context,
                playedAt,
                track,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlayerListRecentlyPlayedResponse = apply {
        if (validated) {
            return@apply
        }

        context()?.validate()
        playedAt()
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
        (context.asKnown()?.validity() ?: 0) +
            (if (playedAt.asKnown() == null) 0 else 1) +
            (track.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlayerListRecentlyPlayedResponse &&
            context == other.context &&
            playedAt == other.playedAt &&
            track == other.track &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(context, playedAt, track, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlayerListRecentlyPlayedResponse{context=$context, playedAt=$playedAt, track=$track, additionalProperties=$additionalProperties}"
}
