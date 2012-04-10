package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_option_title database table.
 * 
 */
@Entity
@Table(name="catalog_product_option_title")
public class CatalogProductOptionTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_title_id")
	private int optionTitleId;

	private String title;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to CatalogProductOption
    @ManyToOne
	@JoinColumn(name="option_id")
	private CatalogProductOption catalogProductOption;

    public CatalogProductOptionTitle() {
    }

	public int getOptionTitleId() {
		return this.optionTitleId;
	}

	public void setOptionTitleId(int optionTitleId) {
		this.optionTitleId = optionTitleId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public CatalogProductOption getCatalogProductOption() {
		return this.catalogProductOption;
	}

	public void setCatalogProductOption(CatalogProductOption catalogProductOption) {
		this.catalogProductOption = catalogProductOption;
	}
	
}