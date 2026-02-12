// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.albums.AlbumCheckParams
import dev.cjav.spotted.models.me.albums.AlbumListPage
import dev.cjav.spotted.models.me.albums.AlbumListParams
import dev.cjav.spotted.models.me.albums.AlbumRemoveParams
import dev.cjav.spotted.models.me.albums.AlbumSaveParams

interface AlbumService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlbumService

    /** Get a list of the albums saved in the current Spotify user's 'Your Music' library. */
    fun list(
        params: AlbumListParams = AlbumListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlbumListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): AlbumListPage =
        list(AlbumListParams.none(), requestOptions)

    /**
     * Check if one or more albums is already saved in the current Spotify user's 'Your Music'
     * library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Check User's Saved Items](/documentation/web-api/reference/check-library-contains) instead.
     */
    @Deprecated("deprecated")
    fun check(
        params: AlbumCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Boolean>

    /**
     * Remove one or more albums from the current user's 'Your Music' library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Remove Items from Library](/documentation/web-api/reference/remove-library-items) instead.
     */
    @Deprecated("deprecated")
    fun remove(
        params: AlbumRemoveParams = AlbumRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(requestOptions: RequestOptions) = remove(AlbumRemoveParams.none(), requestOptions)

    /**
     * Save one or more albums to the current user's 'Your Music' library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Save Items to Library](/documentation/web-api/reference/save-library-items) instead.
     */
    @Deprecated("deprecated")
    fun save(
        params: AlbumSaveParams = AlbumSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see save */
    @Deprecated("deprecated")
    fun save(requestOptions: RequestOptions) = save(AlbumSaveParams.none(), requestOptions)

    /** A view of [AlbumService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlbumService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/albums`, but is otherwise the same as
         * [AlbumService.list].
         */
        @MustBeClosed
        fun list(
            params: AlbumListParams = AlbumListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlbumListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AlbumListPage> =
            list(AlbumListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/albums/contains`, but is otherwise the same as
         * [AlbumService.check].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun check(
            params: AlbumCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Boolean>>

        /**
         * Returns a raw HTTP response for `delete /me/albums`, but is otherwise the same as
         * [AlbumService.remove].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(
            params: AlbumRemoveParams = AlbumRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see remove */
        @Deprecated("deprecated")
        @MustBeClosed
        fun remove(requestOptions: RequestOptions): HttpResponse =
            remove(AlbumRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/albums`, but is otherwise the same as
         * [AlbumService.save].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun save(
            params: AlbumSaveParams = AlbumSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see save */
        @Deprecated("deprecated")
        @MustBeClosed
        fun save(requestOptions: RequestOptions): HttpResponse =
            save(AlbumSaveParams.none(), requestOptions)
    }
}
