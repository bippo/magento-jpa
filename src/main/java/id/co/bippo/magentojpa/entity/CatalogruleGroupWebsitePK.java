package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalogrule_group_website database table.
 * 
 */
@Embeddable
public class CatalogruleGroupWebsitePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="rule_id")
	private int ruleId;

	@Column(name="customer_group_id")
	private int customerGroupId;

	@Column(name="website_id")
	private int websiteId;

    public CatalogruleGroupWebsitePK() {
    }
	public int getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}
	public int getCustomerGroupId() {
		return this.customerGroupId;
	}
	public void setCustomerGroupId(int customerGroupId) {
		this.customerGroupId = customerGroupId;
	}
	public int getWebsiteId() {
		return this.websiteId;
	}
	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatalogruleGroupWebsitePK)) {
			return false;
		}
		CatalogruleGroupWebsitePK castOther = (CatalogruleGroupWebsitePK)other;
		return 
			(this.ruleId == castOther.ruleId)
			&& (this.customerGroupId == castOther.customerGroupId)
			&& (this.websiteId == castOther.websiteId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ruleId;
		hash = hash * prime + this.customerGroupId;
		hash = hash * prime + this.websiteId;
		
		return hash;
    }
}