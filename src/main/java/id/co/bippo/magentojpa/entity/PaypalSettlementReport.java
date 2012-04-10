package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the paypal_settlement_report database table.
 * 
 */
@Entity
@Table(name="paypal_settlement_report")
public class PaypalSettlementReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="report_id")
	private int reportId;

	@Column(name="account_id")
	private String accountId;

	private String filename;

	@Column(name="last_modified")
	private Timestamp lastModified;

	@Column(name="report_date")
	private Timestamp reportDate;

	//bi-directional many-to-one association to PaypalSettlementReportRow
	@OneToMany(mappedBy="paypalSettlementReport")
	private Set<PaypalSettlementReportRow> paypalSettlementReportRows;

    public PaypalSettlementReport() {
    }

	public int getReportId() {
		return this.reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Timestamp getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public Timestamp getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Timestamp reportDate) {
		this.reportDate = reportDate;
	}

	public Set<PaypalSettlementReportRow> getPaypalSettlementReportRows() {
		return this.paypalSettlementReportRows;
	}

	public void setPaypalSettlementReportRows(Set<PaypalSettlementReportRow> paypalSettlementReportRows) {
		this.paypalSettlementReportRows = paypalSettlementReportRows;
	}
	
}