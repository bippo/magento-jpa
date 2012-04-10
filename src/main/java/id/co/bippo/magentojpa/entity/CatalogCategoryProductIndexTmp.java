package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_category_product_index_tmp database table.
 * 
 */
@Entity
@Table(name="catalog_category_product_index_tmp")
public class CatalogCategoryProductIndexTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="category_id")
	private int categoryId;

	@Column(name="is_parent")
	private int isParent;

	private int position;

	@Column(name="product_id")
	private int productId;

	@Column(name="store_id")
	private int storeId;

	private int visibility;

    public CatalogCategoryProductIndexTmp() {
    }

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getVisibility() {
		return this.visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

}