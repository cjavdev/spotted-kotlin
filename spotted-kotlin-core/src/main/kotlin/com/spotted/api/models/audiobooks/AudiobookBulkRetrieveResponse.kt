// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.audiobooks

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
import com.spotted.api.models.AudiobookBase
import com.spotted.api.models.AuthorObject
import com.spotted.api.models.CopyrightObject
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.ImageObject
import com.spotted.api.models.NarratorObject
import java.util.Collections
import java.util.Objects

class AudiobookBulkRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val audiobooks: JsonField<List<Audiobook>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("audiobooks")
        @ExcludeMissing
        audiobooks: JsonField<List<Audiobook>> = JsonMissing.of()
    ) : this(audiobooks, mutableMapOf())

    /**
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun audiobooks(): List<Audiobook> = audiobooks.getRequired("audiobooks")

    /**
     * Returns the raw JSON value of [audiobooks].
     *
     * Unlike [audiobooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audiobooks")
    @ExcludeMissing
    fun _audiobooks(): JsonField<List<Audiobook>> = audiobooks

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
         * Returns a mutable builder for constructing an instance of
         * [AudiobookBulkRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .audiobooks()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AudiobookBulkRetrieveResponse]. */
    class Builder internal constructor() {

        private var audiobooks: JsonField<MutableList<Audiobook>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(audiobookBulkRetrieveResponse: AudiobookBulkRetrieveResponse) = apply {
            audiobooks = audiobookBulkRetrieveResponse.audiobooks.map { it.toMutableList() }
            additionalProperties = audiobookBulkRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun audiobooks(audiobooks: List<Audiobook>) = audiobooks(JsonField.of(audiobooks))

        /**
         * Sets [Builder.audiobooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audiobooks] with a well-typed `List<Audiobook>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun audiobooks(audiobooks: JsonField<List<Audiobook>>) = apply {
            this.audiobooks = audiobooks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Audiobook] to [audiobooks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAudiobook(audiobook: Audiobook) = apply {
            audiobooks =
                (audiobooks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("audiobooks", it).add(audiobook)
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
         * Returns an immutable instance of [AudiobookBulkRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .audiobooks()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AudiobookBulkRetrieveResponse =
            AudiobookBulkRetrieveResponse(
                checkRequired("audiobooks", audiobooks).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AudiobookBulkRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        audiobooks().forEach { it.validate() }
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
    internal fun validity(): Int = (audiobooks.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Audiobook
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val authors: JsonField<List<AuthorObject>>,
        private val availableMarkets: JsonField<List<String>>,
        private val copyrights: JsonField<List<CopyrightObject>>,
        private val description: JsonField<String>,
        private val explicit: JsonField<Boolean>,
        private val externalUrls: JsonField<ExternalUrlObject>,
        private val href: JsonField<String>,
        private val htmlDescription: JsonField<String>,
        private val images: JsonField<List<ImageObject>>,
        private val languages: JsonField<List<String>>,
        private val mediaType: JsonField<String>,
        private val name: JsonField<String>,
        private val narrators: JsonField<List<NarratorObject>>,
        private val publisher: JsonField<String>,
        private val totalChapters: JsonField<Long>,
        private val type: JsonField<AudiobookBase.Type>,
        private val uri: JsonField<String>,
        private val edition: JsonField<String>,
        private val chapters: JsonField<Chapters>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("authors")
            @ExcludeMissing
            authors: JsonField<List<AuthorObject>> = JsonMissing.of(),
            @JsonProperty("available_markets")
            @ExcludeMissing
            availableMarkets: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("copyrights")
            @ExcludeMissing
            copyrights: JsonField<List<CopyrightObject>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("explicit")
            @ExcludeMissing
            explicit: JsonField<Boolean> = JsonMissing.of(),
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
            @JsonProperty("languages")
            @ExcludeMissing
            languages: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("media_type")
            @ExcludeMissing
            mediaType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("narrators")
            @ExcludeMissing
            narrators: JsonField<List<NarratorObject>> = JsonMissing.of(),
            @JsonProperty("publisher")
            @ExcludeMissing
            publisher: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total_chapters")
            @ExcludeMissing
            totalChapters: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<AudiobookBase.Type> = JsonMissing.of(),
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("edition") @ExcludeMissing edition: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chapters")
            @ExcludeMissing
            chapters: JsonField<Chapters> = JsonMissing.of(),
        ) : this(
            id,
            authors,
            availableMarkets,
            copyrights,
            description,
            explicit,
            externalUrls,
            href,
            htmlDescription,
            images,
            languages,
            mediaType,
            name,
            narrators,
            publisher,
            totalChapters,
            type,
            uri,
            edition,
            chapters,
            mutableMapOf(),
        )

        fun toAudiobookBase(): AudiobookBase =
            AudiobookBase.builder()
                .id(id)
                .authors(authors)
                .availableMarkets(availableMarkets)
                .copyrights(copyrights)
                .description(description)
                .explicit(explicit)
                .externalUrls(externalUrls)
                .href(href)
                .htmlDescription(htmlDescription)
                .images(images)
                .languages(languages)
                .mediaType(mediaType)
                .name(name)
                .narrators(narrators)
                .publisher(publisher)
                .totalChapters(totalChapters)
                .type(type)
                .uri(uri)
                .edition(edition)
                .build()

        /**
         * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The author(s) for the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authors(): List<AuthorObject> = authors.getRequired("authors")

        /**
         * A list of the countries in which the audiobook can be played, identified by their
         * [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun availableMarkets(): List<String> = availableMarkets.getRequired("available_markets")

        /**
         * The copyright statements of the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun copyrights(): List<CopyrightObject> = copyrights.getRequired("copyrights")

        /**
         * A description of the audiobook. HTML tags are stripped away from this field, use
         * `html_description` field in case HTML tags are needed.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * Whether or not the audiobook has explicit content (true = yes it does; false = no it does
         * not OR unknown).
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun explicit(): Boolean = explicit.getRequired("explicit")

        /**
         * External URLs for this audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalUrls(): ExternalUrlObject = externalUrls.getRequired("external_urls")

        /**
         * A link to the Web API endpoint providing full details of the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun href(): String = href.getRequired("href")

        /**
         * A description of the audiobook. This field may contain HTML tags.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun htmlDescription(): String = htmlDescription.getRequired("html_description")

        /**
         * The cover art for the audiobook in various sizes, widest first.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun images(): List<ImageObject> = images.getRequired("images")

        /**
         * A list of the languages used in the audiobook, identified by their
         * [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun languages(): List<String> = languages.getRequired("languages")

        /**
         * The media type of the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mediaType(): String = mediaType.getRequired("media_type")

        /**
         * The name of the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The narrator(s) for the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun narrators(): List<NarratorObject> = narrators.getRequired("narrators")

        /**
         * The publisher of the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun publisher(): String = publisher.getRequired("publisher")

        /**
         * The number of chapters in this audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalChapters(): Long = totalChapters.getRequired("total_chapters")

        /**
         * The object type.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): AudiobookBase.Type = type.getRequired("type")

        /**
         * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun uri(): String = uri.getRequired("uri")

        /**
         * The edition of the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun edition(): String? = edition.getNullable("edition")

        /**
         * The chapters of the audiobook.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chapters(): Chapters = chapters.getRequired("chapters")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [authors].
         *
         * Unlike [authors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("authors")
        @ExcludeMissing
        fun _authors(): JsonField<List<AuthorObject>> = authors

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
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [explicit].
         *
         * Unlike [explicit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("explicit") @ExcludeMissing fun _explicit(): JsonField<Boolean> = explicit

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
         * Returns the raw JSON value of [htmlDescription].
         *
         * Unlike [htmlDescription], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [languages].
         *
         * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("languages")
        @ExcludeMissing
        fun _languages(): JsonField<List<String>> = languages

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
         * Returns the raw JSON value of [narrators].
         *
         * Unlike [narrators], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("narrators")
        @ExcludeMissing
        fun _narrators(): JsonField<List<NarratorObject>> = narrators

        /**
         * Returns the raw JSON value of [publisher].
         *
         * Unlike [publisher], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("publisher") @ExcludeMissing fun _publisher(): JsonField<String> = publisher

        /**
         * Returns the raw JSON value of [totalChapters].
         *
         * Unlike [totalChapters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_chapters")
        @ExcludeMissing
        fun _totalChapters(): JsonField<Long> = totalChapters

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AudiobookBase.Type> = type

        /**
         * Returns the raw JSON value of [uri].
         *
         * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

        /**
         * Returns the raw JSON value of [edition].
         *
         * Unlike [edition], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("edition") @ExcludeMissing fun _edition(): JsonField<String> = edition

        /**
         * Returns the raw JSON value of [chapters].
         *
         * Unlike [chapters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chapters") @ExcludeMissing fun _chapters(): JsonField<Chapters> = chapters

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
             * Returns a mutable builder for constructing an instance of [Audiobook].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .authors()
             * .availableMarkets()
             * .copyrights()
             * .description()
             * .explicit()
             * .externalUrls()
             * .href()
             * .htmlDescription()
             * .images()
             * .languages()
             * .mediaType()
             * .name()
             * .narrators()
             * .publisher()
             * .totalChapters()
             * .type()
             * .uri()
             * .chapters()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Audiobook]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var authors: JsonField<MutableList<AuthorObject>>? = null
            private var availableMarkets: JsonField<MutableList<String>>? = null
            private var copyrights: JsonField<MutableList<CopyrightObject>>? = null
            private var description: JsonField<String>? = null
            private var explicit: JsonField<Boolean>? = null
            private var externalUrls: JsonField<ExternalUrlObject>? = null
            private var href: JsonField<String>? = null
            private var htmlDescription: JsonField<String>? = null
            private var images: JsonField<MutableList<ImageObject>>? = null
            private var languages: JsonField<MutableList<String>>? = null
            private var mediaType: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var narrators: JsonField<MutableList<NarratorObject>>? = null
            private var publisher: JsonField<String>? = null
            private var totalChapters: JsonField<Long>? = null
            private var type: JsonField<AudiobookBase.Type>? = null
            private var uri: JsonField<String>? = null
            private var edition: JsonField<String> = JsonMissing.of()
            private var chapters: JsonField<Chapters>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(audiobook: Audiobook) = apply {
                id = audiobook.id
                authors = audiobook.authors.map { it.toMutableList() }
                availableMarkets = audiobook.availableMarkets.map { it.toMutableList() }
                copyrights = audiobook.copyrights.map { it.toMutableList() }
                description = audiobook.description
                explicit = audiobook.explicit
                externalUrls = audiobook.externalUrls
                href = audiobook.href
                htmlDescription = audiobook.htmlDescription
                images = audiobook.images.map { it.toMutableList() }
                languages = audiobook.languages.map { it.toMutableList() }
                mediaType = audiobook.mediaType
                name = audiobook.name
                narrators = audiobook.narrators.map { it.toMutableList() }
                publisher = audiobook.publisher
                totalChapters = audiobook.totalChapters
                type = audiobook.type
                uri = audiobook.uri
                edition = audiobook.edition
                chapters = audiobook.chapters
                additionalProperties = audiobook.additionalProperties.toMutableMap()
            }

            /**
             * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook.
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

            /** The author(s) for the audiobook. */
            fun authors(authors: List<AuthorObject>) = authors(JsonField.of(authors))

            /**
             * Sets [Builder.authors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authors] with a well-typed `List<AuthorObject>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun authors(authors: JsonField<List<AuthorObject>>) = apply {
                this.authors = authors.map { it.toMutableList() }
            }

            /**
             * Adds a single [AuthorObject] to [authors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAuthor(author: AuthorObject) = apply {
                authors =
                    (authors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("authors", it).add(author)
                    }
            }

            /**
             * A list of the countries in which the audiobook can be played, identified by their
             * [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.
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

            /** The copyright statements of the audiobook. */
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

            /**
             * A description of the audiobook. HTML tags are stripped away from this field, use
             * `html_description` field in case HTML tags are needed.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Whether or not the audiobook has explicit content (true = yes it does; false = no it
             * does not OR unknown).
             */
            fun explicit(explicit: Boolean) = explicit(JsonField.of(explicit))

            /**
             * Sets [Builder.explicit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.explicit] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun explicit(explicit: JsonField<Boolean>) = apply { this.explicit = explicit }

            /** External URLs for this audiobook. */
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

            /** A link to the Web API endpoint providing full details of the audiobook. */
            fun href(href: String) = href(JsonField.of(href))

            /**
             * Sets [Builder.href] to an arbitrary JSON value.
             *
             * You should usually call [Builder.href] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun href(href: JsonField<String>) = apply { this.href = href }

            /** A description of the audiobook. This field may contain HTML tags. */
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

            /** The cover art for the audiobook in various sizes, widest first. */
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
             * A list of the languages used in the audiobook, identified by their
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

            /** The media type of the audiobook. */
            fun mediaType(mediaType: String) = mediaType(JsonField.of(mediaType))

            /**
             * Sets [Builder.mediaType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaType(mediaType: JsonField<String>) = apply { this.mediaType = mediaType }

            /** The name of the audiobook. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The narrator(s) for the audiobook. */
            fun narrators(narrators: List<NarratorObject>) = narrators(JsonField.of(narrators))

            /**
             * Sets [Builder.narrators] to an arbitrary JSON value.
             *
             * You should usually call [Builder.narrators] with a well-typed `List<NarratorObject>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun narrators(narrators: JsonField<List<NarratorObject>>) = apply {
                this.narrators = narrators.map { it.toMutableList() }
            }

            /**
             * Adds a single [NarratorObject] to [narrators].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNarrator(narrator: NarratorObject) = apply {
                narrators =
                    (narrators ?: JsonField.of(mutableListOf())).also {
                        checkKnown("narrators", it).add(narrator)
                    }
            }

            /** The publisher of the audiobook. */
            fun publisher(publisher: String) = publisher(JsonField.of(publisher))

            /**
             * Sets [Builder.publisher] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publisher] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun publisher(publisher: JsonField<String>) = apply { this.publisher = publisher }

            /** The number of chapters in this audiobook. */
            fun totalChapters(totalChapters: Long) = totalChapters(JsonField.of(totalChapters))

            /**
             * Sets [Builder.totalChapters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalChapters] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalChapters(totalChapters: JsonField<Long>) = apply {
                this.totalChapters = totalChapters
            }

            /** The object type. */
            fun type(type: AudiobookBase.Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [AudiobookBase.Type] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<AudiobookBase.Type>) = apply { this.type = type }

            /**
             * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the
             * audiobook.
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

            /** The edition of the audiobook. */
            fun edition(edition: String) = edition(JsonField.of(edition))

            /**
             * Sets [Builder.edition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.edition] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun edition(edition: JsonField<String>) = apply { this.edition = edition }

            /** The chapters of the audiobook. */
            fun chapters(chapters: Chapters) = chapters(JsonField.of(chapters))

            /**
             * Sets [Builder.chapters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chapters] with a well-typed [Chapters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chapters(chapters: JsonField<Chapters>) = apply { this.chapters = chapters }

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
             * Returns an immutable instance of [Audiobook].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .authors()
             * .availableMarkets()
             * .copyrights()
             * .description()
             * .explicit()
             * .externalUrls()
             * .href()
             * .htmlDescription()
             * .images()
             * .languages()
             * .mediaType()
             * .name()
             * .narrators()
             * .publisher()
             * .totalChapters()
             * .type()
             * .uri()
             * .chapters()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Audiobook =
                Audiobook(
                    checkRequired("id", id),
                    checkRequired("authors", authors).map { it.toImmutable() },
                    checkRequired("availableMarkets", availableMarkets).map { it.toImmutable() },
                    checkRequired("copyrights", copyrights).map { it.toImmutable() },
                    checkRequired("description", description),
                    checkRequired("explicit", explicit),
                    checkRequired("externalUrls", externalUrls),
                    checkRequired("href", href),
                    checkRequired("htmlDescription", htmlDescription),
                    checkRequired("images", images).map { it.toImmutable() },
                    checkRequired("languages", languages).map { it.toImmutable() },
                    checkRequired("mediaType", mediaType),
                    checkRequired("name", name),
                    checkRequired("narrators", narrators).map { it.toImmutable() },
                    checkRequired("publisher", publisher),
                    checkRequired("totalChapters", totalChapters),
                    checkRequired("type", type),
                    checkRequired("uri", uri),
                    edition,
                    checkRequired("chapters", chapters),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Audiobook = apply {
            if (validated) {
                return@apply
            }

            id()
            authors().forEach { it.validate() }
            availableMarkets()
            copyrights().forEach { it.validate() }
            description()
            explicit()
            externalUrls().validate()
            href()
            htmlDescription()
            images().forEach { it.validate() }
            languages()
            mediaType()
            name()
            narrators().forEach { it.validate() }
            publisher()
            totalChapters()
            type().validate()
            uri()
            edition()
            chapters().validate()
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
                (authors.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (availableMarkets.asKnown()?.size ?: 0) +
                (copyrights.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (explicit.asKnown() == null) 0 else 1) +
                (externalUrls.asKnown()?.validity() ?: 0) +
                (if (href.asKnown() == null) 0 else 1) +
                (if (htmlDescription.asKnown() == null) 0 else 1) +
                (images.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (languages.asKnown()?.size ?: 0) +
                (if (mediaType.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (narrators.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (publisher.asKnown() == null) 0 else 1) +
                (if (totalChapters.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (uri.asKnown() == null) 0 else 1) +
                (if (edition.asKnown() == null) 0 else 1) +
                (chapters.asKnown()?.validity() ?: 0)

        /** The chapters of the audiobook. */
        class Chapters
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val href: JsonField<String>,
            private val items: JsonField<List<SimplifiedChapterObject>>,
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
                items: JsonField<List<SimplifiedChapterObject>> = JsonMissing.of(),
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun href(): String = href.getRequired("href")

            /**
             * @throws SpottedInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun items(): List<SimplifiedChapterObject> = items.getRequired("items")

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
            fun _items(): JsonField<List<SimplifiedChapterObject>> = items

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
                 * Returns a mutable builder for constructing an instance of [Chapters].
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

            /** A builder for [Chapters]. */
            class Builder internal constructor() {

                private var href: JsonField<String>? = null
                private var items: JsonField<MutableList<SimplifiedChapterObject>>? = null
                private var limit: JsonField<Long>? = null
                private var next: JsonField<String>? = null
                private var offset: JsonField<Long>? = null
                private var previous: JsonField<String>? = null
                private var total: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chapters: Chapters) = apply {
                    href = chapters.href
                    items = chapters.items.map { it.toMutableList() }
                    limit = chapters.limit
                    next = chapters.next
                    offset = chapters.offset
                    previous = chapters.previous
                    total = chapters.total
                    additionalProperties = chapters.additionalProperties.toMutableMap()
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

                fun items(items: List<SimplifiedChapterObject>) = items(JsonField.of(items))

                /**
                 * Sets [Builder.items] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.items] with a well-typed
                 * `List<SimplifiedChapterObject>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun items(items: JsonField<List<SimplifiedChapterObject>>) = apply {
                    this.items = items.map { it.toMutableList() }
                }

                /**
                 * Adds a single [SimplifiedChapterObject] to [items].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addItem(item: SimplifiedChapterObject) = apply {
                    items =
                        (items ?: JsonField.of(mutableListOf())).also {
                            checkKnown("items", it).add(item)
                        }
                }

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
                 * Returns an immutable instance of [Chapters].
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
                fun build(): Chapters =
                    Chapters(
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

            fun validate(): Chapters = apply {
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

                return other is Chapters &&
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
                Objects.hash(
                    href,
                    items,
                    limit,
                    next,
                    offset,
                    previous,
                    total,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Chapters{href=$href, items=$items, limit=$limit, next=$next, offset=$offset, previous=$previous, total=$total, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Audiobook &&
                id == other.id &&
                authors == other.authors &&
                availableMarkets == other.availableMarkets &&
                copyrights == other.copyrights &&
                description == other.description &&
                explicit == other.explicit &&
                externalUrls == other.externalUrls &&
                href == other.href &&
                htmlDescription == other.htmlDescription &&
                images == other.images &&
                languages == other.languages &&
                mediaType == other.mediaType &&
                name == other.name &&
                narrators == other.narrators &&
                publisher == other.publisher &&
                totalChapters == other.totalChapters &&
                type == other.type &&
                uri == other.uri &&
                edition == other.edition &&
                chapters == other.chapters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                authors,
                availableMarkets,
                copyrights,
                description,
                explicit,
                externalUrls,
                href,
                htmlDescription,
                images,
                languages,
                mediaType,
                name,
                narrators,
                publisher,
                totalChapters,
                type,
                uri,
                edition,
                chapters,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Audiobook{id=$id, authors=$authors, availableMarkets=$availableMarkets, copyrights=$copyrights, description=$description, explicit=$explicit, externalUrls=$externalUrls, href=$href, htmlDescription=$htmlDescription, images=$images, languages=$languages, mediaType=$mediaType, name=$name, narrators=$narrators, publisher=$publisher, totalChapters=$totalChapters, type=$type, uri=$uri, edition=$edition, chapters=$chapters, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudiobookBulkRetrieveResponse &&
            audiobooks == other.audiobooks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(audiobooks, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AudiobookBulkRetrieveResponse{audiobooks=$audiobooks, additionalProperties=$additionalProperties}"
}
