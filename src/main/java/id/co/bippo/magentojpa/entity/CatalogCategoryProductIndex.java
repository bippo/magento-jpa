package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_category_product_index database table.
 * 
 */
@Entity
@Table(name="catalog_category_product_index")
public class CatalogCategoryProductIndex implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogCategoryProductIndexPK id;

	@Column(name="is_parent")
	private int isParent;

	private int position;

	private int visibility;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to CatalogCategoryEntity
    @ManyToOne
	@JoinColumn(name="category_id")
	private CatalogCategoryEntity catalogCategoryEntity;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

    public CatalogCategoryProductIndex() {
    }

	public CatalogCategoryProductIndexPK getId() {
		return this.id;
	}

	public void setId(CatalogCategoryProductIndexPK id) {
		this.id = id;
	}
	
	public int getIsParent() {
		return this.isParent;
	}

	public void setIsParent(int isParent) {
		this.isParent = isParent;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
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
	
	public CatalogCategoryEntity getCatalogCategoryEntity() {
		return this.catalogCategoryEntity;
	}

	public void setCatalogCategoryEntity(CatalogCategoryEntity catalogCategoryEntity) {
		this.catalogCategoryEntity = catalogCategoryEntity;
	}
	
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
}