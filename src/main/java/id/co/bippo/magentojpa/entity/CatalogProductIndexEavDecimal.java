package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_index_eav_decimal database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_eav_decimal")
public class CatalogProductIndexEavDecimal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexEavDecimalPK id;

	private BigDecimal value;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="entity_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public CatalogProductIndexEavDecimal() {
    }

	public CatalogProductIndexEavDecimalPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexEavDecimalPK id) {
		this.id = id;
	}
	
	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}