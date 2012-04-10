package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the design_change database table.
 * 
 */
@Entity
@Table(name="design_change")
public class DesignChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="design_change_id")
	private int designChangeId;

    @Temporal( TemporalType.DATE)
	@Column(name="date_from")
	private Date dateFrom;

    @Temporal( TemporalType.DATE)
	@Column(name="date_to")
	private Date dateTo;

	private String design;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public DesignChange() {
    }

	public int getDesignChangeId() {
		return this.designChangeId;
	}

	public void setDesignChangeId(int designChangeId) {
		this.designChangeId = designChangeId;
	}

	public Date getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getDesign() {
		return this.design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}