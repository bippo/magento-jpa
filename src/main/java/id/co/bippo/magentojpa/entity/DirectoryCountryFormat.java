package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the directory_country_format database table.
 * 
 */
@Entity
@Table(name="directory_country_format")
public class DirectoryCountryFormat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_format_id")
	private int countryFormatId;

	@Column(name="country_id")
	private String countryId;

    @Lob()
	private String format;

	private String type;

    public DirectoryCountryFormat() {
    }

	public int getCountryFormatId() {
		return this.countryFormatId;
	}

	public void setCountryFormatId(int countryFormatId) {
		this.countryFormatId = countryFormatId;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}