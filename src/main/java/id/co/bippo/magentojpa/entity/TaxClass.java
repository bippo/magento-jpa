package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the tax_class database table.
 * 
 */
@Entity
@Table(name="tax_class")
public class TaxClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="class_id")
	private short classId;

	@Column(name="class_name")
	private String className;

	@Column(name="class_type")
	private String classType;

	//bi-directional many-to-one association to TaxCalculation
	@OneToMany(mappedBy="taxClass1")
	private Set<TaxCalculation> taxCalculations1;

	//bi-directional many-to-one association to TaxCalculation
	@OneToMany(mappedBy="taxClass2")
	private Set<TaxCalculation> taxCalculations2;

    public TaxClass() {
    }

	public short getClassId() {
		return this.classId;
	}

	public void setClassId(short classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassType() {
		return this.classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public Set<TaxCalculation> getTaxCalculations1() {
		return this.taxCalculations1;
	}

	public void setTaxCalculations1(Set<TaxCalculation> taxCalculations1) {
		this.taxCalculations1 = taxCalculations1;
	}
	
	public Set<TaxCalculation> getTaxCalculations2() {
		return this.taxCalculations2;
	}

	public void setTaxCalculations2(Set<TaxCalculation> taxCalculations2) {
		this.taxCalculations2 = taxCalculations2;
	}
	
}