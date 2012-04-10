package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_index_eav_decimal_idx database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_eav_decimal_idx")
public class CatalogProductIndexEavDecimalIdx implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexEavDecimalIdxPK id;

    public CatalogProductIndexEavDecimalIdx() {
    }

	public CatalogProductIndexEavDecimalIdxPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexEavDecimalIdxPK id) {
		this.id = id;
	}
	
}