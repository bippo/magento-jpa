package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sales_recurring_profile_order database table.
 * 
 */
@Entity
@Table(name="sales_recurring_profile_order")
public class SalesRecurringProfileOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="link_id")
	private int linkId;

	//bi-directional many-to-one association to SalesFlatOrder
    @ManyToOne
	@JoinColumn(name="order_id")
	private SalesFlatOrder salesFlatOrder;

	//bi-directional many-to-one association to SalesRecurringProfile
    @ManyToOne
	@JoinColumn(name="profile_id")
	private SalesRecurringProfile salesRecurringProfile;

    public SalesRecurringProfileOrder() {
    }

	public int getLinkId() {
		return this.linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public SalesFlatOrder getSalesFlatOrder() {
		return this.salesFlatOrder;
	}

	public void setSalesFlatOrder(SalesFlatOrder salesFlatOrder) {
		this.salesFlatOrder = salesFlatOrder;
	}
	
	public SalesRecurringProfile getSalesRecurringProfile() {
		return this.salesRecurringProfile;
	}

	public void setSalesRecurringProfile(SalesRecurringProfile salesRecurringProfile) {
		this.salesRecurringProfile = salesRecurringProfile;
	}
	
}