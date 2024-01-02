package model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order{
    private String id;
    private int internalId;
    private int refundedAmount;
    private int subtotal;
    private double subtotalWithoutTax;
    private int total;
    private double totalWithoutTax;
    private int giftCardRedemption;
    private int totalBeforeGiftCardRedemption;
    private boolean giftCardDoubleSpending;
    private String email;
    private String paymentMethod;
    private double tax;
    private String b2b_b2c;
    private boolean customerRequestedInvoice;
    private String customerFiscalCode;
    private String electronicInvoicePecEmail;
    private String electronicInvoiceSdiCode;
    private String ipAddress;
    private int couponDiscount;
    private String paymentStatus;
    private String fulfillmentStatus;
    private int orderNumber;
    private String vendorOrderNumber;
    private String publicUid;
    private String refererUrl;
    private String orderComments;
    private int volumeDiscount;
    private int customerId;
    private int membershipBasedDiscount;
    private int totalAndMembershipBasedDiscount;
    private List<Object> customSurcharges;
    private int discount;
    private double usdTotal;
    private String globalReferer;
    private String createDate;
    private String updateDate;
    private int createTimestamp;
    private int updateTimestamp;
    private List<Item> items;
    private List<Object> refunds;
    private List<Object> predictedPackage;
    private boolean shippingLabelAvailableForShipment;
    private List<Object> shipments;
    private AdditionalInfo additionalInfo;
    private int ticket;
    private boolean hidden;
    private List<Object> taxesOnShipping;
    private boolean disableAllCustomerNotifications;
    private boolean externalFulfillment;
    private List<Object> utmDataSets;
    private List<Invoice> invoices;
    private boolean pricesIncludeTax;
}


