package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eav_form_element database table.
 * 
 */
@Entity
@Table(name="eav_form_element")
public class EavFormElement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="element_id")
	private int elementId;

	@Column(name="sort_order")
	private int sortOrder;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

	//bi-directional many-to-one association to EavFormFieldset
    @ManyToOne
	@JoinColumn(name="fieldset_id")
	private EavFormFieldset eavFormFieldset;

	//bi-directional many-to-one association to EavFormType
    @ManyToOne
	@JoinColumn(name="type_id")
	private EavFormType eavFormType;

    public EavFormElement() {
    }

	public int getElementId() {
		return this.elementId;
	}

	public void setElementId(int elementId) {
		this.elementId = elementId;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
	public EavFormFieldset getEavFormFieldset() {
		return this.eavFormFieldset;
	}

	public void setEavFormFieldset(EavFormFieldset eavFormFieldset) {
		this.eavFormFieldset = eavFormFieldset;
	}
	
	public EavFormType getEavFormType() {
		return this.eavFormType;
	}

	public void setEavFormType(EavFormType eavFormType) {
		this.eavFormType = eavFormType;
	}
	
}