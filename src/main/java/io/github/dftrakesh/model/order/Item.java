package io.github.dftrakesh.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    private Integer id;
    private Integer productId;
    private Integer categoryId;
    private Integer price;
    private Double priceWithoutTax;
    private Integer productPrice;
    private String sku;
    private Integer quantity;
    private String shortDescription;
    private Double tax;
    private Integer shipping;
    private Integer quantityInStock;
    private String name;
    private Boolean isShippingRequired;
    private Integer weight;
    private Boolean trackQuantity;
    private Boolean fixedShippingRateOnly;
    private String imageUrl;
    private String smallThumbnailUrl;
    private String hdThumbnailUrl;
    private Integer fixedShippingRate;
    private Boolean digital;
    private Boolean productAvailable;
    private Boolean couponApplied;
    private List<SelectedOption> selectedOptions;
    private List<Taxis> taxes;
    private Boolean discountsAllowed;
    private Boolean taxable;
    private Boolean giftCard;
    private Boolean isCustomerSetPrice;
}