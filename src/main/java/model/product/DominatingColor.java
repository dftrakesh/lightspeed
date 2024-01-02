package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DominatingColor {
    private int red;
    private int green;
    private int blue;
    private int alpha;
}