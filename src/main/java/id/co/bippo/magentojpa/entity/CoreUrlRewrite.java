package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the core_url_rewrite database table.
 * 
 */
@Entity
@Table(name="core_url_rewrite")
public class CoreUrlRewrite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="url_rewrite_id")
	private int urlRewriteId;

	private String description;

	@Column(name="id_path")
	private String idPath;

	@Column(name="is_system")
	private int isSystem;

	private String options;

	@Column(name="request_path")
	private String requestPath;

	@Column(name="target_path")
	private String targetPath;

	//bi-directional many-to-one association to CatalogCategoryEntity
    @ManyToOne
	@JoinColumn(name="category_id")
	private CatalogCategoryEntity catalogCategoryEntity;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public CoreUrlRewrite() {
    }

	public int getUrlRewriteId() {
		return this.urlRewriteId;
	}

	public void setUrlRewriteId(int urlRewriteId) {
		this.urlRewriteId = urlRewriteId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIdPath() {
		return this.idPath;
	}

	public void setIdPath(String idPath) {
		this.idPath = idPath;
	}

	public int getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(int isSystem) {
		this.isSystem = isSystem;
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getRequestPath() {
		return this.requestPath;
	}

	public void setRequestPath(String requestPath) {
		this.requestPath = requestPath;
	}

	public String getTargetPath() {
		return this.targetPath;
	}

	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}

	public CatalogCategoryEntity getCatalogCategoryEntity() {
		return this.catalogCategoryEntity;
	}

	public void setCatalogCategoryEntity(CatalogCategoryEntity catalogCategoryEntity) {
		this.catalogCategoryEntity = catalogCategoryEntity;
	}
	
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}