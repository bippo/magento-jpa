package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the catalogrule_product_price database table.
 * 
 */
@Entity
@Table(name="catalogrule_product_price")
public class CatalogruleProductPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rule_product_price_id")
	private int ruleProductPriceId;

    @Temporal( TemporalType.DATE)
	@Column(name="earliest_end_date")
	private Date earliestEndDate;

    @Temporal( TemporalType.DATE)
	@Column(name="latest_start_date")
	private Date latestStartDate;

    @Temporal( TemporalType.DATE)
	@Column(name="rule_date")
	private Date ruleDate;

	@Column(name="rule_price")
	private BigDecimal rulePrice;

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

    public CatalogruleProductPrice() {
    }

	public int getRuleProductPriceId() {
		return this.ruleProductPriceId;
	}

	public void setRuleProductPriceId(int ruleProductPriceId) {
		this.ruleProductPriceId = ruleProductPriceId;
	}

	public Date getEarliestEndDate() {
		return this.earliestEndDate;
	}

	public void setEarliestEndDate(Date earliestEndDate) {
		this.earliestEndDate = earliestEndDate;
	}

	public Date getLatestStartDate() {
		return this.latestStartDate;
	}

	public void setLatestStartDate(Date latestStartDate) {
		this.latestStartDate = latestStartDate;
	}

	public Date getRuleDate() {
		return this.ruleDate;
	}

	public void setRuleDate(Date ruleDate) {
		this.ruleDate = ruleDate;
	}

	public BigDecimal getRulePrice() {
		return this.rulePrice;
	}

	public void setRulePrice(BigDecimal rulePrice) {
		this.rulePrice = rulePrice;
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