package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tax_calculation database table.
 * 
 */
@Entity
@Table(name="tax_calculation")
public class TaxCalculation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tax_calculation_id")
	private int taxCalculationId;

	//bi-directional many-to-one association to TaxClass
    @ManyToOne
	@JoinColumn(name="customer_tax_class_id")
	private TaxClass taxClass1;

	//bi-directional many-to-one association to TaxClass
    @ManyToOne
	@JoinColumn(name="product_tax_class_id")
	private TaxClass taxClass2;

	//bi-directional many-to-one association to TaxCalculationRate
    @ManyToOne
	@JoinColumn(name="tax_calculation_rate_id")
	private TaxCalculationRate taxCalculationRate;

	//bi-directional many-to-one association to TaxCalculationRule
    @ManyToOne
	@JoinColumn(name="tax_calculation_rule_id")
	private TaxCalculationRule taxCalculationRule;

    public TaxCalculation() {
    }

	public int getTaxCalculationId() {
		return this.taxCalculationId;
	}

	public void setTaxCalculationId(int taxCalculationId) {
		this.taxCalculationId = taxCalculationId;
	}

	public TaxClass getTaxClass1() {
		return this.taxClass1;
	}

	public void setTaxClass1(TaxClass taxClass1) {
		this.taxClass1 = taxClass1;
	}
	
	public TaxClass getTaxClass2() {
		return this.taxClass2;
	}

	public void setTaxClass2(TaxClass taxClass2) {
		this.taxClass2 = taxClass2;
	}
	
	public TaxCalculationRate getTaxCalculationRate() {
		return this.taxCalculationRate;
	}

	public void setTaxCalculationRate(TaxCalculationRate taxCalculationRate) {
		this.taxCalculationRate = taxCalculationRate;
	}
	
	public TaxCalculationRule getTaxCalculationRule() {
		return this.taxCalculationRule;
	}

	public void setTaxCalculationRule(TaxCalculationRule taxCalculationRule) {
		this.taxCalculationRule = taxCalculationRule;
	}
	
}