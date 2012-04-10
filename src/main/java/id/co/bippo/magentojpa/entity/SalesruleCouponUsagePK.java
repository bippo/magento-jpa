package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the salesrule_coupon_usage database table.
 * 
 */
@Embeddable
public class SalesruleCouponUsagePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="coupon_id")
	private int couponId;

	@Column(name="customer_id")
	private int customerId;

    public SalesruleCouponUsagePK() {
    }
	public int getCouponId() {
		return this.couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public int getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
			(this.couponId == castOther.couponId)
			&& (this.customerId == castOther.customerId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.couponId;
		hash = hash * prime + this.customerId;
		
		return hash;
    }
}