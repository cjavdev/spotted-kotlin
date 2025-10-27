// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me.audiobooks

import com.spotted.api.core.AutoPager
import com.spotted.api.core.Page
import com.spotted.api.core.checkRequired
import com.spotted.api.services.blocking.me.AudiobookService
import java.util.Objects

/** @see AudiobookService.list */
class AudiobookListPage
private constructor(
    private val service: AudiobookService,
    private val params: AudiobookListParams,
    private val response: AudiobookListPageResponse,
) : Page<AudiobookListResponse> {

    /**
     * Delegates to [AudiobookListPageResponse], but gracefully handles missing data.
     *
     * @see AudiobookListPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [AudiobookListPageResponse], but gracefully handles missing data.
     *
     * @see AudiobookListPageResponse.items
     */
    override fun items(): List<AudiobookListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AudiobookListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): AudiobookListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AudiobookListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AudiobookListParams = params

    /** The response that this page was parsed from. */
    fun response(): AudiobookListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AudiobookListPage].
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

    /** A builder for [AudiobookListPage]. */
    class Builder internal constructor() {

        private var service: AudiobookService? = null
        private var params: AudiobookListParams? = null
        private var response: AudiobookListPageResponse? = null

        internal fun from(audiobookListPage: AudiobookListPage) = apply {
            service = audiobookListPage.service
            params = audiobookListPage.params
            response = audiobookListPage.response
        }

        fun service(service: AudiobookService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AudiobookListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AudiobookListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AudiobookListPage].
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
        fun build(): AudiobookListPage =
            AudiobookListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudiobookListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AudiobookListPage{service=$service, params=$params, response=$response}"
}
