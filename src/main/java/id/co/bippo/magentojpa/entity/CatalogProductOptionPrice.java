package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_option_price database table.
 * 
 */
@Entity
@Table(name="catalog_product_option_price")
public class CatalogProductOptionPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_price_id")
	private int optionPriceId;

	private BigDecimal price;

	@Column(name="price_type")
	private String priceType;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to CatalogProductOption
    @ManyToOne
	@JoinColumn(name="option_id")
	private CatalogProductOption catalogProductOption;

    public CatalogProductOptionPrice() {
    }

	public int getOptionPriceId() {
		return this.optionPriceId;
	}

	public void setOptionPriceId(int optionPriceId) {
		this.optionPriceId = optionPriceId;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPriceType() {
		return this.priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public CatalogProductOption getCatalogProductOption() {
		return this.catalogProductOption;
	}

	public void setCatalogProductOption(CatalogProductOption catalogProductOption) {
		this.catalogProductOption = catalogProductOption;
	}
	
}