package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the downloadable_sample_title database table.
 * 
 */
@Entity
@Table(name="downloadable_sample_title")
public class DownloadableSampleTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="title_id")
	private int titleId;

	private String title;

	//bi-directional many-to-one association to DownloadableSample
    @ManyToOne
	@JoinColumn(name="sample_id")
	private DownloadableSample downloadableSample;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public DownloadableSampleTitle() {
    }

	public int getTitleId() {
		return this.titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DownloadableSample getDownloadableSample() {
		return this.downloadableSample;
	}

	public void setDownloadableSample(DownloadableSample downloadableSample) {
		this.downloadableSample = downloadableSample;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}