package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eav_entity_int database table.
 * 
 */
@Entity
@Table(name="eav_entity_int")
public class EavEntityInt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

	@Column(name="attribute_id")
	private int attributeId;

	private int value;

	//bi-directional many-to-one association to EavEntity
    @ManyToOne
	@JoinColumn(name="entity_id")
	private EavEntity eavEntity;

	//bi-directional many-to-one association to EavEntityType
    @ManyToOne
	@JoinColumn(name="entity_type_id")
	private EavEntityType eavEntityType;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public EavEntityInt() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public EavEntity getEavEntity() {
		return this.eavEntity;
	}

	public void setEavEntity(EavEntity eavEntity) {
		this.eavEntity = eavEntity;
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
	
}