package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tax_order_aggregated_updated database table.
 * 
 */
@Entity
@Table(name="tax_order_aggregated_updated")
public class TaxOrderAggregatedUpdated implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String code;

	@Column(name="order_status")
	private String orderStatus;

	@Column(name="orders_count")
	private int ordersCount;

	private float percent;

    @Temporal( TemporalType.DATE)
	private Date period;

	@Column(name="tax_base_amount_sum")
	private float taxBaseAmountSum;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public TaxOrderAggregatedUpdated() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public float getPercent() {
		return this.percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	public Date getPeriod() {
		return this.period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public float getTaxBaseAmountSum() {
		return this.taxBaseAmountSum;
	}

	public void setTaxBaseAmountSum(float taxBaseAmountSum) {
		this.taxBaseAmountSum = taxBaseAmountSum;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}