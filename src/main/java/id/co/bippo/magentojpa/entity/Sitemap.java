package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sitemap database table.
 * 
 */
@Entity
@Table(name="sitemap")
public class Sitemap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sitemap_id")
	private int sitemapId;

	@Column(name="sitemap_filename")
	private String sitemapFilename;

	@Column(name="sitemap_path")
	private String sitemapPath;

	@Column(name="sitemap_time")
	private Timestamp sitemapTime;

	@Column(name="sitemap_type")
	private String sitemapType;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public Sitemap() {
    }

	public int getSitemapId() {
		return this.sitemapId;
	}

	public void setSitemapId(int sitemapId) {
		this.sitemapId = sitemapId;
	}

	public String getSitemapFilename() {
		return this.sitemapFilename;
	}

	public void setSitemapFilename(String sitemapFilename) {
		this.sitemapFilename = sitemapFilename;
	}

	public String getSitemapPath() {
		return this.sitemapPath;
	}

	public void setSitemapPath(String sitemapPath) {
		this.sitemapPath = sitemapPath;
	}

	public Timestamp getSitemapTime() {
		return this.sitemapTime;
	}

	public void setSitemapTime(Timestamp sitemapTime) {
		this.sitemapTime = sitemapTime;
	}

	public String getSitemapType() {
		return this.sitemapType;
	}

	public void setSitemapType(String sitemapType) {
		this.sitemapType = sitemapType;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}