package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_link_attribute_int database table.
 * 
 */
@Entity
@Table(name="catalog_product_link_attribute_int")
public class CatalogProductLinkAttributeInt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

	private int value;

	//bi-directional many-to-one association to CatalogProductLink
    @ManyToOne
	@JoinColumn(name="link_id")
	private CatalogProductLink catalogProductLink;

	//bi-directional many-to-one association to CatalogProductLinkAttribute
    @ManyToOne
	@JoinColumn(name="product_link_attribute_id")
	private CatalogProductLinkAttribute catalogProductLinkAttribute;

    public CatalogProductLinkAttributeInt() {
    }

	public int getValueId() {
		return this.valueId;
	}

	public void setValueId(int valueId) {
		this.valueId = valueId;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public CatalogProductLink getCatalogProductLink() {
		return this.catalogProductLink;
	}

	public void setCatalogProductLink(CatalogProductLink catalogProductLink) {
		this.catalogProductLink = catalogProductLink;
	}
	
	public CatalogProductLinkAttribute getCatalogProductLinkAttribute() {
		return this.catalogProductLinkAttribute;
	}

	public void setCatalogProductLinkAttribute(CatalogProductLinkAttribute catalogProductLinkAttribute) {
		this.catalogProductLinkAttribute = catalogProductLinkAttribute;
	}
	
}