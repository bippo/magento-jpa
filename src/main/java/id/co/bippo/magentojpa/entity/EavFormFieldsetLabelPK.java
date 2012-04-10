package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the eav_form_fieldset_label database table.
 * 
 */
@Embeddable
public class EavFormFieldsetLabelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="fieldset_id")
	private int fieldsetId;

	@Column(name="store_id")
	private int storeId;

    public EavFormFieldsetLabelPK() {
    }
	public int getFieldsetId() {
		return this.fieldsetId;
	}
	public void setFieldsetId(int fieldsetId) {
		this.fieldsetId = fieldsetId;
	}
	public int getStoreId() {
		return this.storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EavFormFieldsetLabelPK)) {
			return false;
		}
		EavFormFieldsetLabelPK castOther = (EavFormFieldsetLabelPK)other;
		return 
			(this.fieldsetId == castOther.fieldsetId)
			&& (this.storeId == castOther.storeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fieldsetId;
		hash = hash * prime + this.storeId;
		
		return hash;
    }
}