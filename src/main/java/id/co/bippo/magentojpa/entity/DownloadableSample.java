package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the downloadable_sample database table.
 * 
 */
@Entity
@Table(name="downloadable_sample")
public class DownloadableSample implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sample_id")
	private int sampleId;

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

	//bi-directional many-to-one association to DownloadableSampleTitle
	@OneToMany(mappedBy="downloadableSample")
	private Set<DownloadableSampleTitle> downloadableSampleTitles;

    public DownloadableSample() {
    }

	public int getSampleId() {
		return this.sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
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
	
	public Set<DownloadableSampleTitle> getDownloadableSampleTitles() {
		return this.downloadableSampleTitles;
	}

	public void setDownloadableSampleTitles(Set<DownloadableSampleTitle> downloadableSampleTitles) {
		this.downloadableSampleTitles = downloadableSampleTitles;
	}
	
}