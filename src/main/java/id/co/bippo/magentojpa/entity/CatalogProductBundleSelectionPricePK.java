package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_product_bundle_selection_price database table.
 * 
 */
@Embeddable
public class CatalogProductBundleSelectionPricePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="selection_id")
	private int selectionId;

	@Column(name="website_id")
	private int websiteId;

    public CatalogProductBundleSelectionPricePK() {
    }
	public int getSelectionId() {
		return this.selectionId;
	}
	public void setSelectionId(int selectionId) {
		this.selectionId = selectionId;
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
		if (!(other instanceof CatalogProductBundleSelectionPricePK)) {
			return false;
		}
		CatalogProductBundleSelectionPricePK castOther = (CatalogProductBundleSelectionPricePK)other;
		return 
			(this.selectionId == castOther.selectionId)
			&& (this.websiteId == castOther.websiteId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.selectionId;
		hash = hash * prime + this.websiteId;
		
		return hash;
    }
}