# ProjectSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID of the project |  [optional]
**slug** | **String** | Slugs are meant to be a way to verify people just with the link |  [optional]
**environment** | [**EnvironmentEnum**](#EnvironmentEnum) |  |  [optional]
**organization** | **String** | Name of the organization that owns this project |  [optional]
**customizations** | [**ProjectSettingsCustomizations**](ProjectSettingsCustomizations.md) |  |  [optional]
**verificationSteps** | [**java.util.List&lt;ProjectSettingsVerificationSteps&gt;**](ProjectSettingsVerificationSteps.md) | List of the steps through which the user must go through to complete their verification  |  [optional]

<a name="EnvironmentEnum"></a>
## Enum: EnvironmentEnum
Name | Value
---- | -----
SANDBOX | &quot;sandbox&quot;
PRODUCTION | &quot;production&quot;
