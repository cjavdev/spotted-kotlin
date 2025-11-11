// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.search

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.spotted.api.core.Enum
import com.spotted.api.core.ExcludeMissing
import com.spotted.api.core.JsonField
import com.spotted.api.core.JsonMissing
import com.spotted.api.core.JsonValue
import com.spotted.api.core.checkKnown
import com.spotted.api.core.checkRequired
import com.spotted.api.core.toImmutable
import com.spotted.api.errors.SpottedInvalidDataException
import com.spotted.api.models.AlbumRestrictionObject
import com.spotted.api.models.ArtistObject
import com.spotted.api.models.AudiobookBase
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.ImageObject
import com.spotted.api.models.PagingPlaylistObject
import com.spotted.api.models.ShowBase
import com.spotted.api.models.SimplifiedArtistObject
import com.spotted.api.models.SimplifiedEpisodeObject
import com.spotted.api.models.TrackObject
import java.util.Collections
import java.util.Objects

class SearchQueryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val albums: JsonField<Albums>,
    private val artists: JsonField<Artists>,
    private val audiobooks: JsonField<Audiobooks>,
    private val episodes: JsonField<Episodes>,
    private val playlists: JsonField<PagingPlaylistObject>,
    private val shows: JsonField<Shows>,
    private val tracks: JsonField<Tracks>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("albums") @ExcludeMissing albums: JsonField<Albums> = JsonMissing.of(),
        @JsonProperty("artists") @ExcludeMissing artists: JsonField<Artists> = JsonMissing.of(),
        @JsonProperty("audiobooks")
        @ExcludeMissing
        audiobooks: JsonField<Audiobooks> = JsonMissing.of(),
        @JsonProperty("episodes") @ExcludeMissing episodes: JsonField<Episodes> = JsonMissing.of(),
        @JsonProperty("playlists")
        @ExcludeMissing
        playlists: JsonField<PagingPlaylistObject> = JsonMissing.of(),
        @JsonProperty("shows") @ExcludeMissing shows: JsonField<Shows> = JsonMissing.of(),
        @JsonProperty("tracks") @ExcludeMissing tracks: JsonField<Tracks> = JsonMissing.of(),
    ) : this(albums, artists, audiobooks, episodes, playlists, shows, tracks, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun albums(): Albums? = albums.getNullable("albums")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun artists(): Artists? = artists.getNullable("artists")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audiobooks(): Audiobooks? = audiobooks.getNullable("audiobooks")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun episodes(): Episodes? = episodes.getNullable("episodes")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playlists(): PagingPlaylistObject? = playlists.getNullable("playlists")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shows(): Shows? = shows.getNullable("shows")

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tracks(): Tracks? = tracks.getNullable("tracks")

    /**
     * Returns the raw JSON value of [albums].
     *
     * Unlike [albums], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("albums") @ExcludeMissing fun _albums(): JsonField<Albums> = albums

    /**
     * Returns the raw JSON value of [artists].
     *
     * Unlike [artists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("artists") @ExcludeMissing fun _artists(): JsonField<Artists> = artists

    /**
     * Returns the raw JSON value of [audiobooks].
     *
     * Unlike [audiobooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audiobooks")
    @ExcludeMissing
    fun _audiobooks(): JsonField<Audiobooks> = audiobooks

    /**
     * Returns the raw JSON value of [episodes].
     *
     * Unlike [episodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("episodes") @ExcludeMissing fun _episodes(): JsonField<Episodes> = episodes

    /**
     * Returns the raw JSON value of [playlists].
     *
     * Unlike [playlists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("playlists")
    @ExcludeMissing
    fun _playlists(): JsonField<PagingPlaylistObject> = playlists

    /**
     * Returns the raw JSON value of [shows].
     *
     * Unlike [shows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shows") @ExcludeMissing fun _shows(): JsonField<Shows> = shows

    /**
     * Returns the raw JSON value of [tracks].
     *
     * Unlike [tracks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracks") @ExcludeMissing fun _tracks(): JsonField<Tracks> = tracks

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

        /** Returns a mutable builder for constructing an instance of [SearchQueryResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [SearchQueryResponse]. */
    class Builder internal constructor() {

        private var albums: JsonField<Albums> = JsonMissing.of()
        private var artists: JsonField<Artists> = JsonMissing.of()
        private var audiobooks: JsonField<Audiobooks> = JsonMissing.of()
        private var episodes: JsonField<Episodes> = JsonMissing.of()
        private var playlists: JsonField<PagingPlaylistObject> = JsonMissing.of()
        private var shows: JsonField<Shows> = JsonMissing.of()
        private var tracks: JsonField<Tracks> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(searchQueryResponse: SearchQueryResponse) = apply {
            albums = searchQueryResponse.albums
            artists = searchQueryResponse.artists
            audiobooks = searchQueryResponse.audiobooks
            episodes = searchQueryResponse.episodes
            playlists = searchQueryResponse.playlists
            shows = searchQueryResponse.shows
            tracks = searchQueryResponse.tracks
            additionalProperties = searchQueryResponse.additionalProperties.toMutableMap()
        }

        fun albums(albums: Albums) = albums(JsonField.of(albums))

        /**
         * Sets [Builder.albums] to an arbitrary JSON value.
         *
         * You should usually call [Builder.albums] with a well-typed [Albums] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun albums(albums: JsonField<Albums>) = apply { this.albums = albums }

        fun artists(artists: Artists) = artists(JsonField.of(artists))

        /**
         * Sets [Builder.artists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artists] with a well-typed [Artists] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun artists(artists: JsonField<Artists>) = apply { this.artists = artists }

        fun audiobooks(audiobooks: Audiobooks) = audiobooks(JsonField.of(audiobooks))

        /**
         * Sets [Builder.audiobooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audiobooks] with a well-typed [Audiobooks] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun audiobooks(audiobooks: JsonField<Audiobooks>) = apply { this.audiobooks = audiobooks }

        fun episodes(episodes: Episodes) = episodes(JsonField.of(episodes))

        /**
         * Sets [Builder.episodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.episodes] with a well-typed [Episodes] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun episodes(episodes: JsonField<Episodes>) = apply { this.episodes = episodes }

        fun playlists(playlists: PagingPlaylistObject) = playlists(JsonField.of(playlists))

        /**
         * Sets [Builder.playlists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playlists] with a well-typed [PagingPlaylistObject]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun playlists(playlists: JsonField<PagingPlaylistObject>) = apply {
            this.playlists = playlists
        }

        fun shows(shows: Shows) = shows(JsonField.of(shows))

        /**
         * Sets [Builder.shows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shows] with a well-typed [Shows] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shows(shows: JsonField<Shows>) = apply { this.shows = shows }

        fun tracks(tracks: Tracks) = tracks(JsonField.of(tracks))

        /**
         * Sets [Builder.tracks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracks] with a well-typed [Tracks] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tracks(tracks: JsonField<Tracks>) = apply { this.tracks = tracks }

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
         * Returns an immutable instance of [SearchQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SearchQueryResponse =
            SearchQueryResponse(
                albums,
                artists,
                audiobooks,
                episodes,
                playlists,
                shows,
                tracks,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SearchQueryResponse = apply {
        if (validated) {
            return@apply
        }

        albums()?.validate()
        artists()?.validate()
        audiobooks()?.validate()
        episodes()?.validate()
        playlists()?.validate()
        shows()?.validate()
        tracks()?.validate()
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
        (albums.asKnown()?.validity() ?: 0) +
            (artists.asKnown()?.validity() ?: 0) +
            (audiobooks.asKnown()?.validity() ?: 0) +
            (episodes.asKnown()?.validity() ?: 0) +
            (playlists.asKnown()?.validity() ?: 0) +
            (shows.asKnown()?.validity() ?: 0) +
            (tracks.asKnown()?.validity() ?: 0)

    class Albums
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val href: JsonField<String>,
        private val limit: JsonField<Long>,
        private val next: JsonField<String>,
        private val offset: JsonField<Long>,
        private val previous: JsonField<String>,
        private val total: JsonField<Long>,
        private val items: JsonField<List<Item>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previous")
            @ExcludeMissing
            previous: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        ) : this(href, limit, next, offset, previous, total, items, mutableMapOf())

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
        fun items(): List<Item>? = items.getNullable("items")

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
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
             * Returns a mutable builder for constructing an instance of [Albums].
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

        /** A builder for [Albums]. */
        class Builder internal constructor() {

            private var href: JsonField<String>? = null
            private var limit: JsonField<Long>? = null
            private var next: JsonField<String>? = null
            private var offset: JsonField<Long>? = null
            private var previous: JsonField<String>? = null
            private var total: JsonField<Long>? = null
            private var items: JsonField<MutableList<Item>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(albums: Albums) = apply {
                href = albums.href
                limit = albums.limit
                next = albums.next
                offset = albums.offset
                previous = albums.previous
                total = albums.total
                items = albums.items.map { it.toMutableList() }
                additionalProperties = albums.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Albums].
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
            fun build(): Albums =
                Albums(
                    checkRequired("href", href),
                    checkRequired("limit", limit),
                    checkRequired("next", next),
                    checkRequired("offset", offset),
                    checkRequired("previous", previous),
                    checkRequired("total", total),
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Albums = apply {
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
                (if (limit.asKnown() == null) 0 else 1) +
                (if (next.asKnown() == null) 0 else 1) +
                (if (offset.asKnown() == null) 0 else 1) +
                (if (previous.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1) +
                (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class Item
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val albumType: JsonField<AlbumType>,
            private val artists: JsonField<List<SimplifiedArtistObject>>,
            private val availableMarkets: JsonField<List<String>>,
            private val externalUrls: JsonField<ExternalUrlObject>,
            private val href: JsonField<String>,
            private val images: JsonField<List<ImageObject>>,
            private val name: JsonField<String>,
            private val releaseDate: JsonField<String>,
            private val releaseDatePrecision: JsonField<ReleaseDatePrecision>,
            private val totalTracks: JsonField<Long>,
            private val type: JsonField<Type>,
            private val uri: JsonField<String>,
            private val restrictions: JsonField<AlbumRestrictionObject>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("album_type")
                @ExcludeMissing
                albumType: JsonField<AlbumType> = JsonMissing.of(),
                @JsonProperty("artists")
                @ExcludeMissing
                artists: JsonField<List<SimplifiedArtistObject>> = JsonMissing.of(),
                @JsonProperty("available_markets")
                @ExcludeMissing
                availableMarkets: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("external_urls")
                @ExcludeMissing
                externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of(),
                @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
                @JsonProperty("images")
                @ExcludeMissing
                images: JsonField<List<ImageObject>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("release_date")
                @ExcludeMissing
                releaseDate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("release_date_precision")
                @ExcludeMissing
                releaseDatePrecision: JsonField<ReleaseDatePrecision> = JsonMissing.of(),
                @JsonProperty("total_tracks")
                @ExcludeMissing
                totalTracks: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
                @JsonProperty("restrictions")
                @ExcludeMissing
                restrictions: JsonField<AlbumRestrictionObject> = JsonMissing.of(),
            ) : this(
                id,
                albumType,
                artists,
                availableMarkets,
                externalUrls,
                href,
                images,
                name,
                releaseDate,
                releaseDatePrecision,
                totalTracks,
                type,
                uri,
                restrictions,
                mutableMapOf(),
            )

            /**
             * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the album.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The type of the album.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun albumType(): AlbumType = albumType.getRequired("album_type")

            /**
             * The artists of the album. Each artist object includes a link in `href` to more
             * detailed information about the artist.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun artists(): List<SimplifiedArtistObject> = artists.getRequired("artists")

            /**
             * The markets in which the album is available:
             * [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
             * _**NOTE**: an album is considered available in a market when at least 1 of its tracks
             * is available in that market._
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun availableMarkets(): List<String> = availableMarkets.getRequired("available_markets")

            /**
             * Known external URLs for this album.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun externalUrls(): ExternalUrlObject = externalUrls.getRequired("external_urls")

            /**
             * A link to the Web API endpoint providing full details of the album.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun href(): String = href.getRequired("href")

            /**
             * The cover art for the album in various sizes, widest first.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun images(): List<ImageObject> = images.getRequired("images")

            /**
             * The name of the album. In case of an album takedown, the value may be an empty
             * string.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The date the album was first released.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun releaseDate(): String = releaseDate.getRequired("release_date")

            /**
             * The precision with which `release_date` value is known.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun releaseDatePrecision(): ReleaseDatePrecision =
                releaseDatePrecision.getRequired("release_date_precision")

            /**
             * The number of tracks in the album.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalTracks(): Long = totalTracks.getRequired("total_tracks")

            /**
             * The object type.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the album.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun uri(): String = uri.getRequired("uri")

            /**
             * Included in the response when a content restriction is applied.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun restrictions(): AlbumRestrictionObject? = restrictions.getNullable("restrictions")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [albumType].
             *
             * Unlike [albumType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("album_type")
            @ExcludeMissing
            fun _albumType(): JsonField<AlbumType> = albumType

            /**
             * Returns the raw JSON value of [artists].
             *
             * Unlike [artists], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("artists")
            @ExcludeMissing
            fun _artists(): JsonField<List<SimplifiedArtistObject>> = artists

            /**
             * Returns the raw JSON value of [availableMarkets].
             *
             * Unlike [availableMarkets], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("available_markets")
            @ExcludeMissing
            fun _availableMarkets(): JsonField<List<String>> = availableMarkets

            /**
             * Returns the raw JSON value of [externalUrls].
             *
             * Unlike [externalUrls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("external_urls")
            @ExcludeMissing
            fun _externalUrls(): JsonField<ExternalUrlObject> = externalUrls

            /**
             * Returns the raw JSON value of [href].
             *
             * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

            /**
             * Returns the raw JSON value of [images].
             *
             * Unlike [images], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("images")
            @ExcludeMissing
            fun _images(): JsonField<List<ImageObject>> = images

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [releaseDate].
             *
             * Unlike [releaseDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("release_date")
            @ExcludeMissing
            fun _releaseDate(): JsonField<String> = releaseDate

            /**
             * Returns the raw JSON value of [releaseDatePrecision].
             *
             * Unlike [releaseDatePrecision], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("release_date_precision")
            @ExcludeMissing
            fun _releaseDatePrecision(): JsonField<ReleaseDatePrecision> = releaseDatePrecision

            /**
             * Returns the raw JSON value of [totalTracks].
             *
             * Unlike [totalTracks], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("total_tracks")
            @ExcludeMissing
            fun _totalTracks(): JsonField<Long> = totalTracks

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [uri].
             *
             * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

            /**
             * Returns the raw JSON value of [restrictions].
             *
             * Unlike [restrictions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("restrictions")
            @ExcludeMissing
            fun _restrictions(): JsonField<AlbumRestrictionObject> = restrictions

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
                 * .albumType()
                 * .artists()
                 * .availableMarkets()
                 * .externalUrls()
                 * .href()
                 * .images()
                 * .name()
                 * .releaseDate()
                 * .releaseDatePrecision()
                 * .totalTracks()
                 * .type()
                 * .uri()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Item]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var albumType: JsonField<AlbumType>? = null
                private var artists: JsonField<MutableList<SimplifiedArtistObject>>? = null
                private var availableMarkets: JsonField<MutableList<String>>? = null
                private var externalUrls: JsonField<ExternalUrlObject>? = null
                private var href: JsonField<String>? = null
                private var images: JsonField<MutableList<ImageObject>>? = null
                private var name: JsonField<String>? = null
                private var releaseDate: JsonField<String>? = null
                private var releaseDatePrecision: JsonField<ReleaseDatePrecision>? = null
                private var totalTracks: JsonField<Long>? = null
                private var type: JsonField<Type>? = null
                private var uri: JsonField<String>? = null
                private var restrictions: JsonField<AlbumRestrictionObject> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(item: Item) = apply {
                    id = item.id
                    albumType = item.albumType
                    artists = item.artists.map { it.toMutableList() }
                    availableMarkets = item.availableMarkets.map { it.toMutableList() }
                    externalUrls = item.externalUrls
                    href = item.href
                    images = item.images.map { it.toMutableList() }
                    name = item.name
                    releaseDate = item.releaseDate
                    releaseDatePrecision = item.releaseDatePrecision
                    totalTracks = item.totalTracks
                    type = item.type
                    uri = item.uri
                    restrictions = item.restrictions
                    additionalProperties = item.additionalProperties.toMutableMap()
                }

                /**
                 * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the album.
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

                /** The type of the album. */
                fun albumType(albumType: AlbumType) = albumType(JsonField.of(albumType))

                /**
                 * Sets [Builder.albumType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.albumType] with a well-typed [AlbumType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun albumType(albumType: JsonField<AlbumType>) = apply {
                    this.albumType = albumType
                }

                /**
                 * The artists of the album. Each artist object includes a link in `href` to more
                 * detailed information about the artist.
                 */
                fun artists(artists: List<SimplifiedArtistObject>) = artists(JsonField.of(artists))

                /**
                 * Sets [Builder.artists] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.artists] with a well-typed
                 * `List<SimplifiedArtistObject>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun artists(artists: JsonField<List<SimplifiedArtistObject>>) = apply {
                    this.artists = artists.map { it.toMutableList() }
                }

                /**
                 * Adds a single [SimplifiedArtistObject] to [artists].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addArtist(artist: SimplifiedArtistObject) = apply {
                    artists =
                        (artists ?: JsonField.of(mutableListOf())).also {
                            checkKnown("artists", it).add(artist)
                        }
                }

                /**
                 * The markets in which the album is available:
                 * [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
                 * _**NOTE**: an album is considered available in a market when at least 1 of its
                 * tracks is available in that market._
                 */
                fun availableMarkets(availableMarkets: List<String>) =
                    availableMarkets(JsonField.of(availableMarkets))

                /**
                 * Sets [Builder.availableMarkets] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.availableMarkets] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun availableMarkets(availableMarkets: JsonField<List<String>>) = apply {
                    this.availableMarkets = availableMarkets.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [availableMarkets].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAvailableMarket(availableMarket: String) = apply {
                    availableMarkets =
                        (availableMarkets ?: JsonField.of(mutableListOf())).also {
                            checkKnown("availableMarkets", it).add(availableMarket)
                        }
                }

                /** Known external URLs for this album. */
                fun externalUrls(externalUrls: ExternalUrlObject) =
                    externalUrls(JsonField.of(externalUrls))

                /**
                 * Sets [Builder.externalUrls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalUrls] with a well-typed
                 * [ExternalUrlObject] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun externalUrls(externalUrls: JsonField<ExternalUrlObject>) = apply {
                    this.externalUrls = externalUrls
                }

                /** A link to the Web API endpoint providing full details of the album. */
                fun href(href: String) = href(JsonField.of(href))

                /**
                 * Sets [Builder.href] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.href] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun href(href: JsonField<String>) = apply { this.href = href }

                /** The cover art for the album in various sizes, widest first. */
                fun images(images: List<ImageObject>) = images(JsonField.of(images))

                /**
                 * Sets [Builder.images] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.images] with a well-typed `List<ImageObject>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun images(images: JsonField<List<ImageObject>>) = apply {
                    this.images = images.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ImageObject] to [images].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addImage(image: ImageObject) = apply {
                    images =
                        (images ?: JsonField.of(mutableListOf())).also {
                            checkKnown("images", it).add(image)
                        }
                }

                /**
                 * The name of the album. In case of an album takedown, the value may be an empty
                 * string.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The date the album was first released. */
                fun releaseDate(releaseDate: String) = releaseDate(JsonField.of(releaseDate))

                /**
                 * Sets [Builder.releaseDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.releaseDate] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun releaseDate(releaseDate: JsonField<String>) = apply {
                    this.releaseDate = releaseDate
                }

                /** The precision with which `release_date` value is known. */
                fun releaseDatePrecision(releaseDatePrecision: ReleaseDatePrecision) =
                    releaseDatePrecision(JsonField.of(releaseDatePrecision))

                /**
                 * Sets [Builder.releaseDatePrecision] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.releaseDatePrecision] with a well-typed
                 * [ReleaseDatePrecision] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun releaseDatePrecision(releaseDatePrecision: JsonField<ReleaseDatePrecision>) =
                    apply {
                        this.releaseDatePrecision = releaseDatePrecision
                    }

                /** The number of tracks in the album. */
                fun totalTracks(totalTracks: Long) = totalTracks(JsonField.of(totalTracks))

                /**
                 * Sets [Builder.totalTracks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalTracks] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalTracks(totalTracks: JsonField<Long>) = apply {
                    this.totalTracks = totalTracks
                }

                /** The object type. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the
                 * album.
                 */
                fun uri(uri: String) = uri(JsonField.of(uri))

                /**
                 * Sets [Builder.uri] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.uri] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun uri(uri: JsonField<String>) = apply { this.uri = uri }

                /** Included in the response when a content restriction is applied. */
                fun restrictions(restrictions: AlbumRestrictionObject) =
                    restrictions(JsonField.of(restrictions))

                /**
                 * Sets [Builder.restrictions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.restrictions] with a well-typed
                 * [AlbumRestrictionObject] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun restrictions(restrictions: JsonField<AlbumRestrictionObject>) = apply {
                    this.restrictions = restrictions
                }

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
                 * .albumType()
                 * .artists()
                 * .availableMarkets()
                 * .externalUrls()
                 * .href()
                 * .images()
                 * .name()
                 * .releaseDate()
                 * .releaseDatePrecision()
                 * .totalTracks()
                 * .type()
                 * .uri()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Item =
                    Item(
                        checkRequired("id", id),
                        checkRequired("albumType", albumType),
                        checkRequired("artists", artists).map { it.toImmutable() },
                        checkRequired("availableMarkets", availableMarkets).map {
                            it.toImmutable()
                        },
                        checkRequired("externalUrls", externalUrls),
                        checkRequired("href", href),
                        checkRequired("images", images).map { it.toImmutable() },
                        checkRequired("name", name),
                        checkRequired("releaseDate", releaseDate),
                        checkRequired("releaseDatePrecision", releaseDatePrecision),
                        checkRequired("totalTracks", totalTracks),
                        checkRequired("type", type),
                        checkRequired("uri", uri),
                        restrictions,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Item = apply {
                if (validated) {
                    return@apply
                }

                id()
                albumType().validate()
                artists().forEach { it.validate() }
                availableMarkets()
                externalUrls().validate()
                href()
                images().forEach { it.validate() }
                name()
                releaseDate()
                releaseDatePrecision().validate()
                totalTracks()
                type().validate()
                uri()
                restrictions()?.validate()
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
                    (albumType.asKnown()?.validity() ?: 0) +
                    (artists.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (availableMarkets.asKnown()?.size ?: 0) +
                    (externalUrls.asKnown()?.validity() ?: 0) +
                    (if (href.asKnown() == null) 0 else 1) +
                    (images.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (releaseDate.asKnown() == null) 0 else 1) +
                    (releaseDatePrecision.asKnown()?.validity() ?: 0) +
                    (if (totalTracks.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0) +
                    (if (uri.asKnown() == null) 0 else 1) +
                    (restrictions.asKnown()?.validity() ?: 0)

            /** The type of the album. */
            class AlbumType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ALBUM = of("album")

                    val SINGLE = of("single")

                    val COMPILATION = of("compilation")

                    fun of(value: String) = AlbumType(JsonField.of(value))
                }

                /** An enum containing [AlbumType]'s known values. */
                enum class Known {
                    ALBUM,
                    SINGLE,
                    COMPILATION,
                }

                /**
                 * An enum containing [AlbumType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AlbumType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ALBUM,
                    SINGLE,
                    COMPILATION,
                    /**
                     * An enum member indicating that [AlbumType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ALBUM -> Value.ALBUM
                        SINGLE -> Value.SINGLE
                        COMPILATION -> Value.COMPILATION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws SpottedInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ALBUM -> Known.ALBUM
                        SINGLE -> Known.SINGLE
                        COMPILATION -> Known.COMPILATION
                        else -> throw SpottedInvalidDataException("Unknown AlbumType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws SpottedInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw SpottedInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): AlbumType = apply {
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

                    return other is AlbumType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The precision with which `release_date` value is known. */
            class ReleaseDatePrecision
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val YEAR = of("year")

                    val MONTH = of("month")

                    val DAY = of("day")

                    fun of(value: String) = ReleaseDatePrecision(JsonField.of(value))
                }

                /** An enum containing [ReleaseDatePrecision]'s known values. */
                enum class Known {
                    YEAR,
                    MONTH,
                    DAY,
                }

                /**
                 * An enum containing [ReleaseDatePrecision]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [ReleaseDatePrecision] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    YEAR,
                    MONTH,
                    DAY,
                    /**
                     * An enum member indicating that [ReleaseDatePrecision] was instantiated with
                     * an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        YEAR -> Value.YEAR
                        MONTH -> Value.MONTH
                        DAY -> Value.DAY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws SpottedInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        YEAR -> Known.YEAR
                        MONTH -> Known.MONTH
                        DAY -> Known.DAY
                        else ->
                            throw SpottedInvalidDataException(
                                "Unknown ReleaseDatePrecision: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws SpottedInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw SpottedInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): ReleaseDatePrecision = apply {
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

                    return other is ReleaseDatePrecision && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The object type. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ALBUM = of("album")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ALBUM
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ALBUM,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ALBUM -> Value.ALBUM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws SpottedInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ALBUM -> Known.ALBUM
                        else -> throw SpottedInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws SpottedInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw SpottedInvalidDataException("Value is not a String")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Item &&
                    id == other.id &&
                    albumType == other.albumType &&
                    artists == other.artists &&
                    availableMarkets == other.availableMarkets &&
                    externalUrls == other.externalUrls &&
                    href == other.href &&
                    images == other.images &&
                    name == other.name &&
                    releaseDate == other.releaseDate &&
                    releaseDatePrecision == other.releaseDatePrecision &&
                    totalTracks == other.totalTracks &&
                    type == other.type &&
                    uri == other.uri &&
                    restrictions == other.restrictions &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    albumType,
                    artists,
                    availableMarkets,
                    externalUrls,
                    href,
                    images,
                    name,
                    releaseDate,
                    releaseDatePrecision,
                    totalTracks,
                    type,
                    uri,
                    restrictions,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Item{id=$id, albumType=$albumType, artists=$artists, availableMarkets=$availableMarkets, externalUrls=$externalUrls, href=$href, images=$images, name=$name, releaseDate=$releaseDate, releaseDatePrecision=$releaseDatePrecision, totalTracks=$totalTracks, type=$type, uri=$uri, restrictions=$restrictions, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Albums &&
                href == other.href &&
                limit == other.limit &&
                next == other.next &&
                offset == other.offset &&
                previous == other.previous &&
                total == other.total &&
                items == other.items &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(href, limit, next, offset, previous, total, items, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Albums{href=$href, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, items=$items, additionalProperties=$additionalProperties}"
    }

    class Artists
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val href: JsonField<String>,
        private val limit: JsonField<Long>,
        private val next: JsonField<String>,
        private val offset: JsonField<Long>,
        private val previous: JsonField<String>,
        private val total: JsonField<Long>,
        private val items: JsonField<List<ArtistObject>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previous")
            @ExcludeMissing
            previous: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("items")
            @ExcludeMissing
            items: JsonField<List<ArtistObject>> = JsonMissing.of(),
        ) : this(href, limit, next, offset, previous, total, items, mutableMapOf())

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
             * Returns a mutable builder for constructing an instance of [Artists].
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

        /** A builder for [Artists]. */
        class Builder internal constructor() {

            private var href: JsonField<String>? = null
            private var limit: JsonField<Long>? = null
            private var next: JsonField<String>? = null
            private var offset: JsonField<Long>? = null
            private var previous: JsonField<String>? = null
            private var total: JsonField<Long>? = null
            private var items: JsonField<MutableList<ArtistObject>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(artists: Artists) = apply {
                href = artists.href
                limit = artists.limit
                next = artists.next
                offset = artists.offset
                previous = artists.previous
                total = artists.total
                items = artists.items.map { it.toMutableList() }
                additionalProperties = artists.additionalProperties.toMutableMap()
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
            fun build(): Artists =
                Artists(
                    checkRequired("href", href),
                    checkRequired("limit", limit),
                    checkRequired("next", next),
                    checkRequired("offset", offset),
                    checkRequired("previous", previous),
                    checkRequired("total", total),
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Artists = apply {
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
                (if (limit.asKnown() == null) 0 else 1) +
                (if (next.asKnown() == null) 0 else 1) +
                (if (offset.asKnown() == null) 0 else 1) +
                (if (previous.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1) +
                (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Artists &&
                href == other.href &&
                limit == other.limit &&
                next == other.next &&
                offset == other.offset &&
                previous == other.previous &&
                total == other.total &&
                items == other.items &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(href, limit, next, offset, previous, total, items, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Artists{href=$href, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, items=$items, additionalProperties=$additionalProperties}"
    }

    class Audiobooks
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val href: JsonField<String>,
        private val limit: JsonField<Long>,
        private val next: JsonField<String>,
        private val offset: JsonField<Long>,
        private val previous: JsonField<String>,
        private val total: JsonField<Long>,
        private val items: JsonField<List<AudiobookBase>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previous")
            @ExcludeMissing
            previous: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("items")
            @ExcludeMissing
            items: JsonField<List<AudiobookBase>> = JsonMissing.of(),
        ) : this(href, limit, next, offset, previous, total, items, mutableMapOf())

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
        fun items(): List<AudiobookBase>? = items.getNullable("items")

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
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<AudiobookBase>> = items

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
             * Returns a mutable builder for constructing an instance of [Audiobooks].
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

        /** A builder for [Audiobooks]. */
        class Builder internal constructor() {

            private var href: JsonField<String>? = null
            private var limit: JsonField<Long>? = null
            private var next: JsonField<String>? = null
            private var offset: JsonField<Long>? = null
            private var previous: JsonField<String>? = null
            private var total: JsonField<Long>? = null
            private var items: JsonField<MutableList<AudiobookBase>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(audiobooks: Audiobooks) = apply {
                href = audiobooks.href
                limit = audiobooks.limit
                next = audiobooks.next
                offset = audiobooks.offset
                previous = audiobooks.previous
                total = audiobooks.total
                items = audiobooks.items.map { it.toMutableList() }
                additionalProperties = audiobooks.additionalProperties.toMutableMap()
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

            fun items(items: List<AudiobookBase>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<AudiobookBase>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun items(items: JsonField<List<AudiobookBase>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [AudiobookBase] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: AudiobookBase) = apply {
                items =
                    (items ?: JsonField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
                    }
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
             * Returns an immutable instance of [Audiobooks].
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
            fun build(): Audiobooks =
                Audiobooks(
                    checkRequired("href", href),
                    checkRequired("limit", limit),
                    checkRequired("next", next),
                    checkRequired("offset", offset),
                    checkRequired("previous", previous),
                    checkRequired("total", total),
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Audiobooks = apply {
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
                (if (limit.asKnown() == null) 0 else 1) +
                (if (next.asKnown() == null) 0 else 1) +
                (if (offset.asKnown() == null) 0 else 1) +
                (if (previous.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1) +
                (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Audiobooks &&
                href == other.href &&
                limit == other.limit &&
                next == other.next &&
                offset == other.offset &&
                previous == other.previous &&
                total == other.total &&
                items == other.items &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(href, limit, next, offset, previous, total, items, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Audiobooks{href=$href, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, items=$items, additionalProperties=$additionalProperties}"
    }

    class Episodes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val href: JsonField<String>,
        private val limit: JsonField<Long>,
        private val next: JsonField<String>,
        private val offset: JsonField<Long>,
        private val previous: JsonField<String>,
        private val total: JsonField<Long>,
        private val items: JsonField<List<SimplifiedEpisodeObject>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previous")
            @ExcludeMissing
            previous: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("items")
            @ExcludeMissing
            items: JsonField<List<SimplifiedEpisodeObject>> = JsonMissing.of(),
        ) : this(href, limit, next, offset, previous, total, items, mutableMapOf())

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
        fun items(): List<SimplifiedEpisodeObject>? = items.getNullable("items")

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
        @JsonProperty("items")
        @ExcludeMissing
        fun _items(): JsonField<List<SimplifiedEpisodeObject>> = items

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
             * Returns a mutable builder for constructing an instance of [Episodes].
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

        /** A builder for [Episodes]. */
        class Builder internal constructor() {

            private var href: JsonField<String>? = null
            private var limit: JsonField<Long>? = null
            private var next: JsonField<String>? = null
            private var offset: JsonField<Long>? = null
            private var previous: JsonField<String>? = null
            private var total: JsonField<Long>? = null
            private var items: JsonField<MutableList<SimplifiedEpisodeObject>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(episodes: Episodes) = apply {
                href = episodes.href
                limit = episodes.limit
                next = episodes.next
                offset = episodes.offset
                previous = episodes.previous
                total = episodes.total
                items = episodes.items.map { it.toMutableList() }
                additionalProperties = episodes.additionalProperties.toMutableMap()
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

            fun items(items: List<SimplifiedEpisodeObject>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed
             * `List<SimplifiedEpisodeObject>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun items(items: JsonField<List<SimplifiedEpisodeObject>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [SimplifiedEpisodeObject] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: SimplifiedEpisodeObject) = apply {
                items =
                    (items ?: JsonField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
                    }
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
             * Returns an immutable instance of [Episodes].
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
            fun build(): Episodes =
                Episodes(
                    checkRequired("href", href),
                    checkRequired("limit", limit),
                    checkRequired("next", next),
                    checkRequired("offset", offset),
                    checkRequired("previous", previous),
                    checkRequired("total", total),
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Episodes = apply {
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
                (if (limit.asKnown() == null) 0 else 1) +
                (if (next.asKnown() == null) 0 else 1) +
                (if (offset.asKnown() == null) 0 else 1) +
                (if (previous.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1) +
                (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Episodes &&
                href == other.href &&
                limit == other.limit &&
                next == other.next &&
                offset == other.offset &&
                previous == other.previous &&
                total == other.total &&
                items == other.items &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(href, limit, next, offset, previous, total, items, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Episodes{href=$href, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, items=$items, additionalProperties=$additionalProperties}"
    }

    class Shows
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val href: JsonField<String>,
        private val limit: JsonField<Long>,
        private val next: JsonField<String>,
        private val offset: JsonField<Long>,
        private val previous: JsonField<String>,
        private val total: JsonField<Long>,
        private val items: JsonField<List<ShowBase>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previous")
            @ExcludeMissing
            previous: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("items")
            @ExcludeMissing
            items: JsonField<List<ShowBase>> = JsonMissing.of(),
        ) : this(href, limit, next, offset, previous, total, items, mutableMapOf())

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
        fun items(): List<ShowBase>? = items.getNullable("items")

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
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<ShowBase>> = items

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
             * Returns a mutable builder for constructing an instance of [Shows].
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

        /** A builder for [Shows]. */
        class Builder internal constructor() {

            private var href: JsonField<String>? = null
            private var limit: JsonField<Long>? = null
            private var next: JsonField<String>? = null
            private var offset: JsonField<Long>? = null
            private var previous: JsonField<String>? = null
            private var total: JsonField<Long>? = null
            private var items: JsonField<MutableList<ShowBase>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shows: Shows) = apply {
                href = shows.href
                limit = shows.limit
                next = shows.next
                offset = shows.offset
                previous = shows.previous
                total = shows.total
                items = shows.items.map { it.toMutableList() }
                additionalProperties = shows.additionalProperties.toMutableMap()
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

            fun items(items: List<ShowBase>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<ShowBase>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun items(items: JsonField<List<ShowBase>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [ShowBase] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: ShowBase) = apply {
                items =
                    (items ?: JsonField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
                    }
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
             * Returns an immutable instance of [Shows].
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
            fun build(): Shows =
                Shows(
                    checkRequired("href", href),
                    checkRequired("limit", limit),
                    checkRequired("next", next),
                    checkRequired("offset", offset),
                    checkRequired("previous", previous),
                    checkRequired("total", total),
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Shows = apply {
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
                (if (limit.asKnown() == null) 0 else 1) +
                (if (next.asKnown() == null) 0 else 1) +
                (if (offset.asKnown() == null) 0 else 1) +
                (if (previous.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1) +
                (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Shows &&
                href == other.href &&
                limit == other.limit &&
                next == other.next &&
                offset == other.offset &&
                previous == other.previous &&
                total == other.total &&
                items == other.items &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(href, limit, next, offset, previous, total, items, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Shows{href=$href, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, items=$items, additionalProperties=$additionalProperties}"
    }

    class Tracks
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val href: JsonField<String>,
        private val limit: JsonField<Long>,
        private val next: JsonField<String>,
        private val offset: JsonField<Long>,
        private val previous: JsonField<String>,
        private val total: JsonField<Long>,
        private val items: JsonField<List<TrackObject>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previous")
            @ExcludeMissing
            previous: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("items")
            @ExcludeMissing
            items: JsonField<List<TrackObject>> = JsonMissing.of(),
        ) : this(href, limit, next, offset, previous, total, items, mutableMapOf())

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
        fun items(): List<TrackObject>? = items.getNullable("items")

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
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<TrackObject>> = items

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
             * Returns a mutable builder for constructing an instance of [Tracks].
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

        /** A builder for [Tracks]. */
        class Builder internal constructor() {

            private var href: JsonField<String>? = null
            private var limit: JsonField<Long>? = null
            private var next: JsonField<String>? = null
            private var offset: JsonField<Long>? = null
            private var previous: JsonField<String>? = null
            private var total: JsonField<Long>? = null
            private var items: JsonField<MutableList<TrackObject>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tracks: Tracks) = apply {
                href = tracks.href
                limit = tracks.limit
                next = tracks.next
                offset = tracks.offset
                previous = tracks.previous
                total = tracks.total
                items = tracks.items.map { it.toMutableList() }
                additionalProperties = tracks.additionalProperties.toMutableMap()
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

            fun items(items: List<TrackObject>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<TrackObject>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun items(items: JsonField<List<TrackObject>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [TrackObject] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: TrackObject) = apply {
                items =
                    (items ?: JsonField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
                    }
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
             * Returns an immutable instance of [Tracks].
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
            fun build(): Tracks =
                Tracks(
                    checkRequired("href", href),
                    checkRequired("limit", limit),
                    checkRequired("next", next),
                    checkRequired("offset", offset),
                    checkRequired("previous", previous),
                    checkRequired("total", total),
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Tracks = apply {
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
                (if (limit.asKnown() == null) 0 else 1) +
                (if (next.asKnown() == null) 0 else 1) +
                (if (offset.asKnown() == null) 0 else 1) +
                (if (previous.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1) +
                (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tracks &&
                href == other.href &&
                limit == other.limit &&
                next == other.next &&
                offset == other.offset &&
                previous == other.previous &&
                total == other.total &&
                items == other.items &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(href, limit, next, offset, previous, total, items, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tracks{href=$href, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, items=$items, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SearchQueryResponse &&
            albums == other.albums &&
            artists == other.artists &&
            audiobooks == other.audiobooks &&
            episodes == other.episodes &&
            playlists == other.playlists &&
            shows == other.shows &&
            tracks == other.tracks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            albums,
            artists,
            audiobooks,
            episodes,
            playlists,
            shows,
            tracks,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SearchQueryResponse{albums=$albums, artists=$artists, audiobooks=$audiobooks, episodes=$episodes, playlists=$playlists, shows=$shows, tracks=$tracks, additionalProperties=$additionalProperties}"
}
