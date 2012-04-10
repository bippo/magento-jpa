package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_product_entity_media_gallery_value database table.
 * 
 */
@Embeddable
public class CatalogProductEntityMediaGalleryValuePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="value_id")
	private int valueId;

	@Column(name="store_id")
	private int storeId;

    public CatalogProductEntityMediaGalleryValuePK() {
    }
	public int getValueId() {
		return this.valueId;
	}
	public void setValueId(int valueId) {
		this.valueId = valueId;
	}
	public int getStoreId() {
		return this.storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatalogProductEntityMediaGalleryValuePK)) {
			return false;
		}
		CatalogProductEntityMediaGalleryValuePK castOther = (CatalogProductEntityMediaGalleryValuePK)other;
		return 
			(this.valueId == castOther.valueId)
			&& (this.storeId == castOther.storeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.valueId;
		hash = hash * prime + this.storeId;
		
		return hash;
    }
}