package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the catalogindex_aggregation database table.
 * 
 */
@Entity
@Table(name="catalogindex_aggregation")
public class CatalogindexAggregation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="aggregation_id")
	private int aggregationId;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date createdAt;

    @Lob()
	private String data;

	private String key;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-many association to CatalogindexAggregationTag
	@ManyToMany(mappedBy="catalogindexAggregations")
	private Set<CatalogindexAggregationTag> catalogindexAggregationTags;

    public CatalogindexAggregation() {
    }

	public int getAggregationId() {
		return this.aggregationId;
	}

	public void setAggregationId(int aggregationId) {
		this.aggregationId = aggregationId;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<CatalogindexAggregationTag> getCatalogindexAggregationTags() {
		return this.catalogindexAggregationTags;
	}

	public void setCatalogindexAggregationTags(Set<CatalogindexAggregationTag> catalogindexAggregationTags) {
		this.catalogindexAggregationTags = catalogindexAggregationTags;
	}
	
}