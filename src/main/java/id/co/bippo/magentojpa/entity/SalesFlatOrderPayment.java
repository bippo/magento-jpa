package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the sales_flat_order_payment database table.
 * 
 */
@Entity
@Table(name="sales_flat_order_payment")
public class SalesFlatOrderPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="account_status")
	private String accountStatus;

    @Lob()
	@Column(name="additional_data")
	private String additionalData;

    @Lob()
	@Column(name="additional_information")
	private String additionalInformation;

	@Column(name="address_status")
	private String addressStatus;

	@Column(name="amount_authorized")
	private BigDecimal amountAuthorized;

	@Column(name="amount_canceled")
	private BigDecimal amountCanceled;

	@Column(name="amount_ordered")
	private BigDecimal amountOrdered;

	@Column(name="amount_paid")
	private BigDecimal amountPaid;

	@Column(name="amount_refunded")
	private BigDecimal amountRefunded;

	@Column(name="anet_trans_method")
	private String anetTransMethod;

	@Column(name="base_amount_authorized")
	private BigDecimal baseAmountAuthorized;

	@Column(name="base_amount_canceled")
	private BigDecimal baseAmountCanceled;

	@Column(name="base_amount_ordered")
	private BigDecimal baseAmountOrdered;

	@Column(name="base_amount_paid")
	private BigDecimal baseAmountPaid;

	@Column(name="base_amount_paid_online")
	private BigDecimal baseAmountPaidOnline;

	@Column(name="base_amount_refunded")
	private BigDecimal baseAmountRefunded;

	@Column(name="base_amount_refunded_online")
	private BigDecimal baseAmountRefundedOnline;

	@Column(name="base_shipping_amount")
	private BigDecimal baseShippingAmount;

	@Column(name="base_shipping_captured")
	private BigDecimal baseShippingCaptured;

	@Column(name="base_shipping_refunded")
	private BigDecimal baseShippingRefunded;

	@Column(name="cc_approval")
	private String ccApproval;

	@Column(name="cc_avs_status")
	private String ccAvsStatus;

	@Column(name="cc_cid_status")
	private String ccCidStatus;

	@Column(name="cc_debug_request_body")
	private String ccDebugRequestBody;

	@Column(name="cc_debug_response_body")
	private String ccDebugResponseBody;

	@Column(name="cc_debug_response_serialized")
	private String ccDebugResponseSerialized;

	@Column(name="cc_exp_month")
	private String ccExpMonth;

	@Column(name="cc_exp_year")
	private String ccExpYear;

	@Column(name="cc_last4")
	private String ccLast4;

	@Column(name="cc_number_enc")
	private String ccNumberEnc;

	@Column(name="cc_owner")
	private String ccOwner;

	@Column(name="cc_secure_verify")
	private String ccSecureVerify;

	@Column(name="cc_ss_issue")
	private String ccSsIssue;

	@Column(name="cc_ss_start_month")
	private String ccSsStartMonth;

	@Column(name="cc_ss_start_year")
	private String ccSsStartYear;

	@Column(name="cc_status")
	private String ccStatus;

	@Column(name="cc_status_description")
	private String ccStatusDescription;

	@Column(name="cc_trans_id")
	private String ccTransId;

	@Column(name="cc_type")
	private String ccType;

	@Column(name="cybersource_token")
	private String cybersourceToken;

	@Column(name="echeck_account_name")
	private String echeckAccountName;

	@Column(name="echeck_account_type")
	private String echeckAccountType;

	@Column(name="echeck_bank_name")
	private String echeckBankName;

	@Column(name="echeck_routing_number")
	private String echeckRoutingNumber;

	@Column(name="echeck_type")
	private String echeckType;

	@Column(name="flo2cash_account_id")
	private String flo2cashAccountId;

	@Column(name="ideal_issuer_id")
	private String idealIssuerId;

	@Column(name="ideal_issuer_title")
	private String idealIssuerTitle;

	@Column(name="ideal_transaction_checked")
	private byte idealTransactionChecked;

	@Column(name="last_trans_id")
	private String lastTransId;

	private String method;

	@Column(name="paybox_question_number")
	private String payboxQuestionNumber;

	@Column(name="paybox_request_number")
	private String payboxRequestNumber;

	@Column(name="po_number")
	private String poNumber;

	@Column(name="protection_eligibility")
	private String protectionEligibility;

	@Column(name="quote_payment_id")
	private int quotePaymentId;

	@Column(name="shipping_amount")
	private BigDecimal shippingAmount;

	@Column(name="shipping_captured")
	private BigDecimal shippingCaptured;

	@Column(name="shipping_refunded")
	private BigDecimal shippingRefunded;

	//bi-directional many-to-one association to SalesFlatOrder
    @ManyToOne
	@JoinColumn(name="parent_id")
	private SalesFlatOrder salesFlatOrder;

	//bi-directional many-to-one association to SalesPaymentTransaction
	@OneToMany(mappedBy="salesFlatOrderPayment")
	private Set<SalesPaymentTransaction> salesPaymentTransactions;

    public SalesFlatOrderPayment() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
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

	public String getAddressStatus() {
		return this.addressStatus;
	}

	public void setAddressStatus(String addressStatus) {
		this.addressStatus = addressStatus;
	}

	public BigDecimal getAmountAuthorized() {
		return this.amountAuthorized;
	}

	public void setAmountAuthorized(BigDecimal amountAuthorized) {
		this.amountAuthorized = amountAuthorized;
	}

	public BigDecimal getAmountCanceled() {
		return this.amountCanceled;
	}

	public void setAmountCanceled(BigDecimal amountCanceled) {
		this.amountCanceled = amountCanceled;
	}

	public BigDecimal getAmountOrdered() {
		return this.amountOrdered;
	}

	public void setAmountOrdered(BigDecimal amountOrdered) {
		this.amountOrdered = amountOrdered;
	}

	public BigDecimal getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}

	public BigDecimal getAmountRefunded() {
		return this.amountRefunded;
	}

	public void setAmountRefunded(BigDecimal amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	public String getAnetTransMethod() {
		return this.anetTransMethod;
	}

	public void setAnetTransMethod(String anetTransMethod) {
		this.anetTransMethod = anetTransMethod;
	}

	public BigDecimal getBaseAmountAuthorized() {
		return this.baseAmountAuthorized;
	}

	public void setBaseAmountAuthorized(BigDecimal baseAmountAuthorized) {
		this.baseAmountAuthorized = baseAmountAuthorized;
	}

	public BigDecimal getBaseAmountCanceled() {
		return this.baseAmountCanceled;
	}

	public void setBaseAmountCanceled(BigDecimal baseAmountCanceled) {
		this.baseAmountCanceled = baseAmountCanceled;
	}

	public BigDecimal getBaseAmountOrdered() {
		return this.baseAmountOrdered;
	}

	public void setBaseAmountOrdered(BigDecimal baseAmountOrdered) {
		this.baseAmountOrdered = baseAmountOrdered;
	}

	public BigDecimal getBaseAmountPaid() {
		return this.baseAmountPaid;
	}

	public void setBaseAmountPaid(BigDecimal baseAmountPaid) {
		this.baseAmountPaid = baseAmountPaid;
	}

	public BigDecimal getBaseAmountPaidOnline() {
		return this.baseAmountPaidOnline;
	}

	public void setBaseAmountPaidOnline(BigDecimal baseAmountPaidOnline) {
		this.baseAmountPaidOnline = baseAmountPaidOnline;
	}

	public BigDecimal getBaseAmountRefunded() {
		return this.baseAmountRefunded;
	}

	public void setBaseAmountRefunded(BigDecimal baseAmountRefunded) {
		this.baseAmountRefunded = baseAmountRefunded;
	}

	public BigDecimal getBaseAmountRefundedOnline() {
		return this.baseAmountRefundedOnline;
	}

	public void setBaseAmountRefundedOnline(BigDecimal baseAmountRefundedOnline) {
		this.baseAmountRefundedOnline = baseAmountRefundedOnline;
	}

	public BigDecimal getBaseShippingAmount() {
		return this.baseShippingAmount;
	}

	public void setBaseShippingAmount(BigDecimal baseShippingAmount) {
		this.baseShippingAmount = baseShippingAmount;
	}

	public BigDecimal getBaseShippingCaptured() {
		return this.baseShippingCaptured;
	}

	public void setBaseShippingCaptured(BigDecimal baseShippingCaptured) {
		this.baseShippingCaptured = baseShippingCaptured;
	}

	public BigDecimal getBaseShippingRefunded() {
		return this.baseShippingRefunded;
	}

	public void setBaseShippingRefunded(BigDecimal baseShippingRefunded) {
		this.baseShippingRefunded = baseShippingRefunded;
	}

	public String getCcApproval() {
		return this.ccApproval;
	}

	public void setCcApproval(String ccApproval) {
		this.ccApproval = ccApproval;
	}

	public String getCcAvsStatus() {
		return this.ccAvsStatus;
	}

	public void setCcAvsStatus(String ccAvsStatus) {
		this.ccAvsStatus = ccAvsStatus;
	}

	public String getCcCidStatus() {
		return this.ccCidStatus;
	}

	public void setCcCidStatus(String ccCidStatus) {
		this.ccCidStatus = ccCidStatus;
	}

	public String getCcDebugRequestBody() {
		return this.ccDebugRequestBody;
	}

	public void setCcDebugRequestBody(String ccDebugRequestBody) {
		this.ccDebugRequestBody = ccDebugRequestBody;
	}

	public String getCcDebugResponseBody() {
		return this.ccDebugResponseBody;
	}

	public void setCcDebugResponseBody(String ccDebugResponseBody) {
		this.ccDebugResponseBody = ccDebugResponseBody;
	}

	public String getCcDebugResponseSerialized() {
		return this.ccDebugResponseSerialized;
	}

	public void setCcDebugResponseSerialized(String ccDebugResponseSerialized) {
		this.ccDebugResponseSerialized = ccDebugResponseSerialized;
	}

	public String getCcExpMonth() {
		return this.ccExpMonth;
	}

	public void setCcExpMonth(String ccExpMonth) {
		this.ccExpMonth = ccExpMonth;
	}

	public String getCcExpYear() {
		return this.ccExpYear;
	}

	public void setCcExpYear(String ccExpYear) {
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

	public String getCcSecureVerify() {
		return this.ccSecureVerify;
	}

	public void setCcSecureVerify(String ccSecureVerify) {
		this.ccSecureVerify = ccSecureVerify;
	}

	public String getCcSsIssue() {
		return this.ccSsIssue;
	}

	public void setCcSsIssue(String ccSsIssue) {
		this.ccSsIssue = ccSsIssue;
	}

	public String getCcSsStartMonth() {
		return this.ccSsStartMonth;
	}

	public void setCcSsStartMonth(String ccSsStartMonth) {
		this.ccSsStartMonth = ccSsStartMonth;
	}

	public String getCcSsStartYear() {
		return this.ccSsStartYear;
	}

	public void setCcSsStartYear(String ccSsStartYear) {
		this.ccSsStartYear = ccSsStartYear;
	}

	public String getCcStatus() {
		return this.ccStatus;
	}

	public void setCcStatus(String ccStatus) {
		this.ccStatus = ccStatus;
	}

	public String getCcStatusDescription() {
		return this.ccStatusDescription;
	}

	public void setCcStatusDescription(String ccStatusDescription) {
		this.ccStatusDescription = ccStatusDescription;
	}

	public String getCcTransId() {
		return this.ccTransId;
	}

	public void setCcTransId(String ccTransId) {
		this.ccTransId = ccTransId;
	}

	public String getCcType() {
		return this.ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public String getCybersourceToken() {
		return this.cybersourceToken;
	}

	public void setCybersourceToken(String cybersourceToken) {
		this.cybersourceToken = cybersourceToken;
	}

	public String getEcheckAccountName() {
		return this.echeckAccountName;
	}

	public void setEcheckAccountName(String echeckAccountName) {
		this.echeckAccountName = echeckAccountName;
	}

	public String getEcheckAccountType() {
		return this.echeckAccountType;
	}

	public void setEcheckAccountType(String echeckAccountType) {
		this.echeckAccountType = echeckAccountType;
	}

	public String getEcheckBankName() {
		return this.echeckBankName;
	}

	public void setEcheckBankName(String echeckBankName) {
		this.echeckBankName = echeckBankName;
	}

	public String getEcheckRoutingNumber() {
		return this.echeckRoutingNumber;
	}

	public void setEcheckRoutingNumber(String echeckRoutingNumber) {
		this.echeckRoutingNumber = echeckRoutingNumber;
	}

	public String getEcheckType() {
		return this.echeckType;
	}

	public void setEcheckType(String echeckType) {
		this.echeckType = echeckType;
	}

	public String getFlo2cashAccountId() {
		return this.flo2cashAccountId;
	}

	public void setFlo2cashAccountId(String flo2cashAccountId) {
		this.flo2cashAccountId = flo2cashAccountId;
	}

	public String getIdealIssuerId() {
		return this.idealIssuerId;
	}

	public void setIdealIssuerId(String idealIssuerId) {
		this.idealIssuerId = idealIssuerId;
	}

	public String getIdealIssuerTitle() {
		return this.idealIssuerTitle;
	}

	public void setIdealIssuerTitle(String idealIssuerTitle) {
		this.idealIssuerTitle = idealIssuerTitle;
	}

	public byte getIdealTransactionChecked() {
		return this.idealTransactionChecked;
	}

	public void setIdealTransactionChecked(byte idealTransactionChecked) {
		this.idealTransactionChecked = idealTransactionChecked;
	}

	public String getLastTransId() {
		return this.lastTransId;
	}

	public void setLastTransId(String lastTransId) {
		this.lastTransId = lastTransId;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPayboxQuestionNumber() {
		return this.payboxQuestionNumber;
	}

	public void setPayboxQuestionNumber(String payboxQuestionNumber) {
		this.payboxQuestionNumber = payboxQuestionNumber;
	}

	public String getPayboxRequestNumber() {
		return this.payboxRequestNumber;
	}

	public void setPayboxRequestNumber(String payboxRequestNumber) {
		this.payboxRequestNumber = payboxRequestNumber;
	}

	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getProtectionEligibility() {
		return this.protectionEligibility;
	}

	public void setProtectionEligibility(String protectionEligibility) {
		this.protectionEligibility = protectionEligibility;
	}

	public int getQuotePaymentId() {
		return this.quotePaymentId;
	}

	public void setQuotePaymentId(int quotePaymentId) {
		this.quotePaymentId = quotePaymentId;
	}

	public BigDecimal getShippingAmount() {
		return this.shippingAmount;
	}

	public void setShippingAmount(BigDecimal shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	public BigDecimal getShippingCaptured() {
		return this.shippingCaptured;
	}

	public void setShippingCaptured(BigDecimal shippingCaptured) {
		this.shippingCaptured = shippingCaptured;
	}

	public BigDecimal getShippingRefunded() {
		return this.shippingRefunded;
	}

	public void setShippingRefunded(BigDecimal shippingRefunded) {
		this.shippingRefunded = shippingRefunded;
	}

	public SalesFlatOrder getSalesFlatOrder() {
		return this.salesFlatOrder;
	}

	public void setSalesFlatOrder(SalesFlatOrder salesFlatOrder) {
		this.salesFlatOrder = salesFlatOrder;
	}
	
	public Set<SalesPaymentTransaction> getSalesPaymentTransactions() {
		return this.salesPaymentTransactions;
	}

	public void setSalesPaymentTransactions(Set<SalesPaymentTransaction> salesPaymentTransactions) {
		this.salesPaymentTransactions = salesPaymentTransactions;
	}
	
}