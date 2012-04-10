package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_flat_shipment_track database table.
 * 
 */
@Entity
@Table(name="sales_flat_shipment_track")
public class SalesFlatShipmentTrack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="carrier_code")
	private String carrierCode;

	@Column(name="created_at")
	private Timestamp createdAt;

    @Lob()
	private String description;

	@Column(name="order_id")
	private int orderId;

	private BigDecimal qty;

	private String title;

    @Lob()
	@Column(name="track_number")
	private String trackNumber;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	private BigDecimal weight;

	//bi-directional many-to-one association to SalesFlatShipment
    @ManyToOne
	@JoinColumn(name="parent_id")
	private SalesFlatShipment salesFlatShipment;

    public SalesFlatShipmentTrack() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getCarrierCode() {
		return this.carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrackNumber() {
		return this.trackNumber;
	}

	public void setTrackNumber(String trackNumber) {
		this.trackNumber = trackNumber;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public SalesFlatShipment getSalesFlatShipment() {
		return this.salesFlatShipment;
	}

	public void setSalesFlatShipment(SalesFlatShipment salesFlatShipment) {
		this.salesFlatShipment = salesFlatShipment;
	}
	
}