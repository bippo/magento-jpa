package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the paypal_settlement_report_row database table.
 * 
 */
@Entity
@Table(name="paypal_settlement_report_row")
public class PaypalSettlementReportRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="row_id")
	private int rowId;

	@Column(name="consumer_id")
	private String consumerId;

	@Column(name="custom_field")
	private String customField;

	@Column(name="fee_amount")
	private BigDecimal feeAmount;

	@Column(name="fee_currency")
	private String feeCurrency;

	@Column(name="fee_debit_or_credit")
	private String feeDebitOrCredit;

	@Column(name="gross_transaction_amount")
	private BigDecimal grossTransactionAmount;

	@Column(name="gross_transaction_currency")
	private String grossTransactionCurrency;

	@Column(name="invoice_id")
	private String invoiceId;

	@Column(name="paypal_reference_id")
	private String paypalReferenceId;

	@Column(name="paypal_reference_id_type")
	private String paypalReferenceIdType;

	@Column(name="transaction_completion_date")
	private Timestamp transactionCompletionDate;

	@Column(name="transaction_debit_or_credit")
	private String transactionDebitOrCredit;

	@Column(name="transaction_event_code")
	private String transactionEventCode;

	@Column(name="transaction_id")
	private String transactionId;

	@Column(name="transaction_initiation_date")
	private Timestamp transactionInitiationDate;

	//bi-directional many-to-one association to PaypalSettlementReport
    @ManyToOne
	@JoinColumn(name="report_id")
	private PaypalSettlementReport paypalSettlementReport;

    public PaypalSettlementReportRow() {
    }

	public int getRowId() {
		return this.rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public String getConsumerId() {
		return this.consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getCustomField() {
		return this.customField;
	}

	public void setCustomField(String customField) {
		this.customField = customField;
	}

	public BigDecimal getFeeAmount() {
		return this.feeAmount;
	}

	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeCurrency() {
		return this.feeCurrency;
	}

	public void setFeeCurrency(String feeCurrency) {
		this.feeCurrency = feeCurrency;
	}

	public String getFeeDebitOrCredit() {
		return this.feeDebitOrCredit;
	}

	public void setFeeDebitOrCredit(String feeDebitOrCredit) {
		this.feeDebitOrCredit = feeDebitOrCredit;
	}

	public BigDecimal getGrossTransactionAmount() {
		return this.grossTransactionAmount;
	}

	public void setGrossTransactionAmount(BigDecimal grossTransactionAmount) {
		this.grossTransactionAmount = grossTransactionAmount;
	}

	public String getGrossTransactionCurrency() {
		return this.grossTransactionCurrency;
	}

	public void setGrossTransactionCurrency(String grossTransactionCurrency) {
		this.grossTransactionCurrency = grossTransactionCurrency;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getPaypalReferenceId() {
		return this.paypalReferenceId;
	}

	public void setPaypalReferenceId(String paypalReferenceId) {
		this.paypalReferenceId = paypalReferenceId;
	}

	public String getPaypalReferenceIdType() {
		return this.paypalReferenceIdType;
	}

	public void setPaypalReferenceIdType(String paypalReferenceIdType) {
		this.paypalReferenceIdType = paypalReferenceIdType;
	}

	public Timestamp getTransactionCompletionDate() {
		return this.transactionCompletionDate;
	}

	public void setTransactionCompletionDate(Timestamp transactionCompletionDate) {
		this.transactionCompletionDate = transactionCompletionDate;
	}

	public String getTransactionDebitOrCredit() {
		return this.transactionDebitOrCredit;
	}

	public void setTransactionDebitOrCredit(String transactionDebitOrCredit) {
		this.transactionDebitOrCredit = transactionDebitOrCredit;
	}

	public String getTransactionEventCode() {
		return this.transactionEventCode;
	}

	public void setTransactionEventCode(String transactionEventCode) {
		this.transactionEventCode = transactionEventCode;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Timestamp getTransactionInitiationDate() {
		return this.transactionInitiationDate;
	}

	public void setTransactionInitiationDate(Timestamp transactionInitiationDate) {
		this.transactionInitiationDate = transactionInitiationDate;
	}

	public PaypalSettlementReport getPaypalSettlementReport() {
		return this.paypalSettlementReport;
	}

	public void setPaypalSettlementReport(PaypalSettlementReport paypalSettlementReport) {
		this.paypalSettlementReport = paypalSettlementReport;
	}
	
}