// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

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
import java.util.Collections
import java.util.Objects

class TrackObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val album: JsonField<Album>,
    private val artists: JsonField<List<SimplifiedArtistObject>>,
    private val availableMarkets: JsonField<List<String>>,
    private val discNumber: JsonField<Long>,
    private val durationMs: JsonField<Long>,
    private val explicit: JsonField<Boolean>,
    private val externalIds: JsonField<ExternalIdObject>,
    private val externalUrls: JsonField<ExternalUrlObject>,
    private val href: JsonField<String>,
    private val isLocal: JsonField<Boolean>,
    private val isPlayable: JsonField<Boolean>,
    private val linkedFrom: JsonField<LinkedTrackObject>,
    private val name: JsonField<String>,
    private val popularity: JsonField<Long>,
    private val previewUrl: JsonField<String>,
    private val restrictions: JsonField<TrackRestrictionObject>,
    private val trackNumber: JsonField<Long>,
    private val type: JsonField<Type>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("album") @ExcludeMissing album: JsonField<Album> = JsonMissing.of(),
        @JsonProperty("artists")
        @ExcludeMissing
        artists: JsonField<List<SimplifiedArtistObject>> = JsonMissing.of(),
        @JsonProperty("available_markets")
        @ExcludeMissing
        availableMarkets: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("disc_number") @ExcludeMissing discNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("duration_ms") @ExcludeMissing durationMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("explicit") @ExcludeMissing explicit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("external_ids")
        @ExcludeMissing
        externalIds: JsonField<ExternalIdObject> = JsonMissing.of(),
        @JsonProperty("external_urls")
        @ExcludeMissing
        externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of(),
        @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_local") @ExcludeMissing isLocal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_playable")
        @ExcludeMissing
        isPlayable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("linked_from")
        @ExcludeMissing
        linkedFrom: JsonField<LinkedTrackObject> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("popularity") @ExcludeMissing popularity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("preview_url")
        @ExcludeMissing
        previewUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("restrictions")
        @ExcludeMissing
        restrictions: JsonField<TrackRestrictionObject> = JsonMissing.of(),
        @JsonProperty("track_number")
        @ExcludeMissing
        trackNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        album,
        artists,
        availableMarkets,
        discNumber,
        durationMs,
        explicit,
        externalIds,
        externalUrls,
        href,
        isLocal,
        isPlayable,
        linkedFrom,
        name,
        popularity,
        previewUrl,
        restrictions,
        trackNumber,
        type,
        uri,
        mutableMapOf(),
    )

    /**
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * The album on which the track appears. The album object includes a link in `href` to full
     * information about the album.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun album(): Album? = album.getNullable("album")

    /**
     * The artists who performed the track. Each artist object includes a link in `href` to more
     * detailed information about the artist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun artists(): List<SimplifiedArtistObject>? = artists.getNullable("artists")

    /**
     * A list of the countries in which the track can be played, identified by their
     * [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun availableMarkets(): List<String>? = availableMarkets.getNullable("available_markets")

    /**
     * The disc number (usually `1` unless the album consists of more than one disc).
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun discNumber(): Long? = discNumber.getNullable("disc_number")

    /**
     * The track length in milliseconds.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationMs(): Long? = durationMs.getNullable("duration_ms")

    /**
     * Whether or not the track has explicit lyrics ( `true` = yes it does; `false` = no it does not
     * OR unknown).
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun explicit(): Boolean? = explicit.getNullable("explicit")

    /**
     * Known external IDs for the track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalIds(): ExternalIdObject? = externalIds.getNullable("external_ids")

    /**
     * Known external URLs for this track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalUrls(): ExternalUrlObject? = externalUrls.getNullable("external_urls")

    /**
     * A link to the Web API endpoint providing full details of the track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun href(): String? = href.getNullable("href")

    /**
     * Whether or not the track is from a local file.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isLocal(): Boolean? = isLocal.getNullable("is_local")

    /**
     * Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking)
     * is applied. If `true`, the track is playable in the given market. Otherwise `false`.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPlayable(): Boolean? = isPlayable.getNullable("is_playable")

    /**
     * Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking)
     * is applied, and the requested track has been replaced with different track. The track in the
     * `linked_from` object contains information about the originally requested track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linkedFrom(): LinkedTrackObject? = linkedFrom.getNullable("linked_from")

    /**
     * The name of the track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * The popularity of the track. The value will be between 0 and 100, with 100 being the most
     * popular.<br/>The popularity of a track is a value between 0 and 100, with 100 being the most
     * popular. The popularity is calculated by algorithm and is based, in the most part, on the
     * total number of plays the track has had and how recent those plays are.<br/>Generally
     * speaking, songs that are being played a lot now will have a higher popularity than songs that
     * were played a lot in the past. Duplicate tracks (e.g. the same track from a single and an
     * album) are rated independently. Artist and album popularity is derived mathematically from
     * track popularity. _**Note**: the popularity value may lag actual popularity by a few days:
     * the value is not updated in real time._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun popularity(): Long? = popularity.getNullable("popularity")

    /**
     * A link to a 30 second preview (MP3 format) of the track. Can be `null`
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun previewUrl(): String? = previewUrl.getNullable("preview_url")

    /**
     * Included in the response when a content restriction is applied.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun restrictions(): TrackRestrictionObject? = restrictions.getNullable("restrictions")

    /**
     * The number of the track. If an album has several discs, the track number is the number on the
     * specified disc.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trackNumber(): Long? = trackNumber.getNullable("track_number")

    /**
     * The object type: "track".
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Type? = type.getNullable("type")

    /**
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uri(): String? = uri.getNullable("uri")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [album].
     *
     * Unlike [album], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("album") @ExcludeMissing fun _album(): JsonField<Album> = album

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
     * Unlike [availableMarkets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_markets")
    @ExcludeMissing
    fun _availableMarkets(): JsonField<List<String>> = availableMarkets

    /**
     * Returns the raw JSON value of [discNumber].
     *
     * Unlike [discNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disc_number") @ExcludeMissing fun _discNumber(): JsonField<Long> = discNumber

    /**
     * Returns the raw JSON value of [durationMs].
     *
     * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration_ms") @ExcludeMissing fun _durationMs(): JsonField<Long> = durationMs

    /**
     * Returns the raw JSON value of [explicit].
     *
     * Unlike [explicit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("explicit") @ExcludeMissing fun _explicit(): JsonField<Boolean> = explicit

    /**
     * Returns the raw JSON value of [externalIds].
     *
     * Unlike [externalIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_ids")
    @ExcludeMissing
    fun _externalIds(): JsonField<ExternalIdObject> = externalIds

    /**
     * Returns the raw JSON value of [externalUrls].
     *
     * Unlike [externalUrls], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [isLocal].
     *
     * Unlike [isLocal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_local") @ExcludeMissing fun _isLocal(): JsonField<Boolean> = isLocal

    /**
     * Returns the raw JSON value of [isPlayable].
     *
     * Unlike [isPlayable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_playable") @ExcludeMissing fun _isPlayable(): JsonField<Boolean> = isPlayable

    /**
     * Returns the raw JSON value of [linkedFrom].
     *
     * Unlike [linkedFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linked_from")
    @ExcludeMissing
    fun _linkedFrom(): JsonField<LinkedTrackObject> = linkedFrom

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [popularity].
     *
     * Unlike [popularity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("popularity") @ExcludeMissing fun _popularity(): JsonField<Long> = popularity

    /**
     * Returns the raw JSON value of [previewUrl].
     *
     * Unlike [previewUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("preview_url")
    @ExcludeMissing
    fun _previewUrl(): JsonField<String> = previewUrl

    /**
     * Returns the raw JSON value of [restrictions].
     *
     * Unlike [restrictions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restrictions")
    @ExcludeMissing
    fun _restrictions(): JsonField<TrackRestrictionObject> = restrictions

    /**
     * Returns the raw JSON value of [trackNumber].
     *
     * Unlike [trackNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("track_number") @ExcludeMissing fun _trackNumber(): JsonField<Long> = trackNumber

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

        /** Returns a mutable builder for constructing an instance of [TrackObject]. */
        fun builder() = Builder()
    }

    /** A builder for [TrackObject]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var album: JsonField<Album> = JsonMissing.of()
        private var artists: JsonField<MutableList<SimplifiedArtistObject>>? = null
        private var availableMarkets: JsonField<MutableList<String>>? = null
        private var discNumber: JsonField<Long> = JsonMissing.of()
        private var durationMs: JsonField<Long> = JsonMissing.of()
        private var explicit: JsonField<Boolean> = JsonMissing.of()
        private var externalIds: JsonField<ExternalIdObject> = JsonMissing.of()
        private var externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of()
        private var href: JsonField<String> = JsonMissing.of()
        private var isLocal: JsonField<Boolean> = JsonMissing.of()
        private var isPlayable: JsonField<Boolean> = JsonMissing.of()
        private var linkedFrom: JsonField<LinkedTrackObject> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var popularity: JsonField<Long> = JsonMissing.of()
        private var previewUrl: JsonField<String> = JsonMissing.of()
        private var restrictions: JsonField<TrackRestrictionObject> = JsonMissing.of()
        private var trackNumber: JsonField<Long> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(trackObject: TrackObject) = apply {
            id = trackObject.id
            album = trackObject.album
            artists = trackObject.artists.map { it.toMutableList() }
            availableMarkets = trackObject.availableMarkets.map { it.toMutableList() }
            discNumber = trackObject.discNumber
            durationMs = trackObject.durationMs
            explicit = trackObject.explicit
            externalIds = trackObject.externalIds
            externalUrls = trackObject.externalUrls
            href = trackObject.href
            isLocal = trackObject.isLocal
            isPlayable = trackObject.isPlayable
            linkedFrom = trackObject.linkedFrom
            name = trackObject.name
            popularity = trackObject.popularity
            previewUrl = trackObject.previewUrl
            restrictions = trackObject.restrictions
            trackNumber = trackObject.trackNumber
            type = trackObject.type
            uri = trackObject.uri
            additionalProperties = trackObject.additionalProperties.toMutableMap()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The album on which the track appears. The album object includes a link in `href` to full
         * information about the album.
         */
        fun album(album: Album) = album(JsonField.of(album))

        /**
         * Sets [Builder.album] to an arbitrary JSON value.
         *
         * You should usually call [Builder.album] with a well-typed [Album] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun album(album: JsonField<Album>) = apply { this.album = album }

        /**
         * The artists who performed the track. Each artist object includes a link in `href` to more
         * detailed information about the artist.
         */
        fun artists(artists: List<SimplifiedArtistObject>) = artists(JsonField.of(artists))

        /**
         * Sets [Builder.artists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artists] with a well-typed
         * `List<SimplifiedArtistObject>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
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
         * A list of the countries in which the track can be played, identified by their
         * [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.
         */
        fun availableMarkets(availableMarkets: List<String>) =
            availableMarkets(JsonField.of(availableMarkets))

        /**
         * Sets [Builder.availableMarkets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableMarkets] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /** The disc number (usually `1` unless the album consists of more than one disc). */
        fun discNumber(discNumber: Long) = discNumber(JsonField.of(discNumber))

        /**
         * Sets [Builder.discNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discNumber] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun discNumber(discNumber: JsonField<Long>) = apply { this.discNumber = discNumber }

        /** The track length in milliseconds. */
        fun durationMs(durationMs: Long) = durationMs(JsonField.of(durationMs))

        /**
         * Sets [Builder.durationMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

        /**
         * Whether or not the track has explicit lyrics ( `true` = yes it does; `false` = no it does
         * not OR unknown).
         */
        fun explicit(explicit: Boolean) = explicit(JsonField.of(explicit))

        /**
         * Sets [Builder.explicit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.explicit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun explicit(explicit: JsonField<Boolean>) = apply { this.explicit = explicit }

        /** Known external IDs for the track. */
        fun externalIds(externalIds: ExternalIdObject) = externalIds(JsonField.of(externalIds))

        /**
         * Sets [Builder.externalIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalIds] with a well-typed [ExternalIdObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalIds(externalIds: JsonField<ExternalIdObject>) = apply {
            this.externalIds = externalIds
        }

        /** Known external URLs for this track. */
        fun externalUrls(externalUrls: ExternalUrlObject) = externalUrls(JsonField.of(externalUrls))

        /**
         * Sets [Builder.externalUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalUrls] with a well-typed [ExternalUrlObject]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalUrls(externalUrls: JsonField<ExternalUrlObject>) = apply {
            this.externalUrls = externalUrls
        }

        /** A link to the Web API endpoint providing full details of the track. */
        fun href(href: String) = href(JsonField.of(href))

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** Whether or not the track is from a local file. */
        fun isLocal(isLocal: Boolean) = isLocal(JsonField.of(isLocal))

        /**
         * Sets [Builder.isLocal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isLocal] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isLocal(isLocal: JsonField<Boolean>) = apply { this.isLocal = isLocal }

        /**
         * Part of the response when
         * [Track Relinking](/documentation/web-api/concepts/track-relinking) is applied. If `true`,
         * the track is playable in the given market. Otherwise `false`.
         */
        fun isPlayable(isPlayable: Boolean) = isPlayable(JsonField.of(isPlayable))

        /**
         * Sets [Builder.isPlayable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPlayable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPlayable(isPlayable: JsonField<Boolean>) = apply { this.isPlayable = isPlayable }

        /**
         * Part of the response when
         * [Track Relinking](/documentation/web-api/concepts/track-relinking) is applied, and the
         * requested track has been replaced with different track. The track in the `linked_from`
         * object contains information about the originally requested track.
         */
        fun linkedFrom(linkedFrom: LinkedTrackObject) = linkedFrom(JsonField.of(linkedFrom))

        /**
         * Sets [Builder.linkedFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkedFrom] with a well-typed [LinkedTrackObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun linkedFrom(linkedFrom: JsonField<LinkedTrackObject>) = apply {
            this.linkedFrom = linkedFrom
        }

        /** The name of the track. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The popularity of the track. The value will be between 0 and 100, with 100 being the most
         * popular.<br/>The popularity of a track is a value between 0 and 100, with 100 being the
         * most popular. The popularity is calculated by algorithm and is based, in the most part,
         * on the total number of plays the track has had and how recent those plays
         * are.<br/>Generally speaking, songs that are being played a lot now will have a higher
         * popularity than songs that were played a lot in the past. Duplicate tracks (e.g. the same
         * track from a single and an album) are rated independently. Artist and album popularity is
         * derived mathematically from track popularity. _**Note**: the popularity value may lag
         * actual popularity by a few days: the value is not updated in real time._
         */
        fun popularity(popularity: Long) = popularity(JsonField.of(popularity))

        /**
         * Sets [Builder.popularity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.popularity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun popularity(popularity: JsonField<Long>) = apply { this.popularity = popularity }

        /** A link to a 30 second preview (MP3 format) of the track. Can be `null` */
        @Deprecated("deprecated")
        fun previewUrl(previewUrl: String?) = previewUrl(JsonField.ofNullable(previewUrl))

        /**
         * Sets [Builder.previewUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previewUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun previewUrl(previewUrl: JsonField<String>) = apply { this.previewUrl = previewUrl }

        /** Included in the response when a content restriction is applied. */
        fun restrictions(restrictions: TrackRestrictionObject) =
            restrictions(JsonField.of(restrictions))

        /**
         * Sets [Builder.restrictions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictions] with a well-typed [TrackRestrictionObject]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun restrictions(restrictions: JsonField<TrackRestrictionObject>) = apply {
            this.restrictions = restrictions
        }

        /**
         * The number of the track. If an album has several discs, the track number is the number on
         * the specified disc.
         */
        fun trackNumber(trackNumber: Long) = trackNumber(JsonField.of(trackNumber))

        /**
         * Sets [Builder.trackNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackNumber] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trackNumber(trackNumber: JsonField<Long>) = apply { this.trackNumber = trackNumber }

        /** The object type: "track". */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track. */
        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
         * Returns an immutable instance of [TrackObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TrackObject =
            TrackObject(
                id,
                album,
                (artists ?: JsonMissing.of()).map { it.toImmutable() },
                (availableMarkets ?: JsonMissing.of()).map { it.toImmutable() },
                discNumber,
                durationMs,
                explicit,
                externalIds,
                externalUrls,
                href,
                isLocal,
                isPlayable,
                linkedFrom,
                name,
                popularity,
                previewUrl,
                restrictions,
                trackNumber,
                type,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TrackObject = apply {
        if (validated) {
            return@apply
        }

        id()
        album()?.validate()
        artists()?.forEach { it.validate() }
        availableMarkets()
        discNumber()
        durationMs()
        explicit()
        externalIds()?.validate()
        externalUrls()?.validate()
        href()
        isLocal()
        isPlayable()
        linkedFrom()?.validate()
        name()
        popularity()
        previewUrl()
        restrictions()?.validate()
        trackNumber()
        type()?.validate()
        uri()
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
            (album.asKnown()?.validity() ?: 0) +
            (artists.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (availableMarkets.asKnown()?.size ?: 0) +
            (if (discNumber.asKnown() == null) 0 else 1) +
            (if (durationMs.asKnown() == null) 0 else 1) +
            (if (explicit.asKnown() == null) 0 else 1) +
            (externalIds.asKnown()?.validity() ?: 0) +
            (externalUrls.asKnown()?.validity() ?: 0) +
            (if (href.asKnown() == null) 0 else 1) +
            (if (isLocal.asKnown() == null) 0 else 1) +
            (if (isPlayable.asKnown() == null) 0 else 1) +
            (linkedFrom.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (popularity.asKnown() == null) 0 else 1) +
            (if (previewUrl.asKnown() == null) 0 else 1) +
            (restrictions.asKnown()?.validity() ?: 0) +
            (if (trackNumber.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (uri.asKnown() == null) 0 else 1)

    /**
     * The album on which the track appears. The album object includes a link in `href` to full
     * information about the album.
     */
    class Album
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
         * The artists of the album. Each artist object includes a link in `href` to more detailed
         * information about the artist.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun artists(): List<SimplifiedArtistObject> = artists.getRequired("artists")

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
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the album.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun uri(): String = uri.getRequired("uri")

        /**
         * Included in the response when a content restriction is applied.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         * Unlike [albumType], this method doesn't throw if the JSON field has an unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Album].
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

        /** A builder for [Album]. */
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

            internal fun from(album: Album) = apply {
                id = album.id
                albumType = album.albumType
                artists = album.artists.map { it.toMutableList() }
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
                restrictions = album.restrictions
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

            /** The object type. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
            fun build(): Album =
                Album(
                    checkRequired("id", id),
                    checkRequired("albumType", albumType),
                    checkRequired("artists", artists).map { it.toImmutable() },
                    checkRequired("availableMarkets", availableMarkets).map { it.toImmutable() },
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

        fun validate(): Album = apply {
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

        /** The object type. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALBUM,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    else -> throw SpottedInvalidDataException("Unknown Type: $value")
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

            return other is Album &&
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
            "Album{id=$id, albumType=$albumType, artists=$artists, availableMarkets=$availableMarkets, externalUrls=$externalUrls, href=$href, images=$images, name=$name, releaseDate=$releaseDate, releaseDatePrecision=$releaseDatePrecision, totalTracks=$totalTracks, type=$type, uri=$uri, restrictions=$restrictions, additionalProperties=$additionalProperties}"
    }

    /** The object type: "track". */
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

            val TRACK = of("track")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            TRACK
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
            TRACK,
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
                TRACK -> Value.TRACK
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
                TRACK -> Known.TRACK
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackObject &&
            id == other.id &&
            album == other.album &&
            artists == other.artists &&
            availableMarkets == other.availableMarkets &&
            discNumber == other.discNumber &&
            durationMs == other.durationMs &&
            explicit == other.explicit &&
            externalIds == other.externalIds &&
            externalUrls == other.externalUrls &&
            href == other.href &&
            isLocal == other.isLocal &&
            isPlayable == other.isPlayable &&
            linkedFrom == other.linkedFrom &&
            name == other.name &&
            popularity == other.popularity &&
            previewUrl == other.previewUrl &&
            restrictions == other.restrictions &&
            trackNumber == other.trackNumber &&
            type == other.type &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            album,
            artists,
            availableMarkets,
            discNumber,
            durationMs,
            explicit,
            externalIds,
            externalUrls,
            href,
            isLocal,
            isPlayable,
            linkedFrom,
            name,
            popularity,
            previewUrl,
            restrictions,
            trackNumber,
            type,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrackObject{id=$id, album=$album, artists=$artists, availableMarkets=$availableMarkets, discNumber=$discNumber, durationMs=$durationMs, explicit=$explicit, externalIds=$externalIds, externalUrls=$externalUrls, href=$href, isLocal=$isLocal, isPlayable=$isPlayable, linkedFrom=$linkedFrom, name=$name, popularity=$popularity, previewUrl=$previewUrl, restrictions=$restrictions, trackNumber=$trackNumber, type=$type, uri=$uri, additionalProperties=$additionalProperties}"
}
