package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_product_index_eav_decimal_idx database table.
 * 
 */
@Embeddable
public class CatalogProductIndexEavDecimalIdxPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="entity_id")
	private int entityId;

	@Column(name="attribute_id")
	private int attributeId;

	@Column(name="store_id")
	private int storeId;

	private long value;

    public CatalogProductIndexEavDecimalIdxPK() {
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
	public long getValue() {
		return this.value;
	}
	public void setValue(long value) {
		this.value = value;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatalogProductIndexEavDecimalIdxPK)) {
			return false;
		}
		CatalogProductIndexEavDecimalIdxPK castOther = (CatalogProductIndexEavDecimalIdxPK)other;
		return 
			(this.entityId == castOther.entityId)
			&& (this.attributeId == castOther.attributeId)
			&& (this.storeId == castOther.storeId)
			&& (this.value == castOther.value);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.entityId;
		hash = hash * prime + this.attributeId;
		hash = hash * prime + this.storeId;
		hash = hash * prime + ((int) (this.value ^ (this.value >>> 32)));
		
		return hash;
    }
}