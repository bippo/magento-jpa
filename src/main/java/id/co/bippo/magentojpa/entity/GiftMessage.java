package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gift_message database table.
 * 
 */
@Entity
@Table(name="gift_message")
public class GiftMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gift_message_id")
	private int giftMessageId;

	@Column(name="customer_id")
	private int customerId;

    @Lob()
	private String message;

	private String recipient;

	private String sender;

    public GiftMessage() {
    }

	public int getGiftMessageId() {
		return this.giftMessageId;
	}

	public void setGiftMessageId(int giftMessageId) {
		this.giftMessageId = giftMessageId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

}