package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_index_price_final_tmp database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_price_final_tmp")
public class CatalogProductIndexPriceFinalTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexPriceFinalTmpPK id;

	@Column(name="base_tier")
	private BigDecimal baseTier;

	@Column(name="max_price")
	private BigDecimal maxPrice;

	@Column(name="min_price")
	private BigDecimal minPrice;

	@Column(name="orig_price")
	private BigDecimal origPrice;

	private BigDecimal price;

	@Column(name="tax_class_id")
	private int taxClassId;

	@Column(name="tier_price")
	private BigDecimal tierPrice;

    public CatalogProductIndexPriceFinalTmp() {
    }

	public CatalogProductIndexPriceFinalTmpPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexPriceFinalTmpPK id) {
		this.id = id;
	}
	
	public BigDecimal getBaseTier() {
		return this.baseTier;
	}

	public void setBaseTier(BigDecimal baseTier) {
		this.baseTier = baseTier;
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

	public BigDecimal getOrigPrice() {
		return this.origPrice;
	}

	public void setOrigPrice(BigDecimal origPrice) {
		this.origPrice = origPrice;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getTaxClassId() {
		return this.taxClassId;
	}

	public void setTaxClassId(int taxClassId) {
		this.taxClassId = taxClassId;
	}

	public BigDecimal getTierPrice() {
		return this.tierPrice;
	}

	public void setTierPrice(BigDecimal tierPrice) {
		this.tierPrice = tierPrice;
	}

}