package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sales_invoiced_aggregated_order database table.
 * 
 */
@Entity
@Table(name="sales_invoiced_aggregated_order")
public class SalesInvoicedAggregatedOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private BigDecimal invoiced;

	@Column(name="invoiced_captured")
	private BigDecimal invoicedCaptured;

	@Column(name="invoiced_not_captured")
	private BigDecimal invoicedNotCaptured;

	@Column(name="order_status")
	private String orderStatus;

	@Column(name="orders_count")
	private int ordersCount;

	@Column(name="orders_invoiced")
	private BigDecimal ordersInvoiced;

    @Temporal( TemporalType.DATE)
	private Date period;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesInvoicedAggregatedOrder() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getInvoiced() {
		return this.invoiced;
	}

	public void setInvoiced(BigDecimal invoiced) {
		this.invoiced = invoiced;
	}

	public BigDecimal getInvoicedCaptured() {
		return this.invoicedCaptured;
	}

	public void setInvoicedCaptured(BigDecimal invoicedCaptured) {
		this.invoicedCaptured = invoicedCaptured;
	}

	public BigDecimal getInvoicedNotCaptured() {
		return this.invoicedNotCaptured;
	}

	public void setInvoicedNotCaptured(BigDecimal invoicedNotCaptured) {
		this.invoicedNotCaptured = invoicedNotCaptured;
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

	public BigDecimal getOrdersInvoiced() {
		return this.ordersInvoiced;
	}

	public void setOrdersInvoiced(BigDecimal ordersInvoiced) {
		this.ordersInvoiced = ordersInvoiced;
	}

	public Date getPeriod() {
		return this.period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}