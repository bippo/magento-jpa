package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_option_type_title database table.
 * 
 */
@Entity
@Table(name="catalog_product_option_type_title")
public class CatalogProductOptionTypeTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_type_title_id")
	private int optionTypeTitleId;

	private String title;

	//bi-directional many-to-one association to CatalogProductOptionTypeValue
    @ManyToOne
	@JoinColumn(name="option_type_id")
	private CatalogProductOptionTypeValue catalogProductOptionTypeValue;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public CatalogProductOptionTypeTitle() {
    }

	public int getOptionTypeTitleId() {
		return this.optionTypeTitleId;
	}

	public void setOptionTypeTitleId(int optionTypeTitleId) {
		this.optionTypeTitleId = optionTypeTitleId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CatalogProductOptionTypeValue getCatalogProductOptionTypeValue() {
		return this.catalogProductOptionTypeValue;
	}

	public void setCatalogProductOptionTypeValue(CatalogProductOptionTypeValue catalogProductOptionTypeValue) {
		this.catalogProductOptionTypeValue = catalogProductOptionTypeValue;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}