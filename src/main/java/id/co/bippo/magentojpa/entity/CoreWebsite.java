package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the core_website database table.
 * 
 */
@Entity
@Table(name="core_website")
public class CoreWebsite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="website_id")
	private int websiteId;

	private String code;

	@Column(name="default_group_id")
	private int defaultGroupId;

	@Column(name="is_default")
	private int isDefault;

	private String name;

	@Column(name="sort_order")
	private int sortOrder;

//	//bi-directional many-to-one association to CatalogProductBundleSelectionPrice
//	@OneToMany(mappedBy="coreWebsite")
//	private Set<CatalogProductBundleSelectionPrice> catalogProductBundleSelectionPrices;

	//bi-directional many-to-one association to CatalogProductEntityTierPrice
	@OneToMany(mappedBy="coreWebsite")
	private Set<CatalogProductEntityTierPrice> catalogProductEntityTierPrices;

	//bi-directional many-to-one association to CatalogProductSuperAttributePricing
	@OneToMany(mappedBy="coreWebsite")
	private Set<CatalogProductSuperAttributePricing> catalogProductSuperAttributePricings;

	//bi-directional many-to-many association to CatalogProductEntity
	@ManyToMany(mappedBy="coreWebsites")
	private Set<CatalogProductEntity> catalogProductEntities;

	//bi-directional many-to-one association to CataloginventoryStockStatus
	@OneToMany(mappedBy="coreWebsite")
	private Set<CataloginventoryStockStatus> cataloginventoryStockStatuses;

	//bi-directional many-to-one association to CatalogruleGroupWebsite
	@OneToMany(mappedBy="coreWebsite")
	private Set<CatalogruleGroupWebsite> catalogruleGroupWebsites;

	//bi-directional many-to-one association to CatalogruleProduct
	@OneToMany(mappedBy="coreWebsite")
	private Set<CatalogruleProduct> catalogruleProducts;

	//bi-directional many-to-one association to CatalogruleProductPrice
	@OneToMany(mappedBy="coreWebsite")
	private Set<CatalogruleProductPrice> catalogruleProductPrices;

	//bi-directional many-to-one association to CoreStore
	@OneToMany(mappedBy="coreWebsite")
	private Set<CoreStore> coreStores;

	//bi-directional many-to-one association to CoreStoreGroup
	@OneToMany(mappedBy="coreWebsite")
	private Set<CoreStoreGroup> coreStoreGroups;

//	//bi-directional many-to-one association to CustomerEavAttributeWebsite
//	@OneToMany(mappedBy="coreWebsite")
//	private Set<CustomerEavAttributeWebsite> customerEavAttributeWebsites;

	//bi-directional many-to-one association to CustomerEntity
	@OneToMany(mappedBy="coreWebsite")
	private Set<CustomerEntity> customerEntities;

	//bi-directional many-to-one association to DownloadableLinkPrice
	@OneToMany(mappedBy="coreWebsite")
	private Set<DownloadableLinkPrice> downloadableLinkPrices;

	//bi-directional many-to-one association to PaypalCert
	@OneToMany(mappedBy="coreWebsite")
	private Set<PaypalCert> paypalCerts;

	//bi-directional many-to-one association to PersistentSession
	@OneToMany(mappedBy="coreWebsite")
	private Set<PersistentSession> persistentSessions;

	//bi-directional many-to-one association to ProductAlertPrice
	@OneToMany(mappedBy="coreWebsite")
	private Set<ProductAlertPrice> productAlertPrices;

	//bi-directional many-to-one association to ProductAlertStock
	@OneToMany(mappedBy="coreWebsite")
	private Set<ProductAlertStock> productAlertStocks;

	//bi-directional many-to-one association to SalesruleProductAttribute
	@OneToMany(mappedBy="coreWebsite")
	private Set<SalesruleProductAttribute> salesruleProductAttributes;

	//bi-directional many-to-one association to WeeeDiscount
//	@OneToMany(mappedBy="coreWebsite")
//	private Set<WeeeDiscount> weeeDiscounts;

	//bi-directional many-to-one association to WeeeTax
	@OneToMany(mappedBy="coreWebsite")
	private Set<WeeeTax> weeeTaxs;

    public CoreWebsite() {
    }

	public int getWebsiteId() {
		return this.websiteId;
	}

	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getDefaultGroupId() {
		return this.defaultGroupId;
	}

	public void setDefaultGroupId(int defaultGroupId) {
		this.defaultGroupId = defaultGroupId;
	}

	public int getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

//	public Set<CatalogProductBundleSelectionPrice> getCatalogProductBundleSelectionPrices() {
//		return this.catalogProductBundleSelectionPrices;
//	}
//
//	public void setCatalogProductBundleSelectionPrices(Set<CatalogProductBundleSelectionPrice> catalogProductBundleSelectionPrices) {
//		this.catalogProductBundleSelectionPrices = catalogProductBundleSelectionPrices;
//	}
	
	public Set<CatalogProductEntityTierPrice> getCatalogProductEntityTierPrices() {
		return this.catalogProductEntityTierPrices;
	}

	public void setCatalogProductEntityTierPrices(Set<CatalogProductEntityTierPrice> catalogProductEntityTierPrices) {
		this.catalogProductEntityTierPrices = catalogProductEntityTierPrices;
	}
	
	public Set<CatalogProductSuperAttributePricing> getCatalogProductSuperAttributePricings() {
		return this.catalogProductSuperAttributePricings;
	}

	public void setCatalogProductSuperAttributePricings(Set<CatalogProductSuperAttributePricing> catalogProductSuperAttributePricings) {
		this.catalogProductSuperAttributePricings = catalogProductSuperAttributePricings;
	}
	
	public Set<CatalogProductEntity> getCatalogProductEntities() {
		return this.catalogProductEntities;
	}

	public void setCatalogProductEntities(Set<CatalogProductEntity> catalogProductEntities) {
		this.catalogProductEntities = catalogProductEntities;
	}
	
	public Set<CataloginventoryStockStatus> getCataloginventoryStockStatuses() {
		return this.cataloginventoryStockStatuses;
	}

	public void setCataloginventoryStockStatuses(Set<CataloginventoryStockStatus> cataloginventoryStockStatuses) {
		this.cataloginventoryStockStatuses = cataloginventoryStockStatuses;
	}
	
	public Set<CatalogruleGroupWebsite> getCatalogruleGroupWebsites() {
		return this.catalogruleGroupWebsites;
	}

	public void setCatalogruleGroupWebsites(Set<CatalogruleGroupWebsite> catalogruleGroupWebsites) {
		this.catalogruleGroupWebsites = catalogruleGroupWebsites;
	}
	
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
	
	public Set<CoreStore> getCoreStores() {
		return this.coreStores;
	}

	public void setCoreStores(Set<CoreStore> coreStores) {
		this.coreStores = coreStores;
	}
	
	public Set<CoreStoreGroup> getCoreStoreGroups() {
		return this.coreStoreGroups;
	}

	public void setCoreStoreGroups(Set<CoreStoreGroup> coreStoreGroups) {
		this.coreStoreGroups = coreStoreGroups;
	}
	
//	public Set<CustomerEavAttributeWebsite> getCustomerEavAttributeWebsites() {
//		return this.customerEavAttributeWebsites;
//	}
//
//	public void setCustomerEavAttributeWebsites(Set<CustomerEavAttributeWebsite> customerEavAttributeWebsites) {
//		this.customerEavAttributeWebsites = customerEavAttributeWebsites;
//	}
	
	public Set<CustomerEntity> getCustomerEntities() {
		return this.customerEntities;
	}

	public void setCustomerEntities(Set<CustomerEntity> customerEntities) {
		this.customerEntities = customerEntities;
	}
	
	public Set<DownloadableLinkPrice> getDownloadableLinkPrices() {
		return this.downloadableLinkPrices;
	}

	public void setDownloadableLinkPrices(Set<DownloadableLinkPrice> downloadableLinkPrices) {
		this.downloadableLinkPrices = downloadableLinkPrices;
	}
	
	public Set<PaypalCert> getPaypalCerts() {
		return this.paypalCerts;
	}

	public void setPaypalCerts(Set<PaypalCert> paypalCerts) {
		this.paypalCerts = paypalCerts;
	}
	
	public Set<PersistentSession> getPersistentSessions() {
		return this.persistentSessions;
	}

	public void setPersistentSessions(Set<PersistentSession> persistentSessions) {
		this.persistentSessions = persistentSessions;
	}
	
	public Set<ProductAlertPrice> getProductAlertPrices() {
		return this.productAlertPrices;
	}

	public void setProductAlertPrices(Set<ProductAlertPrice> productAlertPrices) {
		this.productAlertPrices = productAlertPrices;
	}
	
	public Set<ProductAlertStock> getProductAlertStocks() {
		return this.productAlertStocks;
	}

	public void setProductAlertStocks(Set<ProductAlertStock> productAlertStocks) {
		this.productAlertStocks = productAlertStocks;
	}
	
	public Set<SalesruleProductAttribute> getSalesruleProductAttributes() {
		return this.salesruleProductAttributes;
	}

	public void setSalesruleProductAttributes(Set<SalesruleProductAttribute> salesruleProductAttributes) {
		this.salesruleProductAttributes = salesruleProductAttributes;
	}
	
//	public Set<WeeeDiscount> getWeeeDiscounts() {
//		return this.weeeDiscounts;
//	}
//
//	public void setWeeeDiscounts(Set<WeeeDiscount> weeeDiscounts) {
//		this.weeeDiscounts = weeeDiscounts;
//	}
	
	public Set<WeeeTax> getWeeeTaxs() {
		return this.weeeTaxs;
	}

	public void setWeeeTaxs(Set<WeeeTax> weeeTaxs) {
		this.weeeTaxs = weeeTaxs;
	}
	
}