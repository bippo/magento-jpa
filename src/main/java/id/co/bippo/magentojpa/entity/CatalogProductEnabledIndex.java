package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_enabled_index database table.
 * 
 */
@Entity
@Table(name="catalog_product_enabled_index")
public class CatalogProductEnabledIndex implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductEnabledIndexPK id;

	private int visibility;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

    public CatalogProductEnabledIndex() {
    }

	public CatalogProductEnabledIndexPK getId() {
		return this.id;
	}

	public void setId(CatalogProductEnabledIndexPK id) {
		this.id = id;
	}
	
	public int getVisibility() {
		return this.visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
}