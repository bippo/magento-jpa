package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the catalog_product_entity_media_gallery database table.
 * 
 */
@Entity
@Table(name="catalog_product_entity_media_gallery")
public class CatalogProductEntityMediaGallery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

	private String value;

	//bi-directional many-to-one association to EavAttribute
    @ManyToOne
	@JoinColumn(name="attribute_id")
	private EavAttribute eavAttribute;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="entity_id")
	private CatalogProductEntity catalogProductEntity;

//	//bi-directional many-to-one association to CatalogProductEntityMediaGalleryValue
//	@OneToMany(mappedBy="catalogProductEntityMediaGallery")
//	private Set<CatalogProductEntityMediaGalleryValue> catalogProductEntityMediaGalleryValues;

    public CatalogProductEntityMediaGallery() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public EavAttribute getEavAttribute() {
		return this.eavAttribute;
	}

	public void setEavAttribute(EavAttribute eavAttribute) {
		this.eavAttribute = eavAttribute;
	}
	
	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
//	public Set<CatalogProductEntityMediaGalleryValue> getCatalogProductEntityMediaGalleryValues() {
//		return this.catalogProductEntityMediaGalleryValues;
//	}
//
//	public void setCatalogProductEntityMediaGalleryValues(Set<CatalogProductEntityMediaGalleryValue> catalogProductEntityMediaGalleryValues) {
//		this.catalogProductEntityMediaGalleryValues = catalogProductEntityMediaGalleryValues;
//	}
	
}