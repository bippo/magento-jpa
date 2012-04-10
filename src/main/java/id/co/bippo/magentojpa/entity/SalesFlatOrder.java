package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the sales_flat_order database table.
 * 
 */
@Entity
@Table(name="sales_flat_order")
public class SalesFlatOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="adjustment_negative")
	private BigDecimal adjustmentNegative;

	@Column(name="adjustment_positive")
	private BigDecimal adjustmentPositive;

	@Column(name="applied_rule_ids")
	private String appliedRuleIds;

	@Column(name="base_adjustment_negative")
	private BigDecimal baseAdjustmentNegative;

	@Column(name="base_adjustment_positive")
	private BigDecimal baseAdjustmentPositive;

	@Column(name="base_currency_code")
	private String baseCurrencyCode;

	@Column(name="base_discount_amount")
	private BigDecimal baseDiscountAmount;

	@Column(name="base_discount_canceled")
	private BigDecimal baseDiscountCanceled;

	@Column(name="base_discount_invoiced")
	private BigDecimal baseDiscountInvoiced;

	@Column(name="base_discount_refunded")
	private BigDecimal baseDiscountRefunded;

	@Column(name="base_grand_total")
	private BigDecimal baseGrandTotal;

	@Column(name="base_hidden_tax_amount")
	private BigDecimal baseHiddenTaxAmount;

	@Column(name="base_hidden_tax_invoiced")
	private BigDecimal baseHiddenTaxInvoiced;

	@Column(name="base_hidden_tax_refunded")
	private BigDecimal baseHiddenTaxRefunded;

	@Column(name="base_shipping_amount")
	private BigDecimal baseShippingAmount;

	@Column(name="base_shipping_canceled")
	private BigDecimal baseShippingCanceled;

	@Column(name="base_shipping_discount_amount")
	private BigDecimal baseShippingDiscountAmount;

	@Column(name="base_shipping_hidden_tax_amnt")
	private BigDecimal baseShippingHiddenTaxAmnt;

	@Column(name="base_shipping_incl_tax")
	private BigDecimal baseShippingInclTax;

	@Column(name="base_shipping_invoiced")
	private BigDecimal baseShippingInvoiced;

	@Column(name="base_shipping_refunded")
	private BigDecimal baseShippingRefunded;

	@Column(name="base_shipping_tax_amount")
	private BigDecimal baseShippingTaxAmount;

	@Column(name="base_shipping_tax_refunded")
	private BigDecimal baseShippingTaxRefunded;

	@Column(name="base_subtotal")
	private BigDecimal baseSubtotal;

	@Column(name="base_subtotal_canceled")
	private BigDecimal baseSubtotalCanceled;

	@Column(name="base_subtotal_incl_tax")
	private BigDecimal baseSubtotalInclTax;

	@Column(name="base_subtotal_invoiced")
	private BigDecimal baseSubtotalInvoiced;

	@Column(name="base_subtotal_refunded")
	private BigDecimal baseSubtotalRefunded;

	@Column(name="base_tax_amount")
	private BigDecimal baseTaxAmount;

	@Column(name="base_tax_canceled")
	private BigDecimal baseTaxCanceled;

	@Column(name="base_tax_invoiced")
	private BigDecimal baseTaxInvoiced;

	@Column(name="base_tax_refunded")
	private BigDecimal baseTaxRefunded;

	@Column(name="base_to_global_rate")
	private BigDecimal baseToGlobalRate;

	@Column(name="base_to_order_rate")
	private BigDecimal baseToOrderRate;

	@Column(name="base_total_canceled")
	private BigDecimal baseTotalCanceled;

	@Column(name="base_total_due")
	private BigDecimal baseTotalDue;

	@Column(name="base_total_invoiced")
	private BigDecimal baseTotalInvoiced;

	@Column(name="base_total_invoiced_cost")
	private BigDecimal baseTotalInvoicedCost;

	@Column(name="base_total_offline_refunded")
	private BigDecimal baseTotalOfflineRefunded;

	@Column(name="base_total_online_refunded")
	private BigDecimal baseTotalOnlineRefunded;

	@Column(name="base_total_paid")
	private BigDecimal baseTotalPaid;

	@Column(name="base_total_qty_ordered")
	private BigDecimal baseTotalQtyOrdered;

	@Column(name="base_total_refunded")
	private BigDecimal baseTotalRefunded;

	@Column(name="billing_address_id")
	private int billingAddressId;

	@Column(name="can_ship_partially")
	private int canShipPartially;

	@Column(name="can_ship_partially_item")
	private int canShipPartiallyItem;

	@Column(name="coupon_code")
	private String couponCode;

	@Column(name="created_at")
	private Timestamp createdAt;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="customer_dob")
	private Date customerDob;

	@Column(name="customer_email")
	private String customerEmail;

	@Column(name="customer_firstname")
	private String customerFirstname;

	@Column(name="customer_gender")
	private int customerGender;

	@Column(name="customer_group_id")
	private short customerGroupId;

	@Column(name="customer_is_guest")
	private int customerIsGuest;

	@Column(name="customer_lastname")
	private String customerLastname;

	@Column(name="customer_middlename")
	private String customerMiddlename;

    @Lob()
	@Column(name="customer_note")
	private String customerNote;

	@Column(name="customer_note_notify")
	private int customerNoteNotify;

	@Column(name="customer_prefix")
	private String customerPrefix;

	@Column(name="customer_suffix")
	private String customerSuffix;

	@Column(name="customer_taxvat")
	private String customerTaxvat;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

	@Column(name="discount_canceled")
	private BigDecimal discountCanceled;

	@Column(name="discount_description")
	private String discountDescription;

	@Column(name="discount_invoiced")
	private BigDecimal discountInvoiced;

	@Column(name="discount_refunded")
	private BigDecimal discountRefunded;

	@Column(name="edit_increment")
	private int editIncrement;

	@Column(name="email_sent")
	private int emailSent;

	@Column(name="ext_customer_id")
	private String extCustomerId;

	@Column(name="ext_order_id")
	private String extOrderId;

	@Column(name="forced_shipment_with_invoice")
	private int forcedShipmentWithInvoice;

	@Column(name="gift_message_id")
	private int giftMessageId;

	@Column(name="global_currency_code")
	private String globalCurrencyCode;

	@Column(name="grand_total")
	private BigDecimal grandTotal;

	@Column(name="hidden_tax_amount")
	private BigDecimal hiddenTaxAmount;

	@Column(name="hidden_tax_invoiced")
	private BigDecimal hiddenTaxInvoiced;

	@Column(name="hidden_tax_refunded")
	private BigDecimal hiddenTaxRefunded;

	@Column(name="hold_before_state")
	private String holdBeforeState;

	@Column(name="hold_before_status")
	private String holdBeforeStatus;

	@Column(name="increment_id")
	private String incrementId;

	@Column(name="is_virtual")
	private int isVirtual;

	@Column(name="order_currency_code")
	private String orderCurrencyCode;

	@Column(name="original_increment_id")
	private String originalIncrementId;

	@Column(name="payment_auth_expiration")
	private int paymentAuthExpiration;

	@Column(name="payment_authorization_amount")
	private BigDecimal paymentAuthorizationAmount;

	@Column(name="paypal_ipn_customer_notified")
	private int paypalIpnCustomerNotified;

	@Column(name="protect_code")
	private String protectCode;

	@Column(name="quote_address_id")
	private int quoteAddressId;

	@Column(name="quote_id")
	private int quoteId;

	@Column(name="relation_child_id")
	private String relationChildId;

	@Column(name="relation_child_real_id")
	private String relationChildRealId;

	@Column(name="relation_parent_id")
	private String relationParentId;

	@Column(name="relation_parent_real_id")
	private String relationParentRealId;

	@Column(name="remote_ip")
	private String remoteIp;

	@Column(name="shipping_address_id")
	private int shippingAddressId;

	@Column(name="shipping_amount")
	private BigDecimal shippingAmount;

	@Column(name="shipping_canceled")
	private BigDecimal shippingCanceled;

	@Column(name="shipping_description")
	private String shippingDescription;

	@Column(name="shipping_discount_amount")
	private BigDecimal shippingDiscountAmount;

	@Column(name="shipping_hidden_tax_amount")
	private BigDecimal shippingHiddenTaxAmount;

	@Column(name="shipping_incl_tax")
	private BigDecimal shippingInclTax;

	@Column(name="shipping_invoiced")
	private BigDecimal shippingInvoiced;

	@Column(name="shipping_method")
	private String shippingMethod;

	@Column(name="shipping_refunded")
	private BigDecimal shippingRefunded;

	@Column(name="shipping_tax_amount")
	private BigDecimal shippingTaxAmount;

	@Column(name="shipping_tax_refunded")
	private BigDecimal shippingTaxRefunded;

	private String state;

	private String status;

	@Column(name="store_currency_code")
	private String storeCurrencyCode;

	@Column(name="store_name")
	private String storeName;

	@Column(name="store_to_base_rate")
	private BigDecimal storeToBaseRate;

	@Column(name="store_to_order_rate")
	private BigDecimal storeToOrderRate;

	private BigDecimal subtotal;

	@Column(name="subtotal_canceled")
	private BigDecimal subtotalCanceled;

	@Column(name="subtotal_incl_tax")
	private BigDecimal subtotalInclTax;

	@Column(name="subtotal_invoiced")
	private BigDecimal subtotalInvoiced;

	@Column(name="subtotal_refunded")
	private BigDecimal subtotalRefunded;

	@Column(name="tax_amount")
	private BigDecimal taxAmount;

	@Column(name="tax_canceled")
	private BigDecimal taxCanceled;

	@Column(name="tax_invoiced")
	private BigDecimal taxInvoiced;

	@Column(name="tax_refunded")
	private BigDecimal taxRefunded;

	@Column(name="total_canceled")
	private BigDecimal totalCanceled;

	@Column(name="total_due")
	private BigDecimal totalDue;

	@Column(name="total_invoiced")
	private BigDecimal totalInvoiced;

	@Column(name="total_item_count")
	private int totalItemCount;

	@Column(name="total_offline_refunded")
	private BigDecimal totalOfflineRefunded;

	@Column(name="total_online_refunded")
	private BigDecimal totalOnlineRefunded;

	@Column(name="total_paid")
	private BigDecimal totalPaid;

	@Column(name="total_qty_ordered")
	private BigDecimal totalQtyOrdered;

	@Column(name="total_refunded")
	private BigDecimal totalRefunded;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	private BigDecimal weight;

	@Column(name="x_forwarded_for")
	private String xForwardedFor;

	//bi-directional many-to-one association to DownloadableLinkPurchased
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<DownloadableLinkPurchased> downloadableLinkPurchaseds;

	//bi-directional many-to-many association to SalesBillingAgreement
    @ManyToMany
	@JoinTable(
		name="sales_billing_agreement_order"
		, joinColumns={
			@JoinColumn(name="order_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="agreement_id")
			}
		)
	private Set<SalesBillingAgreement> salesBillingAgreements;

	//bi-directional many-to-one association to SalesFlatCreditmemo
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<SalesFlatCreditmemo> salesFlatCreditmemos;

	//bi-directional many-to-one association to SalesFlatInvoice
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<SalesFlatInvoice> salesFlatInvoices;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to SalesFlatOrderAddress
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<SalesFlatOrderAddress> salesFlatOrderAddresses;

	//bi-directional one-to-one association to SalesFlatOrderGrid
	@OneToOne(mappedBy="salesFlatOrder")
	private SalesFlatOrderGrid salesFlatOrderGrid;

	//bi-directional many-to-one association to SalesFlatOrderItem
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<SalesFlatOrderItem> salesFlatOrderItems;

	//bi-directional many-to-one association to SalesFlatOrderPayment
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<SalesFlatOrderPayment> salesFlatOrderPayments;

	//bi-directional many-to-one association to SalesFlatOrderStatusHistory
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<SalesFlatOrderStatusHistory> salesFlatOrderStatusHistories;

	//bi-directional many-to-one association to SalesFlatShipment
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<SalesFlatShipment> salesFlatShipments;

	//bi-directional many-to-one association to SalesPaymentTransaction
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<SalesPaymentTransaction> salesPaymentTransactions;

	//bi-directional many-to-one association to SalesRecurringProfileOrder
	@OneToMany(mappedBy="salesFlatOrder")
	private Set<SalesRecurringProfileOrder> salesRecurringProfileOrders;

    public SalesFlatOrder() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public BigDecimal getAdjustmentNegative() {
		return this.adjustmentNegative;
	}

	public void setAdjustmentNegative(BigDecimal adjustmentNegative) {
		this.adjustmentNegative = adjustmentNegative;
	}

	public BigDecimal getAdjustmentPositive() {
		return this.adjustmentPositive;
	}

	public void setAdjustmentPositive(BigDecimal adjustmentPositive) {
		this.adjustmentPositive = adjustmentPositive;
	}

	public String getAppliedRuleIds() {
		return this.appliedRuleIds;
	}

	public void setAppliedRuleIds(String appliedRuleIds) {
		this.appliedRuleIds = appliedRuleIds;
	}

	public BigDecimal getBaseAdjustmentNegative() {
		return this.baseAdjustmentNegative;
	}

	public void setBaseAdjustmentNegative(BigDecimal baseAdjustmentNegative) {
		this.baseAdjustmentNegative = baseAdjustmentNegative;
	}

	public BigDecimal getBaseAdjustmentPositive() {
		return this.baseAdjustmentPositive;
	}

	public void setBaseAdjustmentPositive(BigDecimal baseAdjustmentPositive) {
		this.baseAdjustmentPositive = baseAdjustmentPositive;
	}

	public String getBaseCurrencyCode() {
		return this.baseCurrencyCode;
	}

	public void setBaseCurrencyCode(String baseCurrencyCode) {
		this.baseCurrencyCode = baseCurrencyCode;
	}

	public BigDecimal getBaseDiscountAmount() {
		return this.baseDiscountAmount;
	}

	public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
		this.baseDiscountAmount = baseDiscountAmount;
	}

	public BigDecimal getBaseDiscountCanceled() {
		return this.baseDiscountCanceled;
	}

	public void setBaseDiscountCanceled(BigDecimal baseDiscountCanceled) {
		this.baseDiscountCanceled = baseDiscountCanceled;
	}

	public BigDecimal getBaseDiscountInvoiced() {
		return this.baseDiscountInvoiced;
	}

	public void setBaseDiscountInvoiced(BigDecimal baseDiscountInvoiced) {
		this.baseDiscountInvoiced = baseDiscountInvoiced;
	}

	public BigDecimal getBaseDiscountRefunded() {
		return this.baseDiscountRefunded;
	}

	public void setBaseDiscountRefunded(BigDecimal baseDiscountRefunded) {
		this.baseDiscountRefunded = baseDiscountRefunded;
	}

	public BigDecimal getBaseGrandTotal() {
		return this.baseGrandTotal;
	}

	public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
		this.baseGrandTotal = baseGrandTotal;
	}

	public BigDecimal getBaseHiddenTaxAmount() {
		return this.baseHiddenTaxAmount;
	}

	public void setBaseHiddenTaxAmount(BigDecimal baseHiddenTaxAmount) {
		this.baseHiddenTaxAmount = baseHiddenTaxAmount;
	}

	public BigDecimal getBaseHiddenTaxInvoiced() {
		return this.baseHiddenTaxInvoiced;
	}

	public void setBaseHiddenTaxInvoiced(BigDecimal baseHiddenTaxInvoiced) {
		this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
	}

	public BigDecimal getBaseHiddenTaxRefunded() {
		return this.baseHiddenTaxRefunded;
	}

	public void setBaseHiddenTaxRefunded(BigDecimal baseHiddenTaxRefunded) {
		this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
	}

	public BigDecimal getBaseShippingAmount() {
		return this.baseShippingAmount;
	}

	public void setBaseShippingAmount(BigDecimal baseShippingAmount) {
		this.baseShippingAmount = baseShippingAmount;
	}

	public BigDecimal getBaseShippingCanceled() {
		return this.baseShippingCanceled;
	}

	public void setBaseShippingCanceled(BigDecimal baseShippingCanceled) {
		this.baseShippingCanceled = baseShippingCanceled;
	}

	public BigDecimal getBaseShippingDiscountAmount() {
		return this.baseShippingDiscountAmount;
	}

	public void setBaseShippingDiscountAmount(BigDecimal baseShippingDiscountAmount) {
		this.baseShippingDiscountAmount = baseShippingDiscountAmount;
	}

	public BigDecimal getBaseShippingHiddenTaxAmnt() {
		return this.baseShippingHiddenTaxAmnt;
	}

	public void setBaseShippingHiddenTaxAmnt(BigDecimal baseShippingHiddenTaxAmnt) {
		this.baseShippingHiddenTaxAmnt = baseShippingHiddenTaxAmnt;
	}

	public BigDecimal getBaseShippingInclTax() {
		return this.baseShippingInclTax;
	}

	public void setBaseShippingInclTax(BigDecimal baseShippingInclTax) {
		this.baseShippingInclTax = baseShippingInclTax;
	}

	public BigDecimal getBaseShippingInvoiced() {
		return this.baseShippingInvoiced;
	}

	public void setBaseShippingInvoiced(BigDecimal baseShippingInvoiced) {
		this.baseShippingInvoiced = baseShippingInvoiced;
	}

	public BigDecimal getBaseShippingRefunded() {
		return this.baseShippingRefunded;
	}

	public void setBaseShippingRefunded(BigDecimal baseShippingRefunded) {
		this.baseShippingRefunded = baseShippingRefunded;
	}

	public BigDecimal getBaseShippingTaxAmount() {
		return this.baseShippingTaxAmount;
	}

	public void setBaseShippingTaxAmount(BigDecimal baseShippingTaxAmount) {
		this.baseShippingTaxAmount = baseShippingTaxAmount;
	}

	public BigDecimal getBaseShippingTaxRefunded() {
		return this.baseShippingTaxRefunded;
	}

	public void setBaseShippingTaxRefunded(BigDecimal baseShippingTaxRefunded) {
		this.baseShippingTaxRefunded = baseShippingTaxRefunded;
	}

	public BigDecimal getBaseSubtotal() {
		return this.baseSubtotal;
	}

	public void setBaseSubtotal(BigDecimal baseSubtotal) {
		this.baseSubtotal = baseSubtotal;
	}

	public BigDecimal getBaseSubtotalCanceled() {
		return this.baseSubtotalCanceled;
	}

	public void setBaseSubtotalCanceled(BigDecimal baseSubtotalCanceled) {
		this.baseSubtotalCanceled = baseSubtotalCanceled;
	}

	public BigDecimal getBaseSubtotalInclTax() {
		return this.baseSubtotalInclTax;
	}

	public void setBaseSubtotalInclTax(BigDecimal baseSubtotalInclTax) {
		this.baseSubtotalInclTax = baseSubtotalInclTax;
	}

	public BigDecimal getBaseSubtotalInvoiced() {
		return this.baseSubtotalInvoiced;
	}

	public void setBaseSubtotalInvoiced(BigDecimal baseSubtotalInvoiced) {
		this.baseSubtotalInvoiced = baseSubtotalInvoiced;
	}

	public BigDecimal getBaseSubtotalRefunded() {
		return this.baseSubtotalRefunded;
	}

	public void setBaseSubtotalRefunded(BigDecimal baseSubtotalRefunded) {
		this.baseSubtotalRefunded = baseSubtotalRefunded;
	}

	public BigDecimal getBaseTaxAmount() {
		return this.baseTaxAmount;
	}

	public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
		this.baseTaxAmount = baseTaxAmount;
	}

	public BigDecimal getBaseTaxCanceled() {
		return this.baseTaxCanceled;
	}

	public void setBaseTaxCanceled(BigDecimal baseTaxCanceled) {
		this.baseTaxCanceled = baseTaxCanceled;
	}

	public BigDecimal getBaseTaxInvoiced() {
		return this.baseTaxInvoiced;
	}

	public void setBaseTaxInvoiced(BigDecimal baseTaxInvoiced) {
		this.baseTaxInvoiced = baseTaxInvoiced;
	}

	public BigDecimal getBaseTaxRefunded() {
		return this.baseTaxRefunded;
	}

	public void setBaseTaxRefunded(BigDecimal baseTaxRefunded) {
		this.baseTaxRefunded = baseTaxRefunded;
	}

	public BigDecimal getBaseToGlobalRate() {
		return this.baseToGlobalRate;
	}

	public void setBaseToGlobalRate(BigDecimal baseToGlobalRate) {
		this.baseToGlobalRate = baseToGlobalRate;
	}

	public BigDecimal getBaseToOrderRate() {
		return this.baseToOrderRate;
	}

	public void setBaseToOrderRate(BigDecimal baseToOrderRate) {
		this.baseToOrderRate = baseToOrderRate;
	}

	public BigDecimal getBaseTotalCanceled() {
		return this.baseTotalCanceled;
	}

	public void setBaseTotalCanceled(BigDecimal baseTotalCanceled) {
		this.baseTotalCanceled = baseTotalCanceled;
	}

	public BigDecimal getBaseTotalDue() {
		return this.baseTotalDue;
	}

	public void setBaseTotalDue(BigDecimal baseTotalDue) {
		this.baseTotalDue = baseTotalDue;
	}

	public BigDecimal getBaseTotalInvoiced() {
		return this.baseTotalInvoiced;
	}

	public void setBaseTotalInvoiced(BigDecimal baseTotalInvoiced) {
		this.baseTotalInvoiced = baseTotalInvoiced;
	}

	public BigDecimal getBaseTotalInvoicedCost() {
		return this.baseTotalInvoicedCost;
	}

	public void setBaseTotalInvoicedCost(BigDecimal baseTotalInvoicedCost) {
		this.baseTotalInvoicedCost = baseTotalInvoicedCost;
	}

	public BigDecimal getBaseTotalOfflineRefunded() {
		return this.baseTotalOfflineRefunded;
	}

	public void setBaseTotalOfflineRefunded(BigDecimal baseTotalOfflineRefunded) {
		this.baseTotalOfflineRefunded = baseTotalOfflineRefunded;
	}

	public BigDecimal getBaseTotalOnlineRefunded() {
		return this.baseTotalOnlineRefunded;
	}

	public void setBaseTotalOnlineRefunded(BigDecimal baseTotalOnlineRefunded) {
		this.baseTotalOnlineRefunded = baseTotalOnlineRefunded;
	}

	public BigDecimal getBaseTotalPaid() {
		return this.baseTotalPaid;
	}

	public void setBaseTotalPaid(BigDecimal baseTotalPaid) {
		this.baseTotalPaid = baseTotalPaid;
	}

	public BigDecimal getBaseTotalQtyOrdered() {
		return this.baseTotalQtyOrdered;
	}

	public void setBaseTotalQtyOrdered(BigDecimal baseTotalQtyOrdered) {
		this.baseTotalQtyOrdered = baseTotalQtyOrdered;
	}

	public BigDecimal getBaseTotalRefunded() {
		return this.baseTotalRefunded;
	}

	public void setBaseTotalRefunded(BigDecimal baseTotalRefunded) {
		this.baseTotalRefunded = baseTotalRefunded;
	}

	public int getBillingAddressId() {
		return this.billingAddressId;
	}

	public void setBillingAddressId(int billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public int getCanShipPartially() {
		return this.canShipPartially;
	}

	public void setCanShipPartially(int canShipPartially) {
		this.canShipPartially = canShipPartially;
	}

	public int getCanShipPartiallyItem() {
		return this.canShipPartiallyItem;
	}

	public void setCanShipPartiallyItem(int canShipPartiallyItem) {
		this.canShipPartiallyItem = canShipPartiallyItem;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Date getCustomerDob() {
		return this.customerDob;
	}

	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerFirstname() {
		return this.customerFirstname;
	}

	public void setCustomerFirstname(String customerFirstname) {
		this.customerFirstname = customerFirstname;
	}

	public int getCustomerGender() {
		return this.customerGender;
	}

	public void setCustomerGender(int customerGender) {
		this.customerGender = customerGender;
	}

	public short getCustomerGroupId() {
		return this.customerGroupId;
	}

	public void setCustomerGroupId(short customerGroupId) {
		this.customerGroupId = customerGroupId;
	}

	public int getCustomerIsGuest() {
		return this.customerIsGuest;
	}

	public void setCustomerIsGuest(int customerIsGuest) {
		this.customerIsGuest = customerIsGuest;
	}

	public String getCustomerLastname() {
		return this.customerLastname;
	}

	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}

	public String getCustomerMiddlename() {
		return this.customerMiddlename;
	}

	public void setCustomerMiddlename(String customerMiddlename) {
		this.customerMiddlename = customerMiddlename;
	}

	public String getCustomerNote() {
		return this.customerNote;
	}

	public void setCustomerNote(String customerNote) {
		this.customerNote = customerNote;
	}

	public int getCustomerNoteNotify() {
		return this.customerNoteNotify;
	}

	public void setCustomerNoteNotify(int customerNoteNotify) {
		this.customerNoteNotify = customerNoteNotify;
	}

	public String getCustomerPrefix() {
		return this.customerPrefix;
	}

	public void setCustomerPrefix(String customerPrefix) {
		this.customerPrefix = customerPrefix;
	}

	public String getCustomerSuffix() {
		return this.customerSuffix;
	}

	public void setCustomerSuffix(String customerSuffix) {
		this.customerSuffix = customerSuffix;
	}

	public String getCustomerTaxvat() {
		return this.customerTaxvat;
	}

	public void setCustomerTaxvat(String customerTaxvat) {
		this.customerTaxvat = customerTaxvat;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public BigDecimal getDiscountCanceled() {
		return this.discountCanceled;
	}

	public void setDiscountCanceled(BigDecimal discountCanceled) {
		this.discountCanceled = discountCanceled;
	}

	public String getDiscountDescription() {
		return this.discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	public BigDecimal getDiscountInvoiced() {
		return this.discountInvoiced;
	}

	public void setDiscountInvoiced(BigDecimal discountInvoiced) {
		this.discountInvoiced = discountInvoiced;
	}

	public BigDecimal getDiscountRefunded() {
		return this.discountRefunded;
	}

	public void setDiscountRefunded(BigDecimal discountRefunded) {
		this.discountRefunded = discountRefunded;
	}

	public int getEditIncrement() {
		return this.editIncrement;
	}

	public void setEditIncrement(int editIncrement) {
		this.editIncrement = editIncrement;
	}

	public int getEmailSent() {
		return this.emailSent;
	}

	public void setEmailSent(int emailSent) {
		this.emailSent = emailSent;
	}

	public String getExtCustomerId() {
		return this.extCustomerId;
	}

	public void setExtCustomerId(String extCustomerId) {
		this.extCustomerId = extCustomerId;
	}

	public String getExtOrderId() {
		return this.extOrderId;
	}

	public void setExtOrderId(String extOrderId) {
		this.extOrderId = extOrderId;
	}

	public int getForcedShipmentWithInvoice() {
		return this.forcedShipmentWithInvoice;
	}

	public void setForcedShipmentWithInvoice(int forcedShipmentWithInvoice) {
		this.forcedShipmentWithInvoice = forcedShipmentWithInvoice;
	}

	public int getGiftMessageId() {
		return this.giftMessageId;
	}

	public void setGiftMessageId(int giftMessageId) {
		this.giftMessageId = giftMessageId;
	}

	public String getGlobalCurrencyCode() {
		return this.globalCurrencyCode;
	}

	public void setGlobalCurrencyCode(String globalCurrencyCode) {
		this.globalCurrencyCode = globalCurrencyCode;
	}

	public BigDecimal getGrandTotal() {
		return this.grandTotal;
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}

	public BigDecimal getHiddenTaxAmount() {
		return this.hiddenTaxAmount;
	}

	public void setHiddenTaxAmount(BigDecimal hiddenTaxAmount) {
		this.hiddenTaxAmount = hiddenTaxAmount;
	}

	public BigDecimal getHiddenTaxInvoiced() {
		return this.hiddenTaxInvoiced;
	}

	public void setHiddenTaxInvoiced(BigDecimal hiddenTaxInvoiced) {
		this.hiddenTaxInvoiced = hiddenTaxInvoiced;
	}

	public BigDecimal getHiddenTaxRefunded() {
		return this.hiddenTaxRefunded;
	}

	public void setHiddenTaxRefunded(BigDecimal hiddenTaxRefunded) {
		this.hiddenTaxRefunded = hiddenTaxRefunded;
	}

	public String getHoldBeforeState() {
		return this.holdBeforeState;
	}

	public void setHoldBeforeState(String holdBeforeState) {
		this.holdBeforeState = holdBeforeState;
	}

	public String getHoldBeforeStatus() {
		return this.holdBeforeStatus;
	}

	public void setHoldBeforeStatus(String holdBeforeStatus) {
		this.holdBeforeStatus = holdBeforeStatus;
	}

	public String getIncrementId() {
		return this.incrementId;
	}

	public void setIncrementId(String incrementId) {
		this.incrementId = incrementId;
	}

	public int getIsVirtual() {
		return this.isVirtual;
	}

	public void setIsVirtual(int isVirtual) {
		this.isVirtual = isVirtual;
	}

	public String getOrderCurrencyCode() {
		return this.orderCurrencyCode;
	}

	public void setOrderCurrencyCode(String orderCurrencyCode) {
		this.orderCurrencyCode = orderCurrencyCode;
	}

	public String getOriginalIncrementId() {
		return this.originalIncrementId;
	}

	public void setOriginalIncrementId(String originalIncrementId) {
		this.originalIncrementId = originalIncrementId;
	}

	public int getPaymentAuthExpiration() {
		return this.paymentAuthExpiration;
	}

	public void setPaymentAuthExpiration(int paymentAuthExpiration) {
		this.paymentAuthExpiration = paymentAuthExpiration;
	}

	public BigDecimal getPaymentAuthorizationAmount() {
		return this.paymentAuthorizationAmount;
	}

	public void setPaymentAuthorizationAmount(BigDecimal paymentAuthorizationAmount) {
		this.paymentAuthorizationAmount = paymentAuthorizationAmount;
	}

	public int getPaypalIpnCustomerNotified() {
		return this.paypalIpnCustomerNotified;
	}

	public void setPaypalIpnCustomerNotified(int paypalIpnCustomerNotified) {
		this.paypalIpnCustomerNotified = paypalIpnCustomerNotified;
	}

	public String getProtectCode() {
		return this.protectCode;
	}

	public void setProtectCode(String protectCode) {
		this.protectCode = protectCode;
	}

	public int getQuoteAddressId() {
		return this.quoteAddressId;
	}

	public void setQuoteAddressId(int quoteAddressId) {
		this.quoteAddressId = quoteAddressId;
	}

	public int getQuoteId() {
		return this.quoteId;
	}

	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}

	public String getRelationChildId() {
		return this.relationChildId;
	}

	public void setRelationChildId(String relationChildId) {
		this.relationChildId = relationChildId;
	}

	public String getRelationChildRealId() {
		return this.relationChildRealId;
	}

	public void setRelationChildRealId(String relationChildRealId) {
		this.relationChildRealId = relationChildRealId;
	}

	public String getRelationParentId() {
		return this.relationParentId;
	}

	public void setRelationParentId(String relationParentId) {
		this.relationParentId = relationParentId;
	}

	public String getRelationParentRealId() {
		return this.relationParentRealId;
	}

	public void setRelationParentRealId(String relationParentRealId) {
		this.relationParentRealId = relationParentRealId;
	}

	public String getRemoteIp() {
		return this.remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	public int getShippingAddressId() {
		return this.shippingAddressId;
	}

	public void setShippingAddressId(int shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public BigDecimal getShippingAmount() {
		return this.shippingAmount;
	}

	public void setShippingAmount(BigDecimal shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	public BigDecimal getShippingCanceled() {
		return this.shippingCanceled;
	}

	public void setShippingCanceled(BigDecimal shippingCanceled) {
		this.shippingCanceled = shippingCanceled;
	}

	public String getShippingDescription() {
		return this.shippingDescription;
	}

	public void setShippingDescription(String shippingDescription) {
		this.shippingDescription = shippingDescription;
	}

	public BigDecimal getShippingDiscountAmount() {
		return this.shippingDiscountAmount;
	}

	public void setShippingDiscountAmount(BigDecimal shippingDiscountAmount) {
		this.shippingDiscountAmount = shippingDiscountAmount;
	}

	public BigDecimal getShippingHiddenTaxAmount() {
		return this.shippingHiddenTaxAmount;
	}

	public void setShippingHiddenTaxAmount(BigDecimal shippingHiddenTaxAmount) {
		this.shippingHiddenTaxAmount = shippingHiddenTaxAmount;
	}

	public BigDecimal getShippingInclTax() {
		return this.shippingInclTax;
	}

	public void setShippingInclTax(BigDecimal shippingInclTax) {
		this.shippingInclTax = shippingInclTax;
	}

	public BigDecimal getShippingInvoiced() {
		return this.shippingInvoiced;
	}

	public void setShippingInvoiced(BigDecimal shippingInvoiced) {
		this.shippingInvoiced = shippingInvoiced;
	}

	public String getShippingMethod() {
		return this.shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public BigDecimal getShippingRefunded() {
		return this.shippingRefunded;
	}

	public void setShippingRefunded(BigDecimal shippingRefunded) {
		this.shippingRefunded = shippingRefunded;
	}

	public BigDecimal getShippingTaxAmount() {
		return this.shippingTaxAmount;
	}

	public void setShippingTaxAmount(BigDecimal shippingTaxAmount) {
		this.shippingTaxAmount = shippingTaxAmount;
	}

	public BigDecimal getShippingTaxRefunded() {
		return this.shippingTaxRefunded;
	}

	public void setShippingTaxRefunded(BigDecimal shippingTaxRefunded) {
		this.shippingTaxRefunded = shippingTaxRefunded;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreCurrencyCode() {
		return this.storeCurrencyCode;
	}

	public void setStoreCurrencyCode(String storeCurrencyCode) {
		this.storeCurrencyCode = storeCurrencyCode;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public BigDecimal getStoreToBaseRate() {
		return this.storeToBaseRate;
	}

	public void setStoreToBaseRate(BigDecimal storeToBaseRate) {
		this.storeToBaseRate = storeToBaseRate;
	}

	public BigDecimal getStoreToOrderRate() {
		return this.storeToOrderRate;
	}

	public void setStoreToOrderRate(BigDecimal storeToOrderRate) {
		this.storeToOrderRate = storeToOrderRate;
	}

	public BigDecimal getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getSubtotalCanceled() {
		return this.subtotalCanceled;
	}

	public void setSubtotalCanceled(BigDecimal subtotalCanceled) {
		this.subtotalCanceled = subtotalCanceled;
	}

	public BigDecimal getSubtotalInclTax() {
		return this.subtotalInclTax;
	}

	public void setSubtotalInclTax(BigDecimal subtotalInclTax) {
		this.subtotalInclTax = subtotalInclTax;
	}

	public BigDecimal getSubtotalInvoiced() {
		return this.subtotalInvoiced;
	}

	public void setSubtotalInvoiced(BigDecimal subtotalInvoiced) {
		this.subtotalInvoiced = subtotalInvoiced;
	}

	public BigDecimal getSubtotalRefunded() {
		return this.subtotalRefunded;
	}

	public void setSubtotalRefunded(BigDecimal subtotalRefunded) {
		this.subtotalRefunded = subtotalRefunded;
	}

	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public BigDecimal getTaxCanceled() {
		return this.taxCanceled;
	}

	public void setTaxCanceled(BigDecimal taxCanceled) {
		this.taxCanceled = taxCanceled;
	}

	public BigDecimal getTaxInvoiced() {
		return this.taxInvoiced;
	}

	public void setTaxInvoiced(BigDecimal taxInvoiced) {
		this.taxInvoiced = taxInvoiced;
	}

	public BigDecimal getTaxRefunded() {
		return this.taxRefunded;
	}

	public void setTaxRefunded(BigDecimal taxRefunded) {
		this.taxRefunded = taxRefunded;
	}

	public BigDecimal getTotalCanceled() {
		return this.totalCanceled;
	}

	public void setTotalCanceled(BigDecimal totalCanceled) {
		this.totalCanceled = totalCanceled;
	}

	public BigDecimal getTotalDue() {
		return this.totalDue;
	}

	public void setTotalDue(BigDecimal totalDue) {
		this.totalDue = totalDue;
	}

	public BigDecimal getTotalInvoiced() {
		return this.totalInvoiced;
	}

	public void setTotalInvoiced(BigDecimal totalInvoiced) {
		this.totalInvoiced = totalInvoiced;
	}

	public int getTotalItemCount() {
		return this.totalItemCount;
	}

	public void setTotalItemCount(int totalItemCount) {
		this.totalItemCount = totalItemCount;
	}

	public BigDecimal getTotalOfflineRefunded() {
		return this.totalOfflineRefunded;
	}

	public void setTotalOfflineRefunded(BigDecimal totalOfflineRefunded) {
		this.totalOfflineRefunded = totalOfflineRefunded;
	}

	public BigDecimal getTotalOnlineRefunded() {
		return this.totalOnlineRefunded;
	}

	public void setTotalOnlineRefunded(BigDecimal totalOnlineRefunded) {
		this.totalOnlineRefunded = totalOnlineRefunded;
	}

	public BigDecimal getTotalPaid() {
		return this.totalPaid;
	}

	public void setTotalPaid(BigDecimal totalPaid) {
		this.totalPaid = totalPaid;
	}

	public BigDecimal getTotalQtyOrdered() {
		return this.totalQtyOrdered;
	}

	public void setTotalQtyOrdered(BigDecimal totalQtyOrdered) {
		this.totalQtyOrdered = totalQtyOrdered;
	}

	public BigDecimal getTotalRefunded() {
		return this.totalRefunded;
	}

	public void setTotalRefunded(BigDecimal totalRefunded) {
		this.totalRefunded = totalRefunded;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getXForwardedFor() {
		return this.xForwardedFor;
	}

	public void setXForwardedFor(String xForwardedFor) {
		this.xForwardedFor = xForwardedFor;
	}

	public Set<DownloadableLinkPurchased> getDownloadableLinkPurchaseds() {
		return this.downloadableLinkPurchaseds;
	}

	public void setDownloadableLinkPurchaseds(Set<DownloadableLinkPurchased> downloadableLinkPurchaseds) {
		this.downloadableLinkPurchaseds = downloadableLinkPurchaseds;
	}
	
	public Set<SalesBillingAgreement> getSalesBillingAgreements() {
		return this.salesBillingAgreements;
	}

	public void setSalesBillingAgreements(Set<SalesBillingAgreement> salesBillingAgreements) {
		this.salesBillingAgreements = salesBillingAgreements;
	}
	
	public Set<SalesFlatCreditmemo> getSalesFlatCreditmemos() {
		return this.salesFlatCreditmemos;
	}

	public void setSalesFlatCreditmemos(Set<SalesFlatCreditmemo> salesFlatCreditmemos) {
		this.salesFlatCreditmemos = salesFlatCreditmemos;
	}
	
	public Set<SalesFlatInvoice> getSalesFlatInvoices() {
		return this.salesFlatInvoices;
	}

	public void setSalesFlatInvoices(Set<SalesFlatInvoice> salesFlatInvoices) {
		this.salesFlatInvoices = salesFlatInvoices;
	}
	
	public CustomerEntity getCustomerEntity() {
		return this.customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<SalesFlatOrderAddress> getSalesFlatOrderAddresses() {
		return this.salesFlatOrderAddresses;
	}

	public void setSalesFlatOrderAddresses(Set<SalesFlatOrderAddress> salesFlatOrderAddresses) {
		this.salesFlatOrderAddresses = salesFlatOrderAddresses;
	}
	
	public SalesFlatOrderGrid getSalesFlatOrderGrid() {
		return this.salesFlatOrderGrid;
	}

	public void setSalesFlatOrderGrid(SalesFlatOrderGrid salesFlatOrderGrid) {
		this.salesFlatOrderGrid = salesFlatOrderGrid;
	}
	
	public Set<SalesFlatOrderItem> getSalesFlatOrderItems() {
		return this.salesFlatOrderItems;
	}

	public void setSalesFlatOrderItems(Set<SalesFlatOrderItem> salesFlatOrderItems) {
		this.salesFlatOrderItems = salesFlatOrderItems;
	}
	
	public Set<SalesFlatOrderPayment> getSalesFlatOrderPayments() {
		return this.salesFlatOrderPayments;
	}

	public void setSalesFlatOrderPayments(Set<SalesFlatOrderPayment> salesFlatOrderPayments) {
		this.salesFlatOrderPayments = salesFlatOrderPayments;
	}
	
	public Set<SalesFlatOrderStatusHistory> getSalesFlatOrderStatusHistories() {
		return this.salesFlatOrderStatusHistories;
	}

	public void setSalesFlatOrderStatusHistories(Set<SalesFlatOrderStatusHistory> salesFlatOrderStatusHistories) {
		this.salesFlatOrderStatusHistories = salesFlatOrderStatusHistories;
	}
	
	public Set<SalesFlatShipment> getSalesFlatShipments() {
		return this.salesFlatShipments;
	}

	public void setSalesFlatShipments(Set<SalesFlatShipment> salesFlatShipments) {
		this.salesFlatShipments = salesFlatShipments;
	}
	
	public Set<SalesPaymentTransaction> getSalesPaymentTransactions() {
		return this.salesPaymentTransactions;
	}

	public void setSalesPaymentTransactions(Set<SalesPaymentTransaction> salesPaymentTransactions) {
		this.salesPaymentTransactions = salesPaymentTransactions;
	}
	
	public Set<SalesRecurringProfileOrder> getSalesRecurringProfileOrders() {
		return this.salesRecurringProfileOrders;
	}

	public void setSalesRecurringProfileOrders(Set<SalesRecurringProfileOrder> salesRecurringProfileOrders) {
		this.salesRecurringProfileOrders = salesRecurringProfileOrders;
	}
	
}