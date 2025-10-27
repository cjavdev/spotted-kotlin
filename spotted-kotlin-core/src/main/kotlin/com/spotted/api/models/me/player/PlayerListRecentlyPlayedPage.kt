// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.player

import com.spotted.api.core.AutoPager
import com.spotted.api.core.Page
import com.spotted.api.core.checkRequired
import com.spotted.api.services.blocking.me.PlayerService
import java.util.Objects

/** @see PlayerService.listRecentlyPlayed */
class PlayerListRecentlyPlayedPage
private constructor(
    private val service: PlayerService,
    private val params: PlayerListRecentlyPlayedParams,
    private val response: PlayerListRecentlyPlayedPageResponse,
) : Page<PlayerListRecentlyPlayedResponse> {

    /**
     * Delegates to [PlayerListRecentlyPlayedPageResponse], but gracefully handles missing data.
     *
     * @see PlayerListRecentlyPlayedPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [PlayerListRecentlyPlayedPageResponse], but gracefully handles missing data.
     *
     * @see PlayerListRecentlyPlayedPageResponse.items
     */
    override fun items(): List<PlayerListRecentlyPlayedResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PlayerListRecentlyPlayedParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): PlayerListRecentlyPlayedPage =
        service.listRecentlyPlayed(nextPageParams())

    fun autoPager(): AutoPager<PlayerListRecentlyPlayedResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlayerListRecentlyPlayedParams = params

    /** The response that this page was parsed from. */
    fun response(): PlayerListRecentlyPlayedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlayerListRecentlyPlayedPage].
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

    /** A builder for [PlayerListRecentlyPlayedPage]. */
    class Builder internal constructor() {

        private var service: PlayerService? = null
        private var params: PlayerListRecentlyPlayedParams? = null
        private var response: PlayerListRecentlyPlayedPageResponse? = null

        internal fun from(playerListRecentlyPlayedPage: PlayerListRecentlyPlayedPage) = apply {
            service = playerListRecentlyPlayedPage.service
            params = playerListRecentlyPlayedPage.params
            response = playerListRecentlyPlayedPage.response
        }

        fun service(service: PlayerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlayerListRecentlyPlayedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlayerListRecentlyPlayedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PlayerListRecentlyPlayedPage].
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
        fun build(): PlayerListRecentlyPlayedPage =
            PlayerListRecentlyPlayedPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlayerListRecentlyPlayedPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlayerListRecentlyPlayedPage{service=$service, params=$params, response=$response}"
}
