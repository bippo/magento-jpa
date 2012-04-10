package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the index_process_event database table.
 * 
 */
@Entity
@Table(name="index_process_event")
public class IndexProcessEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IndexProcessEventPK id;

	private String status;

//	//bi-directional many-to-one association to IndexEvent
//    @ManyToOne
//	@JoinColumn(name="event_id")
//	private IndexEvent indexEvent;
//
//	//bi-directional many-to-one association to IndexProcess
//    @ManyToOne
//	@JoinColumn(name="process_id")
//	private IndexProcess indexProcess;

    public IndexProcessEvent() {
    }

	public IndexProcessEventPK getId() {
		return this.id;
	}

	public void setId(IndexProcessEventPK id) {
		this.id = id;
	}
	
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	public IndexEvent getIndexEvent() {
//		return this.indexEvent;
//	}
//
//	public void setIndexEvent(IndexEvent indexEvent) {
//		this.indexEvent = indexEvent;
//	}
//	
//	public IndexProcess getIndexProcess() {
//		return this.indexProcess;
//	}
//
//	public void setIndexProcess(IndexProcess indexProcess) {
//		this.indexProcess = indexProcess;
//	}
	
}