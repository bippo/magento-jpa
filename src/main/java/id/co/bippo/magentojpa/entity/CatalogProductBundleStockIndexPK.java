package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_product_bundle_stock_index database table.
 * 
 */
@Embeddable
public class CatalogProductBundleStockIndexPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="entity_id")
	private int entityId;

	@Column(name="stock_id")
	private int stockId;

	@Column(name="website_id")
	private int websiteId;

	@Column(name="option_id")
	private int optionId;

    public CatalogProductBundleStockIndexPK() {
    }
	public int getEntityId() {
		return this.entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
	public int getStockId() {
		return this.stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatalogProductBundleStockIndexPK)) {
			return false;
		}
		CatalogProductBundleStockIndexPK castOther = (CatalogProductBundleStockIndexPK)other;
		return 
			(this.entityId == castOther.entityId)
			&& (this.stockId == castOther.stockId)
			&& (this.websiteId == castOther.websiteId)
			&& (this.optionId == castOther.optionId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.entityId;
		hash = hash * prime + this.stockId;
		hash = hash * prime + this.websiteId;
		hash = hash * prime + this.optionId;
		
		return hash;
    }
}