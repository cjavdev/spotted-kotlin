// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.me.audiobooks

import dev.cjav.spotted.core.AutoPagerAsync
import dev.cjav.spotted.core.PageAsync
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.services.async.me.AudiobookServiceAsync
import java.util.Objects

/** @see AudiobookServiceAsync.list */
class AudiobookListPageAsync
private constructor(
    private val service: AudiobookServiceAsync,
    private val params: AudiobookListParams,
    private val response: AudiobookListPageResponse,
) : PageAsync<AudiobookListResponse> {

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

    override suspend fun nextPage(): AudiobookListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AudiobookListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AudiobookListParams = params

    /** The response that this page was parsed from. */
    fun response(): AudiobookListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AudiobookListPageAsync].
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

    /** A builder for [AudiobookListPageAsync]. */
    class Builder internal constructor() {

        private var service: AudiobookServiceAsync? = null
        private var params: AudiobookListParams? = null
        private var response: AudiobookListPageResponse? = null

        internal fun from(audiobookListPageAsync: AudiobookListPageAsync) = apply {
            service = audiobookListPageAsync.service
            params = audiobookListPageAsync.params
            response = audiobookListPageAsync.response
        }

        fun service(service: AudiobookServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AudiobookListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AudiobookListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AudiobookListPageAsync].
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
        fun build(): AudiobookListPageAsync =
            AudiobookListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudiobookListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AudiobookListPageAsync{service=$service, params=$params, response=$response}"
}
