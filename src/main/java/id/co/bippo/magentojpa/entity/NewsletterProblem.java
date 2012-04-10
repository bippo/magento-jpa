package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the newsletter_problem database table.
 * 
 */
@Entity
@Table(name="newsletter_problem")
public class NewsletterProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="problem_id")
	private int problemId;

	@Column(name="problem_error_code")
	private int problemErrorCode;

	@Column(name="problem_error_text")
	private String problemErrorText;

	//bi-directional many-to-one association to NewsletterQueue
    @ManyToOne
	@JoinColumn(name="queue_id")
	private NewsletterQueue newsletterQueue;

	//bi-directional many-to-one association to NewsletterSubscriber
    @ManyToOne
	@JoinColumn(name="subscriber_id")
	private NewsletterSubscriber newsletterSubscriber;

    public NewsletterProblem() {
    }

	public int getProblemId() {
		return this.problemId;
	}

	public void setProblemId(int problemId) {
		this.problemId = problemId;
	}

	public int getProblemErrorCode() {
		return this.problemErrorCode;
	}

	public void setProblemErrorCode(int problemErrorCode) {
		this.problemErrorCode = problemErrorCode;
	}

	public String getProblemErrorText() {
		return this.problemErrorText;
	}

	public void setProblemErrorText(String problemErrorText) {
		this.problemErrorText = problemErrorText;
	}

	public NewsletterQueue getNewsletterQueue() {
		return this.newsletterQueue;
	}

	public void setNewsletterQueue(NewsletterQueue newsletterQueue) {
		this.newsletterQueue = newsletterQueue;
	}
	
	public NewsletterSubscriber getNewsletterSubscriber() {
		return this.newsletterSubscriber;
	}

	public void setNewsletterSubscriber(NewsletterSubscriber newsletterSubscriber) {
		this.newsletterSubscriber = newsletterSubscriber;
	}
	
}