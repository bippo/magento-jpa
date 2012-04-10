package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the report_viewed_product_index database table.
 * 
 */
@Entity
@Table(name="report_viewed_product_index")
public class ReportViewedProductIndex implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="index_id")
	private String indexId;

	@Column(name="added_at")
	private Timestamp addedAt;

	@Column(name="visitor_id")
	private int visitorId;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public ReportViewedProductIndex() {
    }

	public String getIndexId() {
		return this.indexId;
	}

	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}

	public Timestamp getAddedAt() {
		return this.addedAt;
	}

	public void setAddedAt(Timestamp addedAt) {
		this.addedAt = addedAt;
	}

	public int getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	public CustomerEntity getCustomerEntity() {
		return this.customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
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