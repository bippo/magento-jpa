package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the tag database table.
 * 
 */
@Entity
@Table(name="tag")
public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tag_id")
	private int tagId;

	private String name;

	private short status;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="first_customer_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="first_store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to TagProperty
	@OneToMany(mappedBy="tag")
	private Set<TagProperty> tagProperties;

	//bi-directional many-to-one association to TagRelation
	@OneToMany(mappedBy="tag")
	private Set<TagRelation> tagRelations;

	//bi-directional many-to-one association to TagSummary
	@OneToMany(mappedBy="tag")
	private Set<TagSummary> tagSummaries;

    public Tag() {
    }

	public int getTagId() {
		return this.tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public CustomerEntity getCustomerEntity() {
		return this.customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<TagProperty> getTagProperties() {
		return this.tagProperties;
	}

	public void setTagProperties(Set<TagProperty> tagProperties) {
		this.tagProperties = tagProperties;
	}
	
	public Set<TagRelation> getTagRelations() {
		return this.tagRelations;
	}

	public void setTagRelations(Set<TagRelation> tagRelations) {
		this.tagRelations = tagRelations;
	}
	
	public Set<TagSummary> getTagSummaries() {
		return this.tagSummaries;
	}

	public void setTagSummaries(Set<TagSummary> tagSummaries) {
		this.tagSummaries = tagSummaries;
	}
	
}