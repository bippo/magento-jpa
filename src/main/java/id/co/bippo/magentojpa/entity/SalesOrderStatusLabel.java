package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sales_order_status_label database table.
 * 
 */
@Entity
@Table(name="sales_order_status_label")
public class SalesOrderStatusLabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalesOrderStatusLabelPK id;

	private String label;

	//bi-directional many-to-one association to SalesOrderStatus
    @ManyToOne
	@JoinColumn(name="status")
	private SalesOrderStatus salesOrderStatus;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesOrderStatusLabel() {
    }

	public SalesOrderStatusLabelPK getId() {
		return this.id;
	}

	public void setId(SalesOrderStatusLabelPK id) {
		this.id = id;
	}
	
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public SalesOrderStatus getSalesOrderStatus() {
		return this.salesOrderStatus;
	}

	public void setSalesOrderStatus(SalesOrderStatus salesOrderStatus) {
		this.salesOrderStatus = salesOrderStatus;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}