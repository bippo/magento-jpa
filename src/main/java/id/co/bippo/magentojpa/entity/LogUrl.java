package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the log_url database table.
 * 
 */
@Entity
@Table(name="log_url")
public class LogUrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="url_id")
	private String urlId;

	@Column(name="visit_time")
	private Timestamp visitTime;

	@Column(name="visitor_id")
	private BigInteger visitorId;

    public LogUrl() {
    }

	public String getUrlId() {
		return this.urlId;
	}

	public void setUrlId(String urlId) {
		this.urlId = urlId;
	}

	public Timestamp getVisitTime() {
		return this.visitTime;
	}

	public void setVisitTime(Timestamp visitTime) {
		this.visitTime = visitTime;
	}

	public BigInteger getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(BigInteger visitorId) {
		this.visitorId = visitorId;
	}

}