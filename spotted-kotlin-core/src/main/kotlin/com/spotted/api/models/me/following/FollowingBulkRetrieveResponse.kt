// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.following

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
import com.spotted.api.models.ArtistObject
import java.util.Collections
import java.util.Objects

class FollowingBulkRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val artists: JsonField<Artists>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("artists") @ExcludeMissing artists: JsonField<Artists> = JsonMissing.of()
    ) : this(artists, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun artists(): Artists = artists.getRequired("artists")

    /**
     * Returns the raw JSON value of [artists].
     *
     * Unlike [artists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("artists") @ExcludeMissing fun _artists(): JsonField<Artists> = artists

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
         * [FollowingBulkRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .artists()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [FollowingBulkRetrieveResponse]. */
    class Builder internal constructor() {

        private var artists: JsonField<Artists>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(followingBulkRetrieveResponse: FollowingBulkRetrieveResponse) = apply {
            artists = followingBulkRetrieveResponse.artists
            additionalProperties = followingBulkRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun artists(artists: Artists) = artists(JsonField.of(artists))

        /**
         * Sets [Builder.artists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artists] with a well-typed [Artists] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun artists(artists: JsonField<Artists>) = apply { this.artists = artists }

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
         * Returns an immutable instance of [FollowingBulkRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .artists()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FollowingBulkRetrieveResponse =
            FollowingBulkRetrieveResponse(
                checkRequired("artists", artists),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FollowingBulkRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        artists().validate()
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
    internal fun validity(): Int = (artists.asKnown()?.validity() ?: 0)

    class Artists
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cursors: JsonField<Cursors>,
        private val href: JsonField<String>,
        private val items: JsonField<List<ArtistObject>>,
        private val limit: JsonField<Long>,
        private val next: JsonField<String>,
        private val total: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cursors") @ExcludeMissing cursors: JsonField<Cursors> = JsonMissing.of(),
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("items")
            @ExcludeMissing
            items: JsonField<List<ArtistObject>> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        ) : this(cursors, href, items, limit, next, total, mutableMapOf())

        /**
         * The cursors used to find the next set of items.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cursors(): Cursors? = cursors.getNullable("cursors")

        /**
         * A link to the Web API endpoint returning the full result of the request.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun href(): String? = href.getNullable("href")

        /**
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun items(): List<ArtistObject>? = items.getNullable("items")

        /**
         * The maximum number of items in the response (as set in the query or by default).
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Long? = limit.getNullable("limit")

        /**
         * URL to the next page of items. ( `null` if none)
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun next(): String? = next.getNullable("next")

        /**
         * The total number of items available to return.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun total(): Long? = total.getNullable("total")

        /**
         * Returns the raw JSON value of [cursors].
         *
         * Unlike [cursors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cursors") @ExcludeMissing fun _cursors(): JsonField<Cursors> = cursors

        /**
         * Returns the raw JSON value of [href].
         *
         * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

        /**
         * Returns the raw JSON value of [items].
         *
         * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<ArtistObject>> = items

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [next].
         *
         * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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

            /** Returns a mutable builder for constructing an instance of [Artists]. */
            fun builder() = Builder()
        }

        /** A builder for [Artists]. */
        class Builder internal constructor() {

            private var cursors: JsonField<Cursors> = JsonMissing.of()
            private var href: JsonField<String> = JsonMissing.of()
            private var items: JsonField<MutableList<ArtistObject>>? = null
            private var limit: JsonField<Long> = JsonMissing.of()
            private var next: JsonField<String> = JsonMissing.of()
            private var total: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(artists: Artists) = apply {
                cursors = artists.cursors
                href = artists.href
                items = artists.items.map { it.toMutableList() }
                limit = artists.limit
                next = artists.next
                total = artists.total
                additionalProperties = artists.additionalProperties.toMutableMap()
            }

            /** The cursors used to find the next set of items. */
            fun cursors(cursors: Cursors) = cursors(JsonField.of(cursors))

            /**
             * Sets [Builder.cursors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cursors] with a well-typed [Cursors] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cursors(cursors: JsonField<Cursors>) = apply { this.cursors = cursors }

            /** A link to the Web API endpoint returning the full result of the request. */
            fun href(href: String) = href(JsonField.of(href))

            /**
             * Sets [Builder.href] to an arbitrary JSON value.
             *
             * You should usually call [Builder.href] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun href(href: JsonField<String>) = apply { this.href = href }

            fun items(items: List<ArtistObject>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<ArtistObject>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun items(items: JsonField<List<ArtistObject>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [ArtistObject] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: ArtistObject) = apply {
                items =
                    (items ?: JsonField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
                    }
            }

            /** The maximum number of items in the response (as set in the query or by default). */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** URL to the next page of items. ( `null` if none) */
            fun next(next: String) = next(JsonField.of(next))

            /**
             * Sets [Builder.next] to an arbitrary JSON value.
             *
             * You should usually call [Builder.next] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun next(next: JsonField<String>) = apply { this.next = next }

            /** The total number of items available to return. */
            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

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
             * Returns an immutable instance of [Artists].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Artists =
                Artists(
                    cursors,
                    href,
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    limit,
                    next,
                    total,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Artists = apply {
            if (validated) {
                return@apply
            }

            cursors()?.validate()
            href()
            items()?.forEach { it.validate() }
            limit()
            next()
            total()
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
            (cursors.asKnown()?.validity() ?: 0) +
                (if (href.asKnown() == null) 0 else 1) +
                (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (limit.asKnown() == null) 0 else 1) +
                (if (next.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1)

        /** The cursors used to find the next set of items. */
        class Cursors
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val after: JsonField<String>,
            private val before: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("after") @ExcludeMissing after: JsonField<String> = JsonMissing.of(),
                @JsonProperty("before") @ExcludeMissing before: JsonField<String> = JsonMissing.of(),
            ) : this(after, before, mutableMapOf())

            /**
             * The cursor to use as key to find the next page of items.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun after(): String? = after.getNullable("after")

            /**
             * The cursor to use as key to find the previous page of items.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun before(): String? = before.getNullable("before")

            /**
             * Returns the raw JSON value of [after].
             *
             * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<String> = after

            /**
             * Returns the raw JSON value of [before].
             *
             * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("before") @ExcludeMissing fun _before(): JsonField<String> = before

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

                /** Returns a mutable builder for constructing an instance of [Cursors]. */
                fun builder() = Builder()
            }

            /** A builder for [Cursors]. */
            class Builder internal constructor() {

                private var after: JsonField<String> = JsonMissing.of()
                private var before: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cursors: Cursors) = apply {
                    after = cursors.after
                    before = cursors.before
                    additionalProperties = cursors.additionalProperties.toMutableMap()
                }

                /** The cursor to use as key to find the next page of items. */
                fun after(after: String) = after(JsonField.of(after))

                /**
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun after(after: JsonField<String>) = apply { this.after = after }

                /** The cursor to use as key to find the previous page of items. */
                fun before(before: String) = before(JsonField.of(before))

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<String>) = apply { this.before = before }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Cursors].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Cursors = Cursors(after, before, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Cursors = apply {
                if (validated) {
                    return@apply
                }

                after()
                before()
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
                (if (after.asKnown() == null) 0 else 1) + (if (before.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cursors &&
                    after == other.after &&
                    before == other.before &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(after, before, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Cursors{after=$after, before=$before, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Artists &&
                cursors == other.cursors &&
                href == other.href &&
                items == other.items &&
                limit == other.limit &&
                next == other.next &&
                total == other.total &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cursors, href, items, limit, next, total, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Artists{cursors=$cursors, href=$href, items=$items, limit=$limit, next=$next, total=$total, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FollowingBulkRetrieveResponse &&
            artists == other.artists &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(artists, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FollowingBulkRetrieveResponse{artists=$artists, additionalProperties=$additionalProperties}"
}
