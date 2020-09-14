# Identity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID of the identity |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current state of the identity in Passbase&#x27;s systems |  [optional]
**created** | **Long** | Unix-timestamp of when the identity was created |  [optional]
**updated** | **Long** | Unix-timestamp of when the identity was updated |  [optional]
**resources** | [**java.util.List&lt;IdentityResource&gt;**](IdentityResource.md) | resources attached to a verification |  [optional]
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
