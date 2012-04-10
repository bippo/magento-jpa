package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_category_product_index_enbl_idx database table.
 * 
 */
@Entity
@Table(name="catalog_category_product_index_enbl_idx")
public class CatalogCategoryProductIndexEnblIdx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private int productId;

	private int visibility;

    public CatalogCategoryProductIndexEnblIdx() {
    }

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getVisibility() {
		return this.visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

}