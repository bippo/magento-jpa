package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_category_anc_categs_index_idx database table.
 * 
 */
@Entity
@Table(name="catalog_category_anc_categs_index_idx")
public class CatalogCategoryAncCategsIndexIdx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="category_id")
	private int categoryId;

	private String path;

    public CatalogCategoryAncCategsIndexIdx() {
    }

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}