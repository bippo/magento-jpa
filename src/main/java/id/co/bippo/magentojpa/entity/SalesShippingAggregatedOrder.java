package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sales_shipping_aggregated_order database table.
 * 
 */
@Entity
@Table(name="sales_shipping_aggregated_order")
public class SalesShippingAggregatedOrder implements Serializable {
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

	@Column(name="shipping_description")
	private String shippingDescription;

	@Column(name="total_shipping")
	private BigDecimal totalShipping;

	@Column(name="total_shipping_actual")
	private BigDecimal totalShippingActual;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesShippingAggregatedOrder() {
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

	public String getShippingDescription() {
		return this.shippingDescription;
	}

	public void setShippingDescription(String shippingDescription) {
		this.shippingDescription = shippingDescription;
	}

	public BigDecimal getTotalShipping() {
		return this.totalShipping;
	}

	public void setTotalShipping(BigDecimal totalShipping) {
		this.totalShipping = totalShipping;
	}

	public BigDecimal getTotalShippingActual() {
		return this.totalShippingActual;
	}

	public void setTotalShippingActual(BigDecimal totalShippingActual) {
		this.totalShippingActual = totalShippingActual;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}