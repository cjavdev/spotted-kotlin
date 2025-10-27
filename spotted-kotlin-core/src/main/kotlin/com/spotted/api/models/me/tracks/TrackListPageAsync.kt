// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.tracks

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.services.async.me.TrackServiceAsync
import java.util.Objects

/** @see TrackServiceAsync.list */
class TrackListPageAsync
private constructor(
    private val service: TrackServiceAsync,
    private val params: TrackListParams,
    private val response: TrackListPageResponse,
) : PageAsync<TrackListResponse> {

    /**
     * Delegates to [TrackListPageResponse], but gracefully handles missing data.
     *
     * @see TrackListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [TrackListPageResponse], but gracefully handles missing data.
     *
     * @see TrackListPageResponse.items
     */
    override fun items(): List<TrackListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TrackListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): TrackListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TrackListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TrackListParams = params

    /** The response that this page was parsed from. */
    fun response(): TrackListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackListPageAsync].
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

    /** A builder for [TrackListPageAsync]. */
    class Builder internal constructor() {

        private var service: TrackServiceAsync? = null
        private var params: TrackListParams? = null
        private var response: TrackListPageResponse? = null

        internal fun from(trackListPageAsync: TrackListPageAsync) = apply {
            service = trackListPageAsync.service
            params = trackListPageAsync.params
            response = trackListPageAsync.response
        }

        fun service(service: TrackServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TrackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TrackListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TrackListPageAsync].
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
        fun build(): TrackListPageAsync =
            TrackListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TrackListPageAsync{service=$service, params=$params, response=$response}"
}
