package io.github.dftrakesh.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderResponse {
    private Integer total;
    private Integer count;
    private Integer offset;
    private Integer limit;
    private List<Order> items;
}