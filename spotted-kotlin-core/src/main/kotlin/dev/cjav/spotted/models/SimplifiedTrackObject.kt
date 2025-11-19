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
import dev.cjav.spotted.core.checkKnown
import dev.cjav.spotted.core.toImmutable
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class SimplifiedTrackObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val artists: JsonField<List<SimplifiedArtistObject>>,
    private val availableMarkets: JsonField<List<String>>,
    private val discNumber: JsonField<Long>,
    private val durationMs: JsonField<Long>,
    private val explicit: JsonField<Boolean>,
    private val externalUrls: JsonField<ExternalUrlObject>,
    private val href: JsonField<String>,
    private val isLocal: JsonField<Boolean>,
    private val isPlayable: JsonField<Boolean>,
    private val linkedFrom: JsonField<LinkedTrackObject>,
    private val name: JsonField<String>,
    private val previewUrl: JsonField<String>,
    private val restrictions: JsonField<TrackRestrictionObject>,
    private val trackNumber: JsonField<Long>,
    private val type: JsonField<String>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("artists")
        @ExcludeMissing
        artists: JsonField<List<SimplifiedArtistObject>> = JsonMissing.of(),
        @JsonProperty("available_markets")
        @ExcludeMissing
        availableMarkets: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("disc_number") @ExcludeMissing discNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("duration_ms") @ExcludeMissing durationMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("explicit") @ExcludeMissing explicit: JsonField<Boolean> = JsonMissing.of(),
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
        @JsonProperty("preview_url")
        @ExcludeMissing
        previewUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("restrictions")
        @ExcludeMissing
        restrictions: JsonField<TrackRestrictionObject> = JsonMissing.of(),
        @JsonProperty("track_number")
        @ExcludeMissing
        trackNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        artists,
        availableMarkets,
        discNumber,
        durationMs,
        explicit,
        externalUrls,
        href,
        isLocal,
        isPlayable,
        linkedFrom,
        name,
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
     * External URLs for this track.
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
     * Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/)
     * is applied. If `true`, the track is playable in the given market. Otherwise `false`.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPlayable(): Boolean? = isPlayable.getNullable("is_playable")

    /**
     * Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/)
     * is applied and is only part of the response if the track linking, in fact, exists. The
     * requested track has been replaced with a different track. The track in the `linked_from`
     * object contains information about the originally requested track.
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
     * A URL to a 30 second preview (MP3 format) of the track.
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
    fun type(): String? = type.getNullable("type")

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
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

        /** Returns a mutable builder for constructing an instance of [SimplifiedTrackObject]. */
        fun builder() = Builder()
    }

    /** A builder for [SimplifiedTrackObject]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var artists: JsonField<MutableList<SimplifiedArtistObject>>? = null
        private var availableMarkets: JsonField<MutableList<String>>? = null
        private var discNumber: JsonField<Long> = JsonMissing.of()
        private var durationMs: JsonField<Long> = JsonMissing.of()
        private var explicit: JsonField<Boolean> = JsonMissing.of()
        private var externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of()
        private var href: JsonField<String> = JsonMissing.of()
        private var isLocal: JsonField<Boolean> = JsonMissing.of()
        private var isPlayable: JsonField<Boolean> = JsonMissing.of()
        private var linkedFrom: JsonField<LinkedTrackObject> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var previewUrl: JsonField<String> = JsonMissing.of()
        private var restrictions: JsonField<TrackRestrictionObject> = JsonMissing.of()
        private var trackNumber: JsonField<Long> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(simplifiedTrackObject: SimplifiedTrackObject) = apply {
            id = simplifiedTrackObject.id
            artists = simplifiedTrackObject.artists.map { it.toMutableList() }
            availableMarkets = simplifiedTrackObject.availableMarkets.map { it.toMutableList() }
            discNumber = simplifiedTrackObject.discNumber
            durationMs = simplifiedTrackObject.durationMs
            explicit = simplifiedTrackObject.explicit
            externalUrls = simplifiedTrackObject.externalUrls
            href = simplifiedTrackObject.href
            isLocal = simplifiedTrackObject.isLocal
            isPlayable = simplifiedTrackObject.isPlayable
            linkedFrom = simplifiedTrackObject.linkedFrom
            name = simplifiedTrackObject.name
            previewUrl = simplifiedTrackObject.previewUrl
            restrictions = simplifiedTrackObject.restrictions
            trackNumber = simplifiedTrackObject.trackNumber
            type = simplifiedTrackObject.type
            uri = simplifiedTrackObject.uri
            additionalProperties = simplifiedTrackObject.additionalProperties.toMutableMap()
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

        /** External URLs for this track. */
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
         * [Track Relinking](/documentation/web-api/concepts/track-relinking/) is applied. If
         * `true`, the track is playable in the given market. Otherwise `false`.
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
         * [Track Relinking](/documentation/web-api/concepts/track-relinking/) is applied and is
         * only part of the response if the track linking, in fact, exists. The requested track has
         * been replaced with a different track. The track in the `linked_from` object contains
         * information about the originally requested track.
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

        /** A URL to a 30 second preview (MP3 format) of the track. */
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
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [SimplifiedTrackObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimplifiedTrackObject =
            SimplifiedTrackObject(
                id,
                (artists ?: JsonMissing.of()).map { it.toImmutable() },
                (availableMarkets ?: JsonMissing.of()).map { it.toImmutable() },
                discNumber,
                durationMs,
                explicit,
                externalUrls,
                href,
                isLocal,
                isPlayable,
                linkedFrom,
                name,
                previewUrl,
                restrictions,
                trackNumber,
                type,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimplifiedTrackObject = apply {
        if (validated) {
            return@apply
        }

        id()
        artists()?.forEach { it.validate() }
        availableMarkets()
        discNumber()
        durationMs()
        explicit()
        externalUrls()?.validate()
        href()
        isLocal()
        isPlayable()
        linkedFrom()?.validate()
        name()
        previewUrl()
        restrictions()?.validate()
        trackNumber()
        type()
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
            (artists.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (availableMarkets.asKnown()?.size ?: 0) +
            (if (discNumber.asKnown() == null) 0 else 1) +
            (if (durationMs.asKnown() == null) 0 else 1) +
            (if (explicit.asKnown() == null) 0 else 1) +
            (externalUrls.asKnown()?.validity() ?: 0) +
            (if (href.asKnown() == null) 0 else 1) +
            (if (isLocal.asKnown() == null) 0 else 1) +
            (if (isPlayable.asKnown() == null) 0 else 1) +
            (linkedFrom.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (previewUrl.asKnown() == null) 0 else 1) +
            (restrictions.asKnown()?.validity() ?: 0) +
            (if (trackNumber.asKnown() == null) 0 else 1) +
            (if (type.asKnown() == null) 0 else 1) +
            (if (uri.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimplifiedTrackObject &&
            id == other.id &&
            artists == other.artists &&
            availableMarkets == other.availableMarkets &&
            discNumber == other.discNumber &&
            durationMs == other.durationMs &&
            explicit == other.explicit &&
            externalUrls == other.externalUrls &&
            href == other.href &&
            isLocal == other.isLocal &&
            isPlayable == other.isPlayable &&
            linkedFrom == other.linkedFrom &&
            name == other.name &&
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
            artists,
            availableMarkets,
            discNumber,
            durationMs,
            explicit,
            externalUrls,
            href,
            isLocal,
            isPlayable,
            linkedFrom,
            name,
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
        "SimplifiedTrackObject{id=$id, artists=$artists, availableMarkets=$availableMarkets, discNumber=$discNumber, durationMs=$durationMs, explicit=$explicit, externalUrls=$externalUrls, href=$href, isLocal=$isLocal, isPlayable=$isPlayable, linkedFrom=$linkedFrom, name=$name, previewUrl=$previewUrl, restrictions=$restrictions, trackNumber=$trackNumber, type=$type, uri=$uri, additionalProperties=$additionalProperties}"
}
