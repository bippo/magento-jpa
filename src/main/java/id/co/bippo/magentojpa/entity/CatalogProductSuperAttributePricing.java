package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_super_attribute_pricing database table.
 * 
 */
@Entity
@Table(name="catalog_product_super_attribute_pricing")
public class CatalogProductSuperAttributePricing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

	@Column(name="is_percent")
	private int isPercent;

	@Column(name="pricing_value")
	private BigDecimal pricingValue;

	@Column(name="value_index")
	private String valueIndex;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

	//bi-directional many-to-one association to CatalogProductSuperAttribute
    @ManyToOne
	@JoinColumn(name="product_super_attribute_id")
	private CatalogProductSuperAttribute catalogProductSuperAttribute;

    public CatalogProductSuperAttributePricing() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public int getIsPercent() {
		return this.isPercent;
	}

	public void setIsPercent(int isPercent) {
		this.isPercent = isPercent;
	}

	public BigDecimal getPricingValue() {
		return this.pricingValue;
	}

	public void setPricingValue(BigDecimal pricingValue) {
		this.pricingValue = pricingValue;
	}

	public String getValueIndex() {
		return this.valueIndex;
	}

	public void setValueIndex(String valueIndex) {
		this.valueIndex = valueIndex;
	}

	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
	public CatalogProductSuperAttribute getCatalogProductSuperAttribute() {
		return this.catalogProductSuperAttribute;
	}

	public void setCatalogProductSuperAttribute(CatalogProductSuperAttribute catalogProductSuperAttribute) {
		this.catalogProductSuperAttribute = catalogProductSuperAttribute;
	}
	
}