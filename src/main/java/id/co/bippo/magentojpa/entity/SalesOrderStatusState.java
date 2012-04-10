package id.co.bippo.magentojpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the sales_order_status_state database table.
 * 
 */
@Entity
@Table(name="sales_order_status_state")
//@IdClass(SalesOrderStatusStatePK.class)
public class SalesOrderStatusState implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalesOrderStatusStatePK id;

	@Column(name="is_default")
	private int isDefault;

	//bi-directional many-to-one association to SalesOrderStatus
//    @ManyToOne
//	@JoinColumn(name="status")
//	private SalesOrderStatus salesOrderStatus;

    public SalesOrderStatusState() {
    }

	public SalesOrderStatusStatePK getId() {
		return this.id;
	}

	public void setId(SalesOrderStatusStatePK id) {
		this.id = id;
	}
	
	public int getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}

//	public SalesOrderStatus getSalesOrderStatus() {
//		return this.salesOrderStatus;
//	}
//
//	public void setSalesOrderStatus(SalesOrderStatus salesOrderStatus) {
//		this.salesOrderStatus = salesOrderStatus;
//	}
	
}