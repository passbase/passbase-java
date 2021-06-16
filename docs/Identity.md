# Identity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID of the identity |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current state of the identity in Passbase&#x27;s systems |  [optional]
**owner** | [**IdentityOwner**](IdentityOwner.md) |  |  [optional]
**score** | **Double** | Float between 0 and 1 representing our confidence that this identity is valid. 0 meaning we couldn&#x27;t verify any of the information provided with accuracy, and 1 absolute confidence. |  [optional]
**created** | **Long** | Unix-timestamp of when the identity was created |  [optional]
**updated** | **Long** | Unix-timestamp of when the identity was updated |  [optional]
**resources** | [**java.util.List&lt;IdentityResource&gt;**](IdentityResource.md) | resources attached to a verification |  [optional]
**metadata** | **Object** | Customer defined arbitrary payload initially passed through the client-sdk |  [optional]
**watchlist** | [**WatchlistResponse**](WatchlistResponse.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CREATED | &quot;created&quot;
PROCESSING | &quot;processing&quot;
PENDING | &quot;pending&quot;
APPROVED | &quot;approved&quot;
DECLINED | &quot;declined&quot;
