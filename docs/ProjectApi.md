# ProjectApi

All URIs are relative to *https://api.passbase.com/verification/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSettings**](ProjectApi.md#getSettings) | **GET** /settings | Get project settings

<a name="getSettings"></a>
# **getSettings**
> ProjectSettings getSettings()

Get project settings

Get project settings 

### Example
```java
// Import classes:
//import com.passbase.ApiClient;
//import com.passbase.ApiException;
//import com.passbase.Configuration;
//import com.passbase.auth.*;
//import com.passbase.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: SecretApiKey
ApiKeyAuth SecretApiKey = (ApiKeyAuth) defaultClient.getAuthentication("SecretApiKey");
SecretApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//SecretApiKey.setApiKeyPrefix("Token");

ProjectApi apiInstance = new ProjectApi();
try {
    ProjectSettings result = apiInstance.getSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProjectSettings**](ProjectSettings.md)

### Authorization

[SecretApiKey](../README.md#SecretApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

