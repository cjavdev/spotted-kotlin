// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.shows

import dev.cjav.spotted.core.AutoPager
import dev.cjav.spotted.core.Page
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.models.SimplifiedEpisodeObject
import dev.cjav.spotted.services.blocking.ShowService
import java.util.Objects

/** @see ShowService.listEpisodes */
class ShowListEpisodesPage
private constructor(
    private val service: ShowService,
    private val params: ShowListEpisodesParams,
    private val response: ShowListEpisodesPageResponse,
) : Page<SimplifiedEpisodeObject> {

    /**
     * Delegates to [ShowListEpisodesPageResponse], but gracefully handles missing data.
     *
     * @see ShowListEpisodesPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [ShowListEpisodesPageResponse], but gracefully handles missing data.
     *
     * @see ShowListEpisodesPageResponse.items
     */
    override fun items(): List<SimplifiedEpisodeObject> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ShowListEpisodesParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): ShowListEpisodesPage = service.listEpisodes(nextPageParams())

    fun autoPager(): AutoPager<SimplifiedEpisodeObject> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ShowListEpisodesParams = params

    /** The response that this page was parsed from. */
    fun response(): ShowListEpisodesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShowListEpisodesPage].
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

    /** A builder for [ShowListEpisodesPage]. */
    class Builder internal constructor() {

        private var service: ShowService? = null
        private var params: ShowListEpisodesParams? = null
        private var response: ShowListEpisodesPageResponse? = null

        internal fun from(showListEpisodesPage: ShowListEpisodesPage) = apply {
            service = showListEpisodesPage.service
            params = showListEpisodesPage.params
            response = showListEpisodesPage.response
        }

        fun service(service: ShowService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ShowListEpisodesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ShowListEpisodesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ShowListEpisodesPage].
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
        fun build(): ShowListEpisodesPage =
            ShowListEpisodesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShowListEpisodesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ShowListEpisodesPage{service=$service, params=$params, response=$response}"
}
