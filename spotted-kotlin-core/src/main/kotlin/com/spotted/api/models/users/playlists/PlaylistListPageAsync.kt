// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.users.playlists

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.models.PagingPlaylistObject
import com.spotted.api.models.SimplifiedPlaylistObject
import com.spotted.api.services.async.users.PlaylistServiceAsync
import java.util.Objects

/** @see PlaylistServiceAsync.list */
class PlaylistListPageAsync
private constructor(
    private val service: PlaylistServiceAsync,
    private val params: PlaylistListParams,
    private val response: PagingPlaylistObject,
) : PageAsync<SimplifiedPlaylistObject> {

    /**
     * Delegates to [PagingPlaylistObject], but gracefully handles missing data.
     *
     * @see PagingPlaylistObject.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [PagingPlaylistObject], but gracefully handles missing data.
     *
     * @see PagingPlaylistObject.items
     */
    override fun items(): List<SimplifiedPlaylistObject> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PlaylistListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): PlaylistListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimplifiedPlaylistObject> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlaylistListParams = params

    /** The response that this page was parsed from. */
    fun response(): PagingPlaylistObject = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlaylistListPageAsync].
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

    /** A builder for [PlaylistListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlaylistServiceAsync? = null
        private var params: PlaylistListParams? = null
        private var response: PagingPlaylistObject? = null

        internal fun from(playlistListPageAsync: PlaylistListPageAsync) = apply {
            service = playlistListPageAsync.service
            params = playlistListPageAsync.params
            response = playlistListPageAsync.response
        }

        fun service(service: PlaylistServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlaylistListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PagingPlaylistObject) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlaylistListPageAsync].
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
        fun build(): PlaylistListPageAsync =
            PlaylistListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlaylistListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlaylistListPageAsync{service=$service, params=$params, response=$response}"
}
