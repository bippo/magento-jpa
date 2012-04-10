package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_index_price_tmp database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_price_tmp")
public class CatalogProductIndexPriceTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexPriceTmpPK id;

	@Column(name="final_price")
	private BigDecimal finalPrice;

	@Column(name="max_price")
	private BigDecimal maxPrice;

	@Column(name="min_price")
	private BigDecimal minPrice;

	private BigDecimal price;

	@Column(name="tax_class_id")
	private int taxClassId;

	@Column(name="tier_price")
	private BigDecimal tierPrice;

    public CatalogProductIndexPriceTmp() {
    }

	public CatalogProductIndexPriceTmpPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexPriceTmpPK id) {
		this.id = id;
	}
	
	public BigDecimal getFinalPrice() {
		return this.finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
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