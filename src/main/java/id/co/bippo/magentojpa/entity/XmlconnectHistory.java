package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the xmlconnect_history database table.
 * 
 */
@Entity
@Table(name="xmlconnect_history")
public class XmlconnectHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="history_id")
	private int historyId;

	@Column(name="activation_key")
	private String activationKey;

	private String code;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String name;

    @Lob()
	private byte[] params;

	@Column(name="store_id")
	private int storeId;

	private String title;

	//bi-directional many-to-one association to XmlconnectApplication
    @ManyToOne
	@JoinColumn(name="application_id")
	private XmlconnectApplication xmlconnectApplication;

    public XmlconnectHistory() {
    }

	public int getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public String getActivationKey() {
		return this.activationKey;
	}

	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getParams() {
		return this.params;
	}

	public void setParams(byte[] params) {
		this.params = params;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public XmlconnectApplication getXmlconnectApplication() {
		return this.xmlconnectApplication;
	}

	public void setXmlconnectApplication(XmlconnectApplication xmlconnectApplication) {
		this.xmlconnectApplication = xmlconnectApplication;
	}
	
}