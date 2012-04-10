package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eav_attribute_option_value database table.
 * 
 */
@Entity
@Table(name="eav_attribute_option_value")
public class EavAttributeOptionValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

	private String value;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to EavAttributeOption
    @ManyToOne
	@JoinColumn(name="option_id")
	private EavAttributeOption eavAttributeOption;

    public EavAttributeOptionValue() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public EavAttributeOption getEavAttributeOption() {
		return this.eavAttributeOption;
	}

	public void setEavAttributeOption(EavAttributeOption eavAttributeOption) {
		this.eavAttributeOption = eavAttributeOption;
	}
	
}