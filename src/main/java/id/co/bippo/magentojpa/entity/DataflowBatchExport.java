package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dataflow_batch_export database table.
 * 
 */
@Entity
@Table(name="dataflow_batch_export")
public class DataflowBatchExport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="batch_export_id")
	private String batchExportId;

    @Lob()
	@Column(name="batch_data")
	private String batchData;

	private int status;

	//bi-directional many-to-one association to DataflowBatch
    @ManyToOne
	@JoinColumn(name="batch_id")
	private DataflowBatch dataflowBatch;

    public DataflowBatchExport() {
    }

	public String getBatchExportId() {
		return this.batchExportId;
	}

	public void setBatchExportId(String batchExportId) {
		this.batchExportId = batchExportId;
	}

	public String getBatchData() {
		return this.batchData;
	}

	public void setBatchData(String batchData) {
		this.batchData = batchData;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public DataflowBatch getDataflowBatch() {
		return this.dataflowBatch;
	}

	public void setDataflowBatch(DataflowBatch dataflowBatch) {
		this.dataflowBatch = dataflowBatch;
	}
	
}