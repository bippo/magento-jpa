package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the sales_flat_quote_address database table.
 * 
 */
@Entity
@Table(name="sales_flat_quote_address")
public class SalesFlatQuoteAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;

	@Column(name="address_type")
	private String addressType;

    @Lob()
	@Column(name="applied_taxes")
	private String appliedTaxes;

	@Column(name="base_discount_amount")
	private BigDecimal baseDiscountAmount;

	@Column(name="base_grand_total")
	private BigDecimal baseGrandTotal;

	@Column(name="base_hidden_tax_amount")
	private BigDecimal baseHiddenTaxAmount;

	@Column(name="base_shipping_amount")
	private BigDecimal baseShippingAmount;

	@Column(name="base_shipping_discount_amount")
	private BigDecimal baseShippingDiscountAmount;

	@Column(name="base_shipping_hidden_tax_amnt")
	private BigDecimal baseShippingHiddenTaxAmnt;

	@Column(name="base_shipping_incl_tax")
	private BigDecimal baseShippingInclTax;

	@Column(name="base_shipping_tax_amount")
	private BigDecimal baseShippingTaxAmount;

	@Column(name="base_subtotal")
	private BigDecimal baseSubtotal;

	@Column(name="base_subtotal_total_incl_tax")
	private BigDecimal baseSubtotalTotalInclTax;

	@Column(name="base_subtotal_with_discount")
	private BigDecimal baseSubtotalWithDiscount;

	@Column(name="base_tax_amount")
	private BigDecimal baseTaxAmount;

	private String city;

	@Column(name="collect_shipping_rates")
	private int collectShippingRates;

	private String company;

	@Column(name="country_id")
	private String countryId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="customer_address_id")
	private int customerAddressId;

	@Column(name="customer_id")
	private int customerId;

    @Lob()
	@Column(name="customer_notes")
	private String customerNotes;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

	@Column(name="discount_description")
	private String discountDescription;

	private String email;

	private String fax;

	private String firstname;

	@Column(name="free_shipping")
	private int freeShipping;

	@Column(name="gift_message_id")
	private int giftMessageId;

	@Column(name="grand_total")
	private BigDecimal grandTotal;

	@Column(name="hidden_tax_amount")
	private BigDecimal hiddenTaxAmount;

	private String lastname;

	private String middlename;

	private String postcode;

	private String prefix;

	private String region;

	@Column(name="region_id")
	private int regionId;

	@Column(name="same_as_billing")
	private int sameAsBilling;

	@Column(name="save_in_address_book")
	private short saveInAddressBook;

	@Column(name="shipping_amount")
	private BigDecimal shippingAmount;

	@Column(name="shipping_description")
	private String shippingDescription;

	@Column(name="shipping_discount_amount")
	private BigDecimal shippingDiscountAmount;

	@Column(name="shipping_hidden_tax_amount")
	private BigDecimal shippingHiddenTaxAmount;

	@Column(name="shipping_incl_tax")
	private BigDecimal shippingInclTax;

	@Column(name="shipping_method")
	private String shippingMethod;

	@Column(name="shipping_tax_amount")
	private BigDecimal shippingTaxAmount;

	private String street;

	private BigDecimal subtotal;

	@Column(name="subtotal_incl_tax")
	private BigDecimal subtotalInclTax;

	@Column(name="subtotal_with_discount")
	private BigDecimal subtotalWithDiscount;

	private String suffix;

	@Column(name="tax_amount")
	private BigDecimal taxAmount;

	private String telephone;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	private BigDecimal weight;

	//bi-directional many-to-one association to SalesFlatQuote
    @ManyToOne
	@JoinColumn(name="quote_id")
	private SalesFlatQuote salesFlatQuote;

	//bi-directional many-to-one association to SalesFlatQuoteAddressItem
	@OneToMany(mappedBy="salesFlatQuoteAddress")
	private Set<SalesFlatQuoteAddressItem> salesFlatQuoteAddressItems;

	//bi-directional many-to-one association to SalesFlatQuoteShippingRate
	@OneToMany(mappedBy="salesFlatQuoteAddress")
	private Set<SalesFlatQuoteShippingRate> salesFlatQuoteShippingRates;

    public SalesFlatQuoteAddress() {
    }

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAppliedTaxes() {
		return this.appliedTaxes;
	}

	public void setAppliedTaxes(String appliedTaxes) {
		this.appliedTaxes = appliedTaxes;
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

	public BigDecimal getBaseSubtotalTotalInclTax() {
		return this.baseSubtotalTotalInclTax;
	}

	public void setBaseSubtotalTotalInclTax(BigDecimal baseSubtotalTotalInclTax) {
		this.baseSubtotalTotalInclTax = baseSubtotalTotalInclTax;
	}

	public BigDecimal getBaseSubtotalWithDiscount() {
		return this.baseSubtotalWithDiscount;
	}

	public void setBaseSubtotalWithDiscount(BigDecimal baseSubtotalWithDiscount) {
		this.baseSubtotalWithDiscount = baseSubtotalWithDiscount;
	}

	public BigDecimal getBaseTaxAmount() {
		return this.baseTaxAmount;
	}

	public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
		this.baseTaxAmount = baseTaxAmount;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCollectShippingRates() {
		return this.collectShippingRates;
	}

	public void setCollectShippingRates(int collectShippingRates) {
		this.collectShippingRates = collectShippingRates;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getCustomerAddressId() {
		return this.customerAddressId;
	}

	public void setCustomerAddressId(int customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNotes() {
		return this.customerNotes;
	}

	public void setCustomerNotes(String customerNotes) {
		this.customerNotes = customerNotes;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountDescription() {
		return this.discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getFreeShipping() {
		return this.freeShipping;
	}

	public void setFreeShipping(int freeShipping) {
		this.freeShipping = freeShipping;
	}

	public int getGiftMessageId() {
		return this.giftMessageId;
	}

	public void setGiftMessageId(int giftMessageId) {
		this.giftMessageId = giftMessageId;
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

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getRegionId() {
		return this.regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public int getSameAsBilling() {
		return this.sameAsBilling;
	}

	public void setSameAsBilling(int sameAsBilling) {
		this.sameAsBilling = sameAsBilling;
	}

	public short getSaveInAddressBook() {
		return this.saveInAddressBook;
	}

	public void setSaveInAddressBook(short saveInAddressBook) {
		this.saveInAddressBook = saveInAddressBook;
	}

	public BigDecimal getShippingAmount() {
		return this.shippingAmount;
	}

	public void setShippingAmount(BigDecimal shippingAmount) {
		this.shippingAmount = shippingAmount;
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

	public String getShippingMethod() {
		return this.shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public BigDecimal getShippingTaxAmount() {
		return this.shippingTaxAmount;
	}

	public void setShippingTaxAmount(BigDecimal shippingTaxAmount) {
		this.shippingTaxAmount = shippingTaxAmount;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public BigDecimal getSubtotalWithDiscount() {
		return this.subtotalWithDiscount;
	}

	public void setSubtotalWithDiscount(BigDecimal subtotalWithDiscount) {
		this.subtotalWithDiscount = subtotalWithDiscount;
	}

	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public SalesFlatQuote getSalesFlatQuote() {
		return this.salesFlatQuote;
	}

	public void setSalesFlatQuote(SalesFlatQuote salesFlatQuote) {
		this.salesFlatQuote = salesFlatQuote;
	}
	
	public Set<SalesFlatQuoteAddressItem> getSalesFlatQuoteAddressItems() {
		return this.salesFlatQuoteAddressItems;
	}

	public void setSalesFlatQuoteAddressItems(Set<SalesFlatQuoteAddressItem> salesFlatQuoteAddressItems) {
		this.salesFlatQuoteAddressItems = salesFlatQuoteAddressItems;
	}
	
	public Set<SalesFlatQuoteShippingRate> getSalesFlatQuoteShippingRates() {
		return this.salesFlatQuoteShippingRates;
	}

	public void setSalesFlatQuoteShippingRates(Set<SalesFlatQuoteShippingRate> salesFlatQuoteShippingRates) {
		this.salesFlatQuoteShippingRates = salesFlatQuoteShippingRates;
	}
	
}