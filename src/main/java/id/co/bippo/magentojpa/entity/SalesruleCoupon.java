package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the salesrule_coupon database table.
 * 
 */
@Entity
@Table(name="salesrule_coupon")
public class SalesruleCoupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="coupon_id")
	private int couponId;

	private String code;

	@Column(name="expiration_date")
	private Timestamp expirationDate;

	@Column(name="is_primary")
	private int isPrimary;

	@Column(name="times_used")
	private int timesUsed;

	@Column(name="usage_limit")
	private int usageLimit;

	@Column(name="usage_per_customer")
	private int usagePerCustomer;

	//bi-directional many-to-one association to Salesrule
    @ManyToOne
	@JoinColumn(name="rule_id")
	private Salesrule salesrule;

	//bi-directional many-to-one association to SalesruleCouponUsage
	@OneToMany(mappedBy="coupon")
	private Set<SalesruleCouponUsage> salesruleCouponUsages;

    public SalesruleCoupon() {
    }

	public int getCouponId() {
		return this.couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Timestamp expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getIsPrimary() {
		return this.isPrimary;
	}

	public void setIsPrimary(int isPrimary) {
		this.isPrimary = isPrimary;
	}

	public int getTimesUsed() {
		return this.timesUsed;
	}

	public void setTimesUsed(int timesUsed) {
		this.timesUsed = timesUsed;
	}

	public int getUsageLimit() {
		return this.usageLimit;
	}

	public void setUsageLimit(int usageLimit) {
		this.usageLimit = usageLimit;
	}

	public int getUsagePerCustomer() {
		return this.usagePerCustomer;
	}

	public void setUsagePerCustomer(int usagePerCustomer) {
		this.usagePerCustomer = usagePerCustomer;
	}

	public Salesrule getSalesrule() {
		return this.salesrule;
	}

	public void setSalesrule(Salesrule salesrule) {
		this.salesrule = salesrule;
	}
	
	public Set<SalesruleCouponUsage> getSalesruleCouponUsages() {
		return this.salesruleCouponUsages;
	}

	public void setSalesruleCouponUsages(Set<SalesruleCouponUsage> salesruleCouponUsages) {
		this.salesruleCouponUsages = salesruleCouponUsages;
	}
	
}