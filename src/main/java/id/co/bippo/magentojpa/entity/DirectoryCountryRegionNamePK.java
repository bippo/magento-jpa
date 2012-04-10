package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the directory_country_region_name database table.
 * 
 */
@Embeddable
public class DirectoryCountryRegionNamePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String locale;

	@Column(name="region_id")
	private int regionId;

    public DirectoryCountryRegionNamePK() {
    }
	public String getLocale() {
		return this.locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public int getRegionId() {
		return this.regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DirectoryCountryRegionNamePK)) {
			return false;
		}
		DirectoryCountryRegionNamePK castOther = (DirectoryCountryRegionNamePK)other;
		return 
			this.locale.equals(castOther.locale)
			&& (this.regionId == castOther.regionId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.locale.hashCode();
		hash = hash * prime + this.regionId;
		
		return hash;
    }
}