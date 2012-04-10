package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the paypal_payment_transaction database table.
 * 
 */
@Entity
@Table(name="paypal_payment_transaction")
public class PaypalPaymentTransaction implements Serializable {
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

	@Column(name="txn_id")
	private String txnId;

    public PaypalPaymentTransaction() {
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

	public String getTxnId() {
		return this.txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

}