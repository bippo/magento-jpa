package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the widget_instance database table.
 * 
 */
@Entity
@Table(name="widget_instance")
public class WidgetInstance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="instance_id")
	private int instanceId;

	@Column(name="instance_type")
	private String instanceType;

	@Column(name="package_theme")
	private String packageTheme;

	@Column(name="sort_order")
	private int sortOrder;

	@Column(name="store_ids")
	private String storeIds;

	private String title;

    @Lob()
	@Column(name="widget_parameters")
	private String widgetParameters;

	//bi-directional many-to-one association to WidgetInstancePage
	@OneToMany(mappedBy="widgetInstance")
	private Set<WidgetInstancePage> widgetInstancePages;

    public WidgetInstance() {
    }

	public int getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(int instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public String getPackageTheme() {
		return this.packageTheme;
	}

	public void setPackageTheme(String packageTheme) {
		this.packageTheme = packageTheme;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStoreIds() {
		return this.storeIds;
	}

	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWidgetParameters() {
		return this.widgetParameters;
	}

	public void setWidgetParameters(String widgetParameters) {
		this.widgetParameters = widgetParameters;
	}

	public Set<WidgetInstancePage> getWidgetInstancePages() {
		return this.widgetInstancePages;
	}

	public void setWidgetInstancePages(Set<WidgetInstancePage> widgetInstancePages) {
		this.widgetInstancePages = widgetInstancePages;
	}
	
}