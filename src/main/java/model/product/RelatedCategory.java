package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedCategory {
    private boolean enabled;
    private int categoryId;
    private int productCount;
}