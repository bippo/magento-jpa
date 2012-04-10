package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the catalog_product_link_attribute database table.
 * 
 */
@Entity
@Table(name="catalog_product_link_attribute")
public class CatalogProductLinkAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_link_attribute_id")
	private int productLinkAttributeId;

	@Column(name="data_type")
	private String dataType;

	@Column(name="product_link_attribute_code")
	private String productLinkAttributeCode;

	//bi-directional many-to-one association to CatalogProductLinkType
    @ManyToOne
	@JoinColumn(name="link_type_id")
	private CatalogProductLinkType catalogProductLinkType;

	//bi-directional many-to-one association to CatalogProductLinkAttributeDecimal
	@OneToMany(mappedBy="catalogProductLinkAttribute")
	private Set<CatalogProductLinkAttributeDecimal> catalogProductLinkAttributeDecimals;

	//bi-directional many-to-one association to CatalogProductLinkAttributeInt
	@OneToMany(mappedBy="catalogProductLinkAttribute")
	private Set<CatalogProductLinkAttributeInt> catalogProductLinkAttributeInts;

	//bi-directional many-to-one association to CatalogProductLinkAttributeVarchar
	@OneToMany(mappedBy="catalogProductLinkAttribute")
	private Set<CatalogProductLinkAttributeVarchar> catalogProductLinkAttributeVarchars;

    public CatalogProductLinkAttribute() {
    }

	public int getProductLinkAttributeId() {
		return this.productLinkAttributeId;
	}

	public void setProductLinkAttributeId(int productLinkAttributeId) {
		this.productLinkAttributeId = productLinkAttributeId;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getProductLinkAttributeCode() {
		return this.productLinkAttributeCode;
	}

	public void setProductLinkAttributeCode(String productLinkAttributeCode) {
		this.productLinkAttributeCode = productLinkAttributeCode;
	}

	public CatalogProductLinkType getCatalogProductLinkType() {
		return this.catalogProductLinkType;
	}

	public void setCatalogProductLinkType(CatalogProductLinkType catalogProductLinkType) {
		this.catalogProductLinkType = catalogProductLinkType;
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