package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BorderInfo {
    private DominatingColor dominatingColor;
    private Boolean homogeneity;
}