package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the xmlconnect_config_data database table.
 * 
 */
@Entity
@Table(name="xmlconnect_config_data")
public class XmlconnectConfigData implements Serializable {
	private static final long serialVersionUID = 1L;

	private String category;

	private String path;

    @Lob()
	private String value;

	//bi-directional many-to-one association to XmlconnectApplication
    @ManyToOne
	@JoinColumn(name="application_id")
	private XmlconnectApplication xmlconnectApplication;

    public XmlconnectConfigData() {
    }

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public XmlconnectApplication getXmlconnectApplication() {
		return this.xmlconnectApplication;
	}

	public void setXmlconnectApplication(XmlconnectApplication xmlconnectApplication) {
		this.xmlconnectApplication = xmlconnectApplication;
	}
	
}