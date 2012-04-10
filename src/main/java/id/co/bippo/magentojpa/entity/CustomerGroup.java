package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the customer_group database table.
 * 
 */
@Entity
@Table(name="customer_group")
public class CustomerGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_group_id")
	private int customerGroupId;

	@Column(name="customer_group_code")
	private String customerGroupCode;

	@Column(name="tax_class_id")
	private int taxClassId;

	//bi-directional many-to-one association to CatalogProductEntityTierPrice
	@OneToMany(mappedBy="customerGroup")
	private Set<CatalogProductEntityTierPrice> catalogProductEntityTierPrices;

//	//bi-directional many-to-one association to CatalogruleGroupWebsite
//	@OneToMany(mappedBy="customerGroup")
//	private Set<CatalogruleGroupWebsite> catalogruleGroupWebsites;

	//bi-directional many-to-one association to CatalogruleProduct
	@OneToMany(mappedBy="customerGroup")
	private Set<CatalogruleProduct> catalogruleProducts;

	//bi-directional many-to-one association to CatalogruleProductPrice
	@OneToMany(mappedBy="customerGroup")
	private Set<CatalogruleProductPrice> catalogruleProductPrices;

//	//bi-directional many-to-one association to SalesruleProductAttribute
//	@OneToMany(mappedBy="customerGroup")
//	private Set<SalesruleProductAttribute> salesruleProductAttributes;

	//bi-directional many-to-one association to WeeeDiscount
//	@OneToMany(mappedBy="customerGroup")
//	private Set<WeeeDiscount> weeeDiscounts;

    public CustomerGroup() {
    }

	public int getCustomerGroupId() {
		return this.customerGroupId;
	}

	public void setCustomerGroupId(int customerGroupId) {
		this.customerGroupId = customerGroupId;
	}

	public String getCustomerGroupCode() {
		return this.customerGroupCode;
	}

	public void setCustomerGroupCode(String customerGroupCode) {
		this.customerGroupCode = customerGroupCode;
	}

	public int getTaxClassId() {
		return this.taxClassId;
	}

	public void setTaxClassId(int taxClassId) {
		this.taxClassId = taxClassId;
	}

	public Set<CatalogProductEntityTierPrice> getCatalogProductEntityTierPrices() {
		return this.catalogProductEntityTierPrices;
	}

	public void setCatalogProductEntityTierPrices(Set<CatalogProductEntityTierPrice> catalogProductEntityTierPrices) {
		this.catalogProductEntityTierPrices = catalogProductEntityTierPrices;
	}
	
//	public Set<CatalogruleGroupWebsite> getCatalogruleGroupWebsites() {
//		return this.catalogruleGroupWebsites;
//	}
//
//	public void setCatalogruleGroupWebsites(Set<CatalogruleGroupWebsite> catalogruleGroupWebsites) {
//		this.catalogruleGroupWebsites = catalogruleGroupWebsites;
//	}
	
	public Set<CatalogruleProduct> getCatalogruleProducts() {
		return this.catalogruleProducts;
	}

	public void setCatalogruleProducts(Set<CatalogruleProduct> catalogruleProducts) {
		this.catalogruleProducts = catalogruleProducts;
	}
	
	public Set<CatalogruleProductPrice> getCatalogruleProductPrices() {
		return this.catalogruleProductPrices;
	}

	public void setCatalogruleProductPrices(Set<CatalogruleProductPrice> catalogruleProductPrices) {
		this.catalogruleProductPrices = catalogruleProductPrices;
	}
	
//	public Set<SalesruleProductAttribute> getSalesruleProductAttributes() {
//		return this.salesruleProductAttributes;
//	}
//
//	public void setSalesruleProductAttributes(Set<SalesruleProductAttribute> salesruleProductAttributes) {
//		this.salesruleProductAttributes = salesruleProductAttributes;
//	}
	
//	public Set<WeeeDiscount> getWeeeDiscounts() {
//		return this.weeeDiscounts;
//	}
//
//	public void setWeeeDiscounts(Set<WeeeDiscount> weeeDiscounts) {
//		this.weeeDiscounts = weeeDiscounts;
//	}
	
}