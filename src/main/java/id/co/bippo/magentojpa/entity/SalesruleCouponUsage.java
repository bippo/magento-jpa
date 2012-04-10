package id.co.bippo.magentojpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the salesrule_coupon_usage database table.
 * 
 */
@Entity
@Table(name="salesrule_coupon_usage")
@IdClass(SalesruleCouponUsagePK.class)
public class SalesruleCouponUsage implements Serializable {
	private static final long serialVersionUID = 1L;

//	@EmbeddedId
//	@Id
//	private SalesruleCouponUsagePK id;

	@Column(name="times_used")
	private int timesUsed;

	//bi-directional many-to-one association to SalesruleCoupon
	@Id
    @ManyToOne
	@JoinColumn(name="coupon_id")
	private SalesruleCoupon coupon;

	//bi-directional many-to-one association to CustomerEntity
	@Id
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customer;

    public SalesruleCouponUsage() {
    }

//	public SalesruleCouponUsagePK getId() {
//		return this.id;
//	}
//
//	public void setId(SalesruleCouponUsagePK id) {
//		this.id = id;
//	}
	
	public int getTimesUsed() {
		return this.timesUsed;
	}

	public void setTimesUsed(int timesUsed) {
		this.timesUsed = timesUsed;
	}

	public SalesruleCoupon getCoupon() {
		return this.coupon;
	}

	public void setCoupon(SalesruleCoupon salesruleCoupon) {
		this.coupon = salesruleCoupon;
	}
	
	public CustomerEntity getCustomer() {
		return this.customer;
	}

	public void setCustomer(CustomerEntity customerEntity) {
		this.customer = customerEntity;
	}
	
}