package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the xmlconnect_queue database table.
 * 
 */
@Entity
@Table(name="xmlconnect_queue")
public class XmlconnectQueue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="queue_id")
	private int queueId;

    @Lob()
	private String content;

	@Column(name="create_time")
	private Timestamp createTime;

	@Column(name="exec_time")
	private Timestamp execTime;

	@Column(name="message_title")
	private String messageTitle;

	@Column(name="push_title")
	private String pushTitle;

	private int status;

	private String type;

	//bi-directional many-to-one association to XmlconnectNotificationTemplate
    @ManyToOne
	@JoinColumn(name="template_id")
	private XmlconnectNotificationTemplate xmlconnectNotificationTemplate;

    public XmlconnectQueue() {
    }

	public int getQueueId() {
		return this.queueId;
	}

	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getExecTime() {
		return this.execTime;
	}

	public void setExecTime(Timestamp execTime) {
		this.execTime = execTime;
	}

	public String getMessageTitle() {
		return this.messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getPushTitle() {
		return this.pushTitle;
	}

	public void setPushTitle(String pushTitle) {
		this.pushTitle = pushTitle;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public XmlconnectNotificationTemplate getXmlconnectNotificationTemplate() {
		return this.xmlconnectNotificationTemplate;
	}

	public void setXmlconnectNotificationTemplate(XmlconnectNotificationTemplate xmlconnectNotificationTemplate) {
		this.xmlconnectNotificationTemplate = xmlconnectNotificationTemplate;
	}
	
}