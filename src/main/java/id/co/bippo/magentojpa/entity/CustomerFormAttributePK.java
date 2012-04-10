package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the customer_form_attribute database table.
 * 
 */
@Embeddable
public class CustomerFormAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="form_code")
	private String formCode;

	@Column(name="attribute_id")
	private int attributeId;

    public CustomerFormAttributePK() {
    }
	public String getFormCode() {
		return this.formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}
	public int getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustomerFormAttributePK)) {
			return false;
		}
		CustomerFormAttributePK castOther = (CustomerFormAttributePK)other;
		return 
			this.formCode.equals(castOther.formCode)
			&& (this.attributeId == castOther.attributeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.formCode.hashCode();
		hash = hash * prime + this.attributeId;
		
		return hash;
    }
}