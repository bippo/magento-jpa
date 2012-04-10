package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_bundle_selection_price database table.
 * 
 */
@Entity
@Table(name="catalog_product_bundle_selection_price")
public class CatalogProductBundleSelectionPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductBundleSelectionPricePK id;

	@Column(name="selection_price_type")
	private int selectionPriceType;

	@Column(name="selection_price_value")
	private BigDecimal selectionPriceValue;

	//bi-directional many-to-one association to CoreWebsite
//    @ManyToOne
//	@JoinColumn(name="website_id")
//	private CoreWebsite coreWebsite;
//
//	//bi-directional many-to-one association to CatalogProductBundleSelection
//    @ManyToOne
//	@JoinColumn(name="selection_id")
//	private CatalogProductBundleSelection catalogProductBundleSelection;

    public CatalogProductBundleSelectionPrice() {
    }

	public CatalogProductBundleSelectionPricePK getId() {
		return this.id;
	}

	public void setId(CatalogProductBundleSelectionPricePK id) {
		this.id = id;
	}
	
	public int getSelectionPriceType() {
		return this.selectionPriceType;
	}

	public void setSelectionPriceType(int selectionPriceType) {
		this.selectionPriceType = selectionPriceType;
	}

	public BigDecimal getSelectionPriceValue() {
		return this.selectionPriceValue;
	}

	public void setSelectionPriceValue(BigDecimal selectionPriceValue) {
		this.selectionPriceValue = selectionPriceValue;
	}

//	public CoreWebsite getCoreWebsite() {
//		return this.coreWebsite;
//	}
//
//	public void setCoreWebsite(CoreWebsite coreWebsite) {
//		this.coreWebsite = coreWebsite;
//	}
//	
//	public CatalogProductBundleSelection getCatalogProductBundleSelection() {
//		return this.catalogProductBundleSelection;
//	}
//
//	public void setCatalogProductBundleSelection(CatalogProductBundleSelection catalogProductBundleSelection) {
//		this.catalogProductBundleSelection = catalogProductBundleSelection;
//	}
	
}