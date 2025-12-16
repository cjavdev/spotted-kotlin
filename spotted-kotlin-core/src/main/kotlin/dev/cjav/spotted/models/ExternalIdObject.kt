// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class ExternalIdObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ean: JsonField<String>,
    private val isrc: JsonField<String>,
    private val published: JsonField<Boolean>,
    private val upc: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ean") @ExcludeMissing ean: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isrc") @ExcludeMissing isrc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("upc") @ExcludeMissing upc: JsonField<String> = JsonMissing.of(),
    ) : this(ean, isrc, published, upc, mutableMapOf())

    /**
     * [International Article
     * Number](http://en.wikipedia.org/wiki/International_Article_Number_%28EAN%29)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ean(): String? = ean.getNullable("ean")

    /**
     * [International Standard Recording
     * Code](http://en.wikipedia.org/wiki/International_Standard_Recording_Code)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isrc(): String? = isrc.getNullable("isrc")

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
     * [Universal Product Code](http://en.wikipedia.org/wiki/Universal_Product_Code)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun upc(): String? = upc.getNullable("upc")

    /**
     * Returns the raw JSON value of [ean].
     *
     * Unlike [ean], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ean") @ExcludeMissing fun _ean(): JsonField<String> = ean

    /**
     * Returns the raw JSON value of [isrc].
     *
     * Unlike [isrc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isrc") @ExcludeMissing fun _isrc(): JsonField<String> = isrc

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

    /**
     * Returns the raw JSON value of [upc].
     *
     * Unlike [upc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upc") @ExcludeMissing fun _upc(): JsonField<String> = upc

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

        /** Returns a mutable builder for constructing an instance of [ExternalIdObject]. */
        fun builder() = Builder()
    }

    /** A builder for [ExternalIdObject]. */
    class Builder internal constructor() {

        private var ean: JsonField<String> = JsonMissing.of()
        private var isrc: JsonField<String> = JsonMissing.of()
        private var published: JsonField<Boolean> = JsonMissing.of()
        private var upc: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalIdObject: ExternalIdObject) = apply {
            ean = externalIdObject.ean
            isrc = externalIdObject.isrc
            published = externalIdObject.published
            upc = externalIdObject.upc
            additionalProperties = externalIdObject.additionalProperties.toMutableMap()
        }

        /**
         * [International Article
         * Number](http://en.wikipedia.org/wiki/International_Article_Number_%28EAN%29)
         */
        fun ean(ean: String) = ean(JsonField.of(ean))

        /**
         * Sets [Builder.ean] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ean] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ean(ean: JsonField<String>) = apply { this.ean = ean }

        /**
         * [International Standard Recording
         * Code](http://en.wikipedia.org/wiki/International_Standard_Recording_Code)
         */
        fun isrc(isrc: String) = isrc(JsonField.of(isrc))

        /**
         * Sets [Builder.isrc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isrc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isrc(isrc: JsonField<String>) = apply { this.isrc = isrc }

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

        /** [Universal Product Code](http://en.wikipedia.org/wiki/Universal_Product_Code) */
        fun upc(upc: String) = upc(JsonField.of(upc))

        /**
         * Sets [Builder.upc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun upc(upc: JsonField<String>) = apply { this.upc = upc }

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
         * Returns an immutable instance of [ExternalIdObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalIdObject =
            ExternalIdObject(ean, isrc, published, upc, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ExternalIdObject = apply {
        if (validated) {
            return@apply
        }

        ean()
        isrc()
        published()
        upc()
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
        (if (ean.asKnown() == null) 0 else 1) +
            (if (isrc.asKnown() == null) 0 else 1) +
            (if (published.asKnown() == null) 0 else 1) +
            (if (upc.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalIdObject &&
            ean == other.ean &&
            isrc == other.isrc &&
            published == other.published &&
            upc == other.upc &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(ean, isrc, published, upc, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalIdObject{ean=$ean, isrc=$isrc, published=$published, upc=$upc, additionalProperties=$additionalProperties}"
}
