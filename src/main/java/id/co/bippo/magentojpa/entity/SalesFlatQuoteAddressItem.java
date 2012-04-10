package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the sales_flat_quote_address_item database table.
 * 
 */
@Entity
@Table(name="sales_flat_quote_address_item")
public class SalesFlatQuoteAddressItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_item_id")
	private int addressItemId;

    @Lob()
	@Column(name="additional_data")
	private String additionalData;

    @Lob()
	@Column(name="applied_rule_ids")
	private String appliedRuleIds;

	@Column(name="base_cost")
	private BigDecimal baseCost;

	@Column(name="base_discount_amount")
	private BigDecimal baseDiscountAmount;

	@Column(name="base_hidden_tax_amount")
	private BigDecimal baseHiddenTaxAmount;

	@Column(name="base_price")
	private BigDecimal basePrice;

	@Column(name="base_price_incl_tax")
	private BigDecimal basePriceInclTax;

	@Column(name="base_row_total")
	private BigDecimal baseRowTotal;

	@Column(name="base_row_total_incl_tax")
	private BigDecimal baseRowTotalInclTax;

	@Column(name="base_tax_amount")
	private BigDecimal baseTaxAmount;

	@Column(name="created_at")
	private Timestamp createdAt;

    @Lob()
	private String description;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

	@Column(name="discount_percent")
	private BigDecimal discountPercent;

	@Column(name="free_shipping")
	private int freeShipping;

	@Column(name="gift_message_id")
	private int giftMessageId;

	@Column(name="hidden_tax_amount")
	private BigDecimal hiddenTaxAmount;

	private String image;

	@Column(name="is_qty_decimal")
	private int isQtyDecimal;

	private String name;

	@Column(name="no_discount")
	private int noDiscount;

	@Column(name="parent_product_id")
	private int parentProductId;

	private BigDecimal price;

	@Column(name="price_incl_tax")
	private BigDecimal priceInclTax;

	@Column(name="product_id")
	private int productId;

	private BigDecimal qty;

	@Column(name="row_total")
	private BigDecimal rowTotal;

	@Column(name="row_total_incl_tax")
	private BigDecimal rowTotalInclTax;

	@Column(name="row_total_with_discount")
	private BigDecimal rowTotalWithDiscount;

	@Column(name="row_weight")
	private BigDecimal rowWeight;

	private String sku;

	@Column(name="super_product_id")
	private int superProductId;

	@Column(name="tax_amount")
	private BigDecimal taxAmount;

	@Column(name="tax_percent")
	private BigDecimal taxPercent;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	private BigDecimal weight;

	//bi-directional many-to-one association to SalesFlatQuoteItem
    @ManyToOne
	@JoinColumn(name="quote_item_id")
	private SalesFlatQuoteItem salesFlatQuoteItem;

	//bi-directional many-to-one association to SalesFlatQuoteAddressItem
    @ManyToOne
	@JoinColumn(name="parent_item_id")
	private SalesFlatQuoteAddressItem salesFlatQuoteAddressItem;

	//bi-directional many-to-one association to SalesFlatQuoteAddressItem
	@OneToMany(mappedBy="salesFlatQuoteAddressItem")
	private Set<SalesFlatQuoteAddressItem> salesFlatQuoteAddressItems;

	//bi-directional many-to-one association to SalesFlatQuoteAddress
    @ManyToOne
	@JoinColumn(name="quote_address_id")
	private SalesFlatQuoteAddress salesFlatQuoteAddress;

    public SalesFlatQuoteAddressItem() {
    }

	public int getAddressItemId() {
		return this.addressItemId;
	}

	public void setAddressItemId(int addressItemId) {
		this.addressItemId = addressItemId;
	}

	public String getAdditionalData() {
		return this.additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}

	public String getAppliedRuleIds() {
		return this.appliedRuleIds;
	}

	public void setAppliedRuleIds(String appliedRuleIds) {
		this.appliedRuleIds = appliedRuleIds;
	}

	public BigDecimal getBaseCost() {
		return this.baseCost;
	}

	public void setBaseCost(BigDecimal baseCost) {
		this.baseCost = baseCost;
	}

	public BigDecimal getBaseDiscountAmount() {
		return this.baseDiscountAmount;
	}

	public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
		this.baseDiscountAmount = baseDiscountAmount;
	}

	public BigDecimal getBaseHiddenTaxAmount() {
		return this.baseHiddenTaxAmount;
	}

	public void setBaseHiddenTaxAmount(BigDecimal baseHiddenTaxAmount) {
		this.baseHiddenTaxAmount = baseHiddenTaxAmount;
	}

	public BigDecimal getBasePrice() {
		return this.basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public BigDecimal getBasePriceInclTax() {
		return this.basePriceInclTax;
	}

	public void setBasePriceInclTax(BigDecimal basePriceInclTax) {
		this.basePriceInclTax = basePriceInclTax;
	}

	public BigDecimal getBaseRowTotal() {
		return this.baseRowTotal;
	}

	public void setBaseRowTotal(BigDecimal baseRowTotal) {
		this.baseRowTotal = baseRowTotal;
	}

	public BigDecimal getBaseRowTotalInclTax() {
		return this.baseRowTotalInclTax;
	}

	public void setBaseRowTotalInclTax(BigDecimal baseRowTotalInclTax) {
		this.baseRowTotalInclTax = baseRowTotalInclTax;
	}

	public BigDecimal getBaseTaxAmount() {
		return this.baseTaxAmount;
	}

	public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
		this.baseTaxAmount = baseTaxAmount;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public BigDecimal getDiscountPercent() {
		return this.discountPercent;
	}

	public void setDiscountPercent(BigDecimal discountPercent) {
		this.discountPercent = discountPercent;
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

	public BigDecimal getHiddenTaxAmount() {
		return this.hiddenTaxAmount;
	}

	public void setHiddenTaxAmount(BigDecimal hiddenTaxAmount) {
		this.hiddenTaxAmount = hiddenTaxAmount;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getIsQtyDecimal() {
		return this.isQtyDecimal;
	}

	public void setIsQtyDecimal(int isQtyDecimal) {
		this.isQtyDecimal = isQtyDecimal;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoDiscount() {
		return this.noDiscount;
	}

	public void setNoDiscount(int noDiscount) {
		this.noDiscount = noDiscount;
	}

	public int getParentProductId() {
		return this.parentProductId;
	}

	public void setParentProductId(int parentProductId) {
		this.parentProductId = parentProductId;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPriceInclTax() {
		return this.priceInclTax;
	}

	public void setPriceInclTax(BigDecimal priceInclTax) {
		this.priceInclTax = priceInclTax;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public BigDecimal getRowTotal() {
		return this.rowTotal;
	}

	public void setRowTotal(BigDecimal rowTotal) {
		this.rowTotal = rowTotal;
	}

	public BigDecimal getRowTotalInclTax() {
		return this.rowTotalInclTax;
	}

	public void setRowTotalInclTax(BigDecimal rowTotalInclTax) {
		this.rowTotalInclTax = rowTotalInclTax;
	}

	public BigDecimal getRowTotalWithDiscount() {
		return this.rowTotalWithDiscount;
	}

	public void setRowTotalWithDiscount(BigDecimal rowTotalWithDiscount) {
		this.rowTotalWithDiscount = rowTotalWithDiscount;
	}

	public BigDecimal getRowWeight() {
		return this.rowWeight;
	}

	public void setRowWeight(BigDecimal rowWeight) {
		this.rowWeight = rowWeight;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getSuperProductId() {
		return this.superProductId;
	}

	public void setSuperProductId(int superProductId) {
		this.superProductId = superProductId;
	}

	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public void setTaxPercent(BigDecimal taxPercent) {
		this.taxPercent = taxPercent;
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

	public SalesFlatQuoteItem getSalesFlatQuoteItem() {
		return this.salesFlatQuoteItem;
	}

	public void setSalesFlatQuoteItem(SalesFlatQuoteItem salesFlatQuoteItem) {
		this.salesFlatQuoteItem = salesFlatQuoteItem;
	}
	
	public SalesFlatQuoteAddressItem getSalesFlatQuoteAddressItem() {
		return this.salesFlatQuoteAddressItem;
	}

	public void setSalesFlatQuoteAddressItem(SalesFlatQuoteAddressItem salesFlatQuoteAddressItem) {
		this.salesFlatQuoteAddressItem = salesFlatQuoteAddressItem;
	}
	
	public Set<SalesFlatQuoteAddressItem> getSalesFlatQuoteAddressItems() {
		return this.salesFlatQuoteAddressItems;
	}

	public void setSalesFlatQuoteAddressItems(Set<SalesFlatQuoteAddressItem> salesFlatQuoteAddressItems) {
		this.salesFlatQuoteAddressItems = salesFlatQuoteAddressItems;
	}
	
	public SalesFlatQuoteAddress getSalesFlatQuoteAddress() {
		return this.salesFlatQuoteAddress;
	}

	public void setSalesFlatQuoteAddress(SalesFlatQuoteAddress salesFlatQuoteAddress) {
		this.salesFlatQuoteAddress = salesFlatQuoteAddress;
	}
	
}