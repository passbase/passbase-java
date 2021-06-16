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
import com.passbase.model.ProjectSettingsCustomizations;
import com.passbase.model.ProjectSettingsVerificationSteps;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProjectSettings
 */


public class ProjectSettings {
  @SerializedName("id")
  private String id = null;

  @SerializedName("slug")
  private String slug = null;

  /**
   * Gets or Sets environment
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    SANDBOX("sandbox"),
    PRODUCTION("production");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnvironmentEnum fromValue(String text) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EnvironmentEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("environment")
  private EnvironmentEnum environment = null;

  @SerializedName("organization")
  private String organization = null;

  @SerializedName("customizations")
  private ProjectSettingsCustomizations customizations = null;

  @SerializedName("verification_steps")
  private java.util.List<ProjectSettingsVerificationSteps> verificationSteps = null;

  public ProjectSettings id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the project
   * @return id
  **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "Unique ID of the project")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectSettings slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Slugs are meant to be a way to verify people just with the link
   * @return slug
  **/
  @Schema(example = "passbase-demo", description = "Slugs are meant to be a way to verify people just with the link")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public ProjectSettings environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @Schema(example = "sandbox", description = "")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public ProjectSettings organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Name of the organization that owns this project
   * @return organization
  **/
  @Schema(example = "Passbase Inc.", description = "Name of the organization that owns this project")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public ProjectSettings customizations(ProjectSettingsCustomizations customizations) {
    this.customizations = customizations;
    return this;
  }

   /**
   * Get customizations
   * @return customizations
  **/
  @Schema(description = "")
  public ProjectSettingsCustomizations getCustomizations() {
    return customizations;
  }

  public void setCustomizations(ProjectSettingsCustomizations customizations) {
    this.customizations = customizations;
  }

  public ProjectSettings verificationSteps(java.util.List<ProjectSettingsVerificationSteps> verificationSteps) {
    this.verificationSteps = verificationSteps;
    return this;
  }

  public ProjectSettings addVerificationStepsItem(ProjectSettingsVerificationSteps verificationStepsItem) {
    if (this.verificationSteps == null) {
      this.verificationSteps = new java.util.ArrayList<>();
    }
    this.verificationSteps.add(verificationStepsItem);
    return this;
  }

   /**
   * List of the steps through which the user must go through to complete their verification 
   * @return verificationSteps
  **/
  @Schema(example = "[{\"step\":\"email\",\"resource_types\":[\"EMAIL\"]},{\"step\":\"liveness_check\",\"resource_types\":[\"FACE_VIDEO\"]},{\"step\":\"country\",\"resource_types\":[\"de\",\"us\",\"gb\",\"ca\"]},{\"step\":\"identity_document_check\",\"resource_types\":[\"PASSPORT\",\"DRIVERS_LICENSE\"]},{\"step\":\"insurance_card_scan\",\"resource_types\":[\"HEALTH_INSURANCE_CARD\"]}]", description = "List of the steps through which the user must go through to complete their verification ")
  public java.util.List<ProjectSettingsVerificationSteps> getVerificationSteps() {
    return verificationSteps;
  }

  public void setVerificationSteps(java.util.List<ProjectSettingsVerificationSteps> verificationSteps) {
    this.verificationSteps = verificationSteps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSettings projectSettings = (ProjectSettings) o;
    return Objects.equals(this.id, projectSettings.id) &&
        Objects.equals(this.slug, projectSettings.slug) &&
        Objects.equals(this.environment, projectSettings.environment) &&
        Objects.equals(this.organization, projectSettings.organization) &&
        Objects.equals(this.customizations, projectSettings.customizations) &&
        Objects.equals(this.verificationSteps, projectSettings.verificationSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, environment, organization, customizations, verificationSteps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    customizations: ").append(toIndentedString(customizations)).append("\n");
    sb.append("    verificationSteps: ").append(toIndentedString(verificationSteps)).append("\n");
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
