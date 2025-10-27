// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.users.playlists

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
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.FollowersObject
import com.spotted.api.models.ImageObject
import com.spotted.api.models.PlaylistTrackObject
import com.spotted.api.models.PlaylistUserObject
import java.util.Collections
import java.util.Objects

class PlaylistCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val collaborative: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val externalUrls: JsonField<ExternalUrlObject>,
    private val followers: JsonField<FollowersObject>,
    private val href: JsonField<String>,
    private val images: JsonField<List<ImageObject>>,
    private val name: JsonField<String>,
    private val owner: JsonField<Owner>,
    private val public_: JsonField<Boolean>,
    private val snapshotId: JsonField<String>,
    private val tracks: JsonField<Tracks>,
    private val type: JsonField<String>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collaborative")
        @ExcludeMissing
        collaborative: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_urls")
        @ExcludeMissing
        externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of(),
        @JsonProperty("followers")
        @ExcludeMissing
        followers: JsonField<FollowersObject> = JsonMissing.of(),
        @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
        @JsonProperty("images")
        @ExcludeMissing
        images: JsonField<List<ImageObject>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<Owner> = JsonMissing.of(),
        @JsonProperty("public") @ExcludeMissing public_: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("snapshot_id")
        @ExcludeMissing
        snapshotId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tracks") @ExcludeMissing tracks: JsonField<Tracks> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        collaborative,
        description,
        externalUrls,
        followers,
        href,
        images,
        name,
        owner,
        public_,
        snapshotId,
        tracks,
        type,
        uri,
        mutableMapOf(),
    )

    /**
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * `true` if the owner allows other users to modify the playlist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun collaborative(): Boolean? = collaborative.getNullable("collaborative")

    /**
     * The playlist description. _Only returned for modified, verified playlists, otherwise_ `null`.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * Known external URLs for this playlist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalUrls(): ExternalUrlObject? = externalUrls.getNullable("external_urls")

    /**
     * Information about the followers of the playlist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun followers(): FollowersObject? = followers.getNullable("followers")

    /**
     * A link to the Web API endpoint providing full details of the playlist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun href(): String? = href.getNullable("href")

    /**
     * Images for the playlist. The array may be empty or contain up to three images. The images are
     * returned by size in descending order. See
     * [Working with Playlists](/documentation/web-api/concepts/playlists). _**Note**: If returned,
     * the source URL for the image (`url`) is temporary and will expire in less than a day._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun images(): List<ImageObject>? = images.getNullable("images")

    /**
     * The name of the playlist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * The user who owns the playlist
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun owner(): Owner? = owner.getNullable("owner")

    /**
     * The playlist's public/private status (if it is added to the user's profile): `true` the
     * playlist is public, `false` the playlist is private, `null` the playlist status is not
     * relevant. For more about public/private status, see
     * [Working with Playlists](/documentation/web-api/concepts/playlists)
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun public_(): Boolean? = public_.getNullable("public")

    /**
     * The version identifier for the current playlist. Can be supplied in other requests to target
     * a specific playlist version
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotId(): String? = snapshotId.getNullable("snapshot_id")

    /**
     * The tracks of the playlist.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tracks(): Tracks? = tracks.getNullable("tracks")

    /**
     * The object type: "playlist"
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): String? = type.getNullable("type")

    /**
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.
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
     * Returns the raw JSON value of [collaborative].
     *
     * Unlike [collaborative], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collaborative")
    @ExcludeMissing
    fun _collaborative(): JsonField<Boolean> = collaborative

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [externalUrls].
     *
     * Unlike [externalUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_urls")
    @ExcludeMissing
    fun _externalUrls(): JsonField<ExternalUrlObject> = externalUrls

    /**
     * Returns the raw JSON value of [followers].
     *
     * Unlike [followers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("followers")
    @ExcludeMissing
    fun _followers(): JsonField<FollowersObject> = followers

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
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<Owner> = owner

    /**
     * Returns the raw JSON value of [public_].
     *
     * Unlike [public_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("public") @ExcludeMissing fun _public_(): JsonField<Boolean> = public_

    /**
     * Returns the raw JSON value of [snapshotId].
     *
     * Unlike [snapshotId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snapshot_id") @ExcludeMissing fun _snapshotId(): JsonField<String> = snapshotId

    /**
     * Returns the raw JSON value of [tracks].
     *
     * Unlike [tracks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracks") @ExcludeMissing fun _tracks(): JsonField<Tracks> = tracks

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

        /** Returns a mutable builder for constructing an instance of [PlaylistCreateResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [PlaylistCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var collaborative: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of()
        private var followers: JsonField<FollowersObject> = JsonMissing.of()
        private var href: JsonField<String> = JsonMissing.of()
        private var images: JsonField<MutableList<ImageObject>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var owner: JsonField<Owner> = JsonMissing.of()
        private var public_: JsonField<Boolean> = JsonMissing.of()
        private var snapshotId: JsonField<String> = JsonMissing.of()
        private var tracks: JsonField<Tracks> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(playlistCreateResponse: PlaylistCreateResponse) = apply {
            id = playlistCreateResponse.id
            collaborative = playlistCreateResponse.collaborative
            description = playlistCreateResponse.description
            externalUrls = playlistCreateResponse.externalUrls
            followers = playlistCreateResponse.followers
            href = playlistCreateResponse.href
            images = playlistCreateResponse.images.map { it.toMutableList() }
            name = playlistCreateResponse.name
            owner = playlistCreateResponse.owner
            public_ = playlistCreateResponse.public_
            snapshotId = playlistCreateResponse.snapshotId
            tracks = playlistCreateResponse.tracks
            type = playlistCreateResponse.type
            uri = playlistCreateResponse.uri
            additionalProperties = playlistCreateResponse.additionalProperties.toMutableMap()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** `true` if the owner allows other users to modify the playlist. */
        fun collaborative(collaborative: Boolean) = collaborative(JsonField.of(collaborative))

        /**
         * Sets [Builder.collaborative] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collaborative] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collaborative(collaborative: JsonField<Boolean>) = apply {
            this.collaborative = collaborative
        }

        /**
         * The playlist description. _Only returned for modified, verified playlists, otherwise_
         * `null`.
         */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Known external URLs for this playlist. */
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

        /** Information about the followers of the playlist. */
        fun followers(followers: FollowersObject) = followers(JsonField.of(followers))

        /**
         * Sets [Builder.followers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.followers] with a well-typed [FollowersObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun followers(followers: JsonField<FollowersObject>) = apply { this.followers = followers }

        /** A link to the Web API endpoint providing full details of the playlist. */
        fun href(href: String) = href(JsonField.of(href))

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /**
         * Images for the playlist. The array may be empty or contain up to three images. The images
         * are returned by size in descending order. See
         * [Working with Playlists](/documentation/web-api/concepts/playlists). _**Note**: If
         * returned, the source URL for the image (`url`) is temporary and will expire in less than
         * a day._
         */
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

        /** The name of the playlist. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The user who owns the playlist */
        fun owner(owner: Owner) = owner(JsonField.of(owner))

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [Owner] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<Owner>) = apply { this.owner = owner }

        /**
         * The playlist's public/private status (if it is added to the user's profile): `true` the
         * playlist is public, `false` the playlist is private, `null` the playlist status is not
         * relevant. For more about public/private status, see
         * [Working with Playlists](/documentation/web-api/concepts/playlists)
         */
        fun public_(public_: Boolean) = public_(JsonField.of(public_))

        /**
         * Sets [Builder.public_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.public_] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun public_(public_: JsonField<Boolean>) = apply { this.public_ = public_ }

        /**
         * The version identifier for the current playlist. Can be supplied in other requests to
         * target a specific playlist version
         */
        fun snapshotId(snapshotId: String) = snapshotId(JsonField.of(snapshotId))

        /**
         * Sets [Builder.snapshotId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun snapshotId(snapshotId: JsonField<String>) = apply { this.snapshotId = snapshotId }

        /** The tracks of the playlist. */
        fun tracks(tracks: Tracks) = tracks(JsonField.of(tracks))

        /**
         * Sets [Builder.tracks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracks] with a well-typed [Tracks] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tracks(tracks: JsonField<Tracks>) = apply { this.tracks = tracks }

        /** The object type: "playlist" */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist. */
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
         * Returns an immutable instance of [PlaylistCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlaylistCreateResponse =
            PlaylistCreateResponse(
                id,
                collaborative,
                description,
                externalUrls,
                followers,
                href,
                (images ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                owner,
                public_,
                snapshotId,
                tracks,
                type,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlaylistCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        collaborative()
        description()
        externalUrls()?.validate()
        followers()?.validate()
        href()
        images()?.forEach { it.validate() }
        name()
        owner()?.validate()
        public_()
        snapshotId()
        tracks()?.validate()
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
            (if (collaborative.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (externalUrls.asKnown()?.validity() ?: 0) +
            (followers.asKnown()?.validity() ?: 0) +
            (if (href.asKnown() == null) 0 else 1) +
            (images.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (owner.asKnown()?.validity() ?: 0) +
            (if (public_.asKnown() == null) 0 else 1) +
            (if (snapshotId.asKnown() == null) 0 else 1) +
            (tracks.asKnown()?.validity() ?: 0) +
            (if (type.asKnown() == null) 0 else 1) +
            (if (uri.asKnown() == null) 0 else 1)

    /** The user who owns the playlist */
    class Owner
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val externalUrls: JsonField<ExternalUrlObject>,
        private val href: JsonField<String>,
        private val type: JsonField<PlaylistUserObject.Type>,
        private val uri: JsonField<String>,
        private val displayName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_urls")
            @ExcludeMissing
            externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of(),
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<PlaylistUserObject.Type> = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
        ) : this(id, externalUrls, href, type, uri, displayName, mutableMapOf())

        fun toPlaylistUserObject(): PlaylistUserObject =
            PlaylistUserObject.builder()
                .id(id)
                .externalUrls(externalUrls)
                .href(href)
                .type(type)
                .uri(uri)
                .build()

        /**
         * The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for this user.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): String? = id.getNullable("id")

        /**
         * Known public external URLs for this user.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalUrls(): ExternalUrlObject? = externalUrls.getNullable("external_urls")

        /**
         * A link to the Web API endpoint for this user.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun href(): String? = href.getNullable("href")

        /**
         * The object type.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): PlaylistUserObject.Type? = type.getNullable("type")

        /**
         * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for this user.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uri(): String? = uri.getNullable("uri")

        /**
         * The name displayed on the user's profile. `null` if not available.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): String? = displayName.getNullable("display_name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PlaylistUserObject.Type> = type

        /**
         * Returns the raw JSON value of [uri].
         *
         * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

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

            /** Returns a mutable builder for constructing an instance of [Owner]. */
            fun builder() = Builder()
        }

        /** A builder for [Owner]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of()
            private var href: JsonField<String> = JsonMissing.of()
            private var type: JsonField<PlaylistUserObject.Type> = JsonMissing.of()
            private var uri: JsonField<String> = JsonMissing.of()
            private var displayName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(owner: Owner) = apply {
                id = owner.id
                externalUrls = owner.externalUrls
                href = owner.href
                type = owner.type
                uri = owner.uri
                displayName = owner.displayName
                additionalProperties = owner.additionalProperties.toMutableMap()
            }

            /**
             * The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for this
             * user.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Known public external URLs for this user. */
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

            /** A link to the Web API endpoint for this user. */
            fun href(href: String) = href(JsonField.of(href))

            /**
             * Sets [Builder.href] to an arbitrary JSON value.
             *
             * You should usually call [Builder.href] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun href(href: JsonField<String>) = apply { this.href = href }

            /** The object type. */
            fun type(type: PlaylistUserObject.Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [PlaylistUserObject.Type]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun type(type: JsonField<PlaylistUserObject.Type>) = apply { this.type = type }

            /**
             * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for this user.
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

            /** The name displayed on the user's profile. `null` if not available. */
            fun displayName(displayName: String?) = displayName(JsonField.ofNullable(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
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
             * Returns an immutable instance of [Owner].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Owner =
                Owner(
                    id,
                    externalUrls,
                    href,
                    type,
                    uri,
                    displayName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Owner = apply {
            if (validated) {
                return@apply
            }

            id()
            externalUrls()?.validate()
            href()
            type()?.validate()
            uri()
            displayName()
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
                (externalUrls.asKnown()?.validity() ?: 0) +
                (if (href.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (uri.asKnown() == null) 0 else 1) +
                (if (displayName.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Owner &&
                id == other.id &&
                externalUrls == other.externalUrls &&
                href == other.href &&
                type == other.type &&
                uri == other.uri &&
                displayName == other.displayName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, externalUrls, href, type, uri, displayName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Owner{id=$id, externalUrls=$externalUrls, href=$href, type=$type, uri=$uri, displayName=$displayName, additionalProperties=$additionalProperties}"
    }

    /** The tracks of the playlist. */
    class Tracks
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val href: JsonField<String>,
        private val items: JsonField<List<PlaylistTrackObject>>,
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
            @JsonProperty("items")
            @ExcludeMissing
            items: JsonField<List<PlaylistTrackObject>> = JsonMissing.of(),
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
        fun items(): List<PlaylistTrackObject> = items.getRequired("items")

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
        @JsonProperty("items")
        @ExcludeMissing
        fun _items(): JsonField<List<PlaylistTrackObject>> = items

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
             * Returns a mutable builder for constructing an instance of [Tracks].
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

        /** A builder for [Tracks]. */
        class Builder internal constructor() {

            private var href: JsonField<String>? = null
            private var items: JsonField<MutableList<PlaylistTrackObject>>? = null
            private var limit: JsonField<Long>? = null
            private var next: JsonField<String>? = null
            private var offset: JsonField<Long>? = null
            private var previous: JsonField<String>? = null
            private var total: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tracks: Tracks) = apply {
                href = tracks.href
                items = tracks.items.map { it.toMutableList() }
                limit = tracks.limit
                next = tracks.next
                offset = tracks.offset
                previous = tracks.previous
                total = tracks.total
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

            fun items(items: List<PlaylistTrackObject>) = items(JsonField.of(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<PlaylistTrackObject>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun items(items: JsonField<List<PlaylistTrackObject>>) = apply {
                this.items = items.map { it.toMutableList() }
            }

            /**
             * Adds a single [PlaylistTrackObject] to [items].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addItem(item: PlaylistTrackObject) = apply {
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
             * Returns an immutable instance of [Tracks].
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
            fun build(): Tracks =
                Tracks(
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

        fun validate(): Tracks = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tracks &&
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
            "Tracks{href=$href, items=$items, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlaylistCreateResponse &&
            id == other.id &&
            collaborative == other.collaborative &&
            description == other.description &&
            externalUrls == other.externalUrls &&
            followers == other.followers &&
            href == other.href &&
            images == other.images &&
            name == other.name &&
            owner == other.owner &&
            public_ == other.public_ &&
            snapshotId == other.snapshotId &&
            tracks == other.tracks &&
            type == other.type &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            collaborative,
            description,
            externalUrls,
            followers,
            href,
            images,
            name,
            owner,
            public_,
            snapshotId,
            tracks,
            type,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlaylistCreateResponse{id=$id, collaborative=$collaborative, description=$description, externalUrls=$externalUrls, followers=$followers, href=$href, images=$images, name=$name, owner=$owner, public_=$public_, snapshotId=$snapshotId, tracks=$tracks, type=$type, uri=$uri, additionalProperties=$additionalProperties}"
}
