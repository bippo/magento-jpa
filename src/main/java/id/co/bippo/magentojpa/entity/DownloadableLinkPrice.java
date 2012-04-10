package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the downloadable_link_price database table.
 * 
 */
@Entity
@Table(name="downloadable_link_price")
public class DownloadableLinkPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="price_id")
	private int priceId;

	private BigDecimal price;

	//bi-directional many-to-one association to DownloadableLink
    @ManyToOne
	@JoinColumn(name="link_id")
	private DownloadableLink downloadableLink;

	//bi-directional many-to-one association to CoreWebsite
    @ManyToOne
	@JoinColumn(name="website_id")
	private CoreWebsite coreWebsite;

    public DownloadableLinkPrice() {
    }

	public int getPriceId() {
		return this.priceId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public DownloadableLink getDownloadableLink() {
		return this.downloadableLink;
	}

	public void setDownloadableLink(DownloadableLink downloadableLink) {
		this.downloadableLink = downloadableLink;
	}
	
	public CoreWebsite getCoreWebsite() {
		return this.coreWebsite;
	}

	public void setCoreWebsite(CoreWebsite coreWebsite) {
		this.coreWebsite = coreWebsite;
	}
	
}