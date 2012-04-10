package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the admin_user database table.
 * 
 */
@Entity
@Table(name="admin_user")
public class AdminUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	private Timestamp created;

	private String email;

    @Lob()
	private String extra;

	private String firstname;

	@Column(name="is_active")
	private short isActive;

	private String lastname;

	private Timestamp logdate;

	private int lognum;

	private Timestamp modified;

	private String password;

	@Column(name="reload_acl_flag")
	private short reloadAclFlag;

    @Lob()
	@Column(name="rp_token")
	private String rpToken;

	@Column(name="rp_token_created_at")
	private Timestamp rpTokenCreatedAt;

	private String username;

    public AdminUser() {
    }

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
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

	public Timestamp getLogdate() {
		return this.logdate;
	}

	public void setLogdate(Timestamp logdate) {
		this.logdate = logdate;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getReloadAclFlag() {
		return this.reloadAclFlag;
	}

	public void setReloadAclFlag(short reloadAclFlag) {
		this.reloadAclFlag = reloadAclFlag;
	}

	public String getRpToken() {
		return this.rpToken;
	}

	public void setRpToken(String rpToken) {
		this.rpToken = rpToken;
	}

	public Timestamp getRpTokenCreatedAt() {
		return this.rpTokenCreatedAt;
	}

	public void setRpTokenCreatedAt(Timestamp rpTokenCreatedAt) {
		this.rpTokenCreatedAt = rpTokenCreatedAt;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}