package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the cataloginventory_stock_item database table.
 * 
 */
@Entity
@Table(name="cataloginventory_stock_item")
public class CataloginventoryStockItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id")
	private int itemId;

	private int backorders;

	@Column(name="enable_qty_increments")
	private int enableQtyIncrements;

	@Column(name="is_in_stock")
	private int isInStock;

	@Column(name="is_qty_decimal")
	private int isQtyDecimal;

	@Column(name="low_stock_date")
	private Timestamp lowStockDate;

	@Column(name="manage_stock")
	private int manageStock;

	@Column(name="max_sale_qty")
	private BigDecimal maxSaleQty;

	@Column(name="min_qty")
	private BigDecimal minQty;

	@Column(name="min_sale_qty")
	private BigDecimal minSaleQty;

	@Column(name="notify_stock_qty")
	private BigDecimal notifyStockQty;

	private BigDecimal qty;

	@Column(name="qty_increments")
	private BigDecimal qtyIncrements;

	@Column(name="stock_status_changed_auto")
	private int stockStatusChangedAuto;

	@Column(name="use_config_backorders")
	private int useConfigBackorders;

	@Column(name="use_config_enable_qty_inc")
	private int useConfigEnableQtyInc;

	@Column(name="use_config_manage_stock")
	private int useConfigManageStock;

	@Column(name="use_config_max_sale_qty")
	private int useConfigMaxSaleQty;

	@Column(name="use_config_min_qty")
	private int useConfigMinQty;

	@Column(name="use_config_min_sale_qty")
	private int useConfigMinSaleQty;

	@Column(name="use_config_notify_stock_qty")
	private int useConfigNotifyStockQty;

	@Column(name="use_config_qty_increments")
	private int useConfigQtyIncrements;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CataloginventoryStock
    @ManyToOne
	@JoinColumn(name="stock_id")
	private CataloginventoryStock cataloginventoryStock;

    public CataloginventoryStockItem() {
    }

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getBackorders() {
		return this.backorders;
	}

	public void setBackorders(int backorders) {
		this.backorders = backorders;
	}

	public int getEnableQtyIncrements() {
		return this.enableQtyIncrements;
	}

	public void setEnableQtyIncrements(int enableQtyIncrements) {
		this.enableQtyIncrements = enableQtyIncrements;
	}

	public int getIsInStock() {
		return this.isInStock;
	}

	public void setIsInStock(int isInStock) {
		this.isInStock = isInStock;
	}

	public int getIsQtyDecimal() {
		return this.isQtyDecimal;
	}

	public void setIsQtyDecimal(int isQtyDecimal) {
		this.isQtyDecimal = isQtyDecimal;
	}

	public Timestamp getLowStockDate() {
		return this.lowStockDate;
	}

	public void setLowStockDate(Timestamp lowStockDate) {
		this.lowStockDate = lowStockDate;
	}

	public int getManageStock() {
		return this.manageStock;
	}

	public void setManageStock(int manageStock) {
		this.manageStock = manageStock;
	}

	public BigDecimal getMaxSaleQty() {
		return this.maxSaleQty;
	}

	public void setMaxSaleQty(BigDecimal maxSaleQty) {
		this.maxSaleQty = maxSaleQty;
	}

	public BigDecimal getMinQty() {
		return this.minQty;
	}

	public void setMinQty(BigDecimal minQty) {
		this.minQty = minQty;
	}

	public BigDecimal getMinSaleQty() {
		return this.minSaleQty;
	}

	public void setMinSaleQty(BigDecimal minSaleQty) {
		this.minSaleQty = minSaleQty;
	}

	public BigDecimal getNotifyStockQty() {
		return this.notifyStockQty;
	}

	public void setNotifyStockQty(BigDecimal notifyStockQty) {
		this.notifyStockQty = notifyStockQty;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public BigDecimal getQtyIncrements() {
		return this.qtyIncrements;
	}

	public void setQtyIncrements(BigDecimal qtyIncrements) {
		this.qtyIncrements = qtyIncrements;
	}

	public int getStockStatusChangedAuto() {
		return this.stockStatusChangedAuto;
	}

	public void setStockStatusChangedAuto(int stockStatusChangedAuto) {
		this.stockStatusChangedAuto = stockStatusChangedAuto;
	}

	public int getUseConfigBackorders() {
		return this.useConfigBackorders;
	}

	public void setUseConfigBackorders(int useConfigBackorders) {
		this.useConfigBackorders = useConfigBackorders;
	}

	public int getUseConfigEnableQtyInc() {
		return this.useConfigEnableQtyInc;
	}

	public void setUseConfigEnableQtyInc(int useConfigEnableQtyInc) {
		this.useConfigEnableQtyInc = useConfigEnableQtyInc;
	}

	public int getUseConfigManageStock() {
		return this.useConfigManageStock;
	}

	public void setUseConfigManageStock(int useConfigManageStock) {
		this.useConfigManageStock = useConfigManageStock;
	}

	public int getUseConfigMaxSaleQty() {
		return this.useConfigMaxSaleQty;
	}

	public void setUseConfigMaxSaleQty(int useConfigMaxSaleQty) {
		this.useConfigMaxSaleQty = useConfigMaxSaleQty;
	}

	public int getUseConfigMinQty() {
		return this.useConfigMinQty;
	}

	public void setUseConfigMinQty(int useConfigMinQty) {
		this.useConfigMinQty = useConfigMinQty;
	}

	public int getUseConfigMinSaleQty() {
		return this.useConfigMinSaleQty;
	}

	public void setUseConfigMinSaleQty(int useConfigMinSaleQty) {
		this.useConfigMinSaleQty = useConfigMinSaleQty;
	}

	public int getUseConfigNotifyStockQty() {
		return this.useConfigNotifyStockQty;
	}

	public void setUseConfigNotifyStockQty(int useConfigNotifyStockQty) {
		this.useConfigNotifyStockQty = useConfigNotifyStockQty;
	}

	public int getUseConfigQtyIncrements() {
		return this.useConfigQtyIncrements;
	}

	public void setUseConfigQtyIncrements(int useConfigQtyIncrements) {
		this.useConfigQtyIncrements = useConfigQtyIncrements;
	}

	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public CataloginventoryStock getCataloginventoryStock() {
		return this.cataloginventoryStock;
	}

	public void setCataloginventoryStock(CataloginventoryStock cataloginventoryStock) {
		this.cataloginventoryStock = cataloginventoryStock;
	}
	
}