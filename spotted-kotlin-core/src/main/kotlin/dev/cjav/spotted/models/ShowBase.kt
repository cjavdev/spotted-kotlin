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
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.core.toImmutable
import dev.cjav.spotted.errors.SpottedInvalidDataException
import java.util.Collections
import java.util.Objects

class ShowBase
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val availableMarkets: JsonField<List<String>>,
    private val copyrights: JsonField<List<CopyrightObject>>,
    private val description: JsonField<String>,
    private val explicit: JsonField<Boolean>,
    private val externalUrls: JsonField<ExternalUrlObject>,
    private val href: JsonField<String>,
    private val htmlDescription: JsonField<String>,
    private val images: JsonField<List<ImageObject>>,
    private val isExternallyHosted: JsonField<Boolean>,
    private val languages: JsonField<List<String>>,
    private val mediaType: JsonField<String>,
    private val name: JsonField<String>,
    private val publisher: JsonField<String>,
    private val totalEpisodes: JsonField<Long>,
    private val type: JsonValue,
    private val uri: JsonField<String>,
    private val published: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("available_markets")
        @ExcludeMissing
        availableMarkets: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("copyrights")
        @ExcludeMissing
        copyrights: JsonField<List<CopyrightObject>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("explicit") @ExcludeMissing explicit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("external_urls")
        @ExcludeMissing
        externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of(),
        @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
        @JsonProperty("html_description")
        @ExcludeMissing
        htmlDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("images")
        @ExcludeMissing
        images: JsonField<List<ImageObject>> = JsonMissing.of(),
        @JsonProperty("is_externally_hosted")
        @ExcludeMissing
        isExternallyHosted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("languages")
        @ExcludeMissing
        languages: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("media_type") @ExcludeMissing mediaType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("publisher") @ExcludeMissing publisher: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_episodes")
        @ExcludeMissing
        totalEpisodes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        availableMarkets,
        copyrights,
        description,
        explicit,
        externalUrls,
        href,
        htmlDescription,
        images,
        isExternallyHosted,
        languages,
        mediaType,
        name,
        publisher,
        totalEpisodes,
        type,
        uri,
        published,
        mutableMapOf(),
    )

    /**
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the show.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * A list of the countries in which the show can be played, identified by their
     * [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableMarkets(): List<String> = availableMarkets.getRequired("available_markets")

    /**
     * The copyright statements of the show.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun copyrights(): List<CopyrightObject> = copyrights.getRequired("copyrights")

    /**
     * A description of the show. HTML tags are stripped away from this field, use
     * `html_description` field in case HTML tags are needed.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * Whether or not the show has explicit content (true = yes it does; false = no it does not OR
     * unknown).
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun explicit(): Boolean = explicit.getRequired("explicit")

    /**
     * External URLs for this show.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalUrls(): ExternalUrlObject = externalUrls.getRequired("external_urls")

    /**
     * A link to the Web API endpoint providing full details of the show.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun href(): String = href.getRequired("href")

    /**
     * A description of the show. This field may contain HTML tags.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun htmlDescription(): String = htmlDescription.getRequired("html_description")

    /**
     * The cover art for the show in various sizes, widest first.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun images(): List<ImageObject> = images.getRequired("images")

    /**
     * True if all of the shows episodes are hosted outside of Spotify's CDN. This field might be
     * `null` in some cases.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isExternallyHosted(): Boolean = isExternallyHosted.getRequired("is_externally_hosted")

    /**
     * A list of the languages used in the show, identified by their
     * [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun languages(): List<String> = languages.getRequired("languages")

    /**
     * The media type of the show.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mediaType(): String = mediaType.getRequired("media_type")

    /**
     * The name of the episode.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The publisher of the show.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publisher(): String = publisher.getRequired("publisher")

    /**
     * The total number of episodes in the show.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalEpisodes(): Long = totalEpisodes.getRequired("total_episodes")

    /**
     * The object type.
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("show")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the show.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uri(): String = uri.getRequired("uri")

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
     * Returns the raw JSON value of [availableMarkets].
     *
     * Unlike [availableMarkets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_markets")
    @ExcludeMissing
    fun _availableMarkets(): JsonField<List<String>> = availableMarkets

    /**
     * Returns the raw JSON value of [copyrights].
     *
     * Unlike [copyrights], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("copyrights")
    @ExcludeMissing
    fun _copyrights(): JsonField<List<CopyrightObject>> = copyrights

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [htmlDescription].
     *
     * Unlike [htmlDescription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html_description")
    @ExcludeMissing
    fun _htmlDescription(): JsonField<String> = htmlDescription

    /**
     * Returns the raw JSON value of [images].
     *
     * Unlike [images], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("images") @ExcludeMissing fun _images(): JsonField<List<ImageObject>> = images

    /**
     * Returns the raw JSON value of [isExternallyHosted].
     *
     * Unlike [isExternallyHosted], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_externally_hosted")
    @ExcludeMissing
    fun _isExternallyHosted(): JsonField<Boolean> = isExternallyHosted

    /**
     * Returns the raw JSON value of [languages].
     *
     * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("languages") @ExcludeMissing fun _languages(): JsonField<List<String>> = languages

    /**
     * Returns the raw JSON value of [mediaType].
     *
     * Unlike [mediaType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media_type") @ExcludeMissing fun _mediaType(): JsonField<String> = mediaType

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [publisher].
     *
     * Unlike [publisher], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("publisher") @ExcludeMissing fun _publisher(): JsonField<String> = publisher

    /**
     * Returns the raw JSON value of [totalEpisodes].
     *
     * Unlike [totalEpisodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_episodes")
    @ExcludeMissing
    fun _totalEpisodes(): JsonField<Long> = totalEpisodes

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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
         * Returns a mutable builder for constructing an instance of [ShowBase].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .availableMarkets()
         * .copyrights()
         * .description()
         * .explicit()
         * .externalUrls()
         * .href()
         * .htmlDescription()
         * .images()
         * .isExternallyHosted()
         * .languages()
         * .mediaType()
         * .name()
         * .publisher()
         * .totalEpisodes()
         * .uri()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ShowBase]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var availableMarkets: JsonField<MutableList<String>>? = null
        private var copyrights: JsonField<MutableList<CopyrightObject>>? = null
        private var description: JsonField<String>? = null
        private var explicit: JsonField<Boolean>? = null
        private var externalUrls: JsonField<ExternalUrlObject>? = null
        private var href: JsonField<String>? = null
        private var htmlDescription: JsonField<String>? = null
        private var images: JsonField<MutableList<ImageObject>>? = null
        private var isExternallyHosted: JsonField<Boolean>? = null
        private var languages: JsonField<MutableList<String>>? = null
        private var mediaType: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var publisher: JsonField<String>? = null
        private var totalEpisodes: JsonField<Long>? = null
        private var type: JsonValue = JsonValue.from("show")
        private var uri: JsonField<String>? = null
        private var published: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(showBase: ShowBase) = apply {
            id = showBase.id
            availableMarkets = showBase.availableMarkets.map { it.toMutableList() }
            copyrights = showBase.copyrights.map { it.toMutableList() }
            description = showBase.description
            explicit = showBase.explicit
            externalUrls = showBase.externalUrls
            href = showBase.href
            htmlDescription = showBase.htmlDescription
            images = showBase.images.map { it.toMutableList() }
            isExternallyHosted = showBase.isExternallyHosted
            languages = showBase.languages.map { it.toMutableList() }
            mediaType = showBase.mediaType
            name = showBase.name
            publisher = showBase.publisher
            totalEpisodes = showBase.totalEpisodes
            type = showBase.type
            uri = showBase.uri
            published = showBase.published
            additionalProperties = showBase.additionalProperties.toMutableMap()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the show. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * A list of the countries in which the show can be played, identified by their
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

        /** The copyright statements of the show. */
        fun copyrights(copyrights: List<CopyrightObject>) = copyrights(JsonField.of(copyrights))

        /**
         * Sets [Builder.copyrights] to an arbitrary JSON value.
         *
         * You should usually call [Builder.copyrights] with a well-typed `List<CopyrightObject>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        /**
         * A description of the show. HTML tags are stripped away from this field, use
         * `html_description` field in case HTML tags are needed.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Whether or not the show has explicit content (true = yes it does; false = no it does not
         * OR unknown).
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

        /** External URLs for this show. */
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

        /** A link to the Web API endpoint providing full details of the show. */
        fun href(href: String) = href(JsonField.of(href))

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** A description of the show. This field may contain HTML tags. */
        fun htmlDescription(htmlDescription: String) =
            htmlDescription(JsonField.of(htmlDescription))

        /**
         * Sets [Builder.htmlDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.htmlDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun htmlDescription(htmlDescription: JsonField<String>) = apply {
            this.htmlDescription = htmlDescription
        }

        /** The cover art for the show in various sizes, widest first. */
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
         * True if all of the shows episodes are hosted outside of Spotify's CDN. This field might
         * be `null` in some cases.
         */
        fun isExternallyHosted(isExternallyHosted: Boolean) =
            isExternallyHosted(JsonField.of(isExternallyHosted))

        /**
         * Sets [Builder.isExternallyHosted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isExternallyHosted] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isExternallyHosted(isExternallyHosted: JsonField<Boolean>) = apply {
            this.isExternallyHosted = isExternallyHosted
        }

        /**
         * A list of the languages used in the show, identified by their
         * [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.
         */
        fun languages(languages: List<String>) = languages(JsonField.of(languages))

        /**
         * Sets [Builder.languages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.languages] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun languages(languages: JsonField<List<String>>) = apply {
            this.languages = languages.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [languages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLanguage(language: String) = apply {
            languages =
                (languages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("languages", it).add(language)
                }
        }

        /** The media type of the show. */
        fun mediaType(mediaType: String) = mediaType(JsonField.of(mediaType))

        /**
         * Sets [Builder.mediaType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaType(mediaType: JsonField<String>) = apply { this.mediaType = mediaType }

        /** The name of the episode. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The publisher of the show. */
        fun publisher(publisher: String) = publisher(JsonField.of(publisher))

        /**
         * Sets [Builder.publisher] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publisher] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publisher(publisher: JsonField<String>) = apply { this.publisher = publisher }

        /** The total number of episodes in the show. */
        fun totalEpisodes(totalEpisodes: Long) = totalEpisodes(JsonField.of(totalEpisodes))

        /**
         * Sets [Builder.totalEpisodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalEpisodes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalEpisodes(totalEpisodes: JsonField<Long>) = apply {
            this.totalEpisodes = totalEpisodes
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("show")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        /** The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the show. */
        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
         * Returns an immutable instance of [ShowBase].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .availableMarkets()
         * .copyrights()
         * .description()
         * .explicit()
         * .externalUrls()
         * .href()
         * .htmlDescription()
         * .images()
         * .isExternallyHosted()
         * .languages()
         * .mediaType()
         * .name()
         * .publisher()
         * .totalEpisodes()
         * .uri()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ShowBase =
            ShowBase(
                checkRequired("id", id),
                checkRequired("availableMarkets", availableMarkets).map { it.toImmutable() },
                checkRequired("copyrights", copyrights).map { it.toImmutable() },
                checkRequired("description", description),
                checkRequired("explicit", explicit),
                checkRequired("externalUrls", externalUrls),
                checkRequired("href", href),
                checkRequired("htmlDescription", htmlDescription),
                checkRequired("images", images).map { it.toImmutable() },
                checkRequired("isExternallyHosted", isExternallyHosted),
                checkRequired("languages", languages).map { it.toImmutable() },
                checkRequired("mediaType", mediaType),
                checkRequired("name", name),
                checkRequired("publisher", publisher),
                checkRequired("totalEpisodes", totalEpisodes),
                type,
                checkRequired("uri", uri),
                published,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ShowBase = apply {
        if (validated) {
            return@apply
        }

        id()
        availableMarkets()
        copyrights().forEach { it.validate() }
        description()
        explicit()
        externalUrls().validate()
        href()
        htmlDescription()
        images().forEach { it.validate() }
        isExternallyHosted()
        languages()
        mediaType()
        name()
        publisher()
        totalEpisodes()
        _type().let {
            if (it != JsonValue.from("show")) {
                throw SpottedInvalidDataException("'type' is invalid, received $it")
            }
        }
        uri()
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
            (availableMarkets.asKnown()?.size ?: 0) +
            (copyrights.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (explicit.asKnown() == null) 0 else 1) +
            (externalUrls.asKnown()?.validity() ?: 0) +
            (if (href.asKnown() == null) 0 else 1) +
            (if (htmlDescription.asKnown() == null) 0 else 1) +
            (images.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isExternallyHosted.asKnown() == null) 0 else 1) +
            (languages.asKnown()?.size ?: 0) +
            (if (mediaType.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (publisher.asKnown() == null) 0 else 1) +
            (if (totalEpisodes.asKnown() == null) 0 else 1) +
            type.let { if (it == JsonValue.from("show")) 1 else 0 } +
            (if (uri.asKnown() == null) 0 else 1) +
            (if (published.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShowBase &&
            id == other.id &&
            availableMarkets == other.availableMarkets &&
            copyrights == other.copyrights &&
            description == other.description &&
            explicit == other.explicit &&
            externalUrls == other.externalUrls &&
            href == other.href &&
            htmlDescription == other.htmlDescription &&
            images == other.images &&
            isExternallyHosted == other.isExternallyHosted &&
            languages == other.languages &&
            mediaType == other.mediaType &&
            name == other.name &&
            publisher == other.publisher &&
            totalEpisodes == other.totalEpisodes &&
            type == other.type &&
            uri == other.uri &&
            published == other.published &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            availableMarkets,
            copyrights,
            description,
            explicit,
            externalUrls,
            href,
            htmlDescription,
            images,
            isExternallyHosted,
            languages,
            mediaType,
            name,
            publisher,
            totalEpisodes,
            type,
            uri,
            published,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShowBase{id=$id, availableMarkets=$availableMarkets, copyrights=$copyrights, description=$description, explicit=$explicit, externalUrls=$externalUrls, href=$href, htmlDescription=$htmlDescription, images=$images, isExternallyHosted=$isExternallyHosted, languages=$languages, mediaType=$mediaType, name=$name, publisher=$publisher, totalEpisodes=$totalEpisodes, type=$type, uri=$uri, published=$published, additionalProperties=$additionalProperties}"
}
