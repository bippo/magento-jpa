package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_eav_attribute database table.
 * 
 */
@Entity
@Table(name="customer_eav_attribute")
public class CustomerEavAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="attribute_id")
	private int attributeId;

	@Column(name="data_model")
	private String dataModel;

	@Column(name="input_filter")
	private String inputFilter;

	@Column(name="is_system")
	private int isSystem;

	@Column(name="is_visible")
	private int isVisible;

	@Column(name="multiline_count")
	private int multilineCount;

	@Column(name="sort_order")
	private int sortOrder;

    @Lob()
	@Column(name="validate_rules")
	private String validateRules;

	//bi-directional one-to-one association to EavAttribute
	@OneToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

    public CustomerEavAttribute() {
    }

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public String getDataModel() {
		return this.dataModel;
	}

	public void setDataModel(String dataModel) {
		this.dataModel = dataModel;
	}

	public String getInputFilter() {
		return this.inputFilter;
	}

	public void setInputFilter(String inputFilter) {
		this.inputFilter = inputFilter;
	}

	public int getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(int isSystem) {
		this.isSystem = isSystem;
	}

	public int getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(int isVisible) {
		this.isVisible = isVisible;
	}

	public int getMultilineCount() {
		return this.multilineCount;
	}

	public void setMultilineCount(int multilineCount) {
		this.multilineCount = multilineCount;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getValidateRules() {
		return this.validateRules;
	}

	public void setValidateRules(String validateRules) {
		this.validateRules = validateRules;
	}

	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
}