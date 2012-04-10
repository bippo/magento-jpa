package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the customer_entity database table.
 * 
 */
@Entity
@Table(name="customer_entity")
public class CustomerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="attribute_set_id")
	private int attributeSetId;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String email;

	@Column(name="entity_type_id")
	private int entityTypeId;

	@Column(name="group_id")
	private int groupId;

	@Column(name="increment_id")
	private String incrementId;

	@Column(name="is_active")
	private int isActive;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CatalogCompareItem
	@OneToMany(mappedBy="customerEntity")
	private Set<CatalogCompareItem> catalogCompareItems;

	//bi-directional many-to-one association to CustomerAddressEntity
	@OneToMany(mappedBy="customerEntity")
	private Set<CustomerAddressEntity> customerAddressEntities;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

	//bi-directional many-to-one association to CustomerEntityDatetime
	@OneToMany(mappedBy="customerEntity")
	private Set<CustomerEntityDatetime> customerEntityDatetimes;

	//bi-directional many-to-one association to CustomerEntityDecimal
	@OneToMany(mappedBy="customerEntity")
	private Set<CustomerEntityDecimal> customerEntityDecimals;

	//bi-directional many-to-one association to CustomerEntityInt
	@OneToMany(mappedBy="customerEntity")
	private Set<CustomerEntityInt> customerEntityInts;

	//bi-directional many-to-one association to CustomerEntityText
	@OneToMany(mappedBy="customerEntity")
	private Set<CustomerEntityText> customerEntityTexts;

	//bi-directional many-to-one association to CustomerEntityVarchar
	@OneToMany(mappedBy="customerEntity")
	private Set<CustomerEntityVarchar> customerEntityVarchars;

	//bi-directional many-to-one association to DownloadableLinkPurchased
	@OneToMany(mappedBy="customerEntity")
	private Set<DownloadableLinkPurchased> downloadableLinkPurchaseds;

	//bi-directional many-to-one association to PersistentSession
	@OneToMany(mappedBy="customerEntity")
	private Set<PersistentSession> persistentSessions;

	//bi-directional many-to-one association to ProductAlertPrice
	@OneToMany(mappedBy="customerEntity")
	private Set<ProductAlertPrice> productAlertPrices;

	//bi-directional many-to-one association to ProductAlertStock
	@OneToMany(mappedBy="customerEntity")
	private Set<ProductAlertStock> productAlertStocks;

	//bi-directional many-to-one association to ReportComparedProductIndex
	@OneToMany(mappedBy="customerEntity")
	private Set<ReportComparedProductIndex> reportComparedProductIndexs;

	//bi-directional many-to-one association to ReportViewedProductIndex
	@OneToMany(mappedBy="customerEntity")
	private Set<ReportViewedProductIndex> reportViewedProductIndexs;

	//bi-directional many-to-one association to ReviewDetail
	@OneToMany(mappedBy="customerEntity")
	private Set<ReviewDetail> reviewDetails;

	//bi-directional many-to-one association to SalesBillingAgreement
	@OneToMany(mappedBy="customerEntity")
	private Set<SalesBillingAgreement> salesBillingAgreements;

	//bi-directional many-to-one association to SalesFlatOrder
	@OneToMany(mappedBy="customerEntity")
	private Set<SalesFlatOrder> salesFlatOrders;

	//bi-directional many-to-one association to SalesFlatOrderGrid
	@OneToMany(mappedBy="customerEntity")
	private Set<SalesFlatOrderGrid> salesFlatOrderGrids;

	//bi-directional many-to-one association to SalesRecurringProfile
	@OneToMany(mappedBy="customerEntity")
	private Set<SalesRecurringProfile> salesRecurringProfiles;

	//bi-directional many-to-one association to SalesruleCouponUsage
	@OneToMany(mappedBy="customerEntity")
	private Set<SalesruleCouponUsage> salesruleCouponUsages;

	//bi-directional many-to-one association to SalesruleCustomer
	@OneToMany(mappedBy="customerEntity")
	private Set<SalesruleCustomer> salesruleCustomers;

	//bi-directional many-to-one association to Tag
	@OneToMany(mappedBy="customerEntity")
	private Set<Tag> tags;

	//bi-directional many-to-one association to TagRelation
	@OneToMany(mappedBy="customerEntity")
	private Set<TagRelation> tagRelations;

	//bi-directional many-to-one association to Wishlist
	@OneToMany(mappedBy="customerEntity")
	private Set<Wishlist> wishlists;

    public CustomerEntity() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public int getAttributeSetId() {
		return this.attributeSetId;
	}

	public void setAttributeSetId(int attributeSetId) {
		this.attributeSetId = attributeSetId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEntityTypeId() {
		return this.entityTypeId;
	}

	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getIncrementId() {
		return this.incrementId;
	}

	public void setIncrementId(String incrementId) {
		this.incrementId = incrementId;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set<CatalogCompareItem> getCatalogCompareItems() {
		return this.catalogCompareItems;
	}

	public void setCatalogCompareItems(Set<CatalogCompareItem> catalogCompareItems) {
		this.catalogCompareItems = catalogCompareItems;
	}
	
	public Set<CustomerAddressEntity> getCustomerAddressEntities() {
		return this.customerAddressEntities;
	}

	public void setCustomerAddressEntities(Set<CustomerAddressEntity> customerAddressEntities) {
		this.customerAddressEntities = customerAddressEntities;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
	public Set<CustomerEntityDatetime> getCustomerEntityDatetimes() {
		return this.customerEntityDatetimes;
	}

	public void setCustomerEntityDatetimes(Set<CustomerEntityDatetime> customerEntityDatetimes) {
		this.customerEntityDatetimes = customerEntityDatetimes;
	}
	
	public Set<CustomerEntityDecimal> getCustomerEntityDecimals() {
		return this.customerEntityDecimals;
	}

	public void setCustomerEntityDecimals(Set<CustomerEntityDecimal> customerEntityDecimals) {
		this.customerEntityDecimals = customerEntityDecimals;
	}
	
	public Set<CustomerEntityInt> getCustomerEntityInts() {
		return this.customerEntityInts;
	}

	public void setCustomerEntityInts(Set<CustomerEntityInt> customerEntityInts) {
		this.customerEntityInts = customerEntityInts;
	}
	
	public Set<CustomerEntityText> getCustomerEntityTexts() {
		return this.customerEntityTexts;
	}

	public void setCustomerEntityTexts(Set<CustomerEntityText> customerEntityTexts) {
		this.customerEntityTexts = customerEntityTexts;
	}
	
	public Set<CustomerEntityVarchar> getCustomerEntityVarchars() {
		return this.customerEntityVarchars;
	}

	public void setCustomerEntityVarchars(Set<CustomerEntityVarchar> customerEntityVarchars) {
		this.customerEntityVarchars = customerEntityVarchars;
	}
	
	public Set<DownloadableLinkPurchased> getDownloadableLinkPurchaseds() {
		return this.downloadableLinkPurchaseds;
	}

	public void setDownloadableLinkPurchaseds(Set<DownloadableLinkPurchased> downloadableLinkPurchaseds) {
		this.downloadableLinkPurchaseds = downloadableLinkPurchaseds;
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
	
	public Set<ReportComparedProductIndex> getReportComparedProductIndexs() {
		return this.reportComparedProductIndexs;
	}

	public void setReportComparedProductIndexs(Set<ReportComparedProductIndex> reportComparedProductIndexs) {
		this.reportComparedProductIndexs = reportComparedProductIndexs;
	}
	
	public Set<ReportViewedProductIndex> getReportViewedProductIndexs() {
		return this.reportViewedProductIndexs;
	}

	public void setReportViewedProductIndexs(Set<ReportViewedProductIndex> reportViewedProductIndexs) {
		this.reportViewedProductIndexs = reportViewedProductIndexs;
	}
	
	public Set<ReviewDetail> getReviewDetails() {
		return this.reviewDetails;
	}

	public void setReviewDetails(Set<ReviewDetail> reviewDetails) {
		this.reviewDetails = reviewDetails;
	}
	
	public Set<SalesBillingAgreement> getSalesBillingAgreements() {
		return this.salesBillingAgreements;
	}

	public void setSalesBillingAgreements(Set<SalesBillingAgreement> salesBillingAgreements) {
		this.salesBillingAgreements = salesBillingAgreements;
	}
	
	public Set<SalesFlatOrder> getSalesFlatOrders() {
		return this.salesFlatOrders;
	}

	public void setSalesFlatOrders(Set<SalesFlatOrder> salesFlatOrders) {
		this.salesFlatOrders = salesFlatOrders;
	}
	
	public Set<SalesFlatOrderGrid> getSalesFlatOrderGrids() {
		return this.salesFlatOrderGrids;
	}

	public void setSalesFlatOrderGrids(Set<SalesFlatOrderGrid> salesFlatOrderGrids) {
		this.salesFlatOrderGrids = salesFlatOrderGrids;
	}
	
	public Set<SalesRecurringProfile> getSalesRecurringProfiles() {
		return this.salesRecurringProfiles;
	}

	public void setSalesRecurringProfiles(Set<SalesRecurringProfile> salesRecurringProfiles) {
		this.salesRecurringProfiles = salesRecurringProfiles;
	}
	
	public Set<SalesruleCouponUsage> getSalesruleCouponUsages() {
		return this.salesruleCouponUsages;
	}

	public void setSalesruleCouponUsages(Set<SalesruleCouponUsage> salesruleCouponUsages) {
		this.salesruleCouponUsages = salesruleCouponUsages;
	}
	
	public Set<SalesruleCustomer> getSalesruleCustomers() {
		return this.salesruleCustomers;
	}

	public void setSalesruleCustomers(Set<SalesruleCustomer> salesruleCustomers) {
		this.salesruleCustomers = salesruleCustomers;
	}
	
	public Set<Tag> getTags() {
		return this.tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	
	public Set<TagRelation> getTagRelations() {
		return this.tagRelations;
	}

	public void setTagRelations(Set<TagRelation> tagRelations) {
		this.tagRelations = tagRelations;
	}
	
	public Set<Wishlist> getWishlists() {
		return this.wishlists;
	}

	public void setWishlists(Set<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}
	
}