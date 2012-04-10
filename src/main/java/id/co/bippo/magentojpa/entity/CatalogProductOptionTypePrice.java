package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the catalog_product_option_type_price database table.
 * 
 */
@Entity
@Table(name="catalog_product_option_type_price")
public class CatalogProductOptionTypePrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_type_price_id")
	private int optionTypePriceId;

	private BigDecimal price;

	@Column(name="price_type")
	private String priceType;

	//bi-directional many-to-one association to CatalogProductOptionTypeValue
    @ManyToOne
	@JoinColumn(name="option_type_id")
	private CatalogProductOptionTypeValue catalogProductOptionTypeValue;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public CatalogProductOptionTypePrice() {
    }

	public int getOptionTypePriceId() {
		return this.optionTypePriceId;
	}

	public void setOptionTypePriceId(int optionTypePriceId) {
		this.optionTypePriceId = optionTypePriceId;
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

	public CatalogProductOptionTypeValue getCatalogProductOptionTypeValue() {
		return this.catalogProductOptionTypeValue;
	}

	public void setCatalogProductOptionTypeValue(CatalogProductOptionTypeValue catalogProductOptionTypeValue) {
		this.catalogProductOptionTypeValue = catalogProductOptionTypeValue;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}