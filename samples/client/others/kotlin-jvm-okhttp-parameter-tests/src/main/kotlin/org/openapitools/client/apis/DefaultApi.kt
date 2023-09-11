/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl


import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class DefaultApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param pathDefault path default
     * @param pathNullable path_nullable
     * @param queryDefault query default (optional, default to "available")
     * @param headerDefault header default (optional, default to "available")
     * @param cookieDefault cookie default (optional, default to "available")
     * @param queryNullable query nullable (optional)
     * @param headerNullable header nullable (optional)
     * @param cookieNullable cookie_nullable (optional)
     * @param dollarQueryDollarDollarSign query parameter with dollar sign (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun findPetsByStatus(pathDefault: kotlin.String, pathNullable: kotlin.String, queryDefault: kotlin.String? = "available", headerDefault: kotlin.String? = "available", cookieDefault: kotlin.String? = "available", queryNullable: kotlin.String? = null, headerNullable: kotlin.String? = null, cookieNullable: kotlin.String? = null, dollarQueryDollarDollarSign: kotlin.String? = null) : Unit {
        val localVarResponse = findPetsByStatusWithHttpInfo(pathDefault = pathDefault, pathNullable = pathNullable, queryDefault = queryDefault, headerDefault = headerDefault, cookieDefault = cookieDefault, queryNullable = queryNullable, headerNullable = headerNullable, cookieNullable = cookieNullable, dollarQueryDollarDollarSign = dollarQueryDollarDollarSign)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param pathDefault path default
     * @param pathNullable path_nullable
     * @param queryDefault query default (optional, default to "available")
     * @param headerDefault header default (optional, default to "available")
     * @param cookieDefault cookie default (optional, default to "available")
     * @param queryNullable query nullable (optional)
     * @param headerNullable header nullable (optional)
     * @param cookieNullable cookie_nullable (optional)
     * @param dollarQueryDollarDollarSign query parameter with dollar sign (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun findPetsByStatusWithHttpInfo(pathDefault: kotlin.String, pathNullable: kotlin.String, queryDefault: kotlin.String?, headerDefault: kotlin.String?, cookieDefault: kotlin.String?, queryNullable: kotlin.String?, headerNullable: kotlin.String?, cookieNullable: kotlin.String?, dollarQueryDollarDollarSign: kotlin.String?) : ApiResponse<Unit?> {
        val localVariableConfig = findPetsByStatusRequestConfig(pathDefault = pathDefault, pathNullable = pathNullable, queryDefault = queryDefault, headerDefault = headerDefault, cookieDefault = cookieDefault, queryNullable = queryNullable, headerNullable = headerNullable, cookieNullable = cookieNullable, dollarQueryDollarDollarSign = dollarQueryDollarDollarSign)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation findPetsByStatus
     *
     * @param pathDefault path default
     * @param pathNullable path_nullable
     * @param queryDefault query default (optional, default to "available")
     * @param headerDefault header default (optional, default to "available")
     * @param cookieDefault cookie default (optional, default to "available")
     * @param queryNullable query nullable (optional)
     * @param headerNullable header nullable (optional)
     * @param cookieNullable cookie_nullable (optional)
     * @param dollarQueryDollarDollarSign query parameter with dollar sign (optional)
     * @return RequestConfig
     */
    fun findPetsByStatusRequestConfig(pathDefault: kotlin.String, pathNullable: kotlin.String, queryDefault: kotlin.String?, headerDefault: kotlin.String?, cookieDefault: kotlin.String?, queryNullable: kotlin.String?, headerNullable: kotlin.String?, cookieNullable: kotlin.String?, dollarQueryDollarDollarSign: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (queryDefault != null) {
                    put("query_default", listOf(queryDefault.toString()))
                }
                if (queryNullable != null) {
                    put("query_nullable", listOf(queryNullable.toString()))
                }
                if (dollarQueryDollarDollarSign != null) {
                    put("\$query-\$dollar-sign", listOf(dollarQueryDollarDollarSign.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        headerDefault?.apply { localVariableHeaders["header_default"] = this.toString() }
        headerNullable?.apply { localVariableHeaders["header_nullable"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/test/parameters/{path_default}/{path_nullable}".replace("{"+"path_default"+"}", encodeURIComponent(pathDefault.toString())).replace("{"+"path_nullable"+"}", encodeURIComponent(pathNullable.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}