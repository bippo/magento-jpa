package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the adminnotification_inbox database table.
 * 
 */
@Entity
@Table(name="adminnotification_inbox")
public class AdminnotificationInbox implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="notification_id")
	private int notificationId;

	@Column(name="date_added")
	private Timestamp dateAdded;

    @Lob()
	private String description;

	@Column(name="is_read")
	private int isRead;

	@Column(name="is_remove")
	private int isRemove;

	private int severity;

	private String title;

	private String url;

    public AdminnotificationInbox() {
    }

	public int getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public Timestamp getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Timestamp dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIsRead() {
		return this.isRead;
	}

	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}

	public int getIsRemove() {
		return this.isRemove;
	}

	public void setIsRemove(int isRemove) {
		this.isRemove = isRemove;
	}

	public int getSeverity() {
		return this.severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}