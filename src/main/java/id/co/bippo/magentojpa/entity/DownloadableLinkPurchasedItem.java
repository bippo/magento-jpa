package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the downloadable_link_purchased_item database table.
 * 
 */
@Entity
@Table(name="downloadable_link_purchased_item")
public class DownloadableLinkPurchasedItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id")
	private int itemId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="is_shareable")
	private int isShareable;

	@Column(name="link_file")
	private String linkFile;

	@Column(name="link_hash")
	private String linkHash;

	@Column(name="link_id")
	private int linkId;

	@Column(name="link_title")
	private String linkTitle;

	@Column(name="link_type")
	private String linkType;

	@Column(name="link_url")
	private String linkUrl;

	@Column(name="number_of_downloads_bought")
	private int numberOfDownloadsBought;

	@Column(name="number_of_downloads_used")
	private int numberOfDownloadsUsed;

	@Column(name="product_id")
	private int productId;

	private String status;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to DownloadableLinkPurchased
    @ManyToOne
	@JoinColumn(name="purchased_id")
	private DownloadableLinkPurchased downloadableLinkPurchased;

	//bi-directional many-to-one association to SalesFlatOrderItem
    @ManyToOne
	@JoinColumn(name="order_item_id")
	private SalesFlatOrderItem salesFlatOrderItem;

    public DownloadableLinkPurchasedItem() {
    }

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
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

	public String getLinkHash() {
		return this.linkHash;
	}

	public void setLinkHash(String linkHash) {
		this.linkHash = linkHash;
	}

	public int getLinkId() {
		return this.linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public String getLinkTitle() {
		return this.linkTitle;
	}

	public void setLinkTitle(String linkTitle) {
		this.linkTitle = linkTitle;
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

	public int getNumberOfDownloadsBought() {
		return this.numberOfDownloadsBought;
	}

	public void setNumberOfDownloadsBought(int numberOfDownloadsBought) {
		this.numberOfDownloadsBought = numberOfDownloadsBought;
	}

	public int getNumberOfDownloadsUsed() {
		return this.numberOfDownloadsUsed;
	}

	public void setNumberOfDownloadsUsed(int numberOfDownloadsUsed) {
		this.numberOfDownloadsUsed = numberOfDownloadsUsed;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public DownloadableLinkPurchased getDownloadableLinkPurchased() {
		return this.downloadableLinkPurchased;
	}

	public void setDownloadableLinkPurchased(DownloadableLinkPurchased downloadableLinkPurchased) {
		this.downloadableLinkPurchased = downloadableLinkPurchased;
	}
	
	public SalesFlatOrderItem getSalesFlatOrderItem() {
		return this.salesFlatOrderItem;
	}

	public void setSalesFlatOrderItem(SalesFlatOrderItem salesFlatOrderItem) {
		this.salesFlatOrderItem = salesFlatOrderItem;
	}
	
}