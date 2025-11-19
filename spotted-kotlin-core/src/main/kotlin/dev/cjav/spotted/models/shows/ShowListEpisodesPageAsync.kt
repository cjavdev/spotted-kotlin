// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.shows

import dev.cjav.spotted.core.AutoPagerAsync
import dev.cjav.spotted.core.PageAsync
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.models.SimplifiedEpisodeObject
import dev.cjav.spotted.services.async.ShowServiceAsync
import java.util.Objects

/** @see ShowServiceAsync.listEpisodes */
class ShowListEpisodesPageAsync
private constructor(
    private val service: ShowServiceAsync,
    private val params: ShowListEpisodesParams,
    private val response: ShowListEpisodesPageResponse,
) : PageAsync<SimplifiedEpisodeObject> {

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

    override suspend fun nextPage(): ShowListEpisodesPageAsync =
        service.listEpisodes(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimplifiedEpisodeObject> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ShowListEpisodesParams = params

    /** The response that this page was parsed from. */
    fun response(): ShowListEpisodesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShowListEpisodesPageAsync].
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

    /** A builder for [ShowListEpisodesPageAsync]. */
    class Builder internal constructor() {

        private var service: ShowServiceAsync? = null
        private var params: ShowListEpisodesParams? = null
        private var response: ShowListEpisodesPageResponse? = null

        internal fun from(showListEpisodesPageAsync: ShowListEpisodesPageAsync) = apply {
            service = showListEpisodesPageAsync.service
            params = showListEpisodesPageAsync.params
            response = showListEpisodesPageAsync.response
        }

        fun service(service: ShowServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ShowListEpisodesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ShowListEpisodesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ShowListEpisodesPageAsync].
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
        fun build(): ShowListEpisodesPageAsync =
            ShowListEpisodesPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShowListEpisodesPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ShowListEpisodesPageAsync{service=$service, params=$params, response=$response}"
}
