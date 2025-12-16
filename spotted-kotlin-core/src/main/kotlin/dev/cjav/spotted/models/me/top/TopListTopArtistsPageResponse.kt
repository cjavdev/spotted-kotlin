// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.top

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
import dev.cjav.spotted.models.ArtistObject
import java.util.Collections
import java.util.Objects

class TopListTopArtistsPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val href: JsonField<String>,
    private val limit: JsonField<Long>,
    private val next: JsonField<String>,
    private val offset: JsonField<Long>,
    private val previous: JsonField<String>,
    private val total: JsonField<Long>,
    private val items: JsonField<List<ArtistObject>>,
    private val published: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("previous") @ExcludeMissing previous: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<ArtistObject>> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
    ) : this(href, limit, next, offset, previous, total, items, published, mutableMapOf())

    /**
     * A link to the Web API endpoint returning the full result of the request
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun href(): String = href.getRequired("href")

    /**
     * The maximum number of items in the response (as set in the query or by default).
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * URL to the next page of items. ( `null` if none)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun next(): String? = next.getNullable("next")

    /**
     * The offset of the items returned (as set in the query or by default)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offset(): Long = offset.getRequired("offset")

    /**
     * URL to the previous page of items. ( `null` if none)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previous(): String? = previous.getNullable("previous")

    /**
     * The total number of items available to return.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Long = total.getRequired("total")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun items(): List<ArtistObject>? = items.getNullable("items")

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
     * Returns the raw JSON value of [href].
     *
     * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

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
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    /**
     * Returns the raw JSON value of [previous].
     *
     * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<String> = previous

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<ArtistObject>> = items

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [TopListTopArtistsPageResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .href()
         * .limit()
         * .next()
         * .offset()
         * .previous()
         * .total()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TopListTopArtistsPageResponse]. */
    class Builder internal constructor() {

        private var href: JsonField<String>? = null
        private var limit: JsonField<Long>? = null
        private var next: JsonField<String>? = null
        private var offset: JsonField<Long>? = null
        private var previous: JsonField<String>? = null
        private var total: JsonField<Long>? = null
        private var items: JsonField<MutableList<ArtistObject>>? = null
        private var published: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(topListTopArtistsPageResponse: TopListTopArtistsPageResponse) = apply {
            href = topListTopArtistsPageResponse.href
            limit = topListTopArtistsPageResponse.limit
            next = topListTopArtistsPageResponse.next
            offset = topListTopArtistsPageResponse.offset
            previous = topListTopArtistsPageResponse.previous
            total = topListTopArtistsPageResponse.total
            items = topListTopArtistsPageResponse.items.map { it.toMutableList() }
            published = topListTopArtistsPageResponse.published
            additionalProperties = topListTopArtistsPageResponse.additionalProperties.toMutableMap()
        }

        /** A link to the Web API endpoint returning the full result of the request */
        fun href(href: String) = href(JsonField.of(href))

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** The maximum number of items in the response (as set in the query or by default). */
        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /** URL to the next page of items. ( `null` if none) */
        fun next(next: String?) = next(JsonField.ofNullable(next))

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        /** The offset of the items returned (as set in the query or by default) */
        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

        /** URL to the previous page of items. ( `null` if none) */
        fun previous(previous: String?) = previous(JsonField.ofNullable(previous))

        /**
         * Sets [Builder.previous] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previous] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun previous(previous: JsonField<String>) = apply { this.previous = previous }

        /** The total number of items available to return. */
        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

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
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

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
         * Returns an immutable instance of [TopListTopArtistsPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .href()
         * .limit()
         * .next()
         * .offset()
         * .previous()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopListTopArtistsPageResponse =
            TopListTopArtistsPageResponse(
                checkRequired("href", href),
                checkRequired("limit", limit),
                checkRequired("next", next),
                checkRequired("offset", offset),
                checkRequired("previous", previous),
                checkRequired("total", total),
                (items ?: JsonMissing.of()).map { it.toImmutable() },
                published,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TopListTopArtistsPageResponse = apply {
        if (validated) {
            return@apply
        }

        href()
        limit()
        next()
        offset()
        previous()
        total()
        items()?.forEach { it.validate() }
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
        (if (href.asKnown() == null) 0 else 1) +
            (if (limit.asKnown() == null) 0 else 1) +
            (if (next.asKnown() == null) 0 else 1) +
            (if (offset.asKnown() == null) 0 else 1) +
            (if (previous.asKnown() == null) 0 else 1) +
            (if (total.asKnown() == null) 0 else 1) +
            (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (published.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopListTopArtistsPageResponse &&
            href == other.href &&
            limit == other.limit &&
            next == other.next &&
            offset == other.offset &&
            previous == other.previous &&
            total == other.total &&
            items == other.items &&
            published == other.published &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            href,
            limit,
            next,
            offset,
            previous,
            total,
            items,
            published,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TopListTopArtistsPageResponse{href=$href, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, items=$items, published=$published, additionalProperties=$additionalProperties}"
}
