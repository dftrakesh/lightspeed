package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Choice {
    private String text;
    private TextTranslated textTranslated;
    private int priceModifier;
    private String priceModifierType;
}