package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessCredentials {
    private String privateKey;
    private String redirectUri;
    private int storeId;
    private String accessToken;
}