package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the log_quote database table.
 * 
 */
@Entity
@Table(name="log_quote")
public class LogQuote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="quote_id")
	private int quoteId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="deleted_at")
	private Timestamp deletedAt;

	@Column(name="visitor_id")
	private BigInteger visitorId;

    public LogQuote() {
    }

	public int getQuoteId() {
		return this.quoteId;
	}

	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Timestamp deletedAt) {
		this.deletedAt = deletedAt;
	}

	public BigInteger getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(BigInteger visitorId) {
		this.visitorId = visitorId;
	}

}