package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the core_email_template database table.
 * 
 */
@Entity
@Table(name="core_email_template")
public class CoreEmailTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="template_id")
	private int templateId;

	@Column(name="added_at")
	private Timestamp addedAt;

	@Column(name="modified_at")
	private Timestamp modifiedAt;

	@Column(name="orig_template_code")
	private String origTemplateCode;

    @Lob()
	@Column(name="orig_template_variables")
	private String origTemplateVariables;

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

	@Column(name="template_type")
	private int templateType;

    public CoreEmailTemplate() {
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

	public String getOrigTemplateCode() {
		return this.origTemplateCode;
	}

	public void setOrigTemplateCode(String origTemplateCode) {
		this.origTemplateCode = origTemplateCode;
	}

	public String getOrigTemplateVariables() {
		return this.origTemplateVariables;
	}

	public void setOrigTemplateVariables(String origTemplateVariables) {
		this.origTemplateVariables = origTemplateVariables;
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

	public int getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(int templateType) {
		this.templateType = templateType;
	}

}