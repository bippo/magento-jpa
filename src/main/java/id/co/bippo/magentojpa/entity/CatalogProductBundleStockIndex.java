package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_bundle_stock_index database table.
 * 
 */
@Entity
@Table(name="catalog_product_bundle_stock_index")
public class CatalogProductBundleStockIndex implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductBundleStockIndexPK id;

	@Column(name="stock_status")
	private short stockStatus;

    public CatalogProductBundleStockIndex() {
    }

	public CatalogProductBundleStockIndexPK getId() {
		return this.id;
	}

	public void setId(CatalogProductBundleStockIndexPK id) {
		this.id = id;
	}
	
	public short getStockStatus() {
		return this.stockStatus;
	}

	public void setStockStatus(short stockStatus) {
		this.stockStatus = stockStatus;
	}

}