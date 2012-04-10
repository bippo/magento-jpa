package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the api_user database table.
 * 
 */
@Entity
@Table(name="api_user")
public class ApiUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	@Column(name="api_key")
	private String apiKey;

	private Timestamp created;

	private String email;

	private String firstname;

	@Column(name="is_active")
	private short isActive;

	private String lastname;

	private int lognum;

	private Timestamp modified;

	@Column(name="reload_acl_flag")
	private short reloadAclFlag;

	private String username;

	//bi-directional many-to-one association to ApiSession
//	@OneToMany(mappedBy="apiUser")
//	private Set<ApiSession> apiSessions;

    public ApiUser() {
    }

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getApiKey() {
		return this.apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getLognum() {
		return this.lognum;
	}

	public void setLognum(int lognum) {
		this.lognum = lognum;
	}

	public Timestamp getModified() {
		return this.modified;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

	public short getReloadAclFlag() {
		return this.reloadAclFlag;
	}

	public void setReloadAclFlag(short reloadAclFlag) {
		this.reloadAclFlag = reloadAclFlag;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

//	public Set<ApiSession> getApiSessions() {
//		return this.apiSessions;
//	}
//
//	public void setApiSessions(Set<ApiSession> apiSessions) {
//		this.apiSessions = apiSessions;
//	}
	
}