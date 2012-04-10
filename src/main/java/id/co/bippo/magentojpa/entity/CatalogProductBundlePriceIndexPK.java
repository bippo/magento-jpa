package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_product_bundle_price_index database table.
 * 
 */
@Embeddable
public class CatalogProductBundlePriceIndexPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="entity_id")
	private int entityId;

	@Column(name="website_id")
	private int websiteId;

	@Column(name="customer_group_id")
	private int customerGroupId;

    public CatalogProductBundlePriceIndexPK() {
    }
	public int getEntityId() {
		return this.entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatalogProductBundlePriceIndexPK)) {
			return false;
		}
		CatalogProductBundlePriceIndexPK castOther = (CatalogProductBundlePriceIndexPK)other;
		return 
			(this.entityId == castOther.entityId)
			&& (this.websiteId == castOther.websiteId)
			&& (this.customerGroupId == castOther.customerGroupId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.entityId;
		hash = hash * prime + this.websiteId;
		hash = hash * prime + this.customerGroupId;
		
		return hash;
    }
}