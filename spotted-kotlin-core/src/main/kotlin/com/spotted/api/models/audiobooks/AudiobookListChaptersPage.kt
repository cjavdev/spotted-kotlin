// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.audiobooks

import com.spotted.api.core.AutoPager
import com.spotted.api.core.Page
import com.spotted.api.core.checkRequired
import com.spotted.api.services.blocking.AudiobookService
import java.util.Objects

/** @see AudiobookService.listChapters */
class AudiobookListChaptersPage
private constructor(
    private val service: AudiobookService,
    private val params: AudiobookListChaptersParams,
    private val response: AudiobookListChaptersPageResponse,
) : Page<SimplifiedChapterObject> {

    /**
     * Delegates to [AudiobookListChaptersPageResponse], but gracefully handles missing data.
     *
     * @see AudiobookListChaptersPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [AudiobookListChaptersPageResponse], but gracefully handles missing data.
     *
     * @see AudiobookListChaptersPageResponse.items
     */
    override fun items(): List<SimplifiedChapterObject> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AudiobookListChaptersParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): AudiobookListChaptersPage = service.listChapters(nextPageParams())

    fun autoPager(): AutoPager<SimplifiedChapterObject> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AudiobookListChaptersParams = params

    /** The response that this page was parsed from. */
    fun response(): AudiobookListChaptersPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AudiobookListChaptersPage].
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

    /** A builder for [AudiobookListChaptersPage]. */
    class Builder internal constructor() {

        private var service: AudiobookService? = null
        private var params: AudiobookListChaptersParams? = null
        private var response: AudiobookListChaptersPageResponse? = null

        internal fun from(audiobookListChaptersPage: AudiobookListChaptersPage) = apply {
            service = audiobookListChaptersPage.service
            params = audiobookListChaptersPage.params
            response = audiobookListChaptersPage.response
        }

        fun service(service: AudiobookService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AudiobookListChaptersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AudiobookListChaptersPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AudiobookListChaptersPage].
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
        fun build(): AudiobookListChaptersPage =
            AudiobookListChaptersPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudiobookListChaptersPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AudiobookListChaptersPage{service=$service, params=$params, response=$response}"
}
