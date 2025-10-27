// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.albums

import com.spotted.api.core.AutoPager
import com.spotted.api.core.Page
import com.spotted.api.core.checkRequired
import com.spotted.api.services.blocking.me.AlbumService
import java.util.Objects

/** @see AlbumService.list */
class AlbumListPage
private constructor(
    private val service: AlbumService,
    private val params: AlbumListParams,
    private val response: AlbumListPageResponse,
) : Page<AlbumListResponse> {

    /**
     * Delegates to [AlbumListPageResponse], but gracefully handles missing data.
     *
     * @see AlbumListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [AlbumListPageResponse], but gracefully handles missing data.
     *
     * @see AlbumListPageResponse.items
     */
    override fun items(): List<AlbumListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AlbumListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): AlbumListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AlbumListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AlbumListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlbumListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlbumListPage].
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

    /** A builder for [AlbumListPage]. */
    class Builder internal constructor() {

        private var service: AlbumService? = null
        private var params: AlbumListParams? = null
        private var response: AlbumListPageResponse? = null

        internal fun from(albumListPage: AlbumListPage) = apply {
            service = albumListPage.service
            params = albumListPage.params
            response = albumListPage.response
        }

        fun service(service: AlbumService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AlbumListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlbumListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlbumListPage].
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
        fun build(): AlbumListPage =
            AlbumListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlbumListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "AlbumListPage{service=$service, params=$params, response=$response}"
}
