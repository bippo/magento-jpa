package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the catalog_category_entity database table.
 * 
 */
@Entity
@Table(name="catalog_category_entity")
public class CatalogCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="attribute_set_id")
	private int attributeSetId;

	@Column(name="children_count")
	private int childrenCount;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="entity_type_id")
	private int entityTypeId;

	private int level;

	@Column(name="parent_id")
	private int parentId;

	private String path;

	private int position;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CatalogCategoryEntityDatetime
	@OneToMany(mappedBy="catalogCategoryEntity")
	private Set<CatalogCategoryEntityDatetime> catalogCategoryEntityDatetimes;

	//bi-directional many-to-one association to CatalogCategoryEntityDecimal
	@OneToMany(mappedBy="catalogCategoryEntity")
	private Set<CatalogCategoryEntityDecimal> catalogCategoryEntityDecimals;

	//bi-directional many-to-one association to CatalogCategoryEntityInt
	@OneToMany(mappedBy="catalogCategoryEntity")
	private Set<CatalogCategoryEntityInt> catalogCategoryEntityInts;

	//bi-directional many-to-one association to CatalogCategoryEntityText
	@OneToMany(mappedBy="catalogCategoryEntity")
	private Set<CatalogCategoryEntityText> catalogCategoryEntityTexts;

	//bi-directional many-to-one association to CatalogCategoryEntityVarchar
	@OneToMany(mappedBy="catalogCategoryEntity")
	private Set<CatalogCategoryEntityVarchar> catalogCategoryEntityVarchars;

//	//bi-directional many-to-one association to CatalogCategoryProduct
//	@OneToMany(mappedBy="catalogCategoryEntity")
//	private Set<CatalogCategoryProduct> catalogCategoryProducts;

	//bi-directional many-to-one association to CoreUrlRewrite
	@OneToMany(mappedBy="catalogCategoryEntity")
	private Set<CoreUrlRewrite> coreUrlRewrites;

    public CatalogCategoryEntity() {
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

	public int getEntityTypeId() {
		return this.entityTypeId;
	}

	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
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
	
//	public Set<CatalogCategoryProduct> getCatalogCategoryProducts() {
//		return this.catalogCategoryProducts;
//	}
//
//	public void setCatalogCategoryProducts(Set<CatalogCategoryProduct> catalogCategoryProducts) {
//		this.catalogCategoryProducts = catalogCategoryProducts;
//	}
	
	public Set<CoreUrlRewrite> getCoreUrlRewrites() {
		return this.coreUrlRewrites;
	}

	public void setCoreUrlRewrites(Set<CoreUrlRewrite> coreUrlRewrites) {
		this.coreUrlRewrites = coreUrlRewrites;
	}
	
}