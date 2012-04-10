package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eav_entity_attribute database table.
 * 
 */
@Entity
@Table(name="eav_entity_attribute")
public class EavEntityAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="entity_attribute_id")
	private int entityAttributeId;

	@Column(name="attribute_set_id")
	private int attributeSetId;

	@Column(name="entity_type_id")
	private int entityTypeId;

	@Column(name="sort_order")
	private short sortOrder;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

	//bi-directional many-to-one association to EavAttributeGroup
    @ManyToOne
	@JoinColumn(name="attribute_group_id")
	private EavAttributeGroup eavAttributeGroup;

    public EavEntityAttribute() {
    }

	public int getEntityAttributeId() {
		return this.entityAttributeId;
	}

	public void setEntityAttributeId(int entityAttributeId) {
		this.entityAttributeId = entityAttributeId;
	}

	public int getAttributeSetId() {
		return this.attributeSetId;
	}

	public void setAttributeSetId(int attributeSetId) {
		this.attributeSetId = attributeSetId;
	}

	public int getEntityTypeId() {
		return this.entityTypeId;
	}

	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public short getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(short sortOrder) {
		this.sortOrder = sortOrder;
	}

	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
	public EavAttributeGroup getEavAttributeGroup() {
		return this.eavAttributeGroup;
	}

	public void setEavAttributeGroup(EavAttributeGroup eavAttributeGroup) {
		this.eavAttributeGroup = eavAttributeGroup;
	}
	
}