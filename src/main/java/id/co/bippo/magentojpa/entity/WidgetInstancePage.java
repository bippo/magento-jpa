package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the widget_instance_page database table.
 * 
 */
@Entity
@Table(name="widget_instance_page")
public class WidgetInstancePage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="page_id")
	private int pageId;

	@Column(name="block_reference")
	private String blockReference;

    @Lob()
	private String entities;

	@Column(name="layout_handle")
	private String layoutHandle;

	@Column(name="page_for")
	private String pageFor;

	@Column(name="page_group")
	private String pageGroup;

	@Column(name="page_template")
	private String pageTemplate;

	//bi-directional many-to-one association to WidgetInstance
    @ManyToOne
	@JoinColumn(name="instance_id")
	private WidgetInstance widgetInstance;

	//bi-directional many-to-many association to CoreLayoutUpdate
    @ManyToMany
	@JoinTable(
		name="widget_instance_page_layout"
		, joinColumns={
			@JoinColumn(name="page_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="layout_update_id")
			}
		)
	private Set<CoreLayoutUpdate> coreLayoutUpdates;

    public WidgetInstancePage() {
    }

	public int getPageId() {
		return this.pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public String getBlockReference() {
		return this.blockReference;
	}

	public void setBlockReference(String blockReference) {
		this.blockReference = blockReference;
	}

	public String getEntities() {
		return this.entities;
	}

	public void setEntities(String entities) {
		this.entities = entities;
	}

	public String getLayoutHandle() {
		return this.layoutHandle;
	}

	public void setLayoutHandle(String layoutHandle) {
		this.layoutHandle = layoutHandle;
	}

	public String getPageFor() {
		return this.pageFor;
	}

	public void setPageFor(String pageFor) {
		this.pageFor = pageFor;
	}

	public String getPageGroup() {
		return this.pageGroup;
	}

	public void setPageGroup(String pageGroup) {
		this.pageGroup = pageGroup;
	}

	public String getPageTemplate() {
		return this.pageTemplate;
	}

	public void setPageTemplate(String pageTemplate) {
		this.pageTemplate = pageTemplate;
	}

	public WidgetInstance getWidgetInstance() {
		return this.widgetInstance;
	}

	public void setWidgetInstance(WidgetInstance widgetInstance) {
		this.widgetInstance = widgetInstance;
	}
	
	public Set<CoreLayoutUpdate> getCoreLayoutUpdates() {
		return this.coreLayoutUpdates;
	}

	public void setCoreLayoutUpdates(Set<CoreLayoutUpdate> coreLayoutUpdates) {
		this.coreLayoutUpdates = coreLayoutUpdates;
	}
	
}