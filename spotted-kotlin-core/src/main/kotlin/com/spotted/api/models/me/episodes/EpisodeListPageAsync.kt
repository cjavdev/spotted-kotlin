// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.episodes

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.services.async.me.EpisodeServiceAsync
import java.util.Objects

/** @see EpisodeServiceAsync.list */
class EpisodeListPageAsync
private constructor(
    private val service: EpisodeServiceAsync,
    private val params: EpisodeListParams,
    private val response: EpisodeListPageResponse,
) : PageAsync<EpisodeListResponse> {

    /**
     * Delegates to [EpisodeListPageResponse], but gracefully handles missing data.
     *
     * @see EpisodeListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [EpisodeListPageResponse], but gracefully handles missing data.
     *
     * @see EpisodeListPageResponse.items
     */
    override fun items(): List<EpisodeListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EpisodeListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): EpisodeListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EpisodeListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EpisodeListParams = params

    /** The response that this page was parsed from. */
    fun response(): EpisodeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EpisodeListPageAsync].
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

    /** A builder for [EpisodeListPageAsync]. */
    class Builder internal constructor() {

        private var service: EpisodeServiceAsync? = null
        private var params: EpisodeListParams? = null
        private var response: EpisodeListPageResponse? = null

        internal fun from(episodeListPageAsync: EpisodeListPageAsync) = apply {
            service = episodeListPageAsync.service
            params = episodeListPageAsync.params
            response = episodeListPageAsync.response
        }

        fun service(service: EpisodeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EpisodeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EpisodeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EpisodeListPageAsync].
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
        fun build(): EpisodeListPageAsync =
            EpisodeListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EpisodeListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EpisodeListPageAsync{service=$service, params=$params, response=$response}"
}
