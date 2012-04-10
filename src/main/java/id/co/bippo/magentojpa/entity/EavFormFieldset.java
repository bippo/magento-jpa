package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the eav_form_fieldset database table.
 * 
 */
@Entity
@Table(name="eav_form_fieldset")
public class EavFormFieldset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fieldset_id")
	private int fieldsetId;

	private String code;

	@Column(name="sort_order")
	private int sortOrder;

	//bi-directional many-to-one association to EavFormElement
	@OneToMany(mappedBy="eavFormFieldset")
	private Set<EavFormElement> eavFormElements;

	//bi-directional many-to-one association to EavFormType
    @ManyToOne
	@JoinColumn(name="type_id")
	private EavFormType eavFormType;

//	//bi-directional many-to-one association to EavFormFieldsetLabel
//	@OneToMany(mappedBy="eavFormFieldset")
//	private Set<EavFormFieldsetLabel> eavFormFieldsetLabels;

    public EavFormFieldset() {
    }

	public int getFieldsetId() {
		return this.fieldsetId;
	}

	public void setFieldsetId(int fieldsetId) {
		this.fieldsetId = fieldsetId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Set<EavFormElement> getEavFormElements() {
		return this.eavFormElements;
	}

	public void setEavFormElements(Set<EavFormElement> eavFormElements) {
		this.eavFormElements = eavFormElements;
	}
	
	public EavFormType getEavFormType() {
		return this.eavFormType;
	}

	public void setEavFormType(EavFormType eavFormType) {
		this.eavFormType = eavFormType;
	}
	
//	public Set<EavFormFieldsetLabel> getEavFormFieldsetLabels() {
//		return this.eavFormFieldsetLabels;
//	}
//
//	public void setEavFormFieldsetLabels(Set<EavFormFieldsetLabel> eavFormFieldsetLabels) {
//		this.eavFormFieldsetLabels = eavFormFieldsetLabels;
//	}
	
}