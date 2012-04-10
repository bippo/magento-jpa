package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the googlecheckout_api_debug database table.
 * 
 */
@Entity
@Table(name="googlecheckout_api_debug")
public class GooglecheckoutApiDebug implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="debug_id")
	private int debugId;

	private String dir;

    @Lob()
	@Column(name="request_body")
	private String requestBody;

    @Lob()
	@Column(name="response_body")
	private String responseBody;

	private String url;

    public GooglecheckoutApiDebug() {
    }

	public int getDebugId() {
		return this.debugId;
	}

	public void setDebugId(int debugId) {
		this.debugId = debugId;
	}

	public String getDir() {
		return this.dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}