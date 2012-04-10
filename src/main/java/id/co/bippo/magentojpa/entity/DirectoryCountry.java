package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the directory_country database table.
 * 
 */
@Entity
@Table(name="directory_country")
public class DirectoryCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_id")
	private String countryId;

	@Column(name="iso2_code")
	private String iso2Code;

	@Column(name="iso3_code")
	private String iso3Code;

	//bi-directional many-to-one association to WeeeTax
	@OneToMany(mappedBy="directoryCountry")
	private Set<WeeeTax> weeeTaxs;

    public DirectoryCountry() {
    }

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getIso2Code() {
		return this.iso2Code;
	}

	public void setIso2Code(String iso2Code) {
		this.iso2Code = iso2Code;
	}

	public String getIso3Code() {
		return this.iso3Code;
	}

	public void setIso3Code(String iso3Code) {
		this.iso3Code = iso3Code;
	}

	public Set<WeeeTax> getWeeeTaxs() {
		return this.weeeTaxs;
	}

	public void setWeeeTaxs(Set<WeeeTax> weeeTaxs) {
		this.weeeTaxs = weeeTaxs;
	}
	
}