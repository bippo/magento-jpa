package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the rating_option_vote database table.
 * 
 */
@Entity
@Table(name="rating_option_vote")
public class RatingOptionVote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vote_id")
	private String voteId;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="entity_pk_value")
	private BigInteger entityPkValue;

	private short percent;

	@Column(name="rating_id")
	private int ratingId;

	@Column(name="remote_ip")
	private String remoteIp;

	@Column(name="remote_ip_long")
	private BigInteger remoteIpLong;

	private short value;

	//bi-directional many-to-one association to RatingOption
    @ManyToOne
	@JoinColumn(name="option_id")
	private RatingOption ratingOption;

	//bi-directional many-to-one association to Review
    @ManyToOne
	@JoinColumn(name="review_id")
	private Review review;

    public RatingOptionVote() {
    }

	public String getVoteId() {
		return this.voteId;
	}

	public void setVoteId(String voteId) {
		this.voteId = voteId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public int getRatingId() {
		return this.ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public String getRemoteIp() {
		return this.remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	public BigInteger getRemoteIpLong() {
		return this.remoteIpLong;
	}

	public void setRemoteIpLong(BigInteger remoteIpLong) {
		this.remoteIpLong = remoteIpLong;
	}

	public short getValue() {
		return this.value;
	}

	public void setValue(short value) {
		this.value = value;
	}

	public RatingOption getRatingOption() {
		return this.ratingOption;
	}

	public void setRatingOption(RatingOption ratingOption) {
		this.ratingOption = ratingOption;
	}
	
	public Review getReview() {
		return this.review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	
}