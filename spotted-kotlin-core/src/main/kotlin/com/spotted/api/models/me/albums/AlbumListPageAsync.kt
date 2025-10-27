// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.albums

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.services.async.me.AlbumServiceAsync
import java.util.Objects

/** @see AlbumServiceAsync.list */
class AlbumListPageAsync
private constructor(
    private val service: AlbumServiceAsync,
    private val params: AlbumListParams,
    private val response: AlbumListPageResponse,
) : PageAsync<AlbumListResponse> {

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

    override suspend fun nextPage(): AlbumListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AlbumListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AlbumListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlbumListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlbumListPageAsync].
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

    /** A builder for [AlbumListPageAsync]. */
    class Builder internal constructor() {

        private var service: AlbumServiceAsync? = null
        private var params: AlbumListParams? = null
        private var response: AlbumListPageResponse? = null

        internal fun from(albumListPageAsync: AlbumListPageAsync) = apply {
            service = albumListPageAsync.service
            params = albumListPageAsync.params
            response = albumListPageAsync.response
        }

        fun service(service: AlbumServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AlbumListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlbumListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlbumListPageAsync].
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
        fun build(): AlbumListPageAsync =
            AlbumListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlbumListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AlbumListPageAsync{service=$service, params=$params, response=$response}"
}
