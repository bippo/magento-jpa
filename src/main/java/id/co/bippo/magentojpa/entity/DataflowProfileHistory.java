package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the dataflow_profile_history database table.
 * 
 */
@Entity
@Table(name="dataflow_profile_history")
public class DataflowProfileHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="history_id")
	private int historyId;

	@Column(name="action_code")
	private String actionCode;

	@Column(name="performed_at")
	private Timestamp performedAt;

	@Column(name="user_id")
	private int userId;

	//bi-directional many-to-one association to DataflowProfile
    @ManyToOne
	@JoinColumn(name="profile_id")
	private DataflowProfile dataflowProfile;

    public DataflowProfileHistory() {
    }

	public int getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public Timestamp getPerformedAt() {
		return this.performedAt;
	}

	public void setPerformedAt(Timestamp performedAt) {
		this.performedAt = performedAt;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public DataflowProfile getDataflowProfile() {
		return this.dataflowProfile;
	}

	public void setDataflowProfile(DataflowProfile dataflowProfile) {
		this.dataflowProfile = dataflowProfile;
	}
	
}