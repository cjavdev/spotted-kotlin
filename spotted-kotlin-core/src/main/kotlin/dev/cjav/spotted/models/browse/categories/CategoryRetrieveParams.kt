// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.browse.categories

import dev.cjav.spotted.core.Params
import dev.cjav.spotted.core.http.Headers
import dev.cjav.spotted.core.http.QueryParams
import java.util.Objects

/**
 * Get a single category used to tag items in Spotify (on, for example, the Spotify player’s
 * “Browse” tab).
 */
class CategoryRetrieveParams
private constructor(
    private val categoryId: String?,
    private val locale: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) for the category.
     */
    fun categoryId(): String? = categoryId

    /**
     * The desired language, consisting of an [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1)
     * language code and an
     * [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), joined by
     * an underscore. For example: `es_MX`, meaning &quot;Spanish (Mexico)&quot;. Provide this
     * parameter if you want the category strings returned in a particular language.<br/> _**Note**:
     * if `locale` is not supplied, or if the specified language is not available, the category
     * strings returned will be in the Spotify default language (American English)._
     */
    fun locale(): String? = locale

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CategoryRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CategoryRetrieveParams]. */
        fun builder() = Builder()
    }

    /** A builder for [CategoryRetrieveParams]. */
    class Builder internal constructor() {

        private var categoryId: String? = null
        private var locale: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(categoryRetrieveParams: CategoryRetrieveParams) = apply {
            categoryId = categoryRetrieveParams.categoryId
            locale = categoryRetrieveParams.locale
            additionalHeaders = categoryRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = categoryRetrieveParams.additionalQueryParams.toBuilder()
        }

        /**
         * The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) for the
         * category.
         */
        fun categoryId(categoryId: String?) = apply { this.categoryId = categoryId }

        /**
         * The desired language, consisting of an
         * [ISO 639-1](http://en.wikipedia.org/wiki/ISO_639-1) language code and an
         * [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2),
         * joined by an underscore. For example: `es_MX`, meaning &quot;Spanish (Mexico)&quot;.
         * Provide this parameter if you want the category strings returned in a particular
         * language.<br/> _**Note**: if `locale` is not supplied, or if the specified language is
         * not available, the category strings returned will be in the Spotify default language
         * (American English)._
         */
        fun locale(locale: String?) = apply { this.locale = locale }

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
         * Returns an immutable instance of [CategoryRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CategoryRetrieveParams =
            CategoryRetrieveParams(
                categoryId,
                locale,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> categoryId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                locale?.let { put("locale", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CategoryRetrieveParams &&
            categoryId == other.categoryId &&
            locale == other.locale &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(categoryId, locale, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CategoryRetrieveParams{categoryId=$categoryId, locale=$locale, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
