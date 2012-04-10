package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_index_price_downlod_idx database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_price_downlod_idx")
public class CatalogProductIndexPriceDownlodIdx implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexPriceDownlodIdxPK id;

	@Column(name="max_price")
	private BigDecimal maxPrice;

	@Column(name="min_price")
	private BigDecimal minPrice;

    public CatalogProductIndexPriceDownlodIdx() {
    }

	public CatalogProductIndexPriceDownlodIdxPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexPriceDownlodIdxPK id) {
		this.id = id;
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

}