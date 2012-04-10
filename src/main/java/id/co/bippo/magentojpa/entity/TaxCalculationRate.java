package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the tax_calculation_rate database table.
 * 
 */
@Entity
@Table(name="tax_calculation_rate")
public class TaxCalculationRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tax_calculation_rate_id")
	private int taxCalculationRateId;

	private String code;

	private BigDecimal rate;

	@Column(name="tax_country_id")
	private String taxCountryId;

	@Column(name="tax_postcode")
	private String taxPostcode;

	@Column(name="tax_region_id")
	private int taxRegionId;

	@Column(name="zip_from")
	private int zipFrom;

	@Column(name="zip_is_range")
	private short zipIsRange;

	@Column(name="zip_to")
	private int zipTo;

	//bi-directional many-to-one association to TaxCalculation
	@OneToMany(mappedBy="taxCalculationRate")
	private Set<TaxCalculation> taxCalculations;

	//bi-directional many-to-one association to TaxCalculationRateTitle
	@OneToMany(mappedBy="taxCalculationRate")
	private Set<TaxCalculationRateTitle> taxCalculationRateTitles;

    public TaxCalculationRate() {
    }

	public int getTaxCalculationRateId() {
		return this.taxCalculationRateId;
	}

	public void setTaxCalculationRateId(int taxCalculationRateId) {
		this.taxCalculationRateId = taxCalculationRateId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getTaxCountryId() {
		return this.taxCountryId;
	}

	public void setTaxCountryId(String taxCountryId) {
		this.taxCountryId = taxCountryId;
	}

	public String getTaxPostcode() {
		return this.taxPostcode;
	}

	public void setTaxPostcode(String taxPostcode) {
		this.taxPostcode = taxPostcode;
	}

	public int getTaxRegionId() {
		return this.taxRegionId;
	}

	public void setTaxRegionId(int taxRegionId) {
		this.taxRegionId = taxRegionId;
	}

	public int getZipFrom() {
		return this.zipFrom;
	}

	public void setZipFrom(int zipFrom) {
		this.zipFrom = zipFrom;
	}

	public short getZipIsRange() {
		return this.zipIsRange;
	}

	public void setZipIsRange(short zipIsRange) {
		this.zipIsRange = zipIsRange;
	}

	public int getZipTo() {
		return this.zipTo;
	}

	public void setZipTo(int zipTo) {
		this.zipTo = zipTo;
	}

	public Set<TaxCalculation> getTaxCalculations() {
		return this.taxCalculations;
	}

	public void setTaxCalculations(Set<TaxCalculation> taxCalculations) {
		this.taxCalculations = taxCalculations;
	}
	
	public Set<TaxCalculationRateTitle> getTaxCalculationRateTitles() {
		return this.taxCalculationRateTitles;
	}

	public void setTaxCalculationRateTitles(Set<TaxCalculationRateTitle> taxCalculationRateTitles) {
		this.taxCalculationRateTitles = taxCalculationRateTitles;
	}
	
}