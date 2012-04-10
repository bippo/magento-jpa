package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the log_visitor database table.
 * 
 */
@Entity
@Table(name="log_visitor")
public class LogVisitor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="visitor_id")
	private String visitorId;

	@Column(name="first_visit_at")
	private Timestamp firstVisitAt;

	@Column(name="last_url_id")
	private BigInteger lastUrlId;

	@Column(name="last_visit_at")
	private Timestamp lastVisitAt;

	@Column(name="session_id")
	private String sessionId;

	@Column(name="store_id")
	private int storeId;

    public LogVisitor() {
    }

	public String getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public Timestamp getFirstVisitAt() {
		return this.firstVisitAt;
	}

	public void setFirstVisitAt(Timestamp firstVisitAt) {
		this.firstVisitAt = firstVisitAt;
	}

	public BigInteger getLastUrlId() {
		return this.lastUrlId;
	}

	public void setLastUrlId(BigInteger lastUrlId) {
		this.lastUrlId = lastUrlId;
	}

	public Timestamp getLastVisitAt() {
		return this.lastVisitAt;
	}

	public void setLastVisitAt(Timestamp lastVisitAt) {
		this.lastVisitAt = lastVisitAt;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

}