// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.player

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
import dev.cjav.spotted.core.BaseDeserializer
import dev.cjav.spotted.core.BaseSerializer
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.core.getOrThrow
import dev.cjav.spotted.errors.SpottedInvalidDataException
import dev.cjav.spotted.models.EpisodeObject
import dev.cjav.spotted.models.TrackObject
import java.util.Collections
import java.util.Objects

class PlayerGetStateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actions: JsonField<Actions>,
    private val context: JsonField<ContextObject>,
    private val currentlyPlayingType: JsonField<String>,
    private val device: JsonField<DeviceObject>,
    private val isPlaying: JsonField<Boolean>,
    private val item: JsonField<Item>,
    private val progressMs: JsonField<Long>,
    private val repeatState: JsonField<String>,
    private val shuffleState: JsonField<Boolean>,
    private val timestamp: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actions") @ExcludeMissing actions: JsonField<Actions> = JsonMissing.of(),
        @JsonProperty("context")
        @ExcludeMissing
        context: JsonField<ContextObject> = JsonMissing.of(),
        @JsonProperty("currently_playing_type")
        @ExcludeMissing
        currentlyPlayingType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device") @ExcludeMissing device: JsonField<DeviceObject> = JsonMissing.of(),
        @JsonProperty("is_playing")
        @ExcludeMissing
        isPlaying: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("item") @ExcludeMissing item: JsonField<Item> = JsonMissing.of(),
        @JsonProperty("progress_ms") @ExcludeMissing progressMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("repeat_state")
        @ExcludeMissing
        repeatState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shuffle_state")
        @ExcludeMissing
        shuffleState: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<Long> = JsonMissing.of(),
    ) : this(
        actions,
        context,
        currentlyPlayingType,
        device,
        isPlaying,
        item,
        progressMs,
        repeatState,
        shuffleState,
        timestamp,
        mutableMapOf(),
    )

    /**
     * Allows to update the user interface based on which playback actions are available within the
     * current context.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actions(): Actions? = actions.getNullable("actions")

    /**
     * A Context Object. Can be `null`.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): ContextObject? = context.getNullable("context")

    /**
     * The object type of the currently playing item. Can be one of `track`, `episode`, `ad` or
     * `unknown`.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentlyPlayingType(): String? = currentlyPlayingType.getNullable("currently_playing_type")

    /**
     * The device that is currently active.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun device(): DeviceObject? = device.getNullable("device")

    /**
     * If something is currently playing, return `true`.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPlaying(): Boolean? = isPlaying.getNullable("is_playing")

    /**
     * The currently playing track or episode. Can be `null`.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun item(): Item? = item.getNullable("item")

    /**
     * Progress into the currently playing track or episode. Can be `null`.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun progressMs(): Long? = progressMs.getNullable("progress_ms")

    /**
     * off, track, context
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun repeatState(): String? = repeatState.getNullable("repeat_state")

    /**
     * If shuffle is on or off.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shuffleState(): Boolean? = shuffleState.getNullable("shuffle_state")

    /**
     * Unix Millisecond Timestamp when playback state was last changed (play, pause, skip, scrub,
     * new song, etc.).
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timestamp(): Long? = timestamp.getNullable("timestamp")

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<Actions> = actions

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<ContextObject> = context

    /**
     * Returns the raw JSON value of [currentlyPlayingType].
     *
     * Unlike [currentlyPlayingType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("currently_playing_type")
    @ExcludeMissing
    fun _currentlyPlayingType(): JsonField<String> = currentlyPlayingType

    /**
     * Returns the raw JSON value of [device].
     *
     * Unlike [device], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device") @ExcludeMissing fun _device(): JsonField<DeviceObject> = device

    /**
     * Returns the raw JSON value of [isPlaying].
     *
     * Unlike [isPlaying], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_playing") @ExcludeMissing fun _isPlaying(): JsonField<Boolean> = isPlaying

    /**
     * Returns the raw JSON value of [item].
     *
     * Unlike [item], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("item") @ExcludeMissing fun _item(): JsonField<Item> = item

    /**
     * Returns the raw JSON value of [progressMs].
     *
     * Unlike [progressMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("progress_ms") @ExcludeMissing fun _progressMs(): JsonField<Long> = progressMs

    /**
     * Returns the raw JSON value of [repeatState].
     *
     * Unlike [repeatState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repeat_state")
    @ExcludeMissing
    fun _repeatState(): JsonField<String> = repeatState

    /**
     * Returns the raw JSON value of [shuffleState].
     *
     * Unlike [shuffleState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shuffle_state")
    @ExcludeMissing
    fun _shuffleState(): JsonField<Boolean> = shuffleState

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<Long> = timestamp

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

        /** Returns a mutable builder for constructing an instance of [PlayerGetStateResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [PlayerGetStateResponse]. */
    class Builder internal constructor() {

        private var actions: JsonField<Actions> = JsonMissing.of()
        private var context: JsonField<ContextObject> = JsonMissing.of()
        private var currentlyPlayingType: JsonField<String> = JsonMissing.of()
        private var device: JsonField<DeviceObject> = JsonMissing.of()
        private var isPlaying: JsonField<Boolean> = JsonMissing.of()
        private var item: JsonField<Item> = JsonMissing.of()
        private var progressMs: JsonField<Long> = JsonMissing.of()
        private var repeatState: JsonField<String> = JsonMissing.of()
        private var shuffleState: JsonField<Boolean> = JsonMissing.of()
        private var timestamp: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(playerGetStateResponse: PlayerGetStateResponse) = apply {
            actions = playerGetStateResponse.actions
            context = playerGetStateResponse.context
            currentlyPlayingType = playerGetStateResponse.currentlyPlayingType
            device = playerGetStateResponse.device
            isPlaying = playerGetStateResponse.isPlaying
            item = playerGetStateResponse.item
            progressMs = playerGetStateResponse.progressMs
            repeatState = playerGetStateResponse.repeatState
            shuffleState = playerGetStateResponse.shuffleState
            timestamp = playerGetStateResponse.timestamp
            additionalProperties = playerGetStateResponse.additionalProperties.toMutableMap()
        }

        /**
         * Allows to update the user interface based on which playback actions are available within
         * the current context.
         */
        fun actions(actions: Actions) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed [Actions] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actions(actions: JsonField<Actions>) = apply { this.actions = actions }

        /** A Context Object. Can be `null`. */
        fun context(context: ContextObject) = context(JsonField.of(context))

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [ContextObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun context(context: JsonField<ContextObject>) = apply { this.context = context }

        /**
         * The object type of the currently playing item. Can be one of `track`, `episode`, `ad` or
         * `unknown`.
         */
        fun currentlyPlayingType(currentlyPlayingType: String) =
            currentlyPlayingType(JsonField.of(currentlyPlayingType))

        /**
         * Sets [Builder.currentlyPlayingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentlyPlayingType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentlyPlayingType(currentlyPlayingType: JsonField<String>) = apply {
            this.currentlyPlayingType = currentlyPlayingType
        }

        /** The device that is currently active. */
        fun device(device: DeviceObject) = device(JsonField.of(device))

        /**
         * Sets [Builder.device] to an arbitrary JSON value.
         *
         * You should usually call [Builder.device] with a well-typed [DeviceObject] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun device(device: JsonField<DeviceObject>) = apply { this.device = device }

        /** If something is currently playing, return `true`. */
        fun isPlaying(isPlaying: Boolean) = isPlaying(JsonField.of(isPlaying))

        /**
         * Sets [Builder.isPlaying] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPlaying] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPlaying(isPlaying: JsonField<Boolean>) = apply { this.isPlaying = isPlaying }

        /** The currently playing track or episode. Can be `null`. */
        fun item(item: Item) = item(JsonField.of(item))

        /**
         * Sets [Builder.item] to an arbitrary JSON value.
         *
         * You should usually call [Builder.item] with a well-typed [Item] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun item(item: JsonField<Item>) = apply { this.item = item }

        /** Alias for calling [item] with `Item.ofTrack(track)`. */
        fun item(track: TrackObject) = item(Item.ofTrack(track))

        /** Alias for calling [item] with `Item.ofEpisode(episode)`. */
        fun item(episode: EpisodeObject) = item(Item.ofEpisode(episode))

        /** Progress into the currently playing track or episode. Can be `null`. */
        fun progressMs(progressMs: Long) = progressMs(JsonField.of(progressMs))

        /**
         * Sets [Builder.progressMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progressMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun progressMs(progressMs: JsonField<Long>) = apply { this.progressMs = progressMs }

        /** off, track, context */
        fun repeatState(repeatState: String) = repeatState(JsonField.of(repeatState))

        /**
         * Sets [Builder.repeatState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repeatState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun repeatState(repeatState: JsonField<String>) = apply { this.repeatState = repeatState }

        /** If shuffle is on or off. */
        fun shuffleState(shuffleState: Boolean) = shuffleState(JsonField.of(shuffleState))

        /**
         * Sets [Builder.shuffleState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shuffleState] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shuffleState(shuffleState: JsonField<Boolean>) = apply {
            this.shuffleState = shuffleState
        }

        /**
         * Unix Millisecond Timestamp when playback state was last changed (play, pause, skip,
         * scrub, new song, etc.).
         */
        fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

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
         * Returns an immutable instance of [PlayerGetStateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlayerGetStateResponse =
            PlayerGetStateResponse(
                actions,
                context,
                currentlyPlayingType,
                device,
                isPlaying,
                item,
                progressMs,
                repeatState,
                shuffleState,
                timestamp,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlayerGetStateResponse = apply {
        if (validated) {
            return@apply
        }

        actions()?.validate()
        context()?.validate()
        currentlyPlayingType()
        device()?.validate()
        isPlaying()
        item()?.validate()
        progressMs()
        repeatState()
        shuffleState()
        timestamp()
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
        (actions.asKnown()?.validity() ?: 0) +
            (context.asKnown()?.validity() ?: 0) +
            (if (currentlyPlayingType.asKnown() == null) 0 else 1) +
            (device.asKnown()?.validity() ?: 0) +
            (if (isPlaying.asKnown() == null) 0 else 1) +
            (item.asKnown()?.validity() ?: 0) +
            (if (progressMs.asKnown() == null) 0 else 1) +
            (if (repeatState.asKnown() == null) 0 else 1) +
            (if (shuffleState.asKnown() == null) 0 else 1) +
            (if (timestamp.asKnown() == null) 0 else 1)

    /**
     * Allows to update the user interface based on which playback actions are available within the
     * current context.
     */
    class Actions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val interruptingPlayback: JsonField<Boolean>,
        private val pausing: JsonField<Boolean>,
        private val resuming: JsonField<Boolean>,
        private val seeking: JsonField<Boolean>,
        private val skippingNext: JsonField<Boolean>,
        private val skippingPrev: JsonField<Boolean>,
        private val togglingRepeatContext: JsonField<Boolean>,
        private val togglingRepeatTrack: JsonField<Boolean>,
        private val togglingShuffle: JsonField<Boolean>,
        private val transferringPlayback: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("interrupting_playback")
            @ExcludeMissing
            interruptingPlayback: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pausing") @ExcludeMissing pausing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("resuming")
            @ExcludeMissing
            resuming: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("seeking") @ExcludeMissing seeking: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skipping_next")
            @ExcludeMissing
            skippingNext: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skipping_prev")
            @ExcludeMissing
            skippingPrev: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("toggling_repeat_context")
            @ExcludeMissing
            togglingRepeatContext: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("toggling_repeat_track")
            @ExcludeMissing
            togglingRepeatTrack: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("toggling_shuffle")
            @ExcludeMissing
            togglingShuffle: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("transferring_playback")
            @ExcludeMissing
            transferringPlayback: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            interruptingPlayback,
            pausing,
            resuming,
            seeking,
            skippingNext,
            skippingPrev,
            togglingRepeatContext,
            togglingRepeatTrack,
            togglingShuffle,
            transferringPlayback,
            mutableMapOf(),
        )

        /**
         * Interrupting playback. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interruptingPlayback(): Boolean? =
            interruptingPlayback.getNullable("interrupting_playback")

        /**
         * Pausing. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pausing(): Boolean? = pausing.getNullable("pausing")

        /**
         * Resuming. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun resuming(): Boolean? = resuming.getNullable("resuming")

        /**
         * Seeking playback location. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun seeking(): Boolean? = seeking.getNullable("seeking")

        /**
         * Skipping to the next context. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun skippingNext(): Boolean? = skippingNext.getNullable("skipping_next")

        /**
         * Skipping to the previous context. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun skippingPrev(): Boolean? = skippingPrev.getNullable("skipping_prev")

        /**
         * Toggling repeat context flag. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun togglingRepeatContext(): Boolean? =
            togglingRepeatContext.getNullable("toggling_repeat_context")

        /**
         * Toggling repeat track flag. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun togglingRepeatTrack(): Boolean? =
            togglingRepeatTrack.getNullable("toggling_repeat_track")

        /**
         * Toggling shuffle flag. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun togglingShuffle(): Boolean? = togglingShuffle.getNullable("toggling_shuffle")

        /**
         * Transfering playback between devices. Optional field.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transferringPlayback(): Boolean? =
            transferringPlayback.getNullable("transferring_playback")

        /**
         * Returns the raw JSON value of [interruptingPlayback].
         *
         * Unlike [interruptingPlayback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("interrupting_playback")
        @ExcludeMissing
        fun _interruptingPlayback(): JsonField<Boolean> = interruptingPlayback

        /**
         * Returns the raw JSON value of [pausing].
         *
         * Unlike [pausing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pausing") @ExcludeMissing fun _pausing(): JsonField<Boolean> = pausing

        /**
         * Returns the raw JSON value of [resuming].
         *
         * Unlike [resuming], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resuming") @ExcludeMissing fun _resuming(): JsonField<Boolean> = resuming

        /**
         * Returns the raw JSON value of [seeking].
         *
         * Unlike [seeking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seeking") @ExcludeMissing fun _seeking(): JsonField<Boolean> = seeking

        /**
         * Returns the raw JSON value of [skippingNext].
         *
         * Unlike [skippingNext], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("skipping_next")
        @ExcludeMissing
        fun _skippingNext(): JsonField<Boolean> = skippingNext

        /**
         * Returns the raw JSON value of [skippingPrev].
         *
         * Unlike [skippingPrev], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("skipping_prev")
        @ExcludeMissing
        fun _skippingPrev(): JsonField<Boolean> = skippingPrev

        /**
         * Returns the raw JSON value of [togglingRepeatContext].
         *
         * Unlike [togglingRepeatContext], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("toggling_repeat_context")
        @ExcludeMissing
        fun _togglingRepeatContext(): JsonField<Boolean> = togglingRepeatContext

        /**
         * Returns the raw JSON value of [togglingRepeatTrack].
         *
         * Unlike [togglingRepeatTrack], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("toggling_repeat_track")
        @ExcludeMissing
        fun _togglingRepeatTrack(): JsonField<Boolean> = togglingRepeatTrack

        /**
         * Returns the raw JSON value of [togglingShuffle].
         *
         * Unlike [togglingShuffle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("toggling_shuffle")
        @ExcludeMissing
        fun _togglingShuffle(): JsonField<Boolean> = togglingShuffle

        /**
         * Returns the raw JSON value of [transferringPlayback].
         *
         * Unlike [transferringPlayback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transferring_playback")
        @ExcludeMissing
        fun _transferringPlayback(): JsonField<Boolean> = transferringPlayback

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

            /** Returns a mutable builder for constructing an instance of [Actions]. */
            fun builder() = Builder()
        }

        /** A builder for [Actions]. */
        class Builder internal constructor() {

            private var interruptingPlayback: JsonField<Boolean> = JsonMissing.of()
            private var pausing: JsonField<Boolean> = JsonMissing.of()
            private var resuming: JsonField<Boolean> = JsonMissing.of()
            private var seeking: JsonField<Boolean> = JsonMissing.of()
            private var skippingNext: JsonField<Boolean> = JsonMissing.of()
            private var skippingPrev: JsonField<Boolean> = JsonMissing.of()
            private var togglingRepeatContext: JsonField<Boolean> = JsonMissing.of()
            private var togglingRepeatTrack: JsonField<Boolean> = JsonMissing.of()
            private var togglingShuffle: JsonField<Boolean> = JsonMissing.of()
            private var transferringPlayback: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(actions: Actions) = apply {
                interruptingPlayback = actions.interruptingPlayback
                pausing = actions.pausing
                resuming = actions.resuming
                seeking = actions.seeking
                skippingNext = actions.skippingNext
                skippingPrev = actions.skippingPrev
                togglingRepeatContext = actions.togglingRepeatContext
                togglingRepeatTrack = actions.togglingRepeatTrack
                togglingShuffle = actions.togglingShuffle
                transferringPlayback = actions.transferringPlayback
                additionalProperties = actions.additionalProperties.toMutableMap()
            }

            /** Interrupting playback. Optional field. */
            fun interruptingPlayback(interruptingPlayback: Boolean) =
                interruptingPlayback(JsonField.of(interruptingPlayback))

            /**
             * Sets [Builder.interruptingPlayback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interruptingPlayback] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun interruptingPlayback(interruptingPlayback: JsonField<Boolean>) = apply {
                this.interruptingPlayback = interruptingPlayback
            }

            /** Pausing. Optional field. */
            fun pausing(pausing: Boolean) = pausing(JsonField.of(pausing))

            /**
             * Sets [Builder.pausing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pausing] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pausing(pausing: JsonField<Boolean>) = apply { this.pausing = pausing }

            /** Resuming. Optional field. */
            fun resuming(resuming: Boolean) = resuming(JsonField.of(resuming))

            /**
             * Sets [Builder.resuming] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resuming] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resuming(resuming: JsonField<Boolean>) = apply { this.resuming = resuming }

            /** Seeking playback location. Optional field. */
            fun seeking(seeking: Boolean) = seeking(JsonField.of(seeking))

            /**
             * Sets [Builder.seeking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seeking] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun seeking(seeking: JsonField<Boolean>) = apply { this.seeking = seeking }

            /** Skipping to the next context. Optional field. */
            fun skippingNext(skippingNext: Boolean) = skippingNext(JsonField.of(skippingNext))

            /**
             * Sets [Builder.skippingNext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skippingNext] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun skippingNext(skippingNext: JsonField<Boolean>) = apply {
                this.skippingNext = skippingNext
            }

            /** Skipping to the previous context. Optional field. */
            fun skippingPrev(skippingPrev: Boolean) = skippingPrev(JsonField.of(skippingPrev))

            /**
             * Sets [Builder.skippingPrev] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skippingPrev] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun skippingPrev(skippingPrev: JsonField<Boolean>) = apply {
                this.skippingPrev = skippingPrev
            }

            /** Toggling repeat context flag. Optional field. */
            fun togglingRepeatContext(togglingRepeatContext: Boolean) =
                togglingRepeatContext(JsonField.of(togglingRepeatContext))

            /**
             * Sets [Builder.togglingRepeatContext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.togglingRepeatContext] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun togglingRepeatContext(togglingRepeatContext: JsonField<Boolean>) = apply {
                this.togglingRepeatContext = togglingRepeatContext
            }

            /** Toggling repeat track flag. Optional field. */
            fun togglingRepeatTrack(togglingRepeatTrack: Boolean) =
                togglingRepeatTrack(JsonField.of(togglingRepeatTrack))

            /**
             * Sets [Builder.togglingRepeatTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.togglingRepeatTrack] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun togglingRepeatTrack(togglingRepeatTrack: JsonField<Boolean>) = apply {
                this.togglingRepeatTrack = togglingRepeatTrack
            }

            /** Toggling shuffle flag. Optional field. */
            fun togglingShuffle(togglingShuffle: Boolean) =
                togglingShuffle(JsonField.of(togglingShuffle))

            /**
             * Sets [Builder.togglingShuffle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.togglingShuffle] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun togglingShuffle(togglingShuffle: JsonField<Boolean>) = apply {
                this.togglingShuffle = togglingShuffle
            }

            /** Transfering playback between devices. Optional field. */
            fun transferringPlayback(transferringPlayback: Boolean) =
                transferringPlayback(JsonField.of(transferringPlayback))

            /**
             * Sets [Builder.transferringPlayback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferringPlayback] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transferringPlayback(transferringPlayback: JsonField<Boolean>) = apply {
                this.transferringPlayback = transferringPlayback
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
             * Returns an immutable instance of [Actions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Actions =
                Actions(
                    interruptingPlayback,
                    pausing,
                    resuming,
                    seeking,
                    skippingNext,
                    skippingPrev,
                    togglingRepeatContext,
                    togglingRepeatTrack,
                    togglingShuffle,
                    transferringPlayback,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Actions = apply {
            if (validated) {
                return@apply
            }

            interruptingPlayback()
            pausing()
            resuming()
            seeking()
            skippingNext()
            skippingPrev()
            togglingRepeatContext()
            togglingRepeatTrack()
            togglingShuffle()
            transferringPlayback()
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
            (if (interruptingPlayback.asKnown() == null) 0 else 1) +
                (if (pausing.asKnown() == null) 0 else 1) +
                (if (resuming.asKnown() == null) 0 else 1) +
                (if (seeking.asKnown() == null) 0 else 1) +
                (if (skippingNext.asKnown() == null) 0 else 1) +
                (if (skippingPrev.asKnown() == null) 0 else 1) +
                (if (togglingRepeatContext.asKnown() == null) 0 else 1) +
                (if (togglingRepeatTrack.asKnown() == null) 0 else 1) +
                (if (togglingShuffle.asKnown() == null) 0 else 1) +
                (if (transferringPlayback.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Actions &&
                interruptingPlayback == other.interruptingPlayback &&
                pausing == other.pausing &&
                resuming == other.resuming &&
                seeking == other.seeking &&
                skippingNext == other.skippingNext &&
                skippingPrev == other.skippingPrev &&
                togglingRepeatContext == other.togglingRepeatContext &&
                togglingRepeatTrack == other.togglingRepeatTrack &&
                togglingShuffle == other.togglingShuffle &&
                transferringPlayback == other.transferringPlayback &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                interruptingPlayback,
                pausing,
                resuming,
                seeking,
                skippingNext,
                skippingPrev,
                togglingRepeatContext,
                togglingRepeatTrack,
                togglingShuffle,
                transferringPlayback,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Actions{interruptingPlayback=$interruptingPlayback, pausing=$pausing, resuming=$resuming, seeking=$seeking, skippingNext=$skippingNext, skippingPrev=$skippingPrev, togglingRepeatContext=$togglingRepeatContext, togglingRepeatTrack=$togglingRepeatTrack, togglingShuffle=$togglingShuffle, transferringPlayback=$transferringPlayback, additionalProperties=$additionalProperties}"
    }

    /** The currently playing track or episode. Can be `null`. */
    @JsonDeserialize(using = Item.Deserializer::class)
    @JsonSerialize(using = Item.Serializer::class)
    class Item
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

        fun validate(): Item = apply {
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

            return other is Item && track == other.track && episode == other.episode
        }

        override fun hashCode(): Int = Objects.hash(track, episode)

        override fun toString(): String =
            when {
                track != null -> "Item{track=$track}"
                episode != null -> "Item{episode=$episode}"
                _json != null -> "Item{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Item")
            }

        companion object {

            fun ofTrack(track: TrackObject) = Item(track = track)

            fun ofEpisode(episode: EpisodeObject) = Item(episode = episode)
        }

        /** An interface that defines how to map each variant of [Item] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitTrack(track: TrackObject): T

            fun visitEpisode(episode: EpisodeObject): T

            /**
             * Maps an unknown variant of [Item] to a value of type [T].
             *
             * An instance of [Item] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws SpottedInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw SpottedInvalidDataException("Unknown Item: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Item>(Item::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Item {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "track" -> {
                        return tryDeserialize(node, jacksonTypeRef<TrackObject>())?.let {
                            Item(track = it, _json = json)
                        } ?: Item(_json = json)
                    }
                    "episode" -> {
                        return tryDeserialize(node, jacksonTypeRef<EpisodeObject>())?.let {
                            Item(episode = it, _json = json)
                        } ?: Item(_json = json)
                    }
                }

                return Item(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Item>(Item::class) {

            override fun serialize(
                value: Item,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.track != null -> generator.writeObject(value.track)
                    value.episode != null -> generator.writeObject(value.episode)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Item")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlayerGetStateResponse &&
            actions == other.actions &&
            context == other.context &&
            currentlyPlayingType == other.currentlyPlayingType &&
            device == other.device &&
            isPlaying == other.isPlaying &&
            item == other.item &&
            progressMs == other.progressMs &&
            repeatState == other.repeatState &&
            shuffleState == other.shuffleState &&
            timestamp == other.timestamp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actions,
            context,
            currentlyPlayingType,
            device,
            isPlaying,
            item,
            progressMs,
            repeatState,
            shuffleState,
            timestamp,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlayerGetStateResponse{actions=$actions, context=$context, currentlyPlayingType=$currentlyPlayingType, device=$device, isPlaying=$isPlaying, item=$item, progressMs=$progressMs, repeatState=$repeatState, shuffleState=$shuffleState, timestamp=$timestamp, additionalProperties=$additionalProperties}"
}
