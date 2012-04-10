package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the googlebase_items database table.
 * 
 */
@Entity
@Table(name="googlebase_items")
public class GooglebaseItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id")
	private int itemId;

	private int clicks;

	private Timestamp expires;

	@Column(name="gbase_item_id")
	private String gbaseItemId;

	private int impr;

	@Column(name="is_hidden")
	private short isHidden;

	private Timestamp published;

	@Column(name="type_id")
	private int typeId;

	private int views;

	//bi-directional many-to-one association to CatalogProductEntity
    @ManyToOne
	@JoinColumn(name="product_id")
	private CatalogProductEntity catalogProductEntity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public GooglebaseItem() {
    }

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getClicks() {
		return this.clicks;
	}

	public void setClicks(int clicks) {
		this.clicks = clicks;
	}

	public Timestamp getExpires() {
		return this.expires;
	}

	public void setExpires(Timestamp expires) {
		this.expires = expires;
	}

	public String getGbaseItemId() {
		return this.gbaseItemId;
	}

	public void setGbaseItemId(String gbaseItemId) {
		this.gbaseItemId = gbaseItemId;
	}

	public int getImpr() {
		return this.impr;
	}

	public void setImpr(int impr) {
		this.impr = impr;
	}

	public short getIsHidden() {
		return this.isHidden;
	}

	public void setIsHidden(short isHidden) {
		this.isHidden = isHidden;
	}

	public Timestamp getPublished() {
		return this.published;
	}

	public void setPublished(Timestamp published) {
		this.published = published;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
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
	
}