package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sales_flat_invoice_comment database table.
 * 
 */
@Entity
@Table(name="sales_flat_invoice_comment")
public class SalesFlatInvoiceComment implements Serializable {
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

	//bi-directional many-to-one association to SalesFlatInvoice
    @ManyToOne
	@JoinColumn(name="parent_id")
	private SalesFlatInvoice salesFlatInvoice;

    public SalesFlatInvoiceComment() {
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

	public SalesFlatInvoice getSalesFlatInvoice() {
		return this.salesFlatInvoice;
	}

	public void setSalesFlatInvoice(SalesFlatInvoice salesFlatInvoice) {
		this.salesFlatInvoice = salesFlatInvoice;
	}
	
}