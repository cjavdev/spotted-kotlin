// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.albums

import dev.cjav.spotted.core.AutoPager
import dev.cjav.spotted.core.Page
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.models.SimplifiedTrackObject
import dev.cjav.spotted.services.blocking.AlbumService
import java.util.Objects

/** @see AlbumService.listTracks */
class AlbumListTracksPage
private constructor(
    private val service: AlbumService,
    private val params: AlbumListTracksParams,
    private val response: AlbumListTracksPageResponse,
) : Page<SimplifiedTrackObject> {

    /**
     * Delegates to [AlbumListTracksPageResponse], but gracefully handles missing data.
     *
     * @see AlbumListTracksPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [AlbumListTracksPageResponse], but gracefully handles missing data.
     *
     * @see AlbumListTracksPageResponse.items
     */
    override fun items(): List<SimplifiedTrackObject> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AlbumListTracksParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): AlbumListTracksPage = service.listTracks(nextPageParams())

    fun autoPager(): AutoPager<SimplifiedTrackObject> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AlbumListTracksParams = params

    /** The response that this page was parsed from. */
    fun response(): AlbumListTracksPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlbumListTracksPage].
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

    /** A builder for [AlbumListTracksPage]. */
    class Builder internal constructor() {

        private var service: AlbumService? = null
        private var params: AlbumListTracksParams? = null
        private var response: AlbumListTracksPageResponse? = null

        internal fun from(albumListTracksPage: AlbumListTracksPage) = apply {
            service = albumListTracksPage.service
            params = albumListTracksPage.params
            response = albumListTracksPage.response
        }

        fun service(service: AlbumService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AlbumListTracksParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlbumListTracksPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlbumListTracksPage].
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
        fun build(): AlbumListTracksPage =
            AlbumListTracksPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlbumListTracksPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AlbumListTracksPage{service=$service, params=$params, response=$response}"
}
