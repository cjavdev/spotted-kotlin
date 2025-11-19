// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.top

import dev.cjav.spotted.core.AutoPager
import dev.cjav.spotted.core.Page
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.models.ArtistObject
import dev.cjav.spotted.services.blocking.me.TopService
import java.util.Objects

/** @see TopService.listTopArtists */
class TopListTopArtistsPage
private constructor(
    private val service: TopService,
    private val params: TopListTopArtistsParams,
    private val response: TopListTopArtistsPageResponse,
) : Page<ArtistObject> {

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

    override fun nextPage(): TopListTopArtistsPage = service.listTopArtists(nextPageParams())

    fun autoPager(): AutoPager<ArtistObject> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TopListTopArtistsParams = params

    /** The response that this page was parsed from. */
    fun response(): TopListTopArtistsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TopListTopArtistsPage].
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

    /** A builder for [TopListTopArtistsPage]. */
    class Builder internal constructor() {

        private var service: TopService? = null
        private var params: TopListTopArtistsParams? = null
        private var response: TopListTopArtistsPageResponse? = null

        internal fun from(topListTopArtistsPage: TopListTopArtistsPage) = apply {
            service = topListTopArtistsPage.service
            params = topListTopArtistsPage.params
            response = topListTopArtistsPage.response
        }

        fun service(service: TopService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TopListTopArtistsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TopListTopArtistsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TopListTopArtistsPage].
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
        fun build(): TopListTopArtistsPage =
            TopListTopArtistsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopListTopArtistsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TopListTopArtistsPage{service=$service, params=$params, response=$response}"
}
