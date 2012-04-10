package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the catalogrule database table.
 * 
 */
@Entity
@Table(name="catalogrule")
public class Catalogrule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rule_id")
	private int ruleId;

    @Lob()
	@Column(name="actions_serialized")
	private String actionsSerialized;

    @Lob()
	@Column(name="conditions_serialized")
	private String conditionsSerialized;

    @Lob()
	@Column(name="customer_group_ids")
	private String customerGroupIds;

    @Lob()
	private String description;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

    @Temporal( TemporalType.DATE)
	@Column(name="from_date")
	private Date fromDate;

	@Column(name="is_active")
	private short isActive;

	private String name;

	@Column(name="simple_action")
	private String simpleAction;

	@Column(name="sort_order")
	private int sortOrder;

	@Column(name="stop_rules_processing")
	private short stopRulesProcessing;

	@Column(name="sub_discount_amount")
	private BigDecimal subDiscountAmount;

	@Column(name="sub_is_enable")
	private int subIsEnable;

	@Column(name="sub_simple_action")
	private String subSimpleAction;

    @Temporal( TemporalType.DATE)
	@Column(name="to_date")
	private Date toDate;

    @Lob()
	@Column(name="website_ids")
	private String websiteIds;

	//bi-directional many-to-one association to CatalogruleGroupWebsite
	@OneToMany(mappedBy="catalogrule")
	private Set<CatalogruleGroupWebsite> catalogruleGroupWebsites;

	//bi-directional many-to-one association to CatalogruleProduct
	@OneToMany(mappedBy="catalogrule")
	private Set<CatalogruleProduct> catalogruleProducts;

    public Catalogrule() {
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

	public String getConditionsSerialized() {
		return this.conditionsSerialized;
	}

	public void setConditionsSerialized(String conditionsSerialized) {
		this.conditionsSerialized = conditionsSerialized;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSimpleAction() {
		return this.simpleAction;
	}

	public void setSimpleAction(String simpleAction) {
		this.simpleAction = simpleAction;
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

	public BigDecimal getSubDiscountAmount() {
		return this.subDiscountAmount;
	}

	public void setSubDiscountAmount(BigDecimal subDiscountAmount) {
		this.subDiscountAmount = subDiscountAmount;
	}

	public int getSubIsEnable() {
		return this.subIsEnable;
	}

	public void setSubIsEnable(int subIsEnable) {
		this.subIsEnable = subIsEnable;
	}

	public String getSubSimpleAction() {
		return this.subSimpleAction;
	}

	public void setSubSimpleAction(String subSimpleAction) {
		this.subSimpleAction = subSimpleAction;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getWebsiteIds() {
		return this.websiteIds;
	}

	public void setWebsiteIds(String websiteIds) {
		this.websiteIds = websiteIds;
	}

	public Set<CatalogruleGroupWebsite> getCatalogruleGroupWebsites() {
		return this.catalogruleGroupWebsites;
	}

	public void setCatalogruleGroupWebsites(Set<CatalogruleGroupWebsite> catalogruleGroupWebsites) {
		this.catalogruleGroupWebsites = catalogruleGroupWebsites;
	}
	
	public Set<CatalogruleProduct> getCatalogruleProducts() {
		return this.catalogruleProducts;
	}

	public void setCatalogruleProducts(Set<CatalogruleProduct> catalogruleProducts) {
		this.catalogruleProducts = catalogruleProducts;
	}
	
}