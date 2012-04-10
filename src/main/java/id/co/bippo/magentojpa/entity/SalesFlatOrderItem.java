package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the sales_flat_order_item database table.
 * 
 */
@Entity
@Table(name="sales_flat_order_item")
public class SalesFlatOrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id")
	private int itemId;

    @Lob()
	@Column(name="additional_data")
	private String additionalData;

	@Column(name="amount_refunded")
	private BigDecimal amountRefunded;

    @Lob()
	@Column(name="applied_rule_ids")
	private String appliedRuleIds;

	@Column(name="base_amount_refunded")
	private BigDecimal baseAmountRefunded;

	@Column(name="base_cost")
	private BigDecimal baseCost;

	@Column(name="base_discount_amount")
	private BigDecimal baseDiscountAmount;

	@Column(name="base_discount_invoiced")
	private BigDecimal baseDiscountInvoiced;

	@Column(name="base_hidden_tax_amount")
	private BigDecimal baseHiddenTaxAmount;

	@Column(name="base_hidden_tax_invoiced")
	private BigDecimal baseHiddenTaxInvoiced;

	@Column(name="base_hidden_tax_refunded")
	private BigDecimal baseHiddenTaxRefunded;

	@Column(name="base_original_price")
	private BigDecimal baseOriginalPrice;

	@Column(name="base_price")
	private BigDecimal basePrice;

	@Column(name="base_price_incl_tax")
	private BigDecimal basePriceInclTax;

	@Column(name="base_row_invoiced")
	private BigDecimal baseRowInvoiced;

	@Column(name="base_row_total")
	private BigDecimal baseRowTotal;

	@Column(name="base_row_total_incl_tax")
	private BigDecimal baseRowTotalInclTax;

	@Column(name="base_tax_amount")
	private BigDecimal baseTaxAmount;

	@Column(name="base_tax_before_discount")
	private BigDecimal baseTaxBeforeDiscount;

	@Column(name="base_tax_invoiced")
	private BigDecimal baseTaxInvoiced;

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

    @Lob()
	private String description;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

	@Column(name="discount_invoiced")
	private BigDecimal discountInvoiced;

	@Column(name="discount_percent")
	private BigDecimal discountPercent;

	@Column(name="ext_order_item_id")
	private String extOrderItemId;

	@Column(name="free_shipping")
	private int freeShipping;

	@Column(name="gift_message_available")
	private int giftMessageAvailable;

	@Column(name="gift_message_id")
	private int giftMessageId;

	@Column(name="hidden_tax_amount")
	private BigDecimal hiddenTaxAmount;

	@Column(name="hidden_tax_canceled")
	private BigDecimal hiddenTaxCanceled;

	@Column(name="hidden_tax_invoiced")
	private BigDecimal hiddenTaxInvoiced;

	@Column(name="hidden_tax_refunded")
	private BigDecimal hiddenTaxRefunded;

	@Column(name="is_nominal")
	private int isNominal;

	@Column(name="is_qty_decimal")
	private int isQtyDecimal;

	@Column(name="is_virtual")
	private int isVirtual;

	@Column(name="locked_do_invoice")
	private int lockedDoInvoice;

	@Column(name="locked_do_ship")
	private int lockedDoShip;

	private String name;

	@Column(name="no_discount")
	private int noDiscount;

	@Column(name="original_price")
	private BigDecimal originalPrice;

	@Column(name="parent_item_id")
	private int parentItemId;

	private BigDecimal price;

	@Column(name="price_incl_tax")
	private BigDecimal priceInclTax;

	@Column(name="product_id")
	private int productId;

    @Lob()
	@Column(name="product_options")
	private String productOptions;

	@Column(name="product_type")
	private String productType;

	@Column(name="qty_backordered")
	private BigDecimal qtyBackordered;

	@Column(name="qty_canceled")
	private BigDecimal qtyCanceled;

	@Column(name="qty_invoiced")
	private BigDecimal qtyInvoiced;

	@Column(name="qty_ordered")
	private BigDecimal qtyOrdered;

	@Column(name="qty_refunded")
	private BigDecimal qtyRefunded;

	@Column(name="qty_shipped")
	private BigDecimal qtyShipped;

	@Column(name="quote_item_id")
	private int quoteItemId;

	@Column(name="row_invoiced")
	private BigDecimal rowInvoiced;

	@Column(name="row_total")
	private BigDecimal rowTotal;

	@Column(name="row_total_incl_tax")
	private BigDecimal rowTotalInclTax;

	@Column(name="row_weight")
	private BigDecimal rowWeight;

	private String sku;

	@Column(name="tax_amount")
	private BigDecimal taxAmount;

	@Column(name="tax_before_discount")
	private BigDecimal taxBeforeDiscount;

	@Column(name="tax_canceled")
	private BigDecimal taxCanceled;

	@Column(name="tax_invoiced")
	private BigDecimal taxInvoiced;

	@Column(name="tax_percent")
	private BigDecimal taxPercent;

	@Column(name="tax_refunded")
	private BigDecimal taxRefunded;

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

	//bi-directional many-to-one association to DownloadableLinkPurchasedItem
	@OneToMany(mappedBy="salesFlatOrderItem")
	private Set<DownloadableLinkPurchasedItem> downloadableLinkPurchasedItems;

	//bi-directional many-to-one association to SalesFlatOrder
    @ManyToOne
	@JoinColumn(name="order_id")
	private SalesFlatOrder salesFlatOrder;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to SalesOrderTaxItem
	@OneToMany(mappedBy="salesFlatOrderItem")
	private Set<SalesOrderTaxItem> salesOrderTaxItems;

    public SalesFlatOrderItem() {
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

	public BigDecimal getAmountRefunded() {
		return this.amountRefunded;
	}

	public void setAmountRefunded(BigDecimal amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	public String getAppliedRuleIds() {
		return this.appliedRuleIds;
	}

	public void setAppliedRuleIds(String appliedRuleIds) {
		this.appliedRuleIds = appliedRuleIds;
	}

	public BigDecimal getBaseAmountRefunded() {
		return this.baseAmountRefunded;
	}

	public void setBaseAmountRefunded(BigDecimal baseAmountRefunded) {
		this.baseAmountRefunded = baseAmountRefunded;
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

	public BigDecimal getBaseDiscountInvoiced() {
		return this.baseDiscountInvoiced;
	}

	public void setBaseDiscountInvoiced(BigDecimal baseDiscountInvoiced) {
		this.baseDiscountInvoiced = baseDiscountInvoiced;
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

	public BigDecimal getBaseOriginalPrice() {
		return this.baseOriginalPrice;
	}

	public void setBaseOriginalPrice(BigDecimal baseOriginalPrice) {
		this.baseOriginalPrice = baseOriginalPrice;
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

	public BigDecimal getBaseRowInvoiced() {
		return this.baseRowInvoiced;
	}

	public void setBaseRowInvoiced(BigDecimal baseRowInvoiced) {
		this.baseRowInvoiced = baseRowInvoiced;
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

	public BigDecimal getBaseTaxInvoiced() {
		return this.baseTaxInvoiced;
	}

	public void setBaseTaxInvoiced(BigDecimal baseTaxInvoiced) {
		this.baseTaxInvoiced = baseTaxInvoiced;
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

	public BigDecimal getDiscountInvoiced() {
		return this.discountInvoiced;
	}

	public void setDiscountInvoiced(BigDecimal discountInvoiced) {
		this.discountInvoiced = discountInvoiced;
	}

	public BigDecimal getDiscountPercent() {
		return this.discountPercent;
	}

	public void setDiscountPercent(BigDecimal discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getExtOrderItemId() {
		return this.extOrderItemId;
	}

	public void setExtOrderItemId(String extOrderItemId) {
		this.extOrderItemId = extOrderItemId;
	}

	public int getFreeShipping() {
		return this.freeShipping;
	}

	public void setFreeShipping(int freeShipping) {
		this.freeShipping = freeShipping;
	}

	public int getGiftMessageAvailable() {
		return this.giftMessageAvailable;
	}

	public void setGiftMessageAvailable(int giftMessageAvailable) {
		this.giftMessageAvailable = giftMessageAvailable;
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

	public BigDecimal getHiddenTaxCanceled() {
		return this.hiddenTaxCanceled;
	}

	public void setHiddenTaxCanceled(BigDecimal hiddenTaxCanceled) {
		this.hiddenTaxCanceled = hiddenTaxCanceled;
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

	public int getIsNominal() {
		return this.isNominal;
	}

	public void setIsNominal(int isNominal) {
		this.isNominal = isNominal;
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

	public int getLockedDoInvoice() {
		return this.lockedDoInvoice;
	}

	public void setLockedDoInvoice(int lockedDoInvoice) {
		this.lockedDoInvoice = lockedDoInvoice;
	}

	public int getLockedDoShip() {
		return this.lockedDoShip;
	}

	public void setLockedDoShip(int lockedDoShip) {
		this.lockedDoShip = lockedDoShip;
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

	public BigDecimal getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getParentItemId() {
		return this.parentItemId;
	}

	public void setParentItemId(int parentItemId) {
		this.parentItemId = parentItemId;
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

	public String getProductOptions() {
		return this.productOptions;
	}

	public void setProductOptions(String productOptions) {
		this.productOptions = productOptions;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getQtyBackordered() {
		return this.qtyBackordered;
	}

	public void setQtyBackordered(BigDecimal qtyBackordered) {
		this.qtyBackordered = qtyBackordered;
	}

	public BigDecimal getQtyCanceled() {
		return this.qtyCanceled;
	}

	public void setQtyCanceled(BigDecimal qtyCanceled) {
		this.qtyCanceled = qtyCanceled;
	}

	public BigDecimal getQtyInvoiced() {
		return this.qtyInvoiced;
	}

	public void setQtyInvoiced(BigDecimal qtyInvoiced) {
		this.qtyInvoiced = qtyInvoiced;
	}

	public BigDecimal getQtyOrdered() {
		return this.qtyOrdered;
	}

	public void setQtyOrdered(BigDecimal qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public BigDecimal getQtyRefunded() {
		return this.qtyRefunded;
	}

	public void setQtyRefunded(BigDecimal qtyRefunded) {
		this.qtyRefunded = qtyRefunded;
	}

	public BigDecimal getQtyShipped() {
		return this.qtyShipped;
	}

	public void setQtyShipped(BigDecimal qtyShipped) {
		this.qtyShipped = qtyShipped;
	}

	public int getQuoteItemId() {
		return this.quoteItemId;
	}

	public void setQuoteItemId(int quoteItemId) {
		this.quoteItemId = quoteItemId;
	}

	public BigDecimal getRowInvoiced() {
		return this.rowInvoiced;
	}

	public void setRowInvoiced(BigDecimal rowInvoiced) {
		this.rowInvoiced = rowInvoiced;
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

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public void setTaxPercent(BigDecimal taxPercent) {
		this.taxPercent = taxPercent;
	}

	public BigDecimal getTaxRefunded() {
		return this.taxRefunded;
	}

	public void setTaxRefunded(BigDecimal taxRefunded) {
		this.taxRefunded = taxRefunded;
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

	public Set<DownloadableLinkPurchasedItem> getDownloadableLinkPurchasedItems() {
		return this.downloadableLinkPurchasedItems;
	}

	public void setDownloadableLinkPurchasedItems(Set<DownloadableLinkPurchasedItem> downloadableLinkPurchasedItems) {
		this.downloadableLinkPurchasedItems = downloadableLinkPurchasedItems;
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
	
	public Set<SalesOrderTaxItem> getSalesOrderTaxItems() {
		return this.salesOrderTaxItems;
	}

	public void setSalesOrderTaxItems(Set<SalesOrderTaxItem> salesOrderTaxItems) {
		this.salesOrderTaxItems = salesOrderTaxItems;
	}
	
}