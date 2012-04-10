package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wishlist_item_option database table.
 * 
 */
@Entity
@Table(name="wishlist_item_option")
public class WishlistItemOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_id")
	private int optionId;

	private String code;

	@Column(name="product_id")
	private int productId;

    @Lob()
	private String value;

	//bi-directional many-to-one association to WishlistItem
    @ManyToOne
	@JoinColumn(name="wishlist_item_id")
	private WishlistItem wishlistItem;

    public WishlistItemOption() {
    }

	public int getOptionId() {
		return this.optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public WishlistItem getWishlistItem() {
		return this.wishlistItem;
	}

	public void setWishlistItem(WishlistItem wishlistItem) {
		this.wishlistItem = wishlistItem;
	}
	
}