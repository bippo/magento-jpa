package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the cms_page database table.
 * 
 */
@Entity
@Table(name="cms_page")
public class CmsPage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="page_id")
	private short pageId;

    @Lob()
	private String content;

	@Column(name="content_heading")
	private String contentHeading;

	@Column(name="creation_time")
	private Timestamp creationTime;

    @Lob()
	@Column(name="custom_layout_update_xml")
	private String customLayoutUpdateXml;

	@Column(name="custom_root_template")
	private String customRootTemplate;

	@Column(name="custom_theme")
	private String customTheme;

    @Temporal( TemporalType.DATE)
	@Column(name="custom_theme_from")
	private Date customThemeFrom;

    @Temporal( TemporalType.DATE)
	@Column(name="custom_theme_to")
	private Date customThemeTo;

	private String identifier;

	@Column(name="is_active")
	private short isActive;

    @Lob()
	@Column(name="layout_update_xml")
	private String layoutUpdateXml;

    @Lob()
	@Column(name="meta_description")
	private String metaDescription;

    @Lob()
	@Column(name="meta_keywords")
	private String metaKeywords;

	@Column(name="root_template")
	private String rootTemplate;

	@Column(name="sort_order")
	private short sortOrder;

	private String title;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-many association to CoreStore
	@ManyToMany(mappedBy="cmsPages")
	private Set<CoreStore> coreStores;

    public CmsPage() {
    }

	public short getPageId() {
		return this.pageId;
	}

	public void setPageId(short pageId) {
		this.pageId = pageId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentHeading() {
		return this.contentHeading;
	}

	public void setContentHeading(String contentHeading) {
		this.contentHeading = contentHeading;
	}

	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public String getCustomLayoutUpdateXml() {
		return this.customLayoutUpdateXml;
	}

	public void setCustomLayoutUpdateXml(String customLayoutUpdateXml) {
		this.customLayoutUpdateXml = customLayoutUpdateXml;
	}

	public String getCustomRootTemplate() {
		return this.customRootTemplate;
	}

	public void setCustomRootTemplate(String customRootTemplate) {
		this.customRootTemplate = customRootTemplate;
	}

	public String getCustomTheme() {
		return this.customTheme;
	}

	public void setCustomTheme(String customTheme) {
		this.customTheme = customTheme;
	}

	public Date getCustomThemeFrom() {
		return this.customThemeFrom;
	}

	public void setCustomThemeFrom(Date customThemeFrom) {
		this.customThemeFrom = customThemeFrom;
	}

	public Date getCustomThemeTo() {
		return this.customThemeTo;
	}

	public void setCustomThemeTo(Date customThemeTo) {
		this.customThemeTo = customThemeTo;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}

	public String getLayoutUpdateXml() {
		return this.layoutUpdateXml;
	}

	public void setLayoutUpdateXml(String layoutUpdateXml) {
		this.layoutUpdateXml = layoutUpdateXml;
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

	public String getRootTemplate() {
		return this.rootTemplate;
	}

	public void setRootTemplate(String rootTemplate) {
		this.rootTemplate = rootTemplate;
	}

	public short getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(short sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Set<CoreStore> getCoreStores() {
		return this.coreStores;
	}

	public void setCoreStores(Set<CoreStore> coreStores) {
		this.coreStores = coreStores;
	}
	
}