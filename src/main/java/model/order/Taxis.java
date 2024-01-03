package model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Taxis {
    private String name;
    private Integer value;
    private Double total;
    private Double taxOnDiscountedSubtotal;
    private Integer taxOnShipping;
    private Boolean includeInPrice;
    private Integer sourceTaxRateId;
    private String sourceTaxRateType;
    private String taxClassName;
    private String taxClassCode;
}
