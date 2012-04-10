package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the report_event database table.
 * 
 */
@Entity
@Table(name="report_event")
public class ReportEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="event_id")
	private String eventId;

	@Column(name="logged_at")
	private Timestamp loggedAt;

	@Column(name="object_id")
	private int objectId;

	@Column(name="subject_id")
	private int subjectId;

	private int subtype;

	//bi-directional many-to-one association to ReportEventType
    @ManyToOne
	@JoinColumn(name="event_type_id")
	private ReportEventType reportEventType;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public ReportEvent() {
    }

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Timestamp getLoggedAt() {
		return this.loggedAt;
	}

	public void setLoggedAt(Timestamp loggedAt) {
		this.loggedAt = loggedAt;
	}

	public int getObjectId() {
		return this.objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	public int getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getSubtype() {
		return this.subtype;
	}

	public void setSubtype(int subtype) {
		this.subtype = subtype;
	}

	public ReportEventType getReportEventType() {
		return this.reportEventType;
	}

	public void setReportEventType(ReportEventType reportEventType) {
		this.reportEventType = reportEventType;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}