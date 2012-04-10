package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the index_process database table.
 * 
 */
@Entity
@Table(name="index_process")
public class IndexProcess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="process_id")
	private int processId;

	@Column(name="ended_at")
	private Timestamp endedAt;

	@Column(name="indexer_code")
	private String indexerCode;

	private String mode;

	@Column(name="started_at")
	private Timestamp startedAt;

	private String status;

//	//bi-directional many-to-one association to IndexProcessEvent
//	@OneToMany(mappedBy="indexProcess")
//	private Set<IndexProcessEvent> indexProcessEvents;

    public IndexProcess() {
    }

	public int getProcessId() {
		return this.processId;
	}

	public void setProcessId(int processId) {
		this.processId = processId;
	}

	public Timestamp getEndedAt() {
		return this.endedAt;
	}

	public void setEndedAt(Timestamp endedAt) {
		this.endedAt = endedAt;
	}

	public String getIndexerCode() {
		return this.indexerCode;
	}

	public void setIndexerCode(String indexerCode) {
		this.indexerCode = indexerCode;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Timestamp getStartedAt() {
		return this.startedAt;
	}

	public void setStartedAt(Timestamp startedAt) {
		this.startedAt = startedAt;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	public Set<IndexProcessEvent> getIndexProcessEvents() {
//		return this.indexProcessEvents;
//	}
//
//	public void setIndexProcessEvents(Set<IndexProcessEvent> indexProcessEvents) {
//		this.indexProcessEvents = indexProcessEvents;
//	}
	
}