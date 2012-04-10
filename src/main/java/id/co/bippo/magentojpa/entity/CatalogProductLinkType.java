package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the catalog_product_link_type database table.
 * 
 */
@Entity
@Table(name="catalog_product_link_type")
public class CatalogProductLinkType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="link_type_id")
	private int linkTypeId;

	private String code;

	//bi-directional many-to-one association to CatalogProductLink
	@OneToMany(mappedBy="catalogProductLinkType")
	private Set<CatalogProductLink> catalogProductLinks;

	//bi-directional many-to-one association to CatalogProductLinkAttribute
	@OneToMany(mappedBy="catalogProductLinkType")
	private Set<CatalogProductLinkAttribute> catalogProductLinkAttributes;

    public CatalogProductLinkType() {
    }

	public int getLinkTypeId() {
		return this.linkTypeId;
	}

	public void setLinkTypeId(int linkTypeId) {
		this.linkTypeId = linkTypeId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set<CatalogProductLink> getCatalogProductLinks() {
		return this.catalogProductLinks;
	}

	public void setCatalogProductLinks(Set<CatalogProductLink> catalogProductLinks) {
		this.catalogProductLinks = catalogProductLinks;
	}
	
	public Set<CatalogProductLinkAttribute> getCatalogProductLinkAttributes() {
		return this.catalogProductLinkAttributes;
	}

	public void setCatalogProductLinkAttributes(Set<CatalogProductLinkAttribute> catalogProductLinkAttributes) {
		this.catalogProductLinkAttributes = catalogProductLinkAttributes;
	}
	
}