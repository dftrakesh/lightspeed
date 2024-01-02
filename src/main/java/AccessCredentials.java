import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessCredentials {
    private String private_key;
    private String redirect_uri;
    private int storeId;
    private String accessToken;
}