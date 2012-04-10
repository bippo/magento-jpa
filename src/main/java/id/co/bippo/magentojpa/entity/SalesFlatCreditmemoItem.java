package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_flat_creditmemo_item database table.
 * 
 */
@Entity
@Table(name="sales_flat_creditmemo_item")
public class SalesFlatCreditmemoItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

    @Lob()
	@Column(name="additional_data")
	private String additionalData;

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

	@Column(name="base_weee_tax_applied_amount")
	private BigDecimal baseWeeeTaxAppliedAmount;

	@Column(name="base_weee_tax_applied_row_amnt")
	private BigDecimal baseWeeeTaxAppliedRowAmnt;

	@Column(name="base_weee_tax_disposition")
	private BigDecimal baseWeeeTaxDisposition;

	@Column(name="base_weee_tax_row_disposition")
	private BigDecimal baseWeeeTaxRowDisposition;

    @Lob()
	private String description;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

	@Column(name="hidden_tax_amount")
	private BigDecimal hiddenTaxAmount;

	private String name;

	@Column(name="order_item_id")
	private int orderItemId;

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

	private String sku;

	@Column(name="tax_amount")
	private BigDecimal taxAmount;

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

	//bi-directional many-to-one association to SalesFlatCreditmemo
    @ManyToOne
	@JoinColumn(name="parent_id")
	private SalesFlatCreditmemo salesFlatCreditmemo;

    public SalesFlatCreditmemoItem() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getAdditionalData() {
		return this.additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
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

	public BigDecimal getHiddenTaxAmount() {
		return this.hiddenTaxAmount;
	}

	public void setHiddenTaxAmount(BigDecimal hiddenTaxAmount) {
		this.hiddenTaxAmount = hiddenTaxAmount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
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

	public SalesFlatCreditmemo getSalesFlatCreditmemo() {
		return this.salesFlatCreditmemo;
	}

	public void setSalesFlatCreditmemo(SalesFlatCreditmemo salesFlatCreditmemo) {
		this.salesFlatCreditmemo = salesFlatCreditmemo;
	}
	
}