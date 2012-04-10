package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the directory_country_region_name database table.
 * 
 */
@Entity
@Table(name="directory_country_region_name")
public class DirectoryCountryRegionName implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DirectoryCountryRegionNamePK id;

	private String name;

	//bi-directional many-to-one association to DirectoryCountryRegion
    @ManyToOne
	@JoinColumn(name="region_id")
	private DirectoryCountryRegion directoryCountryRegion;

    public DirectoryCountryRegionName() {
    }

	public DirectoryCountryRegionNamePK getId() {
		return this.id;
	}

	public void setId(DirectoryCountryRegionNamePK id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DirectoryCountryRegion getDirectoryCountryRegion() {
		return this.directoryCountryRegion;
	}

	public void setDirectoryCountryRegion(DirectoryCountryRegion directoryCountryRegion) {
		this.directoryCountryRegion = directoryCountryRegion;
	}
	
}