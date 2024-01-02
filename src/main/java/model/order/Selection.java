package model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Selection {
    private String selectionTitle;
    private Integer selectionModifier;
    private String selectionModifierType;
}
