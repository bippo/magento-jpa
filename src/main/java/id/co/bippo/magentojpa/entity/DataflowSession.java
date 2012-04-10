package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the dataflow_session database table.
 * 
 */
@Entity
@Table(name="dataflow_session")
public class DataflowSession implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="session_id")
	private int sessionId;

	private String comment;

	@Column(name="created_date")
	private Timestamp createdDate;

	private String direction;

	private String file;

	private String type;

	@Column(name="user_id")
	private int userId;

	//bi-directional many-to-one association to DataflowImportData
	@OneToMany(mappedBy="dataflowSession")
	private Set<DataflowImportData> dataflowImportData;

    public DataflowSession() {
    }

	public int getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Set<DataflowImportData> getDataflowImportData() {
		return this.dataflowImportData;
	}

	public void setDataflowImportData(Set<DataflowImportData> dataflowImportData) {
		this.dataflowImportData = dataflowImportData;
	}
	
}