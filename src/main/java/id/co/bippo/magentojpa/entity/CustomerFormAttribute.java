package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_form_attribute database table.
 * 
 */
@Entity
@Table(name="customer_form_attribute")
public class CustomerFormAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustomerFormAttributePK id;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

    public CustomerFormAttribute() {
    }

	public CustomerFormAttributePK getId() {
		return this.id;
	}

	public void setId(CustomerFormAttributePK id) {
		this.id = id;
	}
	
	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
}