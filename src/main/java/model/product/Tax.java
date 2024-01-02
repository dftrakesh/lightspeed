package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tax {
    private Boolean taxable;
    private Integer defaultLocationIncludedTaxRate;
    private String taxClassCode;
}