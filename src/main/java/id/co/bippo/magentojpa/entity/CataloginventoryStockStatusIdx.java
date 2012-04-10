package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the cataloginventory_stock_status_idx database table.
 * 
 */
@Entity
@Table(name="cataloginventory_stock_status_idx")
public class CataloginventoryStockStatusIdx implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CataloginventoryStockStatusIdxPK id;

	private BigDecimal qty;

	@Column(name="stock_status")
	private int stockStatus;

    public CataloginventoryStockStatusIdx() {
    }

	public CataloginventoryStockStatusIdxPK getId() {
		return this.id;
	}

	public void setId(CataloginventoryStockStatusIdxPK id) {
		this.id = id;
	}
	
	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public int getStockStatus() {
		return this.stockStatus;
	}

	public void setStockStatus(int stockStatus) {
		this.stockStatus = stockStatus;
	}

}