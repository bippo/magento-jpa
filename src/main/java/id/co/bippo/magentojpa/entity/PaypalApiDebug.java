package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the paypal_api_debug database table.
 * 
 */
@Entity
@Table(name="paypal_api_debug")
public class PaypalApiDebug implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="debug_id")
	private int debugId;

	@Column(name="debug_at")
	private Timestamp debugAt;

    @Lob()
	@Column(name="request_body")
	private String requestBody;

    @Lob()
	@Column(name="response_body")
	private String responseBody;

    public PaypalApiDebug() {
    }

	public int getDebugId() {
		return this.debugId;
	}

	public void setDebugId(int debugId) {
		this.debugId = debugId;
	}

	public Timestamp getDebugAt() {
		return this.debugAt;
	}

	public void setDebugAt(Timestamp debugAt) {
		this.debugAt = debugAt;
	}

	public String getRequestBody() {
		return this.requestBody;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	public String getResponseBody() {
		return this.responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

}