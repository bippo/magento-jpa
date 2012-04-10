package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cataloginventory_stock_status database table.
 * 
 */
@Embeddable
public class CataloginventoryStockStatusPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private int productId;

	@Column(name="website_id")
	private int websiteId;

	@Column(name="stock_id")
	private int stockId;

    public CataloginventoryStockStatusPK() {
    }
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getWebsiteId() {
		return this.websiteId;
	}
	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}
	public int getStockId() {
		return this.stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CataloginventoryStockStatusPK)) {
			return false;
		}
		CataloginventoryStockStatusPK castOther = (CataloginventoryStockStatusPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.websiteId == castOther.websiteId)
			&& (this.stockId == castOther.stockId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.websiteId;
		hash = hash * prime + this.stockId;
		
		return hash;
    }
}