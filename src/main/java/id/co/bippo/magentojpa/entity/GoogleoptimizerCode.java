package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the googleoptimizer_code database table.
 * 
 */
@Entity
@Table(name="googleoptimizer_code")
public class GoogleoptimizerCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="code_id")
	private int codeId;

    @Lob()
	@Column(name="additional_data")
	private String additionalData;

    @Lob()
	@Column(name="control_script")
	private String controlScript;

	@Column(name="conversion_page")
	private String conversionPage;

    @Lob()
	@Column(name="conversion_script")
	private String conversionScript;

	@Column(name="entity_id")
	private int entityId;

	@Column(name="entity_type")
	private String entityType;

    @Lob()
	@Column(name="tracking_script")
	private String trackingScript;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public GoogleoptimizerCode() {
    }

	public int getCodeId() {
		return this.codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public String getAdditionalData() {
		return this.additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}

	public String getControlScript() {
		return this.controlScript;
	}

	public void setControlScript(String controlScript) {
		this.controlScript = controlScript;
	}

	public String getConversionPage() {
		return this.conversionPage;
	}

	public void setConversionPage(String conversionPage) {
		this.conversionPage = conversionPage;
	}

	public String getConversionScript() {
		return this.conversionScript;
	}

	public void setConversionScript(String conversionScript) {
		this.conversionScript = conversionScript;
	}

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getTrackingScript() {
		return this.trackingScript;
	}

	public void setTrackingScript(String trackingScript) {
		this.trackingScript = trackingScript;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}