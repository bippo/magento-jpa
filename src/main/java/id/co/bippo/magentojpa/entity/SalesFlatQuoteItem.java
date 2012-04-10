package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the sales_flat_quote_item database table.
 * 
 */
@Entity
@Table(name="sales_flat_quote_item")
public class SalesFlatQuoteItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id")
	private int itemId;

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

	@Column(name="base_tax_before_discount")
	private BigDecimal baseTaxBeforeDiscount;

	@Column(name="base_weee_tax_applied_amount")
	private BigDecimal baseWeeeTaxAppliedAmount;

	@Column(name="base_weee_tax_applied_row_amnt")
	private BigDecimal baseWeeeTaxAppliedRowAmnt;

	@Column(name="base_weee_tax_disposition")
	private BigDecimal baseWeeeTaxDisposition;

	@Column(name="base_weee_tax_row_disposition")
	private BigDecimal baseWeeeTaxRowDisposition;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="custom_price")
	private BigDecimal customPrice;

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

	@Column(name="is_qty_decimal")
	private int isQtyDecimal;

	@Column(name="is_virtual")
	private int isVirtual;

	private String name;

	@Column(name="no_discount")
	private int noDiscount;

	@Column(name="original_custom_price")
	private BigDecimal originalCustomPrice;

	private BigDecimal price;

	@Column(name="price_incl_tax")
	private BigDecimal priceInclTax;

	@Column(name="product_type")
	private String productType;

	private BigDecimal qty;

	@Column(name="redirect_url")
	private String redirectUrl;

	@Column(name="row_total")
	private BigDecimal rowTotal;

	@Column(name="row_total_incl_tax")
	private BigDecimal rowTotalInclTax;

	@Column(name="row_total_with_discount")
	private BigDecimal rowTotalWithDiscount;

	@Column(name="row_weight")
	private BigDecimal rowWeight;

	private String sku;

	@Column(name="tax_amount")
	private BigDecimal taxAmount;

	@Column(name="tax_before_discount")
	private BigDecimal taxBeforeDiscount;

	@Column(name="tax_percent")
	private BigDecimal taxPercent;

	@Column(name="updated_at")
	private Timestamp updatedAt;

    @Lob()
	@Column(name="weee_tax_applied")
	private String weeeTaxApplied;

	@Column(name="weee_tax_applied_amount")
	private BigDecimal weeeTaxAppliedAmount;

	@Column(name="weee_tax_applied_row_amount")
	private BigDecimal weeeTaxAppliedRowAmount;

	@Column(name="weee_tax_disposition")
	private BigDecimal weeeTaxDisposition;

	@Column(name="weee_tax_row_disposition")
	private BigDecimal weeeTaxRowDisposition;

	private BigDecimal weight;

	//bi-directional many-to-one association to SalesFlatQuoteAddressItem
	@OneToMany(mappedBy="salesFlatQuoteItem")
	private Set<SalesFlatQuoteAddressItem> salesFlatQuoteAddressItems;

	//bi-directional many-to-one association to SalesFlatQuoteItem
    @ManyToOne
	@JoinColumn(name="parent_item_id")
	private SalesFlatQuoteItem salesFlatQuoteItem;

	//bi-directional many-to-one association to SalesFlatQuoteItem
	@OneToMany(mappedBy="salesFlatQuoteItem")
	private Set<SalesFlatQuoteItem> salesFlatQuoteItems;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to SalesFlatQuote
    @ManyToOne
	@JoinColumn(name="quote_id")
	private SalesFlatQuote salesFlatQuote;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to SalesFlatQuoteItemOption
	@OneToMany(mappedBy="salesFlatQuoteItem")
	private Set<SalesFlatQuoteItemOption> salesFlatQuoteItemOptions;

    public SalesFlatQuoteItem() {
    }

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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

	public BigDecimal getBaseTaxBeforeDiscount() {
		return this.baseTaxBeforeDiscount;
	}

	public void setBaseTaxBeforeDiscount(BigDecimal baseTaxBeforeDiscount) {
		this.baseTaxBeforeDiscount = baseTaxBeforeDiscount;
	}

	public BigDecimal getBaseWeeeTaxAppliedAmount() {
		return this.baseWeeeTaxAppliedAmount;
	}

	public void setBaseWeeeTaxAppliedAmount(BigDecimal baseWeeeTaxAppliedAmount) {
		this.baseWeeeTaxAppliedAmount = baseWeeeTaxAppliedAmount;
	}

	public BigDecimal getBaseWeeeTaxAppliedRowAmnt() {
		return this.baseWeeeTaxAppliedRowAmnt;
	}

	public void setBaseWeeeTaxAppliedRowAmnt(BigDecimal baseWeeeTaxAppliedRowAmnt) {
		this.baseWeeeTaxAppliedRowAmnt = baseWeeeTaxAppliedRowAmnt;
	}

	public BigDecimal getBaseWeeeTaxDisposition() {
		return this.baseWeeeTaxDisposition;
	}

	public void setBaseWeeeTaxDisposition(BigDecimal baseWeeeTaxDisposition) {
		this.baseWeeeTaxDisposition = baseWeeeTaxDisposition;
	}

	public BigDecimal getBaseWeeeTaxRowDisposition() {
		return this.baseWeeeTaxRowDisposition;
	}

	public void setBaseWeeeTaxRowDisposition(BigDecimal baseWeeeTaxRowDisposition) {
		this.baseWeeeTaxRowDisposition = baseWeeeTaxRowDisposition;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public BigDecimal getCustomPrice() {
		return this.customPrice;
	}

	public void setCustomPrice(BigDecimal customPrice) {
		this.customPrice = customPrice;
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

	public int getIsQtyDecimal() {
		return this.isQtyDecimal;
	}

	public void setIsQtyDecimal(int isQtyDecimal) {
		this.isQtyDecimal = isQtyDecimal;
	}

	public int getIsVirtual() {
		return this.isVirtual;
	}

	public void setIsVirtual(int isVirtual) {
		this.isVirtual = isVirtual;
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

	public BigDecimal getOriginalCustomPrice() {
		return this.originalCustomPrice;
	}

	public void setOriginalCustomPrice(BigDecimal originalCustomPrice) {
		this.originalCustomPrice = originalCustomPrice;
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

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
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

	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public BigDecimal getTaxBeforeDiscount() {
		return this.taxBeforeDiscount;
	}

	public void setTaxBeforeDiscount(BigDecimal taxBeforeDiscount) {
		this.taxBeforeDiscount = taxBeforeDiscount;
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

	public String getWeeeTaxApplied() {
		return this.weeeTaxApplied;
	}

	public void setWeeeTaxApplied(String weeeTaxApplied) {
		this.weeeTaxApplied = weeeTaxApplied;
	}

	public BigDecimal getWeeeTaxAppliedAmount() {
		return this.weeeTaxAppliedAmount;
	}

	public void setWeeeTaxAppliedAmount(BigDecimal weeeTaxAppliedAmount) {
		this.weeeTaxAppliedAmount = weeeTaxAppliedAmount;
	}

	public BigDecimal getWeeeTaxAppliedRowAmount() {
		return this.weeeTaxAppliedRowAmount;
	}

	public void setWeeeTaxAppliedRowAmount(BigDecimal weeeTaxAppliedRowAmount) {
		this.weeeTaxAppliedRowAmount = weeeTaxAppliedRowAmount;
	}

	public BigDecimal getWeeeTaxDisposition() {
		return this.weeeTaxDisposition;
	}

	public void setWeeeTaxDisposition(BigDecimal weeeTaxDisposition) {
		this.weeeTaxDisposition = weeeTaxDisposition;
	}

	public BigDecimal getWeeeTaxRowDisposition() {
		return this.weeeTaxRowDisposition;
	}

	public void setWeeeTaxRowDisposition(BigDecimal weeeTaxRowDisposition) {
		this.weeeTaxRowDisposition = weeeTaxRowDisposition;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public Set<SalesFlatQuoteAddressItem> getSalesFlatQuoteAddressItems() {
		return this.salesFlatQuoteAddressItems;
	}

	public void setSalesFlatQuoteAddressItems(Set<SalesFlatQuoteAddressItem> salesFlatQuoteAddressItems) {
		this.salesFlatQuoteAddressItems = salesFlatQuoteAddressItems;
	}
	
	public SalesFlatQuoteItem getSalesFlatQuoteItem() {
		return this.salesFlatQuoteItem;
	}

	public void setSalesFlatQuoteItem(SalesFlatQuoteItem salesFlatQuoteItem) {
		this.salesFlatQuoteItem = salesFlatQuoteItem;
	}
	
	public Set<SalesFlatQuoteItem> getSalesFlatQuoteItems() {
		return this.salesFlatQuoteItems;
	}

	public void setSalesFlatQuoteItems(Set<SalesFlatQuoteItem> salesFlatQuoteItems) {
		this.salesFlatQuoteItems = salesFlatQuoteItems;
	}
	
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public SalesFlatQuote getSalesFlatQuote() {
		return this.salesFlatQuote;
	}

	public void setSalesFlatQuote(SalesFlatQuote salesFlatQuote) {
		this.salesFlatQuote = salesFlatQuote;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<SalesFlatQuoteItemOption> getSalesFlatQuoteItemOptions() {
		return this.salesFlatQuoteItemOptions;
	}

	public void setSalesFlatQuoteItemOptions(Set<SalesFlatQuoteItemOption> salesFlatQuoteItemOptions) {
		this.salesFlatQuoteItemOptions = salesFlatQuoteItemOptions;
	}
	
}