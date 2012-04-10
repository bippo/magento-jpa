package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the downloadable_link database table.
 * 
 */
@Entity
@Table(name="downloadable_link")
public class DownloadableLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="link_id")
	private int linkId;

	@Column(name="is_shareable")
	private int isShareable;

	@Column(name="link_file")
	private String linkFile;

	@Column(name="link_type")
	private String linkType;

	@Column(name="link_url")
	private String linkUrl;

	@Column(name="number_of_downloads")
	private int numberOfDownloads;

	@Column(name="sample_file")
	private String sampleFile;

	@Column(name="sample_type")
	private String sampleType;

	@Column(name="sample_url")
	private String sampleUrl;

	@Column(name="sort_order")
	private int sortOrder;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to DownloadableLinkPrice
	@OneToMany(mappedBy="downloadableLink")
	private Set<DownloadableLinkPrice> downloadableLinkPrices;

	//bi-directional many-to-one association to DownloadableLinkTitle
	@OneToMany(mappedBy="downloadableLink")
	private Set<DownloadableLinkTitle> downloadableLinkTitles;

    public DownloadableLink() {
    }

	public int getLinkId() {
		return this.linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public int getIsShareable() {
		return this.isShareable;
	}

	public void setIsShareable(int isShareable) {
		this.isShareable = isShareable;
	}

	public String getLinkFile() {
		return this.linkFile;
	}

	public void setLinkFile(String linkFile) {
		this.linkFile = linkFile;
	}

	public String getLinkType() {
		return this.linkType;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public int getNumberOfDownloads() {
		return this.numberOfDownloads;
	}

	public void setNumberOfDownloads(int numberOfDownloads) {
		this.numberOfDownloads = numberOfDownloads;
	}

	public String getSampleFile() {
		return this.sampleFile;
	}

	public void setSampleFile(String sampleFile) {
		this.sampleFile = sampleFile;
	}

	public String getSampleType() {
		return this.sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	public String getSampleUrl() {
		return this.sampleUrl;
	}

	public void setSampleUrl(String sampleUrl) {
		this.sampleUrl = sampleUrl;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public Set<DownloadableLinkPrice> getDownloadableLinkPrices() {
		return this.downloadableLinkPrices;
	}

	public void setDownloadableLinkPrices(Set<DownloadableLinkPrice> downloadableLinkPrices) {
		this.downloadableLinkPrices = downloadableLinkPrices;
	}
	
	public Set<DownloadableLinkTitle> getDownloadableLinkTitles() {
		return this.downloadableLinkTitles;
	}

	public void setDownloadableLinkTitles(Set<DownloadableLinkTitle> downloadableLinkTitles) {
		this.downloadableLinkTitles = downloadableLinkTitles;
	}
	
}