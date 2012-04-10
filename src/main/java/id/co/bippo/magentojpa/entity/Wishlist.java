package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the wishlist database table.
 * 
 */
@Entity
@Table(name="wishlist")
public class Wishlist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="wishlist_id")
	private int wishlistId;

	private int shared;

	@Column(name="sharing_code")
	private String sharingCode;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne
	@JoinColumn(name="customer_id")
	private CustomerEntity customerEntity;

	//bi-directional many-to-one association to WishlistItem
	@OneToMany(mappedBy="wishlist")
	private Set<WishlistItem> wishlistItems;

    public Wishlist() {
    }

	public int getWishlistId() {
		return this.wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public int getShared() {
		return this.shared;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}

	public String getSharingCode() {
		return this.sharingCode;
	}

	public void setSharingCode(String sharingCode) {
		this.sharingCode = sharingCode;
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
	
	public Set<WishlistItem> getWishlistItems() {
		return this.wishlistItems;
	}

	public void setWishlistItems(Set<WishlistItem> wishlistItems) {
		this.wishlistItems = wishlistItems;
	}
	
}