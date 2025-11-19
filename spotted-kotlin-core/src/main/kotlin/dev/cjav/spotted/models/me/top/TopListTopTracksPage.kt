// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.top

import dev.cjav.spotted.core.AutoPager
import dev.cjav.spotted.core.Page
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.models.TrackObject
import dev.cjav.spotted.services.blocking.me.TopService
import java.util.Objects

/** @see TopService.listTopTracks */
class TopListTopTracksPage
private constructor(
    private val service: TopService,
    private val params: TopListTopTracksParams,
    private val response: TopListTopTracksPageResponse,
) : Page<TrackObject> {

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

    override fun nextPage(): TopListTopTracksPage = service.listTopTracks(nextPageParams())

    fun autoPager(): AutoPager<TrackObject> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TopListTopTracksParams = params

    /** The response that this page was parsed from. */
    fun response(): TopListTopTracksPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TopListTopTracksPage].
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

    /** A builder for [TopListTopTracksPage]. */
    class Builder internal constructor() {

        private var service: TopService? = null
        private var params: TopListTopTracksParams? = null
        private var response: TopListTopTracksPageResponse? = null

        internal fun from(topListTopTracksPage: TopListTopTracksPage) = apply {
            service = topListTopTracksPage.service
            params = topListTopTracksPage.params
            response = topListTopTracksPage.response
        }

        fun service(service: TopService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TopListTopTracksParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TopListTopTracksPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TopListTopTracksPage].
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
        fun build(): TopListTopTracksPage =
            TopListTopTracksPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopListTopTracksPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TopListTopTracksPage{service=$service, params=$params, response=$response}"
}
