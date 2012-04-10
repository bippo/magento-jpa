package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the review_entity_summary database table.
 * 
 */
@Entity
@Table(name="review_entity_summary")
public class ReviewEntitySummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="primary_id")
	private String primaryId;

	@Column(name="entity_pk_value")
	private BigInteger entityPkValue;

	@Column(name="entity_type")
	private short entityType;

	@Column(name="rating_summary")
	private short ratingSummary;

	@Column(name="reviews_count")
	private short reviewsCount;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public ReviewEntitySummary() {
    }

	public String getPrimaryId() {
		return this.primaryId;
	}

	public void setPrimaryId(String primaryId) {
		this.primaryId = primaryId;
	}

	public BigInteger getEntityPkValue() {
		return this.entityPkValue;
	}

	public void setEntityPkValue(BigInteger entityPkValue) {
		this.entityPkValue = entityPkValue;
	}

	public short getEntityType() {
		return this.entityType;
	}

	public void setEntityType(short entityType) {
		this.entityType = entityType;
	}

	public short getRatingSummary() {
		return this.ratingSummary;
	}

	public void setRatingSummary(short ratingSummary) {
		this.ratingSummary = ratingSummary;
	}

	public short getReviewsCount() {
		return this.reviewsCount;
	}

	public void setReviewsCount(short reviewsCount) {
		this.reviewsCount = reviewsCount;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}