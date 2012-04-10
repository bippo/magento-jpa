package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_order_tax_item database table.
 * 
 */
@Entity
@Table(name="sales_order_tax_item")
public class SalesOrderTaxItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tax_item_id")
	private int taxItemId;

	@Column(name="tax_percent")
	private BigDecimal taxPercent;

	//bi-directional many-to-one association to SalesFlatOrderItem
    @ManyToOne
	@JoinColumn(name="item_id")
	private SalesFlatOrderItem salesFlatOrderItem;

	//bi-directional many-to-one association to SalesOrderTax
    @ManyToOne
	@JoinColumn(name="tax_id")
	private SalesOrderTax salesOrderTax;

    public SalesOrderTaxItem() {
    }

	public int getTaxItemId() {
		return this.taxItemId;
	}

	public void setTaxItemId(int taxItemId) {
		this.taxItemId = taxItemId;
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public void setTaxPercent(BigDecimal taxPercent) {
		this.taxPercent = taxPercent;
	}

	public SalesFlatOrderItem getSalesFlatOrderItem() {
		return this.salesFlatOrderItem;
	}

	public void setSalesFlatOrderItem(SalesFlatOrderItem salesFlatOrderItem) {
		this.salesFlatOrderItem = salesFlatOrderItem;
	}
	
	public SalesOrderTax getSalesOrderTax() {
		return this.salesOrderTax;
	}

	public void setSalesOrderTax(SalesOrderTax salesOrderTax) {
		this.salesOrderTax = salesOrderTax;
	}
	
}