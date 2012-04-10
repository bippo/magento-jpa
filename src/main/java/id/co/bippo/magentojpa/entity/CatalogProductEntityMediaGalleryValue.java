package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catalog_product_entity_media_gallery_value database table.
 * 
 */
@Entity
@Table(name="catalog_product_entity_media_gallery_value")
public class CatalogProductEntityMediaGalleryValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CatalogProductEntityMediaGalleryValuePK id;

	private int disabled;

	private String label;

	private int position;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to CatalogProductEntityMediaGallery
    @ManyToOne
	@JoinColumn(name="value_id")
	private CatalogProductEntityMediaGallery catalogProductEntityMediaGallery;

    public CatalogProductEntityMediaGalleryValue() {
    }

	public CatalogProductEntityMediaGalleryValuePK getId() {
		return this.id;
	}

	public void setId(CatalogProductEntityMediaGalleryValuePK id) {
		this.id = id;
	}
	
	public int getDisabled() {
		return this.disabled;
	}

	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public CatalogProductEntityMediaGallery getCatalogProductEntityMediaGallery() {
		return this.catalogProductEntityMediaGallery;
	}

	public void setCatalogProductEntityMediaGallery(CatalogProductEntityMediaGallery catalogProductEntityMediaGallery) {
		this.catalogProductEntityMediaGallery = catalogProductEntityMediaGallery;
	}
	
}