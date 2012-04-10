package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tag_relation database table.
 * 
 */
@Entity
@Table(name="tag_relation")
public class TagRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tag_relation_id")
	private int tagRelationId;

	private int active;

	@Column(name="created_at")
	private Timestamp createdAt;

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

	//bi-directional many-to-one association to Tag
    @ManyToOne
	@JoinColumn(name="tag_id")
	private Tag tag;

    public TagRelation() {
    }

	public int getTagRelationId() {
		return this.tagRelationId;
	}

	public void setTagRelationId(int tagRelationId) {
		this.tagRelationId = tagRelationId;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
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
	
	public Tag getTag() {
		return this.tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
}