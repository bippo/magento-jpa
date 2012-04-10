package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the core_cache_tag database table.
 * 
 */
@Entity
@Table(name="core_cache_tag")
public class CoreCacheTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoreCacheTagPK id;

    public CoreCacheTag() {
    }

	public CoreCacheTagPK getId() {
		return this.id;
	}

	public void setId(CoreCacheTagPK id) {
		this.id = id;
	}
	
}