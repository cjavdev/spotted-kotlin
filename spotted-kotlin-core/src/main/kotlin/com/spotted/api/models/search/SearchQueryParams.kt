// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.search

import com.fasterxml.jackson.annotation.JsonCreator
import com.spotted.api.core.Enum
import com.spotted.api.core.JsonField
import com.spotted.api.core.Params
import com.spotted.api.core.checkRequired
import com.spotted.api.core.http.Headers
import com.spotted.api.core.http.QueryParams
import com.spotted.api.core.toImmutable
import com.spotted.api.errors.SpottedInvalidDataException
import java.util.Objects

/**
 * Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or
 * audiobooks that match a keyword string. Audiobooks are only available within the US, UK, Canada,
 * Ireland, New Zealand and Australia markets.
 */
class SearchQueryParams
private constructor(
    private val q: String,
    private val type: List<Type>,
    private val includeExternal: IncludeExternal?,
    private val limit: Long?,
    private val market: String?,
    private val offset: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Your search query.
     *
     * You can narrow down your search using field filters. The available filters are `album`,
     * `artist`, `track`, `year`, `upc`, `tag:hipster`, `tag:new`, `isrc`, and `genre`. Each field
     * filter only applies to certain result types.
     *
     * The `artist` and `year` filters can be used while searching albums, artists and tracks. You
     * can filter on a single `year` or a range (e.g. 1955-1960).<br /> The `album` filter can be
     * used while searching albums and tracks.<br /> The `genre` filter can be used while searching
     * artists and tracks.<br /> The `isrc` and `track` filters can be used while searching
     * tracks.<br /> The `upc`, `tag:new` and `tag:hipster` filters can only be used while searching
     * albums. The `tag:new` filter will return albums released in the past two weeks and
     * `tag:hipster` can be used to return only albums with the lowest 10% popularity.<br />
     */
    fun q(): String = q

    /**
     * A comma-separated list of item types to search across. Search results include hits from all
     * the specified item types. For example: `q=abacab&type=album,track` returns both albums and
     * tracks matching "abacab".
     */
    fun type(): List<Type> = type

    /**
     * If `include_external=audio` is specified it signals that the client can play externally
     * hosted audio content, and marks the content as playable in the response. By default
     * externally hosted audio content is marked as unplayable in the response.
     */
    fun includeExternal(): IncludeExternal? = includeExternal

    /** The maximum number of results to return in each item type. */
    fun limit(): Long? = limit

    /**
     * An [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). If a
     * country code is specified, only content that is available in that market will be
     * returned.<br/> If a valid user access token is specified in the request header, the country
     * associated with the user account will take priority over this parameter.<br/> _**Note**: If
     * neither market or user country are provided, the content is considered unavailable for the
     * client._<br/> Users can view the country that is associated with their account in the
     * [account settings](https://www.spotify.com/account/overview/).
     */
    fun market(): String? = market

    /**
     * The index of the first result to return. Use with limit to get the next page of search
     * results.
     */
    fun offset(): Long? = offset

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SearchQueryParams].
         *
         * The following fields are required:
         * ```kotlin
         * .q()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SearchQueryParams]. */
    class Builder internal constructor() {

        private var q: String? = null
        private var type: MutableList<Type>? = null
        private var includeExternal: IncludeExternal? = null
        private var limit: Long? = null
        private var market: String? = null
        private var offset: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(searchQueryParams: SearchQueryParams) = apply {
            q = searchQueryParams.q
            type = searchQueryParams.type.toMutableList()
            includeExternal = searchQueryParams.includeExternal
            limit = searchQueryParams.limit
            market = searchQueryParams.market
            offset = searchQueryParams.offset
            additionalHeaders = searchQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = searchQueryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Your search query.
         *
         * You can narrow down your search using field filters. The available filters are `album`,
         * `artist`, `track`, `year`, `upc`, `tag:hipster`, `tag:new`, `isrc`, and `genre`. Each
         * field filter only applies to certain result types.
         *
         * The `artist` and `year` filters can be used while searching albums, artists and tracks.
         * You can filter on a single `year` or a range (e.g. 1955-1960).<br /> The `album` filter
         * can be used while searching albums and tracks.<br /> The `genre` filter can be used while
         * searching artists and tracks.<br /> The `isrc` and `track` filters can be used while
         * searching tracks.<br /> The `upc`, `tag:new` and `tag:hipster` filters can only be used
         * while searching albums. The `tag:new` filter will return albums released in the past two
         * weeks and `tag:hipster` can be used to return only albums with the lowest 10%
         * popularity.<br />
         */
        fun q(q: String) = apply { this.q = q }

        /**
         * A comma-separated list of item types to search across. Search results include hits from
         * all the specified item types. For example: `q=abacab&type=album,track` returns both
         * albums and tracks matching "abacab".
         */
        fun type(type: List<Type>) = apply { this.type = type.toMutableList() }

        /**
         * Adds a single [Type] to [Builder.type].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addType(type: Type) = apply {
            this.type = (this.type ?: mutableListOf()).apply { add(type) }
        }

        /**
         * If `include_external=audio` is specified it signals that the client can play externally
         * hosted audio content, and marks the content as playable in the response. By default
         * externally hosted audio content is marked as unplayable in the response.
         */
        fun includeExternal(includeExternal: IncludeExternal?) = apply {
            this.includeExternal = includeExternal
        }

        /** The maximum number of results to return in each item type. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * An [ISO 3166-1 alpha-2 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
         * If a country code is specified, only content that is available in that market will be
         * returned.<br/> If a valid user access token is specified in the request header, the
         * country associated with the user account will take priority over this parameter.<br/>
         * _**Note**: If neither market or user country are provided, the content is considered
         * unavailable for the client._<br/> Users can view the country that is associated with
         * their account in the [account settings](https://www.spotify.com/account/overview/).
         */
        fun market(market: String?) = apply { this.market = market }

        /**
         * The index of the first result to return. Use with limit to get the next page of search
         * results.
         */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

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
         * Returns an immutable instance of [SearchQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .q()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SearchQueryParams =
            SearchQueryParams(
                checkRequired("q", q),
                checkRequired("type", type).toImmutable(),
                includeExternal,
                limit,
                market,
                offset,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("q", q)
                put("type", type.joinToString(",") { it.toString() })
                includeExternal?.let { put("include_external", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                market?.let { put("market", it) }
                offset?.let { put("offset", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ALBUM = of("album")

            val ARTIST = of("artist")

            val PLAYLIST = of("playlist")

            val TRACK = of("track")

            val SHOW = of("show")

            val EPISODE = of("episode")

            val AUDIOBOOK = of("audiobook")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ALBUM,
            ARTIST,
            PLAYLIST,
            TRACK,
            SHOW,
            EPISODE,
            AUDIOBOOK,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALBUM,
            ARTIST,
            PLAYLIST,
            TRACK,
            SHOW,
            EPISODE,
            AUDIOBOOK,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ALBUM -> Value.ALBUM
                ARTIST -> Value.ARTIST
                PLAYLIST -> Value.PLAYLIST
                TRACK -> Value.TRACK
                SHOW -> Value.SHOW
                EPISODE -> Value.EPISODE
                AUDIOBOOK -> Value.AUDIOBOOK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws SpottedInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ALBUM -> Known.ALBUM
                ARTIST -> Known.ARTIST
                PLAYLIST -> Known.PLAYLIST
                TRACK -> Known.TRACK
                SHOW -> Known.SHOW
                EPISODE -> Known.EPISODE
                AUDIOBOOK -> Known.AUDIOBOOK
                else -> throw SpottedInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws SpottedInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw SpottedInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * If `include_external=audio` is specified it signals that the client can play externally
     * hosted audio content, and marks the content as playable in the response. By default
     * externally hosted audio content is marked as unplayable in the response.
     */
    class IncludeExternal @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AUDIO = of("audio")

            fun of(value: String) = IncludeExternal(JsonField.of(value))
        }

        /** An enum containing [IncludeExternal]'s known values. */
        enum class Known {
            AUDIO
        }

        /**
         * An enum containing [IncludeExternal]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IncludeExternal] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUDIO,
            /**
             * An enum member indicating that [IncludeExternal] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AUDIO -> Value.AUDIO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws SpottedInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AUDIO -> Known.AUDIO
                else -> throw SpottedInvalidDataException("Unknown IncludeExternal: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws SpottedInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw SpottedInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): IncludeExternal = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IncludeExternal && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SearchQueryParams &&
            q == other.q &&
            type == other.type &&
            includeExternal == other.includeExternal &&
            limit == other.limit &&
            market == other.market &&
            offset == other.offset &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            q,
            type,
            includeExternal,
            limit,
            market,
            offset,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SearchQueryParams{q=$q, type=$type, includeExternal=$includeExternal, limit=$limit, market=$market, offset=$offset, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
