package io.github.dftrakesh.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessCredentials {

    @JsonProperty("account_id")
    private Integer accountId;

    @JsonProperty("storeName")
    private String storeName;

    @JsonProperty("storeDomain")
    private String storeDomain;

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("store_id")
    private String storeId;

    @JsonProperty("user_id")
    private long userId;

    @JsonProperty("admin_sso")
    private AdminSSO adminSSO;

    @JsonProperty("email")
    private String email;

    @JsonProperty("profile_scopes")
    private String profileScopes;

    @JsonProperty("public_token")
    private String publicToken;

    public static class AdminSSO {
        @JsonProperty("role")
        private String role;
    }
}