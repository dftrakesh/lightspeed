package io.github.dftrakesh.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DominatingColor {
    private Integer red;
    private Integer green;
    private Integer blue;
    private Integer alpha;
}