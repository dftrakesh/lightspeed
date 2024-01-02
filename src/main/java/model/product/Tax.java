package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tax {
    private boolean taxable;
    private int defaultLocationIncludedTaxRate;
    private List<Object> enabledManualTaxes;
    private String taxClassCode;
}