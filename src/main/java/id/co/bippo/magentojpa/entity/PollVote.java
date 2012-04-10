package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the poll_vote database table.
 * 
 */
@Entity
@Table(name="poll_vote")
public class PollVote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vote_id")
	private int voteId;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="ip_address")
	private BigInteger ipAddress;

	@Column(name="poll_id")
	private int pollId;

	@Column(name="vote_time")
	private Timestamp voteTime;

	//bi-directional many-to-one association to PollAnswer
    @ManyToOne
	@JoinColumn(name="poll_answer_id")
	private PollAnswer pollAnswer;

    public PollVote() {
    }

	public int getVoteId() {
		return this.voteId;
	}

	public void setVoteId(int voteId) {
		this.voteId = voteId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public BigInteger getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(BigInteger ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getPollId() {
		return this.pollId;
	}

	public void setPollId(int pollId) {
		this.pollId = pollId;
	}

	public Timestamp getVoteTime() {
		return this.voteTime;
	}

	public void setVoteTime(Timestamp voteTime) {
		this.voteTime = voteTime;
	}

	public PollAnswer getPollAnswer() {
		return this.pollAnswer;
	}

	public void setPollAnswer(PollAnswer pollAnswer) {
		this.pollAnswer = pollAnswer;
	}
	
}