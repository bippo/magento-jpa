package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the salesrule_coupon_usage database table.
 * 
 */
@Entity
@Table(name="salesrule_coupon_usage")
public class SalesruleCouponUsage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalesruleCouponUsagePK id;

	@Column(name="times_used")
	private int timesUsed;

	//bi-directional many-to-one association to SalesruleCoupon
    @ManyToOne
	@JoinColumn(name="coupon_id")
	private SalesruleCoupon salesruleCoupon;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customerEntity;

    public SalesruleCouponUsage() {
    }

	public SalesruleCouponUsagePK getId() {
		return this.id;
	}

	public void setId(SalesruleCouponUsagePK id) {
		this.id = id;
	}
	
	public int getTimesUsed() {
		return this.timesUsed;
	}

	public void setTimesUsed(int timesUsed) {
		this.timesUsed = timesUsed;
	}

	public SalesruleCoupon getSalesruleCoupon() {
		return this.salesruleCoupon;
	}

	public void setSalesruleCoupon(SalesruleCoupon salesruleCoupon) {
		this.salesruleCoupon = salesruleCoupon;
	}
	
	public CustomerEntity getCustomerEntity() {
		return this.customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
}