package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the core_layout_update database table.
 * 
 */
@Entity
@Table(name="core_layout_update")
public class CoreLayoutUpdate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="layout_update_id")
	private int layoutUpdateId;

	private String handle;

	@Column(name="sort_order")
	private short sortOrder;

    @Lob()
	private String xml;

	//bi-directional many-to-one association to CoreLayoutLink
	@OneToMany(mappedBy="coreLayoutUpdate")
	private Set<CoreLayoutLink> coreLayoutLinks;

	//bi-directional many-to-many association to WidgetInstancePage
	@ManyToMany(mappedBy="coreLayoutUpdates")
	private Set<WidgetInstancePage> widgetInstancePages;

    public CoreLayoutUpdate() {
    }

	public int getLayoutUpdateId() {
		return this.layoutUpdateId;
	}

	public void setLayoutUpdateId(int layoutUpdateId) {
		this.layoutUpdateId = layoutUpdateId;
	}

	public String getHandle() {
		return this.handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public short getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(short sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getXml() {
		return this.xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public Set<CoreLayoutLink> getCoreLayoutLinks() {
		return this.coreLayoutLinks;
	}

	public void setCoreLayoutLinks(Set<CoreLayoutLink> coreLayoutLinks) {
		this.coreLayoutLinks = coreLayoutLinks;
	}
	
	public Set<WidgetInstancePage> getWidgetInstancePages() {
		return this.widgetInstancePages;
	}

	public void setWidgetInstancePages(Set<WidgetInstancePage> widgetInstancePages) {
		this.widgetInstancePages = widgetInstancePages;
	}
	
}