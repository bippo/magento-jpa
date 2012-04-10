package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the log_visitor_online database table.
 * 
 */
@Entity
@Table(name="log_visitor_online")
public class LogVisitorOnline implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="visitor_id")
	private String visitorId;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="first_visit_at")
	private Timestamp firstVisitAt;

	@Column(name="last_url")
	private String lastUrl;

	@Column(name="last_visit_at")
	private Timestamp lastVisitAt;

	@Column(name="remote_addr")
	private BigInteger remoteAddr;

	@Column(name="visitor_type")
	private String visitorType;

    public LogVisitorOnline() {
    }

	public String getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Timestamp getFirstVisitAt() {
		return this.firstVisitAt;
	}

	public void setFirstVisitAt(Timestamp firstVisitAt) {
		this.firstVisitAt = firstVisitAt;
	}

	public String getLastUrl() {
		return this.lastUrl;
	}

	public void setLastUrl(String lastUrl) {
		this.lastUrl = lastUrl;
	}

	public Timestamp getLastVisitAt() {
		return this.lastVisitAt;
	}

	public void setLastVisitAt(Timestamp lastVisitAt) {
		this.lastVisitAt = lastVisitAt;
	}

	public BigInteger getRemoteAddr() {
		return this.remoteAddr;
	}

	public void setRemoteAddr(BigInteger remoteAddr) {
		this.remoteAddr = remoteAddr;
	}

	public String getVisitorType() {
		return this.visitorType;
	}

	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}

}