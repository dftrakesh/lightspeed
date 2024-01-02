package model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderResponse {
    private int total;
    private int count;
    private int offset;
    private int limit;
    private List<Order> items;
}
