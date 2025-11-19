// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.top

import dev.cjav.spotted.core.AutoPagerAsync
import dev.cjav.spotted.core.PageAsync
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.models.ArtistObject
import dev.cjav.spotted.services.async.me.TopServiceAsync
import java.util.Objects

/** @see TopServiceAsync.listTopArtists */
class TopListTopArtistsPageAsync
private constructor(
    private val service: TopServiceAsync,
    private val params: TopListTopArtistsParams,
    private val response: TopListTopArtistsPageResponse,
) : PageAsync<ArtistObject> {

    /**
     * Delegates to [TopListTopArtistsPageResponse], but gracefully handles missing data.
     *
     * @see TopListTopArtistsPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [TopListTopArtistsPageResponse], but gracefully handles missing data.
     *
     * @see TopListTopArtistsPageResponse.items
     */
    override fun items(): List<ArtistObject> = response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TopListTopArtistsParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): TopListTopArtistsPageAsync =
        service.listTopArtists(nextPageParams())

    fun autoPager(): AutoPagerAsync<ArtistObject> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TopListTopArtistsParams = params

    /** The response that this page was parsed from. */
    fun response(): TopListTopArtistsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TopListTopArtistsPageAsync].
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

    /** A builder for [TopListTopArtistsPageAsync]. */
    class Builder internal constructor() {

        private var service: TopServiceAsync? = null
        private var params: TopListTopArtistsParams? = null
        private var response: TopListTopArtistsPageResponse? = null

        internal fun from(topListTopArtistsPageAsync: TopListTopArtistsPageAsync) = apply {
            service = topListTopArtistsPageAsync.service
            params = topListTopArtistsPageAsync.params
            response = topListTopArtistsPageAsync.response
        }

        fun service(service: TopServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TopListTopArtistsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TopListTopArtistsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TopListTopArtistsPageAsync].
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
        fun build(): TopListTopArtistsPageAsync =
            TopListTopArtistsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopListTopArtistsPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TopListTopArtistsPageAsync{service=$service, params=$params, response=$response}"
}
