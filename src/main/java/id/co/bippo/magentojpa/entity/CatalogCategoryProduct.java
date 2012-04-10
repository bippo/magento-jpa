package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_category_product database table.
 * 
 */
@Entity
@Table(name="catalog_category_product")
public class CatalogCategoryProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogCategoryProductPK id;

	private int position;

//	//bi-directional many-to-one association to CatalogCategoryEntity
//    @ManyToOne
//	@JoinColumn(name="category_id")
//	private CatalogCategoryEntity catalogCategoryEntity;
//
//	//bi-directional many-to-one association to CatalogProductEntity
//    @ManyToOne
//	@JoinColumn(name="product_id")
//	private CatalogProductEntity catalogProductEntity;

    public CatalogCategoryProduct() {
    }

	public CatalogCategoryProductPK getId() {
		return this.id;
	}

	public void setId(CatalogCategoryProductPK id) {
		this.id = id;
	}
	
	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

//	public CatalogCategoryEntity getCatalogCategoryEntity() {
//		return this.catalogCategoryEntity;
//	}
//
//	public void setCatalogCategoryEntity(CatalogCategoryEntity catalogCategoryEntity) {
//		this.catalogCategoryEntity = catalogCategoryEntity;
//	}
//	
//	public CatalogProductEntity getCatalogProductEntity() {
//		return this.catalogProductEntity;
//	}
//
//	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
//		this.catalogProductEntity = catalogProductEntity;
//	}
	
}