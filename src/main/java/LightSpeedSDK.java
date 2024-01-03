import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import model.AccessCredentials;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static constantcode.ConstantCodes.*;

public class LightSpeedSDK {

    protected HttpClient client;
    protected AccessCredentials accessCredentials;
    protected ObjectMapper objectMapper;

    public LightSpeedSDK(AccessCredentials accessCredentials) {
        this.accessCredentials = accessCredentials;
        client = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    @SneakyThrows
    protected HttpRequest get(URI uri) {
        return HttpRequest.newBuilder(uri)
                .header(AUTHORIZATION, accessCredentials.getAccessToken())
                .header(HTTP_REQUEST_PROPERTY_CONTENT_TYPE, HTTP_REQUEST_CONTENT_TYPE_JSON)
                .GET()
                .build();
    }

    @SneakyThrows
    public <T> T getRequestWrapped(HttpRequest request, HttpResponse.BodyHandler<T> handler) {
        return client.sendAsync(request, handler)
                .thenComposeAsync(r -> tryResend(client, request, handler, r, 1))
                .get().body();
    }

    @SneakyThrows
    public <T> CompletableFuture<HttpResponse<T>> tryResend(HttpClient client,
                                                            HttpRequest request,
                                                            HttpResponse.BodyHandler<T> handler,
                                                            HttpResponse<T> resp, int count) {
        if (resp.statusCode() == 429 && count < MAX_ATEMPTS) {
            long lLimitResetSeconds = resp.headers().firstValueAsLong("Retry-After").orElse(TIME_OUT_DURATION);
            Thread.sleep(lLimitResetSeconds * 1000);
            HttpResponse<T> response = client.send(request, handler);
            return tryResend(client, request, handler, response, count + 1);
        }
        return CompletableFuture.completedFuture(resp);
    }

    @SneakyThrows
    protected URI addParameters(URI uri, HashMap<String, String> params) {
        String query = uri.getQuery();
        StringBuilder builder = new StringBuilder();
        if (query != null)
            builder.append(query);

        for (Map.Entry<String, String> entry : params.entrySet()) {
            String keyValueParam = entry.getKey() + "=" + entry.getValue();
            if (!builder.toString().isEmpty())
                builder.append("&");
            builder.append(keyValueParam);
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), builder.toString(), uri.getFragment());
    }

    @SneakyThrows
    protected HttpRequest put(URI uri, final String jsonBody) {
        return HttpRequest.newBuilder(uri)
                .header(AUTHORIZATION, accessCredentials.getAccessToken())
                .header(HTTP_REQUEST_PROPERTY_CONTENT_TYPE, HTTP_REQUEST_CONTENT_TYPE_JSON)
                .header(INVENTORY_REQUEST_CACHE, INVENTORY_REQUEST_CACHE_VALUE)
                .PUT(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();
    }

}