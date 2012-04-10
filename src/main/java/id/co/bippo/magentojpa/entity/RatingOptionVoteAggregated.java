package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the rating_option_vote_aggregated database table.
 * 
 */
@Entity
@Table(name="rating_option_vote_aggregated")
public class RatingOptionVoteAggregated implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="primary_id")
	private int primaryId;

	@Column(name="entity_pk_value")
	private BigInteger entityPkValue;

	private short percent;

	@Column(name="percent_approved")
	private short percentApproved;

	@Column(name="vote_count")
	private int voteCount;

	@Column(name="vote_value_sum")
	private int voteValueSum;

	//bi-directional many-to-one association to Rating
    @ManyToOne
	@JoinColumn(name="rating_id")
	private Rating rating;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public RatingOptionVoteAggregated() {
    }

	public int getPrimaryId() {
		return this.primaryId;
	}

	public void setPrimaryId(int primaryId) {
		this.primaryId = primaryId;
	}

	public BigInteger getEntityPkValue() {
		return this.entityPkValue;
	}

	public void setEntityPkValue(BigInteger entityPkValue) {
		this.entityPkValue = entityPkValue;
	}

	public short getPercent() {
		return this.percent;
	}

	public void setPercent(short percent) {
		this.percent = percent;
	}

	public short getPercentApproved() {
		return this.percentApproved;
	}

	public void setPercentApproved(short percentApproved) {
		this.percentApproved = percentApproved;
	}

	public int getVoteCount() {
		return this.voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	public int getVoteValueSum() {
		return this.voteValueSum;
	}

	public void setVoteValueSum(int voteValueSum) {
		this.voteValueSum = voteValueSum;
	}

	public Rating getRating() {
		return this.rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}