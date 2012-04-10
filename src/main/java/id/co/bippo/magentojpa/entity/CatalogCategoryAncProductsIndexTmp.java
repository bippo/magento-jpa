package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_category_anc_products_index_tmp database table.
 * 
 */
@Entity
@Table(name="catalog_category_anc_products_index_tmp")
public class CatalogCategoryAncProductsIndexTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="category_id")
	private int categoryId;

	@Column(name="product_id")
	private int productId;

    public CatalogCategoryAncProductsIndexTmp() {
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

}