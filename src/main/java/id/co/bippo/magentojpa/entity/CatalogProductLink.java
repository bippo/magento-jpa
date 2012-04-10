package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the catalog_product_link database table.
 * 
 */
@Entity
@Table(name="catalog_product_link")
public class CatalogProductLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="link_id")
	private int linkId;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="linked_product_id")
	private CatalogProductEntity catalogProductEntity1;

	//bi-directional many-to-one association to CatalogProductLinkType
    @ManyToOne
	@JoinColumn(name="link_type_id")
	private CatalogProductLinkType catalogProductLinkType;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity2;

	//bi-directional many-to-one association to CatalogProductLinkAttributeDecimal
	@OneToMany(mappedBy="catalogProductLink")
	private Set<CatalogProductLinkAttributeDecimal> catalogProductLinkAttributeDecimals;

	//bi-directional many-to-one association to CatalogProductLinkAttributeInt
	@OneToMany(mappedBy="catalogProductLink")
	private Set<CatalogProductLinkAttributeInt> catalogProductLinkAttributeInts;

	//bi-directional many-to-one association to CatalogProductLinkAttributeVarchar
	@OneToMany(mappedBy="catalogProductLink")
	private Set<CatalogProductLinkAttributeVarchar> catalogProductLinkAttributeVarchars;

    public CatalogProductLink() {
    }

	public int getLinkId() {
		return this.linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public CatalogProductEntity getCatalogProductEntity1() {
		return this.catalogProductEntity1;
	}

	public void setCatalogProductEntity1(CatalogProductEntity catalogProductEntity1) {
		this.catalogProductEntity1 = catalogProductEntity1;
	}
	
	public CatalogProductLinkType getCatalogProductLinkType() {
		return this.catalogProductLinkType;
	}

	public void setCatalogProductLinkType(CatalogProductLinkType catalogProductLinkType) {
		this.catalogProductLinkType = catalogProductLinkType;
	}
	
	public CatalogProductEntity getCatalogProductEntity2() {
		return this.catalogProductEntity2;
	}

	public void setCatalogProductEntity2(CatalogProductEntity catalogProductEntity2) {
		this.catalogProductEntity2 = catalogProductEntity2;
	}
	
	public Set<CatalogProductLinkAttributeDecimal> getCatalogProductLinkAttributeDecimals() {
		return this.catalogProductLinkAttributeDecimals;
	}

	public void setCatalogProductLinkAttributeDecimals(Set<CatalogProductLinkAttributeDecimal> catalogProductLinkAttributeDecimals) {
		this.catalogProductLinkAttributeDecimals = catalogProductLinkAttributeDecimals;
	}
	
	public Set<CatalogProductLinkAttributeInt> getCatalogProductLinkAttributeInts() {
		return this.catalogProductLinkAttributeInts;
	}

	public void setCatalogProductLinkAttributeInts(Set<CatalogProductLinkAttributeInt> catalogProductLinkAttributeInts) {
		this.catalogProductLinkAttributeInts = catalogProductLinkAttributeInts;
	}
	
	public Set<CatalogProductLinkAttributeVarchar> getCatalogProductLinkAttributeVarchars() {
		return this.catalogProductLinkAttributeVarchars;
	}

	public void setCatalogProductLinkAttributeVarchars(Set<CatalogProductLinkAttributeVarchar> catalogProductLinkAttributeVarchars) {
		this.catalogProductLinkAttributeVarchars = catalogProductLinkAttributeVarchars;
	}
	
}