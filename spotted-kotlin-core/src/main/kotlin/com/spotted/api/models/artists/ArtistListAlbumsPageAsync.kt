// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.artists

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.services.async.ArtistServiceAsync
import java.util.Objects

/** @see ArtistServiceAsync.listAlbums */
class ArtistListAlbumsPageAsync
private constructor(
    private val service: ArtistServiceAsync,
    private val params: ArtistListAlbumsParams,
    private val response: ArtistListAlbumsPageResponse,
) : PageAsync<ArtistListAlbumsResponse> {

    /**
     * Delegates to [ArtistListAlbumsPageResponse], but gracefully handles missing data.
     *
     * @see ArtistListAlbumsPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [ArtistListAlbumsPageResponse], but gracefully handles missing data.
     *
     * @see ArtistListAlbumsPageResponse.items
     */
    override fun items(): List<ArtistListAlbumsResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ArtistListAlbumsParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): ArtistListAlbumsPageAsync =
        service.listAlbums(nextPageParams())

    fun autoPager(): AutoPagerAsync<ArtistListAlbumsResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ArtistListAlbumsParams = params

    /** The response that this page was parsed from. */
    fun response(): ArtistListAlbumsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ArtistListAlbumsPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ArtistListAlbumsPageAsync]. */
    class Builder internal constructor() {

        private var service: ArtistServiceAsync? = null
        private var params: ArtistListAlbumsParams? = null
        private var response: ArtistListAlbumsPageResponse? = null

        internal fun from(artistListAlbumsPageAsync: ArtistListAlbumsPageAsync) = apply {
            service = artistListAlbumsPageAsync.service
            params = artistListAlbumsPageAsync.params
            response = artistListAlbumsPageAsync.response
        }

        fun service(service: ArtistServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ArtistListAlbumsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ArtistListAlbumsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ArtistListAlbumsPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ArtistListAlbumsPageAsync =
            ArtistListAlbumsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ArtistListAlbumsPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ArtistListAlbumsPageAsync{service=$service, params=$params, response=$response}"
}
