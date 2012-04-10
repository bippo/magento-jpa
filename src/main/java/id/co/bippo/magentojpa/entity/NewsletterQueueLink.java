package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the newsletter_queue_link database table.
 * 
 */
@Entity
@Table(name="newsletter_queue_link")
public class NewsletterQueueLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="queue_link_id")
	private int queueLinkId;

	@Column(name="letter_sent_at")
	private Timestamp letterSentAt;

	//bi-directional many-to-one association to NewsletterQueue
    @ManyToOne
	@JoinColumn(name="queue_id")
	private NewsletterQueue newsletterQueue;

	//bi-directional many-to-one association to NewsletterSubscriber
    @ManyToOne
	@JoinColumn(name="subscriber_id")
	private NewsletterSubscriber newsletterSubscriber;

    public NewsletterQueueLink() {
    }

	public int getQueueLinkId() {
		return this.queueLinkId;
	}

	public void setQueueLinkId(int queueLinkId) {
		this.queueLinkId = queueLinkId;
	}

	public Timestamp getLetterSentAt() {
		return this.letterSentAt;
	}

	public void setLetterSentAt(Timestamp letterSentAt) {
		this.letterSentAt = letterSentAt;
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