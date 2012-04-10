package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the xmlconnect_application database table.
 * 
 */
@Entity
@Table(name="xmlconnect_application")
public class XmlconnectApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="application_id")
	private int applicationId;

    @Temporal( TemporalType.DATE)
	@Column(name="active_from")
	private Date activeFrom;

    @Temporal( TemporalType.DATE)
	@Column(name="active_to")
	private Date activeTo;

	@Column(name="browsing_mode")
	private int browsingMode;

	private String code;

	private String name;

	private int status;

	private String type;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to XmlconnectConfigData
	@OneToMany(mappedBy="xmlconnectApplication")
	private Set<XmlconnectConfigData> xmlconnectConfigData;

	//bi-directional many-to-one association to XmlconnectHistory
	@OneToMany(mappedBy="xmlconnectApplication")
	private Set<XmlconnectHistory> xmlconnectHistories;

	//bi-directional many-to-one association to XmlconnectNotificationTemplate
	@OneToMany(mappedBy="xmlconnectApplication")
	private Set<XmlconnectNotificationTemplate> xmlconnectNotificationTemplates;

    public XmlconnectApplication() {
    }

	public int getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public Date getActiveFrom() {
		return this.activeFrom;
	}

	public void setActiveFrom(Date activeFrom) {
		this.activeFrom = activeFrom;
	}

	public Date getActiveTo() {
		return this.activeTo;
	}

	public void setActiveTo(Date activeTo) {
		this.activeTo = activeTo;
	}

	public int getBrowsingMode() {
		return this.browsingMode;
	}

	public void setBrowsingMode(int browsingMode) {
		this.browsingMode = browsingMode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<XmlconnectConfigData> getXmlconnectConfigData() {
		return this.xmlconnectConfigData;
	}

	public void setXmlconnectConfigData(Set<XmlconnectConfigData> xmlconnectConfigData) {
		this.xmlconnectConfigData = xmlconnectConfigData;
	}
	
	public Set<XmlconnectHistory> getXmlconnectHistories() {
		return this.xmlconnectHistories;
	}

	public void setXmlconnectHistories(Set<XmlconnectHistory> xmlconnectHistories) {
		this.xmlconnectHistories = xmlconnectHistories;
	}
	
	public Set<XmlconnectNotificationTemplate> getXmlconnectNotificationTemplates() {
		return this.xmlconnectNotificationTemplates;
	}

	public void setXmlconnectNotificationTemplates(Set<XmlconnectNotificationTemplate> xmlconnectNotificationTemplates) {
		this.xmlconnectNotificationTemplates = xmlconnectNotificationTemplates;
	}
	
}