package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the downloadable_link_purchased database table.
 * 
 */
@Entity
@Table(name="downloadable_link_purchased")
public class DownloadableLinkPurchased implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="purchased_id")
	private int purchasedId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="link_section_title")
	private String linkSectionTitle;

	@Column(name="order_increment_id")
	private String orderIncrementId;

	@Column(name="order_item_id")
	private int orderItemId;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_sku")
	private String productSku;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to SalesFlatOrder
    @ManyToOne
	@JoinColumn(name="order_id")
	private SalesFlatOrder salesFlatOrder;

	//bi-directional many-to-one association to DownloadableLinkPurchasedItem
	@OneToMany(mappedBy="downloadableLinkPurchased")
	private Set<DownloadableLinkPurchasedItem> downloadableLinkPurchasedItems;

    public DownloadableLinkPurchased() {
    }

	public int getPurchasedId() {
		return this.purchasedId;
	}

	public void setPurchasedId(int purchasedId) {
		this.purchasedId = purchasedId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getLinkSectionTitle() {
		return this.linkSectionTitle;
	}

	public void setLinkSectionTitle(String linkSectionTitle) {
		this.linkSectionTitle = linkSectionTitle;
	}

	public String getOrderIncrementId() {
		return this.orderIncrementId;
	}

	public void setOrderIncrementId(String orderIncrementId) {
		this.orderIncrementId = orderIncrementId;
	}

	public int getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductSku() {
		return this.productSku;
	}

	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public CustomerEntity getCustomerEntity() {
		return this.customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
	public SalesFlatOrder getSalesFlatOrder() {
		return this.salesFlatOrder;
	}

	public void setSalesFlatOrder(SalesFlatOrder salesFlatOrder) {
		this.salesFlatOrder = salesFlatOrder;
	}
	
	public Set<DownloadableLinkPurchasedItem> getDownloadableLinkPurchasedItems() {
		return this.downloadableLinkPurchasedItems;
	}

	public void setDownloadableLinkPurchasedItems(Set<DownloadableLinkPurchasedItem> downloadableLinkPurchasedItems) {
		this.downloadableLinkPurchasedItems = downloadableLinkPurchasedItems;
	}
	
}