package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the directory_country_region database table.
 * 
 */
@Entity
@Table(name="directory_country_region")
public class DirectoryCountryRegion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="region_id")
	private int regionId;

	private String code;

	@Column(name="country_id")
	private String countryId;

	@Column(name="default_name")
	private String defaultName;

//	//bi-directional many-to-one association to DirectoryCountryRegionName
//	@OneToMany(mappedBy="directoryCountryRegion")
//	private Set<DirectoryCountryRegionName> directoryCountryRegionNames;

    public DirectoryCountryRegion() {
    }

	public int getRegionId() {
		return this.regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getDefaultName() {
		return this.defaultName;
	}

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

//	public Set<DirectoryCountryRegionName> getDirectoryCountryRegionNames() {
//		return this.directoryCountryRegionNames;
//	}
//
//	public void setDirectoryCountryRegionNames(Set<DirectoryCountryRegionName> directoryCountryRegionNames) {
//		this.directoryCountryRegionNames = directoryCountryRegionNames;
//	}
	
}