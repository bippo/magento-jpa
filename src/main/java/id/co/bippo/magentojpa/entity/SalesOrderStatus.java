package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the sales_order_status database table.
 * 
 */
@Entity
@Table(name="sales_order_status")
public class SalesOrderStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String status;

	private String label;

//	//bi-directional many-to-one association to SalesOrderStatusLabel
//	@OneToMany(mappedBy="salesOrderStatus")
//	private Set<SalesOrderStatusLabel> salesOrderStatusLabels;

//	//bi-directional many-to-one association to SalesOrderStatusState
//	@OneToMany(mappedBy="salesOrderStatus")
//	private Set<SalesOrderStatusState> salesOrderStatusStates;

    public SalesOrderStatus() {
    }

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

//	public Set<SalesOrderStatusLabel> getSalesOrderStatusLabels() {
//		return this.salesOrderStatusLabels;
//	}
//
//	public void setSalesOrderStatusLabels(Set<SalesOrderStatusLabel> salesOrderStatusLabels) {
//		this.salesOrderStatusLabels = salesOrderStatusLabels;
//	}
	
//	public Set<SalesOrderStatusState> getSalesOrderStatusStates() {
//		return this.salesOrderStatusStates;
//	}
//
//	public void setSalesOrderStatusStates(Set<SalesOrderStatusState> salesOrderStatusStates) {
//		this.salesOrderStatusStates = salesOrderStatusStates;
//	}
	
}