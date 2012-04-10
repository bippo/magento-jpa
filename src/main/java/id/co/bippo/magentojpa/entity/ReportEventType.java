package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the report_event_types database table.
 * 
 */
@Entity
@Table(name="report_event_types")
public class ReportEventType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="event_type_id")
	private int eventTypeId;

	@Column(name="customer_login")
	private int customerLogin;

	@Column(name="event_name")
	private String eventName;

	//bi-directional many-to-one association to ReportEvent
	@OneToMany(mappedBy="reportEventType")
	private Set<ReportEvent> reportEvents;

    public ReportEventType() {
    }

	public int getEventTypeId() {
		return this.eventTypeId;
	}

	public void setEventTypeId(int eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public int getCustomerLogin() {
		return this.customerLogin;
	}

	public void setCustomerLogin(int customerLogin) {
		this.customerLogin = customerLogin;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Set<ReportEvent> getReportEvents() {
		return this.reportEvents;
	}

	public void setReportEvents(Set<ReportEvent> reportEvents) {
		this.reportEvents = reportEvents;
	}
	
}