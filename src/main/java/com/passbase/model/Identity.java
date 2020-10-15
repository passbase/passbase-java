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
import com.passbase.model.IdentityResource;
import com.passbase.model.WatchlistResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Identity
 */


public class Identity {
  @SerializedName("id")
  private String id = null;

  /**
   * Current state of the identity in Passbase&#x27;s systems
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("created"),
    PROCESSING("processing"),
    PENDING("pending"),
    APPROVED("approved"),
    DECLINED("declined");

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

  @SerializedName("resources")
  private java.util.List<IdentityResource> resources = null;

  @SerializedName("watchlist")
  private WatchlistResponse watchlist = null;

  public Identity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the identity
   * @return id
  **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "Unique ID of the identity")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Identity status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Current state of the identity in Passbase&#x27;s systems
   * @return status
  **/
  @Schema(description = "Current state of the identity in Passbase's systems")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Identity created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Unix-timestamp of when the identity was created
   * @return created
  **/
  @Schema(example = "1600250430", description = "Unix-timestamp of when the identity was created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public Identity updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Unix-timestamp of when the identity was updated
   * @return updated
  **/
  @Schema(example = "1600250430", description = "Unix-timestamp of when the identity was updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public Identity resources(java.util.List<IdentityResource> resources) {
    this.resources = resources;
    return this;
  }

  public Identity addResourcesItem(IdentityResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new java.util.ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * resources attached to a verification
   * @return resources
  **/
  @Schema(description = "resources attached to a verification")
  public java.util.List<IdentityResource> getResources() {
    return resources;
  }

  public void setResources(java.util.List<IdentityResource> resources) {
    this.resources = resources;
  }

  public Identity watchlist(WatchlistResponse watchlist) {
    this.watchlist = watchlist;
    return this;
  }

   /**
   * Get watchlist
   * @return watchlist
  **/
  @Schema(description = "")
  public WatchlistResponse getWatchlist() {
    return watchlist;
  }

  public void setWatchlist(WatchlistResponse watchlist) {
    this.watchlist = watchlist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.id, identity.id) &&
        Objects.equals(this.status, identity.status) &&
        Objects.equals(this.created, identity.created) &&
        Objects.equals(this.updated, identity.updated) &&
        Objects.equals(this.resources, identity.resources) &&
        Objects.equals(this.watchlist, identity.watchlist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, created, updated, resources, watchlist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    watchlist: ").append(toIndentedString(watchlist)).append("\n");
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
