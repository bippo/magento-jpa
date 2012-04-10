package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the catalog_product_index_website database table.
 * 
 */
@Entity
@Table(name="catalog_product_index_website")
public class CatalogProductIndexWebsite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="website_id")
	private int websiteId;

	private float rate;

    @Temporal( TemporalType.DATE)
	@Column(name="website_date")
	private Date websiteDate;

	//bi-directional one-to-one association to CoreWebsite
	@OneToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

    public CatalogProductIndexWebsite() {
    }

	public int getWebsiteId() {
		return this.websiteId;
	}

	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}

	public float getRate() {
		return this.rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Date getWebsiteDate() {
		return this.websiteDate;
	}

	public void setWebsiteDate(Date websiteDate) {
		this.websiteDate = websiteDate;
	}

	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
}