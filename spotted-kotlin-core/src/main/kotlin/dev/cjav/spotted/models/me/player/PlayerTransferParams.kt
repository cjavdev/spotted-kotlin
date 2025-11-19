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
import dev.cjav.spotted.core.Params
import dev.cjav.spotted.core.checkKnown
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.core.http.Headers
import dev.cjav.spotted.core.http.QueryParams
import dev.cjav.spotted.core.toImmutable
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Transfer playback to a new device and optionally begin playback. This API only works for users
 * who have Spotify Premium. The order of execution is not guaranteed when you use this API with
 * other Player API endpoints.
 */
class PlayerTransferParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A JSON array containing the ID of the device on which playback should be
     * started/transferred.<br/>For example:`{device_ids:["74ASZWbe4lXaubB36ztrGX"]}`<br/>_**Note**:
     * Although an array is accepted, only a single device_id is currently supported. Supplying more
     * than one will return `400 Bad Request`_
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deviceIds(): List<String> = body.deviceIds()

    /**
     * **true**: ensure playback happens on new device.<br/>**false** or not provided: keep the
     * current playback state.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun play(): Boolean? = body.play()

    /**
     * Returns the raw JSON value of [deviceIds].
     *
     * Unlike [deviceIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deviceIds(): JsonField<List<String>> = body._deviceIds()

    /**
     * Returns the raw JSON value of [play].
     *
     * Unlike [play], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _play(): JsonField<Boolean> = body._play()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlayerTransferParams].
         *
         * The following fields are required:
         * ```kotlin
         * .deviceIds()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlayerTransferParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(playerTransferParams: PlayerTransferParams) = apply {
            body = playerTransferParams.body.toBuilder()
            additionalHeaders = playerTransferParams.additionalHeaders.toBuilder()
            additionalQueryParams = playerTransferParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [deviceIds]
         * - [play]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A JSON array containing the ID of the device on which playback should be
         * started/transferred.<br/>For
         * example:`{device_ids:["74ASZWbe4lXaubB36ztrGX"]}`<br/>_**Note**: Although an array is
         * accepted, only a single device_id is currently supported. Supplying more than one will
         * return `400 Bad Request`_
         */
        fun deviceIds(deviceIds: List<String>) = apply { body.deviceIds(deviceIds) }

        /**
         * Sets [Builder.deviceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deviceIds(deviceIds: JsonField<List<String>>) = apply { body.deviceIds(deviceIds) }

        /**
         * Adds a single [String] to [deviceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeviceId(deviceId: String) = apply { body.addDeviceId(deviceId) }

        /**
         * **true**: ensure playback happens on new device.<br/>**false** or not provided: keep the
         * current playback state.
         */
        fun play(play: Boolean) = apply { body.play(play) }

        /**
         * Sets [Builder.play] to an arbitrary JSON value.
         *
         * You should usually call [Builder.play] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun play(play: JsonField<Boolean>) = apply { body.play(play) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PlayerTransferParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .deviceIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlayerTransferParams =
            PlayerTransferParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deviceIds: JsonField<List<String>>,
        private val play: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("device_ids")
            @ExcludeMissing
            deviceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("play") @ExcludeMissing play: JsonField<Boolean> = JsonMissing.of(),
        ) : this(deviceIds, play, mutableMapOf())

        /**
         * A JSON array containing the ID of the device on which playback should be
         * started/transferred.<br/>For
         * example:`{device_ids:["74ASZWbe4lXaubB36ztrGX"]}`<br/>_**Note**: Although an array is
         * accepted, only a single device_id is currently supported. Supplying more than one will
         * return `400 Bad Request`_
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deviceIds(): List<String> = deviceIds.getRequired("device_ids")

        /**
         * **true**: ensure playback happens on new device.<br/>**false** or not provided: keep the
         * current playback state.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun play(): Boolean? = play.getNullable("play")

        /**
         * Returns the raw JSON value of [deviceIds].
         *
         * Unlike [deviceIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_ids")
        @ExcludeMissing
        fun _deviceIds(): JsonField<List<String>> = deviceIds

        /**
         * Returns the raw JSON value of [play].
         *
         * Unlike [play], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("play") @ExcludeMissing fun _play(): JsonField<Boolean> = play

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .deviceIds()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var deviceIds: JsonField<MutableList<String>>? = null
            private var play: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                deviceIds = body.deviceIds.map { it.toMutableList() }
                play = body.play
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A JSON array containing the ID of the device on which playback should be
             * started/transferred.<br/>For
             * example:`{device_ids:["74ASZWbe4lXaubB36ztrGX"]}`<br/>_**Note**: Although an array is
             * accepted, only a single device_id is currently supported. Supplying more than one
             * will return `400 Bad Request`_
             */
            fun deviceIds(deviceIds: List<String>) = deviceIds(JsonField.of(deviceIds))

            /**
             * Sets [Builder.deviceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceIds(deviceIds: JsonField<List<String>>) = apply {
                this.deviceIds = deviceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [deviceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDeviceId(deviceId: String) = apply {
                deviceIds =
                    (deviceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("deviceIds", it).add(deviceId)
                    }
            }

            /**
             * **true**: ensure playback happens on new device.<br/>**false** or not provided: keep
             * the current playback state.
             */
            fun play(play: Boolean) = play(JsonField.of(play))

            /**
             * Sets [Builder.play] to an arbitrary JSON value.
             *
             * You should usually call [Builder.play] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun play(play: JsonField<Boolean>) = apply { this.play = play }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .deviceIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("deviceIds", deviceIds).map { it.toImmutable() },
                    play,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            deviceIds()
            play()
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
            (deviceIds.asKnown()?.size ?: 0) + (if (play.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                deviceIds == other.deviceIds &&
                play == other.play &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(deviceIds, play, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{deviceIds=$deviceIds, play=$play, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlayerTransferParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlayerTransferParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
