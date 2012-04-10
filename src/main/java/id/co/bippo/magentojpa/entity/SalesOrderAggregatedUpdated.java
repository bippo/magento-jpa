package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sales_order_aggregated_updated database table.
 * 
 */
@Entity
@Table(name="sales_order_aggregated_updated")
public class SalesOrderAggregatedUpdated implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="order_status")
	private String orderStatus;

	@Column(name="orders_count")
	private int ordersCount;

    @Temporal( TemporalType.DATE)
	private Date period;

	@Column(name="total_canceled_amount")
	private BigDecimal totalCanceledAmount;

	@Column(name="total_discount_amount")
	private BigDecimal totalDiscountAmount;

	@Column(name="total_discount_amount_actual")
	private BigDecimal totalDiscountAmountActual;

	@Column(name="total_income_amount")
	private BigDecimal totalIncomeAmount;

	@Column(name="total_invoiced_amount")
	private BigDecimal totalInvoicedAmount;

	@Column(name="total_paid_amount")
	private BigDecimal totalPaidAmount;

	@Column(name="total_profit_amount")
	private BigDecimal totalProfitAmount;

	@Column(name="total_qty_invoiced")
	private BigDecimal totalQtyInvoiced;

	@Column(name="total_qty_ordered")
	private BigDecimal totalQtyOrdered;

	@Column(name="total_refunded_amount")
	private BigDecimal totalRefundedAmount;

	@Column(name="total_revenue_amount")
	private BigDecimal totalRevenueAmount;

	@Column(name="total_shipping_amount")
	private BigDecimal totalShippingAmount;

	@Column(name="total_shipping_amount_actual")
	private BigDecimal totalShippingAmountActual;

	@Column(name="total_tax_amount")
	private BigDecimal totalTaxAmount;

	@Column(name="total_tax_amount_actual")
	private BigDecimal totalTaxAmountActual;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesOrderAggregatedUpdated() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrdersCount() {
		return this.ordersCount;
	}

	public void setOrdersCount(int ordersCount) {
		this.ordersCount = ordersCount;
	}

	public Date getPeriod() {
		return this.period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public BigDecimal getTotalCanceledAmount() {
		return this.totalCanceledAmount;
	}

	public void setTotalCanceledAmount(BigDecimal totalCanceledAmount) {
		this.totalCanceledAmount = totalCanceledAmount;
	}

	public BigDecimal getTotalDiscountAmount() {
		return this.totalDiscountAmount;
	}

	public void setTotalDiscountAmount(BigDecimal totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}

	public BigDecimal getTotalDiscountAmountActual() {
		return this.totalDiscountAmountActual;
	}

	public void setTotalDiscountAmountActual(BigDecimal totalDiscountAmountActual) {
		this.totalDiscountAmountActual = totalDiscountAmountActual;
	}

	public BigDecimal getTotalIncomeAmount() {
		return this.totalIncomeAmount;
	}

	public void setTotalIncomeAmount(BigDecimal totalIncomeAmount) {
		this.totalIncomeAmount = totalIncomeAmount;
	}

	public BigDecimal getTotalInvoicedAmount() {
		return this.totalInvoicedAmount;
	}

	public void setTotalInvoicedAmount(BigDecimal totalInvoicedAmount) {
		this.totalInvoicedAmount = totalInvoicedAmount;
	}

	public BigDecimal getTotalPaidAmount() {
		return this.totalPaidAmount;
	}

	public void setTotalPaidAmount(BigDecimal totalPaidAmount) {
		this.totalPaidAmount = totalPaidAmount;
	}

	public BigDecimal getTotalProfitAmount() {
		return this.totalProfitAmount;
	}

	public void setTotalProfitAmount(BigDecimal totalProfitAmount) {
		this.totalProfitAmount = totalProfitAmount;
	}

	public BigDecimal getTotalQtyInvoiced() {
		return this.totalQtyInvoiced;
	}

	public void setTotalQtyInvoiced(BigDecimal totalQtyInvoiced) {
		this.totalQtyInvoiced = totalQtyInvoiced;
	}

	public BigDecimal getTotalQtyOrdered() {
		return this.totalQtyOrdered;
	}

	public void setTotalQtyOrdered(BigDecimal totalQtyOrdered) {
		this.totalQtyOrdered = totalQtyOrdered;
	}

	public BigDecimal getTotalRefundedAmount() {
		return this.totalRefundedAmount;
	}

	public void setTotalRefundedAmount(BigDecimal totalRefundedAmount) {
		this.totalRefundedAmount = totalRefundedAmount;
	}

	public BigDecimal getTotalRevenueAmount() {
		return this.totalRevenueAmount;
	}

	public void setTotalRevenueAmount(BigDecimal totalRevenueAmount) {
		this.totalRevenueAmount = totalRevenueAmount;
	}

	public BigDecimal getTotalShippingAmount() {
		return this.totalShippingAmount;
	}

	public void setTotalShippingAmount(BigDecimal totalShippingAmount) {
		this.totalShippingAmount = totalShippingAmount;
	}

	public BigDecimal getTotalShippingAmountActual() {
		return this.totalShippingAmountActual;
	}

	public void setTotalShippingAmountActual(BigDecimal totalShippingAmountActual) {
		this.totalShippingAmountActual = totalShippingAmountActual;
	}

	public BigDecimal getTotalTaxAmount() {
		return this.totalTaxAmount;
	}

	public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	public BigDecimal getTotalTaxAmountActual() {
		return this.totalTaxAmountActual;
	}

	public void setTotalTaxAmountActual(BigDecimal totalTaxAmountActual) {
		this.totalTaxAmountActual = totalTaxAmountActual;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}