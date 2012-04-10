package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalogrule_product database table.
 * 
 */
@Entity
@Table(name="catalogrule_product")
public class CatalogruleProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rule_product_id")
	private int ruleProductId;

	@Column(name="action_amount")
	private BigDecimal actionAmount;

	@Column(name="action_operator")
	private String actionOperator;

	@Column(name="action_stop")
	private short actionStop;

	@Column(name="from_time")
	private int fromTime;

	@Column(name="sort_order")
	private int sortOrder;

	@Column(name="to_time")
	private int toTime;

	//bi-directional many-to-one association to Catalogrule
    @ManyToOne
	@JoinColumn(name="rule_id")
	private Catalogrule catalogrule;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

	//bi-directional many-to-one association to CustomerGroup
    @ManyToOne
	@JoinColumn(name="customer_group_id")
	private CustomerGroup customerGroup;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

    public CatalogruleProduct() {
    }

	public int getRuleProductId() {
		return this.ruleProductId;
	}

	public void setRuleProductId(int ruleProductId) {
		this.ruleProductId = ruleProductId;
	}

	public BigDecimal getActionAmount() {
		return this.actionAmount;
	}

	public void setActionAmount(BigDecimal actionAmount) {
		this.actionAmount = actionAmount;
	}

	public String getActionOperator() {
		return this.actionOperator;
	}

	public void setActionOperator(String actionOperator) {
		this.actionOperator = actionOperator;
	}

	public short getActionStop() {
		return this.actionStop;
	}

	public void setActionStop(short actionStop) {
		this.actionStop = actionStop;
	}

	public int getFromTime() {
		return this.fromTime;
	}

	public void setFromTime(int fromTime) {
		this.fromTime = fromTime;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public int getToTime() {
		return this.toTime;
	}

	public void setToTime(int toTime) {
		this.toTime = toTime;
	}

	public Catalogrule getCatalogrule() {
		return this.catalogrule;
	}

	public void setCatalogrule(Catalogrule catalogrule) {
		this.catalogrule = catalogrule;
	}
	
	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
	public CustomerGroup getCustomerGroup() {
		return this.customerGroup;
	}

	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}
	
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
}