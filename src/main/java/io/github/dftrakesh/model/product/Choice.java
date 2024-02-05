package io.github.dftrakesh.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Choice {
    private String text;
    private Integer priceModifier;
    private String priceModifierType;
}