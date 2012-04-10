package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sales_flat_shipment_comment database table.
 * 
 */
@Entity
@Table(name="sales_flat_shipment_comment")
public class SalesFlatShipmentComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

    @Lob()
	private String comment;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="is_customer_notified")
	private int isCustomerNotified;

	@Column(name="is_visible_on_front")
	private int isVisibleOnFront;

	//bi-directional many-to-one association to SalesFlatShipment
    @ManyToOne
	@JoinColumn(name="parent_id")
	private SalesFlatShipment salesFlatShipment;

    public SalesFlatShipmentComment() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getIsCustomerNotified() {
		return this.isCustomerNotified;
	}

	public void setIsCustomerNotified(int isCustomerNotified) {
		this.isCustomerNotified = isCustomerNotified;
	}

	public int getIsVisibleOnFront() {
		return this.isVisibleOnFront;
	}

	public void setIsVisibleOnFront(int isVisibleOnFront) {
		this.isVisibleOnFront = isVisibleOnFront;
	}

	public SalesFlatShipment getSalesFlatShipment() {
		return this.salesFlatShipment;
	}

	public void setSalesFlatShipment(SalesFlatShipment salesFlatShipment) {
		this.salesFlatShipment = salesFlatShipment;
	}
	
}