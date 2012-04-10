package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the cataloginventory_stock_status database table.
 * 
 */
@Entity
@Table(name="cataloginventory_stock_status")
public class CataloginventoryStockStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CataloginventoryStockStatusPK id;

	private BigDecimal qty;

	@Column(name="stock_status")
	private int stockStatus;

//	//bi-directional many-to-one association to CatalogProductEntity
//    @ManyToOne
//	@JoinColumn(name="product_id")
//	private CatalogProductEntity catalogProductEntity;
//
//	//bi-directional many-to-one association to CataloginventoryStock
//    @ManyToOne
//	@JoinColumn(name="stock_id")
//	private CataloginventoryStock cataloginventoryStock;
//
//	//bi-directional many-to-one association to CoreWebsite
//    @ManyToOne
//	@JoinColumn(name="website_id")
//	private CoreWebsite coreWebsite;

    public CataloginventoryStockStatus() {
    }

	public CataloginventoryStockStatusPK getId() {
		return this.id;
	}

	public void setId(CataloginventoryStockStatusPK id) {
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

//	public CatalogProductEntity getCatalogProductEntity() {
//		return this.catalogProductEntity;
//	}
//
//	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
//		this.catalogProductEntity = catalogProductEntity;
//	}
//	
//	public CataloginventoryStock getCataloginventoryStock() {
//		return this.cataloginventoryStock;
//	}
//
//	public void setCataloginventoryStock(CataloginventoryStock cataloginventoryStock) {
//		this.cataloginventoryStock = cataloginventoryStock;
//	}
//	
//	public CoreWebsite getCoreWebsite() {
//		return this.coreWebsite;
//	}
//
//	public void setCoreWebsite(CoreWebsite coreWebsite) {
//		this.coreWebsite = coreWebsite;
//	}
	
}