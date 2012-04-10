package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the salesrule_label database table.
 * 
 */
@Entity
@Table(name="salesrule_label")
public class SalesruleLabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="label_id")
	private int labelId;

	private String label;

	//bi-directional many-to-one association to Salesrule
    @ManyToOne
	@JoinColumn(name="rule_id")
	private Salesrule salesrule;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public SalesruleLabel() {
    }

	public int getLabelId() {
		return this.labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Salesrule getSalesrule() {
		return this.salesrule;
	}

	public void setSalesrule(Salesrule salesrule) {
		this.salesrule = salesrule;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}