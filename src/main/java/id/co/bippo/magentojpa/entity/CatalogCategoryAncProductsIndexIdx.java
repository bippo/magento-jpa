package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_category_anc_products_index_idx database table.
 * 
 */
@Entity
@Table(name="catalog_category_anc_products_index_idx")
public class CatalogCategoryAncProductsIndexIdx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="category_id")
	private int categoryId;

	private int position;

	@Column(name="product_id")
	private int productId;

    public CatalogCategoryAncProductsIndexIdx() {
    }

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}