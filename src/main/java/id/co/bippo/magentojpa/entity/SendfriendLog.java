package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the sendfriend_log database table.
 * 
 */
@Entity
@Table(name="sendfriend_log")
public class SendfriendLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="log_id")
	private int logId;

	private BigInteger ip;

	private int time;

	@Column(name="website_id")
	private int websiteId;

    public SendfriendLog() {
    }

	public int getLogId() {
		return this.logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public BigInteger getIp() {
		return this.ip;
	}

	public void setIp(BigInteger ip) {
		this.ip = ip;
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getWebsiteId() {
		return this.websiteId;
	}

	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}

}