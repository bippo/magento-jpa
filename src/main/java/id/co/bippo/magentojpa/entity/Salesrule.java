package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the salesrule database table.
 * 
 */
@Entity
@Table(name="salesrule")
public class Salesrule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rule_id")
	private int ruleId;

    @Lob()
	@Column(name="actions_serialized")
	private String actionsSerialized;

	@Column(name="apply_to_shipping")
	private int applyToShipping;

    @Lob()
	@Column(name="conditions_serialized")
	private String conditionsSerialized;

	@Column(name="coupon_type")
	private int couponType;

    @Lob()
	@Column(name="customer_group_ids")
	private String customerGroupIds;

    @Lob()
	private String description;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

	@Column(name="discount_qty")
	private BigDecimal discountQty;

	@Column(name="discount_step")
	private int discountStep;

    @Temporal( TemporalType.DATE)
	@Column(name="from_date")
	private Date fromDate;

	@Column(name="is_active")
	private short isActive;

	@Column(name="is_advanced")
	private int isAdvanced;

	@Column(name="is_rss")
	private short isRss;

	private String name;

    @Lob()
	@Column(name="product_ids")
	private String productIds;

	@Column(name="simple_action")
	private String simpleAction;

	@Column(name="simple_free_shipping")
	private int simpleFreeShipping;

	@Column(name="sort_order")
	private int sortOrder;

	@Column(name="stop_rules_processing")
	private short stopRulesProcessing;

	@Column(name="times_used")
	private int timesUsed;

    @Temporal( TemporalType.DATE)
	@Column(name="to_date")
	private Date toDate;

	@Column(name="uses_per_customer")
	private int usesPerCustomer;

    @Lob()
	@Column(name="website_ids")
	private String websiteIds;

	//bi-directional many-to-one association to SalesruleCoupon
	@OneToMany(mappedBy="salesrule")
	private Set<SalesruleCoupon> salesruleCoupons;

	//bi-directional many-to-one association to SalesruleCustomer
	@OneToMany(mappedBy="salesrule")
	private Set<SalesruleCustomer> salesruleCustomers;

	//bi-directional many-to-one association to SalesruleLabel
	@OneToMany(mappedBy="salesrule")
	private Set<SalesruleLabel> salesruleLabels;

//	//bi-directional many-to-one association to SalesruleProductAttribute
//	@OneToMany(mappedBy="salesrule")
//	private Set<SalesruleProductAttribute> salesruleProductAttributes;

    public Salesrule() {
    }

	public int getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public String getActionsSerialized() {
		return this.actionsSerialized;
	}

	public void setActionsSerialized(String actionsSerialized) {
		this.actionsSerialized = actionsSerialized;
	}

	public int getApplyToShipping() {
		return this.applyToShipping;
	}

	public void setApplyToShipping(int applyToShipping) {
		this.applyToShipping = applyToShipping;
	}

	public String getConditionsSerialized() {
		return this.conditionsSerialized;
	}

	public void setConditionsSerialized(String conditionsSerialized) {
		this.conditionsSerialized = conditionsSerialized;
	}

	public int getCouponType() {
		return this.couponType;
	}

	public void setCouponType(int couponType) {
		this.couponType = couponType;
	}

	public String getCustomerGroupIds() {
		return this.customerGroupIds;
	}

	public void setCustomerGroupIds(String customerGroupIds) {
		this.customerGroupIds = customerGroupIds;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public BigDecimal getDiscountQty() {
		return this.discountQty;
	}

	public void setDiscountQty(BigDecimal discountQty) {
		this.discountQty = discountQty;
	}

	public int getDiscountStep() {
		return this.discountStep;
	}

	public void setDiscountStep(int discountStep) {
		this.discountStep = discountStep;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}

	public int getIsAdvanced() {
		return this.isAdvanced;
	}

	public void setIsAdvanced(int isAdvanced) {
		this.isAdvanced = isAdvanced;
	}

	public short getIsRss() {
		return this.isRss;
	}

	public void setIsRss(short isRss) {
		this.isRss = isRss;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductIds() {
		return this.productIds;
	}

	public void setProductIds(String productIds) {
		this.productIds = productIds;
	}

	public String getSimpleAction() {
		return this.simpleAction;
	}

	public void setSimpleAction(String simpleAction) {
		this.simpleAction = simpleAction;
	}

	public int getSimpleFreeShipping() {
		return this.simpleFreeShipping;
	}

	public void setSimpleFreeShipping(int simpleFreeShipping) {
		this.simpleFreeShipping = simpleFreeShipping;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public short getStopRulesProcessing() {
		return this.stopRulesProcessing;
	}

	public void setStopRulesProcessing(short stopRulesProcessing) {
		this.stopRulesProcessing = stopRulesProcessing;
	}

	public int getTimesUsed() {
		return this.timesUsed;
	}

	public void setTimesUsed(int timesUsed) {
		this.timesUsed = timesUsed;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getUsesPerCustomer() {
		return this.usesPerCustomer;
	}

	public void setUsesPerCustomer(int usesPerCustomer) {
		this.usesPerCustomer = usesPerCustomer;
	}

	public String getWebsiteIds() {
		return this.websiteIds;
	}

	public void setWebsiteIds(String websiteIds) {
		this.websiteIds = websiteIds;
	}

	public Set<SalesruleCoupon> getSalesruleCoupons() {
		return this.salesruleCoupons;
	}

	public void setSalesruleCoupons(Set<SalesruleCoupon> salesruleCoupons) {
		this.salesruleCoupons = salesruleCoupons;
	}
	
	public Set<SalesruleCustomer> getSalesruleCustomers() {
		return this.salesruleCustomers;
	}

	public void setSalesruleCustomers(Set<SalesruleCustomer> salesruleCustomers) {
		this.salesruleCustomers = salesruleCustomers;
	}
	
	public Set<SalesruleLabel> getSalesruleLabels() {
		return this.salesruleLabels;
	}

	public void setSalesruleLabels(Set<SalesruleLabel> salesruleLabels) {
		this.salesruleLabels = salesruleLabels;
	}
	
//	public Set<SalesruleProductAttribute> getSalesruleProductAttributes() {
//		return this.salesruleProductAttributes;
//	}
//
//	public void setSalesruleProductAttributes(Set<SalesruleProductAttribute> salesruleProductAttributes) {
//		this.salesruleProductAttributes = salesruleProductAttributes;
//	}
	
}