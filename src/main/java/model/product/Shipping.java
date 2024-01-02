package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipping {
    private String type;
    private int methodMarkup;
    private int flatRate;
    private List<Object> disabledMethods;
    private List<Object> enabledMethods;
}