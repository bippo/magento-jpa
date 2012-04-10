package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the xmlconnect_notification_template database table.
 * 
 */
@Entity
@Table(name="xmlconnect_notification_template")
public class XmlconnectNotificationTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="template_id")
	private int templateId;

    @Lob()
	private String content;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="message_title")
	private String messageTitle;

	@Column(name="modified_at")
	private Timestamp modifiedAt;

	private String name;

	@Column(name="push_title")
	private String pushTitle;

	//bi-directional many-to-one association to XmlconnectApplication
    @ManyToOne
	@JoinColumn(name="application_id")
	private XmlconnectApplication xmlconnectApplication;

	//bi-directional many-to-one association to XmlconnectQueue
	@OneToMany(mappedBy="xmlconnectNotificationTemplate")
	private Set<XmlconnectQueue> xmlconnectQueues;

    public XmlconnectNotificationTemplate() {
    }

	public int getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getMessageTitle() {
		return this.messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public Timestamp getModifiedAt() {
		return this.modifiedAt;
	}

	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPushTitle() {
		return this.pushTitle;
	}

	public void setPushTitle(String pushTitle) {
		this.pushTitle = pushTitle;
	}

	public XmlconnectApplication getXmlconnectApplication() {
		return this.xmlconnectApplication;
	}

	public void setXmlconnectApplication(XmlconnectApplication xmlconnectApplication) {
		this.xmlconnectApplication = xmlconnectApplication;
	}
	
	public Set<XmlconnectQueue> getXmlconnectQueues() {
		return this.xmlconnectQueues;
	}

	public void setXmlconnectQueues(Set<XmlconnectQueue> xmlconnectQueues) {
		this.xmlconnectQueues = xmlconnectQueues;
	}
	
}