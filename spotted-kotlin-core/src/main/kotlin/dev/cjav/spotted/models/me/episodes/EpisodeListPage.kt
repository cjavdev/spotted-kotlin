// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.episodes

import dev.cjav.spotted.core.AutoPager
import dev.cjav.spotted.core.Page
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.services.blocking.me.EpisodeService
import java.util.Objects

/** @see EpisodeService.list */
class EpisodeListPage
private constructor(
    private val service: EpisodeService,
    private val params: EpisodeListParams,
    private val response: EpisodeListPageResponse,
) : Page<EpisodeListResponse> {

    /**
     * Delegates to [EpisodeListPageResponse], but gracefully handles missing data.
     *
     * @see EpisodeListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [EpisodeListPageResponse], but gracefully handles missing data.
     *
     * @see EpisodeListPageResponse.items
     */
    override fun items(): List<EpisodeListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EpisodeListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): EpisodeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EpisodeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EpisodeListParams = params

    /** The response that this page was parsed from. */
    fun response(): EpisodeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EpisodeListPage].
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

    /** A builder for [EpisodeListPage]. */
    class Builder internal constructor() {

        private var service: EpisodeService? = null
        private var params: EpisodeListParams? = null
        private var response: EpisodeListPageResponse? = null

        internal fun from(episodeListPage: EpisodeListPage) = apply {
            service = episodeListPage.service
            params = episodeListPage.params
            response = episodeListPage.response
        }

        fun service(service: EpisodeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EpisodeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EpisodeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EpisodeListPage].
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
        fun build(): EpisodeListPage =
            EpisodeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EpisodeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EpisodeListPage{service=$service, params=$params, response=$response}"
}
