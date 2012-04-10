package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_index_price_cfg_opt_agr_tmp database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_price_cfg_opt_agr_tmp")
public class CatalogProductIndexPriceCfgOptAgrTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexPriceCfgOptAgrTmpPK id;

	private BigDecimal price;

	@Column(name="tier_price")
	private BigDecimal tierPrice;

    public CatalogProductIndexPriceCfgOptAgrTmp() {
    }

	public CatalogProductIndexPriceCfgOptAgrTmpPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexPriceCfgOptAgrTmpPK id) {
		this.id = id;
	}
	
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getTierPrice() {
		return this.tierPrice;
	}

	public void setTierPrice(BigDecimal tierPrice) {
		this.tierPrice = tierPrice;
	}

}