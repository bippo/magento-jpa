package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_flat_shipment_grid database table.
 * 
 */
@Entity
@Table(name="sales_flat_shipment_grid")
public class SalesFlatShipmentGrid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="increment_id")
	private String incrementId;

	@Column(name="order_created_at")
	private Timestamp orderCreatedAt;

	@Column(name="order_id")
	private int orderId;

	@Column(name="order_increment_id")
	private String orderIncrementId;

	@Column(name="shipment_status")
	private int shipmentStatus;

	@Column(name="shipping_name")
	private String shippingName;

	@Column(name="total_qty")
	private BigDecimal totalQty;

	//bi-directional one-to-one association to SalesFlatShipment
	@OneToOne
	@JoinColumn(name="entity_id")
	private SalesFlatShipment salesFlatShipment;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesFlatShipmentGrid() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getIncrementId() {
		return this.incrementId;
	}

	public void setIncrementId(String incrementId) {
		this.incrementId = incrementId;
	}

	public Timestamp getOrderCreatedAt() {
		return this.orderCreatedAt;
	}

	public void setOrderCreatedAt(Timestamp orderCreatedAt) {
		this.orderCreatedAt = orderCreatedAt;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderIncrementId() {
		return this.orderIncrementId;
	}

	public void setOrderIncrementId(String orderIncrementId) {
		this.orderIncrementId = orderIncrementId;
	}

	public int getShipmentStatus() {
		return this.shipmentStatus;
	}

	public void setShipmentStatus(int shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public String getShippingName() {
		return this.shippingName;
	}

	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	public BigDecimal getTotalQty() {
		return this.totalQty;
	}

	public void setTotalQty(BigDecimal totalQty) {
		this.totalQty = totalQty;
	}

	public SalesFlatShipment getSalesFlatShipment() {
		return this.salesFlatShipment;
	}

	public void setSalesFlatShipment(SalesFlatShipment salesFlatShipment) {
		this.salesFlatShipment = salesFlatShipment;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}