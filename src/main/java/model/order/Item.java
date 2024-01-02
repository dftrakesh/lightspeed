package model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item{
    private int id;
    private int productId;
    private int categoryId;
    private int price;
    private double priceWithoutTax;
    private int productPrice;
    private String sku;
    private int quantity;
    private String shortDescription;
    private ShortDescriptionTranslated shortDescriptionTranslated;
    private double tax;
    private int shipping;
    private int quantityInStock;
    private String name;
    private NameTranslated nameTranslated;
    private boolean isShippingRequired;
    private int weight;
    private boolean trackQuantity;
    private boolean fixedShippingRateOnly;
    private String imageUrl;
    private String smallThumbnailUrl;
    private String hdThumbnailUrl;
    private int fixedShippingRate;
    private boolean digital;
    private boolean productAvailable;
    private boolean couponApplied;
    private List<SelectedOption> selectedOptions;
    private List<Taxis> taxes;
    private boolean discountsAllowed;
    private boolean taxable;
    private boolean giftCard;
    private boolean isCustomerSetPrice;
    private List<Object> attributes;
}