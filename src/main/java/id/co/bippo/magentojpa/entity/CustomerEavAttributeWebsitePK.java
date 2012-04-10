package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the customer_eav_attribute_website database table.
 * 
 */
@Embeddable
public class CustomerEavAttributeWebsitePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="attribute_id")
	private int attributeId;

	@Column(name="website_id")
	private int websiteId;

    public CustomerEavAttributeWebsitePK() {
    }
	public int getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}
	public int getWebsiteId() {
		return this.websiteId;
	}
	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustomerEavAttributeWebsitePK)) {
			return false;
		}
		CustomerEavAttributeWebsitePK castOther = (CustomerEavAttributeWebsitePK)other;
		return 
			(this.attributeId == castOther.attributeId)
			&& (this.websiteId == castOther.websiteId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.attributeId;
		hash = hash * prime + this.websiteId;
		
		return hash;
    }
}