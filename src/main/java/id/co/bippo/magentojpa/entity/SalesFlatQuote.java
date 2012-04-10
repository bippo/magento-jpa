package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the sales_flat_quote database table.
 * 
 */
@Entity
@Table(name="sales_flat_quote")
public class SalesFlatQuote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="applied_rule_ids")
	private String appliedRuleIds;

	@Column(name="base_currency_code")
	private String baseCurrencyCode;

	@Column(name="base_grand_total")
	private BigDecimal baseGrandTotal;

	@Column(name="base_subtotal")
	private BigDecimal baseSubtotal;

	@Column(name="base_subtotal_with_discount")
	private BigDecimal baseSubtotalWithDiscount;

	@Column(name="base_to_global_rate")
	private BigDecimal baseToGlobalRate;

	@Column(name="base_to_quote_rate")
	private BigDecimal baseToQuoteRate;

	@Column(name="checkout_method")
	private String checkoutMethod;

	@Column(name="converted_at")
	private Timestamp convertedAt;

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
	private String customerGender;

	@Column(name="customer_group_id")
	private int customerGroupId;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="customer_is_guest")
	private int customerIsGuest;

	@Column(name="customer_lastname")
	private String customerLastname;

	@Column(name="customer_middlename")
	private String customerMiddlename;

	@Column(name="customer_note")
	private String customerNote;

	@Column(name="customer_note_notify")
	private int customerNoteNotify;

	@Column(name="customer_prefix")
	private String customerPrefix;

	@Column(name="customer_suffix")
	private String customerSuffix;

	@Column(name="customer_tax_class_id")
	private int customerTaxClassId;

	@Column(name="customer_taxvat")
	private String customerTaxvat;

    @Lob()
	@Column(name="ext_shipping_info")
	private String extShippingInfo;

	@Column(name="gift_message_id")
	private int giftMessageId;

	@Column(name="global_currency_code")
	private String globalCurrencyCode;

	@Column(name="grand_total")
	private BigDecimal grandTotal;

	@Column(name="is_active")
	private int isActive;

	@Column(name="is_changed")
	private int isChanged;

	@Column(name="is_multi_shipping")
	private int isMultiShipping;

	@Column(name="is_persistent")
	private int isPersistent;

	@Column(name="is_virtual")
	private int isVirtual;

	@Column(name="items_count")
	private int itemsCount;

	@Column(name="items_qty")
	private BigDecimal itemsQty;

	@Column(name="orig_order_id")
	private int origOrderId;

	@Column(name="password_hash")
	private String passwordHash;

	@Column(name="quote_currency_code")
	private String quoteCurrencyCode;

	@Column(name="remote_ip")
	private String remoteIp;

	@Column(name="reserved_order_id")
	private String reservedOrderId;

	@Column(name="store_currency_code")
	private String storeCurrencyCode;

	@Column(name="store_to_base_rate")
	private BigDecimal storeToBaseRate;

	@Column(name="store_to_quote_rate")
	private BigDecimal storeToQuoteRate;

	private BigDecimal subtotal;

	@Column(name="subtotal_with_discount")
	private BigDecimal subtotalWithDiscount;

	@Column(name="trigger_recollect")
	private short triggerRecollect;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to SalesFlatQuoteAddress
	@OneToMany(mappedBy="salesFlatQuote")
	private Set<SalesFlatQuoteAddress> salesFlatQuoteAddresses;

	//bi-directional many-to-one association to SalesFlatQuoteItem
	@OneToMany(mappedBy="salesFlatQuote")
	private Set<SalesFlatQuoteItem> salesFlatQuoteItems;

	//bi-directional many-to-one association to SalesFlatQuotePayment
	@OneToMany(mappedBy="salesFlatQuote")
	private Set<SalesFlatQuotePayment> salesFlatQuotePayments;

    public SalesFlatQuote() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getAppliedRuleIds() {
		return this.appliedRuleIds;
	}

	public void setAppliedRuleIds(String appliedRuleIds) {
		this.appliedRuleIds = appliedRuleIds;
	}

	public String getBaseCurrencyCode() {
		return this.baseCurrencyCode;
	}

	public void setBaseCurrencyCode(String baseCurrencyCode) {
		this.baseCurrencyCode = baseCurrencyCode;
	}

	public BigDecimal getBaseGrandTotal() {
		return this.baseGrandTotal;
	}

	public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
		this.baseGrandTotal = baseGrandTotal;
	}

	public BigDecimal getBaseSubtotal() {
		return this.baseSubtotal;
	}

	public void setBaseSubtotal(BigDecimal baseSubtotal) {
		this.baseSubtotal = baseSubtotal;
	}

	public BigDecimal getBaseSubtotalWithDiscount() {
		return this.baseSubtotalWithDiscount;
	}

	public void setBaseSubtotalWithDiscount(BigDecimal baseSubtotalWithDiscount) {
		this.baseSubtotalWithDiscount = baseSubtotalWithDiscount;
	}

	public BigDecimal getBaseToGlobalRate() {
		return this.baseToGlobalRate;
	}

	public void setBaseToGlobalRate(BigDecimal baseToGlobalRate) {
		this.baseToGlobalRate = baseToGlobalRate;
	}

	public BigDecimal getBaseToQuoteRate() {
		return this.baseToQuoteRate;
	}

	public void setBaseToQuoteRate(BigDecimal baseToQuoteRate) {
		this.baseToQuoteRate = baseToQuoteRate;
	}

	public String getCheckoutMethod() {
		return this.checkoutMethod;
	}

	public void setCheckoutMethod(String checkoutMethod) {
		this.checkoutMethod = checkoutMethod;
	}

	public Timestamp getConvertedAt() {
		return this.convertedAt;
	}

	public void setConvertedAt(Timestamp convertedAt) {
		this.convertedAt = convertedAt;
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

	public String getCustomerGender() {
		return this.customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public int getCustomerGroupId() {
		return this.customerGroupId;
	}

	public void setCustomerGroupId(int customerGroupId) {
		this.customerGroupId = customerGroupId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public int getCustomerTaxClassId() {
		return this.customerTaxClassId;
	}

	public void setCustomerTaxClassId(int customerTaxClassId) {
		this.customerTaxClassId = customerTaxClassId;
	}

	public String getCustomerTaxvat() {
		return this.customerTaxvat;
	}

	public void setCustomerTaxvat(String customerTaxvat) {
		this.customerTaxvat = customerTaxvat;
	}

	public String getExtShippingInfo() {
		return this.extShippingInfo;
	}

	public void setExtShippingInfo(String extShippingInfo) {
		this.extShippingInfo = extShippingInfo;
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

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsChanged() {
		return this.isChanged;
	}

	public void setIsChanged(int isChanged) {
		this.isChanged = isChanged;
	}

	public int getIsMultiShipping() {
		return this.isMultiShipping;
	}

	public void setIsMultiShipping(int isMultiShipping) {
		this.isMultiShipping = isMultiShipping;
	}

	public int getIsPersistent() {
		return this.isPersistent;
	}

	public void setIsPersistent(int isPersistent) {
		this.isPersistent = isPersistent;
	}

	public int getIsVirtual() {
		return this.isVirtual;
	}

	public void setIsVirtual(int isVirtual) {
		this.isVirtual = isVirtual;
	}

	public int getItemsCount() {
		return this.itemsCount;
	}

	public void setItemsCount(int itemsCount) {
		this.itemsCount = itemsCount;
	}

	public BigDecimal getItemsQty() {
		return this.itemsQty;
	}

	public void setItemsQty(BigDecimal itemsQty) {
		this.itemsQty = itemsQty;
	}

	public int getOrigOrderId() {
		return this.origOrderId;
	}

	public void setOrigOrderId(int origOrderId) {
		this.origOrderId = origOrderId;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getQuoteCurrencyCode() {
		return this.quoteCurrencyCode;
	}

	public void setQuoteCurrencyCode(String quoteCurrencyCode) {
		this.quoteCurrencyCode = quoteCurrencyCode;
	}

	public String getRemoteIp() {
		return this.remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	public String getReservedOrderId() {
		return this.reservedOrderId;
	}

	public void setReservedOrderId(String reservedOrderId) {
		this.reservedOrderId = reservedOrderId;
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

	public BigDecimal getStoreToQuoteRate() {
		return this.storeToQuoteRate;
	}

	public void setStoreToQuoteRate(BigDecimal storeToQuoteRate) {
		this.storeToQuoteRate = storeToQuoteRate;
	}

	public BigDecimal getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getSubtotalWithDiscount() {
		return this.subtotalWithDiscount;
	}

	public void setSubtotalWithDiscount(BigDecimal subtotalWithDiscount) {
		this.subtotalWithDiscount = subtotalWithDiscount;
	}

	public short getTriggerRecollect() {
		return this.triggerRecollect;
	}

	public void setTriggerRecollect(short triggerRecollect) {
		this.triggerRecollect = triggerRecollect;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<SalesFlatQuoteAddress> getSalesFlatQuoteAddresses() {
		return this.salesFlatQuoteAddresses;
	}

	public void setSalesFlatQuoteAddresses(Set<SalesFlatQuoteAddress> salesFlatQuoteAddresses) {
		this.salesFlatQuoteAddresses = salesFlatQuoteAddresses;
	}
	
	public Set<SalesFlatQuoteItem> getSalesFlatQuoteItems() {
		return this.salesFlatQuoteItems;
	}

	public void setSalesFlatQuoteItems(Set<SalesFlatQuoteItem> salesFlatQuoteItems) {
		this.salesFlatQuoteItems = salesFlatQuoteItems;
	}
	
	public Set<SalesFlatQuotePayment> getSalesFlatQuotePayments() {
		return this.salesFlatQuotePayments;
	}

	public void setSalesFlatQuotePayments(Set<SalesFlatQuotePayment> salesFlatQuotePayments) {
		this.salesFlatQuotePayments = salesFlatQuotePayments;
	}
	
}