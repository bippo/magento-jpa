package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the newsletter_template database table.
 * 
 */
@Entity
@Table(name="newsletter_template")
public class NewsletterTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="template_id")
	private int templateId;

	@Column(name="added_at")
	private Timestamp addedAt;

	@Column(name="modified_at")
	private Timestamp modifiedAt;

	@Column(name="template_actual")
	private int templateActual;

	@Column(name="template_code")
	private String templateCode;

	@Column(name="template_sender_email")
	private String templateSenderEmail;

	@Column(name="template_sender_name")
	private String templateSenderName;

    @Lob()
	@Column(name="template_styles")
	private String templateStyles;

	@Column(name="template_subject")
	private String templateSubject;

    @Lob()
	@Column(name="template_text")
	private String templateText;

    @Lob()
	@Column(name="template_text_preprocessed")
	private String templateTextPreprocessed;

	@Column(name="template_type")
	private int templateType;

	//bi-directional many-to-one association to NewsletterQueue
	@OneToMany(mappedBy="newsletterTemplate")
	private Set<NewsletterQueue> newsletterQueues;

    public NewsletterTemplate() {
    }

	public int getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}

	public Timestamp getAddedAt() {
		return this.addedAt;
	}

	public void setAddedAt(Timestamp addedAt) {
		this.addedAt = addedAt;
	}

	public Timestamp getModifiedAt() {
		return this.modifiedAt;
	}

	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public int getTemplateActual() {
		return this.templateActual;
	}

	public void setTemplateActual(int templateActual) {
		this.templateActual = templateActual;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateSenderEmail() {
		return this.templateSenderEmail;
	}

	public void setTemplateSenderEmail(String templateSenderEmail) {
		this.templateSenderEmail = templateSenderEmail;
	}

	public String getTemplateSenderName() {
		return this.templateSenderName;
	}

	public void setTemplateSenderName(String templateSenderName) {
		this.templateSenderName = templateSenderName;
	}

	public String getTemplateStyles() {
		return this.templateStyles;
	}

	public void setTemplateStyles(String templateStyles) {
		this.templateStyles = templateStyles;
	}

	public String getTemplateSubject() {
		return this.templateSubject;
	}

	public void setTemplateSubject(String templateSubject) {
		this.templateSubject = templateSubject;
	}

	public String getTemplateText() {
		return this.templateText;
	}

	public void setTemplateText(String templateText) {
		this.templateText = templateText;
	}

	public String getTemplateTextPreprocessed() {
		return this.templateTextPreprocessed;
	}

	public void setTemplateTextPreprocessed(String templateTextPreprocessed) {
		this.templateTextPreprocessed = templateTextPreprocessed;
	}

	public int getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(int templateType) {
		this.templateType = templateType;
	}

	public Set<NewsletterQueue> getNewsletterQueues() {
		return this.newsletterQueues;
	}

	public void setNewsletterQueues(Set<NewsletterQueue> newsletterQueues) {
		this.newsletterQueues = newsletterQueues;
	}
	
}