package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tag_summary database table.
 * 
 */
@Embeddable
public class TagSummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tag_id")
	private int tagId;

	@Column(name="store_id")
	private int storeId;

    public TagSummaryPK() {
    }
	public int getTagId() {
		return this.tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public int getStoreId() {
		return this.storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TagSummaryPK)) {
			return false;
		}
		TagSummaryPK castOther = (TagSummaryPK)other;
		return 
			(this.tagId == castOther.tagId)
			&& (this.storeId == castOther.storeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tagId;
		hash = hash * prime + this.storeId;
		
		return hash;
    }
}