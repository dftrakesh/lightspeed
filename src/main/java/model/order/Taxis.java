package model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Taxis {
    private String name;
    private int value;
    private double total;
    private double taxOnDiscountedSubtotal;
    private int taxOnShipping;
    private boolean includeInPrice;
    private int sourceTaxRateId;
    private String sourceTaxRateType;
    private String taxClassName;
    private String taxClassCode;
}
