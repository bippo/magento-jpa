package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_flat_creditmemo_grid database table.
 * 
 */
@Entity
@Table(name="sales_flat_creditmemo_grid")
public class SalesFlatCreditmemoGrid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="base_currency_code")
	private String baseCurrencyCode;

	@Column(name="base_grand_total")
	private BigDecimal baseGrandTotal;

	@Column(name="base_to_global_rate")
	private BigDecimal baseToGlobalRate;

	@Column(name="base_to_order_rate")
	private BigDecimal baseToOrderRate;

	@Column(name="billing_name")
	private String billingName;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="creditmemo_status")
	private int creditmemoStatus;

	@Column(name="global_currency_code")
	private String globalCurrencyCode;

	@Column(name="grand_total")
	private BigDecimal grandTotal;

	@Column(name="increment_id")
	private String incrementId;

	@Column(name="invoice_id")
	private int invoiceId;

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

	@Column(name="store_to_base_rate")
	private BigDecimal storeToBaseRate;

	@Column(name="store_to_order_rate")
	private BigDecimal storeToOrderRate;

	//bi-directional one-to-one association to SalesFlatCreditmemo
	@OneToOne
	@JoinColumn(name="entity_id")
	private SalesFlatCreditmemo salesFlatCreditmemo;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesFlatCreditmemoGrid() {
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

	public int getCreditmemoStatus() {
		return this.creditmemoStatus;
	}

	public void setCreditmemoStatus(int creditmemoStatus) {
		this.creditmemoStatus = creditmemoStatus;
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

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
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

	public SalesFlatCreditmemo getSalesFlatCreditmemo() {
		return this.salesFlatCreditmemo;
	}

	public void setSalesFlatCreditmemo(SalesFlatCreditmemo salesFlatCreditmemo) {
		this.salesFlatCreditmemo = salesFlatCreditmemo;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}