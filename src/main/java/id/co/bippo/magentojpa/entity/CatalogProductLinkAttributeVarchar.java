package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_link_attribute_varchar database table.
 * 
 */
@Entity
@Table(name="catalog_product_link_attribute_varchar")
public class CatalogProductLinkAttributeVarchar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="value_id")
	private int valueId;

	private String value;

	//bi-directional many-to-one association to CatalogProductLink
    @ManyToOne
	@JoinColumn(name="link_id")
	private CatalogProductLink catalogProductLink;

	//bi-directional many-to-one association to CatalogProductLinkAttribute
    @ManyToOne
	@JoinColumn(name="product_link_attribute_id")
	private CatalogProductLinkAttribute catalogProductLinkAttribute;

    public CatalogProductLinkAttributeVarchar() {
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