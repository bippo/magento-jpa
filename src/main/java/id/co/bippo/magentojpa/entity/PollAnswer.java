package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the poll_answer database table.
 * 
 */
@Entity
@Table(name="poll_answer")
public class PollAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="answer_id")
	private int answerId;

	@Column(name="answer_order")
	private short answerOrder;

	@Column(name="answer_title")
	private String answerTitle;

	@Column(name="votes_count")
	private int votesCount;

	//bi-directional many-to-one association to Poll
    @ManyToOne
	@JoinColumn(name="poll_id")
	private Poll poll;

	//bi-directional many-to-one association to PollVote
	@OneToMany(mappedBy="pollAnswer")
	private Set<PollVote> pollVotes;

    public PollAnswer() {
    }

	public int getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public short getAnswerOrder() {
		return this.answerOrder;
	}

	public void setAnswerOrder(short answerOrder) {
		this.answerOrder = answerOrder;
	}

	public String getAnswerTitle() {
		return this.answerTitle;
	}

	public void setAnswerTitle(String answerTitle) {
		this.answerTitle = answerTitle;
	}

	public int getVotesCount() {
		return this.votesCount;
	}

	public void setVotesCount(int votesCount) {
		this.votesCount = votesCount;
	}

	public Poll getPoll() {
		return this.poll;
	}

	public void setPoll(Poll poll) {
		this.poll = poll;
	}
	
	public Set<PollVote> getPollVotes() {
		return this.pollVotes;
	}

	public void setPollVotes(Set<PollVote> pollVotes) {
		this.pollVotes = pollVotes;
	}
	
}