package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the eav_attribute_set database table.
 * 
 */
@Entity
@Table(name="eav_attribute_set")
public class EavAttributeSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="attribute_set_id")
	private int attributeSetId;

	@Column(name="attribute_set_name")
	private String attributeSetName;

	@Column(name="sort_order")
	private short sortOrder;

	//bi-directional many-to-one association to CatalogProductEntity
	@OneToMany(mappedBy="eavAttributeSet")
	private Set<CatalogProductEntity> catalogProductEntities;

	//bi-directional many-to-one association to EavAttributeGroup
	@OneToMany(mappedBy="eavAttributeSet")
	private Set<EavAttributeGroup> eavAttributeGroups;

	//bi-directional many-to-one association to EavEntityType
    @ManyToOne
	@JoinColumn(name="entity_type_id")
	private EavEntityType eavEntityType;

	//bi-directional many-to-one association to GooglebaseType
	@OneToMany(mappedBy="eavAttributeSet")
	private Set<GooglebaseType> googlebaseTypes;

    public EavAttributeSet() {
    }

	public int getAttributeSetId() {
		return this.attributeSetId;
	}

	public void setAttributeSetId(int attributeSetId) {
		this.attributeSetId = attributeSetId;
	}

	public String getAttributeSetName() {
		return this.attributeSetName;
	}

	public void setAttributeSetName(String attributeSetName) {
		this.attributeSetName = attributeSetName;
	}

	public short getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(short sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Set<CatalogProductEntity> getCatalogProductEntities() {
		return this.catalogProductEntities;
	}

	public void setCatalogProductEntities(Set<CatalogProductEntity> catalogProductEntities) {
		this.catalogProductEntities = catalogProductEntities;
	}
	
	public Set<EavAttributeGroup> getEavAttributeGroups() {
		return this.eavAttributeGroups;
	}

	public void setEavAttributeGroups(Set<EavAttributeGroup> eavAttributeGroups) {
		this.eavAttributeGroups = eavAttributeGroups;
	}
	
	public EavEntityType getEavEntityType() {
		return this.eavEntityType;
	}

	public void setEavEntityType(EavEntityType eavEntityType) {
		this.eavEntityType = eavEntityType;
	}
	
	public Set<GooglebaseType> getGooglebaseTypes() {
		return this.googlebaseTypes;
	}

	public void setGooglebaseTypes(Set<GooglebaseType> googlebaseTypes) {
		this.googlebaseTypes = googlebaseTypes;
	}
	
}