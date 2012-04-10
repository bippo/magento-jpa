package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the sales_payment_transaction database table.
 * 
 */
@Entity
@Table(name="sales_payment_transaction")
public class SalesPaymentTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private int transactionId;

    @Lob()
	@Column(name="additional_information")
	private byte[] additionalInformation;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="is_closed")
	private int isClosed;

	@Column(name="parent_txn_id")
	private String parentTxnId;

	@Column(name="txn_id")
	private String txnId;

	@Column(name="txn_type")
	private String txnType;

	//bi-directional many-to-one association to SalesPaymentTransaction
    @ManyToOne
	@JoinColumn(name="parent_id")
	private SalesPaymentTransaction salesPaymentTransaction;

	//bi-directional many-to-one association to SalesPaymentTransaction
	@OneToMany(mappedBy="salesPaymentTransaction")
	private Set<SalesPaymentTransaction> salesPaymentTransactions;

	//bi-directional many-to-one association to SalesFlatOrderPayment
    @ManyToOne
	@JoinColumn(name="payment_id")
	private SalesFlatOrderPayment salesFlatOrderPayment;

	//bi-directional many-to-one association to SalesFlatOrder
    @ManyToOne
	@JoinColumn(name="order_id")
	private SalesFlatOrder salesFlatOrder;

    public SalesPaymentTransaction() {
    }

	public int getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public byte[] getAdditionalInformation() {
		return this.additionalInformation;
	}

	public void setAdditionalInformation(byte[] additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getIsClosed() {
		return this.isClosed;
	}

	public void setIsClosed(int isClosed) {
		this.isClosed = isClosed;
	}

	public String getParentTxnId() {
		return this.parentTxnId;
	}

	public void setParentTxnId(String parentTxnId) {
		this.parentTxnId = parentTxnId;
	}

	public String getTxnId() {
		return this.txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getTxnType() {
		return this.txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public SalesPaymentTransaction getSalesPaymentTransaction() {
		return this.salesPaymentTransaction;
	}

	public void setSalesPaymentTransaction(SalesPaymentTransaction salesPaymentTransaction) {
		this.salesPaymentTransaction = salesPaymentTransaction;
	}
	
	public Set<SalesPaymentTransaction> getSalesPaymentTransactions() {
		return this.salesPaymentTransactions;
	}

	public void setSalesPaymentTransactions(Set<SalesPaymentTransaction> salesPaymentTransactions) {
		this.salesPaymentTransactions = salesPaymentTransactions;
	}
	
	public SalesFlatOrderPayment getSalesFlatOrderPayment() {
		return this.salesFlatOrderPayment;
	}

	public void setSalesFlatOrderPayment(SalesFlatOrderPayment salesFlatOrderPayment) {
		this.salesFlatOrderPayment = salesFlatOrderPayment;
	}
	
	public SalesFlatOrder getSalesFlatOrder() {
		return this.salesFlatOrder;
	}

	public void setSalesFlatOrder(SalesFlatOrder salesFlatOrder) {
		this.salesFlatOrder = salesFlatOrder;
	}
	
}