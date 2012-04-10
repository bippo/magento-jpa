package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the sales_flat_shipment database table.
 * 
 */
@Entity
@Table(name="sales_flat_shipment")
public class SalesFlatShipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="billing_address_id")
	private int billingAddressId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="email_sent")
	private int emailSent;

	@Column(name="increment_id")
	private String incrementId;

    @Lob()
	private String packages;

	@Column(name="shipment_status")
	private int shipmentStatus;

	@Column(name="shipping_address_id")
	private int shippingAddressId;

    @Lob()
	@Column(name="shipping_label")
	private byte[] shippingLabel;

	@Column(name="total_qty")
	private BigDecimal totalQty;

	@Column(name="total_weight")
	private BigDecimal totalWeight;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to SalesFlatOrder
    @ManyToOne
	@JoinColumn(name="order_id")
	private SalesFlatOrder salesFlatOrder;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to SalesFlatShipmentComment
	@OneToMany(mappedBy="salesFlatShipment")
	private Set<SalesFlatShipmentComment> salesFlatShipmentComments;

	//bi-directional one-to-one association to SalesFlatShipmentGrid
	@OneToOne(mappedBy="salesFlatShipment")
	private SalesFlatShipmentGrid salesFlatShipmentGrid;

	//bi-directional many-to-one association to SalesFlatShipmentItem
	@OneToMany(mappedBy="salesFlatShipment")
	private Set<SalesFlatShipmentItem> salesFlatShipmentItems;

	//bi-directional many-to-one association to SalesFlatShipmentTrack
	@OneToMany(mappedBy="salesFlatShipment")
	private Set<SalesFlatShipmentTrack> salesFlatShipmentTracks;

    public SalesFlatShipment() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public int getBillingAddressId() {
		return this.billingAddressId;
	}

	public void setBillingAddressId(int billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getEmailSent() {
		return this.emailSent;
	}

	public void setEmailSent(int emailSent) {
		this.emailSent = emailSent;
	}

	public String getIncrementId() {
		return this.incrementId;
	}

	public void setIncrementId(String incrementId) {
		this.incrementId = incrementId;
	}

	public String getPackages() {
		return this.packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}

	public int getShipmentStatus() {
		return this.shipmentStatus;
	}

	public void setShipmentStatus(int shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public int getShippingAddressId() {
		return this.shippingAddressId;
	}

	public void setShippingAddressId(int shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public byte[] getShippingLabel() {
		return this.shippingLabel;
	}

	public void setShippingLabel(byte[] shippingLabel) {
		this.shippingLabel = shippingLabel;
	}

	public BigDecimal getTotalQty() {
		return this.totalQty;
	}

	public void setTotalQty(BigDecimal totalQty) {
		this.totalQty = totalQty;
	}

	public BigDecimal getTotalWeight() {
		return this.totalWeight;
	}

	public void setTotalWeight(BigDecimal totalWeight) {
		this.totalWeight = totalWeight;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public SalesFlatOrder getSalesFlatOrder() {
		return this.salesFlatOrder;
	}

	public void setSalesFlatOrder(SalesFlatOrder salesFlatOrder) {
		this.salesFlatOrder = salesFlatOrder;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<SalesFlatShipmentComment> getSalesFlatShipmentComments() {
		return this.salesFlatShipmentComments;
	}

	public void setSalesFlatShipmentComments(Set<SalesFlatShipmentComment> salesFlatShipmentComments) {
		this.salesFlatShipmentComments = salesFlatShipmentComments;
	}
	
	public SalesFlatShipmentGrid getSalesFlatShipmentGrid() {
		return this.salesFlatShipmentGrid;
	}

	public void setSalesFlatShipmentGrid(SalesFlatShipmentGrid salesFlatShipmentGrid) {
		this.salesFlatShipmentGrid = salesFlatShipmentGrid;
	}
	
	public Set<SalesFlatShipmentItem> getSalesFlatShipmentItems() {
		return this.salesFlatShipmentItems;
	}

	public void setSalesFlatShipmentItems(Set<SalesFlatShipmentItem> salesFlatShipmentItems) {
		this.salesFlatShipmentItems = salesFlatShipmentItems;
	}
	
	public Set<SalesFlatShipmentTrack> getSalesFlatShipmentTracks() {
		return this.salesFlatShipmentTracks;
	}

	public void setSalesFlatShipmentTracks(Set<SalesFlatShipmentTrack> salesFlatShipmentTracks) {
		this.salesFlatShipmentTracks = salesFlatShipmentTracks;
	}
	
}