package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_eav_attribute database table.
 * 
 */
@Entity
@Table(name="catalog_eav_attribute")
public class CatalogEavAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="attribute_id")
	private int attributeId;

	@Column(name="apply_to")
	private String applyTo;

	@Column(name="frontend_input_renderer")
	private String frontendInputRenderer;

	@Column(name="is_comparable")
	private int isComparable;

	@Column(name="is_configurable")
	private int isConfigurable;

	@Column(name="is_filterable")
	private int isFilterable;

	@Column(name="is_filterable_in_search")
	private int isFilterableInSearch;

	@Column(name="is_global")
	private int isGlobal;

	@Column(name="is_html_allowed_on_front")
	private int isHtmlAllowedOnFront;

	@Column(name="is_searchable")
	private int isSearchable;

	@Column(name="is_used_for_price_rules")
	private int isUsedForPriceRules;

	@Column(name="is_used_for_promo_rules")
	private int isUsedForPromoRules;

	@Column(name="is_visible")
	private int isVisible;

	@Column(name="is_visible_in_advanced_search")
	private int isVisibleInAdvancedSearch;

	@Column(name="is_visible_on_front")
	private int isVisibleOnFront;

	@Column(name="is_wysiwyg_enabled")
	private int isWysiwygEnabled;

	private int position;

	@Column(name="used_for_sort_by")
	private int usedForSortBy;

	@Column(name="used_in_product_listing")
	private int usedInProductListing;

	//bi-directional one-to-one association to EavAttribute
	@OneToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

    public CatalogEavAttribute() {
    }

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public String getApplyTo() {
		return this.applyTo;
	}

	public void setApplyTo(String applyTo) {
		this.applyTo = applyTo;
	}

	public String getFrontendInputRenderer() {
		return this.frontendInputRenderer;
	}

	public void setFrontendInputRenderer(String frontendInputRenderer) {
		this.frontendInputRenderer = frontendInputRenderer;
	}

	public int getIsComparable() {
		return this.isComparable;
	}

	public void setIsComparable(int isComparable) {
		this.isComparable = isComparable;
	}

	public int getIsConfigurable() {
		return this.isConfigurable;
	}

	public void setIsConfigurable(int isConfigurable) {
		this.isConfigurable = isConfigurable;
	}

	public int getIsFilterable() {
		return this.isFilterable;
	}

	public void setIsFilterable(int isFilterable) {
		this.isFilterable = isFilterable;
	}

	public int getIsFilterableInSearch() {
		return this.isFilterableInSearch;
	}

	public void setIsFilterableInSearch(int isFilterableInSearch) {
		this.isFilterableInSearch = isFilterableInSearch;
	}

	public int getIsGlobal() {
		return this.isGlobal;
	}

	public void setIsGlobal(int isGlobal) {
		this.isGlobal = isGlobal;
	}

	public int getIsHtmlAllowedOnFront() {
		return this.isHtmlAllowedOnFront;
	}

	public void setIsHtmlAllowedOnFront(int isHtmlAllowedOnFront) {
		this.isHtmlAllowedOnFront = isHtmlAllowedOnFront;
	}

	public int getIsSearchable() {
		return this.isSearchable;
	}

	public void setIsSearchable(int isSearchable) {
		this.isSearchable = isSearchable;
	}

	public int getIsUsedForPriceRules() {
		return this.isUsedForPriceRules;
	}

	public void setIsUsedForPriceRules(int isUsedForPriceRules) {
		this.isUsedForPriceRules = isUsedForPriceRules;
	}

	public int getIsUsedForPromoRules() {
		return this.isUsedForPromoRules;
	}

	public void setIsUsedForPromoRules(int isUsedForPromoRules) {
		this.isUsedForPromoRules = isUsedForPromoRules;
	}

	public int getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(int isVisible) {
		this.isVisible = isVisible;
	}

	public int getIsVisibleInAdvancedSearch() {
		return this.isVisibleInAdvancedSearch;
	}

	public void setIsVisibleInAdvancedSearch(int isVisibleInAdvancedSearch) {
		this.isVisibleInAdvancedSearch = isVisibleInAdvancedSearch;
	}

	public int getIsVisibleOnFront() {
		return this.isVisibleOnFront;
	}

	public void setIsVisibleOnFront(int isVisibleOnFront) {
		this.isVisibleOnFront = isVisibleOnFront;
	}

	public int getIsWysiwygEnabled() {
		return this.isWysiwygEnabled;
	}

	public void setIsWysiwygEnabled(int isWysiwygEnabled) {
		this.isWysiwygEnabled = isWysiwygEnabled;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getUsedForSortBy() {
		return this.usedForSortBy;
	}

	public void setUsedForSortBy(int usedForSortBy) {
		this.usedForSortBy = usedForSortBy;
	}

	public int getUsedInProductListing() {
		return this.usedInProductListing;
	}

	public void setUsedInProductListing(int usedInProductListing) {
		this.usedInProductListing = usedInProductListing;
	}

	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
}