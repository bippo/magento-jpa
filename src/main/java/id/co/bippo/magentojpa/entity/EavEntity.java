package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the eav_entity database table.
 * 
 */
@Entity
@Table(name="eav_entity")
public class EavEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_id")
	private int entityId;

	@Column(name="attribute_set_id")
	private int attributeSetId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="increment_id")
	private String incrementId;

	@Column(name="is_active")
	private int isActive;

	@Column(name="parent_id")
	private int parentId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to EavEntityType
    @ManyToOne
	@JoinColumn(name="entity_type_id")
	private EavEntityType eavEntityType;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to EavEntityDatetime
	@OneToMany(mappedBy="eavEntity")
	private Set<EavEntityDatetime> eavEntityDatetimes;

	//bi-directional many-to-one association to EavEntityDecimal
	@OneToMany(mappedBy="eavEntity")
	private Set<EavEntityDecimal> eavEntityDecimals;

	//bi-directional many-to-one association to EavEntityInt
	@OneToMany(mappedBy="eavEntity")
	private Set<EavEntityInt> eavEntityInts;

	//bi-directional many-to-one association to EavEntityText
	@OneToMany(mappedBy="eavEntity")
	private Set<EavEntityText> eavEntityTexts;

	//bi-directional many-to-one association to EavEntityVarchar
	@OneToMany(mappedBy="eavEntity")
	private Set<EavEntityVarchar> eavEntityVarchars;

    public EavEntity() {
    }

	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public int getAttributeSetId() {
		return this.attributeSetId;
	}

	public void setAttributeSetId(int attributeSetId) {
		this.attributeSetId = attributeSetId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getIncrementId() {
		return this.incrementId;
	}

	public void setIncrementId(String incrementId) {
		this.incrementId = incrementId;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public EavEntityType getEavEntityType() {
		return this.eavEntityType;
	}

	public void setEavEntityType(EavEntityType eavEntityType) {
		this.eavEntityType = eavEntityType;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Set<EavEntityDatetime> getEavEntityDatetimes() {
		return this.eavEntityDatetimes;
	}

	public void setEavEntityDatetimes(Set<EavEntityDatetime> eavEntityDatetimes) {
		this.eavEntityDatetimes = eavEntityDatetimes;
	}
	
	public Set<EavEntityDecimal> getEavEntityDecimals() {
		return this.eavEntityDecimals;
	}

	public void setEavEntityDecimals(Set<EavEntityDecimal> eavEntityDecimals) {
		this.eavEntityDecimals = eavEntityDecimals;
	}
	
	public Set<EavEntityInt> getEavEntityInts() {
		return this.eavEntityInts;
	}

	public void setEavEntityInts(Set<EavEntityInt> eavEntityInts) {
		this.eavEntityInts = eavEntityInts;
	}
	
	public Set<EavEntityText> getEavEntityTexts() {
		return this.eavEntityTexts;
	}

	public void setEavEntityTexts(Set<EavEntityText> eavEntityTexts) {
		this.eavEntityTexts = eavEntityTexts;
	}
	
	public Set<EavEntityVarchar> getEavEntityVarchars() {
		return this.eavEntityVarchars;
	}

	public void setEavEntityVarchars(Set<EavEntityVarchar> eavEntityVarchars) {
		this.eavEntityVarchars = eavEntityVarchars;
	}
	
}