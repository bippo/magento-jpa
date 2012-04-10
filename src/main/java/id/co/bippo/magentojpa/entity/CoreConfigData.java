package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the core_config_data database table.
 * 
 */
@Entity
@Table(name="core_config_data")
public class CoreConfigData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="config_id")
	private int configId;

	private String path;

	private String scope;

	@Column(name="scope_id")
	private int scopeId;

    @Lob()
	private String value;

    public CoreConfigData() {
    }

	public int getConfigId() {
		return this.configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public int getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(int scopeId) {
		this.scopeId = scopeId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}