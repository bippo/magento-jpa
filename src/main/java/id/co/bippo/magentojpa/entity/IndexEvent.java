package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the index_event database table.
 * 
 */
@Entity
@Table(name="index_event")
public class IndexEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="event_id")
	private String eventId;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String entity;

	@Column(name="entity_pk")
	private BigInteger entityPk;

    @Lob()
	@Column(name="new_data")
	private String newData;

    @Lob()
	@Column(name="old_data")
	private String oldData;

	private String type;

	//bi-directional many-to-one association to IndexProcessEvent
	@OneToMany(mappedBy="indexEvent")
	private Set<IndexProcessEvent> indexProcessEvents;

    public IndexEvent() {
    }

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getEntity() {
		return this.entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public BigInteger getEntityPk() {
		return this.entityPk;
	}

	public void setEntityPk(BigInteger entityPk) {
		this.entityPk = entityPk;
	}

	public String getNewData() {
		return this.newData;
	}

	public void setNewData(String newData) {
		this.newData = newData;
	}

	public String getOldData() {
		return this.oldData;
	}

	public void setOldData(String oldData) {
		this.oldData = oldData;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<IndexProcessEvent> getIndexProcessEvents() {
		return this.indexProcessEvents;
	}

	public void setIndexProcessEvents(Set<IndexProcessEvent> indexProcessEvents) {
		this.indexProcessEvents = indexProcessEvents;
	}
	
}