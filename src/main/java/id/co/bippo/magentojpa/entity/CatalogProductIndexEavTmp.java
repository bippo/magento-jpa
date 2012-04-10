package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_index_eav_tmp database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_eav_tmp")
public class CatalogProductIndexEavTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexEavTmpPK id;

    public CatalogProductIndexEavTmp() {
    }

	public CatalogProductIndexEavTmpPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexEavTmpPK id) {
		this.id = id;
	}
	
}