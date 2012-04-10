package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the salesrule_product_attribute database table.
 * 
 */
@Entity
@Table(name="salesrule_product_attribute")
public class SalesruleProductAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SalesruleProductAttributePK id;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

	//bi-directional many-to-one association to CustomerGroup
    @ManyToOne
	@JoinColumn(name="customer_group_id")
	private CustomerGroup customerGroup;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

	//bi-directional many-to-one association to Salesrule
    @ManyToOne
	@JoinColumn(name="rule_id")
	private Salesrule salesrule;

    public SalesruleProductAttribute() {
    }

	public SalesruleProductAttributePK getId() {
		return this.id;
	}

	public void setId(SalesruleProductAttributePK id) {
		this.id = id;
	}
	
	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
	public CustomerGroup getCustomerGroup() {
		return this.customerGroup;
	}

	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}
	
	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
	public Salesrule getSalesrule() {
		return this.salesrule;
	}

	public void setSalesrule(Salesrule salesrule) {
		this.salesrule = salesrule;
	}
	
}