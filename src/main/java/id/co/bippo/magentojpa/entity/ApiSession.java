package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the api_session database table.
 * 
 */
@Entity
@Table(name="api_session")
public class ApiSession implements Serializable {
	private static final long serialVersionUID = 1L;

	private Timestamp logdate;

	private String sessid;

	//bi-directional many-to-one association to ApiUser
    @ManyToOne
	@JoinColumn(name="user_id")
	private ApiUser apiUser;

    public ApiSession() {
    }

	public Timestamp getLogdate() {
		return this.logdate;
	}

	public void setLogdate(Timestamp logdate) {
		this.logdate = logdate;
	}

	public String getSessid() {
		return this.sessid;
	}

	public void setSessid(String sessid) {
		this.sessid = sessid;
	}

	public ApiUser getApiUser() {
		return this.apiUser;
	}

	public void setApiUser(ApiUser apiUser) {
		this.apiUser = apiUser;
	}
	
}