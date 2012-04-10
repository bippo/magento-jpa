package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the cataloginventory_stock database table.
 * 
 */
@Entity
@Table(name="cataloginventory_stock")
public class CataloginventoryStock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stock_id")
	private int stockId;

	@Column(name="stock_name")
	private String stockName;

	//bi-directional many-to-one association to CataloginventoryStockItem
	@OneToMany(mappedBy="cataloginventoryStock")
	private Set<CataloginventoryStockItem> cataloginventoryStockItems;

//	//bi-directional many-to-one association to CataloginventoryStockStatus
//	@OneToMany(mappedBy="cataloginventoryStock")
//	private Set<CataloginventoryStockStatus> cataloginventoryStockStatuses;

    public CataloginventoryStock() {
    }

	public int getStockId() {
		return this.stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Set<CataloginventoryStockItem> getCataloginventoryStockItems() {
		return this.cataloginventoryStockItems;
	}

	public void setCataloginventoryStockItems(Set<CataloginventoryStockItem> cataloginventoryStockItems) {
		this.cataloginventoryStockItems = cataloginventoryStockItems;
	}
	
//	public Set<CataloginventoryStockStatus> getCataloginventoryStockStatuses() {
//		return this.cataloginventoryStockStatuses;
//	}
//
//	public void setCataloginventoryStockStatuses(Set<CataloginventoryStockStatus> cataloginventoryStockStatuses) {
//		this.cataloginventoryStockStatuses = cataloginventoryStockStatuses;
//	}
	
}