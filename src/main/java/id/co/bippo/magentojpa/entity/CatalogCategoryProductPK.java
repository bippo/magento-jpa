package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the catalog_category_product database table.
 * 
 */
@Embeddable
public class CatalogCategoryProductPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="category_id")
	private int categoryId;

	@Column(name="product_id")
	private int productId;

    public CatalogCategoryProductPK() {
    }
	public int getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CatalogCategoryProductPK)) {
			return false;
		}
		CatalogCategoryProductPK castOther = (CatalogCategoryProductPK)other;
		return 
			(this.categoryId == castOther.categoryId)
			&& (this.productId == castOther.productId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.categoryId;
		hash = hash * prime + this.productId;
		
		return hash;
    }
}