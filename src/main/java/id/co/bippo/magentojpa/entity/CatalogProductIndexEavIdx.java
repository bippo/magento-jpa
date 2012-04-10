package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_index_eav_idx database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_eav_idx")
public class CatalogProductIndexEavIdx implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexEavIdxPK id;

    public CatalogProductIndexEavIdx() {
    }

	public CatalogProductIndexEavIdxPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexEavIdxPK id) {
		this.id = id;
	}
	
}