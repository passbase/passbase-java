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

package com.passbase.api;

import com.passbase.ApiException;
import com.passbase.model.Identity;
import com.passbase.model.PaginatedIdentities;
import com.passbase.model.PaginatedResources;
import com.passbase.model.Resource;
import com.passbase.model.ResourceFile;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for IdentityApi
 */
@Ignore
public class IdentityApiTest {

    private final IdentityApi api = new IdentityApi();

    /**
     * Get identity
     *
     * Retrieve an identity by providing the identity ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityByIdTest() throws ApiException {
        java.util.UUID id = null;
        Identity response = api.getIdentityById(id);

        // TODO: test validations
    }
    /**
     * Get resource
     *
     * Get a resource attached to an identity by providing the resource ID. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityResourceByIdTest() throws ApiException {
        String id = null;
        String resourceId = null;
        Resource response = api.getIdentityResourceById(id, resourceId);

        // TODO: test validations
    }
    /**
     * Get resource file
     *
     * Get a raw resource file attached to an identity by providing the resource ID and the resource file ID. This is a protected route and you&#x27;ll need a specific government authorization to access it. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityResourceFileByIdTest() throws ApiException {
        String id = null;
        String resourceId = null;
        String resourceFileId = null;
        ResourceFile response = api.getIdentityResourceFileById(id, resourceId, resourceFileId);

        // TODO: test validations
    }
    /**
     * List identities
     *
     * List all the identities retrievable by the provided API Secret Key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIdentitiesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        PaginatedIdentities response = api.listIdentities(limit, cursor);

        // TODO: test validations
    }
    /**
     * List resources
     *
     * List resources attached to an identity by providing the identity ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIdentityResourcesTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String cursor = null;
        PaginatedResources response = api.listIdentityResources(id, limit, cursor);

        // TODO: test validations
    }
}
