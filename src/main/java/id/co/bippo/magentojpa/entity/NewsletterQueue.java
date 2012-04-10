package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the newsletter_queue database table.
 * 
 */
@Entity
@Table(name="newsletter_queue")
public class NewsletterQueue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="queue_id")
	private int queueId;

	@Column(name="newsletter_sender_email")
	private String newsletterSenderEmail;

	@Column(name="newsletter_sender_name")
	private String newsletterSenderName;

    @Lob()
	@Column(name="newsletter_styles")
	private String newsletterStyles;

	@Column(name="newsletter_subject")
	private String newsletterSubject;

    @Lob()
	@Column(name="newsletter_text")
	private String newsletterText;

	@Column(name="newsletter_type")
	private int newsletterType;

	@Column(name="queue_finish_at")
	private Timestamp queueFinishAt;

	@Column(name="queue_start_at")
	private Timestamp queueStartAt;

	@Column(name="queue_status")
	private int queueStatus;

	//bi-directional many-to-one association to NewsletterProblem
	@OneToMany(mappedBy="newsletterQueue")
	private Set<NewsletterProblem> newsletterProblems;

	//bi-directional many-to-one association to NewsletterTemplate
    @ManyToOne
	@JoinColumn(name="template_id")
	private NewsletterTemplate newsletterTemplate;

	//bi-directional many-to-one association to NewsletterQueueLink
	@OneToMany(mappedBy="newsletterQueue")
	private Set<NewsletterQueueLink> newsletterQueueLinks;

	//bi-directional many-to-many association to CoreStore
    @ManyToMany
	@JoinTable(
		name="newsletter_queue_store_link"
		, joinColumns={
			@JoinColumn(name="queue_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="store_id")
			}
		)
	private Set<CoreStore> coreStores;

    public NewsletterQueue() {
    }

	public int getQueueId() {
		return this.queueId;
	}

	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}

	public String getNewsletterSenderEmail() {
		return this.newsletterSenderEmail;
	}

	public void setNewsletterSenderEmail(String newsletterSenderEmail) {
		this.newsletterSenderEmail = newsletterSenderEmail;
	}

	public String getNewsletterSenderName() {
		return this.newsletterSenderName;
	}

	public void setNewsletterSenderName(String newsletterSenderName) {
		this.newsletterSenderName = newsletterSenderName;
	}

	public String getNewsletterStyles() {
		return this.newsletterStyles;
	}

	public void setNewsletterStyles(String newsletterStyles) {
		this.newsletterStyles = newsletterStyles;
	}

	public String getNewsletterSubject() {
		return this.newsletterSubject;
	}

	public void setNewsletterSubject(String newsletterSubject) {
		this.newsletterSubject = newsletterSubject;
	}

	public String getNewsletterText() {
		return this.newsletterText;
	}

	public void setNewsletterText(String newsletterText) {
		this.newsletterText = newsletterText;
	}

	public int getNewsletterType() {
		return this.newsletterType;
	}

	public void setNewsletterType(int newsletterType) {
		this.newsletterType = newsletterType;
	}

	public Timestamp getQueueFinishAt() {
		return this.queueFinishAt;
	}

	public void setQueueFinishAt(Timestamp queueFinishAt) {
		this.queueFinishAt = queueFinishAt;
	}

	public Timestamp getQueueStartAt() {
		return this.queueStartAt;
	}

	public void setQueueStartAt(Timestamp queueStartAt) {
		this.queueStartAt = queueStartAt;
	}

	public int getQueueStatus() {
		return this.queueStatus;
	}

	public void setQueueStatus(int queueStatus) {
		this.queueStatus = queueStatus;
	}

	public Set<NewsletterProblem> getNewsletterProblems() {
		return this.newsletterProblems;
	}

	public void setNewsletterProblems(Set<NewsletterProblem> newsletterProblems) {
		this.newsletterProblems = newsletterProblems;
	}
	
	public NewsletterTemplate getNewsletterTemplate() {
		return this.newsletterTemplate;
	}

	public void setNewsletterTemplate(NewsletterTemplate newsletterTemplate) {
		this.newsletterTemplate = newsletterTemplate;
	}
	
	public Set<NewsletterQueueLink> getNewsletterQueueLinks() {
		return this.newsletterQueueLinks;
	}

	public void setNewsletterQueueLinks(Set<NewsletterQueueLink> newsletterQueueLinks) {
		this.newsletterQueueLinks = newsletterQueueLinks;
	}
	
	public Set<CoreStore> getCoreStores() {
		return this.coreStores;
	}

	public void setCoreStores(Set<CoreStore> coreStores) {
		this.coreStores = coreStores;
	}
	
}