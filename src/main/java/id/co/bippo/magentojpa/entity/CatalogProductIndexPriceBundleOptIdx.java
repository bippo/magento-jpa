package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_index_price_bundle_opt_idx database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_price_bundle_opt_idx")
public class CatalogProductIndexPriceBundleOptIdx implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexPriceBundleOptIdxPK id;

	@Column(name="alt_price")
	private BigDecimal altPrice;

	@Column(name="alt_tier_price")
	private BigDecimal altTierPrice;

	@Column(name="max_price")
	private BigDecimal maxPrice;

	@Column(name="min_price")
	private BigDecimal minPrice;

	@Column(name="tier_price")
	private BigDecimal tierPrice;

    public CatalogProductIndexPriceBundleOptIdx() {
    }

	public CatalogProductIndexPriceBundleOptIdxPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexPriceBundleOptIdxPK id) {
		this.id = id;
	}
	
	public BigDecimal getAltPrice() {
		return this.altPrice;
	}

	public void setAltPrice(BigDecimal altPrice) {
		this.altPrice = altPrice;
	}

	public BigDecimal getAltTierPrice() {
		return this.altTierPrice;
	}

	public void setAltTierPrice(BigDecimal altTierPrice) {
		this.altTierPrice = altTierPrice;
	}

	public BigDecimal getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}

	public BigDecimal getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}

	public BigDecimal getTierPrice() {
		return this.tierPrice;
	}

	public void setTierPrice(BigDecimal tierPrice) {
		this.tierPrice = tierPrice;
	}

}