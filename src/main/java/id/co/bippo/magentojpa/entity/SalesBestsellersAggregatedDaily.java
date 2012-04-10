package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sales_bestsellers_aggregated_daily database table.
 * 
 */
@Entity
@Table(name="sales_bestsellers_aggregated_daily")
public class SalesBestsellersAggregatedDaily implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

    @Temporal( TemporalType.DATE)
	private Date period;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_price")
	private BigDecimal productPrice;

	@Column(name="qty_ordered")
	private BigDecimal qtyOrdered;

	@Column(name="rating_pos")
	private int ratingPos;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesBestsellersAggregatedDaily() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPeriod() {
		return this.period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public BigDecimal getQtyOrdered() {
		return this.qtyOrdered;
	}

	public void setQtyOrdered(BigDecimal qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public int getRatingPos() {
		return this.ratingPos;
	}

	public void setRatingPos(int ratingPos) {
		this.ratingPos = ratingPos;
	}

	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}