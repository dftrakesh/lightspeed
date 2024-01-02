package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductResponse {
    private Integer total;
    private Integer count;
    private Integer offset;
    private Integer limit;
    private List<Product> items;
}