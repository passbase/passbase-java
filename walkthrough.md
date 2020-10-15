Maven users, add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.passbase</groupId>
  <artifactId>passbase</artifactId>
  <version>1.0.1</version>
  <scope>compile</scope>
</dependency>
```

Gradle users, add this dependency to your project's build.gradle:

```groovy
compile "com.passbase:passbase:1.0.1"
```

```java
import com.passbase.*;
import com.passbase.api.ProjectApi;
import com.passbase.model.ProjectSettings;
import java.util.List;
import java.util.Map;

public final class App {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setApiKey("{{YOUR_SECRET_API_KEY}}");
        ProjectApi apiInstance = new ProjectApi(defaultClient);

        try {
            // sync
            ProjectSettings settings = apiInstance.getSettings();
            System.out.println(settings);

            // or async
            apiInstance.getSettingsAsync(new ApiCallback<ProjectSettings>() {
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    printError(e);
                }

                public void onSuccess(ProjectSettings settings, int statusCode,
                        Map<String, List<String>> responseHeaders) {
                    System.out.println(settings);
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
        System.err.println("Exception when calling ProjectApi#getSettings");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
}
```