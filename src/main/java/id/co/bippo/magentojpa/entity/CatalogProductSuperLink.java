package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_super_link database table.
 * 
 */
@Entity
@Table(name="catalog_product_super_link")
public class CatalogProductSuperLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="link_id")
	private int linkId;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="parent_id")
	private CatalogProductEntity catalogProductEntity1;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity2;

    public CatalogProductSuperLink() {
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
	
	public CatalogProductEntity getCatalogProductEntity2() {
		return this.catalogProductEntity2;
	}

	public void setCatalogProductEntity2(CatalogProductEntity catalogProductEntity2) {
		this.catalogProductEntity2 = catalogProductEntity2;
	}
	
}