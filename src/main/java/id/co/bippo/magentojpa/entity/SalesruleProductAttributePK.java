package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the salesrule_product_attribute database table.
 * 
 */
@Embeddable
public class SalesruleProductAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="rule_id")
	private int ruleId;

	@Column(name="website_id")
	private int websiteId;

	@Column(name="customer_group_id")
	private int customerGroupId;

	@Column(name="attribute_id")
	private int attributeId;

    public SalesruleProductAttributePK() {
    }
	public int getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}
	public int getWebsiteId() {
		return this.websiteId;
	}
	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}
	public int getCustomerGroupId() {
		return this.customerGroupId;
	}
	public void setCustomerGroupId(int customerGroupId) {
		this.customerGroupId = customerGroupId;
	}
	public int getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SalesruleProductAttributePK)) {
			return false;
		}
		SalesruleProductAttributePK castOther = (SalesruleProductAttributePK)other;
		return 
			(this.ruleId == castOther.ruleId)
			&& (this.websiteId == castOther.websiteId)
			&& (this.customerGroupId == castOther.customerGroupId)
			&& (this.attributeId == castOther.attributeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ruleId;
		hash = hash * prime + this.websiteId;
		hash = hash * prime + this.customerGroupId;
		hash = hash * prime + this.attributeId;
		
		return hash;
    }
}