// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.audiobooks

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
import dev.cjav.spotted.models.ChapterRestrictionObject
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.ImageObject
import dev.cjav.spotted.models.ResumePointObject
import java.util.Collections
import java.util.Objects

class SimplifiedChapterObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val audioPreviewUrl: JsonField<String>,
    private val chapterNumber: JsonField<Long>,
    private val description: JsonField<String>,
    private val durationMs: JsonField<Long>,
    private val explicit: JsonField<Boolean>,
    private val externalUrls: JsonField<ExternalUrlObject>,
    private val href: JsonField<String>,
    private val htmlDescription: JsonField<String>,
    private val images: JsonField<List<ImageObject>>,
    private val isPlayable: JsonField<Boolean>,
    private val languages: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val releaseDate: JsonField<String>,
    private val releaseDatePrecision: JsonField<ReleaseDatePrecision>,
    private val type: JsonValue,
    private val uri: JsonField<String>,
    private val availableMarkets: JsonField<List<String>>,
    private val restrictions: JsonField<ChapterRestrictionObject>,
    private val resumePoint: JsonField<ResumePointObject>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("audio_preview_url")
        @ExcludeMissing
        audioPreviewUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chapter_number")
        @ExcludeMissing
        chapterNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration_ms") @ExcludeMissing durationMs: JsonField<Long> = JsonMissing.of(),
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
        @JsonProperty("is_playable")
        @ExcludeMissing
        isPlayable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("languages")
        @ExcludeMissing
        languages: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("release_date")
        @ExcludeMissing
        releaseDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("release_date_precision")
        @ExcludeMissing
        releaseDatePrecision: JsonField<ReleaseDatePrecision> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("available_markets")
        @ExcludeMissing
        availableMarkets: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("restrictions")
        @ExcludeMissing
        restrictions: JsonField<ChapterRestrictionObject> = JsonMissing.of(),
        @JsonProperty("resume_point")
        @ExcludeMissing
        resumePoint: JsonField<ResumePointObject> = JsonMissing.of(),
    ) : this(
        id,
        audioPreviewUrl,
        chapterNumber,
        description,
        durationMs,
        explicit,
        externalUrls,
        href,
        htmlDescription,
        images,
        isPlayable,
        languages,
        name,
        releaseDate,
        releaseDatePrecision,
        type,
        uri,
        availableMarkets,
        restrictions,
        resumePoint,
        mutableMapOf(),
    )

    /**
     * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the chapter.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * A URL to a 30 second preview (MP3 format) of the chapter. `null` if not available.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun audioPreviewUrl(): String? = audioPreviewUrl.getNullable("audio_preview_url")

    /**
     * The number of the chapter
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chapterNumber(): Long = chapterNumber.getRequired("chapter_number")

    /**
     * A description of the chapter. HTML tags are stripped away from this field, use
     * `html_description` field in case HTML tags are needed.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The chapter length in milliseconds.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun durationMs(): Long = durationMs.getRequired("duration_ms")

    /**
     * Whether or not the chapter has explicit content (true = yes it does; false = no it does not
     * OR unknown).
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun explicit(): Boolean = explicit.getRequired("explicit")

    /**
     * External URLs for this chapter.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalUrls(): ExternalUrlObject = externalUrls.getRequired("external_urls")

    /**
     * A link to the Web API endpoint providing full details of the chapter.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun href(): String = href.getRequired("href")

    /**
     * A description of the chapter. This field may contain HTML tags.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun htmlDescription(): String = htmlDescription.getRequired("html_description")

    /**
     * The cover art for the chapter in various sizes, widest first.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun images(): List<ImageObject> = images.getRequired("images")

    /**
     * True if the chapter is playable in the given market. Otherwise false.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPlayable(): Boolean = isPlayable.getRequired("is_playable")

    /**
     * A list of the languages used in the chapter, identified by their
     * [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun languages(): List<String> = languages.getRequired("languages")

    /**
     * The name of the chapter.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The date the chapter was first released, for example `"1981-12-15"`. Depending on the
     * precision, it might be shown as `"1981"` or `"1981-12"`.
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
     * The object type.
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("episode")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the chapter.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uri(): String = uri.getRequired("uri")

    /**
     * A list of the countries in which the chapter can be played, identified by their
     * [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun availableMarkets(): List<String>? = availableMarkets.getNullable("available_markets")

    /**
     * Included in the response when a content restriction is applied.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun restrictions(): ChapterRestrictionObject? = restrictions.getNullable("restrictions")

    /**
     * The user's most recent position in the chapter. Set if the supplied access token is a user
     * token and has the scope 'user-read-playback-position'.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resumePoint(): ResumePointObject? = resumePoint.getNullable("resume_point")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [audioPreviewUrl].
     *
     * Unlike [audioPreviewUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("audio_preview_url")
    @ExcludeMissing
    fun _audioPreviewUrl(): JsonField<String> = audioPreviewUrl

    /**
     * Returns the raw JSON value of [chapterNumber].
     *
     * Unlike [chapterNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chapter_number")
    @ExcludeMissing
    fun _chapterNumber(): JsonField<Long> = chapterNumber

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [isPlayable].
     *
     * Unlike [isPlayable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_playable") @ExcludeMissing fun _isPlayable(): JsonField<Boolean> = isPlayable

    /**
     * Returns the raw JSON value of [languages].
     *
     * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("languages") @ExcludeMissing fun _languages(): JsonField<List<String>> = languages

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
     * Unlike [releaseDatePrecision], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("release_date_precision")
    @ExcludeMissing
    fun _releaseDatePrecision(): JsonField<ReleaseDatePrecision> = releaseDatePrecision

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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
     * Returns the raw JSON value of [restrictions].
     *
     * Unlike [restrictions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restrictions")
    @ExcludeMissing
    fun _restrictions(): JsonField<ChapterRestrictionObject> = restrictions

    /**
     * Returns the raw JSON value of [resumePoint].
     *
     * Unlike [resumePoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resume_point")
    @ExcludeMissing
    fun _resumePoint(): JsonField<ResumePointObject> = resumePoint

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
         * Returns a mutable builder for constructing an instance of [SimplifiedChapterObject].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .audioPreviewUrl()
         * .chapterNumber()
         * .description()
         * .durationMs()
         * .explicit()
         * .externalUrls()
         * .href()
         * .htmlDescription()
         * .images()
         * .isPlayable()
         * .languages()
         * .name()
         * .releaseDate()
         * .releaseDatePrecision()
         * .uri()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SimplifiedChapterObject]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var audioPreviewUrl: JsonField<String>? = null
        private var chapterNumber: JsonField<Long>? = null
        private var description: JsonField<String>? = null
        private var durationMs: JsonField<Long>? = null
        private var explicit: JsonField<Boolean>? = null
        private var externalUrls: JsonField<ExternalUrlObject>? = null
        private var href: JsonField<String>? = null
        private var htmlDescription: JsonField<String>? = null
        private var images: JsonField<MutableList<ImageObject>>? = null
        private var isPlayable: JsonField<Boolean>? = null
        private var languages: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var releaseDate: JsonField<String>? = null
        private var releaseDatePrecision: JsonField<ReleaseDatePrecision>? = null
        private var type: JsonValue = JsonValue.from("episode")
        private var uri: JsonField<String>? = null
        private var availableMarkets: JsonField<MutableList<String>>? = null
        private var restrictions: JsonField<ChapterRestrictionObject> = JsonMissing.of()
        private var resumePoint: JsonField<ResumePointObject> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(simplifiedChapterObject: SimplifiedChapterObject) = apply {
            id = simplifiedChapterObject.id
            audioPreviewUrl = simplifiedChapterObject.audioPreviewUrl
            chapterNumber = simplifiedChapterObject.chapterNumber
            description = simplifiedChapterObject.description
            durationMs = simplifiedChapterObject.durationMs
            explicit = simplifiedChapterObject.explicit
            externalUrls = simplifiedChapterObject.externalUrls
            href = simplifiedChapterObject.href
            htmlDescription = simplifiedChapterObject.htmlDescription
            images = simplifiedChapterObject.images.map { it.toMutableList() }
            isPlayable = simplifiedChapterObject.isPlayable
            languages = simplifiedChapterObject.languages.map { it.toMutableList() }
            name = simplifiedChapterObject.name
            releaseDate = simplifiedChapterObject.releaseDate
            releaseDatePrecision = simplifiedChapterObject.releaseDatePrecision
            type = simplifiedChapterObject.type
            uri = simplifiedChapterObject.uri
            availableMarkets = simplifiedChapterObject.availableMarkets.map { it.toMutableList() }
            restrictions = simplifiedChapterObject.restrictions
            resumePoint = simplifiedChapterObject.resumePoint
            additionalProperties = simplifiedChapterObject.additionalProperties.toMutableMap()
        }

        /** The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the chapter. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** A URL to a 30 second preview (MP3 format) of the chapter. `null` if not available. */
        @Deprecated("deprecated")
        fun audioPreviewUrl(audioPreviewUrl: String?) =
            audioPreviewUrl(JsonField.ofNullable(audioPreviewUrl))

        /**
         * Sets [Builder.audioPreviewUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioPreviewUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun audioPreviewUrl(audioPreviewUrl: JsonField<String>) = apply {
            this.audioPreviewUrl = audioPreviewUrl
        }

        /** The number of the chapter */
        fun chapterNumber(chapterNumber: Long) = chapterNumber(JsonField.of(chapterNumber))

        /**
         * Sets [Builder.chapterNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chapterNumber] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chapterNumber(chapterNumber: JsonField<Long>) = apply {
            this.chapterNumber = chapterNumber
        }

        /**
         * A description of the chapter. HTML tags are stripped away from this field, use
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

        /** The chapter length in milliseconds. */
        fun durationMs(durationMs: Long) = durationMs(JsonField.of(durationMs))

        /**
         * Sets [Builder.durationMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

        /**
         * Whether or not the chapter has explicit content (true = yes it does; false = no it does
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

        /** External URLs for this chapter. */
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

        /** A link to the Web API endpoint providing full details of the chapter. */
        fun href(href: String) = href(JsonField.of(href))

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** A description of the chapter. This field may contain HTML tags. */
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

        /** The cover art for the chapter in various sizes, widest first. */
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

        /** True if the chapter is playable in the given market. Otherwise false. */
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
         * A list of the languages used in the chapter, identified by their
         * [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code.
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

        /** The name of the chapter. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The date the chapter was first released, for example `"1981-12-15"`. Depending on the
         * precision, it might be shown as `"1981"` or `"1981-12"`.
         */
        fun releaseDate(releaseDate: String) = releaseDate(JsonField.of(releaseDate))

        /**
         * Sets [Builder.releaseDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.releaseDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun releaseDate(releaseDate: JsonField<String>) = apply { this.releaseDate = releaseDate }

        /** The precision with which `release_date` value is known. */
        fun releaseDatePrecision(releaseDatePrecision: ReleaseDatePrecision) =
            releaseDatePrecision(JsonField.of(releaseDatePrecision))

        /**
         * Sets [Builder.releaseDatePrecision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.releaseDatePrecision] with a well-typed
         * [ReleaseDatePrecision] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun releaseDatePrecision(releaseDatePrecision: JsonField<ReleaseDatePrecision>) = apply {
            this.releaseDatePrecision = releaseDatePrecision
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("episode")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        /** The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the chapter. */
        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

        /**
         * A list of the countries in which the chapter can be played, identified by their
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

        /** Included in the response when a content restriction is applied. */
        fun restrictions(restrictions: ChapterRestrictionObject) =
            restrictions(JsonField.of(restrictions))

        /**
         * Sets [Builder.restrictions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictions] with a well-typed
         * [ChapterRestrictionObject] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun restrictions(restrictions: JsonField<ChapterRestrictionObject>) = apply {
            this.restrictions = restrictions
        }

        /**
         * The user's most recent position in the chapter. Set if the supplied access token is a
         * user token and has the scope 'user-read-playback-position'.
         */
        fun resumePoint(resumePoint: ResumePointObject) = resumePoint(JsonField.of(resumePoint))

        /**
         * Sets [Builder.resumePoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resumePoint] with a well-typed [ResumePointObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resumePoint(resumePoint: JsonField<ResumePointObject>) = apply {
            this.resumePoint = resumePoint
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
         * Returns an immutable instance of [SimplifiedChapterObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .audioPreviewUrl()
         * .chapterNumber()
         * .description()
         * .durationMs()
         * .explicit()
         * .externalUrls()
         * .href()
         * .htmlDescription()
         * .images()
         * .isPlayable()
         * .languages()
         * .name()
         * .releaseDate()
         * .releaseDatePrecision()
         * .uri()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SimplifiedChapterObject =
            SimplifiedChapterObject(
                checkRequired("id", id),
                checkRequired("audioPreviewUrl", audioPreviewUrl),
                checkRequired("chapterNumber", chapterNumber),
                checkRequired("description", description),
                checkRequired("durationMs", durationMs),
                checkRequired("explicit", explicit),
                checkRequired("externalUrls", externalUrls),
                checkRequired("href", href),
                checkRequired("htmlDescription", htmlDescription),
                checkRequired("images", images).map { it.toImmutable() },
                checkRequired("isPlayable", isPlayable),
                checkRequired("languages", languages).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("releaseDate", releaseDate),
                checkRequired("releaseDatePrecision", releaseDatePrecision),
                type,
                checkRequired("uri", uri),
                (availableMarkets ?: JsonMissing.of()).map { it.toImmutable() },
                restrictions,
                resumePoint,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimplifiedChapterObject = apply {
        if (validated) {
            return@apply
        }

        id()
        audioPreviewUrl()
        chapterNumber()
        description()
        durationMs()
        explicit()
        externalUrls().validate()
        href()
        htmlDescription()
        images().forEach { it.validate() }
        isPlayable()
        languages()
        name()
        releaseDate()
        releaseDatePrecision().validate()
        _type().let {
            if (it != JsonValue.from("episode")) {
                throw SpottedInvalidDataException("'type' is invalid, received $it")
            }
        }
        uri()
        availableMarkets()
        restrictions()?.validate()
        resumePoint()?.validate()
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
            (if (audioPreviewUrl.asKnown() == null) 0 else 1) +
            (if (chapterNumber.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (durationMs.asKnown() == null) 0 else 1) +
            (if (explicit.asKnown() == null) 0 else 1) +
            (externalUrls.asKnown()?.validity() ?: 0) +
            (if (href.asKnown() == null) 0 else 1) +
            (if (htmlDescription.asKnown() == null) 0 else 1) +
            (images.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isPlayable.asKnown() == null) 0 else 1) +
            (languages.asKnown()?.size ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (releaseDate.asKnown() == null) 0 else 1) +
            (releaseDatePrecision.asKnown()?.validity() ?: 0) +
            type.let { if (it == JsonValue.from("episode")) 1 else 0 } +
            (if (uri.asKnown() == null) 0 else 1) +
            (availableMarkets.asKnown()?.size ?: 0) +
            (restrictions.asKnown()?.validity() ?: 0) +
            (resumePoint.asKnown()?.validity() ?: 0)

    /** The precision with which `release_date` value is known. */
    class ReleaseDatePrecision
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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
         * An instance of [ReleaseDatePrecision] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws SpottedInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                YEAR -> Known.YEAR
                MONTH -> Known.MONTH
                DAY -> Known.DAY
                else -> throw SpottedInvalidDataException("Unknown ReleaseDatePrecision: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimplifiedChapterObject &&
            id == other.id &&
            audioPreviewUrl == other.audioPreviewUrl &&
            chapterNumber == other.chapterNumber &&
            description == other.description &&
            durationMs == other.durationMs &&
            explicit == other.explicit &&
            externalUrls == other.externalUrls &&
            href == other.href &&
            htmlDescription == other.htmlDescription &&
            images == other.images &&
            isPlayable == other.isPlayable &&
            languages == other.languages &&
            name == other.name &&
            releaseDate == other.releaseDate &&
            releaseDatePrecision == other.releaseDatePrecision &&
            type == other.type &&
            uri == other.uri &&
            availableMarkets == other.availableMarkets &&
            restrictions == other.restrictions &&
            resumePoint == other.resumePoint &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            audioPreviewUrl,
            chapterNumber,
            description,
            durationMs,
            explicit,
            externalUrls,
            href,
            htmlDescription,
            images,
            isPlayable,
            languages,
            name,
            releaseDate,
            releaseDatePrecision,
            type,
            uri,
            availableMarkets,
            restrictions,
            resumePoint,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimplifiedChapterObject{id=$id, audioPreviewUrl=$audioPreviewUrl, chapterNumber=$chapterNumber, description=$description, durationMs=$durationMs, explicit=$explicit, externalUrls=$externalUrls, href=$href, htmlDescription=$htmlDescription, images=$images, isPlayable=$isPlayable, languages=$languages, name=$name, releaseDate=$releaseDate, releaseDatePrecision=$releaseDatePrecision, type=$type, uri=$uri, availableMarkets=$availableMarkets, restrictions=$restrictions, resumePoint=$resumePoint, additionalProperties=$additionalProperties}"
}
