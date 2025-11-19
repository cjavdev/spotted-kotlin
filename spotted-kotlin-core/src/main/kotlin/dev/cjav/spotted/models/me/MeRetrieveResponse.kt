// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me

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
import dev.cjav.spotted.models.ExternalUrlObject
import dev.cjav.spotted.models.FollowersObject
import dev.cjav.spotted.models.ImageObject
import java.util.Collections
import java.util.Objects

class MeRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val country: JsonField<String>,
    private val displayName: JsonField<String>,
    private val email: JsonField<String>,
    private val explicitContent: JsonField<ExplicitContent>,
    private val externalUrls: JsonField<ExternalUrlObject>,
    private val followers: JsonField<FollowersObject>,
    private val href: JsonField<String>,
    private val images: JsonField<List<ImageObject>>,
    private val product: JsonField<String>,
    private val type: JsonField<String>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("explicit_content")
        @ExcludeMissing
        explicitContent: JsonField<ExplicitContent> = JsonMissing.of(),
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
        @JsonProperty("product") @ExcludeMissing product: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        country,
        displayName,
        email,
        explicitContent,
        externalUrls,
        followers,
        href,
        images,
        product,
        type,
        uri,
        mutableMapOf(),
    )

    /**
     * The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for the user.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * The country of the user, as set in the user's account profile. An
     * [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _This
     * field is only available when the current user has granted access to the
     * [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun country(): String? = country.getNullable("country")

    /**
     * The name displayed on the user's profile. `null` if not available.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): String? = displayName.getNullable("display_name")

    /**
     * The user's email address, as entered by the user when creating their account. _**Important!**
     * This email address is unverified; there is no proof that it actually belongs to the user._
     * _This field is only available when the current user has granted access to the
     * [user-read-email](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * The user's explicit content settings. _This field is only available when the current user has
     * granted access to the
     * [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun explicitContent(): ExplicitContent? = explicitContent.getNullable("explicit_content")

    /**
     * Known external URLs for this user.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalUrls(): ExternalUrlObject? = externalUrls.getNullable("external_urls")

    /**
     * Information about the followers of the user.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun followers(): FollowersObject? = followers.getNullable("followers")

    /**
     * A link to the Web API endpoint for this user.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun href(): String? = href.getNullable("href")

    /**
     * The user's profile image.
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun images(): List<ImageObject>? = images.getNullable("images")

    /**
     * The user's Spotify subscription level: "premium", "free", etc. (The subscription level "open"
     * can be considered the same as "free".) _This field is only available when the current user
     * has granted access to the
     * [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun product(): String? = product.getNullable("product")

    /**
     * The object type: "user"
     *
     * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): String? = type.getNullable("type")

    /**
     * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the user.
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
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [explicitContent].
     *
     * Unlike [explicitContent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("explicit_content")
    @ExcludeMissing
    fun _explicitContent(): JsonField<ExplicitContent> = explicitContent

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
     * Returns the raw JSON value of [product].
     *
     * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<String> = product

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

        /** Returns a mutable builder for constructing an instance of [MeRetrieveResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [MeRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var explicitContent: JsonField<ExplicitContent> = JsonMissing.of()
        private var externalUrls: JsonField<ExternalUrlObject> = JsonMissing.of()
        private var followers: JsonField<FollowersObject> = JsonMissing.of()
        private var href: JsonField<String> = JsonMissing.of()
        private var images: JsonField<MutableList<ImageObject>>? = null
        private var product: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(meRetrieveResponse: MeRetrieveResponse) = apply {
            id = meRetrieveResponse.id
            country = meRetrieveResponse.country
            displayName = meRetrieveResponse.displayName
            email = meRetrieveResponse.email
            explicitContent = meRetrieveResponse.explicitContent
            externalUrls = meRetrieveResponse.externalUrls
            followers = meRetrieveResponse.followers
            href = meRetrieveResponse.href
            images = meRetrieveResponse.images.map { it.toMutableList() }
            product = meRetrieveResponse.product
            type = meRetrieveResponse.type
            uri = meRetrieveResponse.uri
            additionalProperties = meRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for the user. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The country of the user, as set in the user's account profile. An
         * [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _This
         * field is only available when the current user has granted access to the
         * [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** The name displayed on the user's profile. `null` if not available. */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /**
         * The user's email address, as entered by the user when creating their account.
         * _**Important!** This email address is unverified; there is no proof that it actually
         * belongs to the user._ _This field is only available when the current user has granted
         * access to the [user-read-email](/documentation/web-api/concepts/scopes/#list-of-scopes)
         * scope._
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * The user's explicit content settings. _This field is only available when the current user
         * has granted access to the
         * [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._
         */
        fun explicitContent(explicitContent: ExplicitContent) =
            explicitContent(JsonField.of(explicitContent))

        /**
         * Sets [Builder.explicitContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.explicitContent] with a well-typed [ExplicitContent]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun explicitContent(explicitContent: JsonField<ExplicitContent>) = apply {
            this.explicitContent = explicitContent
        }

        /** Known external URLs for this user. */
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

        /** Information about the followers of the user. */
        fun followers(followers: FollowersObject) = followers(JsonField.of(followers))

        /**
         * Sets [Builder.followers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.followers] with a well-typed [FollowersObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun followers(followers: JsonField<FollowersObject>) = apply { this.followers = followers }

        /** A link to the Web API endpoint for this user. */
        fun href(href: String) = href(JsonField.of(href))

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** The user's profile image. */
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
         * The user's Spotify subscription level: "premium", "free", etc. (The subscription level
         * "open" can be considered the same as "free".) _This field is only available when the
         * current user has granted access to the
         * [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._
         */
        fun product(product: String) = product(JsonField.of(product))

        /**
         * Sets [Builder.product] to an arbitrary JSON value.
         *
         * You should usually call [Builder.product] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun product(product: JsonField<String>) = apply { this.product = product }

        /** The object type: "user" */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the user. */
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
         * Returns an immutable instance of [MeRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MeRetrieveResponse =
            MeRetrieveResponse(
                id,
                country,
                displayName,
                email,
                explicitContent,
                externalUrls,
                followers,
                href,
                (images ?: JsonMissing.of()).map { it.toImmutable() },
                product,
                type,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MeRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        country()
        displayName()
        email()
        explicitContent()?.validate()
        externalUrls()?.validate()
        followers()?.validate()
        href()
        images()?.forEach { it.validate() }
        product()
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
            (if (country.asKnown() == null) 0 else 1) +
            (if (displayName.asKnown() == null) 0 else 1) +
            (if (email.asKnown() == null) 0 else 1) +
            (explicitContent.asKnown()?.validity() ?: 0) +
            (externalUrls.asKnown()?.validity() ?: 0) +
            (followers.asKnown()?.validity() ?: 0) +
            (if (href.asKnown() == null) 0 else 1) +
            (images.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (product.asKnown() == null) 0 else 1) +
            (if (type.asKnown() == null) 0 else 1) +
            (if (uri.asKnown() == null) 0 else 1)

    /**
     * The user's explicit content settings. _This field is only available when the current user has
     * granted access to the
     * [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._
     */
    class ExplicitContent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val filterEnabled: JsonField<Boolean>,
        private val filterLocked: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filter_enabled")
            @ExcludeMissing
            filterEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("filter_locked")
            @ExcludeMissing
            filterLocked: JsonField<Boolean> = JsonMissing.of(),
        ) : this(filterEnabled, filterLocked, mutableMapOf())

        /**
         * When `true`, indicates that explicit content should not be played.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filterEnabled(): Boolean? = filterEnabled.getNullable("filter_enabled")

        /**
         * When `true`, indicates that the explicit content setting is locked and can't be changed
         * by the user.
         *
         * @throws SpottedInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filterLocked(): Boolean? = filterLocked.getNullable("filter_locked")

        /**
         * Returns the raw JSON value of [filterEnabled].
         *
         * Unlike [filterEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("filter_enabled")
        @ExcludeMissing
        fun _filterEnabled(): JsonField<Boolean> = filterEnabled

        /**
         * Returns the raw JSON value of [filterLocked].
         *
         * Unlike [filterLocked], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("filter_locked")
        @ExcludeMissing
        fun _filterLocked(): JsonField<Boolean> = filterLocked

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

            /** Returns a mutable builder for constructing an instance of [ExplicitContent]. */
            fun builder() = Builder()
        }

        /** A builder for [ExplicitContent]. */
        class Builder internal constructor() {

            private var filterEnabled: JsonField<Boolean> = JsonMissing.of()
            private var filterLocked: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(explicitContent: ExplicitContent) = apply {
                filterEnabled = explicitContent.filterEnabled
                filterLocked = explicitContent.filterLocked
                additionalProperties = explicitContent.additionalProperties.toMutableMap()
            }

            /** When `true`, indicates that explicit content should not be played. */
            fun filterEnabled(filterEnabled: Boolean) = filterEnabled(JsonField.of(filterEnabled))

            /**
             * Sets [Builder.filterEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filterEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filterEnabled(filterEnabled: JsonField<Boolean>) = apply {
                this.filterEnabled = filterEnabled
            }

            /**
             * When `true`, indicates that the explicit content setting is locked and can't be
             * changed by the user.
             */
            fun filterLocked(filterLocked: Boolean) = filterLocked(JsonField.of(filterLocked))

            /**
             * Sets [Builder.filterLocked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filterLocked] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filterLocked(filterLocked: JsonField<Boolean>) = apply {
                this.filterLocked = filterLocked
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
             * Returns an immutable instance of [ExplicitContent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExplicitContent =
                ExplicitContent(filterEnabled, filterLocked, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ExplicitContent = apply {
            if (validated) {
                return@apply
            }

            filterEnabled()
            filterLocked()
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
            (if (filterEnabled.asKnown() == null) 0 else 1) +
                (if (filterLocked.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExplicitContent &&
                filterEnabled == other.filterEnabled &&
                filterLocked == other.filterLocked &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(filterEnabled, filterLocked, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExplicitContent{filterEnabled=$filterEnabled, filterLocked=$filterLocked, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeRetrieveResponse &&
            id == other.id &&
            country == other.country &&
            displayName == other.displayName &&
            email == other.email &&
            explicitContent == other.explicitContent &&
            externalUrls == other.externalUrls &&
            followers == other.followers &&
            href == other.href &&
            images == other.images &&
            product == other.product &&
            type == other.type &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            country,
            displayName,
            email,
            explicitContent,
            externalUrls,
            followers,
            href,
            images,
            product,
            type,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeRetrieveResponse{id=$id, country=$country, displayName=$displayName, email=$email, explicitContent=$explicitContent, externalUrls=$externalUrls, followers=$followers, href=$href, images=$images, product=$product, type=$type, uri=$uri, additionalProperties=$additionalProperties}"
}
