package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the core_variable_value database table.
 * 
 */
@Entity
@Table(name="core_variable_value")
public class CoreVariableValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

    @Lob()
	@Column(name="html_value")
	private String htmlValue;

    @Lob()
	@Column(name="plain_value")
	private String plainValue;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to CoreVariable
    @ManyToOne
	@JoinColumn(name="variable_id")
	private CoreVariable coreVariable;

    public CoreVariableValue() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public String getHtmlValue() {
		return this.htmlValue;
	}

	public void setHtmlValue(String htmlValue) {
		this.htmlValue = htmlValue;
	}

	public String getPlainValue() {
		return this.plainValue;
	}

	public void setPlainValue(String plainValue) {
		this.plainValue = plainValue;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public CoreVariable getCoreVariable() {
		return this.coreVariable;
	}

	public void setCoreVariable(CoreVariable coreVariable) {
		this.coreVariable = coreVariable;
	}
	
}