1. Add Passbase repository
   Maven users, add this repository to your project's `pom.xml`:

   ```xml
   <repository>
       <id>maven.passbase.com</id>
       <url>https://passbase-maven.s3.us-east-2.amazonaws.com/releases</url>
   </repository>
   ```

   Gradle users, add this repository to your project's `build.gradle`

   ```groovy
   repositories {
       maven {
           url = uri('https://passbase-maven.s3.us-east-2.amazonaws.com/releases')
       }
   }
   ```

2. Add Passbase Java SDK to your dependencies

   Maven users, add this depency to your project's `pom.xml`:

   ```xml
   <dependency>
   <groupId>com.passbase</groupId>
   <artifactId>passbase</artifactId>
   <version>1.3.0</version>
   <scope>compile</scope>
   </dependency>
   ```

   Gradle users, add this dependency to your project's build.gradle:

   ```groovy
   compile "com.passbase:passbase:1.3.0"
   ```

3. You should now be able to import `com.passbase.*` into your Java project

```java
import com.passbase.*;
import com.passbase.api.ProjectApi;
import com.passbase.model.Identity;
import java.util.List;
import java.util.Map;

public final class App {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setApiKey("{{YOUR_SECRET_API_KEY}}");
        ProjectApi apiInstance = new IdentityApi(defaultClient);

        try {
            // sync
            Identity identity = apiInstance.getIdentityById("<uuid>");
            System.out.println(identity);

            // or async
            apiInstance.getIdentityByIdAsync("<uuid>", new ApiCallback<Identity>() {
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    printError(e);
                }

                public void onSuccess(Identity identity, int statusCode,
                        Map<String, List<String>> responseHeaders) {
                    System.out.println(identity);
                }

                public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
                    // noop
                }

                public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
                    // noop
                }
            });
        } catch (ApiException e) {
            printError(e);
        }
    }

    private static void printError(ApiException e) {
        System.err.println("Exception when calling IdentityApi#getIdentityById");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
}
```
