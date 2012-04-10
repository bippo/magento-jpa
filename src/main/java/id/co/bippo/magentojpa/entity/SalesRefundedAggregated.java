package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sales_refunded_aggregated database table.
 * 
 */
@Entity
@Table(name="sales_refunded_aggregated")
public class SalesRefundedAggregated implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="offline_refunded")
	private BigDecimal offlineRefunded;

	@Column(name="online_refunded")
	private BigDecimal onlineRefunded;

	@Column(name="order_status")
	private String orderStatus;

	@Column(name="orders_count")
	private int ordersCount;

    @Temporal( TemporalType.DATE)
	private Date period;

	private BigDecimal refunded;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesRefundedAggregated() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getOfflineRefunded() {
		return this.offlineRefunded;
	}

	public void setOfflineRefunded(BigDecimal offlineRefunded) {
		this.offlineRefunded = offlineRefunded;
	}

	public BigDecimal getOnlineRefunded() {
		return this.onlineRefunded;
	}

	public void setOnlineRefunded(BigDecimal onlineRefunded) {
		this.onlineRefunded = onlineRefunded;
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

	public BigDecimal getRefunded() {
		return this.refunded;
	}

	public void setRefunded(BigDecimal refunded) {
		this.refunded = refunded;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}