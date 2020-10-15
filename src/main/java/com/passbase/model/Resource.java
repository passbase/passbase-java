/*
 * Verification API
 * # Introduction  <span class=\"subtext\"> Welcome to the Passbase Verifications API docs. This documentation will help you understand our models and the Verification API with its endpoints. Based on this you can build your own system (i.e. verification) and hook it up to Passbase.  In case of feedback or questions you can reach us under this email address: [developer@passbase.com](mailto:developer@passbase.com). </span>  A User submits a video selfie and valid identifying __Resources__ during a __Verification__ guided by the Passbase client-side integration. Once all the necessary __Resources__ are submitted, __Data points__ are extracted, digitized, and authenticated. These Data points then becomes part of the User's __Identity__. The User then consents to share __Resources__ and/or __Data points__ from their Identity with you. This information is passed to you and can be used to make decisions about a User (e.g. activate account). This table below explains our terminology further.  | Term                                    | Description | |-----------------------------------------|-------------| | [Identity](#tag/identity_model)         | A set of Data points and Resources related to and owned by one single User. This data can be accessed by you through a Verification. | | Data points                             | Any data about a User extracted from a Resource (E.g. Passport Number, or Age). | | [Resource](#tag/resource_model)         | A source document used to generate the Data points for a User (E.g. Passport). | | [User](#tag/user_model)                 | The owner of an email address associated with an Identity. | | Verification                            | A transaction through which a User consents to share Data points with you. If the Data points you request are not already available in the User's Identity, the Passbase client will ask the User to submit the necessary Resource required to extract them. | | Re-authentication (login)               | A transaction through which a User can certify the ownership of Personal data previously shared through an Authentication. |   # Authentication  <span class=\"subtext\"> There are two forms of authentication for the API: <br/>&bull; API Key <br/>&bull; Bearer JWT Token  </span> 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.passbase.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.passbase.model.ResourceFiles;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Resource
 */


public class Resource {
  @SerializedName("id")
  private java.util.UUID id = null;

  /**
   * Current state of the resource in Passbase&#x27;s systems
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("created"),
    PROCESSING("processing"),
    PROCESSED("processed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("updated")
  private Long updated = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("resource_files")
  private ResourceFiles resourceFiles = null;

  public Resource id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID representing a resource
   * @return id
  **/
  @Schema(description = "Unique ID representing a resource")
  public java.util.UUID getId() {
    return id;
  }

  public void setId(java.util.UUID id) {
    this.id = id;
  }

  public Resource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Current state of the resource in Passbase&#x27;s systems
   * @return status
  **/
  @Schema(description = "Current state of the resource in Passbase's systems")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Resource created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Unix-timestamp of when the resource was created
   * @return created
  **/
  @Schema(example = "1600250430", description = "Unix-timestamp of when the resource was created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public Resource updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Unix-timestamp of when the resource was updated
   * @return updated
  **/
  @Schema(example = "1600250430", description = "Unix-timestamp of when the resource was updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public Resource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Resource resourceFiles(ResourceFiles resourceFiles) {
    this.resourceFiles = resourceFiles;
    return this;
  }

   /**
   * Get resourceFiles
   * @return resourceFiles
  **/
  @Schema(description = "")
  public ResourceFiles getResourceFiles() {
    return resourceFiles;
  }

  public void setResourceFiles(ResourceFiles resourceFiles) {
    this.resourceFiles = resourceFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.id, resource.id) &&
        Objects.equals(this.status, resource.status) &&
        Objects.equals(this.created, resource.created) &&
        Objects.equals(this.updated, resource.updated) &&
        Objects.equals(this.type, resource.type) &&
        Objects.equals(this.resourceFiles, resource.resourceFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, created, updated, type, resourceFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    resourceFiles: ").append(toIndentedString(resourceFiles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
