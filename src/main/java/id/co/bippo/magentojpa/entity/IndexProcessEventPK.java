package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the index_process_event database table.
 * 
 */
@Embeddable
public class IndexProcessEventPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="process_id")
	private int processId;

	@Column(name="event_id")
	private String eventId;

    public IndexProcessEventPK() {
    }
	public int getProcessId() {
		return this.processId;
	}
	public void setProcessId(int processId) {
		this.processId = processId;
	}
	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IndexProcessEventPK)) {
			return false;
		}
		IndexProcessEventPK castOther = (IndexProcessEventPK)other;
		return 
			(this.processId == castOther.processId)
			&& this.eventId.equals(castOther.eventId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.processId;
		hash = hash * prime + this.eventId.hashCode();
		
		return hash;
    }
}