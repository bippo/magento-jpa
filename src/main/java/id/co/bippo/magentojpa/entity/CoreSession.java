package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the core_session database table.
 * 
 */
@Entity
@Table(name="core_session")
public class CoreSession implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="session_id")
	private String sessionId;

    @Lob()
	@Column(name="session_data")
	private byte[] sessionData;

	@Column(name="session_expires")
	private int sessionExpires;

    public CoreSession() {
    }

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public byte[] getSessionData() {
		return this.sessionData;
	}

	public void setSessionData(byte[] sessionData) {
		this.sessionData = sessionData;
	}

	public int getSessionExpires() {
		return this.sessionExpires;
	}

	public void setSessionExpires(int sessionExpires) {
		this.sessionExpires = sessionExpires;
	}

}