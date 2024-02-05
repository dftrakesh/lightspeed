package io.github.dftrakesh.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessCredentials {

    private Integer accountId;
    private String storeName;
    private String clientId;
    private String clientSecret;
    private String accessToken;
    private String storeId;
}