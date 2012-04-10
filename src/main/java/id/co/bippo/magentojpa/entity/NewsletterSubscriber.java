package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the newsletter_subscriber database table.
 * 
 */
@Entity
@Table(name="newsletter_subscriber")
public class NewsletterSubscriber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subscriber_id")
	private int subscriberId;

	@Column(name="change_status_at")
	private Timestamp changeStatusAt;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="subscriber_confirm_code")
	private String subscriberConfirmCode;

	@Column(name="subscriber_email")
	private String subscriberEmail;

	@Column(name="subscriber_status")
	private int subscriberStatus;

	//bi-directional many-to-one association to NewsletterProblem
	@OneToMany(mappedBy="newsletterSubscriber")
	private Set<NewsletterProblem> newsletterProblems;

	//bi-directional many-to-one association to NewsletterQueueLink
	@OneToMany(mappedBy="newsletterSubscriber")
	private Set<NewsletterQueueLink> newsletterQueueLinks;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public NewsletterSubscriber() {
    }

	public int getSubscriberId() {
		return this.subscriberId;
	}

	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}

	public Timestamp getChangeStatusAt() {
		return this.changeStatusAt;
	}

	public void setChangeStatusAt(Timestamp changeStatusAt) {
		this.changeStatusAt = changeStatusAt;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getSubscriberConfirmCode() {
		return this.subscriberConfirmCode;
	}

	public void setSubscriberConfirmCode(String subscriberConfirmCode) {
		this.subscriberConfirmCode = subscriberConfirmCode;
	}

	public String getSubscriberEmail() {
		return this.subscriberEmail;
	}

	public void setSubscriberEmail(String subscriberEmail) {
		this.subscriberEmail = subscriberEmail;
	}

	public int getSubscriberStatus() {
		return this.subscriberStatus;
	}

	public void setSubscriberStatus(int subscriberStatus) {
		this.subscriberStatus = subscriberStatus;
	}

	public Set<NewsletterProblem> getNewsletterProblems() {
		return this.newsletterProblems;
	}

	public void setNewsletterProblems(Set<NewsletterProblem> newsletterProblems) {
		this.newsletterProblems = newsletterProblems;
	}
	
	public Set<NewsletterQueueLink> getNewsletterQueueLinks() {
		return this.newsletterQueueLinks;
	}

	public void setNewsletterQueueLinks(Set<NewsletterQueueLink> newsletterQueueLinks) {
		this.newsletterQueueLinks = newsletterQueueLinks;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}