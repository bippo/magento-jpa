package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sales_flat_quote_payment database table.
 * 
 */
@Entity
@Table(name="sales_flat_quote_payment")
public class SalesFlatQuotePayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="payment_id")
	private int paymentId;

    @Lob()
	@Column(name="additional_data")
	private String additionalData;

    @Lob()
	@Column(name="additional_information")
	private String additionalInformation;

	@Column(name="cc_cid_enc")
	private String ccCidEnc;

	@Column(name="cc_exp_month")
	private int ccExpMonth;

	@Column(name="cc_exp_year")
	private int ccExpYear;

	@Column(name="cc_last4")
	private String ccLast4;

	@Column(name="cc_number_enc")
	private String ccNumberEnc;

	@Column(name="cc_owner")
	private String ccOwner;

	@Column(name="cc_ss_issue")
	private String ccSsIssue;

	@Column(name="cc_ss_owner")
	private String ccSsOwner;

	@Column(name="cc_ss_start_month")
	private int ccSsStartMonth;

	@Column(name="cc_ss_start_year")
	private int ccSsStartYear;

	@Column(name="cc_type")
	private String ccType;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="cybersource_token")
	private String cybersourceToken;

	@Column(name="ideal_issuer_id")
	private String idealIssuerId;

    @Lob()
	@Column(name="ideal_issuer_list")
	private String idealIssuerList;

	private String method;

	@Column(name="paypal_correlation_id")
	private String paypalCorrelationId;

	@Column(name="paypal_payer_id")
	private String paypalPayerId;

	@Column(name="paypal_payer_status")
	private String paypalPayerStatus;

	@Column(name="po_number")
	private String poNumber;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to SalesFlatQuote
    @ManyToOne
	@JoinColumn(name="quote_id")
	private SalesFlatQuote salesFlatQuote;

    public SalesFlatQuotePayment() {
    }

	public int getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getAdditionalData() {
		return this.additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}

	public String getAdditionalInformation() {
		return this.additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public String getCcCidEnc() {
		return this.ccCidEnc;
	}

	public void setCcCidEnc(String ccCidEnc) {
		this.ccCidEnc = ccCidEnc;
	}

	public int getCcExpMonth() {
		return this.ccExpMonth;
	}

	public void setCcExpMonth(int ccExpMonth) {
		this.ccExpMonth = ccExpMonth;
	}

	public int getCcExpYear() {
		return this.ccExpYear;
	}

	public void setCcExpYear(int ccExpYear) {
		this.ccExpYear = ccExpYear;
	}

	public String getCcLast4() {
		return this.ccLast4;
	}

	public void setCcLast4(String ccLast4) {
		this.ccLast4 = ccLast4;
	}

	public String getCcNumberEnc() {
		return this.ccNumberEnc;
	}

	public void setCcNumberEnc(String ccNumberEnc) {
		this.ccNumberEnc = ccNumberEnc;
	}

	public String getCcOwner() {
		return this.ccOwner;
	}

	public void setCcOwner(String ccOwner) {
		this.ccOwner = ccOwner;
	}

	public String getCcSsIssue() {
		return this.ccSsIssue;
	}

	public void setCcSsIssue(String ccSsIssue) {
		this.ccSsIssue = ccSsIssue;
	}

	public String getCcSsOwner() {
		return this.ccSsOwner;
	}

	public void setCcSsOwner(String ccSsOwner) {
		this.ccSsOwner = ccSsOwner;
	}

	public int getCcSsStartMonth() {
		return this.ccSsStartMonth;
	}

	public void setCcSsStartMonth(int ccSsStartMonth) {
		this.ccSsStartMonth = ccSsStartMonth;
	}

	public int getCcSsStartYear() {
		return this.ccSsStartYear;
	}

	public void setCcSsStartYear(int ccSsStartYear) {
		this.ccSsStartYear = ccSsStartYear;
	}

	public String getCcType() {
		return this.ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getCybersourceToken() {
		return this.cybersourceToken;
	}

	public void setCybersourceToken(String cybersourceToken) {
		this.cybersourceToken = cybersourceToken;
	}

	public String getIdealIssuerId() {
		return this.idealIssuerId;
	}

	public void setIdealIssuerId(String idealIssuerId) {
		this.idealIssuerId = idealIssuerId;
	}

	public String getIdealIssuerList() {
		return this.idealIssuerList;
	}

	public void setIdealIssuerList(String idealIssuerList) {
		this.idealIssuerList = idealIssuerList;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPaypalCorrelationId() {
		return this.paypalCorrelationId;
	}

	public void setPaypalCorrelationId(String paypalCorrelationId) {
		this.paypalCorrelationId = paypalCorrelationId;
	}

	public String getPaypalPayerId() {
		return this.paypalPayerId;
	}

	public void setPaypalPayerId(String paypalPayerId) {
		this.paypalPayerId = paypalPayerId;
	}

	public String getPaypalPayerStatus() {
		return this.paypalPayerStatus;
	}

	public void setPaypalPayerStatus(String paypalPayerStatus) {
		this.paypalPayerStatus = paypalPayerStatus;
	}

	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public SalesFlatQuote getSalesFlatQuote() {
		return this.salesFlatQuote;
	}

	public void setSalesFlatQuote(SalesFlatQuote salesFlatQuote) {
		this.salesFlatQuote = salesFlatQuote;
	}
	
}