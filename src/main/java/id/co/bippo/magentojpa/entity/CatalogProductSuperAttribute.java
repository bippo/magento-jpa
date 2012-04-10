package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the catalog_product_super_attribute database table.
 * 
 */
@Entity
@Table(name="catalog_product_super_attribute")
public class CatalogProductSuperAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_super_attribute_id")
	private int productSuperAttributeId;

	@Column(name="attribute_id")
	private int attributeId;

	private int position;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CatalogProductSuperAttributeLabel
	@OneToMany(mappedBy="catalogProductSuperAttribute")
	private Set<CatalogProductSuperAttributeLabel> catalogProductSuperAttributeLabels;

	//bi-directional many-to-one association to CatalogProductSuperAttributePricing
	@OneToMany(mappedBy="catalogProductSuperAttribute")
	private Set<CatalogProductSuperAttributePricing> catalogProductSuperAttributePricings;

    public CatalogProductSuperAttribute() {
    }

	public int getProductSuperAttributeId() {
		return this.productSuperAttributeId;
	}

	public void setProductSuperAttributeId(int productSuperAttributeId) {
		this.productSuperAttributeId = productSuperAttributeId;
	}

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public Set<CatalogProductSuperAttributeLabel> getCatalogProductSuperAttributeLabels() {
		return this.catalogProductSuperAttributeLabels;
	}

	public void setCatalogProductSuperAttributeLabels(Set<CatalogProductSuperAttributeLabel> catalogProductSuperAttributeLabels) {
		this.catalogProductSuperAttributeLabels = catalogProductSuperAttributeLabels;
	}
	
	public Set<CatalogProductSuperAttributePricing> getCatalogProductSuperAttributePricings() {
		return this.catalogProductSuperAttributePricings;
	}

	public void setCatalogProductSuperAttributePricings(Set<CatalogProductSuperAttributePricing> catalogProductSuperAttributePricings) {
		this.catalogProductSuperAttributePricings = catalogProductSuperAttributePricings;
	}
	
}