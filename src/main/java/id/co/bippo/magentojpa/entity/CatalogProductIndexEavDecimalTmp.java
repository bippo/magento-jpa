package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_index_eav_decimal_tmp database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_eav_decimal_tmp")
public class CatalogProductIndexEavDecimalTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexEavDecimalTmpPK id;

	private BigDecimal value;

    public CatalogProductIndexEavDecimalTmp() {
    }

	public CatalogProductIndexEavDecimalTmpPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexEavDecimalTmpPK id) {
		this.id = id;
	}
	
	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}