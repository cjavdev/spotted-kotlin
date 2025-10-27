// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.top

import com.spotted.api.core.AutoPagerAsync
import com.spotted.api.core.PageAsync
import com.spotted.api.core.checkRequired
import com.spotted.api.models.TrackObject
import com.spotted.api.services.async.me.TopServiceAsync
import java.util.Objects

/** @see TopServiceAsync.listTopTracks */
class TopListTopTracksPageAsync
private constructor(
    private val service: TopServiceAsync,
    private val params: TopListTopTracksParams,
    private val response: TopListTopTracksPageResponse,
) : PageAsync<TrackObject> {

    /**
     * Delegates to [TopListTopTracksPageResponse], but gracefully handles missing data.
     *
     * @see TopListTopTracksPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [TopListTopTracksPageResponse], but gracefully handles missing data.
     *
     * @see TopListTopTracksPageResponse.items
     */
    override fun items(): List<TrackObject> = response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TopListTopTracksParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): TopListTopTracksPageAsync =
        service.listTopTracks(nextPageParams())

    fun autoPager(): AutoPagerAsync<TrackObject> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TopListTopTracksParams = params

    /** The response that this page was parsed from. */
    fun response(): TopListTopTracksPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TopListTopTracksPageAsync].
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

    /** A builder for [TopListTopTracksPageAsync]. */
    class Builder internal constructor() {

        private var service: TopServiceAsync? = null
        private var params: TopListTopTracksParams? = null
        private var response: TopListTopTracksPageResponse? = null

        internal fun from(topListTopTracksPageAsync: TopListTopTracksPageAsync) = apply {
            service = topListTopTracksPageAsync.service
            params = topListTopTracksPageAsync.params
            response = topListTopTracksPageAsync.response
        }

        fun service(service: TopServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TopListTopTracksParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TopListTopTracksPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TopListTopTracksPageAsync].
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
        fun build(): TopListTopTracksPageAsync =
            TopListTopTracksPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopListTopTracksPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TopListTopTracksPageAsync{service=$service, params=$params, response=$response}"
}
