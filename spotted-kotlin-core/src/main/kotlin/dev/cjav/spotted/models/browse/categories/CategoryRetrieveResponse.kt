// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.browse.categories

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
import dev.cjav.spotted.models.ImageObject
import java.util.Collections
import java.util.Objects

class CategoryRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val href: JsonField<String>,
    private val icons: JsonField<List<ImageObject>>,
    private val name: JsonField<String>,
    private val published: JsonField<Boolean>,
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
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
    ) : this(id, href, icons, name, published, mutableMapOf())

    /**
     * The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) of the category.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * A link to the Web API endpoint returning full details of the category.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun href(): String = href.getRequired("href")

    /**
     * The category icon, in various sizes.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun icons(): List<ImageObject> = icons.getRequired("icons")

    /**
     * The name of the category.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

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
    @JsonProperty("icons") @ExcludeMissing fun _icons(): JsonField<List<ImageObject>> = icons

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [CategoryRetrieveResponse].
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

    /** A builder for [CategoryRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var href: JsonField<String>? = null
        private var icons: JsonField<MutableList<ImageObject>>? = null
        private var name: JsonField<String>? = null
        private var published: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(categoryRetrieveResponse: CategoryRetrieveResponse) = apply {
            id = categoryRetrieveResponse.id
            href = categoryRetrieveResponse.href
            icons = categoryRetrieveResponse.icons.map { it.toMutableList() }
            name = categoryRetrieveResponse.name
            published = categoryRetrieveResponse.published
            additionalProperties = categoryRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) of the
         * category.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** A link to the Web API endpoint returning full details of the category. */
        fun href(href: String) = href(JsonField.of(href))

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** The category icon, in various sizes. */
        fun icons(icons: List<ImageObject>) = icons(JsonField.of(icons))

        /**
         * Sets [Builder.icons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icons] with a well-typed `List<ImageObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
                (icons ?: JsonField.of(mutableListOf())).also { checkKnown("icons", it).add(icon) }
        }

        /** The name of the category. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [CategoryRetrieveResponse].
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
        fun build(): CategoryRetrieveResponse =
            CategoryRetrieveResponse(
                checkRequired("id", id),
                checkRequired("href", href),
                checkRequired("icons", icons).map { it.toImmutable() },
                checkRequired("name", name),
                published,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CategoryRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        href()
        icons().forEach { it.validate() }
        name()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (href.asKnown() == null) 0 else 1) +
            (icons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (published.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CategoryRetrieveResponse &&
            id == other.id &&
            href == other.href &&
            icons == other.icons &&
            name == other.name &&
            published == other.published &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, href, icons, name, published, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CategoryRetrieveResponse{id=$id, href=$href, icons=$icons, name=$name, published=$published, additionalProperties=$additionalProperties}"
}
