package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the poll database table.
 * 
 */
@Entity
@Table(name="poll")
public class Poll implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="poll_id")
	private int pollId;

	private short active;

	@Column(name="answers_display")
	private short answersDisplay;

	private short closed;

	@Column(name="date_closed")
	private Timestamp dateClosed;

	@Column(name="date_posted")
	private Timestamp datePosted;

	@Column(name="poll_title")
	private String pollTitle;

	@Column(name="votes_count")
	private int votesCount;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to PollAnswer
	@OneToMany(mappedBy="poll")
	private Set<PollAnswer> pollAnswers;

	//bi-directional many-to-many association to CoreStore
	@ManyToMany(mappedBy="polls2")
	private Set<CoreStore> coreStores;

    public Poll() {
    }

	public int getPollId() {
		return this.pollId;
	}

	public void setPollId(int pollId) {
		this.pollId = pollId;
	}

	public short getActive() {
		return this.active;
	}

	public void setActive(short active) {
		this.active = active;
	}

	public short getAnswersDisplay() {
		return this.answersDisplay;
	}

	public void setAnswersDisplay(short answersDisplay) {
		this.answersDisplay = answersDisplay;
	}

	public short getClosed() {
		return this.closed;
	}

	public void setClosed(short closed) {
		this.closed = closed;
	}

	public Timestamp getDateClosed() {
		return this.dateClosed;
	}

	public void setDateClosed(Timestamp dateClosed) {
		this.dateClosed = dateClosed;
	}

	public Timestamp getDatePosted() {
		return this.datePosted;
	}

	public void setDatePosted(Timestamp datePosted) {
		this.datePosted = datePosted;
	}

	public String getPollTitle() {
		return this.pollTitle;
	}

	public void setPollTitle(String pollTitle) {
		this.pollTitle = pollTitle;
	}

	public int getVotesCount() {
		return this.votesCount;
	}

	public void setVotesCount(int votesCount) {
		this.votesCount = votesCount;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<PollAnswer> getPollAnswers() {
		return this.pollAnswers;
	}

	public void setPollAnswers(Set<PollAnswer> pollAnswers) {
		this.pollAnswers = pollAnswers;
	}
	
	public Set<CoreStore> getCoreStores() {
		return this.coreStores;
	}

	public void setCoreStores(Set<CoreStore> coreStores) {
		this.coreStores = coreStores;
	}
	
}