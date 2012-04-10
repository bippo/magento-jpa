package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the dataflow_batch database table.
 * 
 */
@Entity
@Table(name="dataflow_batch")
public class DataflowBatch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="batch_id")
	private int batchId;

	private String adapter;

	@Column(name="created_at")
	private Timestamp createdAt;

    @Lob()
	private String params;

	//bi-directional many-to-one association to DataflowProfile
    @ManyToOne
	@JoinColumn(name="profile_id")
	private DataflowProfile dataflowProfile;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to DataflowBatchExport
	@OneToMany(mappedBy="dataflowBatch")
	private Set<DataflowBatchExport> dataflowBatchExports;

	//bi-directional many-to-one association to DataflowBatchImport
	@OneToMany(mappedBy="dataflowBatch")
	private Set<DataflowBatchImport> dataflowBatchImports;

    public DataflowBatch() {
    }

	public int getBatchId() {
		return this.batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getAdapter() {
		return this.adapter;
	}

	public void setAdapter(String adapter) {
		this.adapter = adapter;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public DataflowProfile getDataflowProfile() {
		return this.dataflowProfile;
	}

	public void setDataflowProfile(DataflowProfile dataflowProfile) {
		this.dataflowProfile = dataflowProfile;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<DataflowBatchExport> getDataflowBatchExports() {
		return this.dataflowBatchExports;
	}

	public void setDataflowBatchExports(Set<DataflowBatchExport> dataflowBatchExports) {
		this.dataflowBatchExports = dataflowBatchExports;
	}
	
	public Set<DataflowBatchImport> getDataflowBatchImports() {
		return this.dataflowBatchImports;
	}

	public void setDataflowBatchImports(Set<DataflowBatchImport> dataflowBatchImports) {
		this.dataflowBatchImports = dataflowBatchImports;
	}
	
}