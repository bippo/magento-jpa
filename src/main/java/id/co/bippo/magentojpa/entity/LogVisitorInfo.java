package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the log_visitor_info database table.
 * 
 */
@Entity
@Table(name="log_visitor_info")
public class LogVisitorInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="visitor_id")
	private String visitorId;

	@Column(name="http_accept_charset")
	private String httpAcceptCharset;

	@Column(name="http_accept_language")
	private String httpAcceptLanguage;

	@Column(name="http_referer")
	private String httpReferer;

	@Column(name="http_user_agent")
	private String httpUserAgent;

	@Column(name="remote_addr")
	private BigInteger remoteAddr;

	@Column(name="server_addr")
	private BigInteger serverAddr;

    public LogVisitorInfo() {
    }

	public String getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public String getHttpAcceptCharset() {
		return this.httpAcceptCharset;
	}

	public void setHttpAcceptCharset(String httpAcceptCharset) {
		this.httpAcceptCharset = httpAcceptCharset;
	}

	public String getHttpAcceptLanguage() {
		return this.httpAcceptLanguage;
	}

	public void setHttpAcceptLanguage(String httpAcceptLanguage) {
		this.httpAcceptLanguage = httpAcceptLanguage;
	}

	public String getHttpReferer() {
		return this.httpReferer;
	}

	public void setHttpReferer(String httpReferer) {
		this.httpReferer = httpReferer;
	}

	public String getHttpUserAgent() {
		return this.httpUserAgent;
	}

	public void setHttpUserAgent(String httpUserAgent) {
		this.httpUserAgent = httpUserAgent;
	}

	public BigInteger getRemoteAddr() {
		return this.remoteAddr;
	}

	public void setRemoteAddr(BigInteger remoteAddr) {
		this.remoteAddr = remoteAddr;
	}

	public BigInteger getServerAddr() {
		return this.serverAddr;
	}

	public void setServerAddr(BigInteger serverAddr) {
		this.serverAddr = serverAddr;
	}

}