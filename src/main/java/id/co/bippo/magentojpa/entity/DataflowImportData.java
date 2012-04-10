package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dataflow_import_data database table.
 * 
 */
@Entity
@Table(name="dataflow_import_data")
public class DataflowImportData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="import_id")
	private int importId;

	@Column(name="serial_number")
	private int serialNumber;

	private int status;

    @Lob()
	private String value;

	//bi-directional many-to-one association to DataflowSession
    @ManyToOne
	@JoinColumn(name="session_id")
	private DataflowSession dataflowSession;

    public DataflowImportData() {
    }

	public int getImportId() {
		return this.importId;
	}

	public void setImportId(int importId) {
		this.importId = importId;
	}

	public int getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public DataflowSession getDataflowSession() {
		return this.dataflowSession;
	}

	public void setDataflowSession(DataflowSession dataflowSession) {
		this.dataflowSession = dataflowSession;
	}
	
}