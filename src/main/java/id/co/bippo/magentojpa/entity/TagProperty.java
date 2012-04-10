package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tag_properties database table.
 * 
 */
@Entity
@Table(name="tag_properties")
public class TagProperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TagPropertyPK id;

	@Column(name="base_popularity")
	private int basePopularity;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

	//bi-directional many-to-one association to Tag
    @ManyToOne
	@JoinColumn(name="tag_id")
	private Tag tag;

    public TagProperty() {
    }

	public TagPropertyPK getId() {
		return this.id;
	}

	public void setId(TagPropertyPK id) {
		this.id = id;
	}
	
	public int getBasePopularity() {
		return this.basePopularity;
	}

	public void setBasePopularity(int basePopularity) {
		this.basePopularity = basePopularity;
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