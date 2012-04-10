package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tax_calculation_rate_title database table.
 * 
 */
@Entity
@Table(name="tax_calculation_rate_title")
public class TaxCalculationRateTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tax_calculation_rate_title_id")
	private int taxCalculationRateTitleId;

	private String value;

	//bi-directional many-to-one association to TaxCalculationRate
    @ManyToOne
	@JoinColumn(name="tax_calculation_rate_id")
	private TaxCalculationRate taxCalculationRate;

	//bi-directional many-to-one association to CoreStore
    @ManyToOne
	@JoinColumn(name="store_id")
	private CoreStore coreStore;

    public TaxCalculationRateTitle() {
    }

	public int getTaxCalculationRateTitleId() {
		return this.taxCalculationRateTitleId;
	}

	public void setTaxCalculationRateTitleId(int taxCalculationRateTitleId) {
		this.taxCalculationRateTitleId = taxCalculationRateTitleId;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public TaxCalculationRate getTaxCalculationRate() {
		return this.taxCalculationRate;
	}

	public void setTaxCalculationRate(TaxCalculationRate taxCalculationRate) {
		this.taxCalculationRate = taxCalculationRate;
	}
	
	public CoreStore getCoreStore() {
		return this.coreStore;
	}

	public void setCoreStore(CoreStore coreStore) {
		this.coreStore = coreStore;
	}
	
}