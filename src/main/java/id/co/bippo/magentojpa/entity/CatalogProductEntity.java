package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the catalog_product_entity database table.
 * 
 */
@Entity
@Table(name="catalog_product_entity")
public class CatalogProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="has_options")
	private short hasOptions;

	@Column(name="required_options")
	private int requiredOptions;

	private String sku;

	@Column(name="type_id")
	private String typeId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

//	//bi-directional many-to-one association to CatalogCategoryProduct
//	@OneToMany(mappedBy="catalogProductEntity")
//	private Set<CatalogCategoryProduct> catalogCategoryProducts;

	//bi-directional many-to-one association to CatalogCompareItem
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogCompareItem> catalogCompareItems;

	//bi-directional many-to-one association to CatalogProductBundleOption
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductBundleOption> catalogProductBundleOptions;

	//bi-directional many-to-one association to CatalogProductBundleSelection
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductBundleSelection> catalogProductBundleSelections;

	//bi-directional many-to-one association to EavAttributeSet
    @ManyToOne
	@JoinColumn(name="attribute_set_id")
	private EavAttributeSet eavAttributeSet;

	//bi-directional many-to-one association to EavEntityType
    @ManyToOne
	@JoinColumn(name="entity_type_id")
	private EavEntityType eavEntityType;

	//bi-directional many-to-one association to CatalogProductEntityDatetime
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductEntityDatetime> catalogProductEntityDatetimes;

	//bi-directional many-to-one association to CatalogProductEntityDecimal
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductEntityDecimal> catalogProductEntityDecimals;

	//bi-directional many-to-one association to CatalogProductEntityGallery
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductEntityGallery> catalogProductEntityGalleries;

	//bi-directional many-to-one association to CatalogProductEntityInt
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductEntityInt> catalogProductEntityInts;

	//bi-directional many-to-one association to CatalogProductEntityMediaGallery
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductEntityMediaGallery> catalogProductEntityMediaGalleries;

	//bi-directional many-to-one association to CatalogProductEntityText
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductEntityText> catalogProductEntityTexts;

	//bi-directional many-to-one association to CatalogProductEntityTierPrice
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductEntityTierPrice> catalogProductEntityTierPrices;

	//bi-directional many-to-one association to CatalogProductEntityVarchar
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductEntityVarchar> catalogProductEntityVarchars;

	//bi-directional many-to-one association to CatalogProductLink
	@OneToMany(mappedBy="catalogProductEntity1")
	private Set<CatalogProductLink> catalogProductLinks1;

	//bi-directional many-to-one association to CatalogProductLink
	@OneToMany(mappedBy="catalogProductEntity2")
	private Set<CatalogProductLink> catalogProductLinks2;

	//bi-directional many-to-one association to CatalogProductOption
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductOption> catalogProductOptions;

	//bi-directional many-to-many association to CatalogProductEntity
    @ManyToMany
	@JoinTable(
		name="catalog_product_relation"
		, joinColumns={
			@JoinColumn(name="parent_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="child_id")
			}
		)
	private Set<CatalogProductEntity> catalogProductEntities1;

	//bi-directional many-to-many association to CatalogProductEntity
	@ManyToMany(mappedBy="catalogProductEntities1")
	private Set<CatalogProductEntity> catalogProductEntities2;

	//bi-directional many-to-one association to CatalogProductSuperAttribute
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogProductSuperAttribute> catalogProductSuperAttributes;

	//bi-directional many-to-one association to CatalogProductSuperLink
	@OneToMany(mappedBy="catalogProductEntity1")
	private Set<CatalogProductSuperLink> catalogProductSuperLinks1;

	//bi-directional many-to-one association to CatalogProductSuperLink
	@OneToMany(mappedBy="catalogProductEntity2")
	private Set<CatalogProductSuperLink> catalogProductSuperLinks2;

	//bi-directional many-to-many association to CoreWebsite
    @ManyToMany
	@JoinTable(
		name="catalog_product_website"
		, joinColumns={
			@JoinColumn(name="product_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="website_id")
			}
		)
	private Set<CoreWebsite> coreWebsites;

	//bi-directional many-to-one association to CatalogindexPrice
//	@OneToMany(mappedBy="catalogProductEntity")
//	private Set<CatalogindexPrice> catalogindexPrices;

	//bi-directional many-to-one association to CataloginventoryStockItem
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CataloginventoryStockItem> cataloginventoryStockItems;

	//bi-directional many-to-one association to CataloginventoryStockStatus
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CataloginventoryStockStatus> cataloginventoryStockStatuses;

	//bi-directional many-to-one association to CatalogruleProduct
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogruleProduct> catalogruleProducts;

	//bi-directional many-to-one association to CatalogruleProductPrice
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CatalogruleProductPrice> catalogruleProductPrices;

//	//bi-directional many-to-one association to CatalogsearchResult
//	@OneToMany(mappedBy="catalogProductEntity")
//	private Set<CatalogsearchResult> catalogsearchResults;

	//bi-directional many-to-one association to CoreUrlRewrite
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<CoreUrlRewrite> coreUrlRewrites;

	//bi-directional many-to-one association to DownloadableLink
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<DownloadableLink> downloadableLinks;

	//bi-directional many-to-one association to DownloadableSample
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<DownloadableSample> downloadableSamples;

	//bi-directional many-to-one association to GooglebaseItem
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<GooglebaseItem> googlebaseItems;

	//bi-directional many-to-one association to ProductAlertPrice
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<ProductAlertPrice> productAlertPrices;

	//bi-directional many-to-one association to ProductAlertStock
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<ProductAlertStock> productAlertStocks;

	//bi-directional many-to-one association to ReportComparedProductIndex
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<ReportComparedProductIndex> reportComparedProductIndexs;

	//bi-directional many-to-one association to ReportViewedProductIndex
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<ReportViewedProductIndex> reportViewedProductIndexs;

	//bi-directional many-to-one association to SalesBestsellersAggregatedDaily
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<SalesBestsellersAggregatedDaily> salesBestsellersAggregatedDailies;

	//bi-directional many-to-one association to SalesBestsellersAggregatedMonthly
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<SalesBestsellersAggregatedMonthly> salesBestsellersAggregatedMonthlies;

	//bi-directional many-to-one association to SalesBestsellersAggregatedYearly
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<SalesBestsellersAggregatedYearly> salesBestsellersAggregatedYearlies;

	//bi-directional many-to-one association to SalesFlatQuoteItem
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<SalesFlatQuoteItem> salesFlatQuoteItems;

	//bi-directional many-to-one association to TagRelation
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<TagRelation> tagRelations;

	//bi-directional many-to-one association to WeeeDiscount
//	@OneToMany(mappedBy="catalogProductEntity")
//	private Set<WeeeDiscount> weeeDiscounts;

	//bi-directional many-to-one association to WeeeTax
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<WeeeTax> weeeTaxs;

	//bi-directional many-to-one association to WishlistItem
	@OneToMany(mappedBy="catalogProductEntity")
	private Set<WishlistItem> wishlistItems;

    public CatalogProductEntity() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public short getHasOptions() {
		return this.hasOptions;
	}

	public void setHasOptions(short hasOptions) {
		this.hasOptions = hasOptions;
	}

	public int getRequiredOptions() {
		return this.requiredOptions;
	}

	public void setRequiredOptions(int requiredOptions) {
		this.requiredOptions = requiredOptions;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

//	public Set<CatalogCategoryProduct> getCatalogCategoryProducts() {
//		return this.catalogCategoryProducts;
//	}
//
//	public void setCatalogCategoryProducts(Set<CatalogCategoryProduct> catalogCategoryProducts) {
//		this.catalogCategoryProducts = catalogCategoryProducts;
//	}
	
	public Set<CatalogCompareItem> getCatalogCompareItems() {
		return this.catalogCompareItems;
	}

	public void setCatalogCompareItems(Set<CatalogCompareItem> catalogCompareItems) {
		this.catalogCompareItems = catalogCompareItems;
	}
	
	public Set<CatalogProductBundleOption> getCatalogProductBundleOptions() {
		return this.catalogProductBundleOptions;
	}

	public void setCatalogProductBundleOptions(Set<CatalogProductBundleOption> catalogProductBundleOptions) {
		this.catalogProductBundleOptions = catalogProductBundleOptions;
	}
	
	public Set<CatalogProductBundleSelection> getCatalogProductBundleSelections() {
		return this.catalogProductBundleSelections;
	}

	public void setCatalogProductBundleSelections(Set<CatalogProductBundleSelection> catalogProductBundleSelections) {
		this.catalogProductBundleSelections = catalogProductBundleSelections;
	}
	
	public EavAttributeSet getEavAttributeSet() {
		return this.eavAttributeSet;
	}

	public void setEavAttributeSet(EavAttributeSet eavAttributeSet) {
		this.eavAttributeSet = eavAttributeSet;
	}
	
	public EavEntityType getEavEntityType() {
		return this.eavEntityType;
	}

	public void setEavEntityType(EavEntityType eavEntityType) {
		this.eavEntityType = eavEntityType;
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
	
	public Set<CatalogProductEntityMediaGallery> getCatalogProductEntityMediaGalleries() {
		return this.catalogProductEntityMediaGalleries;
	}

	public void setCatalogProductEntityMediaGalleries(Set<CatalogProductEntityMediaGallery> catalogProductEntityMediaGalleries) {
		this.catalogProductEntityMediaGalleries = catalogProductEntityMediaGalleries;
	}
	
	public Set<CatalogProductEntityText> getCatalogProductEntityTexts() {
		return this.catalogProductEntityTexts;
	}

	public void setCatalogProductEntityTexts(Set<CatalogProductEntityText> catalogProductEntityTexts) {
		this.catalogProductEntityTexts = catalogProductEntityTexts;
	}
	
	public Set<CatalogProductEntityTierPrice> getCatalogProductEntityTierPrices() {
		return this.catalogProductEntityTierPrices;
	}

	public void setCatalogProductEntityTierPrices(Set<CatalogProductEntityTierPrice> catalogProductEntityTierPrices) {
		this.catalogProductEntityTierPrices = catalogProductEntityTierPrices;
	}
	
	public Set<CatalogProductEntityVarchar> getCatalogProductEntityVarchars() {
		return this.catalogProductEntityVarchars;
	}

	public void setCatalogProductEntityVarchars(Set<CatalogProductEntityVarchar> catalogProductEntityVarchars) {
		this.catalogProductEntityVarchars = catalogProductEntityVarchars;
	}
	
	public Set<CatalogProductLink> getCatalogProductLinks1() {
		return this.catalogProductLinks1;
	}

	public void setCatalogProductLinks1(Set<CatalogProductLink> catalogProductLinks1) {
		this.catalogProductLinks1 = catalogProductLinks1;
	}
	
	public Set<CatalogProductLink> getCatalogProductLinks2() {
		return this.catalogProductLinks2;
	}

	public void setCatalogProductLinks2(Set<CatalogProductLink> catalogProductLinks2) {
		this.catalogProductLinks2 = catalogProductLinks2;
	}
	
	public Set<CatalogProductOption> getCatalogProductOptions() {
		return this.catalogProductOptions;
	}

	public void setCatalogProductOptions(Set<CatalogProductOption> catalogProductOptions) {
		this.catalogProductOptions = catalogProductOptions;
	}
	
	public Set<CatalogProductEntity> getCatalogProductEntities1() {
		return this.catalogProductEntities1;
	}

	public void setCatalogProductEntities1(Set<CatalogProductEntity> catalogProductEntities1) {
		this.catalogProductEntities1 = catalogProductEntities1;
	}
	
	public Set<CatalogProductEntity> getCatalogProductEntities2() {
		return this.catalogProductEntities2;
	}

	public void setCatalogProductEntities2(Set<CatalogProductEntity> catalogProductEntities2) {
		this.catalogProductEntities2 = catalogProductEntities2;
	}
	
	public Set<CatalogProductSuperAttribute> getCatalogProductSuperAttributes() {
		return this.catalogProductSuperAttributes;
	}

	public void setCatalogProductSuperAttributes(Set<CatalogProductSuperAttribute> catalogProductSuperAttributes) {
		this.catalogProductSuperAttributes = catalogProductSuperAttributes;
	}
	
	public Set<CatalogProductSuperLink> getCatalogProductSuperLinks1() {
		return this.catalogProductSuperLinks1;
	}

	public void setCatalogProductSuperLinks1(Set<CatalogProductSuperLink> catalogProductSuperLinks1) {
		this.catalogProductSuperLinks1 = catalogProductSuperLinks1;
	}
	
	public Set<CatalogProductSuperLink> getCatalogProductSuperLinks2() {
		return this.catalogProductSuperLinks2;
	}

	public void setCatalogProductSuperLinks2(Set<CatalogProductSuperLink> catalogProductSuperLinks2) {
		this.catalogProductSuperLinks2 = catalogProductSuperLinks2;
	}
	
	public Set<CoreWebsite> getCoreWebsites() {
		return this.coreWebsites;
	}

	public void setCoreWebsites(Set<CoreWebsite> coreWebsites) {
		this.coreWebsites = coreWebsites;
	}
	
	public Set<CataloginventoryStockItem> getCataloginventoryStockItems() {
		return this.cataloginventoryStockItems;
	}

	public void setCataloginventoryStockItems(Set<CataloginventoryStockItem> cataloginventoryStockItems) {
		this.cataloginventoryStockItems = cataloginventoryStockItems;
	}
	
	public Set<CataloginventoryStockStatus> getCataloginventoryStockStatuses() {
		return this.cataloginventoryStockStatuses;
	}

	public void setCataloginventoryStockStatuses(Set<CataloginventoryStockStatus> cataloginventoryStockStatuses) {
		this.cataloginventoryStockStatuses = cataloginventoryStockStatuses;
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
	
//	public Set<CatalogsearchResult> getCatalogsearchResults() {
//		return this.catalogsearchResults;
//	}
//
//	public void setCatalogsearchResults(Set<CatalogsearchResult> catalogsearchResults) {
//		this.catalogsearchResults = catalogsearchResults;
//	}
	
	public Set<CoreUrlRewrite> getCoreUrlRewrites() {
		return this.coreUrlRewrites;
	}

	public void setCoreUrlRewrites(Set<CoreUrlRewrite> coreUrlRewrites) {
		this.coreUrlRewrites = coreUrlRewrites;
	}
	
	public Set<DownloadableLink> getDownloadableLinks() {
		return this.downloadableLinks;
	}

	public void setDownloadableLinks(Set<DownloadableLink> downloadableLinks) {
		this.downloadableLinks = downloadableLinks;
	}
	
	public Set<DownloadableSample> getDownloadableSamples() {
		return this.downloadableSamples;
	}

	public void setDownloadableSamples(Set<DownloadableSample> downloadableSamples) {
		this.downloadableSamples = downloadableSamples;
	}
	
	public Set<GooglebaseItem> getGooglebaseItems() {
		return this.googlebaseItems;
	}

	public void setGooglebaseItems(Set<GooglebaseItem> googlebaseItems) {
		this.googlebaseItems = googlebaseItems;
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
	
	public Set<SalesFlatQuoteItem> getSalesFlatQuoteItems() {
		return this.salesFlatQuoteItems;
	}

	public void setSalesFlatQuoteItems(Set<SalesFlatQuoteItem> salesFlatQuoteItems) {
		this.salesFlatQuoteItems = salesFlatQuoteItems;
	}
	
	public Set<TagRelation> getTagRelations() {
		return this.tagRelations;
	}

	public void setTagRelations(Set<TagRelation> tagRelations) {
		this.tagRelations = tagRelations;
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
	
	public Set<WishlistItem> getWishlistItems() {
		return this.wishlistItems;
	}

	public void setWishlistItems(Set<WishlistItem> wishlistItems) {
		this.wishlistItems = wishlistItems;
	}
	
}