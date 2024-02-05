package io.github.dftrakesh.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedCategory {
    private Boolean enabled;
    private Integer categoryId;
    private Integer productCount;
}