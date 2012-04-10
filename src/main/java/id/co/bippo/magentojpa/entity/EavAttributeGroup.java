package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the eav_attribute_group database table.
 * 
 */
@Entity
@Table(name="eav_attribute_group")
public class EavAttributeGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="attribute_group_id")
	private int attributeGroupId;

	@Column(name="attribute_group_name")
	private String attributeGroupName;

	@Column(name="default_id")
	private int defaultId;

	@Column(name="sort_order")
	private short sortOrder;

	//bi-directional many-to-one association to EavAttributeSet
    @ManyToOne
	@JoinColumn(name="attribute_set_id")
	private EavAttributeSet eavAttributeSet;

	//bi-directional many-to-one association to EavEntityAttribute
	@OneToMany(mappedBy="eavAttributeGroup")
	private Set<EavEntityAttribute> eavEntityAttributes;

    public EavAttributeGroup() {
    }

	public int getAttributeGroupId() {
		return this.attributeGroupId;
	}

	public void setAttributeGroupId(int attributeGroupId) {
		this.attributeGroupId = attributeGroupId;
	}

	public String getAttributeGroupName() {
		return this.attributeGroupName;
	}

	public void setAttributeGroupName(String attributeGroupName) {
		this.attributeGroupName = attributeGroupName;
	}

	public int getDefaultId() {
		return this.defaultId;
	}

	public void setDefaultId(int defaultId) {
		this.defaultId = defaultId;
	}

	public short getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(short sortOrder) {
		this.sortOrder = sortOrder;
	}

	public EavAttributeSet getEavAttributeSet() {
		return this.eavAttributeSet;
	}

	public void setEavAttributeSet(EavAttributeSet eavAttributeSet) {
		this.eavAttributeSet = eavAttributeSet;
	}
	
	public Set<EavEntityAttribute> getEavEntityAttributes() {
		return this.eavEntityAttributes;
	}

	public void setEavEntityAttributes(Set<EavEntityAttribute> eavEntityAttributes) {
		this.eavEntityAttributes = eavEntityAttributes;
	}
	
}