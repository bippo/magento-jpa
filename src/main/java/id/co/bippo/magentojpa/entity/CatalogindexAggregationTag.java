package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the catalogindex_aggregation_tag database table.
 * 
 */
@Entity
@Table(name="catalogindex_aggregation_tag")
public class CatalogindexAggregationTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tag_id")
	private int tagId;

	@Column(name="tag_code")
	private String tagCode;

	//bi-directional many-to-many association to CatalogindexAggregation
    @ManyToMany
	@JoinTable(
		name="catalogindex_aggregation_to_tag"
		, joinColumns={
			@JoinColumn(name="tag_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="aggregation_id")
			}
		)
	private Set<CatalogindexAggregation> catalogindexAggregations;

    public CatalogindexAggregationTag() {
    }

	public int getTagId() {
		return this.tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getTagCode() {
		return this.tagCode;
	}

	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public Set<CatalogindexAggregation> getCatalogindexAggregations() {
		return this.catalogindexAggregations;
	}

	public void setCatalogindexAggregations(Set<CatalogindexAggregation> catalogindexAggregations) {
		this.catalogindexAggregations = catalogindexAggregations;
	}
	
}