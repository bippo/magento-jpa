package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalogindex_eav database table.
 * 
 */
@Embeddable
public class CatalogindexEavPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="store_id")
	private int storeId;

	@Column(name="entity_id")
	private int entityId;

	@Column(name="attribute_id")
	private int attributeId;

	private int value;

    public CatalogindexEavPK() {
    }
	public int getStoreId() {
		return this.storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
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
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatalogindexEavPK)) {
			return false;
		}
		CatalogindexEavPK castOther = (CatalogindexEavPK)other;
		return 
			(this.storeId == castOther.storeId)
			&& (this.entityId == castOther.entityId)
			&& (this.attributeId == castOther.attributeId)
			&& (this.value == castOther.value);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.storeId;
		hash = hash * prime + this.entityId;
		hash = hash * prime + this.attributeId;
		hash = hash * prime + this.value;
		
		return hash;
    }
}