package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the downloadable_link_title database table.
 * 
 */
@Entity
@Table(name="downloadable_link_title")
public class DownloadableLinkTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="title_id")
	private int titleId;

	private String title;

	//bi-directional many-to-one association to DownloadableLink
    @ManyToOne
	@JoinColumn(name="link_id")
	private DownloadableLink downloadableLink;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public DownloadableLinkTitle() {
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

	public DownloadableLink getDownloadableLink() {
		return this.downloadableLink;
	}

	public void setDownloadableLink(DownloadableLink downloadableLink) {
		this.downloadableLink = downloadableLink;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}