package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eav_entity_store database table.
 * 
 */
@Entity
@Table(name="eav_entity_store")
public class EavEntityStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_store_id")
	private int entityStoreId;

	@Column(name="increment_last_id")
	private String incrementLastId;

	@Column(name="increment_prefix")
	private String incrementPrefix;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to EavEntityType
    @ManyToOne
	@JoinColumn(name="entity_type_id")
	private EavEntityType eavEntityType;

    public EavEntityStore() {
    }

	public int getEntityStoreId() {
		return this.entityStoreId;
	}

	public void setEntityStoreId(int entityStoreId) {
		this.entityStoreId = entityStoreId;
	}

	public String getIncrementLastId() {
		return this.incrementLastId;
	}

	public void setIncrementLastId(String incrementLastId) {
		this.incrementLastId = incrementLastId;
	}

	public String getIncrementPrefix() {
		return this.incrementPrefix;
	}

	public void setIncrementPrefix(String incrementPrefix) {
		this.incrementPrefix = incrementPrefix;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public EavEntityType getEavEntityType() {
		return this.eavEntityType;
	}

	public void setEavEntityType(EavEntityType eavEntityType) {
		this.eavEntityType = eavEntityType;
	}
	
}