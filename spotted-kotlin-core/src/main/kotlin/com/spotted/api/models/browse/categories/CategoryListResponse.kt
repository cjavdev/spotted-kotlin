// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.browse.categories

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
import com.spotted.api.models.ImageObject
import java.util.Collections
import java.util.Objects

class CategoryListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categories: JsonField<Categories>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<Categories> = JsonMissing.of()
    ) : this(categories, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categories(): Categories = categories.getRequired("categories")

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<Categories> = categories

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
         * Returns a mutable builder for constructing an instance of [CategoryListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .categories()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CategoryListResponse]. */
    class Builder internal constructor() {

        private var categories: JsonField<Categories>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(categoryListResponse: CategoryListResponse) = apply {
            categories = categoryListResponse.categories
            additionalProperties = categoryListResponse.additionalProperties.toMutableMap()
        }

        fun categories(categories: Categories) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed [Categories] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun categories(categories: JsonField<Categories>) = apply { this.categories = categories }

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
         * Returns an immutable instance of [CategoryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .categories()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CategoryListResponse =
            CategoryListResponse(
                checkRequired("categories", categories),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CategoryListResponse = apply {
        if (validated) {
            return@apply
        }

        categories().validate()
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
    internal fun validity(): Int = (categories.asKnown()?.validity() ?: 0)

    class Categories
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val href: JsonField<String>,
        private val items: JsonField<List<Item>>,
        private val limit: JsonField<Long>,
        private val next: JsonField<String>,
        private val offset: JsonField<Long>,
        private val previous: JsonField<String>,
        private val total: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previous")
            @ExcludeMissing
            previous: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        ) : this(href, items, limit, next, offset, previous, total, mutableMapOf())

        /**
         * A link to the Web API endpoint returning the full result of the request
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun href(): String = href.getRequired("href")

        /**
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun items(): List<Item> = items.getRequired("items")

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
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
             * Returns a mutable builder for constructing an instance of [Categories].
             *
             * The following fields are required:
             * ```kotlin
             * .href()
             * .items()
             * .limit()
             * .next()
             * .offset()
             * .previous()
             * .total()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Categories]. */
        class Builder internal constructor() {

            private var href: JsonField<String>? = null
            private var items: JsonField<MutableList<Item>>? = null
            private var limit: JsonField<Long>? = null
            private var next: JsonField<String>? = null
            private var offset: JsonField<Long>? = null
            private var previous: JsonField<String>? = null
            private var total: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(categories: Categories) = apply {
                href = categories.href
                items = categories.items.map { it.toMutableList() }
                limit = categories.limit
                next = categories.next
                offset = categories.offset
                previous = categories.previous
                total = categories.total
                additionalProperties = categories.additionalProperties.toMutableMap()
            }

            /** A link to the Web API endpoint returning the full result of the request */
            fun href(href: String) = href(JsonField.of(href))

            /**
             * Sets [Builder.href] to an arbitrary JSON value.
             *
             * You should usually call [Builder.href] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun href(href: JsonField<String>) = apply { this.href = href }

            fun items(items: List<Item>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun items(items: JsonField<List<Item>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [Item] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: Item) = apply {
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
            fun next(next: String?) = next(JsonField.ofNullable(next))

            /**
             * Sets [Builder.next] to an arbitrary JSON value.
             *
             * You should usually call [Builder.next] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun next(next: JsonField<String>) = apply { this.next = next }

            /** The offset of the items returned (as set in the query or by default) */
            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            /** URL to the previous page of items. ( `null` if none) */
            fun previous(previous: String?) = previous(JsonField.ofNullable(previous))

            /**
             * Sets [Builder.previous] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previous] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previous(previous: JsonField<String>) = apply { this.previous = previous }

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
             * Returns an immutable instance of [Categories].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .href()
             * .items()
             * .limit()
             * .next()
             * .offset()
             * .previous()
             * .total()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Categories =
                Categories(
                    checkRequired("href", href),
                    checkRequired("items", items).map { it.toImmutable() },
                    checkRequired("limit", limit),
                    checkRequired("next", next),
                    checkRequired("offset", offset),
                    checkRequired("previous", previous),
                    checkRequired("total", total),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Categories = apply {
            if (validated) {
                return@apply
            }

            href()
            items().forEach { it.validate() }
            limit()
            next()
            offset()
            previous()
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
            (if (href.asKnown() == null) 0 else 1) +
                (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (limit.asKnown() == null) 0 else 1) +
                (if (next.asKnown() == null) 0 else 1) +
                (if (offset.asKnown() == null) 0 else 1) +
                (if (previous.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1)

        class Item
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val href: JsonField<String>,
            private val icons: JsonField<List<ImageObject>>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
                @JsonProperty("icons")
                @ExcludeMissing
                icons: JsonField<List<ImageObject>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(id, href, icons, name, mutableMapOf())

            /**
             * The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) of the
             * category.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * A link to the Web API endpoint returning full details of the category.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun href(): String = href.getRequired("href")

            /**
             * The category icon, in various sizes.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun icons(): List<ImageObject> = icons.getRequired("icons")

            /**
             * The name of the category.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [href].
             *
             * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

            /**
             * Returns the raw JSON value of [icons].
             *
             * Unlike [icons], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("icons")
            @ExcludeMissing
            fun _icons(): JsonField<List<ImageObject>> = icons

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [Item].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .href()
                 * .icons()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Item]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var href: JsonField<String>? = null
                private var icons: JsonField<MutableList<ImageObject>>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    id = item.id
                    href = item.href
                    icons = item.icons.map { it.toMutableList() }
                    name = item.name
                    additionalProperties = item.additionalProperties.toMutableMap()
                }

                /**
                 * The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) of
                 * the category.
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** A link to the Web API endpoint returning full details of the category. */
                fun href(href: String) = href(JsonField.of(href))

                /**
                 * Sets [Builder.href] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.href] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun href(href: JsonField<String>) = apply { this.href = href }

                /** The category icon, in various sizes. */
                fun icons(icons: List<ImageObject>) = icons(JsonField.of(icons))

                /**
                 * Sets [Builder.icons] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.icons] with a well-typed `List<ImageObject>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun icons(icons: JsonField<List<ImageObject>>) = apply {
                    this.icons = icons.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ImageObject] to [icons].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIcon(icon: ImageObject) = apply {
                    icons =
                        (icons ?: JsonField.of(mutableListOf())).also {
                            checkKnown("icons", it).add(icon)
                        }
                }

                /** The name of the category. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Item].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .href()
                 * .icons()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Item =
                    Item(
                        checkRequired("id", id),
                        checkRequired("href", href),
                        checkRequired("icons", icons).map { it.toImmutable() },
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Item = apply {
                if (validated) {
                    return@apply
                }

                id()
                href()
                icons().forEach { it.validate() }
                name()
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
                    (if (href.asKnown() == null) 0 else 1) +
                    (icons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (name.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    id == other.id &&
                    href == other.href &&
                    icons == other.icons &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, href, icons, name, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Item{id=$id, href=$href, icons=$icons, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Categories &&
                href == other.href &&
                items == other.items &&
                limit == other.limit &&
                next == other.next &&
                offset == other.offset &&
                previous == other.previous &&
                total == other.total &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(href, items, limit, next, offset, previous, total, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Categories{href=$href, items=$items, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CategoryListResponse &&
            categories == other.categories &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(categories, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CategoryListResponse{categories=$categories, additionalProperties=$additionalProperties}"
}
