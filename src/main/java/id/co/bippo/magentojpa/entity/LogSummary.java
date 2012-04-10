package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the log_summary database table.
 * 
 */
@Entity
@Table(name="log_summary")
public class LogSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="summary_id")
	private String summaryId;

	@Column(name="add_date")
	private Timestamp addDate;

	@Column(name="customer_count")
	private int customerCount;

	@Column(name="store_id")
	private int storeId;

	@Column(name="type_id")
	private int typeId;

	@Column(name="visitor_count")
	private int visitorCount;

    public LogSummary() {
    }

	public String getSummaryId() {
		return this.summaryId;
	}

	public void setSummaryId(String summaryId) {
		this.summaryId = summaryId;
	}

	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
	}

	public int getCustomerCount() {
		return this.customerCount;
	}

	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getVisitorCount() {
		return this.visitorCount;
	}

	public void setVisitorCount(int visitorCount) {
		this.visitorCount = visitorCount;
	}

}