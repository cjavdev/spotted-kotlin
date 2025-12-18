// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.browse.categories

import dev.cjav.spotted.core.AutoPagerAsync
import dev.cjav.spotted.core.PageAsync
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.services.async.browse.CategoryServiceAsync
import java.util.Objects

/** @see CategoryServiceAsync.list */
class CategoryListPageAsync
private constructor(
    private val service: CategoryServiceAsync,
    private val params: CategoryListParams,
    private val response: CategoryListPageResponse,
) : PageAsync<CategoryListResponse> {

    /**
     * Delegates to [CategoryListPageResponse], but gracefully handles missing data.
     *
     * @see CategoryListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [CategoryListPageResponse], but gracefully handles missing data.
     *
     * @see CategoryListPageResponse.items
     */
    override fun items(): List<CategoryListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CategoryListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): CategoryListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CategoryListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CategoryListParams = params

    /** The response that this page was parsed from. */
    fun response(): CategoryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CategoryListPageAsync].
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

    /** A builder for [CategoryListPageAsync]. */
    class Builder internal constructor() {

        private var service: CategoryServiceAsync? = null
        private var params: CategoryListParams? = null
        private var response: CategoryListPageResponse? = null

        internal fun from(categoryListPageAsync: CategoryListPageAsync) = apply {
            service = categoryListPageAsync.service
            params = categoryListPageAsync.params
            response = categoryListPageAsync.response
        }

        fun service(service: CategoryServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CategoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CategoryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CategoryListPageAsync].
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
        fun build(): CategoryListPageAsync =
            CategoryListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CategoryListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CategoryListPageAsync{service=$service, params=$params, response=$response}"
}
