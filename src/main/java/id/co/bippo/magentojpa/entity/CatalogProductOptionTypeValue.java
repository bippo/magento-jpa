package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the catalog_product_option_type_value database table.
 * 
 */
@Entity
@Table(name="catalog_product_option_type_value")
public class CatalogProductOptionTypeValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_type_id")
	private int optionTypeId;

	private String sku;

	@Column(name="sort_order")
	private int sortOrder;

	//bi-directional many-to-one association to CatalogProductOptionTypePrice
	@OneToMany(mappedBy="catalogProductOptionTypeValue")
	private Set<CatalogProductOptionTypePrice> catalogProductOptionTypePrices;

	//bi-directional many-to-one association to CatalogProductOptionTypeTitle
	@OneToMany(mappedBy="catalogProductOptionTypeValue")
	private Set<CatalogProductOptionTypeTitle> catalogProductOptionTypeTitles;

	//bi-directional many-to-one association to CatalogProductOption
    @ManyToOne
	@JoinColumn(name="option_id")
	private CatalogProductOption catalogProductOption;

    public CatalogProductOptionTypeValue() {
    }

	public int getOptionTypeId() {
		return this.optionTypeId;
	}

	public void setOptionTypeId(int optionTypeId) {
		this.optionTypeId = optionTypeId;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Set<CatalogProductOptionTypePrice> getCatalogProductOptionTypePrices() {
		return this.catalogProductOptionTypePrices;
	}

	public void setCatalogProductOptionTypePrices(Set<CatalogProductOptionTypePrice> catalogProductOptionTypePrices) {
		this.catalogProductOptionTypePrices = catalogProductOptionTypePrices;
	}
	
	public Set<CatalogProductOptionTypeTitle> getCatalogProductOptionTypeTitles() {
		return this.catalogProductOptionTypeTitles;
	}

	public void setCatalogProductOptionTypeTitles(Set<CatalogProductOptionTypeTitle> catalogProductOptionTypeTitles) {
		this.catalogProductOptionTypeTitles = catalogProductOptionTypeTitles;
	}
	
	public CatalogProductOption getCatalogProductOption() {
		return this.catalogProductOption;
	}

	public void setCatalogProductOption(CatalogProductOption catalogProductOption) {
		this.catalogProductOption = catalogProductOption;
	}
	
}