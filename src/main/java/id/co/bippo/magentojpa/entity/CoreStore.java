package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the core_store database table.
 * 
 */
@Entity
@Table(name="core_store")
public class CoreStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="store_id")
	private int storeId;

	private String code;

	@Column(name="is_active")
	private int isActive;

	private String name;

	@Column(name="sort_order")
	private int sortOrder;

	//bi-directional many-to-one association to CatalogCategoryEntityDatetime
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogCategoryEntityDatetime> catalogCategoryEntityDatetimes;

	//bi-directional many-to-one association to CatalogCategoryEntityDecimal
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogCategoryEntityDecimal> catalogCategoryEntityDecimals;

	//bi-directional many-to-one association to CatalogCategoryEntityInt
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogCategoryEntityInt> catalogCategoryEntityInts;

	//bi-directional many-to-one association to CatalogCategoryEntityText
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogCategoryEntityText> catalogCategoryEntityTexts;

	//bi-directional many-to-one association to CatalogCategoryEntityVarchar
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogCategoryEntityVarchar> catalogCategoryEntityVarchars;

	//bi-directional many-to-one association to CatalogCompareItem
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogCompareItem> catalogCompareItems;

	//bi-directional many-to-one association to CatalogProductEntityDatetime
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductEntityDatetime> catalogProductEntityDatetimes;

	//bi-directional many-to-one association to CatalogProductEntityDecimal
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductEntityDecimal> catalogProductEntityDecimals;

	//bi-directional many-to-one association to CatalogProductEntityGallery
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductEntityGallery> catalogProductEntityGalleries;

	//bi-directional many-to-one association to CatalogProductEntityInt
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductEntityInt> catalogProductEntityInts;

//	//bi-directional many-to-one association to CatalogProductEntityMediaGalleryValue
//	@OneToMany(mappedBy="coreStore")
//	private Set<CatalogProductEntityMediaGalleryValue> catalogProductEntityMediaGalleryValues;

	//bi-directional many-to-one association to CatalogProductEntityText
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductEntityText> catalogProductEntityTexts;

	//bi-directional many-to-one association to CatalogProductEntityVarchar
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductEntityVarchar> catalogProductEntityVarchars;

	//bi-directional many-to-one association to CatalogProductOptionPrice
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductOptionPrice> catalogProductOptionPrices;

	//bi-directional many-to-one association to CatalogProductOptionTitle
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductOptionTitle> catalogProductOptionTitles;

	//bi-directional many-to-one association to CatalogProductOptionTypePrice
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductOptionTypePrice> catalogProductOptionTypePrices;

	//bi-directional many-to-one association to CatalogProductOptionTypeTitle
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductOptionTypeTitle> catalogProductOptionTypeTitles;

	//bi-directional many-to-one association to CatalogProductSuperAttributeLabel
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogProductSuperAttributeLabel> catalogProductSuperAttributeLabels;

	//bi-directional many-to-one association to CatalogsearchQuery
	@OneToMany(mappedBy="coreStore")
	private Set<CatalogsearchQuery> catalogsearchQueries;

	//bi-directional many-to-many association to CheckoutAgreement
	@ManyToMany(mappedBy="coreStores")
	private Set<CheckoutAgreement> checkoutAgreements;

	//bi-directional many-to-many association to CmsBlock
    @ManyToMany
	@JoinTable(
		name="cms_block_store"
		, joinColumns={
			@JoinColumn(name="store_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="block_id")
			}
		)
	private Set<CmsBlock> cmsBlocks;

	//bi-directional many-to-many association to CmsPage
    @ManyToMany
	@JoinTable(
		name="cms_page_store"
		, joinColumns={
			@JoinColumn(name="store_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="page_id")
			}
		)
	private Set<CmsPage> cmsPages;

	//bi-directional many-to-one association to CoreLayoutLink
	@OneToMany(mappedBy="coreStore")
	private Set<CoreLayoutLink> coreLayoutLinks;

	//bi-directional many-to-one association to CoreStoreGroup
    @ManyToOne
	@JoinColumn(name="group_id")
	private CoreStoreGroup coreStoreGroup;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

	//bi-directional many-to-one association to CoreTranslate
	@OneToMany(mappedBy="coreStore")
	private Set<CoreTranslate> coreTranslates;

	//bi-directional many-to-one association to CoreUrlRewrite
	@OneToMany(mappedBy="coreStore")
	private Set<CoreUrlRewrite> coreUrlRewrites;

	//bi-directional many-to-one association to CoreVariableValue
	@OneToMany(mappedBy="coreStore")
	private Set<CoreVariableValue> coreVariableValues;

	//bi-directional many-to-one association to CouponAggregated
	@OneToMany(mappedBy="coreStore")
	private Set<CouponAggregated> couponAggregateds;

	//bi-directional many-to-one association to CouponAggregatedOrder
	@OneToMany(mappedBy="coreStore")
	private Set<CouponAggregatedOrder> couponAggregatedOrders;

	//bi-directional many-to-one association to CouponAggregatedUpdated
	@OneToMany(mappedBy="coreStore")
	private Set<CouponAggregatedUpdated> couponAggregatedUpdateds;

	//bi-directional many-to-one association to CustomerEntity
	@OneToMany(mappedBy="coreStore")
	private Set<CustomerEntity> customerEntities;

	//bi-directional many-to-one association to DataflowBatch
	@OneToMany(mappedBy="coreStore")
	private Set<DataflowBatch> dataflowBatches;

	//bi-directional many-to-one association to DesignChange
	@OneToMany(mappedBy="coreStore")
	private Set<DesignChange> designChanges;

	//bi-directional many-to-one association to DownloadableLinkTitle
	@OneToMany(mappedBy="coreStore")
	private Set<DownloadableLinkTitle> downloadableLinkTitles;

	//bi-directional many-to-one association to DownloadableSampleTitle
	@OneToMany(mappedBy="coreStore")
	private Set<DownloadableSampleTitle> downloadableSampleTitles;

	//bi-directional many-to-one association to EavAttributeLabel
	@OneToMany(mappedBy="coreStore")
	private Set<EavAttributeLabel> eavAttributeLabels;

	//bi-directional many-to-one association to EavAttributeOptionValue
	@OneToMany(mappedBy="coreStore")
	private Set<EavAttributeOptionValue> eavAttributeOptionValues;

	//bi-directional many-to-one association to EavEntity
	@OneToMany(mappedBy="coreStore")
	private Set<EavEntity> eavEntities;

	//bi-directional many-to-one association to EavEntityDatetime
	@OneToMany(mappedBy="coreStore")
	private Set<EavEntityDatetime> eavEntityDatetimes;

	//bi-directional many-to-one association to EavEntityDecimal
	@OneToMany(mappedBy="coreStore")
	private Set<EavEntityDecimal> eavEntityDecimals;

	//bi-directional many-to-one association to EavEntityInt
	@OneToMany(mappedBy="coreStore")
	private Set<EavEntityInt> eavEntityInts;

	//bi-directional many-to-one association to EavEntityStore
	@OneToMany(mappedBy="coreStore")
	private Set<EavEntityStore> eavEntityStores;

	//bi-directional many-to-one association to EavEntityText
	@OneToMany(mappedBy="coreStore")
	private Set<EavEntityText> eavEntityTexts;

	//bi-directional many-to-one association to EavEntityVarchar
	@OneToMany(mappedBy="coreStore")
	private Set<EavEntityVarchar> eavEntityVarchars;

//	//bi-directional many-to-one association to EavFormFieldsetLabel
//	@OneToMany(mappedBy="coreStore")
//	private Set<EavFormFieldsetLabel> eavFormFieldsetLabels;

	//bi-directional many-to-one association to EavFormType
	@OneToMany(mappedBy="coreStore")
	private Set<EavFormType> eavFormTypes;

	//bi-directional many-to-one association to GooglebaseItem
	@OneToMany(mappedBy="coreStore")
	private Set<GooglebaseItem> googlebaseItems;

	//bi-directional many-to-one association to GoogleoptimizerCode
	@OneToMany(mappedBy="coreStore")
	private Set<GoogleoptimizerCode> googleoptimizerCodes;

	//bi-directional many-to-many association to NewsletterQueue
	@ManyToMany(mappedBy="coreStores")
	private Set<NewsletterQueue> newsletterQueues;

	//bi-directional many-to-one association to NewsletterSubscriber
	@OneToMany(mappedBy="coreStore")
	private Set<NewsletterSubscriber> newsletterSubscribers;

	//bi-directional many-to-one association to Poll
	@OneToMany(mappedBy="coreStore")
	private Set<Poll> polls1;

	//bi-directional many-to-many association to Poll
    @ManyToMany
	@JoinTable(
		name="poll_store"
		, joinColumns={
			@JoinColumn(name="store_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="poll_id")
			}
		)
	private Set<Poll> polls2;

	//bi-directional many-to-one association to RatingOptionVoteAggregated
	@OneToMany(mappedBy="coreStore")
	private Set<RatingOptionVoteAggregated> ratingOptionVoteAggregateds;

	//bi-directional many-to-many association to Rating
    @ManyToMany
	@JoinTable(
		name="rating_store"
		, joinColumns={
			@JoinColumn(name="store_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="rating_id")
			}
		)
	private Set<Rating> ratings;

//	//bi-directional many-to-one association to RatingTitle
//	@OneToMany(mappedBy="coreStore")
//	private Set<RatingTitle> ratingTitles;

	//bi-directional many-to-one association to ReportComparedProductIndex
	@OneToMany(mappedBy="coreStore")
	private Set<ReportComparedProductIndex> reportComparedProductIndexs;

	//bi-directional many-to-one association to ReportEvent
	@OneToMany(mappedBy="coreStore")
	private Set<ReportEvent> reportEvents;

	//bi-directional many-to-one association to ReportViewedProductIndex
	@OneToMany(mappedBy="coreStore")
	private Set<ReportViewedProductIndex> reportViewedProductIndexs;

	//bi-directional many-to-one association to ReviewDetail
	@OneToMany(mappedBy="coreStore")
	private Set<ReviewDetail> reviewDetails;

	//bi-directional many-to-one association to ReviewEntitySummary
	@OneToMany(mappedBy="coreStore")
	private Set<ReviewEntitySummary> reviewEntitySummaries;

	//bi-directional many-to-many association to Review
    @ManyToMany
	@JoinTable(
		name="review_store"
		, joinColumns={
			@JoinColumn(name="store_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="review_id")
			}
		)
	private Set<Review> reviews;

	//bi-directional many-to-one association to SalesBestsellersAggregatedDaily
	@OneToMany(mappedBy="coreStore")
	private Set<SalesBestsellersAggregatedDaily> salesBestsellersAggregatedDailies;

	//bi-directional many-to-one association to SalesBestsellersAggregatedMonthly
	@OneToMany(mappedBy="coreStore")
	private Set<SalesBestsellersAggregatedMonthly> salesBestsellersAggregatedMonthlies;

	//bi-directional many-to-one association to SalesBestsellersAggregatedYearly
	@OneToMany(mappedBy="coreStore")
	private Set<SalesBestsellersAggregatedYearly> salesBestsellersAggregatedYearlies;

	//bi-directional many-to-one association to SalesBillingAgreement
	@OneToMany(mappedBy="coreStore")
	private Set<SalesBillingAgreement> salesBillingAgreements;

	//bi-directional many-to-one association to SalesFlatCreditmemo
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatCreditmemo> salesFlatCreditmemos;

	//bi-directional many-to-one association to SalesFlatCreditmemoGrid
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatCreditmemoGrid> salesFlatCreditmemoGrids;

	//bi-directional many-to-one association to SalesFlatInvoice
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatInvoice> salesFlatInvoices;

	//bi-directional many-to-one association to SalesFlatInvoiceGrid
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatInvoiceGrid> salesFlatInvoiceGrids;

	//bi-directional many-to-one association to SalesFlatOrder
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatOrder> salesFlatOrders;

	//bi-directional many-to-one association to SalesFlatOrderGrid
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatOrderGrid> salesFlatOrderGrids;

	//bi-directional many-to-one association to SalesFlatOrderItem
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatOrderItem> salesFlatOrderItems;

	//bi-directional many-to-one association to SalesFlatQuote
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatQuote> salesFlatQuotes;

	//bi-directional many-to-one association to SalesFlatQuoteItem
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatQuoteItem> salesFlatQuoteItems;

	//bi-directional many-to-one association to SalesFlatShipment
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatShipment> salesFlatShipments;

	//bi-directional many-to-one association to SalesFlatShipmentGrid
	@OneToMany(mappedBy="coreStore")
	private Set<SalesFlatShipmentGrid> salesFlatShipmentGrids;

	//bi-directional many-to-one association to SalesInvoicedAggregated
	@OneToMany(mappedBy="coreStore")
	private Set<SalesInvoicedAggregated> salesInvoicedAggregateds;

	//bi-directional many-to-one association to SalesInvoicedAggregatedOrder
	@OneToMany(mappedBy="coreStore")
	private Set<SalesInvoicedAggregatedOrder> salesInvoicedAggregatedOrders;

	//bi-directional many-to-one association to SalesOrderAggregatedCreated
	@OneToMany(mappedBy="coreStore")
	private Set<SalesOrderAggregatedCreated> salesOrderAggregatedCreateds;

	//bi-directional many-to-one association to SalesOrderAggregatedUpdated
	@OneToMany(mappedBy="coreStore")
	private Set<SalesOrderAggregatedUpdated> salesOrderAggregatedUpdateds;

	//bi-directional many-to-one association to SalesOrderStatusLabel
//	@OneToMany(mappedBy="coreStore")
//	private Set<SalesOrderStatusLabel> salesOrderStatusLabels;

	//bi-directional many-to-one association to SalesRecurringProfile
	@OneToMany(mappedBy="coreStore")
	private Set<SalesRecurringProfile> salesRecurringProfiles;

	//bi-directional many-to-one association to SalesRefundedAggregated
	@OneToMany(mappedBy="coreStore")
	private Set<SalesRefundedAggregated> salesRefundedAggregateds;

	//bi-directional many-to-one association to SalesRefundedAggregatedOrder
	@OneToMany(mappedBy="coreStore")
	private Set<SalesRefundedAggregatedOrder> salesRefundedAggregatedOrders;

	//bi-directional many-to-one association to SalesShippingAggregated
	@OneToMany(mappedBy="coreStore")
	private Set<SalesShippingAggregated> salesShippingAggregateds;

	//bi-directional many-to-one association to SalesShippingAggregatedOrder
	@OneToMany(mappedBy="coreStore")
	private Set<SalesShippingAggregatedOrder> salesShippingAggregatedOrders;

	//bi-directional many-to-one association to SalesruleLabel
	@OneToMany(mappedBy="coreStore")
	private Set<SalesruleLabel> salesruleLabels;

	//bi-directional many-to-one association to Sitemap
	@OneToMany(mappedBy="coreStore")
	private Set<Sitemap> sitemaps;

	//bi-directional many-to-one association to Tag
	@OneToMany(mappedBy="coreStore")
	private Set<Tag> tags;

//	//bi-directional many-to-one association to TagProperty
//	@OneToMany(mappedBy="coreStore")
//	private Set<TagProperty> tagProperties;

	//bi-directional many-to-one association to TagRelation
	@OneToMany(mappedBy="coreStore")
	private Set<TagRelation> tagRelations;

//	//bi-directional many-to-one association to TagSummary
//	@OneToMany(mappedBy="coreStore")
//	private Set<TagSummary> tagSummaries;

	//bi-directional many-to-one association to TaxCalculationRateTitle
	@OneToMany(mappedBy="coreStore")
	private Set<TaxCalculationRateTitle> taxCalculationRateTitles;

	//bi-directional many-to-one association to TaxOrderAggregatedCreated
	@OneToMany(mappedBy="coreStore")
	private Set<TaxOrderAggregatedCreated> taxOrderAggregatedCreateds;

	//bi-directional many-to-one association to TaxOrderAggregatedUpdated
	@OneToMany(mappedBy="coreStore")
	private Set<TaxOrderAggregatedUpdated> taxOrderAggregatedUpdateds;

	//bi-directional many-to-one association to WishlistItem
	@OneToMany(mappedBy="coreStore")
	private Set<WishlistItem> wishlistItems;

	//bi-directional many-to-one association to XmlconnectApplication
	@OneToMany(mappedBy="coreStore")
	private Set<XmlconnectApplication> xmlconnectApplications;

    public CoreStore() {
    }

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
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

	public Set<CatalogCategoryEntityDatetime> getCatalogCategoryEntityDatetimes() {
		return this.catalogCategoryEntityDatetimes;
	}

	public void setCatalogCategoryEntityDatetimes(Set<CatalogCategoryEntityDatetime> catalogCategoryEntityDatetimes) {
		this.catalogCategoryEntityDatetimes = catalogCategoryEntityDatetimes;
	}
	
	public Set<CatalogCategoryEntityDecimal> getCatalogCategoryEntityDecimals() {
		return this.catalogCategoryEntityDecimals;
	}

	public void setCatalogCategoryEntityDecimals(Set<CatalogCategoryEntityDecimal> catalogCategoryEntityDecimals) {
		this.catalogCategoryEntityDecimals = catalogCategoryEntityDecimals;
	}
	
	public Set<CatalogCategoryEntityInt> getCatalogCategoryEntityInts() {
		return this.catalogCategoryEntityInts;
	}

	public void setCatalogCategoryEntityInts(Set<CatalogCategoryEntityInt> catalogCategoryEntityInts) {
		this.catalogCategoryEntityInts = catalogCategoryEntityInts;
	}
	
	public Set<CatalogCategoryEntityText> getCatalogCategoryEntityTexts() {
		return this.catalogCategoryEntityTexts;
	}

	public void setCatalogCategoryEntityTexts(Set<CatalogCategoryEntityText> catalogCategoryEntityTexts) {
		this.catalogCategoryEntityTexts = catalogCategoryEntityTexts;
	}
	
	public Set<CatalogCategoryEntityVarchar> getCatalogCategoryEntityVarchars() {
		return this.catalogCategoryEntityVarchars;
	}

	public void setCatalogCategoryEntityVarchars(Set<CatalogCategoryEntityVarchar> catalogCategoryEntityVarchars) {
		this.catalogCategoryEntityVarchars = catalogCategoryEntityVarchars;
	}
	
	public Set<CatalogCompareItem> getCatalogCompareItems() {
		return this.catalogCompareItems;
	}

	public void setCatalogCompareItems(Set<CatalogCompareItem> catalogCompareItems) {
		this.catalogCompareItems = catalogCompareItems;
	}
	
	public Set<CatalogProductEntityDatetime> getCatalogProductEntityDatetimes() {
		return this.catalogProductEntityDatetimes;
	}

	public void setCatalogProductEntityDatetimes(Set<CatalogProductEntityDatetime> catalogProductEntityDatetimes) {
		this.catalogProductEntityDatetimes = catalogProductEntityDatetimes;
	}
	
	public Set<CatalogProductEntityDecimal> getCatalogProductEntityDecimals() {
		return this.catalogProductEntityDecimals;
	}

	public void setCatalogProductEntityDecimals(Set<CatalogProductEntityDecimal> catalogProductEntityDecimals) {
		this.catalogProductEntityDecimals = catalogProductEntityDecimals;
	}
	
	public Set<CatalogProductEntityGallery> getCatalogProductEntityGalleries() {
		return this.catalogProductEntityGalleries;
	}

	public void setCatalogProductEntityGalleries(Set<CatalogProductEntityGallery> catalogProductEntityGalleries) {
		this.catalogProductEntityGalleries = catalogProductEntityGalleries;
	}
	
	public Set<CatalogProductEntityInt> getCatalogProductEntityInts() {
		return this.catalogProductEntityInts;
	}

	public void setCatalogProductEntityInts(Set<CatalogProductEntityInt> catalogProductEntityInts) {
		this.catalogProductEntityInts = catalogProductEntityInts;
	}
	
//	public Set<CatalogProductEntityMediaGalleryValue> getCatalogProductEntityMediaGalleryValues() {
//		return this.catalogProductEntityMediaGalleryValues;
//	}
//
//	public void setCatalogProductEntityMediaGalleryValues(Set<CatalogProductEntityMediaGalleryValue> catalogProductEntityMediaGalleryValues) {
//		this.catalogProductEntityMediaGalleryValues = catalogProductEntityMediaGalleryValues;
//	}
	
	public Set<CatalogProductEntityText> getCatalogProductEntityTexts() {
		return this.catalogProductEntityTexts;
	}

	public void setCatalogProductEntityTexts(Set<CatalogProductEntityText> catalogProductEntityTexts) {
		this.catalogProductEntityTexts = catalogProductEntityTexts;
	}
	
	public Set<CatalogProductEntityVarchar> getCatalogProductEntityVarchars() {
		return this.catalogProductEntityVarchars;
	}

	public void setCatalogProductEntityVarchars(Set<CatalogProductEntityVarchar> catalogProductEntityVarchars) {
		this.catalogProductEntityVarchars = catalogProductEntityVarchars;
	}
	
	public Set<CatalogProductOptionPrice> getCatalogProductOptionPrices() {
		return this.catalogProductOptionPrices;
	}

	public void setCatalogProductOptionPrices(Set<CatalogProductOptionPrice> catalogProductOptionPrices) {
		this.catalogProductOptionPrices = catalogProductOptionPrices;
	}
	
	public Set<CatalogProductOptionTitle> getCatalogProductOptionTitles() {
		return this.catalogProductOptionTitles;
	}

	public void setCatalogProductOptionTitles(Set<CatalogProductOptionTitle> catalogProductOptionTitles) {
		this.catalogProductOptionTitles = catalogProductOptionTitles;
	}
	
	public Set<CatalogProductOptionTypePrice> getCatalogProductOptionTypePrices() {
		return this.catalogProductOptionTypePrices;
	}

	public void setCatalogProductOptionTypePrices(Set<CatalogProductOptionTypePrice> catalogProductOptionTypePrices) {
		this.catalogProductOptionTypePrices = catalogProductOptionTypePrices;
	}
	
	public Set<CatalogProductOptionTypeTitle> getCatalogProductOptionTypeTitles() {
		return this.catalogProductOptionTypeTitles;
	}

	public void setCatalogProductOptionTypeTitles(Set<CatalogProductOptionTypeTitle> catalogProductOptionTypeTitles) {
		this.catalogProductOptionTypeTitles = catalogProductOptionTypeTitles;
	}
	
	public Set<CatalogProductSuperAttributeLabel> getCatalogProductSuperAttributeLabels() {
		return this.catalogProductSuperAttributeLabels;
	}

	public void setCatalogProductSuperAttributeLabels(Set<CatalogProductSuperAttributeLabel> catalogProductSuperAttributeLabels) {
		this.catalogProductSuperAttributeLabels = catalogProductSuperAttributeLabels;
	}
	
	public Set<CatalogsearchQuery> getCatalogsearchQueries() {
		return this.catalogsearchQueries;
	}

	public void setCatalogsearchQueries(Set<CatalogsearchQuery> catalogsearchQueries) {
		this.catalogsearchQueries = catalogsearchQueries;
	}
	
	public Set<CheckoutAgreement> getCheckoutAgreements() {
		return this.checkoutAgreements;
	}

	public void setCheckoutAgreements(Set<CheckoutAgreement> checkoutAgreements) {
		this.checkoutAgreements = checkoutAgreements;
	}
	
	public Set<CmsBlock> getCmsBlocks() {
		return this.cmsBlocks;
	}

	public void setCmsBlocks(Set<CmsBlock> cmsBlocks) {
		this.cmsBlocks = cmsBlocks;
	}
	
	public Set<CmsPage> getCmsPages() {
		return this.cmsPages;
	}

	public void setCmsPages(Set<CmsPage> cmsPages) {
		this.cmsPages = cmsPages;
	}
	
	public Set<CoreLayoutLink> getCoreLayoutLinks() {
		return this.coreLayoutLinks;
	}

	public void setCoreLayoutLinks(Set<CoreLayoutLink> coreLayoutLinks) {
		this.coreLayoutLinks = coreLayoutLinks;
	}
	
	public CoreStoreGroup getCoreStoreGroup() {
		return this.coreStoreGroup;
	}

	public void setCoreStoreGroup(CoreStoreGroup coreStoreGroup) {
		this.coreStoreGroup = coreStoreGroup;
	}
	
	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
	public Set<CoreTranslate> getCoreTranslates() {
		return this.coreTranslates;
	}

	public void setCoreTranslates(Set<CoreTranslate> coreTranslates) {
		this.coreTranslates = coreTranslates;
	}
	
	public Set<CoreUrlRewrite> getCoreUrlRewrites() {
		return this.coreUrlRewrites;
	}

	public void setCoreUrlRewrites(Set<CoreUrlRewrite> coreUrlRewrites) {
		this.coreUrlRewrites = coreUrlRewrites;
	}
	
	public Set<CoreVariableValue> getCoreVariableValues() {
		return this.coreVariableValues;
	}

	public void setCoreVariableValues(Set<CoreVariableValue> coreVariableValues) {
		this.coreVariableValues = coreVariableValues;
	}
	
	public Set<CouponAggregated> getCouponAggregateds() {
		return this.couponAggregateds;
	}

	public void setCouponAggregateds(Set<CouponAggregated> couponAggregateds) {
		this.couponAggregateds = couponAggregateds;
	}
	
	public Set<CouponAggregatedOrder> getCouponAggregatedOrders() {
		return this.couponAggregatedOrders;
	}

	public void setCouponAggregatedOrders(Set<CouponAggregatedOrder> couponAggregatedOrders) {
		this.couponAggregatedOrders = couponAggregatedOrders;
	}
	
	public Set<CouponAggregatedUpdated> getCouponAggregatedUpdateds() {
		return this.couponAggregatedUpdateds;
	}

	public void setCouponAggregatedUpdateds(Set<CouponAggregatedUpdated> couponAggregatedUpdateds) {
		this.couponAggregatedUpdateds = couponAggregatedUpdateds;
	}
	
	public Set<CustomerEntity> getCustomerEntities() {
		return this.customerEntities;
	}

	public void setCustomerEntities(Set<CustomerEntity> customerEntities) {
		this.customerEntities = customerEntities;
	}
	
	public Set<DataflowBatch> getDataflowBatches() {
		return this.dataflowBatches;
	}

	public void setDataflowBatches(Set<DataflowBatch> dataflowBatches) {
		this.dataflowBatches = dataflowBatches;
	}
	
	public Set<DesignChange> getDesignChanges() {
		return this.designChanges;
	}

	public void setDesignChanges(Set<DesignChange> designChanges) {
		this.designChanges = designChanges;
	}
	
	public Set<DownloadableLinkTitle> getDownloadableLinkTitles() {
		return this.downloadableLinkTitles;
	}

	public void setDownloadableLinkTitles(Set<DownloadableLinkTitle> downloadableLinkTitles) {
		this.downloadableLinkTitles = downloadableLinkTitles;
	}
	
	public Set<DownloadableSampleTitle> getDownloadableSampleTitles() {
		return this.downloadableSampleTitles;
	}

	public void setDownloadableSampleTitles(Set<DownloadableSampleTitle> downloadableSampleTitles) {
		this.downloadableSampleTitles = downloadableSampleTitles;
	}
	
	public Set<EavAttributeLabel> getEavAttributeLabels() {
		return this.eavAttributeLabels;
	}

	public void setEavAttributeLabels(Set<EavAttributeLabel> eavAttributeLabels) {
		this.eavAttributeLabels = eavAttributeLabels;
	}
	
	public Set<EavAttributeOptionValue> getEavAttributeOptionValues() {
		return this.eavAttributeOptionValues;
	}

	public void setEavAttributeOptionValues(Set<EavAttributeOptionValue> eavAttributeOptionValues) {
		this.eavAttributeOptionValues = eavAttributeOptionValues;
	}
	
	public Set<EavEntity> getEavEntities() {
		return this.eavEntities;
	}

	public void setEavEntities(Set<EavEntity> eavEntities) {
		this.eavEntities = eavEntities;
	}
	
	public Set<EavEntityDatetime> getEavEntityDatetimes() {
		return this.eavEntityDatetimes;
	}

	public void setEavEntityDatetimes(Set<EavEntityDatetime> eavEntityDatetimes) {
		this.eavEntityDatetimes = eavEntityDatetimes;
	}
	
	public Set<EavEntityDecimal> getEavEntityDecimals() {
		return this.eavEntityDecimals;
	}

	public void setEavEntityDecimals(Set<EavEntityDecimal> eavEntityDecimals) {
		this.eavEntityDecimals = eavEntityDecimals;
	}
	
	public Set<EavEntityInt> getEavEntityInts() {
		return this.eavEntityInts;
	}

	public void setEavEntityInts(Set<EavEntityInt> eavEntityInts) {
		this.eavEntityInts = eavEntityInts;
	}
	
	public Set<EavEntityStore> getEavEntityStores() {
		return this.eavEntityStores;
	}

	public void setEavEntityStores(Set<EavEntityStore> eavEntityStores) {
		this.eavEntityStores = eavEntityStores;
	}
	
	public Set<EavEntityText> getEavEntityTexts() {
		return this.eavEntityTexts;
	}

	public void setEavEntityTexts(Set<EavEntityText> eavEntityTexts) {
		this.eavEntityTexts = eavEntityTexts;
	}
	
	public Set<EavEntityVarchar> getEavEntityVarchars() {
		return this.eavEntityVarchars;
	}

	public void setEavEntityVarchars(Set<EavEntityVarchar> eavEntityVarchars) {
		this.eavEntityVarchars = eavEntityVarchars;
	}
	
//	public Set<EavFormFieldsetLabel> getEavFormFieldsetLabels() {
//		return this.eavFormFieldsetLabels;
//	}
//
//	public void setEavFormFieldsetLabels(Set<EavFormFieldsetLabel> eavFormFieldsetLabels) {
//		this.eavFormFieldsetLabels = eavFormFieldsetLabels;
//	}
	
	public Set<EavFormType> getEavFormTypes() {
		return this.eavFormTypes;
	}

	public void setEavFormTypes(Set<EavFormType> eavFormTypes) {
		this.eavFormTypes = eavFormTypes;
	}
	
	public Set<GooglebaseItem> getGooglebaseItems() {
		return this.googlebaseItems;
	}

	public void setGooglebaseItems(Set<GooglebaseItem> googlebaseItems) {
		this.googlebaseItems = googlebaseItems;
	}
	
	public Set<GoogleoptimizerCode> getGoogleoptimizerCodes() {
		return this.googleoptimizerCodes;
	}

	public void setGoogleoptimizerCodes(Set<GoogleoptimizerCode> googleoptimizerCodes) {
		this.googleoptimizerCodes = googleoptimizerCodes;
	}
	
	public Set<NewsletterQueue> getNewsletterQueues() {
		return this.newsletterQueues;
	}

	public void setNewsletterQueues(Set<NewsletterQueue> newsletterQueues) {
		this.newsletterQueues = newsletterQueues;
	}
	
	public Set<NewsletterSubscriber> getNewsletterSubscribers() {
		return this.newsletterSubscribers;
	}

	public void setNewsletterSubscribers(Set<NewsletterSubscriber> newsletterSubscribers) {
		this.newsletterSubscribers = newsletterSubscribers;
	}
	
	public Set<Poll> getPolls1() {
		return this.polls1;
	}

	public void setPolls1(Set<Poll> polls1) {
		this.polls1 = polls1;
	}
	
	public Set<Poll> getPolls2() {
		return this.polls2;
	}

	public void setPolls2(Set<Poll> polls2) {
		this.polls2 = polls2;
	}
	
	public Set<RatingOptionVoteAggregated> getRatingOptionVoteAggregateds() {
		return this.ratingOptionVoteAggregateds;
	}

	public void setRatingOptionVoteAggregateds(Set<RatingOptionVoteAggregated> ratingOptionVoteAggregateds) {
		this.ratingOptionVoteAggregateds = ratingOptionVoteAggregateds;
	}
	
	public Set<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(Set<Rating> ratings) {
		this.ratings = ratings;
	}
	
//	public Set<RatingTitle> getRatingTitles() {
//		return this.ratingTitles;
//	}
//
//	public void setRatingTitles(Set<RatingTitle> ratingTitles) {
//		this.ratingTitles = ratingTitles;
//	}
	
	public Set<ReportComparedProductIndex> getReportComparedProductIndexs() {
		return this.reportComparedProductIndexs;
	}

	public void setReportComparedProductIndexs(Set<ReportComparedProductIndex> reportComparedProductIndexs) {
		this.reportComparedProductIndexs = reportComparedProductIndexs;
	}
	
	public Set<ReportEvent> getReportEvents() {
		return this.reportEvents;
	}

	public void setReportEvents(Set<ReportEvent> reportEvents) {
		this.reportEvents = reportEvents;
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
	
	public Set<ReviewEntitySummary> getReviewEntitySummaries() {
		return this.reviewEntitySummaries;
	}

	public void setReviewEntitySummaries(Set<ReviewEntitySummary> reviewEntitySummaries) {
		this.reviewEntitySummaries = reviewEntitySummaries;
	}
	
	public Set<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
	
	public Set<SalesBestsellersAggregatedDaily> getSalesBestsellersAggregatedDailies() {
		return this.salesBestsellersAggregatedDailies;
	}

	public void setSalesBestsellersAggregatedDailies(Set<SalesBestsellersAggregatedDaily> salesBestsellersAggregatedDailies) {
		this.salesBestsellersAggregatedDailies = salesBestsellersAggregatedDailies;
	}
	
	public Set<SalesBestsellersAggregatedMonthly> getSalesBestsellersAggregatedMonthlies() {
		return this.salesBestsellersAggregatedMonthlies;
	}

	public void setSalesBestsellersAggregatedMonthlies(Set<SalesBestsellersAggregatedMonthly> salesBestsellersAggregatedMonthlies) {
		this.salesBestsellersAggregatedMonthlies = salesBestsellersAggregatedMonthlies;
	}
	
	public Set<SalesBestsellersAggregatedYearly> getSalesBestsellersAggregatedYearlies() {
		return this.salesBestsellersAggregatedYearlies;
	}

	public void setSalesBestsellersAggregatedYearlies(Set<SalesBestsellersAggregatedYearly> salesBestsellersAggregatedYearlies) {
		this.salesBestsellersAggregatedYearlies = salesBestsellersAggregatedYearlies;
	}
	
	public Set<SalesBillingAgreement> getSalesBillingAgreements() {
		return this.salesBillingAgreements;
	}

	public void setSalesBillingAgreements(Set<SalesBillingAgreement> salesBillingAgreements) {
		this.salesBillingAgreements = salesBillingAgreements;
	}
	
	public Set<SalesFlatCreditmemo> getSalesFlatCreditmemos() {
		return this.salesFlatCreditmemos;
	}

	public void setSalesFlatCreditmemos(Set<SalesFlatCreditmemo> salesFlatCreditmemos) {
		this.salesFlatCreditmemos = salesFlatCreditmemos;
	}
	
	public Set<SalesFlatCreditmemoGrid> getSalesFlatCreditmemoGrids() {
		return this.salesFlatCreditmemoGrids;
	}

	public void setSalesFlatCreditmemoGrids(Set<SalesFlatCreditmemoGrid> salesFlatCreditmemoGrids) {
		this.salesFlatCreditmemoGrids = salesFlatCreditmemoGrids;
	}
	
	public Set<SalesFlatInvoice> getSalesFlatInvoices() {
		return this.salesFlatInvoices;
	}

	public void setSalesFlatInvoices(Set<SalesFlatInvoice> salesFlatInvoices) {
		this.salesFlatInvoices = salesFlatInvoices;
	}
	
	public Set<SalesFlatInvoiceGrid> getSalesFlatInvoiceGrids() {
		return this.salesFlatInvoiceGrids;
	}

	public void setSalesFlatInvoiceGrids(Set<SalesFlatInvoiceGrid> salesFlatInvoiceGrids) {
		this.salesFlatInvoiceGrids = salesFlatInvoiceGrids;
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
	
	public Set<SalesFlatOrderItem> getSalesFlatOrderItems() {
		return this.salesFlatOrderItems;
	}

	public void setSalesFlatOrderItems(Set<SalesFlatOrderItem> salesFlatOrderItems) {
		this.salesFlatOrderItems = salesFlatOrderItems;
	}
	
	public Set<SalesFlatQuote> getSalesFlatQuotes() {
		return this.salesFlatQuotes;
	}

	public void setSalesFlatQuotes(Set<SalesFlatQuote> salesFlatQuotes) {
		this.salesFlatQuotes = salesFlatQuotes;
	}
	
	public Set<SalesFlatQuoteItem> getSalesFlatQuoteItems() {
		return this.salesFlatQuoteItems;
	}

	public void setSalesFlatQuoteItems(Set<SalesFlatQuoteItem> salesFlatQuoteItems) {
		this.salesFlatQuoteItems = salesFlatQuoteItems;
	}
	
	public Set<SalesFlatShipment> getSalesFlatShipments() {
		return this.salesFlatShipments;
	}

	public void setSalesFlatShipments(Set<SalesFlatShipment> salesFlatShipments) {
		this.salesFlatShipments = salesFlatShipments;
	}
	
	public Set<SalesFlatShipmentGrid> getSalesFlatShipmentGrids() {
		return this.salesFlatShipmentGrids;
	}

	public void setSalesFlatShipmentGrids(Set<SalesFlatShipmentGrid> salesFlatShipmentGrids) {
		this.salesFlatShipmentGrids = salesFlatShipmentGrids;
	}
	
	public Set<SalesInvoicedAggregated> getSalesInvoicedAggregateds() {
		return this.salesInvoicedAggregateds;
	}

	public void setSalesInvoicedAggregateds(Set<SalesInvoicedAggregated> salesInvoicedAggregateds) {
		this.salesInvoicedAggregateds = salesInvoicedAggregateds;
	}
	
	public Set<SalesInvoicedAggregatedOrder> getSalesInvoicedAggregatedOrders() {
		return this.salesInvoicedAggregatedOrders;
	}

	public void setSalesInvoicedAggregatedOrders(Set<SalesInvoicedAggregatedOrder> salesInvoicedAggregatedOrders) {
		this.salesInvoicedAggregatedOrders = salesInvoicedAggregatedOrders;
	}
	
	public Set<SalesOrderAggregatedCreated> getSalesOrderAggregatedCreateds() {
		return this.salesOrderAggregatedCreateds;
	}

	public void setSalesOrderAggregatedCreateds(Set<SalesOrderAggregatedCreated> salesOrderAggregatedCreateds) {
		this.salesOrderAggregatedCreateds = salesOrderAggregatedCreateds;
	}
	
	public Set<SalesOrderAggregatedUpdated> getSalesOrderAggregatedUpdateds() {
		return this.salesOrderAggregatedUpdateds;
	}

	public void setSalesOrderAggregatedUpdateds(Set<SalesOrderAggregatedUpdated> salesOrderAggregatedUpdateds) {
		this.salesOrderAggregatedUpdateds = salesOrderAggregatedUpdateds;
	}
	
//	public Set<SalesOrderStatusLabel> getSalesOrderStatusLabels() {
//		return this.salesOrderStatusLabels;
//	}
//
//	public void setSalesOrderStatusLabels(Set<SalesOrderStatusLabel> salesOrderStatusLabels) {
//		this.salesOrderStatusLabels = salesOrderStatusLabels;
//	}
	
	public Set<SalesRecurringProfile> getSalesRecurringProfiles() {
		return this.salesRecurringProfiles;
	}

	public void setSalesRecurringProfiles(Set<SalesRecurringProfile> salesRecurringProfiles) {
		this.salesRecurringProfiles = salesRecurringProfiles;
	}
	
	public Set<SalesRefundedAggregated> getSalesRefundedAggregateds() {
		return this.salesRefundedAggregateds;
	}

	public void setSalesRefundedAggregateds(Set<SalesRefundedAggregated> salesRefundedAggregateds) {
		this.salesRefundedAggregateds = salesRefundedAggregateds;
	}
	
	public Set<SalesRefundedAggregatedOrder> getSalesRefundedAggregatedOrders() {
		return this.salesRefundedAggregatedOrders;
	}

	public void setSalesRefundedAggregatedOrders(Set<SalesRefundedAggregatedOrder> salesRefundedAggregatedOrders) {
		this.salesRefundedAggregatedOrders = salesRefundedAggregatedOrders;
	}
	
	public Set<SalesShippingAggregated> getSalesShippingAggregateds() {
		return this.salesShippingAggregateds;
	}

	public void setSalesShippingAggregateds(Set<SalesShippingAggregated> salesShippingAggregateds) {
		this.salesShippingAggregateds = salesShippingAggregateds;
	}
	
	public Set<SalesShippingAggregatedOrder> getSalesShippingAggregatedOrders() {
		return this.salesShippingAggregatedOrders;
	}

	public void setSalesShippingAggregatedOrders(Set<SalesShippingAggregatedOrder> salesShippingAggregatedOrders) {
		this.salesShippingAggregatedOrders = salesShippingAggregatedOrders;
	}
	
	public Set<SalesruleLabel> getSalesruleLabels() {
		return this.salesruleLabels;
	}

	public void setSalesruleLabels(Set<SalesruleLabel> salesruleLabels) {
		this.salesruleLabels = salesruleLabels;
	}
	
	public Set<Sitemap> getSitemaps() {
		return this.sitemaps;
	}

	public void setSitemaps(Set<Sitemap> sitemaps) {
		this.sitemaps = sitemaps;
	}
	
	public Set<Tag> getTags() {
		return this.tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	
//	public Set<TagProperty> getTagProperties() {
//		return this.tagProperties;
//	}
//
//	public void setTagProperties(Set<TagProperty> tagProperties) {
//		this.tagProperties = tagProperties;
//	}
	
	public Set<TagRelation> getTagRelations() {
		return this.tagRelations;
	}

	public void setTagRelations(Set<TagRelation> tagRelations) {
		this.tagRelations = tagRelations;
	}
	
//	public Set<TagSummary> getTagSummaries() {
//		return this.tagSummaries;
//	}
//
//	public void setTagSummaries(Set<TagSummary> tagSummaries) {
//		this.tagSummaries = tagSummaries;
//	}
	
	public Set<TaxCalculationRateTitle> getTaxCalculationRateTitles() {
		return this.taxCalculationRateTitles;
	}

	public void setTaxCalculationRateTitles(Set<TaxCalculationRateTitle> taxCalculationRateTitles) {
		this.taxCalculationRateTitles = taxCalculationRateTitles;
	}
	
	public Set<TaxOrderAggregatedCreated> getTaxOrderAggregatedCreateds() {
		return this.taxOrderAggregatedCreateds;
	}

	public void setTaxOrderAggregatedCreateds(Set<TaxOrderAggregatedCreated> taxOrderAggregatedCreateds) {
		this.taxOrderAggregatedCreateds = taxOrderAggregatedCreateds;
	}
	
	public Set<TaxOrderAggregatedUpdated> getTaxOrderAggregatedUpdateds() {
		return this.taxOrderAggregatedUpdateds;
	}

	public void setTaxOrderAggregatedUpdateds(Set<TaxOrderAggregatedUpdated> taxOrderAggregatedUpdateds) {
		this.taxOrderAggregatedUpdateds = taxOrderAggregatedUpdateds;
	}
	
	public Set<WishlistItem> getWishlistItems() {
		return this.wishlistItems;
	}

	public void setWishlistItems(Set<WishlistItem> wishlistItems) {
		this.wishlistItems = wishlistItems;
	}
	
	public Set<XmlconnectApplication> getXmlconnectApplications() {
		return this.xmlconnectApplications;
	}

	public void setXmlconnectApplications(Set<XmlconnectApplication> xmlconnectApplications) {
		this.xmlconnectApplications = xmlconnectApplications;
	}
	
}