# IdentityApi

All URIs are relative to *https://api.passbase.com/verification/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIdentityById**](IdentityApi.md#getIdentityById) | **GET** /identities/{id} | Get identity
[**getIdentityResourceById**](IdentityApi.md#getIdentityResourceById) | **GET** /identity/{id}/resources/{resource_id} | Get resource
[**getIdentityResourceFileById**](IdentityApi.md#getIdentityResourceFileById) | **GET** /identity/{id}/resources/{resource_id}/resource_files/{resource_file_id} | Get resource file
[**listIdentities**](IdentityApi.md#listIdentities) | **GET** /identities | List identities
[**listIdentityResources**](IdentityApi.md#listIdentityResources) | **GET** /identity/{id}/resources | List resources

<a name="getIdentityById"></a>
# **getIdentityById**
> Identity getIdentityById(id)

Get identity

Retrieve an identity by providing the identity ID.

### Example
```java
// Import classes:
//import com.passbase.ApiClient;
//import com.passbase.ApiException;
//import com.passbase.Configuration;
//import com.passbase.auth.*;
//import com.passbase.api.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: SecretApiKey
ApiKeyAuth SecretApiKey = (ApiKeyAuth) defaultClient.getAuthentication("SecretApiKey");
SecretApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SecretApiKey.setApiKeyPrefix("Token");

IdentityApi apiInstance = new IdentityApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | Unique ID of the identity to return
try {
    Identity result = apiInstance.getIdentityById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#getIdentityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| Unique ID of the identity to return |

### Return type

[**Identity**](Identity.md)

### Authorization

[SecretApiKey](../README.md#SecretApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIdentityResourceById"></a>
# **getIdentityResourceById**
> Resource getIdentityResourceById(id, resourceId)

Get resource

Get a resource attached to an identity by providing the resource ID. 

### Example
```java
// Import classes:
//import com.passbase.ApiClient;
//import com.passbase.ApiException;
//import com.passbase.Configuration;
//import com.passbase.auth.*;
//import com.passbase.api.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: SecretApiKey
ApiKeyAuth SecretApiKey = (ApiKeyAuth) defaultClient.getAuthentication("SecretApiKey");
SecretApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SecretApiKey.setApiKeyPrefix("Token");

IdentityApi apiInstance = new IdentityApi();
String id = "id_example"; // String | Identity id
String resourceId = "resourceId_example"; // String | Resource id
try {
    Resource result = apiInstance.getIdentityResourceById(id, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#getIdentityResourceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identity id |
 **resourceId** | **String**| Resource id |

### Return type

[**Resource**](Resource.md)

### Authorization

[SecretApiKey](../README.md#SecretApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIdentityResourceFileById"></a>
# **getIdentityResourceFileById**
> ResourceFile getIdentityResourceFileById(id, resourceId, resourceFileId)

Get resource file

Get a raw resource file attached to an identity by providing the resource ID and the resource file ID. This is a protected route and you&#x27;ll need a specific government authorization to access it. 

### Example
```java
// Import classes:
//import com.passbase.ApiClient;
//import com.passbase.ApiException;
//import com.passbase.Configuration;
//import com.passbase.auth.*;
//import com.passbase.api.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: SecretApiKey
ApiKeyAuth SecretApiKey = (ApiKeyAuth) defaultClient.getAuthentication("SecretApiKey");
SecretApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SecretApiKey.setApiKeyPrefix("Token");

IdentityApi apiInstance = new IdentityApi();
String id = "id_example"; // String | Identity id
String resourceId = "resourceId_example"; // String | Resource id
String resourceFileId = "resourceFileId_example"; // String | Resource file id
try {
    ResourceFile result = apiInstance.getIdentityResourceFileById(id, resourceId, resourceFileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#getIdentityResourceFileById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identity id |
 **resourceId** | **String**| Resource id |
 **resourceFileId** | **String**| Resource file id |

### Return type

[**ResourceFile**](ResourceFile.md)

### Authorization

[SecretApiKey](../README.md#SecretApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIdentities"></a>
# **listIdentities**
> PaginatedIdentities listIdentities(limit, cursor)

List identities

List all the identities retrievable by the provided API Secret Key.

### Example
```java
// Import classes:
//import com.passbase.ApiClient;
//import com.passbase.ApiException;
//import com.passbase.Configuration;
//import com.passbase.auth.*;
//import com.passbase.api.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: SecretApiKey
ApiKeyAuth SecretApiKey = (ApiKeyAuth) defaultClient.getAuthentication("SecretApiKey");
SecretApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SecretApiKey.setApiKeyPrefix("Token");

IdentityApi apiInstance = new IdentityApi();
Integer limit = 56; // Integer | 
String cursor = "cursor_example"; // String | 
try {
    PaginatedIdentities result = apiInstance.listIdentities(limit, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#listIdentities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **cursor** | **String**|  | [optional]

### Return type

[**PaginatedIdentities**](PaginatedIdentities.md)

### Authorization

[SecretApiKey](../README.md#SecretApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIdentityResources"></a>
# **listIdentityResources**
> PaginatedResources listIdentityResources(id, limit, cursor)

List resources

List resources attached to an identity by providing the identity ID.

### Example
```java
// Import classes:
//import com.passbase.ApiClient;
//import com.passbase.ApiException;
//import com.passbase.Configuration;
//import com.passbase.auth.*;
//import com.passbase.api.IdentityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: SecretApiKey
ApiKeyAuth SecretApiKey = (ApiKeyAuth) defaultClient.getAuthentication("SecretApiKey");
SecretApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SecretApiKey.setApiKeyPrefix("Token");

IdentityApi apiInstance = new IdentityApi();
String id = "id_example"; // String | Identity id
Integer limit = 56; // Integer | 
String cursor = "cursor_example"; // String | 
try {
    PaginatedResources result = apiInstance.listIdentityResources(id, limit, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#listIdentityResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identity id |
 **limit** | **Integer**|  | [optional]
 **cursor** | **String**|  | [optional]

### Return type

[**PaginatedResources**](PaginatedResources.md)

### Authorization

[SecretApiKey](../README.md#SecretApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

