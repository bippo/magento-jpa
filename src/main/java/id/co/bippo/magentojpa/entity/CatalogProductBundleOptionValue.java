package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_bundle_option_value database table.
 * 
 */
@Entity
@Table(name="catalog_product_bundle_option_value")
public class CatalogProductBundleOptionValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

	@Column(name="store_id")
	private int storeId;

	private String title;

	//bi-directional many-to-one association to CatalogProductBundleOption
    @ManyToOne
	@JoinColumn(name="option_id")
	private CatalogProductBundleOption catalogProductBundleOption;

    public CatalogProductBundleOptionValue() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CatalogProductBundleOption getCatalogProductBundleOption() {
		return this.catalogProductBundleOption;
	}

	public void setCatalogProductBundleOption(CatalogProductBundleOption catalogProductBundleOption) {
		this.catalogProductBundleOption = catalogProductBundleOption;
	}
	
}