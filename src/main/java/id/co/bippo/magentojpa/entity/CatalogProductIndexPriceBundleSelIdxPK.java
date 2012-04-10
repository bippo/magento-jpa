package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_product_index_price_bundle_sel_idx database table.
 * 
 */
@Embeddable
public class CatalogProductIndexPriceBundleSelIdxPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="entity_id")
	private int entityId;

	@Column(name="customer_group_id")
	private int customerGroupId;

	@Column(name="website_id")
	private int websiteId;

	@Column(name="option_id")
	private int optionId;

	@Column(name="selection_id")
	private int selectionId;

    public CatalogProductIndexPriceBundleSelIdxPK() {
    }
	public int getEntityId() {
		return this.entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
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
	public int getOptionId() {
		return this.optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public int getSelectionId() {
		return this.selectionId;
	}
	public void setSelectionId(int selectionId) {
		this.selectionId = selectionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatalogProductIndexPriceBundleSelIdxPK)) {
			return false;
		}
		CatalogProductIndexPriceBundleSelIdxPK castOther = (CatalogProductIndexPriceBundleSelIdxPK)other;
		return 
			(this.entityId == castOther.entityId)
			&& (this.customerGroupId == castOther.customerGroupId)
			&& (this.websiteId == castOther.websiteId)
			&& (this.optionId == castOther.optionId)
			&& (this.selectionId == castOther.selectionId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.entityId;
		hash = hash * prime + this.customerGroupId;
		hash = hash * prime + this.websiteId;
		hash = hash * prime + this.optionId;
		hash = hash * prime + this.selectionId;
		
		return hash;
    }
}