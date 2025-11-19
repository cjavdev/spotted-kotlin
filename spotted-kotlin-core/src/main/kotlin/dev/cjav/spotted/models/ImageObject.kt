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
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class ImageObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val height: JsonField<Long>,
    private val url: JsonField<String>,
    private val width: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
    ) : this(height, url, width, mutableMapOf())

    /**
     * The image height in pixels.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Long? = height.getNullable("height")

    /**
     * The source URL of the image.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * The image width in pixels.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun width(): Long? = width.getNullable("width")

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

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
         * Returns a mutable builder for constructing an instance of [ImageObject].
         *
         * The following fields are required:
         * ```kotlin
         * .height()
         * .url()
         * .width()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ImageObject]. */
    class Builder internal constructor() {

        private var height: JsonField<Long>? = null
        private var url: JsonField<String>? = null
        private var width: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(imageObject: ImageObject) = apply {
            height = imageObject.height
            url = imageObject.url
            width = imageObject.width
            additionalProperties = imageObject.additionalProperties.toMutableMap()
        }

        /** The image height in pixels. */
        fun height(height: Long?) = height(JsonField.ofNullable(height))

        /**
         * Alias for [Builder.height].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun height(height: Long) = height(height as Long?)

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Long>) = apply { this.height = height }

        /** The source URL of the image. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** The image width in pixels. */
        fun width(width: Long?) = width(JsonField.ofNullable(width))

        /**
         * Alias for [Builder.width].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun width(width: Long) = width(width as Long?)

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Long>) = apply { this.width = width }

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
         * Returns an immutable instance of [ImageObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .height()
         * .url()
         * .width()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ImageObject =
            ImageObject(
                checkRequired("height", height),
                checkRequired("url", url),
                checkRequired("width", width),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ImageObject = apply {
        if (validated) {
            return@apply
        }

        height()
        url()
        width()
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
        (if (height.asKnown() == null) 0 else 1) +
            (if (url.asKnown() == null) 0 else 1) +
            (if (width.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImageObject &&
            height == other.height &&
            url == other.url &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(height, url, width, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ImageObject{height=$height, url=$url, width=$width, additionalProperties=$additionalProperties}"
}
