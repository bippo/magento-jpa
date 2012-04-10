package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tag_summary database table.
 * 
 */
@Entity
@Table(name="tag_summary")
public class TagSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TagSummaryPK id;

	@Column(name="base_popularity")
	private int basePopularity;

	private int customers;

	@Column(name="historical_uses")
	private int historicalUses;

	private int popularity;

	private int products;

	private int uses;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to Tag
    @ManyToOne
	@JoinColumn(name="tag_id")
	private Tag tag;

    public TagSummary() {
    }

	public TagSummaryPK getId() {
		return this.id;
	}

	public void setId(TagSummaryPK id) {
		this.id = id;
	}
	
	public int getBasePopularity() {
		return this.basePopularity;
	}

	public void setBasePopularity(int basePopularity) {
		this.basePopularity = basePopularity;
	}

	public int getCustomers() {
		return this.customers;
	}

	public void setCustomers(int customers) {
		this.customers = customers;
	}

	public int getHistoricalUses() {
		return this.historicalUses;
	}

	public void setHistoricalUses(int historicalUses) {
		this.historicalUses = historicalUses;
	}

	public int getPopularity() {
		return this.popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	public int getProducts() {
		return this.products;
	}

	public void setProducts(int products) {
		this.products = products;
	}

	public int getUses() {
		return this.uses;
	}

	public void setUses(int uses) {
		this.uses = uses;
	}

	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
	public Tag getTag() {
		return this.tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
}