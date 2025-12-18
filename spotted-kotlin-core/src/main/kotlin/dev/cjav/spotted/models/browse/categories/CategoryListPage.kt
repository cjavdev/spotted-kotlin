// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.browse.categories

import dev.cjav.spotted.core.AutoPager
import dev.cjav.spotted.core.Page
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.services.blocking.browse.CategoryService
import java.util.Objects

/** @see CategoryService.list */
class CategoryListPage
private constructor(
    private val service: CategoryService,
    private val params: CategoryListParams,
    private val response: CategoryListPageResponse,
) : Page<CategoryListResponse> {

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

    override fun nextPage(): CategoryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CategoryListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CategoryListParams = params

    /** The response that this page was parsed from. */
    fun response(): CategoryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CategoryListPage].
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

    /** A builder for [CategoryListPage]. */
    class Builder internal constructor() {

        private var service: CategoryService? = null
        private var params: CategoryListParams? = null
        private var response: CategoryListPageResponse? = null

        internal fun from(categoryListPage: CategoryListPage) = apply {
            service = categoryListPage.service
            params = categoryListPage.params
            response = categoryListPage.response
        }

        fun service(service: CategoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CategoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CategoryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CategoryListPage].
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
        fun build(): CategoryListPage =
            CategoryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CategoryListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CategoryListPage{service=$service, params=$params, response=$response}"
}
