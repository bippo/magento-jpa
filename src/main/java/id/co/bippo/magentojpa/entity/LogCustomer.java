package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the log_customer database table.
 * 
 */
@Entity
@Table(name="log_customer")
public class LogCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="log_id")
	private int logId;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="login_at")
	private Timestamp loginAt;

	@Column(name="logout_at")
	private Timestamp logoutAt;

	@Column(name="store_id")
	private int storeId;

	@Column(name="visitor_id")
	private BigInteger visitorId;

    public LogCustomer() {
    }

	public int getLogId() {
		return this.logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Timestamp getLoginAt() {
		return this.loginAt;
	}

	public void setLoginAt(Timestamp loginAt) {
		this.loginAt = loginAt;
	}

	public Timestamp getLogoutAt() {
		return this.logoutAt;
	}

	public void setLogoutAt(Timestamp logoutAt) {
		this.logoutAt = logoutAt;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public BigInteger getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(BigInteger visitorId) {
		this.visitorId = visitorId;
	}

}