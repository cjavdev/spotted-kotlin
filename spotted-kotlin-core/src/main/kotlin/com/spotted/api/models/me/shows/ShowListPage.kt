// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.shows

import com.spotted.api.core.AutoPager
import com.spotted.api.core.Page
import com.spotted.api.core.checkRequired
import com.spotted.api.services.blocking.me.ShowService
import java.util.Objects

/** @see ShowService.list */
class ShowListPage
private constructor(
    private val service: ShowService,
    private val params: ShowListParams,
    private val response: ShowListPageResponse,
) : Page<ShowListResponse> {

    /**
     * Delegates to [ShowListPageResponse], but gracefully handles missing data.
     *
     * @see ShowListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [ShowListPageResponse], but gracefully handles missing data.
     *
     * @see ShowListPageResponse.items
     */
    override fun items(): List<ShowListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ShowListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): ShowListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ShowListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ShowListParams = params

    /** The response that this page was parsed from. */
    fun response(): ShowListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShowListPage].
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

    /** A builder for [ShowListPage]. */
    class Builder internal constructor() {

        private var service: ShowService? = null
        private var params: ShowListParams? = null
        private var response: ShowListPageResponse? = null

        internal fun from(showListPage: ShowListPage) = apply {
            service = showListPage.service
            params = showListPage.params
            response = showListPage.response
        }

        fun service(service: ShowService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ShowListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ShowListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ShowListPage].
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
        fun build(): ShowListPage =
            ShowListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShowListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ShowListPage{service=$service, params=$params, response=$response}"
}
