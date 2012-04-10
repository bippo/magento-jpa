package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the tax_calculation_rule database table.
 * 
 */
@Entity
@Table(name="tax_calculation_rule")
public class TaxCalculationRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tax_calculation_rule_id")
	private int taxCalculationRuleId;

	private String code;

	private int position;

	private int priority;

	//bi-directional many-to-one association to TaxCalculation
	@OneToMany(mappedBy="taxCalculationRule")
	private Set<TaxCalculation> taxCalculations;

    public TaxCalculationRule() {
    }

	public int getTaxCalculationRuleId() {
		return this.taxCalculationRuleId;
	}

	public void setTaxCalculationRuleId(int taxCalculationRuleId) {
		this.taxCalculationRuleId = taxCalculationRuleId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Set<TaxCalculation> getTaxCalculations() {
		return this.taxCalculations;
	}

	public void setTaxCalculations(Set<TaxCalculation> taxCalculations) {
		this.taxCalculations = taxCalculations;
	}
	
}