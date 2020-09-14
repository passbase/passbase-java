/*
 * Verification API
 * # Introduction  <span class=\"subtext\"> Welcome to the Passbase Verifications API docs. This documentation will help you understand our models and the Verification API with its endpoints. Based on this you can build your own system (i.e. verification) and hook it up to Passbase.  In case of feedback or questions you can reach us under this email address: [developer@passbase.com](mailto:developer@passbase.com). </span>  A User submits a video selfie and valid identifying __Resources__ during a __Verification__ guided by the Passbase client-side integration. Once all the necessary __Resources__ are submitted, __Data points__ are extracted, digitized, and authenticated. These Data points then becomes part of the User's __Identity__. The User then consents to share __Resources__ and/or __Data points__ from their Identity with you. This information is passed to you and can be used to make decisions about a User (e.g. activate account). This table below explains our terminology further.  | Term                                    | Description | |-----------------------------------------|-------------| | Data points                             | Any data about a User extracted from a Resource (E.g. Passport Number, or Age). | | [Resource](#tag/resource_model)         | A source document used to generate the Data points for a User (E.g. Passport). | | [Identity](#tag/identity_model)         | A set of Data points and Resources related to and owned by one single User. This data can be accessed by you through a Verification. | | [User](#tag/user_model)                 | The owner of an email address associated with an Identity. | | Verification (signup)                   | A transaction through which a User consents to share Data points with you. If the Data points you request are not already available in the User's Identity, the Passbase client will ask the User to submit the necessary Resource required to extract them. | | Re-authentication (login)               | A transaction through which a User can certify the ownership of Personal data previously shared through an Authentication. |   # Authentication  <span class=\"subtext\"> There are two forms of authentication for the API: <br/>&bull; API Key <br/>&bull; Bearer JWT Token  </span> 
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
import com.passbase.model.ProjectSettingsVerificationSteps;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * User
 */


public class User {
  @SerializedName("email")
  private String email = null;

  @SerializedName("identity_access_token")
  private String identityAccessToken = null;

  @SerializedName("required_steps")
  private java.util.List<ProjectSettingsVerificationSteps> requiredSteps = null;

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email with which the user was created
   * @return email
  **/
  @Schema(example = "jessie@example.com", description = "Email with which the user was created")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User identityAccessToken(String identityAccessToken) {
    this.identityAccessToken = identityAccessToken;
    return this;
  }

   /**
   * Access token in the shape of a JsonWebToken used as a Bearer token when submitting identity data 
   * @return identityAccessToken
  **/
  @Schema(example = "eyJhbGciOiJIUzI1NiIsI...", description = "Access token in the shape of a JsonWebToken used as a Bearer token when submitting identity data ")
  public String getIdentityAccessToken() {
    return identityAccessToken;
  }

  public void setIdentityAccessToken(String identityAccessToken) {
    this.identityAccessToken = identityAccessToken;
  }

  public User requiredSteps(java.util.List<ProjectSettingsVerificationSteps> requiredSteps) {
    this.requiredSteps = requiredSteps;
    return this;
  }

  public User addRequiredStepsItem(ProjectSettingsVerificationSteps requiredStepsItem) {
    if (this.requiredSteps == null) {
      this.requiredSteps = new java.util.ArrayList<>();
    }
    this.requiredSteps.add(requiredStepsItem);
    return this;
  }

   /**
   * List of the steps through which the user must go through to complete their verification 
   * @return requiredSteps
  **/
  @Schema(example = "[{\"type\":\"email\",\"document_types\":[\"EMAIL\"]},{\"type\":\"liveness_check\",\"document_types\":[\"FACE_VIDEO\"]},{\"type\":\"country\",\"document_types\":[\"COUNTRY\"]},{\"type\":\"identity_document_check\",\"document_types\":[\"PASSPORT\",\"DRIVERS_LICENSE\"]},{\"type\":\"insurance_card_scan\",\"document_types\":[\"HEALTH_INSURANCE_CARD\"]}]", description = "List of the steps through which the user must go through to complete their verification ")
  public java.util.List<ProjectSettingsVerificationSteps> getRequiredSteps() {
    return requiredSteps;
  }

  public void setRequiredSteps(java.util.List<ProjectSettingsVerificationSteps> requiredSteps) {
    this.requiredSteps = requiredSteps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.email, user.email) &&
        Objects.equals(this.identityAccessToken, user.identityAccessToken) &&
        Objects.equals(this.requiredSteps, user.requiredSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, identityAccessToken, requiredSteps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    identityAccessToken: ").append(toIndentedString(identityAccessToken)).append("\n");
    sb.append("    requiredSteps: ").append(toIndentedString(requiredSteps)).append("\n");
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
