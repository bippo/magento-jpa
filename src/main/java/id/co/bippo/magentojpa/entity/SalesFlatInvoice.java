package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the sales_flat_invoice database table.
 * 
 */
@Entity
@Table(name="sales_flat_invoice")
public class SalesFlatInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="base_currency_code")
	private String baseCurrencyCode;

	@Column(name="base_discount_amount")
	private BigDecimal baseDiscountAmount;

	@Column(name="base_grand_total")
	private BigDecimal baseGrandTotal;

	@Column(name="base_hidden_tax_amount")
	private BigDecimal baseHiddenTaxAmount;

	@Column(name="base_shipping_amount")
	private BigDecimal baseShippingAmount;

	@Column(name="base_shipping_hidden_tax_amnt")
	private BigDecimal baseShippingHiddenTaxAmnt;

	@Column(name="base_shipping_incl_tax")
	private BigDecimal baseShippingInclTax;

	@Column(name="base_shipping_tax_amount")
	private BigDecimal baseShippingTaxAmount;

	@Column(name="base_subtotal")
	private BigDecimal baseSubtotal;

	@Column(name="base_subtotal_incl_tax")
	private BigDecimal baseSubtotalInclTax;

	@Column(name="base_tax_amount")
	private BigDecimal baseTaxAmount;

	@Column(name="base_to_global_rate")
	private BigDecimal baseToGlobalRate;

	@Column(name="base_to_order_rate")
	private BigDecimal baseToOrderRate;

	@Column(name="base_total_refunded")
	private BigDecimal baseTotalRefunded;

	@Column(name="billing_address_id")
	private int billingAddressId;

	@Column(name="can_void_flag")
	private int canVoidFlag;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="cybersource_token")
	private String cybersourceToken;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

	@Column(name="email_sent")
	private int emailSent;

	@Column(name="global_currency_code")
	private String globalCurrencyCode;

	@Column(name="grand_total")
	private BigDecimal grandTotal;

	@Column(name="hidden_tax_amount")
	private BigDecimal hiddenTaxAmount;

	@Column(name="increment_id")
	private String incrementId;

	@Column(name="is_used_for_refund")
	private int isUsedForRefund;

	@Column(name="order_currency_code")
	private String orderCurrencyCode;

	@Column(name="shipping_address_id")
	private int shippingAddressId;

	@Column(name="shipping_amount")
	private BigDecimal shippingAmount;

	@Column(name="shipping_hidden_tax_amount")
	private BigDecimal shippingHiddenTaxAmount;

	@Column(name="shipping_incl_tax")
	private BigDecimal shippingInclTax;

	@Column(name="shipping_tax_amount")
	private BigDecimal shippingTaxAmount;

	private int state;

	@Column(name="store_currency_code")
	private String storeCurrencyCode;

	@Column(name="store_to_base_rate")
	private BigDecimal storeToBaseRate;

	@Column(name="store_to_order_rate")
	private BigDecimal storeToOrderRate;

	private BigDecimal subtotal;

	@Column(name="subtotal_incl_tax")
	private BigDecimal subtotalInclTax;

	@Column(name="tax_amount")
	private BigDecimal taxAmount;

	@Column(name="total_qty")
	private BigDecimal totalQty;

	@Column(name="transaction_id")
	private String transactionId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to SalesFlatOrder
    @ManyToOne
	@JoinColumn(name="order_id")
	private SalesFlatOrder salesFlatOrder;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to SalesFlatInvoiceComment
	@OneToMany(mappedBy="salesFlatInvoice")
	private Set<SalesFlatInvoiceComment> salesFlatInvoiceComments;

	//bi-directional one-to-one association to SalesFlatInvoiceGrid
	@OneToOne(mappedBy="salesFlatInvoice")
	private SalesFlatInvoiceGrid salesFlatInvoiceGrid;

	//bi-directional many-to-one association to SalesFlatInvoiceItem
	@OneToMany(mappedBy="salesFlatInvoice")
	private Set<SalesFlatInvoiceItem> salesFlatInvoiceItems;

    public SalesFlatInvoice() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
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

	public BigDecimal getBaseShippingAmount() {
		return this.baseShippingAmount;
	}

	public void setBaseShippingAmount(BigDecimal baseShippingAmount) {
		this.baseShippingAmount = baseShippingAmount;
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

	public BigDecimal getBaseShippingTaxAmount() {
		return this.baseShippingTaxAmount;
	}

	public void setBaseShippingTaxAmount(BigDecimal baseShippingTaxAmount) {
		this.baseShippingTaxAmount = baseShippingTaxAmount;
	}

	public BigDecimal getBaseSubtotal() {
		return this.baseSubtotal;
	}

	public void setBaseSubtotal(BigDecimal baseSubtotal) {
		this.baseSubtotal = baseSubtotal;
	}

	public BigDecimal getBaseSubtotalInclTax() {
		return this.baseSubtotalInclTax;
	}

	public void setBaseSubtotalInclTax(BigDecimal baseSubtotalInclTax) {
		this.baseSubtotalInclTax = baseSubtotalInclTax;
	}

	public BigDecimal getBaseTaxAmount() {
		return this.baseTaxAmount;
	}

	public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
		this.baseTaxAmount = baseTaxAmount;
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

	public int getCanVoidFlag() {
		return this.canVoidFlag;
	}

	public void setCanVoidFlag(int canVoidFlag) {
		this.canVoidFlag = canVoidFlag;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getCybersourceToken() {
		return this.cybersourceToken;
	}

	public void setCybersourceToken(String cybersourceToken) {
		this.cybersourceToken = cybersourceToken;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getEmailSent() {
		return this.emailSent;
	}

	public void setEmailSent(int emailSent) {
		this.emailSent = emailSent;
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

	public String getIncrementId() {
		return this.incrementId;
	}

	public void setIncrementId(String incrementId) {
		this.incrementId = incrementId;
	}

	public int getIsUsedForRefund() {
		return this.isUsedForRefund;
	}

	public void setIsUsedForRefund(int isUsedForRefund) {
		this.isUsedForRefund = isUsedForRefund;
	}

	public String getOrderCurrencyCode() {
		return this.orderCurrencyCode;
	}

	public void setOrderCurrencyCode(String orderCurrencyCode) {
		this.orderCurrencyCode = orderCurrencyCode;
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

	public BigDecimal getShippingTaxAmount() {
		return this.shippingTaxAmount;
	}

	public void setShippingTaxAmount(BigDecimal shippingTaxAmount) {
		this.shippingTaxAmount = shippingTaxAmount;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStoreCurrencyCode() {
		return this.storeCurrencyCode;
	}

	public void setStoreCurrencyCode(String storeCurrencyCode) {
		this.storeCurrencyCode = storeCurrencyCode;
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

	public BigDecimal getSubtotalInclTax() {
		return this.subtotalInclTax;
	}

	public void setSubtotalInclTax(BigDecimal subtotalInclTax) {
		this.subtotalInclTax = subtotalInclTax;
	}

	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public BigDecimal getTotalQty() {
		return this.totalQty;
	}

	public void setTotalQty(BigDecimal totalQty) {
		this.totalQty = totalQty;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public SalesFlatOrder getSalesFlatOrder() {
		return this.salesFlatOrder;
	}

	public void setSalesFlatOrder(SalesFlatOrder salesFlatOrder) {
		this.salesFlatOrder = salesFlatOrder;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<SalesFlatInvoiceComment> getSalesFlatInvoiceComments() {
		return this.salesFlatInvoiceComments;
	}

	public void setSalesFlatInvoiceComments(Set<SalesFlatInvoiceComment> salesFlatInvoiceComments) {
		this.salesFlatInvoiceComments = salesFlatInvoiceComments;
	}
	
	public SalesFlatInvoiceGrid getSalesFlatInvoiceGrid() {
		return this.salesFlatInvoiceGrid;
	}

	public void setSalesFlatInvoiceGrid(SalesFlatInvoiceGrid salesFlatInvoiceGrid) {
		this.salesFlatInvoiceGrid = salesFlatInvoiceGrid;
	}
	
	public Set<SalesFlatInvoiceItem> getSalesFlatInvoiceItems() {
		return this.salesFlatInvoiceItems;
	}

	public void setSalesFlatInvoiceItems(Set<SalesFlatInvoiceItem> salesFlatInvoiceItems) {
		this.salesFlatInvoiceItems = salesFlatInvoiceItems;
	}
	
}