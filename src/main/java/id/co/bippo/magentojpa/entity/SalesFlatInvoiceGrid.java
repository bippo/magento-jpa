package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_flat_invoice_grid database table.
 * 
 */
@Entity
@Table(name="sales_flat_invoice_grid")
public class SalesFlatInvoiceGrid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="base_currency_code")
	private String baseCurrencyCode;

	@Column(name="base_grand_total")
	private BigDecimal baseGrandTotal;

	@Column(name="billing_name")
	private String billingName;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="global_currency_code")
	private String globalCurrencyCode;

	@Column(name="grand_total")
	private BigDecimal grandTotal;

	@Column(name="increment_id")
	private String incrementId;

	@Column(name="order_created_at")
	private Timestamp orderCreatedAt;

	@Column(name="order_currency_code")
	private String orderCurrencyCode;

	@Column(name="order_id")
	private int orderId;

	@Column(name="order_increment_id")
	private String orderIncrementId;

	private int state;

	@Column(name="store_currency_code")
	private String storeCurrencyCode;

	//bi-directional one-to-one association to SalesFlatInvoice
	@OneToOne
	@JoinColumn(name="entity_id")
	private SalesFlatInvoice salesFlatInvoice;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesFlatInvoiceGrid() {
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

	public BigDecimal getBaseGrandTotal() {
		return this.baseGrandTotal;
	}

	public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
		this.baseGrandTotal = baseGrandTotal;
	}

	public String getBillingName() {
		return this.billingName;
	}

	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
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

	public String getIncrementId() {
		return this.incrementId;
	}

	public void setIncrementId(String incrementId) {
		this.incrementId = incrementId;
	}

	public Timestamp getOrderCreatedAt() {
		return this.orderCreatedAt;
	}

	public void setOrderCreatedAt(Timestamp orderCreatedAt) {
		this.orderCreatedAt = orderCreatedAt;
	}

	public String getOrderCurrencyCode() {
		return this.orderCurrencyCode;
	}

	public void setOrderCurrencyCode(String orderCurrencyCode) {
		this.orderCurrencyCode = orderCurrencyCode;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderIncrementId() {
		return this.orderIncrementId;
	}

	public void setOrderIncrementId(String orderIncrementId) {
		this.orderIncrementId = orderIncrementId;
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

	public SalesFlatInvoice getSalesFlatInvoice() {
		return this.salesFlatInvoice;
	}

	public void setSalesFlatInvoice(SalesFlatInvoice salesFlatInvoice) {
		this.salesFlatInvoice = salesFlatInvoice;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}