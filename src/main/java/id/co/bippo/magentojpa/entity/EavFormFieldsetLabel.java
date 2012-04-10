package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eav_form_fieldset_label database table.
 * 
 */
@Entity
@Table(name="eav_form_fieldset_label")
public class EavFormFieldsetLabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EavFormFieldsetLabelPK id;

	private String label;

//	//bi-directional many-to-one association to CoreStore
//    @ManyToOne
//	@JoinColumn(name="store_id")
//	private CoreStore coreStore;
//
//	//bi-directional many-to-one association to EavFormFieldset
//    @ManyToOne
//	@JoinColumn(name="fieldset_id")
//	private EavFormFieldset eavFormFieldset;

    public EavFormFieldsetLabel() {
    }

	public EavFormFieldsetLabelPK getId() {
		return this.id;
	}

	public void setId(EavFormFieldsetLabelPK id) {
		this.id = id;
	}
	
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

//	public CoreStore getCoreStore() {
//		return this.coreStore;
//	}
//
//	public void setCoreStore(CoreStore coreStore) {
//		this.coreStore = coreStore;
//	}
//	
//	public EavFormFieldset getEavFormFieldset() {
//		return this.eavFormFieldset;
//	}
//
//	public void setEavFormFieldset(EavFormFieldset eavFormFieldset) {
//		this.eavFormFieldset = eavFormFieldset;
//	}
	
}