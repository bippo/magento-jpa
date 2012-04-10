package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the core_layout_link database table.
 * 
 */
@Entity
@Table(name="core_layout_link")
public class CoreLayoutLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="layout_link_id")
	private int layoutLinkId;

	private String area;

	@Column(name="package")
	private String package_;

	private String theme;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to CoreLayoutUpdate
    @ManyToOne
	@JoinColumn(name="layout_update_id")
	private CoreLayoutUpdate coreLayoutUpdate;

    public CoreLayoutLink() {
    }

	public int getLayoutLinkId() {
		return this.layoutLinkId;
	}

	public void setLayoutLinkId(int layoutLinkId) {
		this.layoutLinkId = layoutLinkId;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPackage_() {
		return this.package_;
	}

	public void setPackage_(String package_) {
		this.package_ = package_;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public CoreLayoutUpdate getCoreLayoutUpdate() {
		return this.coreLayoutUpdate;
	}

	public void setCoreLayoutUpdate(CoreLayoutUpdate coreLayoutUpdate) {
		this.coreLayoutUpdate = coreLayoutUpdate;
	}
	
}