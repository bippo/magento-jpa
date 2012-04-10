package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the core_cache_tag database table.
 * 
 */
@Embeddable
public class CoreCacheTagPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String tag;

	@Column(name="cache_id")
	private String cacheId;

    public CoreCacheTagPK() {
    }
	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getCacheId() {
		return this.cacheId;
	}
	public void setCacheId(String cacheId) {
		this.cacheId = cacheId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CoreCacheTagPK)) {
			return false;
		}
		CoreCacheTagPK castOther = (CoreCacheTagPK)other;
		return 
			this.tag.equals(castOther.tag)
			&& this.cacheId.equals(castOther.cacheId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tag.hashCode();
		hash = hash * prime + this.cacheId.hashCode();
		
		return hash;
    }
}