package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_product_index_price_cfg_opt_agr_idx database table.
 * 
 */
@Embeddable
public class CatalogProductIndexPriceCfgOptAgrIdxPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="parent_id")
	private int parentId;

	@Column(name="child_id")
	private int childId;

	@Column(name="customer_group_id")
	private int customerGroupId;

	@Column(name="website_id")
	private int websiteId;

    public CatalogProductIndexPriceCfgOptAgrIdxPK() {
    }
	public int getParentId() {
		return this.parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getChildId() {
		return this.childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
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
		if (!(other instanceof CatalogProductIndexPriceCfgOptAgrIdxPK)) {
			return false;
		}
		CatalogProductIndexPriceCfgOptAgrIdxPK castOther = (CatalogProductIndexPriceCfgOptAgrIdxPK)other;
		return 
			(this.parentId == castOther.parentId)
			&& (this.childId == castOther.childId)
			&& (this.customerGroupId == castOther.customerGroupId)
			&& (this.websiteId == castOther.websiteId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.parentId;
		hash = hash * prime + this.childId;
		hash = hash * prime + this.customerGroupId;
		hash = hash * prime + this.websiteId;
		
		return hash;
    }
}