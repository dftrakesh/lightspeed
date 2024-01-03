package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipping {
    private String type;
    private Integer methodMarkup;
    private Integer flatRate;
}