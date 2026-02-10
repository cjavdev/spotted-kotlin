// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models.artists

import dev.cjav.spotted.core.AutoPager
import dev.cjav.spotted.core.Page
import dev.cjav.spotted.core.checkRequired
import dev.cjav.spotted.services.blocking.ArtistService
import java.util.Objects

/** @see ArtistService.listAlbums */
class ArtistListAlbumsPage
private constructor(
    private val service: ArtistService,
    private val params: ArtistListAlbumsParams,
    private val response: ArtistListAlbumsPageResponse,
) : Page<ArtistListAlbumsResponse> {

    /**
     * Delegates to [ArtistListAlbumsPageResponse], but gracefully handles missing data.
     *
     * @see ArtistListAlbumsPageResponse.next
     */
    fun next(): String? = response._next().getNullable("next")

    /**
     * Delegates to [ArtistListAlbumsPageResponse], but gracefully handles missing data.
     *
     * @see ArtistListAlbumsPageResponse.items
     */
    override fun items(): List<ArtistListAlbumsResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ArtistListAlbumsParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): ArtistListAlbumsPage = service.listAlbums(nextPageParams())

    fun autoPager(): AutoPager<ArtistListAlbumsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ArtistListAlbumsParams = params

    /** The response that this page was parsed from. */
    fun response(): ArtistListAlbumsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ArtistListAlbumsPage].
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

    /** A builder for [ArtistListAlbumsPage]. */
    class Builder internal constructor() {

        private var service: ArtistService? = null
        private var params: ArtistListAlbumsParams? = null
        private var response: ArtistListAlbumsPageResponse? = null

        internal fun from(artistListAlbumsPage: ArtistListAlbumsPage) = apply {
            service = artistListAlbumsPage.service
            params = artistListAlbumsPage.params
            response = artistListAlbumsPage.response
        }

        fun service(service: ArtistService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ArtistListAlbumsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ArtistListAlbumsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ArtistListAlbumsPage].
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
        fun build(): ArtistListAlbumsPage =
            ArtistListAlbumsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ArtistListAlbumsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ArtistListAlbumsPage{service=$service, params=$params, response=$response}"
}
