package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the core_store_group database table.
 * 
 */
@Entity
@Table(name="core_store_group")
public class CoreStoreGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="group_id")
	private int groupId;

	@Column(name="default_store_id")
	private int defaultStoreId;

	private String name;

	@Column(name="root_category_id")
	private int rootCategoryId;

	//bi-directional many-to-one association to CoreStore
	@OneToMany(mappedBy="coreStoreGroup")
	private Set<CoreStore> coreStores;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

    public CoreStoreGroup() {
    }

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getDefaultStoreId() {
		return this.defaultStoreId;
	}

	public void setDefaultStoreId(int defaultStoreId) {
		this.defaultStoreId = defaultStoreId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRootCategoryId() {
		return this.rootCategoryId;
	}

	public void setRootCategoryId(int rootCategoryId) {
		this.rootCategoryId = rootCategoryId;
	}

	public Set<CoreStore> getCoreStores() {
		return this.coreStores;
	}

	public void setCoreStores(Set<CoreStore> coreStores) {
		this.coreStores = coreStores;
	}
	
	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
}