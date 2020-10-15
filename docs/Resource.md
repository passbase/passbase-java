# Resource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID representing a resource |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current state of the resource in Passbase&#x27;s systems |  [optional]
**created** | **Long** | Unix-timestamp of when the resource was created |  [optional]
**updated** | **Long** | Unix-timestamp of when the resource was updated |  [optional]
**type** | **String** |  |  [optional]
**resourceFiles** | [**ResourceFiles**](ResourceFiles.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CREATED | &quot;created&quot;
PROCESSING | &quot;processing&quot;
PROCESSED | &quot;processed&quot;
