// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.albums

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.cjav.spotted.core.Enum
import dev.cjav.spotted.core.ExcludeMissing
import dev.cjav.spotted.core.JsonField
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.core.checkKnown
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.core.toImmutable
import dev.cjav.spotted.errors.SpottedInvalidDataException
import dev.cjav.spotted.models.AlbumRestrictionObject
import dev.cjav.spotted.models.CopyrightObject
import dev.cjav.spotted.models.ExternalIdObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.SimplifiedArtistObject
import dev.cjav.spotted.models.SimplifiedTrackObject
import java.util.Collections
import java.util.Objects

class AlbumBulkRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val albums: JsonField<List<Album>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("albums") @ExcludeMissing albums: JsonField<List<Album>> = JsonMissing.of()
    ) : this(albums, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun albums(): List<Album> = albums.getRequired("albums")

    /**
     * Returns the raw JSON value of [albums].
     *
     * Unlike [albums], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("albums") @ExcludeMissing fun _albums(): JsonField<List<Album>> = albums

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
         * Returns a mutable builder for constructing an instance of [AlbumBulkRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .albums()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AlbumBulkRetrieveResponse]. */
    class Builder internal constructor() {

        private var albums: JsonField<MutableList<Album>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(albumBulkRetrieveResponse: AlbumBulkRetrieveResponse) = apply {
            albums = albumBulkRetrieveResponse.albums.map { it.toMutableList() }
            additionalProperties = albumBulkRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun albums(albums: List<Album>) = albums(JsonField.of(albums))

        /**
         * Sets [Builder.albums] to an arbitrary JSON value.
         *
         * You should usually call [Builder.albums] with a well-typed `List<Album>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun albums(albums: JsonField<List<Album>>) = apply {
            this.albums = albums.map { it.toMutableList() }
        }

        /**
         * Adds a single [Album] to [albums].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlbum(album: Album) = apply {
            albums =
                (albums ?: JsonField.of(mutableListOf())).also {
                    checkKnown("albums", it).add(album)
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
         * Returns an immutable instance of [AlbumBulkRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .albums()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlbumBulkRetrieveResponse =
            AlbumBulkRetrieveResponse(
                checkRequired("albums", albums).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AlbumBulkRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        albums().forEach { it.validate() }
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
    internal fun validity(): Int = (albums.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Album
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val albumType: JsonField<AlbumType>,
        private val availableMarkets: JsonField<List<String>>,
        private val externalUrls: JsonField<ExternalUrlObject>,
        private val href: JsonField<String>,
        private val images: JsonField<List<ImageObject>>,
        private val name: JsonField<String>,
        private val releaseDate: JsonField<String>,
        private val releaseDatePrecision: JsonField<ReleaseDatePrecision>,
        private val totalTracks: JsonField<Long>,
        private val type: JsonValue,
        private val uri: JsonField<String>,
        private val artists: JsonField<List<SimplifiedArtistObject>>,
        private val copyrights: JsonField<List<CopyrightObject>>,
        private val externalIds: JsonField<ExternalIdObject>,
        private val genres: JsonField<List<String>>,
        private val label: JsonField<String>,
        private val popularity: JsonField<Long>,
        private val published: JsonField<Boolean>,
        private val restrictions: JsonField<AlbumRestrictionObject>,
        private val tracks: JsonField<Tracks>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("album_type")
            @ExcludeMissing
            albumType: JsonField<AlbumType> = JsonMissing.of(),
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
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("artists")
            @ExcludeMissing
            artists: JsonField<List<SimplifiedArtistObject>> = JsonMissing.of(),
            @JsonProperty("copyrights")
            @ExcludeMissing
            copyrights: JsonField<List<CopyrightObject>> = JsonMissing.of(),
            @JsonProperty("external_ids")
            @ExcludeMissing
            externalIds: JsonField<ExternalIdObject> = JsonMissing.of(),
            @JsonProperty("genres")
            @ExcludeMissing
            genres: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            @JsonProperty("popularity")
            @ExcludeMissing
            popularity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("published")
            @ExcludeMissing
            published: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("restrictions")
            @ExcludeMissing
            restrictions: JsonField<AlbumRestrictionObject> = JsonMissing.of(),
            @JsonProperty("tracks") @ExcludeMissing tracks: JsonField<Tracks> = JsonMissing.of(),
        ) : this(
            id,
            albumType,
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
            artists,
            copyrights,
            externalIds,
            genres,
            label,
            popularity,
            published,
            restrictions,
            tracks,
            mutableMapOf(),
        )

        /**
         * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The type of the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun albumType(): AlbumType = albumType.getRequired("album_type")

        /**
         * The markets in which the album is available:
         * [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
         * _**NOTE**: an album is considered available in a market when at least 1 of its tracks is
         * available in that market._
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun availableMarkets(): List<String> = availableMarkets.getRequired("available_markets")

        /**
         * Known external URLs for this album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalUrls(): ExternalUrlObject = externalUrls.getRequired("external_urls")

        /**
         * A link to the Web API endpoint providing full details of the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun href(): String = href.getRequired("href")

        /**
         * The cover art for the album in various sizes, widest first.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun images(): List<ImageObject> = images.getRequired("images")

        /**
         * The name of the album. In case of an album takedown, the value may be an empty string.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The date the album was first released.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun releaseDate(): String = releaseDate.getRequired("release_date")

        /**
         * The precision with which `release_date` value is known.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun releaseDatePrecision(): ReleaseDatePrecision =
            releaseDatePrecision.getRequired("release_date_precision")

        /**
         * The number of tracks in the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalTracks(): Long = totalTracks.getRequired("total_tracks")

        /**
         * The object type.
         *
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("album")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun uri(): String = uri.getRequired("uri")

        /**
         * The artists of the album. Each artist object includes a link in `href` to more detailed
         * information about the artist.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun artists(): List<SimplifiedArtistObject>? = artists.getNullable("artists")

        /**
         * The copyright statements of the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun copyrights(): List<CopyrightObject>? = copyrights.getNullable("copyrights")

        /**
         * Known external IDs for the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalIds(): ExternalIdObject? = externalIds.getNullable("external_ids")

        /**
         * **Deprecated** The array is always empty.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun genres(): List<String>? = genres.getNullable("genres")

        /**
         * The label associated with the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun label(): String? = label.getNullable("label")

        /**
         * The popularity of the album. The value will be between 0 and 100, with 100 being the most
         * popular.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun popularity(): Long? = popularity.getNullable("popularity")

        /**
         * The playlist's public/private status (if it should be added to the user's profile or
         * not): `true` the playlist will be public, `false` the playlist will be private, `null`
         * the playlist status is not relevant. For more about public/private status, see
         * [Working with Playlists](/documentation/web-api/concepts/playlists)
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun published(): Boolean? = published.getNullable("published")

        /**
         * Included in the response when a content restriction is applied.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun restrictions(): AlbumRestrictionObject? = restrictions.getNullable("restrictions")

        /**
         * The tracks of the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tracks(): Tracks? = tracks.getNullable("tracks")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [albumType].
         *
         * Unlike [albumType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("album_type")
        @ExcludeMissing
        fun _albumType(): JsonField<AlbumType> = albumType

        /**
         * Returns the raw JSON value of [availableMarkets].
         *
         * Unlike [availableMarkets], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("images") @ExcludeMissing fun _images(): JsonField<List<ImageObject>> = images

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [releaseDate].
         *
         * Unlike [releaseDate], this method doesn't throw if the JSON field has an unexpected type.
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
         * Unlike [totalTracks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_tracks")
        @ExcludeMissing
        fun _totalTracks(): JsonField<Long> = totalTracks

        /**
         * Returns the raw JSON value of [uri].
         *
         * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

        /**
         * Returns the raw JSON value of [artists].
         *
         * Unlike [artists], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("artists")
        @ExcludeMissing
        fun _artists(): JsonField<List<SimplifiedArtistObject>> = artists

        /**
         * Returns the raw JSON value of [copyrights].
         *
         * Unlike [copyrights], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("copyrights")
        @ExcludeMissing
        fun _copyrights(): JsonField<List<CopyrightObject>> = copyrights

        /**
         * Returns the raw JSON value of [externalIds].
         *
         * Unlike [externalIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_ids")
        @ExcludeMissing
        fun _externalIds(): JsonField<ExternalIdObject> = externalIds

        /**
         * Returns the raw JSON value of [genres].
         *
         * Unlike [genres], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("genres")
        @ExcludeMissing
        fun _genres(): JsonField<List<String>> = genres

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

        /**
         * Returns the raw JSON value of [popularity].
         *
         * Unlike [popularity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("popularity") @ExcludeMissing fun _popularity(): JsonField<Long> = popularity

        /**
         * Returns the raw JSON value of [published].
         *
         * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

        /**
         * Returns the raw JSON value of [restrictions].
         *
         * Unlike [restrictions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("restrictions")
        @ExcludeMissing
        fun _restrictions(): JsonField<AlbumRestrictionObject> = restrictions

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

            /**
             * Returns a mutable builder for constructing an instance of [Album].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .albumType()
             * .availableMarkets()
             * .externalUrls()
             * .href()
             * .images()
             * .name()
             * .releaseDate()
             * .releaseDatePrecision()
             * .totalTracks()
             * .uri()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Album]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var albumType: JsonField<AlbumType>? = null
            private var availableMarkets: JsonField<MutableList<String>>? = null
            private var externalUrls: JsonField<ExternalUrlObject>? = null
            private var href: JsonField<String>? = null
            private var images: JsonField<MutableList<ImageObject>>? = null
            private var name: JsonField<String>? = null
            private var releaseDate: JsonField<String>? = null
            private var releaseDatePrecision: JsonField<ReleaseDatePrecision>? = null
            private var totalTracks: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("album")
            private var uri: JsonField<String>? = null
            private var artists: JsonField<MutableList<SimplifiedArtistObject>>? = null
            private var copyrights: JsonField<MutableList<CopyrightObject>>? = null
            private var externalIds: JsonField<ExternalIdObject> = JsonMissing.of()
            private var genres: JsonField<MutableList<String>>? = null
            private var label: JsonField<String> = JsonMissing.of()
            private var popularity: JsonField<Long> = JsonMissing.of()
            private var published: JsonField<Boolean> = JsonMissing.of()
            private var restrictions: JsonField<AlbumRestrictionObject> = JsonMissing.of()
            private var tracks: JsonField<Tracks> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(album: Album) = apply {
                id = album.id
                albumType = album.albumType
                availableMarkets = album.availableMarkets.map { it.toMutableList() }
                externalUrls = album.externalUrls
                href = album.href
                images = album.images.map { it.toMutableList() }
                name = album.name
                releaseDate = album.releaseDate
                releaseDatePrecision = album.releaseDatePrecision
                totalTracks = album.totalTracks
                type = album.type
                uri = album.uri
                artists = album.artists.map { it.toMutableList() }
                copyrights = album.copyrights.map { it.toMutableList() }
                externalIds = album.externalIds
                genres = album.genres.map { it.toMutableList() }
                label = album.label
                popularity = album.popularity
                published = album.published
                restrictions = album.restrictions
                tracks = album.tracks
                additionalProperties = album.additionalProperties.toMutableMap()
            }

            /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the album. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The type of the album. */
            fun albumType(albumType: AlbumType) = albumType(JsonField.of(albumType))

            /**
             * Sets [Builder.albumType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.albumType] with a well-typed [AlbumType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun albumType(albumType: JsonField<AlbumType>) = apply { this.albumType = albumType }

            /**
             * The markets in which the album is available:
             * [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
             * _**NOTE**: an album is considered available in a market when at least 1 of its tracks
             * is available in that market._
             */
            fun availableMarkets(availableMarkets: List<String>) =
                availableMarkets(JsonField.of(availableMarkets))

            /**
             * Sets [Builder.availableMarkets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.availableMarkets] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.externalUrls] with a well-typed [ExternalUrlObject]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalUrls(externalUrls: JsonField<ExternalUrlObject>) = apply {
                this.externalUrls = externalUrls
            }

            /** A link to the Web API endpoint providing full details of the album. */
            fun href(href: String) = href(JsonField.of(href))

            /**
             * Sets [Builder.href] to an arbitrary JSON value.
             *
             * You should usually call [Builder.href] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun href(href: JsonField<String>) = apply { this.href = href }

            /** The cover art for the album in various sizes, widest first. */
            fun images(images: List<ImageObject>) = images(JsonField.of(images))

            /**
             * Sets [Builder.images] to an arbitrary JSON value.
             *
             * You should usually call [Builder.images] with a well-typed `List<ImageObject>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The date the album was first released. */
            fun releaseDate(releaseDate: String) = releaseDate(JsonField.of(releaseDate))

            /**
             * Sets [Builder.releaseDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.releaseDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * [ReleaseDatePrecision] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * You should usually call [Builder.totalTracks] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTracks(totalTracks: JsonField<Long>) = apply { this.totalTracks = totalTracks }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("album")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            /**
             * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the album.
             */
            fun uri(uri: String) = uri(JsonField.of(uri))

            /**
             * Sets [Builder.uri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uri] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uri(uri: JsonField<String>) = apply { this.uri = uri }

            /**
             * The artists of the album. Each artist object includes a link in `href` to more
             * detailed information about the artist.
             */
            fun artists(artists: List<SimplifiedArtistObject>) = artists(JsonField.of(artists))

            /**
             * Sets [Builder.artists] to an arbitrary JSON value.
             *
             * You should usually call [Builder.artists] with a well-typed
             * `List<SimplifiedArtistObject>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
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

            /** The copyright statements of the album. */
            fun copyrights(copyrights: List<CopyrightObject>) = copyrights(JsonField.of(copyrights))

            /**
             * Sets [Builder.copyrights] to an arbitrary JSON value.
             *
             * You should usually call [Builder.copyrights] with a well-typed
             * `List<CopyrightObject>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun copyrights(copyrights: JsonField<List<CopyrightObject>>) = apply {
                this.copyrights = copyrights.map { it.toMutableList() }
            }

            /**
             * Adds a single [CopyrightObject] to [copyrights].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCopyright(copyright: CopyrightObject) = apply {
                copyrights =
                    (copyrights ?: JsonField.of(mutableListOf())).also {
                        checkKnown("copyrights", it).add(copyright)
                    }
            }

            /** Known external IDs for the album. */
            fun externalIds(externalIds: ExternalIdObject) = externalIds(JsonField.of(externalIds))

            /**
             * Sets [Builder.externalIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalIds] with a well-typed [ExternalIdObject]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalIds(externalIds: JsonField<ExternalIdObject>) = apply {
                this.externalIds = externalIds
            }

            /** **Deprecated** The array is always empty. */
            @Deprecated("deprecated")
            fun genres(genres: List<String>) = genres(JsonField.of(genres))

            /**
             * Sets [Builder.genres] to an arbitrary JSON value.
             *
             * You should usually call [Builder.genres] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun genres(genres: JsonField<List<String>>) = apply {
                this.genres = genres.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [genres].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            @Deprecated("deprecated")
            fun addGenre(genre: String) = apply {
                genres =
                    (genres ?: JsonField.of(mutableListOf())).also {
                        checkKnown("genres", it).add(genre)
                    }
            }

            /** The label associated with the album. */
            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            /**
             * The popularity of the album. The value will be between 0 and 100, with 100 being the
             * most popular.
             */
            fun popularity(popularity: Long) = popularity(JsonField.of(popularity))

            /**
             * Sets [Builder.popularity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.popularity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun popularity(popularity: JsonField<Long>) = apply { this.popularity = popularity }

            /**
             * The playlist's public/private status (if it should be added to the user's profile or
             * not): `true` the playlist will be public, `false` the playlist will be private,
             * `null` the playlist status is not relevant. For more about public/private status, see
             * [Working with Playlists](/documentation/web-api/concepts/playlists)
             */
            fun published(published: Boolean) = published(JsonField.of(published))

            /**
             * Sets [Builder.published] to an arbitrary JSON value.
             *
             * You should usually call [Builder.published] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun published(published: JsonField<Boolean>) = apply { this.published = published }

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

            /** The tracks of the album. */
            fun tracks(tracks: Tracks) = tracks(JsonField.of(tracks))

            /**
             * Sets [Builder.tracks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tracks] with a well-typed [Tracks] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Album].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .albumType()
             * .availableMarkets()
             * .externalUrls()
             * .href()
             * .images()
             * .name()
             * .releaseDate()
             * .releaseDatePrecision()
             * .totalTracks()
             * .uri()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Album =
                Album(
                    checkRequired("id", id),
                    checkRequired("albumType", albumType),
                    checkRequired("availableMarkets", availableMarkets).map { it.toImmutable() },
                    checkRequired("externalUrls", externalUrls),
                    checkRequired("href", href),
                    checkRequired("images", images).map { it.toImmutable() },
                    checkRequired("name", name),
                    checkRequired("releaseDate", releaseDate),
                    checkRequired("releaseDatePrecision", releaseDatePrecision),
                    checkRequired("totalTracks", totalTracks),
                    type,
                    checkRequired("uri", uri),
                    (artists ?: JsonMissing.of()).map { it.toImmutable() },
                    (copyrights ?: JsonMissing.of()).map { it.toImmutable() },
                    externalIds,
                    (genres ?: JsonMissing.of()).map { it.toImmutable() },
                    label,
                    popularity,
                    published,
                    restrictions,
                    tracks,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Album = apply {
            if (validated) {
                return@apply
            }

            id()
            albumType().validate()
            availableMarkets()
            externalUrls().validate()
            href()
            images().forEach { it.validate() }
            name()
            releaseDate()
            releaseDatePrecision().validate()
            totalTracks()
            _type().let {
                if (it != JsonValue.from("album")) {
                    throw SpottedInvalidDataException("'type' is invalid, received $it")
                }
            }
            uri()
            artists()?.forEach { it.validate() }
            copyrights()?.forEach { it.validate() }
            externalIds()?.validate()
            genres()
            label()
            popularity()
            published()
            restrictions()?.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (albumType.asKnown()?.validity() ?: 0) +
                (availableMarkets.asKnown()?.size ?: 0) +
                (externalUrls.asKnown()?.validity() ?: 0) +
                (if (href.asKnown() == null) 0 else 1) +
                (images.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (releaseDate.asKnown() == null) 0 else 1) +
                (releaseDatePrecision.asKnown()?.validity() ?: 0) +
                (if (totalTracks.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("album")) 1 else 0 } +
                (if (uri.asKnown() == null) 0 else 1) +
                (artists.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (copyrights.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (externalIds.asKnown()?.validity() ?: 0) +
                (genres.asKnown()?.size ?: 0) +
                (if (label.asKnown() == null) 0 else 1) +
                (if (popularity.asKnown() == null) 0 else 1) +
                (if (published.asKnown() == null) 0 else 1) +
                (restrictions.asKnown()?.validity() ?: 0) +
                (tracks.asKnown()?.validity() ?: 0)

        /** The type of the album. */
        class AlbumType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * @throws SpottedInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws SpottedInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw SpottedInvalidDataException("Value is not a String")

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
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [ReleaseDatePrecision]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ReleaseDatePrecision] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                YEAR,
                MONTH,
                DAY,
                /**
                 * An enum member indicating that [ReleaseDatePrecision] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * @throws SpottedInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    YEAR -> Known.YEAR
                    MONTH -> Known.MONTH
                    DAY -> Known.DAY
                    else ->
                        throw SpottedInvalidDataException("Unknown ReleaseDatePrecision: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws SpottedInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw SpottedInvalidDataException("Value is not a String")

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

        /** The tracks of the album. */
        class Tracks
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val href: JsonField<String>,
            private val limit: JsonField<Long>,
            private val next: JsonField<String>,
            private val offset: JsonField<Long>,
            private val previous: JsonField<String>,
            private val total: JsonField<Long>,
            private val items: JsonField<List<SimplifiedTrackObject>>,
            private val published: JsonField<Boolean>,
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
                items: JsonField<List<SimplifiedTrackObject>> = JsonMissing.of(),
                @JsonProperty("published")
                @ExcludeMissing
                published: JsonField<Boolean> = JsonMissing.of(),
            ) : this(href, limit, next, offset, previous, total, items, published, mutableMapOf())

            /**
             * A link to the Web API endpoint returning the full result of the request
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun href(): String = href.getRequired("href")

            /**
             * The maximum number of items in the response (as set in the query or by default).
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Long = limit.getRequired("limit")

            /**
             * URL to the next page of items. ( `null` if none)
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun next(): String? = next.getNullable("next")

            /**
             * The offset of the items returned (as set in the query or by default)
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun offset(): Long = offset.getRequired("offset")

            /**
             * URL to the previous page of items. ( `null` if none)
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun previous(): String? = previous.getNullable("previous")

            /**
             * The total number of items available to return.
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun total(): Long = total.getRequired("total")

            /**
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun items(): List<SimplifiedTrackObject>? = items.getNullable("items")

            /**
             * The playlist's public/private status (if it should be added to the user's profile or
             * not): `true` the playlist will be public, `false` the playlist will be private,
             * `null` the playlist status is not relevant. For more about public/private status, see
             * [Working with Playlists](/documentation/web-api/concepts/playlists)
             *
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [previous], this method doesn't throw if the JSON field has an unexpected
             * type.
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
            fun _items(): JsonField<List<SimplifiedTrackObject>> = items

            /**
             * Returns the raw JSON value of [published].
             *
             * Unlike [published], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("published")
            @ExcludeMissing
            fun _published(): JsonField<Boolean> = published

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
                private var items: JsonField<MutableList<SimplifiedTrackObject>>? = null
                private var published: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tracks: Tracks) = apply {
                    href = tracks.href
                    limit = tracks.limit
                    next = tracks.next
                    offset = tracks.offset
                    previous = tracks.previous
                    total = tracks.total
                    items = tracks.items.map { it.toMutableList() }
                    published = tracks.published
                    additionalProperties = tracks.additionalProperties.toMutableMap()
                }

                /** A link to the Web API endpoint returning the full result of the request */
                fun href(href: String) = href(JsonField.of(href))

                /**
                 * Sets [Builder.href] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.href] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun href(href: JsonField<String>) = apply { this.href = href }

                /**
                 * The maximum number of items in the response (as set in the query or by default).
                 */
                fun limit(limit: Long) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

                /** URL to the next page of items. ( `null` if none) */
                fun next(next: String?) = next(JsonField.ofNullable(next))

                /**
                 * Sets [Builder.next] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.next] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun next(next: JsonField<String>) = apply { this.next = next }

                /** The offset of the items returned (as set in the query or by default) */
                fun offset(offset: Long) = offset(JsonField.of(offset))

                /**
                 * Sets [Builder.offset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.offset] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

                /** URL to the previous page of items. ( `null` if none) */
                fun previous(previous: String?) = previous(JsonField.ofNullable(previous))

                /**
                 * Sets [Builder.previous] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.previous] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun previous(previous: JsonField<String>) = apply { this.previous = previous }

                /** The total number of items available to return. */
                fun total(total: Long) = total(JsonField.of(total))

                /**
                 * Sets [Builder.total] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.total] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun total(total: JsonField<Long>) = apply { this.total = total }

                fun items(items: List<SimplifiedTrackObject>) = items(JsonField.of(items))

                /**
                 * Sets [Builder.items] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.items] with a well-typed
                 * `List<SimplifiedTrackObject>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun items(items: JsonField<List<SimplifiedTrackObject>>) = apply {
                    this.items = items.map { it.toMutableList() }
                }

                /**
                 * Adds a single [SimplifiedTrackObject] to [items].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addItem(item: SimplifiedTrackObject) = apply {
                    items =
                        (items ?: JsonField.of(mutableListOf())).also {
                            checkKnown("items", it).add(item)
                        }
                }

                /**
                 * The playlist's public/private status (if it should be added to the user's profile
                 * or not): `true` the playlist will be public, `false` the playlist will be
                 * private, `null` the playlist status is not relevant. For more about
                 * public/private status, see
                 * [Working with Playlists](/documentation/web-api/concepts/playlists)
                 */
                fun published(published: Boolean) = published(JsonField.of(published))

                /**
                 * Sets [Builder.published] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.published] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun published(published: JsonField<Boolean>) = apply { this.published = published }

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
                        published,
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
                    (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (published.asKnown() == null) 0 else 1)

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
                "Tracks{href=$href, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, items=$items, published=$published, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Album &&
                id == other.id &&
                albumType == other.albumType &&
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
                artists == other.artists &&
                copyrights == other.copyrights &&
                externalIds == other.externalIds &&
                genres == other.genres &&
                label == other.label &&
                popularity == other.popularity &&
                published == other.published &&
                restrictions == other.restrictions &&
                tracks == other.tracks &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                albumType,
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
                artists,
                copyrights,
                externalIds,
                genres,
                label,
                popularity,
                published,
                restrictions,
                tracks,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Album{id=$id, albumType=$albumType, availableMarkets=$availableMarkets, externalUrls=$externalUrls, href=$href, images=$images, name=$name, releaseDate=$releaseDate, releaseDatePrecision=$releaseDatePrecision, totalTracks=$totalTracks, type=$type, uri=$uri, artists=$artists, copyrights=$copyrights, externalIds=$externalIds, genres=$genres, label=$label, popularity=$popularity, published=$published, restrictions=$restrictions, tracks=$tracks, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlbumBulkRetrieveResponse &&
            albums == other.albums &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(albums, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AlbumBulkRetrieveResponse{albums=$albums, additionalProperties=$additionalProperties}"
}
