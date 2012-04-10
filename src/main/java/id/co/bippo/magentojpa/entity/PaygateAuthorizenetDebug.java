package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the paygate_authorizenet_debug database table.
 * 
 */
@Entity
@Table(name="paygate_authorizenet_debug")
public class PaygateAuthorizenetDebug implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="debug_id")
	private int debugId;

    @Lob()
	@Column(name="request_body")
	private String requestBody;

    @Lob()
	@Column(name="request_dump")
	private String requestDump;

    @Lob()
	@Column(name="request_serialized")
	private String requestSerialized;

    @Lob()
	@Column(name="response_body")
	private String responseBody;

    @Lob()
	@Column(name="result_dump")
	private String resultDump;

    @Lob()
	@Column(name="result_serialized")
	private String resultSerialized;

    public PaygateAuthorizenetDebug() {
    }

	public int getDebugId() {
		return this.debugId;
	}

	public void setDebugId(int debugId) {
		this.debugId = debugId;
	}

	public String getRequestBody() {
		return this.requestBody;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	public String getRequestDump() {
		return this.requestDump;
	}

	public void setRequestDump(String requestDump) {
		this.requestDump = requestDump;
	}

	public String getRequestSerialized() {
		return this.requestSerialized;
	}

	public void setRequestSerialized(String requestSerialized) {
		this.requestSerialized = requestSerialized;
	}

	public String getResponseBody() {
		return this.responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	public String getResultDump() {
		return this.resultDump;
	}

	public void setResultDump(String resultDump) {
		this.resultDump = resultDump;
	}

	public String getResultSerialized() {
		return this.resultSerialized;
	}

	public void setResultSerialized(String resultSerialized) {
		this.resultSerialized = resultSerialized;
	}

}