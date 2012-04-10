package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_index_price_bundle_sel_idx database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_price_bundle_sel_idx")
public class CatalogProductIndexPriceBundleSelIdx implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductIndexPriceBundleSelIdxPK id;

	@Column(name="group_type")
	private int groupType;

	@Column(name="is_required")
	private int isRequired;

	private BigDecimal price;

	@Column(name="tier_price")
	private BigDecimal tierPrice;

    public CatalogProductIndexPriceBundleSelIdx() {
    }

	public CatalogProductIndexPriceBundleSelIdxPK getId() {
		return this.id;
	}

	public void setId(CatalogProductIndexPriceBundleSelIdxPK id) {
		this.id = id;
	}
	
	public int getGroupType() {
		return this.groupType;
	}

	public void setGroupType(int groupType) {
		this.groupType = groupType;
	}

	public int getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(int isRequired) {
		this.isRequired = isRequired;
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