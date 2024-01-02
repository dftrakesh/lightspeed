package model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
    private String id;
    private Integer internalId;
    private Integer refundedAmount;
    private Integer subtotal;
    private Double subtotalWithoutTax;
    private Integer total;
    private Double totalWithoutTax;
    private Integer giftCardRedemption;
    private Integer totalBeforeGiftCardRedemption;
    private Boolean giftCardDoubleSpending;
    private String email;
    private String paymentMethod;
    private Double tax;
    private String b2bB2c;
    private Boolean customerRequestedInvoice;
    private String customerFiscalCode;
    private String electronicInvoicePecEmail;
    private String electronicInvoiceSdiCode;
    private String ipAddress;
    private Integer couponDiscount;
    private String paymentStatus;
    private String fulfillmentStatus;
    private Integer orderNumber;
    private String vendorOrderNumber;
    private String publicUid;
    private String refererUrl;
    private String orderComments;
    private Integer volumeDiscount;
    private Integer customerId;
    private Integer membershipBasedDiscount;
    private Integer totalAndMembershipBasedDiscount;
    private Integer discount;
    private Double usdTotal;
    private String globalReferer;
    private String createDate;
    private String updateDate;
    private Integer createTimestamp;
    private Integer updateTimestamp;
    private List<Item> items;
    private Boolean shippingLabelAvailableForShipment;
    private AdditionalInfo additionalInfo;
    private Integer ticket;
    private Boolean hidden;
    private Boolean disableAllCustomerNotifications;
    private Boolean externalFulfillment;
    private List<Invoice> invoices;
    private Boolean pricesIncludeTax;
}


