package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the salesrule_coupon_usage database table.
 * 
 */
//@Embeddable
public class SalesruleCouponUsagePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="coupon_id")
	private int coupon;

	@Column(name="customer_id")
	private int customer;

    public SalesruleCouponUsagePK() {
    }
	public int getCoupon() {
		return this.coupon;
	}
	public void setCoupon(int couponId) {
		this.coupon = couponId;
	}
	public int getCustomer() {
		return this.customer;
	}
	public void setCustomer(int customerId) {
		this.customer = customerId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SalesruleCouponUsagePK)) {
			return false;
		}
		SalesruleCouponUsagePK castOther = (SalesruleCouponUsagePK)other;
		return 
			(this.coupon == castOther.coupon)
			&& (this.customer == castOther.customer);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.coupon;
		hash = hash * prime + this.customer;
		
		return hash;
    }
}