package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the coupon_aggregated_updated database table.
 * 
 */
@Entity
@Table(name="coupon_aggregated_updated")
public class CouponAggregatedUpdated implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="coupon_code")
	private String couponCode;

	@Column(name="coupon_uses")
	private int couponUses;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

	@Column(name="discount_amount_actual")
	private BigDecimal discountAmountActual;

	@Column(name="order_status")
	private String orderStatus;

    @Temporal( TemporalType.DATE)
	private Date period;

	@Column(name="subtotal_amount")
	private BigDecimal subtotalAmount;

	@Column(name="subtotal_amount_actual")
	private BigDecimal subtotalAmountActual;

	@Column(name="total_amount")
	private BigDecimal totalAmount;

	@Column(name="total_amount_actual")
	private BigDecimal totalAmountActual;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public CouponAggregatedUpdated() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public int getCouponUses() {
		return this.couponUses;
	}

	public void setCouponUses(int couponUses) {
		this.couponUses = couponUses;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public BigDecimal getDiscountAmountActual() {
		return this.discountAmountActual;
	}

	public void setDiscountAmountActual(BigDecimal discountAmountActual) {
		this.discountAmountActual = discountAmountActual;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getPeriod() {
		return this.period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public BigDecimal getSubtotalAmount() {
		return this.subtotalAmount;
	}

	public void setSubtotalAmount(BigDecimal subtotalAmount) {
		this.subtotalAmount = subtotalAmount;
	}

	public BigDecimal getSubtotalAmountActual() {
		return this.subtotalAmountActual;
	}

	public void setSubtotalAmountActual(BigDecimal subtotalAmountActual) {
		this.subtotalAmountActual = subtotalAmountActual;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalAmountActual() {
		return this.totalAmountActual;
	}

	public void setTotalAmountActual(BigDecimal totalAmountActual) {
		this.totalAmountActual = totalAmountActual;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}