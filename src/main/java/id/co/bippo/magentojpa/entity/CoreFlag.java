package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the core_flag database table.
 * 
 */
@Entity
@Table(name="core_flag")
public class CoreFlag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="flag_id")
	private int flagId;

	@Column(name="flag_code")
	private String flagCode;

    @Lob()
	@Column(name="flag_data")
	private String flagData;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	private int state;

    public CoreFlag() {
    }

	public int getFlagId() {
		return this.flagId;
	}

	public void setFlagId(int flagId) {
		this.flagId = flagId;
	}

	public String getFlagCode() {
		return this.flagCode;
	}

	public void setFlagCode(String flagCode) {
		this.flagCode = flagCode;
	}

	public String getFlagData() {
		return this.flagData;
	}

	public void setFlagData(String flagData) {
		this.flagData = flagData;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

}