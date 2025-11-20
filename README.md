# Spotted Kotlin API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/dev.cjav.spotted/spotted-kotlin)](https://central.sonatype.com/artifact/dev.cjav.spotted/spotted-kotlin/0.1.0)
[![javadoc](https://javadoc.io/badge2/dev.cjav.spotted/spotted-kotlin/0.1.0/javadoc.svg)](https://javadoc.io/doc/dev.cjav.spotted/spotted-kotlin/0.1.0)

<!-- x-release-please-end -->

The Spotted Kotlin SDK provides convenient access to the [Spotted REST API](https://spotted.stldocs.com) from applications written in Kotlin.

The Spotted Kotlin SDK is similar to the Spotted Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

It is generated with [Stainless](https://www.stainless.com/).

<!-- x-release-please-start-version -->

The REST API documentation can be found on [spotted.stldocs.com](https://spotted.stldocs.com). KDocs are available on [javadoc.io](https://javadoc.io/doc/dev.cjav.spotted/spotted-kotlin/0.1.0).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("dev.cjav.spotted:spotted-kotlin:0.1.0")
```

### Maven

```xml
<dependency>
  <groupId>dev.cjav.spotted</groupId>
  <artifactId>spotted-kotlin</artifactId>
  <version>0.1.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.albums.AlbumRetrieveParams
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse

// Configures using the `spotted.spotifyClientId`, `spotted.spotifyClientSecret`, `spotted.spotifyAccessToken` and `spotted.baseUrl` system properties
// Or configures using the `SPOTIFY_CLIENT_ID`, `SPOTIFY_CLIENT_SECRET`, `SPOTIFY_ACCESS_TOKEN` and `SPOTTED_BASE_URL` environment variables
val client: SpottedClient = SpottedOkHttpClient.fromEnv()

val album: AlbumRetrieveResponse = client.albums().retrieve("4aawyAB9vmqN3uQ7FjRGTy")
```

## Client configuration

Configure the client using system properties or environment variables:

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient

// Configures using the `spotted.spotifyClientId`, `spotted.spotifyClientSecret`, `spotted.spotifyAccessToken` and `spotted.baseUrl` system properties
// Or configures using the `SPOTIFY_CLIENT_ID`, `SPOTIFY_CLIENT_SECRET`, `SPOTIFY_ACCESS_TOKEN` and `SPOTTED_BASE_URL` environment variables
val client: SpottedClient = SpottedOkHttpClient.fromEnv()
```

Or manually:

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient

val client: SpottedClient = SpottedOkHttpClient.builder()
    .clientId("My Client ID")
    .clientSecret("My Client Secret")
    .build()
```

Or using a combination of the two approaches:

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient

val client: SpottedClient = SpottedOkHttpClient.builder()
    // Configures using the `spotted.spotifyClientId`, `spotted.spotifyClientSecret`, `spotted.spotifyAccessToken` and `spotted.baseUrl` system properties
    // Or configures using the `SPOTIFY_CLIENT_ID`, `SPOTIFY_CLIENT_SECRET`, `SPOTIFY_ACCESS_TOKEN` and `SPOTTED_BASE_URL` environment variables
    .fromEnv()
    .clientId("My Client ID")
    .build()
```

See this table for the available options:

| Setter         | System property               | Environment variable    | Required | Default value                  |
| -------------- | ----------------------------- | ----------------------- | -------- | ------------------------------ |
| `clientId`     | `spotted.spotifyClientId`     | `SPOTIFY_CLIENT_ID`     | false    | -                              |
| `clientSecret` | `spotted.spotifyClientSecret` | `SPOTIFY_CLIENT_SECRET` | false    | -                              |
| `accessToken`  | `spotted.spotifyAccessToken`  | `SPOTIFY_ACCESS_TOKEN`  | false    | -                              |
| `baseUrl`      | `spotted.baseUrl`             | `SPOTTED_BASE_URL`      | true     | `"https://api.spotify.com/v1"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```kotlin
import dev.cjav.spotted.client.SpottedClient

val clientWithOptions: SpottedClient = client.withOptions {
    it.baseUrl("https://example.com")
    it.maxRetries(42)
}
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Spotted API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Kotlin class.

For example, `client.albums().retrieve(...)` should be called with an instance of `AlbumRetrieveParams`, and it will return an instance of `AlbumRetrieveResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import dev.cjav.spotted.models.albums.AlbumRetrieveParams
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse

// Configures using the `spotted.spotifyClientId`, `spotted.spotifyClientSecret`, `spotted.spotifyAccessToken` and `spotted.baseUrl` system properties
// Or configures using the `SPOTIFY_CLIENT_ID`, `SPOTIFY_CLIENT_SECRET`, `SPOTIFY_ACCESS_TOKEN` and `SPOTTED_BASE_URL` environment variables
val client: SpottedClient = SpottedOkHttpClient.fromEnv()

val album: AlbumRetrieveResponse = client.async().albums().retrieve("4aawyAB9vmqN3uQ7FjRGTy")
```

Or create an asynchronous client from the beginning:

```kotlin
import dev.cjav.spotted.client.SpottedClientAsync
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.albums.AlbumRetrieveParams
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse

// Configures using the `spotted.spotifyClientId`, `spotted.spotifyClientSecret`, `spotted.spotifyAccessToken` and `spotted.baseUrl` system properties
// Or configures using the `SPOTIFY_CLIENT_ID`, `SPOTIFY_CLIENT_SECRET`, `SPOTIFY_ACCESS_TOKEN` and `SPOTTED_BASE_URL` environment variables
val client: SpottedClientAsync = SpottedOkHttpClientAsync.fromEnv()

val album: AlbumRetrieveResponse = client.albums().retrieve("4aawyAB9vmqN3uQ7FjRGTy")
```

The asynchronous client supports the same options as the synchronous one, except most methods are [suspending](https://kotlinlang.org/docs/coroutines-guide.html).

## Binary responses

The SDK defines methods that return binary responses, which are used for API responses that shouldn't necessarily be parsed, like non-JSON data.

These methods return [`HttpResponse`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/core/http/HttpResponse.kt):

```kotlin
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.models.playlists.images.ImageUpdateParams

val image: HttpResponse = client.playlists().images().update(
  "3cEYpjA9oz9GiPac4AsH4n", "some content"
)
```

To save the response content to a file, use the [`Files.copy(...)`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#copy-java.io.InputStream-java.nio.file.Path-java.nio.file.CopyOption...-) method:

```kotlin
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

client.playlists().images().update(params).use {
    Files.copy(
        it.body(),
        Paths.get(path),
        StandardCopyOption.REPLACE_EXISTING
    )
}
```

Or transfer the response content to any [`OutputStream`](https://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html):

```kotlin
import java.nio.file.Files
import java.nio.file.Paths

client.playlists().images().update(params).use {
    it.body().transferTo(Files.newOutputStream(Paths.get(path)))
}
```

## Raw responses

The SDK defines methods that deserialize responses into instances of Kotlin classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```kotlin
import dev.cjav.spotted.core.http.Headers
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.albums.AlbumRetrieveParams
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse

val album: HttpResponseFor<AlbumRetrieveResponse> = client.albums().withRawResponse().retrieve("4aawyAB9vmqN3uQ7FjRGTy")

val statusCode: Int = album.statusCode()
val headers: Headers = album.headers()
```

You can still deserialize the response into an instance of a Kotlin class if needed:

```kotlin
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse

val parsedAlbum: AlbumRetrieveResponse = album.parse()
```

## Error handling

The SDK throws custom unchecked exception types:

- [`SpottedServiceException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/SpottedServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                       |
  | ------ | ------------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/UnexpectedStatusCodeException.kt) |

- [`SpottedIoException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/SpottedIoException.kt): I/O networking errors.

- [`SpottedRetryableException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/SpottedRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`SpottedInvalidDataException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/SpottedInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`SpottedException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/SpottedException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

The SDK defines methods that return a paginated lists of results. It provides convenient ways to access the results either one page at a time or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, use the `autoPager()` method, which automatically fetches more pages as needed.

When using the synchronous client, the method returns a [`Sequence`](https://kotlinlang.org/docs/sequences.html)

```kotlin
import dev.cjav.spotted.models.shows.ShowListEpisodesPage

val page: ShowListEpisodesPage = client.shows().listEpisodes()
page.autoPager()
    .take(50)
    .forEach { show -> println(show) }
```

When using the asynchronous client, the method returns a [`Flow`](https://kotlinlang.org/docs/flow.html):

```kotlin
import dev.cjav.spotted.models.shows.ShowListEpisodesPageAsync

val page: ShowListEpisodesPageAsync = client.async().shows().listEpisodes()
page.autoPager()
    .take(50)
    .forEach { show -> println(show) }
```

### Manual pagination

To access individual page items and manually request the next page, use the `items()`,
`hasNextPage()`, and `nextPage()` methods:

```kotlin
import dev.cjav.spotted.models.SimplifiedEpisodeObject
import dev.cjav.spotted.models.shows.ShowListEpisodesPage

val page: ShowListEpisodesPage = client.shows().listEpisodes()
while (true) {
    for (show in page.items()) {
        println(show)
    }

    if (!page.hasNextPage()) {
        break
    }

    page = page.nextPage()
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `SPOTTED_LOG` environment variable to `info`:

```sh
$ export SPOTTED_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export SPOTTED_LOG=debug
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `spotted-kotlin-core` is published with a [configuration file](spotted-kotlin-core/src/main/resources/META-INF/proguard/spotted-kotlin-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`SpottedOkHttpClient`](spotted-kotlin-client-okhttp/src/main/kotlin/dev/cjav/spotted/client/okhttp/SpottedOkHttpClient.kt) or [`SpottedOkHttpClientAsync`](spotted-kotlin-client-okhttp/src/main/kotlin/dev/cjav/spotted/client/okhttp/SpottedOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

To set a custom number of retries, configure the client using the `maxRetries` method:

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient

val client: SpottedClient = SpottedOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```kotlin
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse

val album: AlbumRetrieveResponse = client.albums().retrieve(RequestOptions.builder().timeout(Duration.ofSeconds(30)).build())
```

Or configure the default for all method calls at the client level:

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import java.time.Duration

val client: SpottedClient = SpottedOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: SpottedClient = SpottedOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(
      Proxy.Type.HTTP, InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build()
```

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient

val client: SpottedClient = SpottedOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build()
```

### Custom HTTP client

The SDK consists of three artifacts:

- `spotted-kotlin-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`SpottedClient`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClient.kt), [`SpottedClientAsync`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClientAsync.kt), [`SpottedClientImpl`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClientImpl.kt), and [`SpottedClientAsyncImpl`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClientAsyncImpl.kt), all of which can work with any HTTP client
- `spotted-kotlin-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`SpottedOkHttpClient`](spotted-kotlin-client-okhttp/src/main/kotlin/dev/cjav/spotted/client/okhttp/SpottedOkHttpClient.kt) and [`SpottedOkHttpClientAsync`](spotted-kotlin-client-okhttp/src/main/kotlin/dev/cjav/spotted/client/okhttp/SpottedOkHttpClientAsync.kt), which provide a way to construct [`SpottedClientImpl`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClientImpl.kt) and [`SpottedClientAsyncImpl`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClientAsyncImpl.kt), respectively, using OkHttp
- `spotted-kotlin`
  - Depends on and exposes the APIs of both `spotted-kotlin-core` and `spotted-kotlin-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`spotted-kotlin` dependency](#installation) with `spotted-kotlin-core`
2. Copy `spotted-kotlin-client-okhttp`'s [`OkHttpClient`](spotted-kotlin-client-okhttp/src/main/kotlin/dev/cjav/spotted/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`SpottedClientImpl`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClientImpl.kt) or [`SpottedClientAsyncImpl`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClientAsyncImpl.kt), similarly to [`SpottedOkHttpClient`](spotted-kotlin-client-okhttp/src/main/kotlin/dev/cjav/spotted/client/okhttp/SpottedOkHttpClient.kt) or [`SpottedOkHttpClientAsync`](spotted-kotlin-client-okhttp/src/main/kotlin/dev/cjav/spotted/client/okhttp/SpottedOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`spotted-kotlin` dependency](#installation) with `spotted-kotlin-core`
2. Write a class that implements the [`HttpClient`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/core/http/HttpClient.kt) interface
3. Construct [`SpottedClientImpl`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClientImpl.kt) or [`SpottedClientAsyncImpl`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/client/SpottedClientAsyncImpl.kt), similarly to [`SpottedOkHttpClient`](spotted-kotlin-client-okhttp/src/main/kotlin/dev/cjav/spotted/client/okhttp/SpottedOkHttpClient.kt) or [`SpottedOkHttpClientAsync`](spotted-kotlin-client-okhttp/src/main/kotlin/dev/cjav/spotted/client/okhttp/SpottedOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```kotlin
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.models.albums.AlbumRetrieveParams

val params: AlbumRetrieveParams = AlbumRetrieveParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/core/Values.kt) object to its setter:

```kotlin
import dev.cjav.spotted.models.albums.AlbumRetrieveParams

val params: AlbumRetrieveParams = AlbumRetrieveParams.builder().build()
```

The most straightforward way to create a [`JsonValue`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/core/Values.kt) is using its `from(...)` method:

```kotlin
import dev.cjav.spotted.core.JsonValue

// Create primitive JSON values
val nullValue: JsonValue = JsonValue.from(null)
val booleanValue: JsonValue = JsonValue.from(true)
val numberValue: JsonValue = JsonValue.from(42)
val stringValue: JsonValue = JsonValue.from("Hello World!")

// Create a JSON array value equivalent to `["Hello", "World"]`
val arrayValue: JsonValue = JsonValue.from(listOf(
  "Hello", "World"
))

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
val objectValue: JsonValue = JsonValue.from(mapOf(
  "a" to 1, "b" to 2
))

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
val complexValue: JsonValue = JsonValue.from(mapOf(
  "a" to listOf(
    1, 2
  ), "b" to listOf(
    3, 4
  )
))
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/core/Values.kt):

```kotlin
import dev.cjav.spotted.core.JsonMissing
import dev.cjav.spotted.models.albums.AlbumRetrieveParams

val params: AlbumRetrieveParams = AlbumRetrieveParams.builder()
    .id(JsonMissing.of())
    .build()
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```kotlin
import dev.cjav.spotted.core.JsonBoolean
import dev.cjav.spotted.core.JsonNull
import dev.cjav.spotted.core.JsonNumber
import dev.cjav.spotted.core.JsonValue

val additionalProperties: Map<String, JsonValue> = client.albums().retrieve(params)._additionalProperties()
val secretPropertyValue: JsonValue = additionalProperties.get("secretProperty")

val result = when (secretPropertyValue) {
    is JsonNull -> "It's null!"
    is JsonBoolean -> "It's a boolean!"
    is JsonNumber -> "It's a number!"
    // Other types include `JsonMissing`, `JsonString`, `JsonArray`, and `JsonObject`
    else -> "It's something else!"
}
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```kotlin
import dev.cjav.spotted.core.JsonField

val field: JsonField<Any> = client.albums().retrieve(params)._field()

if (field.isMissing()) {
  // The property is absent from the JSON response
} else if (field.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  val jsonString: String? = field.asString();

  // Try to deserialize into a custom type
  val myObject: MyClass = field.asUnknown()!!.convert(MyClass::class.java)
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`SpottedInvalidDataException`](spotted-kotlin-core/src/main/kotlin/dev/cjav/spotted/errors/SpottedInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```kotlin
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse

val album: AlbumRetrieveResponse = client.albums().retrieve(params).validate()
```

Or configure the method call to validate the response using the `responseValidation` method:

```kotlin
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse

val album: AlbumRetrieveResponse = client.albums().retrieve(RequestOptions.builder().responseValidation(true).build())
```

Or configure the default for all method calls at the client level:

```kotlin
import dev.cjav.spotted.client.SpottedClient
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClient

val client: SpottedClient = SpottedOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build()
```

## FAQ

### Why don't you use plain `enum` classes?

Kotlin `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/cjavdev/spotted-kotlin/issues) with questions, bugs, or suggestions.
