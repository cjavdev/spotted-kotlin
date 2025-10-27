// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.tracks

import com.spotted.api.core.AutoPager
import com.spotted.api.core.Page
import com.spotted.api.core.checkRequired
import com.spotted.api.services.blocking.me.TrackService
import java.util.Objects

/** @see TrackService.list */
class TrackListPage
private constructor(
    private val service: TrackService,
    private val params: TrackListParams,
    private val response: TrackListPageResponse,
) : Page<TrackListResponse> {

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

    override fun nextPage(): TrackListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TrackListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TrackListParams = params

    /** The response that this page was parsed from. */
    fun response(): TrackListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrackListPage].
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

    /** A builder for [TrackListPage]. */
    class Builder internal constructor() {

        private var service: TrackService? = null
        private var params: TrackListParams? = null
        private var response: TrackListPageResponse? = null

        internal fun from(trackListPage: TrackListPage) = apply {
            service = trackListPage.service
            params = trackListPage.params
            response = trackListPage.response
        }

        fun service(service: TrackService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TrackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TrackListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TrackListPage].
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
        fun build(): TrackListPage =
            TrackListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "TrackListPage{service=$service, params=$params, response=$response}"
}
