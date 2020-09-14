# ResourceFilesInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID representing a resource file |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**page** | **Integer** | Page number of the document. Generally 1 would represent the front of a document, and 2 might represent the back of the same document.  |  [optional]
**created** | **Long** | Unix-timestamp of when the resource was created |  [optional]
**updated** | **Long** | Unix-timestamp of when the resource was updated |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FACE_VIDEO | &quot;face_video&quot;
DOCUMENT_IMAGE | &quot;document_image&quot;
