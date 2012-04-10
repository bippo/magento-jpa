package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the catalog_category_flat_store_5 database table.
 * 
 */
@Entity
@Table(name="catalog_category_flat_store_5")
public class CatalogCategoryFlatStore5 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

    @Lob()
	@Column(name="all_children")
	private String allChildren;

    @Lob()
	@Column(name="available_sort_by")
	private String availableSortBy;

    @Lob()
	private String children;

	@Column(name="children_count")
	private int childrenCount;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="custom_apply_to_products")
	private int customApplyToProducts;

	@Column(name="custom_design")
	private String customDesign;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="custom_design_from")
	private Date customDesignFrom;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="custom_design_to")
	private Date customDesignTo;

    @Lob()
	@Column(name="custom_layout_update")
	private String customLayoutUpdate;

	@Column(name="custom_use_parent_settings")
	private int customUseParentSettings;

	@Column(name="default_sort_by")
	private String defaultSortBy;

    @Lob()
	private String description;

	@Column(name="display_mode")
	private String displayMode;

	@Column(name="filter_price_range")
	private int filterPriceRange;

	private String image;

	@Column(name="include_in_menu")
	private int includeInMenu;

	@Column(name="is_active")
	private int isActive;

	@Column(name="is_anchor")
	private int isAnchor;

	@Column(name="landing_page")
	private int landingPage;

	private int level;

    @Lob()
	@Column(name="meta_description")
	private String metaDescription;

    @Lob()
	@Column(name="meta_keywords")
	private String metaKeywords;

	@Column(name="meta_title")
	private String metaTitle;

	private String name;

	@Column(name="page_layout")
	private String pageLayout;

	@Column(name="parent_id")
	private int parentId;

	private String path;

    @Lob()
	@Column(name="path_in_store")
	private String pathInStore;

	private int position;

	private String thumbnail;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@Column(name="url_key")
	private String urlKey;

	@Column(name="url_path")
	private String urlPath;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional one-to-one association to CatalogCategoryEntity
	@OneToOne
	@JoinColumn(name="entity_id")
	private CatalogCategoryEntity catalogCategoryEntity;

    public CatalogCategoryFlatStore5() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getAllChildren() {
		return this.allChildren;
	}

	public void setAllChildren(String allChildren) {
		this.allChildren = allChildren;
	}

	public String getAvailableSortBy() {
		return this.availableSortBy;
	}

	public void setAvailableSortBy(String availableSortBy) {
		this.availableSortBy = availableSortBy;
	}

	public String getChildren() {
		return this.children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public int getChildrenCount() {
		return this.childrenCount;
	}

	public void setChildrenCount(int childrenCount) {
		this.childrenCount = childrenCount;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getCustomApplyToProducts() {
		return this.customApplyToProducts;
	}

	public void setCustomApplyToProducts(int customApplyToProducts) {
		this.customApplyToProducts = customApplyToProducts;
	}

	public String getCustomDesign() {
		return this.customDesign;
	}

	public void setCustomDesign(String customDesign) {
		this.customDesign = customDesign;
	}

	public Date getCustomDesignFrom() {
		return this.customDesignFrom;
	}

	public void setCustomDesignFrom(Date customDesignFrom) {
		this.customDesignFrom = customDesignFrom;
	}

	public Date getCustomDesignTo() {
		return this.customDesignTo;
	}

	public void setCustomDesignTo(Date customDesignTo) {
		this.customDesignTo = customDesignTo;
	}

	public String getCustomLayoutUpdate() {
		return this.customLayoutUpdate;
	}

	public void setCustomLayoutUpdate(String customLayoutUpdate) {
		this.customLayoutUpdate = customLayoutUpdate;
	}

	public int getCustomUseParentSettings() {
		return this.customUseParentSettings;
	}

	public void setCustomUseParentSettings(int customUseParentSettings) {
		this.customUseParentSettings = customUseParentSettings;
	}

	public String getDefaultSortBy() {
		return this.defaultSortBy;
	}

	public void setDefaultSortBy(String defaultSortBy) {
		this.defaultSortBy = defaultSortBy;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayMode() {
		return this.displayMode;
	}

	public void setDisplayMode(String displayMode) {
		this.displayMode = displayMode;
	}

	public int getFilterPriceRange() {
		return this.filterPriceRange;
	}

	public void setFilterPriceRange(int filterPriceRange) {
		this.filterPriceRange = filterPriceRange;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getIncludeInMenu() {
		return this.includeInMenu;
	}

	public void setIncludeInMenu(int includeInMenu) {
		this.includeInMenu = includeInMenu;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsAnchor() {
		return this.isAnchor;
	}

	public void setIsAnchor(int isAnchor) {
		this.isAnchor = isAnchor;
	}

	public int getLandingPage() {
		return this.landingPage;
	}

	public void setLandingPage(int landingPage) {
		this.landingPage = landingPage;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaTitle() {
		return this.metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPageLayout() {
		return this.pageLayout;
	}

	public void setPageLayout(String pageLayout) {
		this.pageLayout = pageLayout;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPathInStore() {
		return this.pathInStore;
	}

	public void setPathInStore(String pathInStore) {
		this.pathInStore = pathInStore;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUrlKey() {
		return this.urlKey;
	}

	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	public String getUrlPath() {
		return this.urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public CatalogCategoryEntity getCatalogCategoryEntity() {
		return this.catalogCategoryEntity;
	}

	public void setCatalogCategoryEntity(CatalogCategoryEntity catalogCategoryEntity) {
		this.catalogCategoryEntity = catalogCategoryEntity;
	}
	
}