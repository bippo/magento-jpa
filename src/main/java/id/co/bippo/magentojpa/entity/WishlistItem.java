package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the wishlist_item database table.
 * 
 */
@Entity
@Table(name="wishlist_item")
public class WishlistItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="wishlist_item_id")
	private int wishlistItemId;

	@Column(name="added_at")
	private Timestamp addedAt;

    @Lob()
	private String description;

	private BigDecimal qty;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to Wishlist
    @ManyToOne
	@JoinColumn(name="wishlist_id")
	private Wishlist wishlist;

	//bi-directional many-to-one association to WishlistItemOption
	@OneToMany(mappedBy="wishlistItem")
	private Set<WishlistItemOption> wishlistItemOptions;

    public WishlistItem() {
    }

	public int getWishlistItemId() {
		return this.wishlistItemId;
	}

	public void setWishlistItemId(int wishlistItemId) {
		this.wishlistItemId = wishlistItemId;
	}

	public Timestamp getAddedAt() {
		return this.addedAt;
	}

	public void setAddedAt(Timestamp addedAt) {
		this.addedAt = addedAt;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public CatalogProductEntity getCatalogProductEntity() {
		return this.catalogProductEntity;
	}

	public void setCatalogProductEntity(CatalogProductEntity catalogProductEntity) {
		this.catalogProductEntity = catalogProductEntity;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Wishlist getWishlist() {
		return this.wishlist;
	}

	public void setWishlist(Wishlist wishlist) {
		this.wishlist = wishlist;
	}
	
	public Set<WishlistItemOption> getWishlistItemOptions() {
		return this.wishlistItemOptions;
	}

	public void setWishlistItemOptions(Set<WishlistItemOption> wishlistItemOptions) {
		this.wishlistItemOptions = wishlistItemOptions;
	}
	
}