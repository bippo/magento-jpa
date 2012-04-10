package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_product_enabled_index database table.
 * 
 */
@Embeddable
public class CatalogProductEnabledIndexPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private int productId;

	@Column(name="store_id")
	private int storeId;

    public CatalogProductEnabledIndexPK() {
    }
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
		if (!(other instanceof CatalogProductEnabledIndexPK)) {
			return false;
		}
		CatalogProductEnabledIndexPK castOther = (CatalogProductEnabledIndexPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.storeId == castOther.storeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.storeId;
		
		return hash;
    }
}