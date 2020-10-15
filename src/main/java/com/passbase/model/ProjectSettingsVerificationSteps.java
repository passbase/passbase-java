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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProjectSettingsVerificationSteps
 */


public class ProjectSettingsVerificationSteps {
  @SerializedName("step")
  private String step = null;

  @SerializedName("resource_types")
  private java.util.List<String> resourceTypes = null;

  public ProjectSettingsVerificationSteps step(String step) {
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @Schema(example = "liveness_check", description = "")
  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }

  public ProjectSettingsVerificationSteps resourceTypes(java.util.List<String> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public ProjectSettingsVerificationSteps addResourceTypesItem(String resourceTypesItem) {
    if (this.resourceTypes == null) {
      this.resourceTypes = new java.util.ArrayList<>();
    }
    this.resourceTypes.add(resourceTypesItem);
    return this;
  }

   /**
   * Get resourceTypes
   * @return resourceTypes
  **/
  @Schema(example = "[\"DRIVERS_LICENSE\",\"NATIONAL_ID_CARD\"]", description = "")
  public java.util.List<String> getResourceTypes() {
    return resourceTypes;
  }

  public void setResourceTypes(java.util.List<String> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSettingsVerificationSteps projectSettingsVerificationSteps = (ProjectSettingsVerificationSteps) o;
    return Objects.equals(this.step, projectSettingsVerificationSteps.step) &&
        Objects.equals(this.resourceTypes, projectSettingsVerificationSteps.resourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, resourceTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSettingsVerificationSteps {\n");
    
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
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
