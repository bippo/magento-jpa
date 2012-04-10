package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_product_index_eav_decimal database table.
 * 
 */
@Embeddable
public class CatalogProductIndexEavDecimalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="entity_id")
	private int entityId;

	@Column(name="attribute_id")
	private int attributeId;

	@Column(name="store_id")
	private int storeId;

    public CatalogProductIndexEavDecimalPK() {
    }
	public int getEntityId() {
		return this.entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
	public int getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
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
		if (!(other instanceof CatalogProductIndexEavDecimalPK)) {
			return false;
		}
		CatalogProductIndexEavDecimalPK castOther = (CatalogProductIndexEavDecimalPK)other;
		return 
			(this.entityId == castOther.entityId)
			&& (this.attributeId == castOther.attributeId)
			&& (this.storeId == castOther.storeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.entityId;
		hash = hash * prime + this.attributeId;
		hash = hash * prime + this.storeId;
		
		return hash;
    }
}