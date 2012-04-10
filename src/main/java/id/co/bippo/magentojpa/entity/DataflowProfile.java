package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the dataflow_profile database table.
 * 
 */
@Entity
@Table(name="dataflow_profile")
public class DataflowProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="profile_id")
	private int profileId;

    @Lob()
	@Column(name="actions_xml")
	private String actionsXml;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="data_transfer")
	private String dataTransfer;

	private String direction;

	@Column(name="entity_type")
	private String entityType;

    @Lob()
	@Column(name="gui_data")
	private String guiData;

	private String name;

	@Column(name="store_id")
	private int storeId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to DataflowBatch
	@OneToMany(mappedBy="dataflowProfile")
	private Set<DataflowBatch> dataflowBatches;

	//bi-directional many-to-one association to DataflowProfileHistory
	@OneToMany(mappedBy="dataflowProfile")
	private Set<DataflowProfileHistory> dataflowProfileHistories;

    public DataflowProfile() {
    }

	public int getProfileId() {
		return this.profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getActionsXml() {
		return this.actionsXml;
	}

	public void setActionsXml(String actionsXml) {
		this.actionsXml = actionsXml;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDataTransfer() {
		return this.dataTransfer;
	}

	public void setDataTransfer(String dataTransfer) {
		this.dataTransfer = dataTransfer;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getGuiData() {
		return this.guiData;
	}

	public void setGuiData(String guiData) {
		this.guiData = guiData;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set<DataflowBatch> getDataflowBatches() {
		return this.dataflowBatches;
	}

	public void setDataflowBatches(Set<DataflowBatch> dataflowBatches) {
		this.dataflowBatches = dataflowBatches;
	}
	
	public Set<DataflowProfileHistory> getDataflowProfileHistories() {
		return this.dataflowProfileHistories;
	}

	public void setDataflowProfileHistories(Set<DataflowProfileHistory> dataflowProfileHistories) {
		this.dataflowProfileHistories = dataflowProfileHistories;
	}
	
}