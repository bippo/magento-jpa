package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalogrule_group_website database table.
 * 
 */
@Entity
@Table(name="catalogrule_group_website")
public class CatalogruleGroupWebsite implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogruleGroupWebsitePK id;

//	//bi-directional many-to-one association to Catalogrule
//    @ManyToOne
//	@JoinColumn(name="rule_id")
//	private Catalogrule catalogrule;
//
//	//bi-directional many-to-one association to CoreWebsite
//    @ManyToOne
//	@JoinColumn(name="website_id")
//	private CoreWebsite coreWebsite;
//
//	//bi-directional many-to-one association to CustomerGroup
//    @ManyToOne
//	@JoinColumn(name="customer_group_id")
//	private CustomerGroup customerGroup;

    public CatalogruleGroupWebsite() {
    }

	public CatalogruleGroupWebsitePK getId() {
		return this.id;
	}

	public void setId(CatalogruleGroupWebsitePK id) {
		this.id = id;
	}
	
//	public Catalogrule getCatalogrule() {
//		return this.catalogrule;
//	}
//
//	public void setCatalogrule(Catalogrule catalogrule) {
//		this.catalogrule = catalogrule;
//	}
//	
//	public CoreWebsite getCoreWebsite() {
//		return this.coreWebsite;
//	}
//
//	public void setCoreWebsite(CoreWebsite coreWebsite) {
//		this.coreWebsite = coreWebsite;
//	}
//	
//	public CustomerGroup getCustomerGroup() {
//		return this.customerGroup;
//	}
//
//	public void setCustomerGroup(CustomerGroup customerGroup) {
//		this.customerGroup = customerGroup;
//	}
	
}