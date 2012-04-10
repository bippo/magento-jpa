package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the review database table.
 * 
 */
@Entity
@Table(name="review")
public class Review implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="review_id")
	private String reviewId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="entity_pk_value")
	private int entityPkValue;

	//bi-directional many-to-one association to RatingOptionVote
	@OneToMany(mappedBy="review")
	private Set<RatingOptionVote> ratingOptionVotes;

	//bi-directional many-to-one association to ReviewEntity
    @ManyToOne
	@JoinColumn(name="entity_id")
	private ReviewEntity reviewEntity;

	//bi-directional many-to-one association to ReviewStatus
    @ManyToOne
	@JoinColumn(name="status_id")
	private ReviewStatus reviewStatus;

	//bi-directional many-to-one association to ReviewDetail
	@OneToMany(mappedBy="review")
	private Set<ReviewDetail> reviewDetails;

	//bi-directional many-to-many association to CoreStore
	@ManyToMany(mappedBy="reviews")
	private Set<CoreStore> coreStores;

    public Review() {
    }

	public String getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getEntityPkValue() {
		return this.entityPkValue;
	}

	public void setEntityPkValue(int entityPkValue) {
		this.entityPkValue = entityPkValue;
	}

	public Set<RatingOptionVote> getRatingOptionVotes() {
		return this.ratingOptionVotes;
	}

	public void setRatingOptionVotes(Set<RatingOptionVote> ratingOptionVotes) {
		this.ratingOptionVotes = ratingOptionVotes;
	}
	
	public ReviewEntity getReviewEntity() {
		return this.reviewEntity;
	}

	public void setReviewEntity(ReviewEntity reviewEntity) {
		this.reviewEntity = reviewEntity;
	}
	
	public ReviewStatus getReviewStatus() {
		return this.reviewStatus;
	}

	public void setReviewStatus(ReviewStatus reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	
	public Set<ReviewDetail> getReviewDetails() {
		return this.reviewDetails;
	}

	public void setReviewDetails(Set<ReviewDetail> reviewDetails) {
		this.reviewDetails = reviewDetails;
	}
	
	public Set<CoreStore> getCoreStores() {
		return this.coreStores;
	}

	public void setCoreStores(Set<CoreStore> coreStores) {
		this.coreStores = coreStores;
	}
	
}