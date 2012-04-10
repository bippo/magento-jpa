package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the sales_order_tax database table.
 * 
 */
@Entity
@Table(name="sales_order_tax")
public class SalesOrderTax implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tax_id")
	private int taxId;

	private BigDecimal amount;

	@Column(name="base_amount")
	private BigDecimal baseAmount;

	@Column(name="base_real_amount")
	private BigDecimal baseRealAmount;

	private String code;

	private int hidden;

	@Column(name="order_id")
	private int orderId;

	private BigDecimal percent;

	private int position;

	private int priority;

	private short process;

	private String title;

	//bi-directional many-to-one association to SalesOrderTaxItem
	@OneToMany(mappedBy="salesOrderTax")
	private Set<SalesOrderTaxItem> salesOrderTaxItems;

    public SalesOrderTax() {
    }

	public int getTaxId() {
		return this.taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBaseAmount() {
		return this.baseAmount;
	}

	public void setBaseAmount(BigDecimal baseAmount) {
		this.baseAmount = baseAmount;
	}

	public BigDecimal getBaseRealAmount() {
		return this.baseRealAmount;
	}

	public void setBaseRealAmount(BigDecimal baseRealAmount) {
		this.baseRealAmount = baseRealAmount;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getHidden() {
		return this.hidden;
	}

	public void setHidden(int hidden) {
		this.hidden = hidden;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getPercent() {
		return this.percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public short getProcess() {
		return this.process;
	}

	public void setProcess(short process) {
		this.process = process;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<SalesOrderTaxItem> getSalesOrderTaxItems() {
		return this.salesOrderTaxItems;
	}

	public void setSalesOrderTaxItems(Set<SalesOrderTaxItem> salesOrderTaxItems) {
		this.salesOrderTaxItems = salesOrderTaxItems;
	}
	
}